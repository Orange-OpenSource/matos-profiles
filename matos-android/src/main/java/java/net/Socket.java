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


public class Socket
{
  // Constructors

  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Socket-1", pos = 0, report = "-")
  public Socket(){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Socket-2", pos = {0, 1}, report = "-")
  public Socket(Proxy arg1){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Socket-3", pos = {0, 1, 2}, report = "-")
  public Socket(java.lang.String arg1, int arg2) throws UnknownHostException, java.io.IOException{
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Socket-4", pos = {0, 1, 2, 3}, report = "-")
  public Socket(java.lang.String arg1, int arg2, InetAddress arg3, int arg4) throws java.io.IOException{
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Socket-5", pos = {0, 1, 2, 3}, report = "-")
  public Socket(java.lang.String arg1, int arg2, boolean arg3) throws java.io.IOException{
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Socket-6", pos = {0, 1, 2}, report = "-")
  public Socket(InetAddress arg1, int arg2) throws java.io.IOException{
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Socket-7", pos = {0, 1, 2, 3, 4}, report = "-")
  public Socket(InetAddress arg1, int arg2, InetAddress arg3, int arg4) throws java.io.IOException{
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Socket-8", pos = {0, 1, 2, 3}, report = "-")
  public Socket(InetAddress arg1, int arg2, boolean arg3) throws java.io.IOException{
  }
  protected Socket(SocketImpl arg1) throws SocketException{
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public synchronized void close() throws java.io.IOException{
  }
  public java.nio.channels.SocketChannel getChannel(){
    return (java.nio.channels.SocketChannel) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Socket.getInputStream", pos = {0, -1}, report = "-")
  public java.io.InputStream getInputStream() throws java.io.IOException{
    return (java.io.InputStream) null;
  }
  public int getPort(){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Socket.connect-1", pos = {0, 1}, report = "-")
  public void connect(SocketAddress arg1) throws java.io.IOException{
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Socket.connect-2", pos = {0, 1, 2}, report = "-")
  public void connect(SocketAddress arg1, int arg2) throws java.io.IOException{
  }
  public boolean isClosed(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Socket.getOutputStream", pos = {0, -1}, report = "-")
  public java.io.OutputStream getOutputStream() throws java.io.IOException{
    return (java.io.OutputStream) null;
  }
  public void bind(SocketAddress arg1) throws java.io.IOException{
  }
  public synchronized int getSoTimeout() throws SocketException{
    return 0;
  }
  public synchronized void setSoTimeout(int arg1) throws SocketException{
  }
  public boolean getTcpNoDelay() throws SocketException{
    return false;
  }
  public void setTcpNoDelay(boolean arg1) throws SocketException{
  }
  public InetAddress getInetAddress(){
    return (InetAddress) null;
  }
  public int getLocalPort(){
    return 0;
  }
  public void shutdownInput() throws java.io.IOException{
  }
  public void shutdownOutput() throws java.io.IOException{
  }
  public void sendUrgentData(int arg1) throws java.io.IOException{
  }
  public void setPerformancePreferences(int arg1, int arg2, int arg3){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Socket.getInetAddress", pos = {0, -1}, report = "-")
  public InetAddress getLocalAddress(){
    return (InetAddress) null;
  }
  public boolean isConnected(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Socket.getLocalSocketAddress", pos = {0, -1}, report = "-")
  public SocketAddress getLocalSocketAddress(){
    return (SocketAddress) null;
  }
  public boolean isBound(){
    return false;
  }
  public void setReuseAddress(boolean arg1) throws SocketException{
  }
  public boolean getReuseAddress() throws SocketException{
    return false;
  }
  public synchronized void setReceiveBufferSize(int arg1) throws SocketException{
  }
  public synchronized int getReceiveBufferSize() throws SocketException{
    return 0;
  }
  public SocketAddress getRemoteSocketAddress(){
    return (SocketAddress) null;
  }
  public void setSoLinger(boolean arg1, int arg2) throws SocketException{
  }
  public void setKeepAlive(boolean arg1) throws SocketException{
  }
  public void setTrafficClass(int arg1) throws SocketException{
  }
  public synchronized void setSendBufferSize(int arg1) throws SocketException{
  }
  public boolean getOOBInline() throws SocketException{
    return false;
  }
  public boolean getKeepAlive() throws SocketException{
    return false;
  }
  public int getTrafficClass() throws SocketException{
    return 0;
  }
  public int getSoLinger() throws SocketException{
    return 0;
  }
  public synchronized int getSendBufferSize() throws SocketException{
    return 0;
  }
  public boolean isOutputShutdown(){
    return false;
  }
  public boolean isInputShutdown(){
    return false;
  }
  public java.io.FileDescriptor getFileDescriptor$(){
    return (java.io.FileDescriptor) null;
  }
  public void setOOBInline(boolean arg1) throws SocketException{
  }
  public static synchronized void setSocketImplFactory(SocketImplFactory arg1) throws java.io.IOException{
  }
}
