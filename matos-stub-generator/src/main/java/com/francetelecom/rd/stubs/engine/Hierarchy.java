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

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This class maintains table describing the class hierarchy of the handled classes.
 * It maintains the backward links giving for example the subclass of a class or the
 * implementors of an interface and provides utility functions to navigate the 
 * hierarchy.
 * @author Pierre Cregut
 *
 */
public class Hierarchy {
	private Map <Class<?>, List <Class<?>>> implementors = new HashMap <Class<?>, List <Class<?>>> ();
	private Map <Class<?>, List <Class<?>>> subclasses = new HashMap <Class<?>, List <Class<?>>> ();
	private List <Class <?>> contents = new ArrayList<Class<?>>();
	
	private Map<Class<?>, Integer> subclassesCount = new HashMap<Class<?>, Integer>();
	
	/**
	 * Add to a one to n map. The n is represented by a list of values.
	 * @param <A> type of the key
	 * @param <B> type of the elements
	 * @param map the map
	 * @param key the key to add
	 * @param value one of the values associated to the key to add.
	 */
	public static <A,B> void  add(Map <A,List <B>> map,A key, B value) {
		List <B> list = map.get(key);
		if (list == null) {
			list = new ArrayList<B>();
			map.put(key, list);
		}
		list.add(value);
	}
	
	int countAnnot = 0;
	int countClass=0;
	int countItf=0;
	int countEnum=0;
	int countPublic = 0;
	int countProtected = 0;
	int countPackage = 0;
	int countPrivate = 0;
	int countAbstract = 0;
	
	/**
	 * Register a new class in the hierarchy tables
	 * @param clazz
	 */
	public void register(Class <?> clazz) {
		statistic(clazz);
		contents.add(clazz);
		if (! isVisible(clazz)) return;
		Class <?> superClass = clazz;
		do { superClass = superClass.getSuperclass(); } while(superClass != null && !isVisible(superClass));
		if (superClass != null) { add(subclasses,superClass, clazz); }
		for(Class <?> itf : clazz.getInterfaces()) { add(implementors,itf,clazz); }
		
	}
	
	private boolean isVisible(Class<?> clazz) {
		int mod = clazz.getModifiers();
		return Modifier.isPublic(mod) || Modifier.isProtected(mod);
	}

	/**
	 * Register the declared flags of a class for statistics on the modifiers.
	 * @param clazz
	 */
	private void statistic(Class <?> clazz) {
		if (clazz.isAnnotation()) countAnnot++;
		else if (clazz.isInterface()) countItf++;
		else if (clazz.isEnum()) countEnum++;
		else countClass++;
		int mod = clazz.getModifiers();
		if (Modifier.isPublic(mod)) countPublic++;
		else if (Modifier.isPrivate(mod)) countPrivate++;
		else if (Modifier.isProtected(mod)) countProtected++;
		else countPackage ++;
		if (Modifier.isAbstract(mod)) countAbstract++;		
	}

	/**
	 * Return classes that are direct sub-classes of the argument.
	 * @param clazz
	 * @return
	 */
	public List<Class<?>> getSubclasses(Class<?> clazz) {
		return subclasses.get(clazz);
	}

	/**
	 * All the classes registered in the hierarchy
	 * @return
	 */
	public List <Class<?>> getContents() {	return contents; }
	
	
	/**
	 * Classes implementing an interface and interface extending a class.
	 * @param clazz
	 * @return
	 */
	public List<Class<?>> getImplementors(Class<?> clazz) {
		return implementors.get(clazz);
	}
	
	/**
	 * Classes implementing an interface and interface extending a class.
	 * @param clazz
	 * @return
	 */
	public List<Class<?>> getRecursiveSubclasses(Class<?> clazz) {
		List <Class <?>> result = new ArrayList <Class<?>>();
		List <Class <?>> todo = new ArrayList <Class<?>>();
		List <Class <?>> next = new ArrayList <Class <?>>();
		result.add(clazz);
		todo.add(clazz);
		do {
			next.clear();
			for(Class<?> cl: todo) {
				List <Class <?>> impl = getSubclasses(cl);
				if (impl != null) {
					next.addAll(impl);
					result.addAll(impl);
				}
			}
			List <Class <?>> aux = todo;
			todo = next;
			next = aux;
		} while (todo.size() > 0);
		return result;
	}
	/**
	 * Take cares of interfaces extended by other to give back the complete list
	 * of classes directly implementing this interface (ie not extending another
	 * class that implements it).
	 * @param clazz
	 * @return
	 */
	public List <Class <?>> getExtendedImplementors(Class <?> clazz) {
		if (clazz.isInterface()) {
			List <Class <?>> directImplementors = getImplementors(clazz);
			List <Class <?>> result = new ArrayList <Class<?>>(directImplementors);
			for(Class <?> implem : directImplementors) {
				if (implem.isInterface()) result.addAll(getExtendedImplementors(implem));
			}
			return result;
		} else return getSubclasses(clazz);
	}
	
	/**
	 * Utility method that counts the number of subclasses of a given class and store
	 * the result in a map
	 * @param clazz
	 * @return
	 */
	public int count(Class<?> clazz) {
		Integer c = subclassesCount.get(clazz);
		if (c != null) return c;
		int v = 0;
		List <Class <?>> subList = subclasses.get(clazz);
		if (subList != null) { 
			for(Class<?> sub : subList) v += 1 + count(sub);
		}
		// if (clazz.isInterface() && v==0) 
		//	System.err.println("**** " + clazz.getName() + " has no implem ****");
		// System.err.println(clazz.getName() + ": " + v);
		subclassesCount.put(clazz, v);
		return v;
	}
	
	/**
	 * Utility method providing various statistics on the class.
	 */
	public void count() {
		System.err.println("Annot = " + countAnnot + "/Itf = " + countItf + "/Enum = " + countEnum + "/Class = " + countClass);
		System.err.println("Public = " + countPublic + "/Private = " + countPrivate + "/Protected = "+ countProtected + "/Package = " + countPackage);
		System.err.println("Abstract = " + countAbstract + "\n\n");
		for (Class<?> c : contents) count(c);
	}
}
