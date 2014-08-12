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

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;


/**
 * This represents a jar containing an alternative annotation of the currently dumped
 * jar. It is mainly used when the representation of the stubs is changed or when the
 * version of the profile dumped is changed. 
 * 
 * @author Pierre Cregut
 *
 */
public class AlternativeImplementation {
	private String altPrefix;
	private RelocatingClassLoader loader;
	Pattern prefixPattern;
	private Class<?> origin;
	private Class<?> current;
	private Map<String,Method> methods = new HashMap<String,Method>();
	private Map<String,Constructor<?>> constructors = new HashMap<String,Constructor<?>>();
	private Map<String,Field> fields = new HashMap<String,Field>();
	/**
	 * Pattern to get rid of the prefixes.
	 */
	final public Pattern antipattern;

	/**
	 * Constructor
	 * @param loader
	 * @param altPrefix
	 * @param origPrefix
	 */
	public AlternativeImplementation(RelocatingClassLoader loader, String altPrefix, String origPrefix) {
		this.loader = loader;
		this.altPrefix = altPrefix;
		prefixPattern = Pattern.compile(origPrefix);
		this.antipattern = Pattern.compile("(" + altPrefix + "|" + origPrefix + ")[./]");
	}
	
	private String rename(String s) {
		return prefixPattern.matcher(s).replaceAll(altPrefix);
	}
	
	/**
	 * Finds the equivalent class in the alternative hierarchy of a class belonging to
	 * the new hierarchy.
	 * @param c
	 * @return
	 */
	public Class<?> findEquivalent(Class<?> c) {
		methods.clear();
		constructors.clear();
		fields.clear();
		try {
			origin = c;
			current = loader.loadClass(rename (c.getName()));
			for(Method m: current.getDeclaredMethods()) {
				methods.put(m.toString(), m);
			}
			for(Constructor<?> co: current.getDeclaredConstructors()) {
				constructors.put(co.toString(), co);
			}
			for(Field fi: current.getDeclaredFields()) {
				fields.put(fi.toString(), fi);
			}
			return current;
		} catch (Exception e) {
			if (e.getMessage().contains("Conflict")) System.err.println("BOGUS2 " + c.getName());
			return null;
		}
	}

	/**
	 * Same as findEquivalent but, if not found it returns self.
	 * @param c
	 * @return
	 */
	public Class<?> findEquivalentOrSelf(Class <?> c) {
		Class <?> alt = findEquivalent(c);
		return (alt == null) ? c : alt;
	}
	/**
	 * Check if class is present in the alternative hierarchy
	 * @param c
	 * @return
	 */

	public boolean isPresent(Class<?> c) {
		methods.clear();
		constructors.clear();
		fields.clear();
		try {
			origin = c;
			current = loader.loadClass(rename (c.getName()));
			for(Method m: current.getDeclaredMethods()) {
				methods.put(m.toString(), m);
			}
			for(Constructor<?> co: current.getDeclaredConstructors()) {
				constructors.put(co.toString(), co);
			}
			for(Field fi: current.getDeclaredFields()) {
				fields.put(fi.toString(), fi);
			}
			return true;
		} catch (Exception e) {
			if (e.getMessage().contains("Conflict")) System.err.println("BOGUS" + c.getName());
			else System.err.println("GEEE " + c.getName());
			return false;
		}
	}
	
	/**
	 * Finds the equivalent method in the alternative hierarchy of a class belonging to
	 * the new hierarchy.
	 * @param m
	 * @return
	 */
	public Method findEquivalent(Method m) {
		if (!m.getDeclaringClass().equals(origin)) {
			if (!isPresent(m.getDeclaringClass())) System.err.println("Class not exist");
		}
		return methods.get(rename(m.toString()));
	}
	
	/**
	 * Check if method is present in the alternative hierarchy
	 * @param c
	 * @return
	 */
	public boolean isPresent(Method m) {
		if (!m.getDeclaringClass().equals(origin)) isPresent(m.getDeclaringClass());
		Method alt = methods.get(rename(m.toString()));
		return (alt != null);
	}
	/**
	 * Finds the equivalent field in the alternative hierarchy of a class belonging to
	 * the new hierarchy.
	 * @param f
	 * @return
	 */
	public Field findEquivalent(Field f) {
		if (!f.getDeclaringClass().equals(origin)) isPresent(f.getDeclaringClass());
		return fields.get(rename(f.toString()));
	}
	
	/**
	 * Check if field is present in the alternative hierarchy
	 * @param c
	 * @return
	 */
	public boolean isPresent(Field f) {
		if (!f.getDeclaringClass().equals(origin)) isPresent(f.getDeclaringClass());
		Field alt = fields.get(rename(f.toString()));
		return (alt != null);
	}
	/**
	 * Finds the equivalent constructor in the alternative hierarchy of a class belonging to
	 * the new hierarchy.
	 * @param c
	 * @return
	 */
	public Constructor<?> findEquivalent(Constructor<?> c) {
		if (!c.getDeclaringClass().equals(origin)) isPresent(c.getDeclaringClass());
		return  constructors.get(rename(c.toString()));
	}
	
	/**
	 * Check if constructor is present in the alternative hierarchy
	 * @param c
	 * @return
	 */
	public boolean isPresent(Constructor<?> c) {
		if (!c.getDeclaringClass().equals(origin)) isPresent(c.getDeclaringClass());
		Constructor <?> alt =  constructors.get(rename(c.toString()));
		return (alt != null);
	}
}
