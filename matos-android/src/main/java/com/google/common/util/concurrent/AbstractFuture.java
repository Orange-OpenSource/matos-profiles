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


public abstract class AbstractFuture<V>
  implements java.util.concurrent.Future<V>
{
  // Constructors

  public AbstractFuture(){
  }
  // Methods

  public V get(long arg1, java.util.concurrent.TimeUnit arg2) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException, java.util.concurrent.ExecutionException{
    return null;
  }
  public V get() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException{
    return null;
  }
  protected boolean set(V arg1){
    return false;
  }
  protected void done(){
  }
  public boolean cancel(boolean arg1){
    return false;
  }
  protected final boolean cancel(){
    return false;
  }
  public boolean isDone(){
    return false;
  }
  public boolean isCancelled(){
    return false;
  }
  protected boolean setException(java.lang.Throwable arg1){
    return false;
  }
}
