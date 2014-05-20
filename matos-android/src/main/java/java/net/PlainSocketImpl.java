package java.net;

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


public class PlainSocketImpl
  extends SocketImpl{
  // Constructors

  public PlainSocketImpl(java.io.FileDescriptor arg1){
    super();
  }
  public PlainSocketImpl(Proxy arg1){
    super();
  }
  public PlainSocketImpl(){
    super();
  }
  public PlainSocketImpl(java.io.FileDescriptor arg1, int arg2, InetAddress arg3, int arg4){
    super();
  }
  // Methods

  protected void finalize() throws java.lang.Throwable{
  }
  protected synchronized void close() throws java.io.IOException{
  }
  protected void create(boolean arg1) throws java.io.IOException{
  }
  protected void accept(SocketImpl arg1) throws java.io.IOException{
  }
  protected synchronized int available() throws java.io.IOException{
    return 0;
  }
  protected synchronized java.io.InputStream getInputStream() throws java.io.IOException{
    return (java.io.InputStream) null;
  }
  protected void connect(java.lang.String arg1, int arg2) throws java.io.IOException{
  }
  protected void connect(InetAddress arg1, int arg2) throws java.io.IOException{
  }
  protected void connect(SocketAddress arg1, int arg2) throws java.io.IOException{
  }
  protected synchronized java.io.OutputStream getOutputStream() throws java.io.IOException{
    return (java.io.OutputStream) null;
  }
  protected void bind(InetAddress arg1, int arg2) throws java.io.IOException{
  }
  protected void listen(int arg1) throws java.io.IOException{
  }
  protected void shutdownInput() throws java.io.IOException{
  }
  protected void shutdownOutput() throws java.io.IOException{
  }
  protected boolean supportsUrgentData(){
    return false;
  }
  protected void sendUrgentData(int arg1) throws java.io.IOException{
  }
  public java.lang.Object getOption(int arg1) throws SocketException{
    return (java.lang.Object) null;
  }
  public void setOption(int arg1, java.lang.Object arg2) throws SocketException{
  }
  public void initLocalPort(int arg1){
  }
  public void initRemoteAddressAndPort(InetAddress arg1, int arg2){
  }
  public void socksAccept() throws java.io.IOException{
  }
}
