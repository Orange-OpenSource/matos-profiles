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

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

/**
 * This class pretty prints the empty stub of a loaded class. It should perform
 * nothing and real stubs must be implemented by overloading this class.
 * @author Pierre Cregut
 *
 */

/**
 * @author Pierre Cregut
 *
 */
public class ClassDumper {
	
	final static private int PUBLIC = 1;
	@SuppressWarnings("unused")
	final static private int PACKAGE = 2;
	final static private int PRIVATE = 3;
	
	final static Class <?> OBJECT_CLASS = java.lang.Object.class;
	final static Class <?> ENUM_CLASS = java.lang.Enum.class;
	final private String outDir;
	private Pattern shortenerPattern;
	private static Pattern anonymousClassPattern = Pattern.compile("([./]|^)([0-9])");
	int count = 0;
	int indentDepth = 0;
	final private boolean privateAccess;
	final private ReflexUtil rf;

	final Type [] typeAW = new Type[0];
	final Method [] methodAW = new Method[0];
	private final AlternativeAnnotations optAnnotations;
	
	private VersionDatabase database = null;
	
	private HashSet<Class<?>> neededClasses = new HashSet<Class<?>>();
	
	/**
	 * Constructor.
	 * @param outDir the name of the directory where the new source tree is created
	 * @param prefix the relocation prefix added for the classloader.
	 * @param privateAccess: if true private and package class, methods and fields are dumped
	 */
	public ClassDumper(String outDir, ReflexUtil rf, boolean privateAccess, AlternativeAnnotations optAlternative) {
		this.outDir = outDir;
		this.privateAccess=privateAccess;
		this.optAnnotations=optAlternative;
		this.rf = rf;
	}
	
	/**
	 * Constructor in the most usual case: does not show private elements.
	 * @param outDir the name of the directory where the new source tree is created
	 * @param prefix the relocation prefix added for the classloader.
	 */
	public ClassDumper(String outDir, ReflexUtil rf, AlternativeAnnotations optAlternative) {
		this(outDir,rf,false, optAlternative);
	}

	/**
	 * Register a version database to dump the set of versions.
	 * @param database
	 */
	public void setVersionDatabase(VersionDatabase database) {
		this.database = database;
	}
	/**
	 * Change all the intermediate names that begin with digits.
	 * @param s
	 * @return
	 */
	private String renameAnonymousClass (String s) {
		return anonymousClassPattern.matcher(s).replaceAll("$1Anonymous$2");
	}

	/**
	 * Remove the relocation prefix from the name.
	 * @param name
	 * @return
	 */
	protected String shorten(String name) {
		name = rf.restoreString(name);
		name = shortenerPattern.matcher(name).replaceAll("$2").replace('$', '.');
		name = renameAnonymousClass(name);
		return name;
	}

	/**
	 * Print out the right number of spaces to get a correct indentation.
	 * @param out
	 */
	protected void indent(PrintStream out) {
		for (int i=0; i < indentDepth; i++) out.print("  ");
	}

	/**
	 * Increase the indentation level
	 */
	protected void beginIndent() { indentDepth ++; }
	
	/**
	 * Decrease the indentation level. 
	 */
	protected void endIndent() { indentDepth --; }
	
	
	/**
	 * Keep visible types from a list.
	 * @param types an array 
	 * @return a filtered array.
	 */
	private Type [] filterListTypes (Type [] types) {
		List<Type> result = new ArrayList<Type>();
		for (Type type: types) {
			if(!isInvisible(type)) result.add(type);
		}
		return result.toArray(new Type [0]);
	}
	
	/**
	 * Output a type list with a comma as separator (regular case)
	 * @param out
	 * @param list
	 * @param authParams
	 */
	protected void dumpListType(PrintStream out, Type [] list, boolean authParams) {
		boolean first = true;
		for(Type param : list) {
			if (first) first = false;
			else out.print(", ");
			type(out, param, authParams, null);
		}		
	}
	
	/**
	 * Output a type list with &amp; as separator (for wildcard bound)
	 * @param out
	 * @param list
	 * @param authParams
	 */
	private void dumpListTypeAmp(PrintStream out,  Type [] list, boolean authParams) {
		boolean first = true;
		for(Type param : list) {
			if (first) first = false;
			else out.print(" & ");
			type(out, param,authParams, null);
		}		
	}

	/**
	 * Print outs a type in regular string format.
	 * @param type
	 * @return
	 */
	protected void type(PrintStream out,Type type, boolean authParams, Map<TypeVariable<?>, Type> typEnv) {
		if (type == null) {
			out.print("*** bug null ***");
			return;
		}
			
		if (type instanceof GenericArrayType) {
			type (out, ((GenericArrayType) type).getGenericComponentType(), authParams, typEnv);
			out.print(" []");
		} else if (type instanceof ParameterizedType) {
			if (isInvisible(type)) {
				type(out,((ParameterizedType) type).getRawType(), authParams, typEnv);
			} else 
				typeParameterized(out,(ParameterizedType) type, typEnv, authParams);
		} else if (type instanceof TypeVariable<?>) {
			if (typEnv != null && typEnv.containsKey((TypeVariable <?>) type)) {
				Type substituted = typEnv.get((TypeVariable<?>) type);
				type(out,substituted,authParams, null);
			} else {
				TypeVariable <?> tvar = (TypeVariable <?>) type;
				out.print(tvar.getName());
			}
		} else if (type instanceof WildcardType) {
			typeWildcard(out,(WildcardType) type, authParams, typEnv);
		} else {
			Class <?> classType = (Class <?>) type;
			if (classType.isArray()) { 
				type(out,classType.getComponentType(),authParams, typEnv);
				out.print(" []");
			} else if (isInvisible(classType)) {
				type(out,classType.getSuperclass(), authParams, typEnv);
			} else out.print(shorten(classType.getName()));	
		}
	}

