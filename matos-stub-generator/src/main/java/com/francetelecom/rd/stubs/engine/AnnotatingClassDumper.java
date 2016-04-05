package com.francetelecom.rd.stubs.engine;

/*
 * #%L
 * Matos
 * $Id:$
 * $HeadURL:$
 * %%
 * Copyright (C) 2008 - 2015 Orange SA
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

import java.io.IOException;
import java.io.PrintStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author piac6784
 *
 */
/**
 * @author piac6784
 * 
 */
public class AnnotatingClassDumper extends ClassDumper {

	private static final String TOKEN_CLASS_KEY = "tokenClass";
	/**
	 * The key to get the name of the annotation package in properties.
	 */
	public static final String ANNOTATION_PACKAGE_KEY = "annotationPackage";
	private static final String GENERATOR_CLASS_KEY = "generatorClass";

	final static String[] primitiveTypes = { "boolean", "byte", "char",
			"short", "int", "long", "float", "double" };

	/**
	 * The name of the class used as an internal token for all generated
	 * constructors.
	 */
	private final String tokenClass;

	/**
	 * The name of the class used as an internal token for all generated
	 * constructors.
	 */
	private final String generatorClass;

	/**
	 * A complete hierarchy to know what can be dumped as default value.
	 */
	private final Hierarchy hierarchy;

	/**
	 * Counter to generate unique variable names.
	 */
	private int varCounter = 0;

	/**
	 * All the already defined real class implementations. 
	 */
	private HashSet <String> realClasses  = new HashSet<String>();
	
	/**
	 * Handle to the name cleaner
	 */
	private ReflexUtil rf;
	private Object context;

	/**
	 * Constructor in the most usual case: does not show private elements.
	 * 
	 * @param outDir
	 *            the name of the directory where the new source tree is created
	 * @param prefix
	 *            the relocation prefix added for the classloader.
	 */
	public AnnotatingClassDumper(String outDir, ReflexUtil rf,
			Properties properties, Hierarchy hierarchy) {
		super(outDir, rf, true, null);

		this.hierarchy = hierarchy;
		this.tokenClass = properties.getProperty(TOKEN_CLASS_KEY);
		this.generatorClass = properties.getProperty(GENERATOR_CLASS_KEY);
		this.rf = rf;
	}

	@Override
	public void dumpClass(Class<?> c) throws IOException {
		super.dumpClass(c);
		Annotation annot = rf.findAnnotation(EngineConstant.REAL_ANNOT, c
				.getAnnotations());
		if (annot != null) {
			String name = ReflexUtil.getStringValue(annot);
			String superName = (String) ReflexUtil.getAnnotationField(annot,
					EngineConstant.SUPER_FIELD);
			if (realClasses.contains(name)) {
				System.err.println("You have reused the class name: " + name + " for real classes.");
			} else {
				realClasses.add(name);
				dumpRealClass(c, name, superName);
			}
		}
	}

	@Override
	public boolean dumpClass(PrintStream out, Class<?> c) {
		context = c;
		if (c.isAnonymousClass())
			return false;
		Map<TypeVariable<?>, Type> typeEnv = dumpClassHeader(out, c);
		out.println("{");
		beginIndent();
		if (!c.isInterface()) dumpAddedFields(out, c);
		if (!c.isInterface() && !c.isEnum())
			dumpAddedConstructor(out, c);
		dumpClassBody(out, c, typeEnv);
		endIndent();
		indent(out);
		out.println("}");
		return true;
	}

	private <T> T[] sort(T [] array) {
		Comparator <Object> generic = new Comparator () {
			@Override
			public int compare(Object o1, Object o2) { return o1.toString().compareTo(o2.toString()); } 
		}; 
		Arrays.sort(array, generic);
		return array;
	}

