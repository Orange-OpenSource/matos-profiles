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

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Laurent Sebag
 * Dumps the interfaces and abstract classes that have no implementation counter part in a hierarchy or
 * through annotations.
 */
public class WitnessIssuesDumper {

	private static final int NUMBER_NEEDED_BY_DISPLAYED = 3;
	private ReflexUtil rf;
	private Hierarchy hierarchy;
	private HashSet<Class<?>> withWitnesses;
	private HashMap<Class<?>, Set<Method>> neededBy;

	/**
	 * Constructor 
	 * @param rf remapping utilities
	 * @param hierarchy hierarchy
	 */
	public WitnessIssuesDumper(ReflexUtil rf, Hierarchy hierarchy) {
		this.rf = rf;
		this.hierarchy = hierarchy;
	}

	/**
	 *  Static entry point. Prints to a files
	 * @param outFile
	 * @param rf remapping utilities
	 * @param hierarchy hierarchy
	 * @throws FileNotFoundException
	 */
	public static void dumpWitnessIssues(String outFile, ReflexUtil rf, 
			Hierarchy hierarchy) throws FileNotFoundException {
		PrintStream out = new PrintStream(new FileOutputStream(outFile));
		dumpWitnessIssues(out, rf, hierarchy);
	}

	/**
	 *  Static entry point. Prints to standard output
	 * @param rf remapping utilities
	 * @param hierarchy hierarchy
	 */
	public static void dumpWitnessIssues(ReflexUtil rf, Hierarchy hierarchy) {
		dumpWitnessIssues(System.out, rf, hierarchy);
	}

	/**
	 * Static entry point. Prints to a stream. 
	 * @param out
	 * @param rf remapping utilities
	 * @param hierarchy hierarchy
	 */
	public static void dumpWitnessIssues(PrintStream out, ReflexUtil rf, Hierarchy hierarchy) {

		WitnessIssuesDumper dumper = new WitnessIssuesDumper(rf, hierarchy);
		Set<Class<?>> neededAndNecessary = dumper.getNeededandNecessary();

		out.println("=====================");
		out.println("Witness Issues Report");
		out.println("=====================");
		out.println("");
		out.println("Types that are necessary and have no witness: "+neededAndNecessary.size());
		out.println("");
		out.println("");
		for(Class<?> t : neededAndNecessary) {

			StringBuilder sb = new StringBuilder();
			Set<Method> usedBy = dumper.getMethodsUsingType(t);
			Iterator<Method> i = usedBy.iterator();
			int c = 0; 
			sb.append("[");
			while(i.hasNext() && c++<NUMBER_NEEDED_BY_DISPLAYED) {
				sb.append(i.next());
				sb.append(", ");
			}
			sb.delete(sb.length()-2, sb.length());
			if(i.hasNext()) {
				sb.append(", ... and ");
				sb.append(usedBy.size()-NUMBER_NEEDED_BY_DISPLAYED);
				sb.append(" others");
			}
			sb.append("]");

			out.println(rf.restoreString(t.getName()) +"  needed by  "+ sb.toString());
			out.println("");
		}
		out.println("");
		out.println("=====================");
		out.close();
	}

	private Set<Method> getMethodsUsingType(Class<?> t) {
		return neededBy.get(t);
	}

