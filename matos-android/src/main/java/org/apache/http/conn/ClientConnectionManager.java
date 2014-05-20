package org.apache.http.conn;

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
public interface ClientConnectionManager
{
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("manageConnection")
  public void shutdown();
  @com.francetelecom.rd.stubs.annotation.CallBack("manageConnection")
  public void releaseConnection(ManagedClientConnection arg1, long arg2, java.util.concurrent.TimeUnit arg3);
  @com.francetelecom.rd.stubs.annotation.CallBack("manageConnection")
  public void closeIdleConnections(long arg1, java.util.concurrent.TimeUnit arg2);
  @com.francetelecom.rd.stubs.annotation.CallBack("manageConnection")
  public void closeExpiredConnections();
  @com.francetelecom.rd.stubs.annotation.CallBack("manageConnection")
  public ClientConnectionRequest requestConnection(org.apache.http.conn.routing.HttpRoute arg1, java.lang.Object arg2);
  @com.francetelecom.rd.stubs.annotation.CallBack("manageConnection")
  public org.apache.http.conn.scheme.SchemeRegistry getSchemeRegistry();
}