	/**
	 * Dumps the fields added for the annotations.
	 * 
	 * @param out
	 * @param c
	 */
	private void dumpAddedFields(PrintStream out, Class<?> c) {
		Annotation [] annotArray = c.getAnnotations();
		Annotation accuAnnotation = rf.findAnnotation(EngineConstant.ACCUMULATOR_ANNOT, annotArray);
		if (accuAnnotation != null && !c.isInterface()) {
			String name = ReflexUtil.getStringValue(accuAnnotation);
			indent(out);
			out.print(ClassDumper.modifier(Modifier.STATIC | Modifier.PUBLIC));
			out.print(rf.restoreString(c.getSimpleName()));
			out.print(" ");
			out.print(name);
			out.println(";");
		}
		List<Annotation> newFieldList = rf.findAnnotations(
				EngineConstant.FIELD_ANNOT, EngineConstant.FIELD_ARRAY_ANNOT, annotArray);
		Set<String> fields = new HashSet<String>();
		// Do not add fields already declared in the class.
		for (Field f: c.getFields()) { fields.add(f.getName()); }
		
		for (Annotation newField : newFieldList) {
			String name = ReflexUtil.getStringValue(newField);
			fields.add(name);
			String type = rf.restoreString((String) ReflexUtil
					.getAnnotationField(newField, EngineConstant.TYPE_FIELD));
			int mod = (Integer) ReflexUtil.getAnnotationField(newField,
					EngineConstant.MODIFIER_FIELD);
			indent(out);
			out.print(ClassDumper.modifier(mod));
			out.print(type);
			out.print(" ");
			out.print(name);
			out.println(";");
		}

		for (Method m : sort(c.getDeclaredMethods())) {
			Annotation[][] paramAnnotsArray = m.getParameterAnnotations();
			Type[] paramTypes = m.getGenericParameterTypes();
			dumpAddedFields(out, fields, paramTypes, paramAnnotsArray, (m.getModifiers() & Modifier.STATIC) != 0);
		}

		for (Constructor<?> co : sort(c.getDeclaredConstructors())) {
			Annotation[][] paramAnnotsArray = co.getParameterAnnotations();
			Type[] paramTypes = co.getGenericParameterTypes();
			dumpAddedFields(out, fields, paramTypes, paramAnnotsArray, false);
		}
	}

	/**
	 * This auxiliary function looks for field setters in methods or
	 * constructors and dump a field declaration if not already done and the
	 * field is local.
	 * 
	 * @param out
	 *            output stream
	 * @param fields
	 *            fields already declared
	 * @param paramTypes
	 *            the types of parameters of the method/constructor
	 * @param paramAnnotsArray
	 *            the annotations for each parameter of method/constructor.
	 * @param b tell if the method added is static
	 */
	private void dumpAddedFields(PrintStream out, Set<String> fields,
			Type[] paramTypes, Annotation[][] paramAnnotsArray, boolean isStatic) {
		for (int i = 0; i < paramAnnotsArray.length; i++) {
			Annotation[] paramAnnots = paramAnnotsArray[i];
			Annotation annot = rf.findAnnotation(
					EngineConstant.FIELD_SET_ANNOT, paramAnnots);
			if (annot != null) {
				String name = ReflexUtil.getStringValue(annot);
				if (!fields.contains(name) && name.indexOf('.') < 0) {
					fields.add(name);
					indent(out);
					out.print(isStatic ? "private static " : "protected ");
					type(out, paramTypes[i]);
					out.print(" ");
					out.print(name);
					out.println(";");
				}
			}
		}
	}

	/**
	 * Dumps a constructor added to be sure that we can generate any object.
	 * This constructor takes a "private" parameter used as an isolation token.
	 * If the class has no constructor, then we must generate an explicit empty
	 * constructor.
	 * 
	 * @param out
	 * @param c
	 */
	private void dumpAddedConstructor(PrintStream out, Class<?> c) {
		String classname = shorten(c.getName());
		indent(out);
		out.print("public ");
		out.print(classname.substring(classname.lastIndexOf('.') + 1));
		out.print("(" + tokenClass + " arg0)    {");
		Class<?> superClass = c.getSuperclass();
		if (rf.handledClass(superClass)) {
			beginIndent();
			indent(out);
			out.print("super(arg0);");
			endIndent();
		}
		out.println("// Defaults");
		for(Field field : c.getDeclaredFields()) {
			Annotation [] annots = field.getAnnotations();
			Annotation noValueAnnot = rf.findAnnotation(EngineConstant.FIELD_NO_VALUE_ANNOT, annots);
			if(noValueAnnot != null) {
				out.print(field.getName());
				dumpFieldValue(out,field);
				out.println(";");
			}
		}
		dumpAccumulator(out,c);
		indent(out);
		out.println("}");
	}

	@Override
	protected void dumpAnnotation(PrintStream out, Annotation annot) {
		if (!rf.isStubAnnotation(annot))
			super.dumpAnnotation(out, annot);
	}

	/**
	 * Gets the list of registered callbacks in the list of annotations or null
	 * 
	 * @param annotArray
	 * @return
	 */
	private String[] getRegisteredCallbacks(Annotation[] annotArray) {
		Annotation registerAnnot = rf.findAnnotation(
				EngineConstant.CALLBACK_REGISTER_ANNOT, annotArray);
		if (registerAnnot == null)
			return null;
		return (String[]) ReflexUtil.getAnnotationField(registerAnnot,
				EngineConstant.VALUE_FIELD);
	}

