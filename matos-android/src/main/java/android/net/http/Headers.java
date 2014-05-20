package android.net.http;

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


public final class Headers
{
  // Classes

  public static interface HeaderCallback
  {
    // Methods

    public void header(java.lang.String arg1, java.lang.String arg2);
  }
  // Fields

  public static final int CONN_CLOSE = 1;

  public static final int CONN_KEEP_ALIVE = 2;

  public static final int NO_CONN_TYPE = 0;

  public static final long NO_TRANSFER_ENCODING = 0l;

  public static final long NO_CONTENT_LENGTH = -1l;

  public static final java.lang.String TRANSFER_ENCODING = "transfer-encoding";

  public static final java.lang.String CONTENT_LEN = "content-length";

  public static final java.lang.String CONTENT_TYPE = "content-type";

  public static final java.lang.String CONTENT_ENCODING = "content-encoding";

  public static final java.lang.String CONN_DIRECTIVE = "connection";

  public static final java.lang.String LOCATION = "location";

  public static final java.lang.String PROXY_CONNECTION = "proxy-connection";

  public static final java.lang.String WWW_AUTHENTICATE = "www-authenticate";

  public static final java.lang.String PROXY_AUTHENTICATE = "proxy-authenticate";

  public static final java.lang.String CONTENT_DISPOSITION = "content-disposition";

  public static final java.lang.String ACCEPT_RANGES = "accept-ranges";

  public static final java.lang.String EXPIRES = "expires";

  public static final java.lang.String CACHE_CONTROL = "cache-control";

  public static final java.lang.String LAST_MODIFIED = "last-modified";

  public static final java.lang.String ETAG = "etag";

  public static final java.lang.String SET_COOKIE = "set-cookie";

  public static final java.lang.String PRAGMA = "pragma";

  public static final java.lang.String REFRESH = "refresh";

  public static final java.lang.String X_PERMITTED_CROSS_DOMAIN_POLICIES = "x-permitted-cross-domain-policies";

  // Constructors

  public Headers(){
  }
  // Methods

  public java.lang.String getLocation(){
    return (java.lang.String) null;
  }
  public void setLastModified(java.lang.String arg1){
  }
  public long getContentLength(){
    return 0l;
  }
  public java.lang.String getLastModified(){
    return (java.lang.String) null;
  }
  public java.lang.String getContentType(){
    return (java.lang.String) null;
  }
  public void setContentLength(long arg1){
  }
  public void setContentType(java.lang.String arg1){
  }
  public java.lang.String getContentEncoding(){
    return (java.lang.String) null;
  }
  public void getHeaders(Headers.HeaderCallback arg1){
  }
  public void parseHeader(org.apache.http.util.CharArrayBuffer arg1){
  }
  public void setContentEncoding(java.lang.String arg1){
  }
  public void setExpires(java.lang.String arg1){
  }
  public java.lang.String getExpires(){
    return (java.lang.String) null;
  }
  public long getTransferEncoding(){
    return 0l;
  }
  public void setContentDisposition(java.lang.String arg1){
  }
  public java.lang.String getContentDisposition(){
    return (java.lang.String) null;
  }
  public java.lang.String getEtag(){
    return (java.lang.String) null;
  }
  public java.lang.String getProxyAuthenticate(){
    return (java.lang.String) null;
  }
  public java.lang.String getWwwAuthenticate(){
    return (java.lang.String) null;
  }
  public void setLocation(java.lang.String arg1){
  }
  public void setXPermittedCrossDomainPolicies(@com.francetelecom.rd.stubs.annotation.FieldSet("xPermittedCrossDomainPolicies") java.lang.String arg1){
  }
  public java.util.ArrayList<java.lang.String> getSetCookie(){
    return (java.util.ArrayList) null;
  }
  public int getConnectionType(){
    return 0;
  }
  public java.lang.String getAcceptRanges(){
    return (java.lang.String) null;
  }
  public java.lang.String getCacheControl(){
    return (java.lang.String) null;
  }
  public java.lang.String getPragma(){
    return (java.lang.String) null;
  }
  public java.lang.String getRefresh(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("xPermittedCrossDomainPolicies")
  public java.lang.String getXPermittedCrossDomainPolicies(){
    return (java.lang.String) null;
  }
  public void setWwwAuthenticate(java.lang.String arg1){
  }
  public void setProxyAuthenticate(java.lang.String arg1){
  }
  public void setAcceptRanges(java.lang.String arg1){
  }
  public void setCacheControl(java.lang.String arg1){
  }
  public void setEtag(java.lang.String arg1){
  }
}
