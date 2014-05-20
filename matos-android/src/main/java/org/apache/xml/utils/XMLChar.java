package org.apache.xml.utils;

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


public class XMLChar
{
  // Fields

  public static final int MASK_VALID = 1;

  public static final int MASK_SPACE = 2;

  public static final int MASK_NAME_START = 4;

  public static final int MASK_NAME = 8;

  public static final int MASK_PUBID = 16;

  public static final int MASK_CONTENT = 32;

  public static final int MASK_NCNAME_START = 64;

  public static final int MASK_NCNAME = 128;

  // Constructors

  public XMLChar(){
  }
  // Methods

  public static boolean isHighSurrogate(int arg1){
    return false;
  }
  public static boolean isLowSurrogate(int arg1){
    return false;
  }
  public static boolean isSpace(int arg1){
    return false;
  }
  public static boolean isValid(int arg1){
    return false;
  }
  public static boolean isValidName(java.lang.String arg1){
    return false;
  }
  public static int supplemental(char arg1, char arg2){
    return 0;
  }
  public static boolean isSupplemental(int arg1){
    return false;
  }
  public static char highSurrogate(int arg1){
    return '\u0000';
  }
  public static char lowSurrogate(int arg1){
    return '\u0000';
  }
  public static boolean isInvalid(int arg1){
    return false;
  }
  public static boolean isContent(int arg1){
    return false;
  }
  public static boolean isMarkup(int arg1){
    return false;
  }
  public static boolean isNameStart(int arg1){
    return false;
  }
  public static boolean isName(int arg1){
    return false;
  }
  public static boolean isNCNameStart(int arg1){
    return false;
  }
  public static boolean isNCName(int arg1){
    return false;
  }
  public static boolean isPubid(int arg1){
    return false;
  }
  public static boolean isValidNCName(java.lang.String arg1){
    return false;
  }
  public static boolean isValidNmtoken(java.lang.String arg1){
    return false;
  }
  public static boolean isValidIANAEncoding(java.lang.String arg1){
    return false;
  }
  public static boolean isValidJavaEncoding(java.lang.String arg1){
    return false;
  }
  public static boolean isValidQName(java.lang.String arg1){
    return false;
  }
}