	/**
	 * @param out
	 * @param eltAnnot
	 * @param baseClass
	 * @param argsAnnot
	 * @param argsTypes
	 * @param typeEnv
	 */
	private void dumpCallbackCalls(PrintStream out, Annotation[] eltAnnot,
			Class<?> baseClass, Annotation[][] argsAnnot, Class<?>[] argsTypes,
			Map<TypeVariable<?>, Type> typeEnv) {
		String[] baseCallbacks = getRegisteredCallbacks(eltAnnot);
		if (baseCallbacks != null) {
			generateCallbackCalls(out, "this", baseClass, baseCallbacks,
					typeEnv);
		}
		int argCount = 0;

		for (Annotation[] paramAnnots : argsAnnot) {
			String[] argCallbacks = getRegisteredCallbacks(paramAnnots);

			if (argCallbacks != null) {
				Class<?> argClass = argsTypes[argCount];
				generateCallbackCalls(out, "arg" + (argCount + 1), argClass,
						argCallbacks, typeEnv);
			}
			argCount++;
		}
	}

	@Override
	protected void dumpConstructorBody(PrintStream out,
			Constructor<?> constructor, Map<TypeVariable<?>, Type> typeEnv) {
		context = constructor;
		Annotation[] constructorAnnotations = constructor.getAnnotations();
		Annotation[][] parametersAnnotations = constructor
				.getParameterAnnotations();
		Annotation codeAnnotation = rf.findAnnotation(
				EngineConstant.CODE_ANNOT, constructorAnnotations);
		if (codeAnnotation != null) {
			dumpCode(out, codeAnnotation);
		} else {
			super.dumpConstructorBody(out, constructor, typeEnv);
			dumpAccumulator(out,constructor.getDeclaringClass());
			dumpFieldAssigns(out, constructorAnnotations, parametersAnnotations);
			try {
				dumpCallbackCalls(out, constructorAnnotations, constructor
						.getDeclaringClass(), parametersAnnotations,
						constructor.getParameterTypes(), typeEnv);
			} catch (RuntimeException e) {
				System.err.println(rf.restoreString(constructor.toString()));
			}
		}
	}

	private void dumpAccumulator(PrintStream out, Class<?> c) {
		Annotation [] annotArray = c.getAnnotations();
		Annotation accuAnnotation = rf.findAnnotation(EngineConstant.ACCUMULATOR_ANNOT, annotArray);
		if (accuAnnotation != null) {
			String name = ReflexUtil.getStringValue(accuAnnotation);
			indent(out);
			out.print(name);
			out.println(" = this;");
		}
		Class <?> [] itfs =  c.getInterfaces();
		for(Class<?> itf : itfs) {
			annotArray = itf.getAnnotations();
			accuAnnotation = rf.findAnnotation(EngineConstant.ACCUMULATOR_ANNOT, annotArray);
			if (accuAnnotation != null) {
				String itfName = rf.restoreString(itf.getName());
				String name = ReflexUtil.getStringValue(accuAnnotation);
				indent(out);
				out.print(itfName);
				out.print(".");
				out.print(name);
				out.println(" = this;");
			}	
		}
	}

	private void dumpCode(PrintStream out, Annotation codeAnnotation) {
		String[] code = ReflexUtil.getStringValues(codeAnnotation);
		for (String codeLine : code) {
			indent(out);
			out.println(rf.restoreString(codeLine));
		}
	}

	private void dumpFieldAssigns(PrintStream out, Annotation[] baseAnnotation,
			Annotation[][] parameterAnnotations) {
		Annotation thisFieldSet = rf.findAnnotation(
				EngineConstant.FIELD_SET_ANNOT, baseAnnotation);
		if (thisFieldSet != null) {
			String name = ReflexUtil.getStringValue(thisFieldSet);
			indent(out);
			out.println(name + " = this;");
		}
		for (int i = 0; i < parameterAnnotations.length; i++) {
			Annotation fieldSet = rf.findAnnotation(
					EngineConstant.FIELD_SET_ANNOT, parameterAnnotations[i]);
			if (fieldSet != null) {
				String name = ReflexUtil.getStringValue(fieldSet);
				indent(out);
				out.println(name + " = arg" + (i + 1) + ";");
			}
		}
	}