	/**
	 * Output a wildcard type
	 * @param out output stream
	 * @param wt the type to print
	 * @param authParams do we keep type parameters
	 * @param typEnv a typing environment.
	 */
	private void typeWildcard(PrintStream out, WildcardType wt,boolean authParams,
			Map<TypeVariable<?>, Type> typEnv) {
		out.print("?");
		Type [] bounds = wt.getUpperBounds();
		if (bounds.length > 0  && !bounds[0].equals(OBJECT_CLASS) ) {
			out.print(" extends ");
			dumpListType(out,bounds, authParams);
		}
		bounds = wt.getLowerBounds();
		if (bounds.length > 0  && !bounds[0].equals(OBJECT_CLASS) ) {
			out.print(" super ");
			dumpListType(out,bounds, authParams);
		}
	}

	/**
	 * Dumps a parameterized type.
	 * @param out
	 * @param pt the type to print.
	 * @param typEnv typing environment (for interpreting type variables)
	 * @param authParams Do we keep type parameters.
	 */
	private void typeParameterized(PrintStream out, ParameterizedType pt,
			Map<TypeVariable<?>, Type> typEnv, boolean authParams) {
		if (pt.getOwnerType() != null) {
			type(out,pt.getOwnerType(), authParams, typEnv);
			out.print(".");
			Class <?> rawType = (Class <?>) pt.getRawType();
			out.print(renameAnonymousClass(rawType.getSimpleName()));
		} else {
			type(out, pt.getRawType(), authParams, typEnv);
		}
		Type [] args = pt.getActualTypeArguments();
		if (authParams && args.length > 0) {
			out.print("<");
			dumpListType(out,args, authParams);
			out.print(">");
		}
	}

	/**
	 * Print outs a type in regular string format. The type environment is null and
	 * corresponds to the case where the type is solved.
	 * @param type
	 * @return
	 */
	protected void type(PrintStream out, Type type) {
		type(out, type,true, null);
	}
	/**
	 * Prints out a list of type parameters (quantified type variables).
	 * @param out
	 * @param tvars
	 */
	protected void typeParameters(PrintStream out, TypeVariable<?> [] tvars) {
		if (tvars != null && tvars.length > 0) {
			out.print("<");	
			boolean first = true;
			for(TypeVariable <?> tvar : tvars) {
				if (first) first = false;
				else out.print(", ");
				out.print(tvar.getName());
				Type [] bounds = tvar.getBounds();
				if (bounds.length > 0 && bounds[0] != java.lang.Object.class) {
					out.print(" extends ");
					dumpListTypeAmp(out,bounds, false);
				}
			}
			out.print(">");
		}
	}

	protected final boolean debug = false;
	private File outFileRef = null;
	private HashSet<String> seenMethods;
	
	/**
	 * Create the output stream and the necessary folders.
	 * @param classname
	 * @return
	 * @throws IOException
	 */
	protected PrintStream buildOutStream(String classname) throws IOException {
		PrintStream out;
		if (debug) {
			out = System.out;
			outFileRef = null;
		}
		else {
			outFileRef = new File(outDir, classname.replace('.', '/') + ".java");
			File parentDir = outFileRef.getParentFile();
			if (parentDir != null && !parentDir.isDirectory() && !parentDir.mkdirs()) {
				System.err.println("Cannot create output folder for" + classname);
				return null;
			}
			out = new PrintStream(new FileOutputStream(outFileRef));
		}
		return out;
	}
	
	/**
	 * Dump the class to a file
	 * @param out
	 * @param c
	 */
	public void dumpClass(Class <?> c) throws IOException {
		boolean keep = false;
		String classname = c.getName();
		if (classname.contains("$")) return;
		classname = rf.restoreString(classname);
		PrintStream out = buildOutStream(classname);
		File outFile = outFileRef;
		if (out == null) return;
		
		try {
			setPackage(out, classname);
			generateImports(out,c);
			keep = dumpClass(out,c);
		} catch (Throwable e) {
			e.printStackTrace();
			out.println("}");
			throw new IOException(e.getMessage());
		}
		if (!debug) {
			out.close();
			if (!keep && outFile != null) {
				if (!outFile.delete()) System.err.println("Cannot delete out file" + outFile); }
		}
	}
	
	protected void generateImports(PrintStream out, Class<?> c) {
		HashSet <String> importedAnnotations = new HashSet<String>();
		collectImportedAnnotations(importedAnnotations, c);
		for(String annot : importedAnnotations) {
			out.println("import " + rf.restoreString(annot) + ";");
		}
		out.println();
	}

