package com.google.common.util.concurrent;

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


@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.AbstractCheckedFutureImplem", superClass = "")
public abstract class AbstractCheckedFuture<V, E extends java.lang.Exception>
  implements CheckedFuture<V, E>
{
  // Fields

  protected final ListenableFuture<V> delegate = (ListenableFuture) null;

  // Constructors

  protected AbstractCheckedFuture(ListenableFuture<V> arg1){
  }
  // Methods

  public V get() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException{
    return null;
  }
  public V get(long arg1, java.util.concurrent.TimeUnit arg2) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException{
    return null;
  }
  public boolean cancel(boolean arg1){
    return false;
  }
  public boolean isDone(){
    return false;
  }
  public boolean isCancelled(){
    return false;
  }
  public void addListener(java.lang.Runnable arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("execute") java.util.concurrent.Executor arg2){
  }
  protected abstract E mapException(java.lang.Exception arg1);
  public V checkedGet() throws E{
    return null;
  }
  public V checkedGet(long arg1, java.util.concurrent.TimeUnit arg2) throws java.util.concurrent.TimeoutException, E{
    return null;
  }
}
