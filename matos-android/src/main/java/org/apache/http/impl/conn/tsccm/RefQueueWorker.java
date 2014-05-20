package org.apache.http.impl.conn.tsccm;

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


public class RefQueueWorker
  implements java.lang.Runnable
{
  // Fields

  protected final java.lang.ref.ReferenceQueue<?> refQueue = (java.lang.ref.ReferenceQueue) null;

  protected final RefQueueHandler refHandler = (RefQueueHandler) null;

  protected java.lang.Thread workerThread;

  // Constructors

  public RefQueueWorker(java.lang.ref.ReferenceQueue<?> arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("handle") RefQueueHandler arg2){
  }
  // Methods

  public void run(){
  }
  public void shutdown(){
  }
  public java.lang.String toString(){
    return (java.lang.String) null;
  }
}
