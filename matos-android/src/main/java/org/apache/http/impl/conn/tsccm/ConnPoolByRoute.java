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
public class ConnPoolByRoute
  extends AbstractConnPool{
  // Fields

  protected final org.apache.http.conn.ClientConnectionOperator operator = (org.apache.http.conn.ClientConnectionOperator) null;

  protected java.util.Queue<BasicPoolEntry> freeConnections;

  protected java.util.Queue<WaitingThread> waitingThreads;

  protected final java.util.Map<org.apache.http.conn.routing.HttpRoute, RouteSpecificPool> routeToPool = (java.util.Map) null;

  protected final int maxTotalConnections = 0;

  // Constructors

  public ConnPoolByRoute(org.apache.http.conn.ClientConnectionOperator arg1, org.apache.http.params.HttpParams arg2){
    super();
  }
  // Methods

  public void shutdown(){
  }
  protected BasicPoolEntry createEntry(RouteSpecificPool arg1, org.apache.http.conn.ClientConnectionOperator arg2){
    return (BasicPoolEntry) null;
  }
  public void freeEntry(BasicPoolEntry arg1, boolean arg2, long arg3, java.util.concurrent.TimeUnit arg4){
  }
  protected java.util.Queue<BasicPoolEntry> createFreeConnQueue(){
    return (java.util.Queue) null;
  }
  protected java.util.Queue<WaitingThread> createWaitingThreadQueue(){
    return (java.util.Queue) null;
  }
  protected java.util.Map<org.apache.http.conn.routing.HttpRoute, RouteSpecificPool> createRouteToPoolMap(){
    return (java.util.Map) null;
  }
  protected RouteSpecificPool newRouteSpecificPool(org.apache.http.conn.routing.HttpRoute arg1){
    return (RouteSpecificPool) null;
  }
  protected WaitingThread newWaitingThread(java.util.concurrent.locks.Condition arg1, RouteSpecificPool arg2){
    return (WaitingThread) null;
  }
  protected RouteSpecificPool getRoutePool(org.apache.http.conn.routing.HttpRoute arg1, boolean arg2){
    return (RouteSpecificPool) null;
  }
  public int getConnectionsInPool(org.apache.http.conn.routing.HttpRoute arg1){
    return 0;
  }
  public PoolEntryRequest requestPoolEntry(org.apache.http.conn.routing.HttpRoute arg1, java.lang.Object arg2){
    return (PoolEntryRequest) null;
  }
  protected BasicPoolEntry getEntryBlocking(org.apache.http.conn.routing.HttpRoute arg1, java.lang.Object arg2, long arg3, java.util.concurrent.TimeUnit arg4, WaitingThreadAborter arg5) throws org.apache.http.conn.ConnectionPoolTimeoutException, java.lang.InterruptedException{
    return (BasicPoolEntry) null;
  }
  protected BasicPoolEntry getFreeEntry(RouteSpecificPool arg1, java.lang.Object arg2){
    return (BasicPoolEntry) null;
  }
  protected void deleteEntry(BasicPoolEntry arg1){
  }
  protected void deleteLeastUsedEntry(){
  }
  protected void handleLostEntry(org.apache.http.conn.routing.HttpRoute arg1){
  }
  protected void notifyWaitingThread(RouteSpecificPool arg1){
  }
  public void deleteClosedConnections(){
  }
}
