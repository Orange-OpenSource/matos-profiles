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


@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.GenericObjectImplem", superClass = "")
public abstract class GenericObject
  implements java.io.Serializable, java.lang.Cloneable
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

  protected static final java.util.Set<java.lang.Class<?>> immutableClasses = null;

  protected int indentation;

  protected java.lang.String stringRepresentation;

  protected Match matchExpression;

  // Constructors

  protected GenericObject(){
  }
  // Methods

  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public java.lang.Object clone(){
    return (java.lang.Object) null;
  }
  public abstract java.lang.String encode();
  public java.lang.StringBuffer encode(java.lang.StringBuffer arg1){
    return (java.lang.StringBuffer) null;
  }
  public boolean match(java.lang.Object arg1){
    return false;
  }
  public void merge(java.lang.Object arg1){
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
  public Match getMatcher(){
    return (Match) null;
  }
  protected void sprint(java.lang.String arg1){
  }
  protected void sprint(java.lang.Object arg1){
  }
  protected void sprint(int arg1){
  }
  protected void sprint(short arg1){
  }
  protected void sprint(char arg1){
  }
  protected void sprint(long arg1){
  }
  protected void sprint(boolean arg1){
  }
  protected void sprint(double arg1){
  }
  protected void sprint(float arg1){
  }
  public void setMatcher(Match arg1){
  }
  public static java.lang.Class<?> getClassFromName(java.lang.String arg1){
    return (java.lang.Class) null;
  }
  public static java.lang.Object makeClone(java.lang.Object arg1){
    return (java.lang.Object) null;
  }
  protected java.lang.String getIndentation(){
    return (java.lang.String) null;
  }
  protected void dbgPrint(){
  }
  protected void dbgPrint(java.lang.String arg1){
  }
}
