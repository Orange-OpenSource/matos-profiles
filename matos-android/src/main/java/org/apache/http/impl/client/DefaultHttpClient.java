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
public class DefaultHttpClient
  extends AbstractHttpClient{
  // Constructors

  public DefaultHttpClient(org.apache.http.conn.ClientConnectionManager arg1, org.apache.http.params.HttpParams arg2){
    super((org.apache.http.conn.ClientConnectionManager) null, (org.apache.http.params.HttpParams) null);
  }
  public DefaultHttpClient(org.apache.http.params.HttpParams arg1){
    super((org.apache.http.conn.ClientConnectionManager) null, (org.apache.http.params.HttpParams) null);
  }
  public DefaultHttpClient(){
    super((org.apache.http.conn.ClientConnectionManager) null, (org.apache.http.params.HttpParams) null);
  }
  // Methods

  protected org.apache.http.protocol.BasicHttpProcessor createHttpProcessor(){
    return (org.apache.http.protocol.BasicHttpProcessor) null;
  }
  protected org.apache.http.protocol.HttpContext createHttpContext(){
    return (org.apache.http.protocol.HttpContext) null;
  }
  protected org.apache.http.params.HttpParams createHttpParams(){
    return (org.apache.http.params.HttpParams) null;
  }
  protected org.apache.http.protocol.HttpRequestExecutor createRequestExecutor(){
    return (org.apache.http.protocol.HttpRequestExecutor) null;
  }
  protected org.apache.http.conn.ClientConnectionManager createClientConnectionManager(){
    return (org.apache.http.conn.ClientConnectionManager) null;
  }
  protected org.apache.http.ConnectionReuseStrategy createConnectionReuseStrategy(){
    return (org.apache.http.ConnectionReuseStrategy) null;
  }
  protected org.apache.http.conn.ConnectionKeepAliveStrategy createConnectionKeepAliveStrategy(){
    return (org.apache.http.conn.ConnectionKeepAliveStrategy) null;
  }
  protected org.apache.http.auth.AuthSchemeRegistry createAuthSchemeRegistry(){
    return (org.apache.http.auth.AuthSchemeRegistry) null;
  }
  protected org.apache.http.cookie.CookieSpecRegistry createCookieSpecRegistry(){
    return (org.apache.http.cookie.CookieSpecRegistry) null;
  }
  protected org.apache.http.client.HttpRequestRetryHandler createHttpRequestRetryHandler(){
    return (org.apache.http.client.HttpRequestRetryHandler) null;
  }
  protected org.apache.http.client.RedirectHandler createRedirectHandler(){
    return (org.apache.http.client.RedirectHandler) null;
  }
  protected org.apache.http.client.AuthenticationHandler createTargetAuthenticationHandler(){
    return (org.apache.http.client.AuthenticationHandler) null;
  }
  protected org.apache.http.client.AuthenticationHandler createProxyAuthenticationHandler(){
    return (org.apache.http.client.AuthenticationHandler) null;
  }
  protected org.apache.http.client.CookieStore createCookieStore(){
    return (org.apache.http.client.CookieStore) null;
  }
  protected org.apache.http.client.CredentialsProvider createCredentialsProvider(){
    return (org.apache.http.client.CredentialsProvider) null;
  }
  protected org.apache.http.conn.routing.HttpRoutePlanner createHttpRoutePlanner(){
    return (org.apache.http.conn.routing.HttpRoutePlanner) null;
  }
  protected org.apache.http.client.UserTokenHandler createUserTokenHandler(){
    return (org.apache.http.client.UserTokenHandler) null;
  }
}