	private void collectImportedAnnotations(HashSet<String> importedAnnotations, Class<?> clazz) {
		Annotation [] clazzAnnots = clazz.getAnnotations();
		addAnnotations(clazzAnnots, importedAnnotations);
		for(Field field: clazz.getDeclaredFields()) 
			addAnnotations(field.getAnnotations(), importedAnnotations);
		for (Class <?> subclass : clazz.getDeclaredClasses()) {
			collectImportedAnnotations(importedAnnotations, subclass);
		}
		for (Constructor <?> co : clazz.getDeclaredConstructors()) 
			addAnnotations(co.getAnnotations(), importedAnnotations);
		for (Method me : clazz.getDeclaredMethods()) 
			addAnnotations(me.getAnnotations(), importedAnnotations);
	}
	
	private void addAnnotations(Annotation[] annotations, HashSet<String> importedAnnotations) {
		for (Annotation annot : annotations) {
			if (rf.isStubAnnotation(annot)) {
				importedAnnotations.add(annot.annotationType().getName());
			}
		}
	}

	/**
	 * Output the package name and remember it.
	 * @param out
	 * @param c
	 */
	protected void setPackage(PrintStream out, String className) {
		int i = className.lastIndexOf('.');
		String pkgName = (i == -1) ? "" : className.substring(0,i);
		out.println("package "+ pkgName + ";\n");
		String regexp = "^("+pkgName+")[.]([^.]*)$";
		shortenerPattern = Pattern.compile(regexp);
		if (database != null) out.println("import " + rf.annotationPackage() + ".Missing;");
	}

	/**
	 * Dump a class on an existing stream. Can be used for inner class.
	 * @param out
	 * @param c
	 * @return if false we discard this class (used if we opened a file specifically for it).
	 */
	public boolean dumpClass(PrintStream out, Class <?> c) {
		if (!neededClasses.contains(c) && (c.isAnonymousClass() || isInvisible(c))) return false;
		Map<TypeVariable<?>, Type> typeEnv = dumpClassHeader(out,c);
		out.println("{");
		beginIndent();
		dumpClassBody(out,c,typeEnv);
		endIndent();
		indent(out);
		out.println("}");
		return true;
	}
	
	/**
	 *  Dumps the declaration of a class (first lines up to the brace) 
	 * @param out the output stream
	 * @param clazz the class
	 * @return an environment telling how to interpret type parameter encountered inside
	 */
	protected Map<TypeVariable<?>, Type> dumpClassHeader(PrintStream out, Class <?> clazz) {
		int mod = clazz.getModifiers();
		Map<TypeVariable<?>, Type> typeEnv = null;
		Annotation [] annotations =
			(optAnnotations == null ? clazz.getDeclaredAnnotations() : optAnnotations.getDeclaredAnnotations(clazz));
		
		dumpAnnotationList(out,annotations);
		if (database != null) {
			dumpMissingAnnotation(out, database.missingVersionsOf(clazz));
		}
		indent(out);
		boolean isItf = Modifier.isInterface(mod);
		boolean isEnum = clazz.isEnum();
		boolean isAnnot = clazz.isAnnotation();
		if (isEnum) {
			mod &= (~Modifier.FINAL & ~Modifier.ABSTRACT);	
		}
		if (isItf) {
			mod &= ~Modifier.ABSTRACT;
		}
		out.print(modifier(mod));
		if(isAnnot) out.print("@");
		out.print(isItf ? "interface " : (isEnum ? "enum " : "class "));
		String classname = shorten(clazz.getName());
		out.print(classname.substring(classname.lastIndexOf('.') + 1));
		typeParameters(out, clazz.getTypeParameters());
		out.println();
		indent(out);
		// Hides the super that are not public
		Class <?> baseSuper = clazz;
		Class <?> sup = baseSuper.getSuperclass();
		if (sup != null && isInvisible(sup)) 
			System.err.println(rf.restoreString("TO KEEP FOR " + clazz + " : " + sup));
		Set <Type> itfsRaw = new HashSet <Type>();
		itfsRaw.addAll(Arrays.asList(clazz.getGenericInterfaces()));
		while(baseSuper.getSuperclass() != null && isInvisible(baseSuper.getSuperclass())) {
			baseSuper = baseSuper.getSuperclass();
			itfsRaw.addAll(Arrays.asList(baseSuper.getGenericInterfaces()));
		}
		Type superClassType = baseSuper.getGenericSuperclass();
		if (superClassType != null && superClassType != OBJECT_CLASS && !isEnum) {
			
			out.print("  extends ");
			type(out, superClassType);
			typeEnv = buildEnvType(superClassType);
			indent(out);
		}
		Type [] itfs = filterListTypes(itfsRaw.toArray(typeAW));
		if (itfs != null && itfs.length > 0 && !isAnnot) {
			out.print(isItf ? "  extends " : "  implements ");
			dumpListType(out,itfs, true);
			out.println();
			indent(out);
		}
		return typeEnv;
	}

