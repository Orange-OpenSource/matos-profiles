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
public final class RequestHeaders
{
  // Constructors

  public RequestHeaders(@com.francetelecom.rd.stubs.annotation.FieldSet("uri") java.net.URI arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("rawHeaders") RawHeaders arg2){
  }
  // Methods

  public java.lang.String getHost(){
    return (java.lang.String) null;
  }
  public int getContentLength(){
    return 0;
  }
  public java.lang.String getContentType(){
    return (java.lang.String) null;
  }
  public void setContentLength(int arg1){
  }
  public void setContentType(java.lang.String arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("rawHeaders")
  public RawHeaders getHeaders(){
    return (RawHeaders) null;
  }
  public java.lang.String getIfModifiedSince(){
    return (java.lang.String) null;
  }
  public void setIfModifiedSince(java.util.Date arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("uri")
  public java.net.URI getUri(){
    return (java.net.URI) null;
  }
  public boolean isChunked(){
    return false;
  }
  public void setChunked(){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("connection")
  public java.lang.String getConnection(){
    return (java.lang.String) null;
  }
  public void setHost(java.lang.String arg1){
  }
  public java.lang.String getTransferEncoding(){
    return (java.lang.String) null;
  }
  public void addCookies(java.util.Map<java.lang.String, java.util.List<java.lang.String>> arg1){
  }
  public void setConnection(@com.francetelecom.rd.stubs.annotation.FieldSet("connection") java.lang.String arg1){
  }
  public void setUserAgent(@com.francetelecom.rd.stubs.annotation.FieldSet("userAgent") java.lang.String arg1){
  }
  public boolean hasConnectionClose(){
    return false;
  }
  public boolean isNoCache(){
    return false;
  }
  public int getMaxAgeSeconds(){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("userAgent")
  public java.lang.String getUserAgent(){
    return (java.lang.String) null;
  }
  public boolean isOnlyIfCached(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("acceptEncoding")
  public java.lang.String getAcceptEncoding(){
    return (java.lang.String) null;
  }
  public void setAcceptEncoding(@com.francetelecom.rd.stubs.annotation.FieldSet("acceptEncoding") java.lang.String arg1){
  }
  public boolean hasAuthorization(){
    return false;
  }
  public boolean hasConditions(){
    return false;
  }
  public int getMinFreshSeconds(){
    return 0;
  }
  public int getMaxStaleSeconds(){
    return 0;
  }
  public void setIfNoneMatch(@com.francetelecom.rd.stubs.annotation.FieldSet("ifNoneMatch") java.lang.String arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("ifNoneMatch")
  public java.lang.String getIfNoneMatch(){
    return (java.lang.String) null;
  }
  public java.lang.String getProxyAuthorization(){
    return (java.lang.String) null;
  }
}
