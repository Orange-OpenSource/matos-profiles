package org.apache.commons.codec.language;

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


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public class DoubleMetaphone
  implements org.apache.commons.codec.StringEncoder
{
  // Classes

  public class DoubleMetaphoneResult
  {
    // Fields

    // Constructors

    public DoubleMetaphoneResult(int arg1){
    }
    // Methods

    public void append(char arg1){
    }
    public void append(char arg1, char arg2){
    }
    public void append(java.lang.String arg1){
    }
    public void append(java.lang.String arg1, java.lang.String arg2){
    }
    public boolean isComplete(){
      return false;
    }
    public void appendPrimary(char arg1){
    }
    public void appendPrimary(java.lang.String arg1){
    }
    public void appendAlternate(char arg1){
    }
    public void appendAlternate(java.lang.String arg1){
    }
    public java.lang.String getPrimary(){
      return (java.lang.String) null;
    }
    public java.lang.String getAlternate(){
      return (java.lang.String) null;
    }
  }
  // Fields

  protected int maxCodeLen;

  // Constructors

  public DoubleMetaphone(){
  }
  // Methods

  protected char charAt(java.lang.String arg1, int arg2){
    return '\u0000';
  }
  protected static boolean contains(java.lang.String arg1, int arg2, int arg3, java.lang.String [] arg4){
    return false;
  }
  public java.lang.Object encode(java.lang.Object arg1) throws org.apache.commons.codec.EncoderException{
    return (java.lang.Object) null;
  }
  public java.lang.String encode(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public int getMaxCodeLen(){
    return 0;
  }
  public void setMaxCodeLen(int arg1){
  }
  public java.lang.String doubleMetaphone(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public java.lang.String doubleMetaphone(java.lang.String arg1, boolean arg2){
    return (java.lang.String) null;
  }
  public boolean isDoubleMetaphoneEqual(java.lang.String arg1, java.lang.String arg2){
    return false;
  }
  public boolean isDoubleMetaphoneEqual(java.lang.String arg1, java.lang.String arg2, boolean arg3){
    return false;
  }
}