	/**
	 * @return the set of types with witnesses
	 */
	private Set<Class<?>> getNeededandNecessary() {
		withWitnesses = new HashSet<Class<?>>();;
		neededBy = new HashMap<Class<?>, Set<Method>>();

		for(Class <?> type : hierarchy.getContents()) {

			Annotation [] annots = type.getAnnotations();
			Annotation accumulator_annot = rf.findAnnotation(EngineConstant.ACCUMULATOR_ANNOT, annots);
			int mod = type.getModifiers();

			boolean isConcrete = false;

			//
			// fill the withWitnesses Set 
			//
			if(!Modifier.isAbstract(mod) && !Modifier.isInterface(mod)) {
				// A concrete class
				if(type.getDeclaringClass()==null)
					isConcrete = true; 
			} else { // isAbstract || isInterface

				boolean hasDirectFakeImplem;
				Annotation real_annot = rf.findAnnotation(EngineConstant.REAL_ANNOT, annots);
				hasDirectFakeImplem = real_annot!=null;

				//        boolean hasDirectFakeImplem = false;
				//        List<Class<?>> implems = hierarchy.getImplementors(type);
				//        if( implems!=null ) {
				//          for(Class<?> implementor : implems) {
				//            Annotation[] implemAnnots = implementor.getAnnotations();
				//            Annotation real_annot = rf.findAnnotation(EngineConstant.REAL_ANNOT, implemAnnots);
				//            if(real_annot!=null) {
				//              hasDirectFakeImplem = true;
				//            }
				//          }
				//        }

				// abstract class or interface but has a direct fake implementer (Real annotation)
				// OR type associated to a field through an Accumulator annotation
				if(hasDirectFakeImplem || accumulator_annot!=null) {
					isConcrete = true; 
				}
			}

			if(isConcrete) {
				recursAddTypesWithWitnesses(withWitnesses, type);
			} 


			//
			// fill the necessary types map
			//
			for(Method m : type.getDeclaredMethods()) {
				Annotation [] methodAnnots = m.getAnnotations();

				if(isConcrete) {
					Annotation field_get_annot = rf.findAnnotation(EngineConstant.FIELD_GET_ANNOT, methodAnnots);
					Annotation code_annot = rf.findAnnotation(EngineConstant.CODE_ANNOT, methodAnnots);

					Class<?> returnType = m.getReturnType();
					while (returnType.isArray()) returnType = returnType.getComponentType();

					boolean omit = returnType.isPrimitive() || returnType.isMemberClass();
					if(!returnType.equals(Void.TYPE) && field_get_annot==null && code_annot==null) {
						// TODO there seems to be a bug here. See public oLaBsTuBs.android.widget.Adapter oLaBsTuBs.android.widget.GridView.getAdapter()
						// which has a FieldGet annotation and still passes this if conditions
						//            if(m.getName().contains("getAdapter")) System.err.println("##################### "+type.getName()+"."+ m.getName());

						// a result is given back by a concrete stub method, which is not a field getter and has no code associated
						if(!omit) addTypetoNeeded(returnType, m, neededBy);
					}

				}

				Annotation callback_annot = rf.findAnnotation(EngineConstant.CALLBACK_ANNOT, methodAnnots);
				if(callback_annot!=null) {
					// an argument given to a callback method 
					Class<?>[] parameters = m.getParameterTypes();
					for(Class<?> p : parameters) {
						while (p.isArray()) p = p.getComponentType();
						boolean omit = p.isPrimitive() || p.isMemberClass();
						if(!omit) addTypetoNeeded(p, m, neededBy);
					}
				}
			}

		}


		// complement of types with witnesses in the keyset of the map (neededBy.keySet() - withWitnesses)
		// Set<Class<?>> result = neededBy.keySet();
		TreeSet<Class<?>> result = new TreeSet<Class<?>>(new Comparator<Class<?>>() {
			@Override
            public int compare(Class<?> o1, Class<?> o2) {
				return o1.getName().compareTo(o2.getName());
			};
		});
		result.addAll(neededBy.keySet());
		result.removeAll(withWitnesses);
		return result;

	}

	private static void addTypetoNeeded(Class<?> type, Method method, Map<Class<?>,Set<Method>> neededBy) {
		Set<Method> methods = neededBy.get(type);
		if(methods==null) {
			methods = new HashSet<Method>();
			neededBy.put(type, methods);
		}
		methods.add(method);
	}

	private void recursAddTypesWithWitnesses(Set<Class<?>> withWitnesses,
			Class<?> type) {

		if(type==null || withWitnesses.contains(type)) return;

		withWitnesses.add(type);

		if( type.isInterface() ) {
			// browse implementors
			List<Class<?>> implementors = hierarchy.getImplementors(type);
			if(implementors!=null) {
				for(Class<?> implementor : implementors ) {
					recursAddTypesWithWitnesses(withWitnesses, implementor);
				}
			} 
		} else {
			// browse super classes
			Class<?> parent = type.getSuperclass();
			if(parent!=null && !withWitnesses.contains(parent)) {
				recursAddTypesWithWitnesses(withWitnesses, parent);
			}
			// browse implems
			for(Class<?> implem : type.getInterfaces() ) {
				recursAddTypesWithWitnesses(withWitnesses, implem);
			}

		}

	}

}
