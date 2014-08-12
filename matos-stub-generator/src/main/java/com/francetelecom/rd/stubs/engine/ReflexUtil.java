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

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 * A lot of utility functions to relocate names, find objects, etc.
 * @author Pierre Cregut
 *
 */
public class ReflexUtil {
	private static final String VALUE_FIELD = "value";
	private static final String JAVA_LANG = "java.lang";
	private static final int JAVA_LANG_LENGTH = JAVA_LANG.length() + 1;
	final private String prefix;
	final private Pattern antipattern;
	final private String annotationPackage;
	
	/**
	 * Constructor
	 * @param prefix the prefix added in front of the packageName
	 * @param altPrefix another prefix when there are several classLoaders
	 * @param annotationPackage the name of the package where the annotations are.
	 */
	public ReflexUtil(String prefix, String altPrefix, String annotationPackage) {
		this.prefix = prefix;
		antipattern =
			altPrefix == null ? Pattern.compile( prefix + "[./]") :
				Pattern.compile("(" + altPrefix + "|" + prefix + ")[./]");
		this.annotationPackage = prefix + "." + annotationPackage;
	}
	
	/**
	 * Remove the effect of the constant pool patcher.
	 * @param s
	 * @return
	 */
	
	public String restoreString(String s) {
		return antipattern.matcher(s).replaceAll("");
	}	

	/**
	 * Is it a loaded class (handled) or a base class of the system ?
	 * @param clazz the refexive version of the class.
	 * @return true if a class to dump.
	 */
	public boolean handledClass(Class<?> clazz) {
		return clazz != null && clazz.getName() != null && clazz.getName().startsWith(prefix);
	}

	/**
	 * A way to get rid of some annotations.
	 * @param annot The annotation considered
	 * @return true if this annotation is invisible
	 */
	public boolean isStubAnnotation(Annotation annot) {
		return annotationPackage.equals(getPackageName(annot.annotationType())); 
	}

	/**
	 * Gives back the string of the package name where the class is defined.
	 * Note: this has nothing to do with the notion of classloader Packages.
	 * @param clazz
	 * @return
	 */
	public static String getPackageName(final Class<?> clazz) {
		String classname = clazz.getName();
		if (classname == null) return null; // Should not happen. It is not a canonical name
		int index = classname.lastIndexOf(".");
		return (index == -1) ? "" : classname.substring(0, index);
	}

	/**
	 * Find an annotation by its name. It must be in the package of handled
	 * annotation. (Do not forget that we use class relocation)
	 * @param name the name of the annotation
	 * @param annotArray the array of annotations.
	 * @return the annotation if found or null.
	 */
	public Annotation findAnnotation(String name, Annotation [] annotArray) {
		for(Annotation annot : annotArray) {
			if(isStubAnnotation(annot)) {
				Class<?> annotClass = annot.getClass().getInterfaces()[0];
				String shortName = annotClass.getSimpleName();
				if (shortName.equals(name)) return annot;
			}
		}
		return null;
	}

	/**
	 * Find annotations by their name. It must be in the package of handled
	 * annotation. (Do not forget that we use class relocation). This version is useful
	 * when there are several annotations.
	 * @param name the name of the annotation
	 * @param annotArray the array of annotations.
	 * @return return the list of annotations with the given name.
	 */
	public List <Annotation> findAnnotations(String name, String names, Annotation [] annotArray) {
		ArrayList <Annotation> result = new ArrayList<Annotation>();
		for(Annotation annot : annotArray) {
			if(isStubAnnotation(annot)) {
				Class<?> annotClass = annot.getClass().getInterfaces()[0];
				String shortName = annotClass.getSimpleName();
				if (shortName.equals(name)) result.add(annot);
				if (shortName.equals(names)) {
					Annotation [] contents = (Annotation [])  getAnnotationField(annot, VALUE_FIELD);
					for (Annotation a : contents) {
						result.add(a);
					}
				}
			}
		}
		return result;
	}

	/**
	 * Access to the value of a field in an annotation using reflection.
	 * @param annotation the annotation object
	 * @param field the name of the field. In fact implemented as a method.
	 * @return object. The result must then be coerced.
	 */
	
	public static Object getAnnotationField(Annotation annotation, String field) {
		Class<?> annotClass = annotation.getClass();
		try {
			Method getValue = annotClass.getMethod(field);
			return getValue.invoke(annotation);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * Access the value field of annotation when it is an array of string.
	 * @param annot
	 * @return
	 */
	public static String [] getStringValues(Annotation annot) {
		Object contents =  getAnnotationField(annot, VALUE_FIELD);
		if (contents instanceof String[]) return (String []) contents;
		if (contents instanceof String) return new String [] { (String) contents };
		else return new String[0];
	}

	/**
	 * Access the value field of annotation when it is a string.
	 * @param annot
	 * @return
	 */
	public static String getStringValue(Annotation annot) {
		Object contents =  getAnnotationField(annot, VALUE_FIELD);
		if (contents instanceof String) return (String) contents;
		else return null;		
	}
	
	/**
	 * Output a string that is roughly similar to what is printed in a source and
	 * not internal format.
	 * @param elt
	 * @return
	 */
	public static String readableName(Class<?> elt) {
		if (elt.isArray()) return readableName(elt.getComponentType()) + "[]";
		else return elt.getName().replace("$", ".");
	}

	/**
	 * Same as a readable name but internal class keep the dollar sign in their name
	 * @param elt
	 * @return
	 */
	public static String readableSootName(Class<?> elt) {
		if (elt.isArray()) return readableSootName(elt.getComponentType()) + "[]";
		else return elt.getName();
	}
	/**
	 * Combines making the output readable, getting rid of prefix and shortening
	 * types in current package or java.lang
	 * @param arg
	 * @return
	 */
	public String prettyName(Class<?> arg, Class<?> here) {
		String pkg = getPackageName(here);
		String readable = readableName(arg);
		if (pkg != null && readable.startsWith(pkg)) readable = readable.substring(pkg.length() + 1);
		else if (readable.startsWith(JAVA_LANG)) readable = readable.substring(JAVA_LANG_LENGTH);
		return restoreString(readable);
	}

	/**
	 * Gives back the annotation package
	 * @return
	 */
	public String annotationPackage() {
		return restoreString(annotationPackage);
	}
}
