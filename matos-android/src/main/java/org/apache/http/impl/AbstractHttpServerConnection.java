package org.apache.http.impl;

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
public abstract class AbstractHttpServerConnection
  implements org.apache.http.HttpServerConnection
{
  // Constructors

  public AbstractHttpServerConnection(){
  }
  // Methods

  protected void init(org.apache.http.io.SessionInputBuffer arg1, org.apache.http.io.SessionOutputBuffer arg2, org.apache.http.params.HttpParams arg3){
  }
  public void flush() throws java.io.IOException{
  }
  public boolean isStale(){
    return false;
  }
  public org.apache.http.HttpConnectionMetrics getMetrics(){
    return (org.apache.http.HttpConnectionMetrics) null;
  }
  protected void doFlush() throws java.io.IOException{
  }
  protected abstract void assertOpen() throws java.lang.IllegalStateException;
  protected org.apache.http.impl.entity.EntityDeserializer createEntityDeserializer(){
    return (org.apache.http.impl.entity.EntityDeserializer) null;
  }
  protected org.apache.http.impl.entity.EntitySerializer createEntitySerializer(){
    return (org.apache.http.impl.entity.EntitySerializer) null;
  }
  protected org.apache.http.HttpRequestFactory createHttpRequestFactory(){
    return (org.apache.http.HttpRequestFactory) null;
  }
  protected org.apache.http.io.HttpMessageParser createRequestParser(org.apache.http.io.SessionInputBuffer arg1, org.apache.http.HttpRequestFactory arg2, org.apache.http.params.HttpParams arg3){
    return (org.apache.http.io.HttpMessageParser) null;
  }
  protected org.apache.http.io.HttpMessageWriter createResponseWriter(org.apache.http.io.SessionOutputBuffer arg1, org.apache.http.params.HttpParams arg2){
    return (org.apache.http.io.HttpMessageWriter) null;
  }
  public org.apache.http.HttpRequest receiveRequestHeader() throws org.apache.http.HttpException, java.io.IOException{
    return (org.apache.http.HttpRequest) null;
  }
  public void receiveRequestEntity(org.apache.http.HttpEntityEnclosingRequest arg1) throws org.apache.http.HttpException, java.io.IOException{
  }
  public void sendResponseHeader(org.apache.http.HttpResponse arg1) throws org.apache.http.HttpException, java.io.IOException{
  }
  public void sendResponseEntity(org.apache.http.HttpResponse arg1) throws org.apache.http.HttpException, java.io.IOException{
  }
}
