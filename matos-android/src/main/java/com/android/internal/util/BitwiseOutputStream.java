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


public class BitwiseOutputStream
{
  // Classes

  public static class AccessException
    extends java.lang.Exception  {
    // Constructors

    public AccessException(java.lang.String arg1){
      super();
    }
  }
  // Constructors

  public BitwiseOutputStream(int arg1){
  }
  // Methods

  public void write(int arg1, int arg2) throws BitwiseOutputStream.AccessException{
  }
  public byte [] toByteArray(){
    return (byte []) null;
  }
  public void skip(int arg1){
  }
  public void writeByteArray(int arg1, byte [] arg2) throws BitwiseOutputStream.AccessException{
  }
}
