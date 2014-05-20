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
public final class ResponseHeaders
{
  // Constructors

  public ResponseHeaders(java.net.URI arg1, RawHeaders arg2){
  }
  // Methods

  public ResponseHeaders combine(ResponseHeaders arg1){
    return (ResponseHeaders) null;
  }
  public boolean isPublic(){
    return false;
  }
  public int getContentLength(){
    return 0;
  }
  public java.util.Date getLastModified(){
    return (java.util.Date) null;
  }
  public java.lang.String getContentEncoding(){
    return (java.lang.String) null;
  }
  public RawHeaders getHeaders(){
    return (RawHeaders) null;
  }
  public java.net.URI getUri(){
    return (java.net.URI) null;
  }
  public boolean isChunked(){
    return false;
  }
  public boolean validate(ResponseHeaders arg1){
    return false;
  }
  public java.lang.String getConnection(){
    return (java.lang.String) null;
  }
  public java.util.Date getExpires(){
    return (java.util.Date) null;
  }
  public boolean isCacheable(RequestHeaders arg1){
    return false;
  }
  public boolean isContentEncodingGzip(){
    return false;
  }
  public void stripContentEncoding(){
  }
  public boolean hasConnectionClose(){
    return false;
  }
  public void setLocalTimestamps(long arg1, long arg2){
  }
  public java.util.Date getServedDate(){
    return (java.util.Date) null;
  }
  public boolean isNoCache(){
    return false;
  }
  public boolean isNoStore(){
    return false;
  }
  public int getMaxAgeSeconds(){
    return 0;
  }
  public int getSMaxAgeSeconds(){
    return 0;
  }
  public boolean isMustRevalidate(){
    return false;
  }
  public java.lang.String getEtag(){
    return (java.lang.String) null;
  }
  public java.util.Set<java.lang.String> getVaryFields(){
    return (java.util.Set) null;
  }
  public java.lang.String getProxyAuthenticate(){
    return (java.lang.String) null;
  }
  public java.lang.String getWwwAuthenticate(){
    return (java.lang.String) null;
  }
  public boolean hasVaryAll(){
    return false;
  }
  public boolean varyMatches(java.util.Map<java.lang.String, java.util.List<java.lang.String>> arg1, java.util.Map<java.lang.String, java.util.List<java.lang.String>> arg2){
    return false;
  }
}