	@Override
	protected void dumpMethodBody(PrintStream out, Method method,
			Map<TypeVariable<?>, Type> typeEnv) {
		Annotation[] methodAnnotations = method.getAnnotations();
		Annotation codeAnnotation = rf.findAnnotation(
				EngineConstant.CODE_ANNOT, methodAnnotations);
		if (codeAnnotation != null) {
			dumpCode(out, codeAnnotation);
		} else {
			Annotation[][] parameterAnnotations = method
					.getParameterAnnotations();
			dumpFieldAssigns(out, methodAnnotations, parameterAnnotations);
			try {
				dumpCallbackCalls(out, methodAnnotations, method
						.getDeclaringClass(), parameterAnnotations, method
						.getParameterTypes(), typeEnv);
			} catch (RuntimeException e) {
				System.err.println(rf.restoreString(method.toString()));
			}
			dumpMethodResult(out, method, typeEnv);
		}
	}

	@Override
	protected void dumpMethod(PrintStream out, Method meth, boolean isItf,
			boolean isNotAbstract, Map<TypeVariable<?>, Type> typeEnv) {
		context = meth;
		Annotation annot = rf.findAnnotation(EngineConstant.SUPER_ANNOT, meth
				.getAnnotations());
		if (annot == null)
			super.dumpMethod(out, meth, isItf, isNotAbstract, typeEnv);
		else {
			// TODO Check that this is correct to use USE_SUPER
		}
	}

	/**
	 * Output the result of a method so that it is an actual value.
	 * 
	 * @param out
	 * @param method
	 * @param typeEnv
	 */
	private void dumpMethodResult(PrintStream out, Method method,
			Map<TypeVariable<?>, Type> typeEnv) {
		Class<?> result = method.getReturnType();
		if (result.getName().equals("void"))
			return;
		Annotation[] annots = method.getAnnotations();
		Annotation specificResultAnnot = rf.findAnnotation(
				EngineConstant.MAY_BE_ANNOT, annots);
		Annotation fieldResultAnnot = rf.findAnnotation(
				EngineConstant.FIELD_GET_ANNOT, annots);
		if (fieldResultAnnot != null) {
			indent(out);
			String fieldName = ReflexUtil.getStringValue(fieldResultAnnot);
			out.append("return ").append(fieldName).append(";\n");
		} else if (specificResultAnnot != null) {
			String[] mayBeClasses = ReflexUtil
					.getStringValues(specificResultAnnot);
			int count = 0;
			indent(out);
			out.println("switch(" + generatorClass + ".intValue()){");
			for (String maybe : mayBeClasses) {
				indent(out);
				out.println("case " + count++ + ":");
				beginIndent();
				indent(out);
				out.append("return new ").append(maybe).append("(").append(
						generatorClass + ".token").append(");\n");
				endIndent();
			}
			indent(out);
			out.println("default:");
			beginIndent();
			indent(out);
			out.println("return null;");
			endIndent();
			indent(out);
			out.println("}");

		} else {
			String resultContent = buildDefaultValue(out, result, typeEnv);
			indent(out);
			// I do not understand why I need this explicit coercion.
			if (method.getGenericReturnType() instanceof TypeVariable<?>) {
				out.append("return (");
				type(out, method.getGenericReturnType(), true, typeEnv );
				out.append(") ").append(resultContent).append(";\n");
			} else {
				out.append("return ").append(resultContent).append(";\n");
			}
		}
	}

	/**
	 * @param out
	 *            the output stream
	 * @param targetObj
	 *            the name of the element containing the callbacks
	 * @param clazz
	 *            its class.
	 * @param callbackIds
	 *            a list of callback id
	 * @param typeEnv
	 *            a type environment to solve type variables
	 */
	private void generateCallbackCalls(PrintStream out, String targetObj,
			Class<?> clazz, String[] callbackIds,
			Map<TypeVariable<?>, Type> typeEnv) {
		for (String callbackId : callbackIds) {
			int count = generateCallbackCalls(out, targetObj, clazz,
					callbackId, typeEnv);
			if (count == 0) {
				System.err.println("Problem with callbacks in "
						+ rf.restoreString(clazz.getName()) + " for "
						+ callbackId);
				throw new RuntimeException("count");
			}

		}
	}

	/**
	 * Generate the callback for one id. This version recursively explore the
	 * ancestors (interfaces and superclass).
	 * 
	 * @param out
	 * @param targetObj
	 * @param clazz
	 * @param callbackId
	 * @param typeEnv
	 * @return
	 */
	private int generateCallbackCalls(PrintStream out, String targetObj,
			Class<?> clazz, String callbackId,
			Map<TypeVariable<?>, Type> typeEnv) {
		int count = generateCallbackCallsLocal(out, targetObj, clazz,
				callbackId, typeEnv);
		Class<?> superClass = clazz.getSuperclass();
		if (superClass != null)
			count += generateCallbackCalls(out, targetObj, superClass,
					callbackId, typeEnv);
		for (Class<?> itfs : clazz.getInterfaces())
			count += generateCallbackCalls(out, targetObj, itfs, callbackId,
					typeEnv);
		return count;
	}

