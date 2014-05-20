package java.lang.reflect;

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


public final class Method
  extends AccessibleObject  implements Member, GenericDeclaration
{
  // Fields

  public static final java.util.Comparator<Method> ORDER_BY_SIGNATURE = null;

  // Constructors

  Method(Method arg1){
    super();
  }
  private Method(java.lang.Class<?> arg1, java.lang.Class<?> [] arg2, java.lang.Class<?> [] arg3, java.lang.Class<?> arg4, java.lang.String arg5, int arg6){
    super();
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Method.invoke", pos = 0, report = "-")
  public java.lang.Object invoke(java.lang.Object arg1, java.lang.Object [] arg2) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, InvocationTargetException{
    return (java.lang.Object) null;
  }
  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public int hashCode(){
    return 0;
  }
  public int getModifiers(){
    return 0;
  }
  public java.lang.String getName(){
    return (java.lang.String) null;
  }
  public <A extends java.lang.annotation.Annotation>A getAnnotation(java.lang.Class<A> arg1){
    return null;
  }
  public java.lang.annotation.Annotation [] getDeclaredAnnotations(){
    return (java.lang.annotation.Annotation []) null;
  }
  public java.lang.Class<?> getDeclaringClass(){
    return (java.lang.Class) null;
  }
  public java.lang.Class<?> [] getParameterTypes(){
    return (java.lang.Class []) null;
  }
  public java.lang.Class<?> getReturnType(){
    return (java.lang.Class) null;
  }
  public TypeVariable<Method> [] getTypeParameters(){
    return (TypeVariable []) null;
  }
  public boolean isAnnotationPresent(java.lang.Class<? extends java.lang.annotation.Annotation> arg1){
    return false;
  }
  public boolean isSynthetic(){
    return false;
  }
  public java.lang.String toGenericString(){
    return (java.lang.String) null;
  }
  public java.lang.Object getDefaultValue(){
    return (java.lang.Object) null;
  }
  public java.lang.Class<?> [] getExceptionTypes(){
    return (java.lang.Class []) null;
  }
  public Type [] getGenericExceptionTypes(){
    return (Type []) null;
  }
  public Type [] getGenericParameterTypes(){
    return (Type []) null;
  }
  public Type getGenericReturnType(){
    return (Type) null;
  }
  public java.lang.annotation.Annotation [] [] getParameterAnnotations(){
    return (java.lang.annotation.Annotation [] []) null;
  }
  public boolean isBridge(){
    return false;
  }
  public boolean isVarArgs(){
    return false;
  }
}
