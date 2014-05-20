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


public class LexerCore
  extends StringTokenizer{
  // Fields

  public static final int START = 2048;

  public static final int END = 4096;

  public static final int ID = 4095;

  public static final int SAFE = 4094;

  public static final int WHITESPACE = 4097;

  public static final int DIGIT = 4098;

  public static final int ALPHA = 4099;

  public static final int BACKSLASH = 92;

  public static final int QUOTE = 39;

  public static final int AT = 64;

  public static final int SP = 32;

  public static final int HT = 9;

  public static final int COLON = 58;

  public static final int STAR = 42;

  public static final int DOLLAR = 36;

  public static final int PLUS = 43;

  public static final int POUND = 35;

  public static final int MINUS = 45;

  public static final int DOUBLEQUOTE = 34;

  public static final int TILDE = 126;

  public static final int BACK_QUOTE = 96;

  public static final int NULL = 0;

  public static final int EQUALS = 61;

  public static final int SEMICOLON = 59;

  public static final int SLASH = 47;

  public static final int L_SQUARE_BRACKET = 91;

  public static final int R_SQUARE_BRACKET = 93;

  public static final int R_CURLY = 125;

  public static final int L_CURLY = 123;

  public static final int HAT = 94;

  public static final int BAR = 124;

  public static final int DOT = 46;

  public static final int EXCLAMATION = 33;

  public static final int LPAREN = 40;

  public static final int RPAREN = 41;

  public static final int GREATER_THAN = 62;

  public static final int LESS_THAN = 60;

  public static final int PERCENT = 37;

  public static final int QUESTION = 63;

  public static final int AND = 38;

  public static final int UNDERSCORE = 95;

  protected static final java.util.Hashtable globalSymbolTable = null;

  protected static final java.util.Hashtable lexerTables = null;

  protected java.util.Hashtable currentLexer;

  protected java.lang.String currentLexerName;

  protected Token currentMatch;

  // Constructors

  protected LexerCore(){
    super();
  }
  public LexerCore(java.lang.String arg1, java.lang.String arg2){
    super();
  }
  // Methods

  public java.lang.String number() throws java.text.ParseException{
    return (java.lang.String) null;
  }
  public Token match(int arg1) throws java.text.ParseException{
    return (Token) null;
  }
  public java.lang.String getString(char arg1) throws java.text.ParseException{
    return (java.lang.String) null;
  }
  public java.lang.String comment() throws java.text.ParseException{
    return (java.lang.String) null;
  }
  public java.text.ParseException createParseException(){
    return (java.text.ParseException) null;
  }
  public java.lang.String getBuffer(){
    return (java.lang.String) null;
  }
  public static final boolean isTokenChar(char arg1){
    return false;
  }
  public void selectLexer(java.lang.String arg1){
  }
  public void SPorHT(){
  }
  public boolean startsId(){
    return false;
  }
  public java.lang.String ttoken(){
    return (java.lang.String) null;
  }
  public Token getNextToken(){
    return (Token) null;
  }
  public int getPtr(){
    return 0;
  }
  public Token peekNextToken() throws java.text.ParseException{
    return (Token) null;
  }
  public Token [] peekNextToken(int arg1) throws java.text.ParseException{
    return (Token []) null;
  }
  public java.lang.String quotedString() throws java.text.ParseException{
    return (java.lang.String) null;
  }
  public java.lang.String getRest(){
    return (java.lang.String) null;
  }
  public java.lang.String getNextId(){
    return (java.lang.String) null;
  }
  public java.lang.String byteStringNoSemicolon(){
    return (java.lang.String) null;
  }
  public int markInputPosition(){
    return 0;
  }
  public void rewindInputPosition(int arg1){
  }
  public java.lang.String byteStringNoSlash(){
    return (java.lang.String) null;
  }
  public static java.lang.String charAsString(char arg1){
    return (java.lang.String) null;
  }
  public java.lang.String charAsString(int arg1){
    return (java.lang.String) null;
  }
  public void consumeValidChars(char [] arg1){
  }
  protected java.util.Hashtable addLexer(java.lang.String arg1){
    return (java.util.Hashtable) null;
  }
  protected void addKeyword(java.lang.String arg1, int arg2){
  }
  public java.lang.String lookupToken(int arg1){
    return (java.lang.String) null;
  }
  public java.lang.String peekNextId(){
    return (java.lang.String) null;
  }
  public boolean startsSafeToken(){
    return false;
  }
  public java.lang.String ttokenSafe(){
    return (java.lang.String) null;
  }
  public java.lang.String byteStringNoComma(){
    return (java.lang.String) null;
  }
}
