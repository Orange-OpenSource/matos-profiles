package com.google.common.base.internal;

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


public class Finalizer
  extends java.lang.Thread{
  // Constructors
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate") 
  private Finalizer(java.lang.Class<?> arg1, java.lang.Object arg2){
    super();
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate") 
  public void run(){
  }
  public static java.lang.ref.ReferenceQueue<java.lang.Object> startFinalizer(java.lang.Class<?> arg1, java.lang.Object arg2){
    return (java.lang.ref.ReferenceQueue) null;
  }
  public static java.lang.reflect.Field getInheritableThreadLocalsField(){
    return (java.lang.reflect.Field) null;
  }
}
