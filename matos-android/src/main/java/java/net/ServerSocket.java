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


public class ServerSocket
{
  // Constructors

  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "ServerSocket-1", pos = 0, report = "-")
  public ServerSocket() throws java.io.IOException{
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "ServerSocket-2", pos = {0, 1}, report = "-")
  public ServerSocket(int arg1) throws java.io.IOException{
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "ServerSocket-3", pos = {0, 1, 2}, report = "-")
  public ServerSocket(int arg1, int arg2) throws java.io.IOException{
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "ServerSocket-4", pos = {0, 1, 2, 3}, report = "-")
  public ServerSocket(int arg1, int arg2, InetAddress arg3) throws java.io.IOException{
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public void close() throws java.io.IOException{
  }
  public Socket accept() throws java.io.IOException{
    return (Socket) null;
  }
  public java.nio.channels.ServerSocketChannel getChannel(){
    return (java.nio.channels.ServerSocketChannel) null;
  }
  public boolean isClosed(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "ServerSocket.bind-1", pos = {0, 1}, report = "-")
  public void bind(SocketAddress arg1) throws java.io.IOException{
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "ServerSocket.bind-2", pos = {0, 1, 2}, report = "-")
  public void bind(SocketAddress arg1, int arg2) throws java.io.IOException{
  }
  public synchronized int getSoTimeout() throws java.io.IOException{
    return 0;
  }
  public synchronized void setSoTimeout(int arg1) throws SocketException{
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "ServerSocket.getInetAddress", pos = {0, -1}, report = "-")
  public InetAddress getInetAddress(){
    return (InetAddress) null;
  }
  public int getLocalPort(){
    return 0;
  }
  public void setPerformancePreferences(int arg1, int arg2, int arg3){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "ServerSocket.getLocalSocketAddress", pos = {0, -1}, report = "-")
  public SocketAddress getLocalSocketAddress(){
    return (SocketAddress) null;
  }
  protected final void implAccept(Socket arg1) throws java.io.IOException{
  }
  public boolean isBound(){
    return false;
  }
  public SocketImpl getImpl$(){
    return (SocketImpl) null;
  }
  public static synchronized void setSocketFactory(SocketImplFactory arg1) throws java.io.IOException{
  }
  public void setReuseAddress(boolean arg1) throws SocketException{
  }
  public boolean getReuseAddress() throws SocketException{
    return false;
  }
  public void setReceiveBufferSize(int arg1) throws SocketException{
  }
  public int getReceiveBufferSize() throws SocketException{
    return 0;
  }
}
