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


@com.francetelecom.rd.stubs.annotation.Field(type = "Class<T>", value = "clazz", modifier = 2)
public final class Constructor<T>
  extends AccessibleObject  implements Member, GenericDeclaration
{
  // Constructors

  private Constructor(){
    super();
  }
  private Constructor(@com.francetelecom.rd.stubs.annotation.FieldSet("clazz") java.lang.Class<T> arg1, java.lang.Class<?> [] arg2, java.lang.Class<?> [] arg3, int arg4){
    super();
  }
  // Methods

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
  @com.francetelecom.rd.stubs.annotation.FieldGet("clazz")
  public java.lang.Class<T> getDeclaringClass(){
    return (java.lang.Class) null;
  }
  public java.lang.Class<?> [] getParameterTypes(){
    return (java.lang.Class []) null;
  }
  public TypeVariable<Constructor<T>> [] getTypeParameters(){
    return (TypeVariable []) null;
  }
  public boolean isAnnotationPresent(java.lang.Class<? extends java.lang.annotation.Annotation> arg1){
    return false;
  }
  public boolean isSynthetic(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return clazz.newInstance();")
  public T newInstance(java.lang.Object [] arg1) throws java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.IllegalArgumentException, InvocationTargetException{
    return null;
  }
  public java.lang.String toGenericString(){
    return (java.lang.String) null;
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
  public java.lang.annotation.Annotation [] [] getParameterAnnotations(){
    return (java.lang.annotation.Annotation [] []) null;
  }
  public boolean isVarArgs(){
    return false;
  }
}