	/**
	 * Generate the callbacks for one id and one class.
	 * 
	 * @param out
	 *            the output stream
	 * @param targetObj
	 *            the name of the element containing the callbacks
	 * @param clazz
	 *            its class.
	 * @param callbackId
	 *            a given callback id
	 * @param typeEnv
	 *            a type environment to solve type variables
	 */
	private int generateCallbackCallsLocal(PrintStream out, String targetObj,
			Class<?> clazz, String callbackId,
			Map<TypeVariable<?>, Type> typeEnv) {
		int count = 0;
		int lastDot = callbackId.lastIndexOf('.');
		if (lastDot > 0) {
			// String prefix = callbackId.substring(0, lastDot);
			// String clazzName =
			// restoreString(clazz.getName()).replace('$','.');
			// System.err.println(clazzName + " " + prefix);
			// if (!clazzName.equals(prefix)) return 0;
			callbackId = callbackId.substring(lastDot + 1);
			// System.err.println(callbackId);
		}
		for (Method method : clazz.getDeclaredMethods()) {
			Annotation callbackAnnot = rf.findAnnotation(
					EngineConstant.CALLBACK_ANNOT, method.getAnnotations());
			if (callbackAnnot != null) {
				String[] ids = ReflexUtil.getStringValues(callbackAnnot);
				if (ids == null)
					continue;
				if (contains(ids, callbackId)) {
					Class<?>[] argTypesArray = method.getParameterTypes();
					String[] defaultValuesArray = new String[argTypesArray.length];
					for (int i = 0; i < argTypesArray.length; i++) {
						defaultValuesArray[i] = buildDefaultValue(out,
								argTypesArray[i], typeEnv);
					}
					boolean raiseExc = method.getExceptionTypes().length > 0;
					if (raiseExc) {
						indent(out);
						out.println("try {");
						beginIndent();
					}
					indent(out);
					out.print(targetObj);
					out.print(".");
					out.print(method.getName());
					out.print("(");
					boolean first = true;
					for (int i = 0; i < defaultValuesArray.length; i++) {
						if (first)
							first = false;
						else
							out.print(", ");
						out.print(defaultValuesArray[i]);
					}
					out.println(");");
					if (raiseExc) {
						endIndent();
						indent(out);
						out.println("} catch (Exception exc) { }");
					}
					count++;
				}
			}
		}
		return count;
	}

	/**
	 * This methods gives back a string that represent a default value of class
	 * clazz. But building this value may require several statements that will
	 * be dumped on the output stream during the method execution.
	 * 
	 * @param out
	 * @param type
	 * @return
	 */
	private String buildDefaultValue(PrintStream out, Type type,
			Map<TypeVariable<?>, Type> typeEnv) {
		String typeName = type.toString();
		if (contains(primitiveTypes, typeName)) {
			return generatorClass + "." + typeName + "Value()";
		} else {
			if (type instanceof TypeVariable<?>) {
				if (typeEnv == null)
					return "null";
				else {
					Type actual = typeEnv.get((TypeVariable<?>) type);
					if (actual == null)
						return "null";
					else
						return buildDefaultValue(out, actual, null);
				}
			} else if (type instanceof Class<?>) {
				Class<?> clazz = (Class<?>) type;
				if (clazz.isArray()) {
					Class<?> elt = clazz.getComponentType();
					String eltValue = buildDefaultValue(out, elt, typeEnv);
					return "new " + shorten(ReflexUtil.readableName(elt))
							+ "[]{" + eltValue + "}";
				} else if (clazz.isEnum()) {
					return buildDefaultEnumValue(out, clazz, typeEnv);
				} else {
					return buildDefaultClassValue(out, clazz, typeEnv);
				}
			} else {
				return "*** BOGUS " + type + " ***";
			}
		}
	}

