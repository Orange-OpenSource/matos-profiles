package com.google.common.base;

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


public final class Throwables
{
  // Constructors

  private Throwables(){
  }
  // Methods

  public static java.lang.RuntimeException propagate(java.lang.Throwable arg1){
    return (java.lang.RuntimeException) null;
  }
  public static <X extends java.lang.Throwable>void propagateIfInstanceOf(java.lang.Throwable arg1, java.lang.Class<X> arg2) throws X{
  }
  public static void propagateIfPossible(java.lang.Throwable arg1){
  }
  public static <X extends java.lang.Throwable>void propagateIfPossible(java.lang.Throwable arg1, java.lang.Class<X> arg2) throws X{
  }
  public static <X1 extends java.lang.Throwable, X2 extends java.lang.Throwable>void propagateIfPossible(java.lang.Throwable arg1, java.lang.Class<X1> arg2, java.lang.Class<X2> arg3) throws X1, X2{
  }
  public static java.lang.Throwable getRootCause(java.lang.Throwable arg1){
    return (java.lang.Throwable) null;
  }
  public static java.util.List<java.lang.Throwable> getCausalChain(java.lang.Throwable arg1){
    return (java.util.List) null;
  }
  public static java.lang.String getStackTraceAsString(java.lang.Throwable arg1){
    return (java.lang.String) null;
  }
  public static java.lang.Exception throwCause(java.lang.Exception arg1, boolean arg2) throws java.lang.Exception{
    return (java.lang.Exception) null;
  }
}
