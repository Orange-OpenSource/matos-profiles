package org.apache.http.impl.conn;

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
public abstract class AbstractPoolEntry
{
  // Fields

  protected final org.apache.http.conn.ClientConnectionOperator connOperator = (org.apache.http.conn.ClientConnectionOperator) null;

  protected final org.apache.http.conn.OperatedClientConnection connection = (org.apache.http.conn.OperatedClientConnection) null;

  protected org.apache.http.conn.routing.HttpRoute route;

  protected java.lang.Object state;

  protected org.apache.http.conn.routing.RouteTracker tracker;

  // Constructors

  protected AbstractPoolEntry(org.apache.http.conn.ClientConnectionOperator arg1, org.apache.http.conn.routing.HttpRoute arg2){
  }
  // Methods

  public java.lang.Object getState(){
    return (java.lang.Object) null;
  }
  public void setState(java.lang.Object arg1){
  }
  public void open(org.apache.http.conn.routing.HttpRoute arg1, org.apache.http.protocol.HttpContext arg2, org.apache.http.params.HttpParams arg3) throws java.io.IOException{
  }
  public void tunnelTarget(boolean arg1, org.apache.http.params.HttpParams arg2) throws java.io.IOException{
  }
  public void tunnelProxy(org.apache.http.HttpHost arg1, boolean arg2, org.apache.http.params.HttpParams arg3) throws java.io.IOException{
  }
  public void layerProtocol(org.apache.http.protocol.HttpContext arg1, org.apache.http.params.HttpParams arg2) throws java.io.IOException{
  }
  protected void shutdownEntry(){
  }
}
