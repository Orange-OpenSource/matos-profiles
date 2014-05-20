package org.apache.http.conn.params;

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
public class ConnRouteParams
  implements ConnRoutePNames
{
  // Fields

  public static final org.apache.http.HttpHost NO_HOST = null;

  public static final org.apache.http.conn.routing.HttpRoute NO_ROUTE = null;

  // Constructors

  private ConnRouteParams(){
  }
  // Methods

  public static java.net.InetAddress getLocalAddress(org.apache.http.params.HttpParams arg1){
    return (java.net.InetAddress) null;
  }
  public static org.apache.http.HttpHost getDefaultProxy(org.apache.http.params.HttpParams arg1){
    return (org.apache.http.HttpHost) null;
  }
  public static void setDefaultProxy(org.apache.http.params.HttpParams arg1, org.apache.http.HttpHost arg2){
  }
  public static org.apache.http.conn.routing.HttpRoute getForcedRoute(org.apache.http.params.HttpParams arg1){
    return (org.apache.http.conn.routing.HttpRoute) null;
  }
  public static void setForcedRoute(org.apache.http.params.HttpParams arg1, org.apache.http.conn.routing.HttpRoute arg2){
  }
  public static void setLocalAddress(org.apache.http.params.HttpParams arg1, java.net.InetAddress arg2){
  }
}
