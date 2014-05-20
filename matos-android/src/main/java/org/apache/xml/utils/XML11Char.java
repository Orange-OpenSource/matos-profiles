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


public class XML11Char
{
  // Fields

  public static final int MASK_XML11_VALID = 1;

  public static final int MASK_XML11_SPACE = 2;

  public static final int MASK_XML11_NAME_START = 4;

  public static final int MASK_XML11_NAME = 8;

  public static final int MASK_XML11_CONTROL = 16;

  public static final int MASK_XML11_CONTENT = 32;

  public static final int MASK_XML11_NCNAME_START = 64;

  public static final int MASK_XML11_NCNAME = 128;

  public static final int MASK_XML11_CONTENT_INTERNAL = 48;

  // Constructors

  public XML11Char(){
  }
  // Methods

  public static boolean isXML11ValidNmtoken(java.lang.String arg1){
    return false;
  }
  public static boolean isXML11ValidNCName(java.lang.String arg1){
    return false;
  }
  public static boolean isXML11Space(int arg1){
    return false;
  }
  public static boolean isXML11Valid(int arg1){
    return false;
  }
  public static boolean isXML11Invalid(int arg1){
    return false;
  }
  public static boolean isXML11ValidLiteral(int arg1){
    return false;
  }
  public static boolean isXML11Content(int arg1){
    return false;
  }
  public static boolean isXML11InternalEntityContent(int arg1){
    return false;
  }
  public static boolean isXML11NameStart(int arg1){
    return false;
  }
  public static boolean isXML11Name(int arg1){
    return false;
  }
  public static boolean isXML11NCNameStart(int arg1){
    return false;
  }
  public static boolean isXML11NCName(int arg1){
    return false;
  }
  public static boolean isXML11NameHighSurrogate(int arg1){
    return false;
  }
  public static boolean isXML11ValidName(java.lang.String arg1){
    return false;
  }
  public static boolean isXML11ValidQName(java.lang.String arg1){
    return false;
  }
}
