package java.lang;

/*
 * #%L
 * Matos
 * $Id:$
 * $HeadURL:$
 * %%
 * Copyright (C) 2010 - 2014 Orange SA
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

import java.io.InputStream;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.net.URL;
import java.security.ProtectionDomain;

public final class Class<T>
  implements Serializable, AnnotatedElement, GenericDeclaration, Type
{
  Class()
  {
    throw new RuntimeException("Stub!"); } 
  public static Class<?> forName(String className) throws ClassNotFoundException { throw new RuntimeException("Stub!"); } 
  public static Class<?> forName(String className, boolean initializeBoolean, ClassLoader classLoader) throws ClassNotFoundException { throw new RuntimeException("Stub!"); } 
  public Class[] getClasses() { throw new RuntimeException("Stub!"); } 
  public <A extends Annotation> A getAnnotation(Class<A> annotationClass) { throw new RuntimeException("Stub!"); } 
  public Annotation[] getAnnotations() { throw new RuntimeException("Stub!"); } 
  public String getCanonicalName() { throw new RuntimeException("Stub!"); } 
  public ClassLoader getClassLoader() { throw new RuntimeException("Stub!"); } 
  public native Class<?> getComponentType();

  public Constructor<T> getConstructor(Class[] parameterTypes) throws NoSuchMethodException, SecurityException { throw new RuntimeException("Stub!"); } 
  public Constructor[] getConstructors() throws SecurityException { throw new RuntimeException("Stub!"); } 
  public native Annotation[] getDeclaredAnnotations();

  public Class[] getDeclaredClasses() throws SecurityException { throw new RuntimeException("Stub!"); } 
  public Constructor<T> getDeclaredConstructor(Class[] parameterTypes) throws NoSuchMethodException, SecurityException { throw new RuntimeException("Stub!"); } 
  public Constructor[] getDeclaredConstructors() throws SecurityException { throw new RuntimeException("Stub!"); } 
  public Field getDeclaredField(String name) throws NoSuchFieldException, SecurityException { throw new RuntimeException("Stub!"); } 
  public Field[] getDeclaredFields() throws SecurityException { throw new RuntimeException("Stub!"); } 
  public Method getDeclaredMethod(String name, Class[] parameterTypes) throws NoSuchMethodException, SecurityException { throw new RuntimeException("Stub!"); } 
  public Method[] getDeclaredMethods() throws SecurityException { throw new RuntimeException("Stub!"); } 
  public native Class<?> getDeclaringClass();

  public native Class<?> getEnclosingClass();

  public native Constructor<?> getEnclosingConstructor();

  public native Method getEnclosingMethod();

  public T[] getEnumConstants() { throw new RuntimeException("Stub!"); } 
  public Field getField(String name) throws NoSuchFieldException, SecurityException { throw new RuntimeException("Stub!"); } 
  public Field[] getFields() throws SecurityException { throw new RuntimeException("Stub!"); } 
  public Type[] getGenericInterfaces() { throw new RuntimeException("Stub!"); } 
  public Type getGenericSuperclass() { throw new RuntimeException("Stub!"); } 
  public native Class[] getInterfaces();

  public Method getMethod(String name, Class[] parameterTypes) throws NoSuchMethodException, SecurityException { throw new RuntimeException("Stub!"); } 
  public Method[] getMethods() throws SecurityException { throw new RuntimeException("Stub!"); } 
  public int getModifiers() { throw new RuntimeException("Stub!"); } 
  public native String getName();

  public String getSimpleName() { throw new RuntimeException("Stub!"); } 
  public ProtectionDomain getProtectionDomain() { throw new RuntimeException("Stub!"); } 
  public URL getResource(String resName) { throw new RuntimeException("Stub!"); } 
  public InputStream getResourceAsStream(String resName) { throw new RuntimeException("Stub!"); } 
  public Object[] getSigners() { throw new RuntimeException("Stub!"); } 
  public native Class<? super T> getSuperclass();

  public synchronized TypeVariable<Class<T>>[] getTypeParameters() { throw new RuntimeException("Stub!"); } 
  public boolean isAnnotation() { throw new RuntimeException("Stub!"); } 
  public boolean isAnnotationPresent(Class<? extends Annotation> annotationClass) { throw new RuntimeException("Stub!"); } 
  public native boolean isAnonymousClass();

  public boolean isArray() { throw new RuntimeException("Stub!"); } 
  public native boolean isAssignableFrom(Class<?> paramClass);

  public boolean isEnum() { throw new RuntimeException("Stub!"); } 
  public native boolean isInstance(Object paramObject);

  public native boolean isInterface();

  public boolean isLocalClass() { throw new RuntimeException("Stub!"); } 
  public boolean isMemberClass() { throw new RuntimeException("Stub!"); } 
  public native boolean isPrimitive();

  public boolean isSynthetic() { throw new RuntimeException("Stub!"); } 
  public T newInstance() throws IllegalAccessException, InstantiationException { throw new RuntimeException("Stub!"); } 
  public String toString() { throw new RuntimeException("Stub!"); } 
  public Package getPackage() { throw new RuntimeException("Stub!"); } 
  public native boolean desiredAssertionStatus();

  public <U> Class<? extends U> asSubclass(Class<U> clazz) { throw new RuntimeException("Stub!"); } 
  public T cast(Object obj) { throw new RuntimeException("Stub!"); }

}