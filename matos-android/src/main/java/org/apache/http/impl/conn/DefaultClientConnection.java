package org.apache.http.impl.conn;

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
public class DefaultClientConnection
  extends org.apache.http.impl.SocketHttpClientConnection  implements org.apache.http.conn.OperatedClientConnection
{
  // Constructors

  public DefaultClientConnection(){
    super();
  }
  // Methods

  public void shutdown() throws java.io.IOException{
  }
  public void close() throws java.io.IOException{
  }
  public void update(java.net.Socket arg1, org.apache.http.HttpHost arg2, boolean arg3, org.apache.http.params.HttpParams arg4) throws java.io.IOException{
  }
  public final boolean isSecure(){
    return false;
  }
  public void sendRequestHeader(org.apache.http.HttpRequest arg1) throws org.apache.http.HttpException, java.io.IOException{
  }
  public final org.apache.http.HttpHost getTargetHost(){
    return (org.apache.http.HttpHost) null;
  }
  public org.apache.http.HttpResponse receiveResponseHeader() throws org.apache.http.HttpException, java.io.IOException{
    return (org.apache.http.HttpResponse) null;
  }
  public final java.net.Socket getSocket(){
    return (java.net.Socket) null;
  }
  public void opening(java.net.Socket arg1, org.apache.http.HttpHost arg2) throws java.io.IOException{
  }
  public void openCompleted(boolean arg1, org.apache.http.params.HttpParams arg2) throws java.io.IOException{
  }
  protected org.apache.http.io.SessionInputBuffer createSessionInputBuffer(java.net.Socket arg1, int arg2, org.apache.http.params.HttpParams arg3) throws java.io.IOException{
    return (org.apache.http.io.SessionInputBuffer) null;
  }
  protected org.apache.http.io.SessionOutputBuffer createSessionOutputBuffer(java.net.Socket arg1, int arg2, org.apache.http.params.HttpParams arg3) throws java.io.IOException{
    return (org.apache.http.io.SessionOutputBuffer) null;
  }
  protected org.apache.http.io.HttpMessageParser createResponseParser(org.apache.http.io.SessionInputBuffer arg1, org.apache.http.HttpResponseFactory arg2, org.apache.http.params.HttpParams arg3){
    return (org.apache.http.io.HttpMessageParser) null;
  }
}
