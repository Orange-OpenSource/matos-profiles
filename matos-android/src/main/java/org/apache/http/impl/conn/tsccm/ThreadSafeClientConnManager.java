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
public class ThreadSafeClientConnManager
  implements org.apache.http.conn.ClientConnectionManager
{
  // Fields

  protected org.apache.http.conn.scheme.SchemeRegistry schemeRegistry;

  protected final AbstractConnPool connectionPool = (AbstractConnPool) null;

  protected org.apache.http.conn.ClientConnectionOperator connOperator;

  // Constructors

  public ThreadSafeClientConnManager(org.apache.http.params.HttpParams arg1, org.apache.http.conn.scheme.SchemeRegistry arg2){
  }
  // Methods

  public void shutdown(){
  }
  protected void finalize() throws java.lang.Throwable{
  }
  public void releaseConnection(org.apache.http.conn.ManagedClientConnection arg1, long arg2, java.util.concurrent.TimeUnit arg3){
  }
  public void closeIdleConnections(long arg1, java.util.concurrent.TimeUnit arg2){
  }
  public void closeExpiredConnections(){
  }
  public int getConnectionsInPool(org.apache.http.conn.routing.HttpRoute arg1){
    return 0;
  }
  public int getConnectionsInPool(){
    return 0;
  }
  public org.apache.http.conn.ClientConnectionRequest requestConnection(org.apache.http.conn.routing.HttpRoute arg1, java.lang.Object arg2){
    return (org.apache.http.conn.ClientConnectionRequest) null;
  }
  public org.apache.http.conn.scheme.SchemeRegistry getSchemeRegistry(){
    return (org.apache.http.conn.scheme.SchemeRegistry) null;
  }
  protected org.apache.http.conn.ClientConnectionOperator createConnectionOperator(org.apache.http.conn.scheme.SchemeRegistry arg1){
    return (org.apache.http.conn.ClientConnectionOperator) null;
  }
  protected AbstractConnPool createConnectionPool(org.apache.http.params.HttpParams arg1){
    return (AbstractConnPool) null;
  }
}
