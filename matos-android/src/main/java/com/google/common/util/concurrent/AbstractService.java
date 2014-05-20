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


public abstract class AbstractService
  implements com.google.common.base.Service
{
  // Constructors

  public AbstractService(){
  }
  // Methods

  public final java.util.concurrent.Future<com.google.common.base.Service.State> start(){
    return (java.util.concurrent.Future) null;
  }
  public final java.util.concurrent.Future<com.google.common.base.Service.State> stop(){
    return (java.util.concurrent.Future) null;
  }
  public final com.google.common.base.Service.State state(){
    return (com.google.common.base.Service.State) null;
  }
  public final boolean isRunning(){
    return false;
  }
  public com.google.common.base.Service.State startAndWait(){
    return (com.google.common.base.Service.State) null;
  }
  public com.google.common.base.Service.State stopAndWait(){
    return (com.google.common.base.Service.State) null;
  }
  protected abstract void doStart();
  protected abstract void doStop();
  protected final void notifyStarted(){
  }
  protected final void notifyStopped(){
  }
  protected final void notifyFailed(java.lang.Throwable arg1){
  }
}