	/**
	 * The contents of the class (constructors, other class, fields and methods)
	 * @param out
	 * @param c
	 * @param typeEnv
	 */
	protected void dumpClassBody(PrintStream out, Class<?> c,
			Map<TypeVariable<?>, Type> typeEnv) {
		boolean isEnum = c.isEnum();
		boolean isItf = Modifier.isInterface(c.getModifiers());
		String classname = shorten(c.getName());
		Field [] fields = c.getDeclaredFields();
		if (isEnum) dumpEnums(out,fields,c);
		Class <?> [] classes = c.getDeclaredClasses();
		dumpClasses(out,classes);
		dumpFields(out,fields);
		Constructor <?> [] constructors = c.getDeclaredConstructors();
		dumpConstructors(out, constructors, classname, typeEnv, 
						 c.getEnclosingClass());
		resetSeen();
		Method [] methods = c.getDeclaredMethods();
		dumpMethods(out,methods, c, isEnum, isItf, typeEnv);
		dumpMethods(out, filterMethodsHidden(c, c.getMethods()), c, isEnum, isItf, typeEnv);
	}


	protected Map<TypeVariable<?>, Type> buildEnvType(Type superClassType) {
		if (superClassType instanceof ParameterizedType) {
			Map<TypeVariable<?>, Type> typeEnv = new HashMap<TypeVariable<?>, Type>();
			buildEnvType(typeEnv, (ParameterizedType) superClassType);
			return typeEnv;
		} else return null;
	}

	/**
	 * Output all the subclasses of a class
	 * @param out output stream
	 * @param classes the array of subclasses
	 */
	private void dumpClasses(PrintStream out, Class<?>[] classes) {
		if (classes.length > 0) {
			indent(out);
			out.println("// Classes\n");
			for(Class<?> clazz: classes) dumpClass(out, clazz);
		}
	}

	/**
	 * Output all the methods of a class. Get rids of special enum methods.
	 * Output a body only if existing.
	 * @param out output stream
	 * @param methods the array of methods
	 * @param c current class
	 * @param isEnum is it an enum class ?
	 * @param isItf is it an interface
	 * @param typeEnv type environment.
	 */
	private void dumpMethods(PrintStream out, Method[] methods, Class <?> c, boolean isEnum, boolean isItf, Map<TypeVariable<?>, Type> typeEnv) {
		if (methods.length > 0) {
			indent(out);
			out.println("// Methods\n");
			Method meth1 = null, meth2 = null;
			if (isEnum) {
				try {
					meth1 = c.getMethod("values");
					meth2 = c.getMethod("valueOf", java.lang.String.class);
				} catch (NoSuchMethodException e) {
					System.err.println("Enum: cannot isolate specific methods (not accessible).");
				}
			}
			for(Method meth: methods) {
				if (isEnum && (meth.equals(meth1) || meth.equals(meth2))) continue;
				if (useInvisibleType(meth.getParameterTypes(), meth.getReturnType())) continue;
				if (meth.isSynthetic() && meth.isBridge()) continue; // WARNING MAY BE meth.isBridge() || meth.isSynthetic
				if (seen(meth)) continue;
				dumpMethod(out,meth,isItf, false, typeEnv);
			}
		}
	}

	private boolean seen(Method meth) {
		String signature = meth.getName() + Arrays.toString(meth.getParameterTypes());
		if (seenMethods.contains(signature)) return true;
		seenMethods.add(signature);
		return false;
	}

	private void resetSeen() {
		seenMethods = new HashSet<String>();
	}
	
	private boolean useInvisibleType(Class<?>[] parameterTypes,	Class<?> returnType) {
		for(Class<?> typ : parameterTypes) { if (isInvisible(typ)) return true;	}
		return returnType != null && isInvisible(returnType);
	}

	/**
	 * Test if the element is visible (public or protected).
	 * @param mod
	 * @return
	 */
	private boolean isAccessible(int mod) {
		return (privateAccess || Modifier.isPublic(mod) || Modifier.isProtected(mod));
	}

	/**
	 * Check if this type contains components that should not be visible. 
	 * @param typ
	 * @return
	 */
	private boolean isInvisible(Class<?> typ) {
		if (typ.isArray()) return isInvisible(typ.getComponentType());
		int mod = typ.getModifiers();
		Class <?> enc;
		
		return !isAccessible(mod) || ((enc = typ.getEnclosingClass()) != null && isInvisible(enc));
		// return Modifier.isPrivate(mod);
	}
	

	/**
	 * Check if this type contains components that should not be visible. 
	 * @param typ
	 * @return
	 */
	private boolean isInvisible(Type typ) {
		if (typ instanceof GenericArrayType) 
			return isInvisible(((GenericArrayType) typ).getGenericComponentType());
		if (typ instanceof ParameterizedType) 
			return isInvisible (((ParameterizedType) typ).getRawType()) || isInvisible(((ParameterizedType) typ).getOwnerType());
		if (typ instanceof Class<?>) 
			return isInvisible((Class <?>) typ);
		return false;
	}

	/**
	 * List of method that have an invisible type.
	 * @param c 
	 * @param methods
	 * @return
	 */
	private Method [] filterMethodsHidden(Class<?> c, Method [] methods) {
		List <Method> result = new ArrayList<Method>();
		for (Method method: methods) {
			Class <?> declaring = method.getDeclaringClass();
			if (declaring != c && isInvisible(declaring)) {
				result.add(method);
			}
		}
		return result.toArray(methodAW);
	}
	