	@Override
	protected void dumpField(PrintStream out, Field field, boolean hasValue) {
		Annotation [] annots = field.getAnnotations();
		Annotation implemAnnot = rf.findAnnotation(EngineConstant.FIELD_VALUE_IMPL_ANNOT, annots);
		
		if (implemAnnot != null) {
			String name = ReflexUtil.getStringValue(implemAnnot);
			String superName;
			Class <?> type = field.getType();
			Annotation [] annotType = type.getAnnotations();
			Annotation realAnnot = rf.findAnnotation(EngineConstant.REAL_ANNOT, annotType);
			if (realAnnot != null) {
				superName = ReflexUtil.getStringValue(realAnnot);
			} else {
				superName = shorten(type.getName());
			}
			indent(out);
			out.println("static class " + name + " extends " + superName + " {");
			beginIndent();
			indent(out);
			out.println("public " + name + "(){ super(" + generatorClass + ".token); }");
			endIndent();
			indent(out);
			out.println("}");
		}
		super.dumpField(out,field,rf.findAnnotation(EngineConstant.FIELD_NO_VALUE_ANNOT, annots) == null );
	}
	
	
	private String buildDefaultClassValue(PrintStream out, Class<?> clazz, Map<TypeVariable<?>, Type> typeEnv) {
		int mod = clazz.getModifiers();
		if (! rf.handledClass(clazz)) { 
			if (clazz.isInterface() || Modifier.isAbstract(mod)) return "null";
			if (clazz.equals(Class.class)) return "Object.class";
			if (clazz.equals(String.class)) {
				return "\"[stubs:" + rf.restoreString(context.toString()) + "]\"";
			}
			return "new " + clazz.getName() + "()";
		}
		List <Class <?>> subclasses = hierarchy.getSubclasses(clazz);
		if (clazz.isInterface()) {
			if (subclasses == null) subclasses = hierarchy.getImplementors(clazz);
			else subclasses.addAll(hierarchy.getImplementors(clazz));
		}
		String thisDefault;
		// TODO : Here we get rid of interfaces, abstract class but also embedded classes.
		// The last point deserves a second thought.
		Annotation [] annots = clazz.getAnnotations();
		Annotation accumulatorAnnot = rf.findAnnotation(EngineConstant.ACCUMULATOR_ANNOT, annots);
		if (accumulatorAnnot != null) {
			String name = ReflexUtil.getStringValue(accumulatorAnnot);
			// We stop here.
			return rf.restoreString(clazz.getName())+ "." + name;
		}
		if (clazz.isInterface() || Modifier.isAbstract(mod) || (clazz.getEnclosingClass() != null && (!Modifier.isStatic(mod)) || (!Modifier.isPublic(mod)))) {
			thisDefault = interfaceWitness(annots);
		} else {
			thisDefault =
				"new " + shorten(clazz.getName()) + "(" +
				(rf.handledClass(clazz) ? generatorClass + ".token)" : ")");
		}
		if (hierarchy.count(clazz) > 30 || subclasses == null) { 
			if (thisDefault.equals("null") && (clazz.isInterface() || Modifier.isAbstract(mod) || clazz.getEnclosingClass() == null)) {
				System.err.println("Warning no default for " + rf.restoreString(clazz.toString())
						+ " in context " + rf.restoreString(context.toString()));
				count++;
			}
			return thisDefault; 
		} else {
			int count = 0;
			String var = "v" + varCounter ++;
			indent(out);
			out.println(shorten(clazz.getName()) + " " + var + ";");
			indent(out);
			out.println("switch(" + generatorClass + ".intValue()){");
			for(Class <?> subC : subclasses) {
				indent(out);
				out.println("case " + count++ + ":");
				beginIndent();
				String defSubC = buildDefaultValue(out, subC, typeEnv);
				indent(out);
				out.println(var + " = "  + defSubC + ";");
				indent(out);
				out.println("break;");
				endIndent();
			}
			indent(out);
			out.println("default:");
			beginIndent();
			indent(out);
			out.println(var + " = "  + thisDefault + ";");
			endIndent();
			indent(out);
			out.println("}");
			return var;
		}
	}

	/**
	 * Goes through the different enum constants as they are more or less
	 * independent objects. It is not clear it is of any good.
	 * 
	 * @param out
	 * @param enumClazz
	 * @param typeEnv
	 * @return
	 */
	private String buildDefaultEnumValue(PrintStream out, Class<?> enumClazz,
			Map<TypeVariable<?>, Type> typeEnv) {
		int count = 0;
		String var = "v" + varCounter++;
		String name = shorten(enumClazz.getName());
		indent(out);
		out.println(name + " " + var + ";");
		indent(out);
		out.println("switch(" + generatorClass + ".intValue()){");
		for (Field field : enumClazz.getDeclaredFields()) {
			if (field.isEnumConstant()) {
				indent(out);
				out.println("case " + count++ + ":");
				beginIndent();
				indent(out);
				out.println(var + " = " + name + "." + field.getName() + ";");
				indent(out);
				out.println("break;");
				endIndent();
			}
		}
		indent(out);
		out.println("default:");
		beginIndent();
		indent(out);
		out.println(var + " = null;");
		endIndent();
		indent(out);
		out.println("}");
		return var;

	}

