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


public abstract class AbstractClientConnAdapter
  implements org.apache.http.conn.ManagedClientConnection
{
  // Constructors

  protected AbstractClientConnAdapter(@com.francetelecom.rd.stubs.annotation.CallBackRegister("manageConnection") org.apache.http.conn.ClientConnectionManager arg1, org.apache.http.conn.OperatedClientConnection arg2){
  }
  // Methods

  public void flush() throws java.io.IOException{
  }
  public boolean isOpen(){
    return false;
  }
  public int getLocalPort(){
    return 0;
  }
  protected void detach(){
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
  public boolean isSecure(){
    return false;
  }
  public void sendRequestHeader(org.apache.http.HttpRequest arg1) throws org.apache.http.HttpException, java.io.IOException{
  }
  public void sendRequestEntity(org.apache.http.HttpEntityEnclosingRequest arg1) throws org.apache.http.HttpException, java.io.IOException{
  }
  public void receiveResponseEntity(org.apache.http.HttpResponse arg1) throws org.apache.http.HttpException, java.io.IOException{
  }
  public void releaseConnection(){
  }
  protected org.apache.http.conn.ClientConnectionManager getManager(){
    return (org.apache.http.conn.ClientConnectionManager) null;
  }
  public void abortConnection(){
  }
  public void setIdleDuration(long arg1, java.util.concurrent.TimeUnit arg2){
  }
  public void markReusable(){
  }
  public boolean isMarkedReusable(){
    return false;
  }
  public boolean isResponseAvailable(int arg1) throws java.io.IOException{
    return false;
  }
  public org.apache.http.HttpResponse receiveResponseHeader() throws org.apache.http.HttpException, java.io.IOException{
    return (org.apache.http.HttpResponse) null;
  }
  protected org.apache.http.conn.OperatedClientConnection getWrappedConnection(){
    return (org.apache.http.conn.OperatedClientConnection) null;
  }
  protected final void assertNotAborted() throws java.io.InterruptedIOException{
  }
  protected final void assertValid(org.apache.http.conn.OperatedClientConnection arg1){
  }
  public javax.net.ssl.SSLSession getSSLSession(){
    return (javax.net.ssl.SSLSession) null;
  }
  public void unmarkReusable(){
  }
}