	/**
	 * Output all the constructors of the class
	 * @param out output stream
	 * @param constructors list of constructors;
	 * @param classname classname
	 * @param typeEnv type environment of the current class
	 * @param enclosing the class containing the current class if any (nested class compilation)
	 */
	private void dumpConstructors(PrintStream out, Constructor<?>[] constructors, String classname, Map<TypeVariable<?>, Type> typeEnv, Class<?> enclosing) {
		if (constructors.length > 0) {
			indent(out);
			out.println("// Constructors\n");
			for(Constructor<?> co: constructors) {
				if (useInvisibleType(co.getParameterTypes(), null)) continue;
				dumpConstructor(out,classname, co, typeEnv, enclosing);
			}
		}		
	}

	/**
	 * Output all the fields of a class
	 * @param out output stream
	 * @param fields array of fields
	 */
	private void dumpFields(PrintStream out, Field[] fields) {
		if (fields.length > 0) {
			indent(out);
			out.println("// Fields\n");
			for(Field field: fields) {
				if (isInvisible(field.getType())) continue;
				dumpField(out,field, true);
			}
		}
	}

	/**
	 * Output all the enum values of a class.
	 * @param out output stream
	 * @param fields array of all fields (select the right one)
	 * @param enumTyp the current class (an enum).
	 */
	private void dumpEnums(PrintStream out, Field[] fields, Class <?> enumTyp) {
		Type [] argTyps = null;
		try {
			enumTyp.getConstructor();
		} catch (Exception e1) {
			Constructor<?> [] constructors = enumTyp.getDeclaredConstructors();
			if (constructors.length > 0) argTyps = constructors[0].getGenericParameterTypes();
		}
		boolean first = true;
		indent(out);
		out.println("// Enum Constants\n");
		indent(out);
		for(Field field: fields) {	
			if(!field.isEnumConstant()) continue;
			if (first) first = false;
			else out.print(", ");
			try {
				out.print(field.get(null));
			} catch (Exception e) {
				out.print(field.getName());
			} 
			if (argTyps != null) {
			out.print("(");
			boolean first2 = true;
			int i = 0;
			for(Type typ2: argTyps) {
				if(isAddedParam(typ2, i++, null)) continue;
				if (first2) first2 = false;
				else out.print(", ");
				dumpDefaultValue(out, typ2, null);
			}
			out.println(")");
			}
		}
		out.println(";");
	}

	/**
	 * From a parameterized types, extracts the bindings between type parameters
	 * and actual type value and store them in the environment type.
	 * @param typeEnv the environment type completed
	 * @param type the type analyzed.
	 */
	protected void buildEnvType(Map<TypeVariable<?>, Type> typeEnv,
			ParameterizedType type) {
		Type [] argTyps = type.getActualTypeArguments();
		TypeVariable<?> [] tvars = ((Class <?>) type.getRawType()).getTypeParameters();
		int l = argTyps.length;
		if (tvars.length != l) throw new RuntimeException("buildEnvTYpe");
		for(int i = 0; i < l; i++) {
			typeEnv.put(tvars[i], argTyps[i]);
		}
	}

	/**
	 * Dumps an empty constructor on the stream. Takes care of super calls.
	 * @param out printstream
	 * @param classname name of the class / constructor
	 * @param co reflexive representation of the constructor
	 * @param typeEnv type environment of the containing class
	 * @param enclosing if non null the class containing the current class.
	 */
	private void dumpConstructor(PrintStream out, String classname,	Constructor<?> co, Map<TypeVariable<?>, Type> typeEnv, Class<?> enclosing) {
		if (co.isSynthetic()) return;
		int mod = co.getModifiers();
		Type [] params = co.getGenericParameterTypes();

		Annotation [] annotations = 
			optAnnotations == null ? co.getDeclaredAnnotations() : optAnnotations.getDeclaredAnnotations(co);
		dumpAnnotationList(out,annotations);
		if (database != null) {
			dumpMissingAnnotation(out, database.missingVersionsOf(co));
		}
		indent(out);
		out.print(modifier(mod));
		this.typeParameters(out, co.getTypeParameters());
		out.print(classname.substring(classname.lastIndexOf('.') + 1));
		out.print("(");

		Annotation [][] paramAnnotations = 
			optAnnotations == null ? co.getParameterAnnotations() : optAnnotations.getParameterAnnotations(co);
		int count = 0;
		for(int i=0; i < params.length; i++) {
			Type param = params[i];
			if(!Modifier.isStatic(co.getDeclaringClass().getModifiers()) && isAddedParam(param, count, enclosing)) continue;
			if(count > 0) out.print(", ");
			for(Annotation annot : paramAnnotations[i]) {
				dumpAnnotation(out, annot);
				out.print(" ");
			}	
			type(out, param);
			out.print(" arg");
			out.print(++count);
		}
		out.print(")");
		Type [] excs = filterListTypes(co.getGenericExceptionTypes());
		if (excs.length > 0) {
			out.print(" throws ");
			dumpListType(out, excs, true);
		}
		out.println("{");
		beginIndent();
		dumpConstructorBody(out,co, typeEnv);
		endIndent();
		indent(out);
		out.println("}");
	}

	private void dumpMissingAnnotation(PrintStream out, List<String> missing) {
		if (missing.size() > 0) {
			indent(out);
			out.print("@Missing({");
			boolean first = true;
			for(String version : missing) {
				if (first) first = false;
				else out.print(", ");
				out.print('"');
				out.print(version);
				out.print('"');
			}
			out.println("})");
		}
		
	}

