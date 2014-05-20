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


public final class Field
  extends AccessibleObject  implements Member
{
  // Fields

  public static final java.util.Comparator<Field> ORDER_BY_NAME_AND_DECLARING_CLASS = null;

  // Constructors

  Field(Field arg1){
    super();
  }
  private Field(java.lang.Class<?> arg1, java.lang.Class<?> arg2, java.lang.String arg3, int arg4){
    super();
  }
  // Methods

  public java.lang.Object get(java.lang.Object arg1) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException{
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
  public boolean getBoolean(java.lang.Object arg1) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException{
    return false;
  }
  public byte getByte(java.lang.Object arg1) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException{
    return (byte) 0;
  }
  public short getShort(java.lang.Object arg1) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException{
    return (short) 0;
  }
  public char getChar(java.lang.Object arg1) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException{
    return '\u0000';
  }
  public int getInt(java.lang.Object arg1) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException{
    return 0;
  }
  public long getLong(java.lang.Object arg1) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException{
    return 0l;
  }
  public float getFloat(java.lang.Object arg1) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException{
    return 0.0f;
  }
  public double getDouble(java.lang.Object arg1) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException{
    return 0.0d;
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
  public boolean isAnnotationPresent(java.lang.Class<? extends java.lang.annotation.Annotation> arg1){
    return false;
  }
  public boolean isSynthetic(){
    return false;
  }
  public Type getGenericType(){
    return (Type) null;
  }
  public java.lang.Class<?> getType(){
    return (java.lang.Class) null;
  }
  public boolean isEnumConstant(){
    return false;
  }
  public void set(java.lang.Object arg1, java.lang.Object arg2) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException{
  }
  public void setBoolean(java.lang.Object arg1, boolean arg2) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException{
  }
  public void setByte(java.lang.Object arg1, byte arg2) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException{
  }
  public void setChar(java.lang.Object arg1, char arg2) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException{
  }
  public void setDouble(java.lang.Object arg1, double arg2) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException{
  }
  public void setFloat(java.lang.Object arg1, float arg2) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException{
  }
  public void setInt(java.lang.Object arg1, int arg2) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException{
  }
  public void setLong(java.lang.Object arg1, long arg2) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException{
  }
  public void setShort(java.lang.Object arg1, short arg2) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException{
  }
  public java.lang.String toGenericString(){
    return (java.lang.String) null;
  }
}
