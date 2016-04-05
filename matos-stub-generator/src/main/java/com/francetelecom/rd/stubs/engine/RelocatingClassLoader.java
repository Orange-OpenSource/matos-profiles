package com.francetelecom.rd.stubs.engine;

/*
 * #%L
 * Matos
 * $Id:$
 * $HeadURL:$
 * %%
 * Copyright (C) 2008 - 2014 Orange SA
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.regex.Pattern;




/**
 * This classloader relocates all the classes it loads in a given (one-level) package.
 * This avoid conflict with system classes. 
 * 
 * The trick does not work on two classes : String because they are treated specifically
 * as constants (eg. with the ldc machine instruction).
 * Object which is the only allowed root class. The limitation on Object could be overcomed
 * by giving an ancestor to the relocated Object.
 * @author Pierre Cregut
 *
 */

public class RelocatingClassLoader extends ClassLoader {
	final private  String [] classpath;
	private final static boolean debug = false;

	private Map<String,String> nameToId = new HashMap<String,String> ();
	private Map<String,String> idToJar = new HashMap<String,String> ();

	final private String packagePrefix;

	private Pattern antipatternGeneric;

	private boolean complaining = true;

	final static private Set<String> discarded_names = new HashSet<String>();
	{
		for(String name:PatchConstantPool.RESERVED_CLASS) { discarded_names.add(name.replace('/','.'));}
	}
	/**
	 * Constructor. Takes the classpath where the relocated classes are found and
	 * a prefix for relocation.
	 * @param classpath
	 * @param packagePrefix
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public RelocatingClassLoader(String [] classpath, String packagePrefix) throws IOException, ClassNotFoundException {
		this.packagePrefix = packagePrefix;
		this.classpath = classpath;
		antipatternGeneric = Pattern.compile(packagePrefix + "[./]");
	}

	
	/**
	 * Toggle the flag that make the loader not complain when it does not find the class.
	 */
	public void setSilent() { complaining = false; }
	/**
	 * This function should be applied on any regular string extracted from the byte
	 * code as it has been altered by the transformation.
	 * @param s
	 * @return
	 */
	public String restoreString(String s) {
		return antipatternGeneric.matcher(s).replaceAll("");
	}

	/**
	 * Name translation from internal syntax of files to regular class names.
	 * @param id
	 * @return
	 */
	private String idToName(String id) {
		id = id.substring(0, id.lastIndexOf('.'));
		return id.replace('/', '.');
	}

	/**
	 * Builds a table of what is known about current methods and jars.
	 * @return a set of classes names declared here.
	 * @throws IOException
	 */
	public Set <String> initLookup() throws IOException { 
		for(String jarName : classpath) {
			if (! new File(jarName).exists()) {
				throw new IOException("Cannot find file " + jarName);
			}
			JarFile jarFile = new JarFile(jarName);
			Enumeration <JarEntry> e = jarFile.entries();
			while(e.hasMoreElements()) {
				JarEntry jarEntry = e.nextElement();
				String id = jarEntry.getName();
				if (id.endsWith(".class")) {
					String name = idToName(id);
					if (discarded_names.contains(name)) continue;
					name = packagePrefix + "." + name;
					nameToId.put(name, id);
					idToJar.put(id, jarName);
				}
			}
			jarFile.close();
		}
		return nameToId.keySet();
	}

	@Override
	protected Class <?> findClass(String queried) throws ClassNotFoundException {
		JarFile jarFile = null;
		try {
			String filename = restoreString(queried);
			if (filename.equals("java.lang.Enum")) return Class.forName("java.lang.Enum");
			
			filename = filename.replace('.', '/') + ".class";
		
			String jarName = idToJar.get(filename);
			if (jarName == null) {
				if (complaining ) {
					System.err.println("CANNOT FIND " + queried + " " + filename);
				}
				throw new IOException("Cannot find file for " + queried + "(" + filename + ")");
			}
			jarFile = new JarFile(jarName);
			JarEntry entry = jarFile.getJarEntry(filename);
			byte [] rawCode = new byte[(int) entry.getSize()];
			InputStream is = jarFile.getInputStream(entry);
			int pos = 0;
			int read;
			while((read = is.read(rawCode,pos,rawCode.length - pos)) != 0) {
				pos += read;
				if (pos == rawCode.length) break;
			}
			jarFile.close();
			PatchConstantPool pcp = new PatchConstantPool(queried, rawCode, packagePrefix);
			byte [] patchedCode = pcp.transform();
			if (debug) {
				File file = new File(filename);
				File folder = file.getParentFile();
				folder.mkdirs();
				FileOutputStream out = new FileOutputStream(file);
				out.write(patchedCode, 0, patchedCode.length);
				out.close();
			}
			Class <?> result = this.defineClass(queried, patchedCode, 0, patchedCode.length);
			return result;
		} catch (IOException e) {
			if (jarFile != null) try { jarFile.close(); } catch (IOException ee) {};
			throw new ClassNotFoundException("IOProblem: " + e.getMessage());
		}
	}

	/**
	 * Test entry point
	 * @param args
	 * @throws Exception
	 */
	public static void main (String [] args) throws Exception {
		String prefix = "oLaB";
		String [] jars = new String [] {
			"Android/core.jar",
			"Android/framework.jar",
			"Android/services.jar",
			"Android/ext.jar"
		};
		RelocatingClassLoader cl = new RelocatingClassLoader(jars, prefix);
		ReflexUtil rf = new ReflexUtil(prefix, null, "");
		ClassDumper dumper = new ClassDumper("out", rf, null);
		Set <String> everyone = cl.initLookup();
		int count = 0;
		for(String name : everyone) {
			try {		
				dumper.dumpClass(cl.loadClass(name, true));
			} catch (Throwable e) {
				System.err.println("============== CANNOT HANDLE " + name + " =============");
				e.printStackTrace();
				count ++;
			}
		}
		System.err.println("Errors = " + count + "/" + dumper.count);
	}
}
