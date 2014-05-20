package libcore.net.http;

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
public class HttpEngine
{
  // Fields

  public static final int DEFAULT_CHUNK_LENGTH = 1024;

  public static final java.lang.String OPTIONS = "OPTIONS";

  public static final java.lang.String GET = "GET";

  public static final java.lang.String HEAD = "HEAD";

  public static final java.lang.String POST = "POST";

  public static final java.lang.String PUT = "PUT";

  public static final java.lang.String DELETE = "DELETE";

  public static final java.lang.String TRACE = "TRACE";

  public static final java.lang.String CONNECT = "CONNECT";

  public static final int HTTP_CONTINUE = 100;

  public static final int MAX_REDIRECTS = 5;

  protected final java.lang.String method = (java.lang.String) null;

  // Constructors

  public HttpEngine(){
  }
  // Methods

  public final void release(boolean arg1){
  }
  protected void connect() throws java.io.IOException{
  }
  public final int getResponseCode(){
    return 0;
  }
  public final void sendRequest() throws java.io.IOException{
  }
  protected boolean requiresTunnel(){
    return false;
  }
  protected boolean acceptCacheResponseType(java.net.CacheResponse arg1){
    return false;
  }
  protected boolean includeAuthorityInRequestLine(){
    return false;
  }
  protected java.net.HttpURLConnection getHttpConnectionToCache(){
    return (java.net.HttpURLConnection) null;
  }
  public final RequestHeaders getRequestHeaders(){
    return (RequestHeaders) null;
  }
  public final void readResponse() throws java.io.IOException{
  }
  public final ResponseHeaders getResponseHeaders(){
    return (ResponseHeaders) null;
  }
  public final void automaticallyReleaseConnectionToPool(){
  }
  protected void initRequestBodyOut() throws java.io.IOException{
  }
  public final java.io.OutputStream getRequestBody(){
    return (java.io.OutputStream) null;
  }
  public final boolean hasResponse(){
    return false;
  }
  public final java.io.InputStream getResponseBody(){
    return (java.io.InputStream) null;
  }
  public final java.net.CacheResponse getCacheResponse(){
    return (java.net.CacheResponse) null;
  }
  public final boolean hasResponseBody(){
    return false;
  }
  protected RawHeaders getNetworkRequestHeaders() throws java.io.IOException{
    return (RawHeaders) null;
  }
  protected final java.lang.String getDefaultUserAgent(){
    return (java.lang.String) null;
  }
  protected final java.lang.String getOriginAddress(java.net.URL arg1){
    return (java.lang.String) null;
  }
}