	/**
	 * This dumps out the body of a constructor. It contains the call to super
	 * at least.
	 * @param out output stream
	 * @param constructor reflexive representation of the constructor
	 * @param typeEnv type environment of the current class
	 */
	protected void dumpConstructorBody(PrintStream out,Constructor<?> constructor, Map<TypeVariable<?>, Type> typeEnv) {
		Class<?> superclass = constructor.getDeclaringClass();
		do {
			superclass = superclass.getSuperclass();
		} while (isInvisible(superclass));
		Class<?> [] exceptions = constructor.getExceptionTypes();
		if (superclass == OBJECT_CLASS) return;
		if (superclass == ENUM_CLASS) return;

		Constructor<?> [] constructors = superclass.getDeclaredConstructors();
		Constructor <?> co = selectCompatibleWithExceptions(constructors, exceptions);
		if (co == null) {
			System.err.println("No constructor in super " + superclass + " compatible with " + Arrays.toString(exceptions));
			return;
		}
		// Take one at random (the first).
		Class <?> embed = superclass.getEnclosingClass();

		Type [] argTyps = co.getGenericParameterTypes();
		indent(out);
		out.print("super(");
		boolean first = true;
		int i = 0;
		for(Type typ: argTyps) {
			if(!Modifier.isStatic(superclass.getModifiers()) && isAddedParam(typ, i++, embed)) continue;
			if (first) first = false;
			else out.print(", ");
			dumpDefaultValue(out, typ, typeEnv);
		}
		out.println(");");
	}

	/**
	 * This method decides if a parameter of a constructor is in fact added for the
	 * compilation of nested classes. This is kind of hacky but the compilation
	 * of nested classes whose effect we must undo is a hack.
	 * @param typ the type of the parameter
	 * @param i its position
	 * @param enclosing the enclosing class
	 * @return
	 */
	private boolean isAddedParam(Type typ, int i, Class<?> enclosing) {
		if (enclosing == null) return false;
		if (typ instanceof ParameterizedType)
			typ = ((ParameterizedType) typ).getRawType();
		if (typ instanceof Class<?>) {
			Class <?> c = (Class <?>) typ;
			return (enclosing.equals(c) && i == 0) || c.isAnonymousClass(); 
		} else return false;
	}

	/**
	 * Finds a contructor with a given visibility scope such that it is compatible with
	 * a set of exceptions it is allowed to raise (the one raised in the constructor that 
	 * contains the call to super).
	 * @param constructors the set of super constructors
	 * @param authorizedExceptions the exceptions that can be raised by the call to super
	 * @param mode mode telling what should be considered in  the constructor list.
	 * It is necessary for nested class that can access private of their enclosing
	 * class.
	 * @return
	 */
	private Constructor<?> selectCompatibleWithExceptions(Constructor<?> [] constructors, Class <?>[] authorizedExceptions) {
		for(int mode = PUBLIC; mode <= PRIVATE; mode ++) {
			level1:
				for(Constructor <?> co : constructors) {
					int mod = co.getModifiers();
					if (co.isSynthetic() || (mode != PRIVATE && Modifier.isPrivate(mod))  || (mode == PUBLIC && (!Modifier.isPublic(mod) && !Modifier.isProtected(mod)))) continue;
					// if (!isAccessible(co.getModifiers())) continue;
					Class<?> [] exceptions = co.getExceptionTypes();
					level2: 
						for(Class <?> exception : exceptions) {
							for (Class <?> catcher : authorizedExceptions) {
								if (catcher.isAssignableFrom(exception)) {
									continue level2;
								}
							}
							continue level1;
						}
					return co;
				}
		}
		return null;
	}

	/**
	 * Dumps a method definition. Works for abstract or actual methods.
	 * @param out output stream
	 * @param meth method to dump
	 * @param isItf tell if it is in an interface.
	 */
	protected void dumpMethod(PrintStream out, Method meth, boolean isItf, boolean isNotAbstract, Map<TypeVariable<?>, Type> typeEnv) {
		int mod = meth.getModifiers();
		if (!isAccessible(mod)) return;

		Annotation [] annotations = 
			optAnnotations == null ? meth.getDeclaredAnnotations() : optAnnotations.getDeclaredAnnotations(meth);
		Annotation [] [] paramAnnotations = 
			optAnnotations == null ? meth.getParameterAnnotations() : optAnnotations.getParameterAnnotations(meth);
		dumpAnnotationList(out,annotations);
		if (database != null) {
			dumpMissingAnnotation(out, database.missingVersionsOf(meth));
		}		
		indent(out);
		out.print(modifier((isNotAbstract || isItf) ? (mod & ~Modifier.ABSTRACT) : mod));
		
		typeParameters(out, meth.getTypeParameters());
		type(out, meth.getGenericReturnType(), true, typeEnv); 
		out.print(" ");
		out.print(meth.getName());
		out.print("(");
		Type [] params = meth.getGenericParameterTypes();
		
		int count = 0;
		for(Type param : params) {
			if(count > 0) out.print(", ");
			for(Annotation annot : paramAnnotations[count]) {
				dumpAnnotation(out, annot);
				out.print(" ");
			}	
			type(out, param,true, typeEnv);
			out.print(" arg");
			out.print(++count);
		}
		out.print(")");
		Type [] excs = meth.getGenericExceptionTypes();
		if (excs.length > 0) {
			out.print(" throws ");
			dumpListType(out, excs, true);
		}
		if ((Modifier.isAbstract(mod) && !isNotAbstract) || Modifier.isNative(mod)) {
			out.println(";");
		} else {
			out.println("{");
			beginIndent();
			dumpMethodBody(out, meth, typeEnv);
			endIndent();
			indent(out);
			out.println("}");
		}
	}


