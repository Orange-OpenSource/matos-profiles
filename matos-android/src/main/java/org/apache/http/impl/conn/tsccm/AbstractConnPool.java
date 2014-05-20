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
public abstract class AbstractConnPool
  implements RefQueueHandler
{
  // Fields

  protected final java.util.concurrent.locks.Lock poolLock = (java.util.concurrent.locks.Lock) null;

  protected java.util.Set<BasicPoolEntryRef> issuedConnections;

  protected org.apache.http.impl.conn.IdleConnectionHandler idleConnHandler;

  protected int numConnections;

  protected java.lang.ref.ReferenceQueue<java.lang.Object> refQueue;

  protected boolean isShutDown;

  // Constructors

  protected AbstractConnPool(){
  }
  // Methods

  public void shutdown(){
  }
  public final BasicPoolEntry getEntry(org.apache.http.conn.routing.HttpRoute arg1, java.lang.Object arg2, long arg3, java.util.concurrent.TimeUnit arg4) throws org.apache.http.conn.ConnectionPoolTimeoutException, java.lang.InterruptedException{
    return (BasicPoolEntry) null;
  }
  public abstract void freeEntry(BasicPoolEntry arg1, boolean arg2, long arg3, java.util.concurrent.TimeUnit arg4);
  public void closeIdleConnections(long arg1, java.util.concurrent.TimeUnit arg2){
  }
  public void closeExpiredConnections(){
  }
  public abstract PoolEntryRequest requestPoolEntry(org.apache.http.conn.routing.HttpRoute arg1, java.lang.Object arg2);
  protected abstract void handleLostEntry(org.apache.http.conn.routing.HttpRoute arg1);
  public abstract void deleteClosedConnections();
  protected void closeConnection(org.apache.http.conn.OperatedClientConnection arg1){
  }
  public void enableConnectionGC() throws java.lang.IllegalStateException{
  }
  public void handleReference(java.lang.ref.Reference arg1){
  }
}
