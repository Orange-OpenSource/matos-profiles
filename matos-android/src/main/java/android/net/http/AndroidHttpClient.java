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


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public final class AndroidHttpClient
  implements org.apache.http.client.HttpClient
{
  // Fields

  public static long DEFAULT_SYNC_MIN_GZIP_BYTES;

  // Constructors

  private AndroidHttpClient(org.apache.http.conn.ClientConnectionManager arg1, org.apache.http.params.HttpParams arg2){
  }
  // Methods

  protected void finalize() throws java.lang.Throwable{
  }
  public static AndroidHttpClient newInstance(java.lang.String arg1, android.content.Context arg2){
    return (AndroidHttpClient) null;
  }
  public static AndroidHttpClient newInstance(java.lang.String arg1){
    return (AndroidHttpClient) null;
  }
  public void close(){
  }
  public org.apache.http.HttpResponse execute(org.apache.http.client.methods.HttpUriRequest arg1) throws java.io.IOException{
    return (org.apache.http.HttpResponse) null;
  }
  public org.apache.http.HttpResponse execute(org.apache.http.client.methods.HttpUriRequest arg1, org.apache.http.protocol.HttpContext arg2) throws java.io.IOException{
    return (org.apache.http.HttpResponse) null;
  }
  public org.apache.http.HttpResponse execute(org.apache.http.HttpHost arg1, org.apache.http.HttpRequest arg2) throws java.io.IOException{
    return (org.apache.http.HttpResponse) null;
  }
  public org.apache.http.HttpResponse execute(org.apache.http.HttpHost arg1, org.apache.http.HttpRequest arg2, org.apache.http.protocol.HttpContext arg3) throws java.io.IOException{
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
  public org.apache.http.params.HttpParams getParams(){
    return (org.apache.http.params.HttpParams) null;
  }
  public org.apache.http.conn.ClientConnectionManager getConnectionManager(){
    return (org.apache.http.conn.ClientConnectionManager) null;
  }
  public static long parseDate(java.lang.String arg1){
    return 0l;
  }
  public static void modifyRequestToAcceptGzipResponse(org.apache.http.HttpRequest arg1){
  }
  public static java.io.InputStream getUngzippedContent(org.apache.http.HttpEntity arg1) throws java.io.IOException{
    return (java.io.InputStream) null;
  }
  public static org.apache.http.entity.AbstractHttpEntity getCompressedEntity(byte [] arg1, android.content.ContentResolver arg2) throws java.io.IOException{
    return (org.apache.http.entity.AbstractHttpEntity) null;
  }
  public static long getMinGzipSize(android.content.ContentResolver arg1){
    return 0l;
  }
  public void enableCurlLogging(java.lang.String arg1, int arg2){
  }
  public void disableCurlLogging(){
  }
}
