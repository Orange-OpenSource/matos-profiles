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
public class AndroidHttpClientConnection
  implements org.apache.http.HttpConnection, org.apache.http.HttpInetConnection
{
  // Constructors

  public AndroidHttpClientConnection(){
  }
  // Methods

  public void shutdown() throws java.io.IOException{
  }
  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public void close() throws java.io.IOException{
  }
  public void flush() throws java.io.IOException{
  }
  public boolean isOpen(){
    return false;
  }
  public void bind(java.net.Socket arg1, org.apache.http.params.HttpParams arg2) throws java.io.IOException{
  }
  public int getLocalPort(){
    return 0;
  }
  public java.net.InetAddress getLocalAddress(){
    return (java.net.InetAddress) null;
  }
  public java.net.InetAddress getRemoteAddress(){
    return (java.net.InetAddress) null;
  }
  public int getRemotePort(){
    return 0;
  }
  public boolean isStale(){
    return false;
  }
  public void setSocketTimeout(int arg1){
  }
  public int getSocketTimeout(){
    return 0;
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
  public org.apache.http.StatusLine parseResponseHeader(Headers arg1) throws java.io.IOException, org.apache.http.ParseException{
    return (org.apache.http.StatusLine) null;
  }
  public org.apache.http.HttpEntity receiveResponseEntity(Headers arg1){
    return (org.apache.http.HttpEntity) null;
  }
}
