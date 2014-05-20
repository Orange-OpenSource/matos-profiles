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


public class StringTokenizer
{
  // Fields

  protected java.lang.String buffer;

  protected int bufferLen;

  protected int ptr;

  protected int savedPtr;

  // Constructors

  protected StringTokenizer(){
  }
  public StringTokenizer(java.lang.String arg1){
  }
  // Methods

  public static boolean isDigit(char arg1){
    return false;
  }
  public java.lang.String nextToken(){
    return (java.lang.String) null;
  }
  public static boolean isAlpha(char arg1){
    return false;
  }
  public static boolean isHexDigit(char arg1){
    return false;
  }
  public java.lang.String peekLine(){
    return (java.lang.String) null;
  }
  public java.lang.String getNextToken(char arg1) throws java.text.ParseException{
    return (java.lang.String) null;
  }
  public char lookAhead() throws java.text.ParseException{
    return '\u0000';
  }
  public char lookAhead(int arg1) throws java.text.ParseException{
    return '\u0000';
  }
  public boolean hasMoreChars(){
    return false;
  }
  public void consume(){
  }
  public void consume(int arg1){
  }
  public java.lang.String getLine(){
    return (java.lang.String) null;
  }
  public char getNextChar() throws java.text.ParseException{
    return '\u0000';
  }
  public static boolean isAlphaDigit(char arg1){
    return false;
  }
  public java.util.Vector<java.lang.String> getLines(){
    return (java.util.Vector) null;
  }
  public static java.lang.String getSDPFieldName(java.lang.String arg1){
    return (java.lang.String) null;
  }
}
