package com.android.internal.util;

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
public class TypedProperties
  extends java.util.HashMap<java.lang.String, java.lang.Object>{
  // Classes

  public static class ParseException
    extends java.lang.IllegalArgumentException  {
    // Constructors

    ParseException(java.io.StreamTokenizer arg1, java.lang.String arg2){
      super();
    }
  }
  public static class TypeException
    extends java.lang.IllegalArgumentException  {
    // Constructors

    TypeException(java.lang.String arg1, java.lang.Object arg2, java.lang.String arg3){
      super();
    }
  }
  // Fields

  public static final int STRING_TYPE_MISMATCH = -2;

  public static final int STRING_NOT_SET = -1;

  public static final int STRING_NULL = 0;

  public static final int STRING_SET = 1;

  // Constructors

  public TypedProperties(){
    super();
  }
  // Methods

  public java.lang.Object get(java.lang.Object arg1){
    return (java.lang.Object) null;
  }
  public boolean getBoolean(java.lang.String arg1, boolean arg2){
    return false;
  }
  public boolean getBoolean(java.lang.String arg1){
    return false;
  }
  public byte getByte(java.lang.String arg1, byte arg2){
    return (byte) 0;
  }
  public byte getByte(java.lang.String arg1){
    return (byte) 0;
  }
  public short getShort(java.lang.String arg1, short arg2){
    return (short) 0;
  }
  public short getShort(java.lang.String arg1){
    return (short) 0;
  }
  public int getInt(java.lang.String arg1, int arg2){
    return 0;
  }
  public int getInt(java.lang.String arg1){
    return 0;
  }
  public long getLong(java.lang.String arg1, long arg2){
    return 0l;
  }
  public long getLong(java.lang.String arg1){
    return 0l;
  }
  public float getFloat(java.lang.String arg1, float arg2){
    return 0.0f;
  }
  public float getFloat(java.lang.String arg1){
    return 0.0f;
  }
  public double getDouble(java.lang.String arg1, double arg2){
    return 0.0d;
  }
  public double getDouble(java.lang.String arg1){
    return 0.0d;
  }
  public void load(java.io.Reader arg1) throws java.io.IOException{
  }
  public java.lang.String getString(java.lang.String arg1, java.lang.String arg2){
    return (java.lang.String) null;
  }
  public java.lang.String getString(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public int getStringInfo(java.lang.String arg1){
    return 0;
  }
}