	/**
	 * Finds the class if it exists that is the witness for a given class and
	 * gives back the code that provide that witness.
	 * 
	 * @param clazz
	 *            the interface.
	 * @return a new expression if the implementor exists and null otherwise.
	 */
	private String interfaceWitness(Annotation [] annots) {
		Annotation implementorAnnot = rf.findAnnotation(
				EngineConstant.REAL_ANNOT, annots);
		if (implementorAnnot == null) {
			return "null";
		} else {
			String implemClazz = ReflexUtil.getStringValue(implementorAnnot);
			return "new " + implemClazz + "(" + generatorClass + ".token)";
		}
	}

	/**
	 * Utility method that search a string in an array of strings.
	 * 
	 * @param array
	 *            the array where the search is done
	 * @param searched
	 *            the string searched.
	 * @return
	 */
	private boolean contains(String[] array, String searched) {
		if (array == null)
			return false;
		for (String id : array) {
			if (searched.equals(id))
				return true;
		}
		return false;
	}
	
	private void buildRecursiveEnvType(Class <?> c, Map<TypeVariable<?>, Type> typeEnv) {
		if (c == null || c.equals(Object.class)) return;
		Type superClass = c.getGenericSuperclass();
		if (superClass instanceof ParameterizedType) {
			buildEnvType(typeEnv, (ParameterizedType) superClass);
		} 
		buildRecursiveEnvType(c.getSuperclass(), typeEnv);
		for(Type itfs: c.getGenericInterfaces()) {
			if (itfs instanceof ParameterizedType) {
				buildEnvType(typeEnv, (ParameterizedType) itfs);
			}			
		}
		for(Class <?> itf : c.getInterfaces()) buildRecursiveEnvType(itf, typeEnv);
	}

	/**
	 * Dump the real class implementing an interface to a file to a file
	 * 
	 * @param out
	 * @param c
	 */
	public void dumpRealClass(Class<?> c, String classname, String superclass)
			throws IOException {
		PrintStream out = buildOutStream(classname);
		if (out == null)
			return;

		try {
			Map<TypeVariable<?>, Type> typeEnv = new HashMap<TypeVariable<?>, Type>();
			buildRecursiveEnvType(c,typeEnv);
			setPackage(out, classname);
			
			indent(out);
			String shortname = classname
					.substring(classname.lastIndexOf('.') + 1);
			out.print("public /* */ class ");
			out.print(shortname);
			typeParameters(out, c.getTypeParameters());
			if (c.isInterface()) {
				if (superclass != null && !superclass.equals("") && !superclass.equals("-")) {
					out.print(" extends " + superclass);
				}
				out.print(" implements ");
				type(out,c);
			} else {
				
				out.print(" extends ");
				type(out,c);
			}
			Type [] args = c.getTypeParameters();
			if (args.length > 0) {
				out.print("<");
				dumpListType(out,args, false);
				out.print(">");
			}
			out.println("{");
			beginIndent();
			// Implemented fields
			dumpAddedFields(out,c);
			// Constructor
			indent(out);
			out.print("public ");
			out.print(shortname);
			out.print("(" + tokenClass + " arg0){");
			beginIndent();
			if ((superclass != null && !superclass.equals("") && !superclass.equals("-")) || !c.isInterface()) {
				indent(out);
				out.print("super(arg0);");
			}
			endIndent();
			indent(out);
			out.println("}");
			// Dump constructors as calls to super if there are super constructor (abstract class) 
			for(Constructor<?> co : c.getDeclaredConstructors()) {
				int mod = co.getModifiers();
				if (!Modifier.isProtected(mod) &&  ! Modifier.isPublic(mod)) continue; 
				indent(out);
				out.print("public ");
				out.print(shortname);
				out.print("(");
				Type [] params = co.getGenericParameterTypes();
				
				int count = 0;
				for(Type param : params) {
					if(count > 0) out.print(", ");
					type(out, param,true, typeEnv);
					out.print(" arg");
					out.print(++count);
				}

				out.print(") ");
				Type [] excs = co.getGenericExceptionTypes();
				if (excs.length > 0) {
					out.print(" throws ");
					dumpListType(out, excs, true);
				}
				out.println("{");
				beginIndent();
				indent(out);
				out.print("super(");
				for(int c1=0; c1 < params.length; c1++) {
					if(c1 > 0) out.print(", ");
					out.print(" arg");
					out.print(c1+1);
				}

				out.println(");");
				endIndent();
				indent(out);
				out.println("}");
				
			}
			// Get all the public methods.
			HashSet <Method> seen = new HashSet<Method>();
			for (Method meth : c.getMethods()) {
				if (Modifier.isAbstract(meth.getModifiers()) && !meth.isSynthetic() && isNewMethod(meth,seen)) {
					dumpMethod(out, meth, false, true, typeEnv);
					seen.add(meth);
				}
			}
			// Go up the hierarchy
			Class <?> parent = c;
			while(parent != null && parent != java.lang.Object.class) {
				for (Method meth : parent.getDeclaredMethods()) {
					int mod = meth.getModifiers();
					if (Modifier.isAbstract(mod)  && Modifier.isProtected(mod) && isNewMethod(meth,seen)) 
						dumpMethod(out, meth, false, true, typeEnv);
				}
				for(Method m: parent.getDeclaredMethods()) { seen.add(m); }
				parent = parent.getSuperclass();
			}
			endIndent();
			indent(out);
			out.println("}");

		} catch (Throwable e) {
			e.printStackTrace();
			out.println("}");
			throw new IOException(e.getMessage());
		}
		if (!debug) {
			out.close();
		}
	}

