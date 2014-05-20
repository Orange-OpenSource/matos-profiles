package gov.nist.core;

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


@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.GenericObjectListImplem", superClass = "")
public abstract class GenericObjectList
  extends java.util.LinkedList<GenericObject>  implements java.io.Serializable, java.lang.Cloneable
{
  // Fields

  protected static final java.lang.String SEMICOLON = (java.lang.String) null;

  protected static final java.lang.String COLON = (java.lang.String) null;

  protected static final java.lang.String COMMA = (java.lang.String) null;

  protected static final java.lang.String SLASH = (java.lang.String) null;

  protected static final java.lang.String SP = (java.lang.String) null;

  protected static final java.lang.String EQUALS = (java.lang.String) null;

  protected static final java.lang.String STAR = (java.lang.String) null;

  protected static final java.lang.String NEWLINE = (java.lang.String) null;

  protected static final java.lang.String RETURN = (java.lang.String) null;

  protected static final java.lang.String LESS_THAN = (java.lang.String) null;

  protected static final java.lang.String GREATER_THAN = (java.lang.String) null;

  protected static final java.lang.String AT = (java.lang.String) null;

  protected static final java.lang.String DOT = (java.lang.String) null;

  protected static final java.lang.String QUESTION = (java.lang.String) null;

  protected static final java.lang.String POUND = (java.lang.String) null;

  protected static final java.lang.String AND = (java.lang.String) null;

  protected static final java.lang.String LPAREN = (java.lang.String) null;

  protected static final java.lang.String RPAREN = (java.lang.String) null;

  protected static final java.lang.String DOUBLE_QUOTE = (java.lang.String) null;

  protected static final java.lang.String QUOTE = (java.lang.String) null;

  protected static final java.lang.String HT = (java.lang.String) null;

  protected static final java.lang.String PERCENT = (java.lang.String) null;

  protected int indentation;

  protected java.lang.String listName;

  protected java.lang.Class<?> myClass;

  protected java.lang.String separator;

  // Constructors

  protected GenericObjectList(){
    super();
  }
  protected GenericObjectList(java.lang.String arg1){
    super();
  }
  protected GenericObjectList(java.lang.String arg1, java.lang.String arg2){
    super();
  }
  protected GenericObjectList(java.lang.String arg1, java.lang.Class arg2){
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
  public java.lang.Object clone(){
    return (java.lang.Object) null;
  }
  public java.lang.String encode(){
    return (java.lang.String) null;
  }
  protected GenericObject next(java.util.ListIterator arg1){
    return (GenericObject) null;
  }
  protected GenericObject next(){
    return (GenericObject) null;
  }
  public boolean match(java.lang.Object arg1){
    return false;
  }
  protected GenericObject first(){
    return (GenericObject) null;
  }
  public java.lang.String debugDump(){
    return (java.lang.String) null;
  }
  public java.lang.String debugDump(int arg1){
    return (java.lang.String) null;
  }
  public static boolean isMySubclass(java.lang.Class<?> arg1){
    return false;
  }
  protected java.lang.String getIndentation(){
    return (java.lang.String) null;
  }
  public void addFirst(GenericObject arg1){
  }
  protected void concatenate(GenericObjectList arg1){
  }
  protected void concatenate(GenericObjectList arg1, boolean arg2){
  }
  public void setMyClass(java.lang.Class arg1){
  }
  public void setSeparator(java.lang.String arg1){
  }
  protected static boolean isCloneable(java.lang.Object arg1){
    return false;
  }
  public void mergeObjects(GenericObjectList arg1){
  }
}