	/**
	 * Dump an annotation. works at any level.
	 * @param out output stream
	 * @param annot annotation to dump
	 */
	protected void dumpAnnotation(PrintStream out, Annotation annot) {
		out.print("@");
		Class<? extends Annotation> c = annot.annotationType();
		String annotName = 
			(rf.isStubAnnotation(annot)) ? c.getSimpleName() :shorten(c.getName());
		out.print(annotName);
		
		boolean first = true;
		Method [] methods = c.getDeclaredMethods();
		if (methods.length == 0) return;
		if (methods.length == 1 && methods[0].getName().equals("value")) {
			String value;
			try {
				value = simpleValue(methods[0].invoke(annot),true);
			} catch (Throwable e) {
				value = "null";
			}
			if (annotName.equals("ClassDone") && value.equals("0")) return;
			out.print("(" + value + ")");
		} else {
			out.print("(");
			for(Method method : c.getDeclaredMethods()) {
				String fieldName = method.getName();
				String value;
				try {
					value = simpleValue(method.invoke(annot),true);
				} catch (Throwable e) {
					value = "null";
				}
				if ((annotName.equals("ArgsRule") || annotName.equals("FieldRule")) && fieldName.equals("report") && value.equals("\"-\"")) return;
				if (first) first = false;
				else out.print(", ");
				out.print(fieldName);
				out.print(" = ");
				out.print(value);
			}
			out.print(")");
		}
		
	}
	
	protected void dumpAnnotationList(PrintStream out, Annotation[] annotations) {
		for(Annotation annot : annotations) {
			indent(out);
			dumpAnnotation(out, annot);
			out.println();
		}
	}
	
	/**
	 * Dumps a field on the out stream be it static or instance. If it is an
	 * enum constant or a synthetic field, does nothing.
	 * @param out output stream
	 * @param field field to dump
	 * @param hasValue should it define a default value.
	 */
	protected void dumpField(PrintStream out, Field field, boolean hasValue) {
		int mod = field.getModifiers();
		if (!isAccessible(mod)) return;
		if (field.isEnumConstant() || field.isSynthetic()) return;
		Annotation [] annotations =
			optAnnotations == null ? field.getDeclaredAnnotations() : optAnnotations.getDeclaredAnnotations(field);
		dumpAnnotationList(out, annotations);
		if (database != null) {
			dumpMissingAnnotation(out, database.missingVersionsOf(field));
		}
		indent(out);
		
		out.print(modifier(mod));
		type(out, field.getGenericType());
		out.print(" ");
		out.print(field.getName());
		if (hasValue) dumpFieldValue(out,field);
		out.println(";");
		out.println();
	}
	
	/**
	 * Generates a value for a field if necessary.
	 * @param out
	 * @param field
	 */
	protected void dumpFieldValue(PrintStream out, Field field) {
		int mod = field.getModifiers();
		if (Modifier.isFinal(mod)) {
			out.print(" = ");
			if (Modifier.isStatic(mod))	dumpValue(out,field);
			else dumpDefaultValue(out, field.getGenericType(), null);
		}
	}

	/**
	 * Dumps the result of a method. Relies on the default value.
	 * @param out output stream
	 * @param returnType type of the result for which a return is done.
	 */
	protected void dumpMethodBody(PrintStream out, Method meth, Map<TypeVariable<?>, Type> typeEnv) {
		Type returnType = meth.getGenericReturnType();
		String typeName = returnType.toString();
		if(typeName.equals("void")) return;
		indent(out);
		out.print("return ");
		dumpDefaultValue(out,returnType, null);
		out.println(";");
	}
	

	/**
	 * Dumps a default value for a given type. As it can be done with types from the super class, we need
	 * to resolve the parameters given to this type, so the type environment.
	 * @param out output stream
	 * @param type type of the default value
	 * @param typeEnv type environment of the current class to interpret the type
	 * variables.
	 */
	protected void dumpDefaultValue(PrintStream out, Type type, Map<TypeVariable<?>, Type> typeEnv) {
		if(type.equals(boolean.class)) out.print("false");
		else if (type.equals(byte.class)) out.print("(byte) 0");
		else if (type.equals(char.class)) out.print("'\\u0000'");
		else if (type.equals(short.class)) out.print("(short) 0");
		else if (type.equals(int.class)) out.print("0");
		else if (type.equals(long.class)) out.print("0l");
		else if (type.equals(float.class)) out.print("0.0f");
		else if (type.equals(double.class)) out.print("0.0d");
		else {
			if (type instanceof TypeVariable<?> && typeEnv == null)
				out.print("null");
			else {
				out.print("(");
				type(out, type, false, typeEnv);
				out.print(") null");
			}
		}
	}

