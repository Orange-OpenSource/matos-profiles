package com.google.android.mms.pdu;

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


public class EncodedStringValue
  implements java.lang.Cloneable
{
  // Constructors

  public EncodedStringValue(int arg1, byte [] arg2){
  }
  public EncodedStringValue(byte [] arg1){
  }
  public EncodedStringValue(java.lang.String arg1){
  }
  // Methods

  public java.lang.Object clone() throws java.lang.CloneNotSupportedException{
    return (java.lang.Object) null;
  }
  public static java.lang.String concat(EncodedStringValue [] arg1){
    return (java.lang.String) null;
  }
  public EncodedStringValue [] split(java.lang.String arg1){
    return (EncodedStringValue []) null;
  }
  public static EncodedStringValue copy(EncodedStringValue arg1){
    return (EncodedStringValue) null;
  }
  public java.lang.String getString(){
    return (java.lang.String) null;
  }
  public void setTextString(byte [] arg1){
  }
  public byte [] getTextString(){
    return (byte []) null;
  }
  public int getCharacterSet(){
    return 0;
  }
  public void setCharacterSet(int arg1){
  }
  public void appendTextString(byte [] arg1){
  }
  public static EncodedStringValue [] extract(java.lang.String arg1){
    return (EncodedStringValue []) null;
  }
  public static EncodedStringValue [] encodeStrings(java.lang.String [] arg1){
    return (EncodedStringValue []) null;
  }
}