	private boolean isNewMethod(Method meth, HashSet<Method> seen) {
		String name = meth.getName();
		Class<?> [] types = meth.getParameterTypes();
		for(Method match: seen) {
			if(match.getName().equals(name) && Arrays.equals(match.getParameterTypes(), types)) return false;
		}
		return true;
	}

	@Override
	protected void dumpValueAnyClass(PrintStream out, Type typ) { 
		if (typ instanceof Class <?>) {
			Class<?> clazz = (Class <?>) typ;
			if (clazz.isArray()) {
				Class<?> elt = clazz.getComponentType();
				out.print("new " + shorten(ReflexUtil.readableName(elt)) + "[]{");
				dumpDefaultValue(out,elt,null); 
				out.print("}");
			} else {
				if (!Modifier.isAbstract(clazz.getModifiers()) && !clazz.isEnum() && rf.handledClass(clazz)) {  
					out.print("new " + shorten(clazz.getName()) + "(" +	generatorClass + ".token)" );
				} else {
					Annotation [] annots = clazz.getAnnotations();
					Annotation realAnnot = rf.findAnnotation(EngineConstant.REAL_ANNOT, annots);
					if (realAnnot != null) {
						String name = ReflexUtil.getStringValue(realAnnot);
						out.print("new " + name + "(" +	generatorClass + ".token)" );
					} else { out.print("null"); }
				}
			}
		} else out.print("null");
	}

	@Override
	protected void dumpFieldValue(PrintStream out, Field field) {
		int mod = field.getModifiers();
		out.print(" = ");
		Annotation [] annots = field.getAnnotations();
		Annotation implemAnnot = rf.findAnnotation(EngineConstant.FIELD_VALUE_IMPL_ANNOT, annots);
		if (implemAnnot != null) {
			out.print("new ");
			out.print(ReflexUtil.getStringValue(implemAnnot));
			out.print("()");
		} else if (Modifier.isFinal(mod) && Modifier.isStatic(mod)) dumpValue(out,field);
		else dumpFieldValue(out,field, field.getType());
	}
		
	private void dumpFieldValue(PrintStream out, Field field, Class<?> type) {	
		if (type.equals(java.lang.String.class)) {
			out.print("\"[field:");
			out.print(rf.restoreString(field.toString()));
			out.print("]\"");
		} else if (type.isArray()) {
			Class<?> elt = type.getComponentType();
			out.print("new " + shorten(ReflexUtil.readableName(elt)) + "[]{");
			dumpFieldValue(out,field,elt);
			out.print("}");
		} else 	if(type.equals(boolean.class)) out.print("false");
		else if (type.equals(byte.class)) out.print("(byte) 0");
		else if (type.equals(char.class)) out.print("'\\u0000'");
		else if (type.equals(short.class)) out.print("(short) 0");
		else if (type.equals(int.class)) out.print("0");
		else if (type.equals(long.class)) out.print("0l");
		else if (type.equals(float.class)) out.print("0.0f");
		else if (type.equals(double.class)) out.print("0.0d");
		else {
			dumpValueAnyClass(out, type);
		}
	}

	@Override
	protected void generateImports(PrintStream out, Class<?> c) { }
}
