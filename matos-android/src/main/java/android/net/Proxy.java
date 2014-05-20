package android.net;

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
public final class Proxy
{
  // Fields

  public static final java.lang.String PROXY_CHANGE_ACTION = "android.intent.action.PROXY_CHANGE";

  public static final java.lang.String EXTRA_PROXY_INFO = "proxy";

  // Constructors

  public Proxy(){
  }
  // Methods

  public static final java.lang.String getHost(android.content.Context arg1){
    return (java.lang.String) null;
  }
  public static final int getDefaultPort(){
    return 0;
  }
  public static final int getPort(android.content.Context arg1){
    return 0;
  }
  public static void validate(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3){
  }
  public static final java.net.Proxy getProxy(android.content.Context arg1, java.lang.String arg2){
    return (java.net.Proxy) null;
  }
  public static final void setHttpProxySystemProperty(ProxyProperties arg1){
  }
  public static final void setHttpProxySystemProperty(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3){
  }
  public static final org.apache.http.HttpHost getPreferredHttpHost(android.content.Context arg1, java.lang.String arg2){
    return (org.apache.http.HttpHost) null;
  }
  public static final java.lang.String getDefaultHost(){
    return (java.lang.String) null;
  }
  public static final org.apache.http.conn.routing.HttpRoutePlanner getAndroidProxySelectorRoutePlanner(android.content.Context arg1){
    return (org.apache.http.conn.routing.HttpRoutePlanner) null;
  }
}
