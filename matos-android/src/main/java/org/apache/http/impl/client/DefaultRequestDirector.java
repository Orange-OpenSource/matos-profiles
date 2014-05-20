package org.apache.http.impl.client;

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
public class DefaultRequestDirector
  implements org.apache.http.client.RequestDirector
{
  // Fields

  protected final org.apache.http.conn.ClientConnectionManager connManager = (org.apache.http.conn.ClientConnectionManager) null;

  protected final org.apache.http.conn.routing.HttpRoutePlanner routePlanner = (org.apache.http.conn.routing.HttpRoutePlanner) null;

  protected final org.apache.http.ConnectionReuseStrategy reuseStrategy = (org.apache.http.ConnectionReuseStrategy) null;

  protected final org.apache.http.conn.ConnectionKeepAliveStrategy keepAliveStrategy = (org.apache.http.conn.ConnectionKeepAliveStrategy) null;

  protected final org.apache.http.protocol.HttpRequestExecutor requestExec = (org.apache.http.protocol.HttpRequestExecutor) null;

  protected final org.apache.http.protocol.HttpProcessor httpProcessor = (org.apache.http.protocol.HttpProcessor) null;

  protected final org.apache.http.client.HttpRequestRetryHandler retryHandler = (org.apache.http.client.HttpRequestRetryHandler) null;

  protected final org.apache.http.client.RedirectHandler redirectHandler = (org.apache.http.client.RedirectHandler) null;

  protected final org.apache.http.params.HttpParams params = (org.apache.http.params.HttpParams) null;

  protected org.apache.http.conn.ManagedClientConnection managedConn;

  // Constructors

  public DefaultRequestDirector(org.apache.http.protocol.HttpRequestExecutor arg1, org.apache.http.conn.ClientConnectionManager arg2, org.apache.http.ConnectionReuseStrategy arg3, org.apache.http.conn.ConnectionKeepAliveStrategy arg4, org.apache.http.conn.routing.HttpRoutePlanner arg5, @com.francetelecom.rd.stubs.annotation.CallBackRegister("process") org.apache.http.protocol.HttpProcessor arg6, @com.francetelecom.rd.stubs.annotation.CallBackRegister("retryRequest") org.apache.http.client.HttpRequestRetryHandler arg7, @com.francetelecom.rd.stubs.annotation.CallBackRegister("handleCallBack") org.apache.http.client.RedirectHandler arg8, @com.francetelecom.rd.stubs.annotation.CallBack("authentication") org.apache.http.client.AuthenticationHandler arg9, @com.francetelecom.rd.stubs.annotation.CallBackRegister("authentication") org.apache.http.client.AuthenticationHandler arg10, @com.francetelecom.rd.stubs.annotation.CallBack("getUserToken") org.apache.http.client.UserTokenHandler arg11, org.apache.http.params.HttpParams arg12){
  }
  // Methods

  public org.apache.http.HttpResponse execute(org.apache.http.HttpHost arg1, org.apache.http.HttpRequest arg2, org.apache.http.protocol.HttpContext arg3) throws org.apache.http.HttpException, java.io.IOException{
    return (org.apache.http.HttpResponse) null;
  }
  protected RoutedRequest handleResponse(RoutedRequest arg1, org.apache.http.HttpResponse arg2, org.apache.http.protocol.HttpContext arg3) throws org.apache.http.HttpException, java.io.IOException{
    return (RoutedRequest) null;
  }
  protected void rewriteRequestURI(RequestWrapper arg1, org.apache.http.conn.routing.HttpRoute arg2) throws org.apache.http.ProtocolException{
  }
  protected void releaseConnection(){
  }
  protected org.apache.http.conn.routing.HttpRoute determineRoute(org.apache.http.HttpHost arg1, org.apache.http.HttpRequest arg2, org.apache.http.protocol.HttpContext arg3) throws org.apache.http.HttpException{
    return (org.apache.http.conn.routing.HttpRoute) null;
  }
  protected void establishRoute(org.apache.http.conn.routing.HttpRoute arg1, org.apache.http.protocol.HttpContext arg2) throws org.apache.http.HttpException, java.io.IOException{
  }
  protected boolean createTunnelToTarget(org.apache.http.conn.routing.HttpRoute arg1, org.apache.http.protocol.HttpContext arg2) throws org.apache.http.HttpException, java.io.IOException{
    return false;
  }
  protected boolean createTunnelToProxy(org.apache.http.conn.routing.HttpRoute arg1, int arg2, org.apache.http.protocol.HttpContext arg3) throws org.apache.http.HttpException, java.io.IOException{
    return false;
  }
  protected org.apache.http.HttpRequest createConnectRequest(org.apache.http.conn.routing.HttpRoute arg1, org.apache.http.protocol.HttpContext arg2){
    return (org.apache.http.HttpRequest) null;
  }
}
