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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/**
 * Code patcher that relocate the code in a sub package. Works for all classes but
 * String and Object. It is important to choose prefix so that there is no risk of
 * conflict.
 * @author Pierre Cregut
 *
 */
public class PatchConstantPool {
	
	final static int CONSTANT_Class = 7;
	final static int CONSTANT_Fieldref = 9;
	final static int CONSTANT_Methodref = 10;
	final static int CONSTANT_InterfaceMethodref = 11;
	final static int CONSTANT_String = 8;
	final static int CONSTANT_Integer = 3;
	final static int CONSTANT_Float = 4;
	final static int CONSTANT_Long = 5;
	final static int CONSTANT_Double = 6;
	final static int CONSTANT_NameAndType = 12;
	final static int CONSTANT_Utf8 = 1;
	
	final static String [] RESERVED_CLASS = {
		"java/lang/Object", "java/lang/Class", "java/lang/Enum", "java/lang/String", "java/lang/Throwable",
		"java/io/Serializable",
		"java/lang/annotation/Annotation","java/lang/annotation/RetentionPolicy", "java/lang/annotation/Retention",
		"java/lang/annotation/Target","java/lang/annotation/ElementType"
	};

	final static Set<String> RESERVED_IDS_SET = new HashSet<String>();
	
	{
		for(String name:RESERVED_CLASS) RESERVED_IDS_SET.add(name);
	}
	
	final private DataInputStream is;
	final private DataOutputStream os;
	final private ByteArrayOutputStream osb;
	final private byte [] inputArray;
	final String packagePrefix;
	final private byte [] aux = new byte [1024];
	final private Pattern pattern = Pattern.compile("L([^;<]*)(;|<)");
	final private Pattern antipatternReserved;
	final private Pattern antipatternHack;
	
	private Set <Integer> classNames = new HashSet <Integer>();
	private PatchNativeMethod pnm;
	
	
	/**
	 * Constructor. Takes the code of the original method as argument
	 * @param inputArray The code as a byte array.
	 * @throws IOException Should not be raised (bytestreams).
	 */
	public PatchConstantPool(String name, byte [] inputArray, String packagePrefix) throws IOException {
		this.inputArray = inputArray;
		this.packagePrefix = packagePrefix;
		is = new DataInputStream (new ByteArrayInputStream (inputArray));
		osb = new ByteArrayOutputStream ();
		os = new DataOutputStream(osb);
		StringBuilder b = new StringBuilder();
		b.append("L").append(packagePrefix).append("/(");
		boolean first = true;
		for(String id: RESERVED_CLASS) {
			if (first) first = false;
			else b.append("|");
			b.append(id);
		}
		b.append(")([;<])");
		antipatternReserved =  Pattern.compile(b.toString());
		b = new StringBuilder();
		b.append("([.][a-zA-Z0-9]+)");
		b.append(packagePrefix);
		b.append("/");
		antipatternHack =  Pattern.compile(b.toString());
		// antipatternGeneric = Pattern.compile("L" + packagePrefix + "/");
		pnm = new PatchNativeMethod();
	}
	

	private void transfer(int size) throws IOException {
		is.readFully(aux,0,size);
		os.write(aux,0,size);
	}
	
	/**
	 * This pass is necessary to locate the UTF8 strings used as pure class names
	 * and the ones that are type specifications.
	 * @return
	 * @throws IOException
	 */
	private void prepare() throws IOException {
		DataInputStream is = new DataInputStream (new ByteArrayInputStream (inputArray));
		PatchNativeMethod.forceSkip(is,8);
		
		short cppool_size = is.readShort();
		pnm.setConstantPoolSize(cppool_size);
		for(int i=1; i < cppool_size; i++) {
			byte tag = is.readByte();
			switch (tag) {
			case CONSTANT_Class:
				int classDef = is.readShort(); 
				classNames.add(classDef);
				break;
			case CONSTANT_String:
				PatchNativeMethod.forceSkip(is,2);
				break;
			case CONSTANT_Fieldref:
			case CONSTANT_Methodref:
			case CONSTANT_InterfaceMethodref:
			case CONSTANT_Integer:
			case CONSTANT_Float:
			case CONSTANT_NameAndType:
				PatchNativeMethod.forceSkip(is,4);
				break;
			case CONSTANT_Long:
			case CONSTANT_Double:
				PatchNativeMethod.forceSkip(is,8);
				i++; // Warning pool index increases by 2 for long values. 
				break;
			case CONSTANT_Utf8:
				String utfString = is.readUTF();
				pnm.check(i, utfString);
				if (utfString.contains(packagePrefix))
					throw new RuntimeException("Conflict between the strings in the transformed jar and the chosen prefix");
				break;
			}
		}
		pnm.prepare(is);
		is.close();
	}
	
	
	/**
	 * Performs the actual transformation on the bytecode
	 * @return the new byte code array.
	 * @throws IOException
	 */
	public byte [] transform() throws IOException {
		prepare();
		transfer(8);
		short cppool_size = is.readShort();
		os.writeShort(cppool_size);
		for(int i=1; i < cppool_size; i++) {
			byte tag = is.readByte();
			os.writeByte(tag);
			switch (tag) {
			case CONSTANT_Class:
			case CONSTANT_String:
				transfer(2);
				break;
			case CONSTANT_Fieldref:
			case CONSTANT_Methodref:
			case CONSTANT_InterfaceMethodref:
			case CONSTANT_Integer:
			case CONSTANT_Float:
			case CONSTANT_NameAndType:
				transfer(4);
				break;
			case CONSTANT_Long:
			case CONSTANT_Double:
				transfer(8);
				i++;
				break;
			case CONSTANT_Utf8:
				transformUTF8(i);
				break;
			default:
				throw new RuntimeException("Unknown tag" + tag);
			}
		}
		if (!pnm.needModification()) {
			int size;
			while ((size = is.read(aux)) >= 0) { os.write(aux,0,size); }
		} else {
			pnm.addConstants(os);
			pnm.dumpCode(is, os);
		}
		is.close();
		os.flush();
		byte [] result = osb.toByteArray();
		pnm.updatePoolSize(result);
		return result;
	}

	private void transformUTF8(int i) throws IOException {
		String value = is.readUTF();
		String newvalue;
		if (classNames.contains(i) && value.charAt(0) != '[') {
			newvalue = (RESERVED_IDS_SET.contains(value)) ? value : packagePrefix + "/" + value;
		} else {
		    newvalue =  pattern.matcher(value).replaceAll("L" + packagePrefix + "/$1$2");
		    // Do not do it on strings ! ldc complains.
		    newvalue = antipatternReserved.matcher(newvalue).replaceAll("L$1$2");
		    newvalue = antipatternHack.matcher(newvalue).replaceAll("$1");
		} 
		os.writeUTF(newvalue);		
	}
}
