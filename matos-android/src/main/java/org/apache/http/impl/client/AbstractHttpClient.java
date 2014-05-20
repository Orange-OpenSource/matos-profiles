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
public abstract class AbstractHttpClient
  implements org.apache.http.client.HttpClient
{
  // Constructors

  protected AbstractHttpClient(@com.francetelecom.rd.stubs.annotation.CallBackRegister("manageConnection") org.apache.http.conn.ClientConnectionManager arg1, org.apache.http.params.HttpParams arg2){
  }
  // Methods

  public final org.apache.http.HttpResponse execute(org.apache.http.client.methods.HttpUriRequest arg1) throws java.io.IOException, org.apache.http.client.ClientProtocolException{
    return (org.apache.http.HttpResponse) null;
  }
  public final org.apache.http.HttpResponse execute(org.apache.http.client.methods.HttpUriRequest arg1, org.apache.http.protocol.HttpContext arg2) throws java.io.IOException, org.apache.http.client.ClientProtocolException{
    return (org.apache.http.HttpResponse) null;
  }
  public final org.apache.http.HttpResponse execute(org.apache.http.HttpHost arg1, org.apache.http.HttpRequest arg2) throws java.io.IOException, org.apache.http.client.ClientProtocolException{
    return (org.apache.http.HttpResponse) null;
  }
  public final org.apache.http.HttpResponse execute(org.apache.http.HttpHost arg1, org.apache.http.HttpRequest arg2, org.apache.http.protocol.HttpContext arg3) throws java.io.IOException, org.apache.http.client.ClientProtocolException{
    return (org.apache.http.HttpResponse) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return arg2.handleResponse(new com.francetelecom.rd.fakeandroid.HttpResponseImplem(com.francetelecom.rd.stubs.Generator.token));")
  public <T>T execute(org.apache.http.client.methods.HttpUriRequest arg1, org.apache.http.client.ResponseHandler<? extends T> arg2) throws java.io.IOException, org.apache.http.client.ClientProtocolException{
    return null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return arg2.handleResponse(new com.francetelecom.rd.fakeandroid.HttpResponseImplem(com.francetelecom.rd.stubs.Generator.token));")
  public <T>T execute(org.apache.http.client.methods.HttpUriRequest arg1, org.apache.http.client.ResponseHandler<? extends T> arg2, org.apache.http.protocol.HttpContext arg3) throws java.io.IOException, org.apache.http.client.ClientProtocolException{
    return null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return arg3.handleResponse(new com.francetelecom.rd.fakeandroid.HttpResponseImplem(com.francetelecom.rd.stubs.Generator.token));")
  public <T>T execute(org.apache.http.HttpHost arg1, org.apache.http.HttpRequest arg2, org.apache.http.client.ResponseHandler<? extends T> arg3) throws java.io.IOException, org.apache.http.client.ClientProtocolException{
    return null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return arg3.handleResponse(new com.francetelecom.rd.fakeandroid.HttpResponseImplem(com.francetelecom.rd.stubs.Generator.token));")
  public <T>T execute(org.apache.http.HttpHost arg1, org.apache.http.HttpRequest arg2, org.apache.http.client.ResponseHandler<? extends T> arg3, org.apache.http.protocol.HttpContext arg4) throws java.io.IOException, org.apache.http.client.ClientProtocolException{
    return null;
  }
  public synchronized void addRequestInterceptor(org.apache.http.HttpRequestInterceptor arg1){
  }
  public synchronized void addRequestInterceptor(org.apache.http.HttpRequestInterceptor arg1, int arg2){
  }
  public synchronized int getRequestInterceptorCount(){
    return 0;
  }
  public synchronized org.apache.http.HttpRequestInterceptor getRequestInterceptor(int arg1){
    return (org.apache.http.HttpRequestInterceptor) null;
  }
  public synchronized void clearRequestInterceptors(){
  }
  public void removeRequestInterceptorByClass(java.lang.Class<? extends org.apache.http.HttpRequestInterceptor> arg1){
  }
  public final synchronized org.apache.http.params.HttpParams getParams(){
    return (org.apache.http.params.HttpParams) null;
  }
  public synchronized void setParams(org.apache.http.params.HttpParams arg1){
  }
  public synchronized void addResponseInterceptor(org.apache.http.HttpResponseInterceptor arg1){
  }
  public synchronized void addResponseInterceptor(org.apache.http.HttpResponseInterceptor arg1, int arg2){
  }
  public void removeResponseInterceptorByClass(java.lang.Class<? extends org.apache.http.HttpResponseInterceptor> arg1){
  }
  public synchronized int getResponseInterceptorCount(){
    return 0;
  }
  public synchronized org.apache.http.HttpResponseInterceptor getResponseInterceptor(int arg1){
    return (org.apache.http.HttpResponseInterceptor) null;
  }
  public synchronized void clearResponseInterceptors(){
  }
  protected abstract org.apache.http.protocol.BasicHttpProcessor createHttpProcessor();
  protected abstract org.apache.http.protocol.HttpContext createHttpContext();
  protected abstract org.apache.http.params.HttpParams createHttpParams();
  protected abstract org.apache.http.protocol.HttpRequestExecutor createRequestExecutor();
  protected abstract org.apache.http.conn.ClientConnectionManager createClientConnectionManager();
  protected abstract org.apache.http.ConnectionReuseStrategy createConnectionReuseStrategy();
  protected abstract org.apache.http.conn.ConnectionKeepAliveStrategy createConnectionKeepAliveStrategy();
  protected abstract org.apache.http.auth.AuthSchemeRegistry createAuthSchemeRegistry();
  protected abstract org.apache.http.cookie.CookieSpecRegistry createCookieSpecRegistry();
  protected abstract org.apache.http.client.HttpRequestRetryHandler createHttpRequestRetryHandler();
  protected abstract org.apache.http.client.RedirectHandler createRedirectHandler();
  protected abstract org.apache.http.client.AuthenticationHandler createTargetAuthenticationHandler();
  protected abstract org.apache.http.client.AuthenticationHandler createProxyAuthenticationHandler();
  protected abstract org.apache.http.client.CookieStore createCookieStore();
  protected abstract org.apache.http.client.CredentialsProvider createCredentialsProvider();
  protected abstract org.apache.http.conn.routing.HttpRoutePlanner createHttpRoutePlanner();
  protected abstract org.apache.http.client.UserTokenHandler createUserTokenHandler();
  public final synchronized org.apache.http.auth.AuthSchemeRegistry getAuthSchemes(){
    return (org.apache.http.auth.AuthSchemeRegistry) null;
  }
  public final synchronized org.apache.http.cookie.CookieSpecRegistry getCookieSpecs(){
    return (org.apache.http.cookie.CookieSpecRegistry) null;
  }
  public final synchronized org.apache.http.client.CredentialsProvider getCredentialsProvider(){
    return (org.apache.http.client.CredentialsProvider) null;
  }
  public final synchronized org.apache.http.client.CookieStore getCookieStore(){
    return (org.apache.http.client.CookieStore) null;
  }
  public final synchronized org.apache.http.conn.ClientConnectionManager getConnectionManager(){
    return (org.apache.http.conn.ClientConnectionManager) null;
  }
  public final synchronized org.apache.http.protocol.HttpRequestExecutor getRequestExecutor(){
    return (org.apache.http.protocol.HttpRequestExecutor) null;
  }
  public synchronized void setAuthSchemes(org.apache.http.auth.AuthSchemeRegistry arg1){
  }
  public synchronized void setCookieSpecs(org.apache.http.cookie.CookieSpecRegistry arg1){
  }
  public final synchronized org.apache.http.ConnectionReuseStrategy getConnectionReuseStrategy(){
    return (org.apache.http.ConnectionReuseStrategy) null;
  }
  public synchronized void setReuseStrategy(org.apache.http.ConnectionReuseStrategy arg1){
  }
  public final synchronized org.apache.http.conn.ConnectionKeepAliveStrategy getConnectionKeepAliveStrategy(){
    return (org.apache.http.conn.ConnectionKeepAliveStrategy) null;
  }
  public synchronized void setKeepAliveStrategy(org.apache.http.conn.ConnectionKeepAliveStrategy arg1){
  }
  public final synchronized org.apache.http.client.HttpRequestRetryHandler getHttpRequestRetryHandler(){
    return (org.apache.http.client.HttpRequestRetryHandler) null;
  }
  public synchronized void setHttpRequestRetryHandler(@com.francetelecom.rd.stubs.annotation.CallBackRegister("org.apache.http.client.HttpRequestRetryHandler.retryRequest") org.apache.http.client.HttpRequestRetryHandler arg1){
  }
  public final synchronized org.apache.http.client.RedirectHandler getRedirectHandler(){
    return (org.apache.http.client.RedirectHandler) null;
  }
  public synchronized void setRedirectHandler(@com.francetelecom.rd.stubs.annotation.CallBackRegister("org.apache.http.client.RedirectHandler.handleCallBack") org.apache.http.client.RedirectHandler arg1){
  }
  public final synchronized org.apache.http.client.AuthenticationHandler getTargetAuthenticationHandler(){
    return (org.apache.http.client.AuthenticationHandler) null;
  }
  public synchronized void setTargetAuthenticationHandler(@com.francetelecom.rd.stubs.annotation.CallBackRegister("org.apache.http.client.AuthenticationHandler.authentication") org.apache.http.client.AuthenticationHandler arg1){
  }
  public final synchronized org.apache.http.client.AuthenticationHandler getProxyAuthenticationHandler(){
    return (org.apache.http.client.AuthenticationHandler) null;
  }
  public synchronized void setProxyAuthenticationHandler(@com.francetelecom.rd.stubs.annotation.CallBackRegister("org.apache.http.client.AuthenticationHandler.authentication") org.apache.http.client.AuthenticationHandler arg1){
  }
  public synchronized void setCookieStore(org.apache.http.client.CookieStore arg1){
  }
  public synchronized void setCredentialsProvider(org.apache.http.client.CredentialsProvider arg1){
  }
  public final synchronized org.apache.http.conn.routing.HttpRoutePlanner getRoutePlanner(){
    return (org.apache.http.conn.routing.HttpRoutePlanner) null;
  }
  public synchronized void setRoutePlanner(org.apache.http.conn.routing.HttpRoutePlanner arg1){
  }
  public final synchronized org.apache.http.client.UserTokenHandler getUserTokenHandler(){
    return (org.apache.http.client.UserTokenHandler) null;
  }
  public synchronized void setUserTokenHandler(@com.francetelecom.rd.stubs.annotation.CallBackRegister("org.apache.http.client.UserTokenHandler.getUserToken") org.apache.http.client.UserTokenHandler arg1){
  }
  protected final synchronized org.apache.http.protocol.BasicHttpProcessor getHttpProcessor(){
    return (org.apache.http.protocol.BasicHttpProcessor) null;
  }
  protected org.apache.http.client.RequestDirector createClientRequestDirector(org.apache.http.protocol.HttpRequestExecutor arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("manageConnection") org.apache.http.conn.ClientConnectionManager arg2, org.apache.http.ConnectionReuseStrategy arg3, @com.francetelecom.rd.stubs.annotation.CallBackRegister("getKeepAlive") org.apache.http.conn.ConnectionKeepAliveStrategy arg4, org.apache.http.conn.routing.HttpRoutePlanner arg5, @com.francetelecom.rd.stubs.annotation.CallBackRegister("process") org.apache.http.protocol.HttpProcessor arg6, @com.francetelecom.rd.stubs.annotation.CallBackRegister("retryRequest") org.apache.http.client.HttpRequestRetryHandler arg7, @com.francetelecom.rd.stubs.annotation.CallBackRegister("handleCallBack") org.apache.http.client.RedirectHandler arg8, @com.francetelecom.rd.stubs.annotation.CallBackRegister("authentication") org.apache.http.client.AuthenticationHandler arg9, @com.francetelecom.rd.stubs.annotation.CallBackRegister("authentication") org.apache.http.client.AuthenticationHandler arg10, @com.francetelecom.rd.stubs.annotation.CallBackRegister("getUserToken") org.apache.http.client.UserTokenHandler arg11, org.apache.http.params.HttpParams arg12){
    return (org.apache.http.client.RequestDirector) null;
  }
  protected org.apache.http.params.HttpParams determineParams(org.apache.http.HttpRequest arg1){
    return (org.apache.http.params.HttpParams) null;
  }
}
