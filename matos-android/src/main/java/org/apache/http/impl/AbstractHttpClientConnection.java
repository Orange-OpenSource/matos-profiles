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
public abstract class AbstractHttpClientConnection
  implements org.apache.http.HttpClientConnection
{
  // Constructors

  public AbstractHttpClientConnection(){
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
  public void sendRequestHeader(org.apache.http.HttpRequest arg1) throws org.apache.http.HttpException, java.io.IOException{
  }
  public void sendRequestEntity(org.apache.http.HttpEntityEnclosingRequest arg1) throws org.apache.http.HttpException, java.io.IOException{
  }
  protected void doFlush() throws java.io.IOException{
  }
  public void receiveResponseEntity(org.apache.http.HttpResponse arg1) throws org.apache.http.HttpException, java.io.IOException{
  }
  public boolean isResponseAvailable(int arg1) throws java.io.IOException{
    return false;
  }
  public org.apache.http.HttpResponse receiveResponseHeader() throws org.apache.http.HttpException, java.io.IOException{
    return (org.apache.http.HttpResponse) null;
  }
  protected abstract void assertOpen() throws java.lang.IllegalStateException;
  protected org.apache.http.impl.entity.EntityDeserializer createEntityDeserializer(){
    return (org.apache.http.impl.entity.EntityDeserializer) null;
  }
  protected org.apache.http.impl.entity.EntitySerializer createEntitySerializer(){
    return (org.apache.http.impl.entity.EntitySerializer) null;
  }
  protected org.apache.http.io.HttpMessageParser createResponseParser(org.apache.http.io.SessionInputBuffer arg1, org.apache.http.HttpResponseFactory arg2, org.apache.http.params.HttpParams arg3){
    return (org.apache.http.io.HttpMessageParser) null;
  }
  protected org.apache.http.HttpResponseFactory createHttpResponseFactory(){
    return (org.apache.http.HttpResponseFactory) null;
  }
  protected org.apache.http.io.HttpMessageWriter createRequestWriter(org.apache.http.io.SessionOutputBuffer arg1, org.apache.http.params.HttpParams arg2){
    return (org.apache.http.io.HttpMessageWriter) null;
  }
}
