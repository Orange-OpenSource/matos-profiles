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


public class BitwiseInputStream
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

  public BitwiseInputStream(byte [] arg1){
  }
  // Methods

  public int read(int arg1) throws BitwiseInputStream.AccessException{
    return 0;
  }
  public int available(){
    return 0;
  }
  public void skip(int arg1) throws BitwiseInputStream.AccessException{
  }
  public byte [] readByteArray(int arg1) throws BitwiseInputStream.AccessException{
    return (byte []) null;
  }
}
