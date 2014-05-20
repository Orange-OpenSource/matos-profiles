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
public class ProxySelectorRoutePlanner
  implements org.apache.http.conn.routing.HttpRoutePlanner
{
  // Fields

  protected org.apache.http.conn.scheme.SchemeRegistry schemeRegistry;

  protected java.net.ProxySelector proxySelector;

  // Constructors

  public ProxySelectorRoutePlanner(org.apache.http.conn.scheme.SchemeRegistry arg1, java.net.ProxySelector arg2){
  }
  // Methods

  protected java.lang.String getHost(java.net.InetSocketAddress arg1){
    return (java.lang.String) null;
  }
  public org.apache.http.conn.routing.HttpRoute determineRoute(org.apache.http.HttpHost arg1, org.apache.http.HttpRequest arg2, org.apache.http.protocol.HttpContext arg3) throws org.apache.http.HttpException{
    return (org.apache.http.conn.routing.HttpRoute) null;
  }
  public java.net.ProxySelector getProxySelector(){
    return (java.net.ProxySelector) null;
  }
  public void setProxySelector(java.net.ProxySelector arg1){
  }
  protected org.apache.http.HttpHost determineProxy(org.apache.http.HttpHost arg1, org.apache.http.HttpRequest arg2, org.apache.http.protocol.HttpContext arg3) throws org.apache.http.HttpException{
    return (org.apache.http.HttpHost) null;
  }
  protected java.net.Proxy chooseProxy(java.util.List<java.net.Proxy> arg1, org.apache.http.HttpHost arg2, org.apache.http.HttpRequest arg3, org.apache.http.protocol.HttpContext arg4){
    return (java.net.Proxy) null;
  }
}