	/**
	 * Builds the string representing a simple value after escaping its contents if
	 * necessary. Limited for annotations. 
	 * We need to restore the strings correctly ! They may have been butchered by the classloader.
	 * @param obj a value in one of the limited annotation types.
	 * @return a string corresponding.
	 */
	private String simpleValue(Object obj, boolean isTop) {
		if (obj instanceof String) return "\"" + StringUtil.escape(rf.restoreString((String)  obj)) + "\"";
		if (obj instanceof Character) return "'" + StringUtil.escape(((Character) obj).toString()) + "'";
		if (obj instanceof Annotation) {
			ByteArrayOutputStream bs = new ByteArrayOutputStream();
			PrintStream out2 = new PrintStream(bs);
			dumpAnnotation(out2, (Annotation) obj);
			out2.close();
			return bs.toString();
		}
		if (obj.getClass().isArray()) {
			if (obj instanceof int []) {
				int [] vals = (int []) obj;
				if (isTop && vals.length == 1) {
					return String.valueOf(vals[0]);
				}
				StringBuilder b = new StringBuilder();
				boolean first = true;
				b.append("{");
				for(int i=0; i < vals.length; i++) {
					if (first) first = false;
					else b.append(", ");
					b.append(vals[i]);
				}
				b.append("}");
				return b.toString();
			} else {
				if (isTop && ((Object []) obj).length == 1) 
					return simpleValue(((Object []) obj)[0], false);
				Object [] array = (Object []) obj;
				StringBuilder b = new StringBuilder();
				boolean first = true;
				b.append("{");
				for(int i=0; i < array.length; i++) {
					if (first) first = false;
					else b.append(", ");
					b.append(simpleValue(array[i], false));
				}
				b.append("}");
				return b.toString();
			}
		}
		if(obj instanceof Enum<?>) {
			Class <?> c = obj.getClass();
			return shorten(c.getName()) + "." + obj;
		}
		if(obj instanceof Class<?>) {
			return shorten(((Class <?>) obj).getName()) + ".class";
		}
		return obj.toString();
	}

	/**
	 * If available, dumps the static value of a final field.
	 * @param out output stream
	 * @param field the field for which we seek a static value.
	 */
	protected void dumpValue(PrintStream out, Field field) {
		try {
			Class<?> typ = field.getType();
			if (typ.equals(int.class)) {
				out.print(field.getInt(null));
			} else if (typ.equals(char.class)) {
				char v = field.getChar(null);
				out.print("'" + StringUtil.escape(String.valueOf(v)) + "'");
			} else if (typ.equals(byte.class)) {
				out.print(field.getByte(null));
			} else if (typ.equals(boolean.class)) {
				out.print(field.getBoolean(null));
			} else if (typ.equals(short.class)) {
				out.print(field.getShort(null));
			} else if (typ.equals(float.class)) {
				out.print(StringUtil.escapeFloat(field.getFloat(null)));
			} else if (typ.equals(double.class)) {
				out.print(StringUtil.escapeDouble(field.getDouble(null)));
			} else if (typ.equals(long.class)) {
				out.print(field.getLong(null) + "l");
			} else if (typ.equals(java.lang.String.class)) {
				String v = (String) field.get(null);
				if (v != null) out.print("\"" + StringUtil.escape(rf.restoreString(v)) + "\"");
				else out.print("null");
			} else dumpValueAnyClass(out, typ);
		} catch (Throwable e) {
			dumpDefaultValue(out, field.getType(), null);
		}
	}
	
	/**
	 * The value of a field of a class not declared. This is null in the first phase but we
	 * must provide a better value in the second case.
	 * @param out
	 * @param typ
	 */
	protected void dumpValueAnyClass(PrintStream out, Type typ) {
		out.print( "null");
	}
	/**
	 * Computes the modifier prefix in Java syntax.
	 * @param i modifier bitfield in Java format
	 * @return a string in Java syntax.
	 */
	protected static String modifier(int i) {
		StringBuilder b = new StringBuilder();
		if(Modifier.isPrivate(i)) b.append("private ");
		if(Modifier.isProtected(i)) b.append("protected ");
		if(Modifier.isPublic(i)) b.append("public ");
		if(Modifier.isAbstract(i)) b.append("abstract ");
		if(Modifier.isStatic(i)) b.append("static ");
		if(Modifier.isFinal(i)) b.append("final ");
		if(Modifier.isSynchronized(i)) b.append("synchronized ");
		if(Modifier.isNative(i)) b.append("native ");
		return b.toString();
	}

	/**
	 * This method registers known class to handle. The purpose is to make sure that super
	 * class of visible classes even if they are themselves invisible will be added to 
	 * the output.
	 * @param c the class to register.
	 */
	public void register(Class <?> c) {
		try {
			if (c.isAnonymousClass() || isInvisible(c)) return;
		} catch (Throwable e) { return; }
		Class <?> superClass = c.getSuperclass();
		while(superClass != null && isInvisible(superClass)) {
			neededClasses.add(superClass);
			superClass = superClass.getSuperclass();
		}
	}

	/**
	 * Debug message giving the number of nested classes.
	 */
	public void dumpRegistered() {
		System.err.println("==============");
		System.err.println("Needed Classes");
		System.err.println("==============");
		for(Class<?> c : neededClasses) { System.err.println(rf.restoreString(c.getCanonicalName())); }
		System.err.println("==============");
	}
}
