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


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public class WaitingThread
{
  // Constructors

  public WaitingThread(java.util.concurrent.locks.Condition arg1, RouteSpecificPool arg2){
  }
  // Methods

  public void interrupt(){
  }
  public final RouteSpecificPool getPool(){
    return (RouteSpecificPool) null;
  }
  public boolean await(java.util.Date arg1) throws java.lang.InterruptedException{
    return false;
  }
  public final java.lang.Thread getThread(){
    return (java.lang.Thread) null;
  }
  public void wakeup(){
  }
  public final java.util.concurrent.locks.Condition getCondition(){
    return (java.util.concurrent.locks.Condition) null;
  }
}
