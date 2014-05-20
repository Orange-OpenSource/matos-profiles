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
public class SocketHttpServerConnection
  extends AbstractHttpServerConnection  implements org.apache.http.HttpInetConnection
{
  // Constructors

  public SocketHttpServerConnection(){
    super();
  }
  // Methods

  public void shutdown() throws java.io.IOException{
  }
  public void close() throws java.io.IOException{
  }
  public boolean isOpen(){
    return false;
  }
  protected void bind(java.net.Socket arg1, org.apache.http.params.HttpParams arg2) throws java.io.IOException{
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
  public void setSocketTimeout(int arg1){
  }
  public int getSocketTimeout(){
    return 0;
  }
  protected void assertOpen(){
  }
  protected java.net.Socket getSocket(){
    return (java.net.Socket) null;
  }
  protected void assertNotOpen(){
  }
  protected org.apache.http.io.SessionInputBuffer createHttpDataReceiver(java.net.Socket arg1, int arg2, org.apache.http.params.HttpParams arg3) throws java.io.IOException{
    return (org.apache.http.io.SessionInputBuffer) null;
  }
  protected org.apache.http.io.SessionOutputBuffer createHttpDataTransmitter(java.net.Socket arg1, int arg2, org.apache.http.params.HttpParams arg3) throws java.io.IOException{
    return (org.apache.http.io.SessionOutputBuffer) null;
  }
}
