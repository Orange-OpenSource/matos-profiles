package com.google.common.collect;

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


public final class ObjectArrays
{
  // Constructors

  private ObjectArrays(){
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.Code({"T[] array = (T[]) java.lang.reflect.Array.newInstance(arg1, 1);", "return array;"})
  public static <T>T [] newArray(java.lang.Class<T> arg1, int arg2){
    return (T []) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code({"T[] array = (T[]) java.lang.reflect.Array.newInstance(arg1[0].getClass(), 1);", "return array;"})
  public static <T>T [] newArray(T [] arg1, int arg2){
    return (T []) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code({"T[] array = (T[]) java.lang.reflect.Array.newInstance(arg3, 2);", "array[0] = arg1[0];", "array[0] = arg2[0];", "return array;"})
  public static <T>T [] concat(T [] arg1, T [] arg2, java.lang.Class<T> arg3){
    return (T []) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code({"T[] array = (T[]) java.lang.reflect.Array.newInstance(arg1.getClass(), 2);", "array[0] = arg1;", "array[1] = arg2[0];", "return array;"})
  public static <T>T [] concat(@javax.annotation.Nullable T arg1, T [] arg2){
    return (T []) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code({"T[] array = (T[]) java.lang.reflect.Array.newInstance(arg2.getClass(), 2);", "array[0] = arg2;", "array[1] = arg1[0];", "return array;"})
  public static <T>T [] concat(T [] arg1, @javax.annotation.Nullable T arg2){
    return (T []) null;
  }
}
