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


public class ArrayUtils
{
  // Constructors

  private ArrayUtils(){
  }
  // Methods

  public static boolean equals(byte [] arg1, byte [] arg2, int arg3){
    return false;
  }
  public static <T>boolean contains(T [] arg1, T arg2){
    return false;
  }
  public static boolean contains(int [] arg1, int arg2){
    return false;
  }
  public static int idealFloatArraySize(int arg1){
    return 0;
  }
  public static int idealCharArraySize(int arg1){
    return 0;
  }
  public static int idealByteArraySize(int arg1){
    return 0;
  }
  public static int idealBooleanArraySize(int arg1){
    return 0;
  }
  public static int idealShortArraySize(int arg1){
    return 0;
  }
  public static int idealIntArraySize(int arg1){
    return 0;
  }
  public static int idealObjectArraySize(int arg1){
    return 0;
  }
  public static int idealLongArraySize(int arg1){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return (T[]) java.lang.reflect.Array.newInstance(arg1.getClass().getComponentType(), 0);")
  public static <T>T [] emptyArray(java.lang.Class<T> arg1){
    return (T []) null;
  }
}
