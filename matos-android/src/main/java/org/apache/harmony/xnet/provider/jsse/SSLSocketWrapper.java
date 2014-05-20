package org.apache.harmony.xnet.provider.jsse;

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


public class SSLSocketWrapper
  extends SSLSocketImpl{
  // Constructors

  protected SSLSocketWrapper(java.net.Socket arg1, boolean arg2, SSLParametersImpl arg3) throws java.io.IOException{
    super((SSLParametersImpl) null);
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public int getPort(){
    return 0;
  }
  public void connect(java.net.SocketAddress arg1, int arg2) throws java.io.IOException{
  }
  public void connect(java.net.SocketAddress arg1) throws java.io.IOException{
  }
  public boolean isClosed(){
    return false;
  }
  public void bind(java.net.SocketAddress arg1) throws java.io.IOException{
  }
  public int getSoTimeout() throws java.net.SocketException{
    return 0;
  }
  public void setSoTimeout(int arg1) throws java.net.SocketException{
  }
  public boolean getTcpNoDelay() throws java.net.SocketException{
    return false;
  }
  public void setTcpNoDelay(boolean arg1) throws java.net.SocketException{
  }
  public java.net.InetAddress getInetAddress(){
    return (java.net.InetAddress) null;
  }
  public int getLocalPort(){
    return 0;
  }
  public java.net.InetAddress getLocalAddress(){
    return (java.net.InetAddress) null;
  }
  public boolean isConnected(){
    return false;
  }
  public java.net.SocketAddress getLocalSocketAddress(){
    return (java.net.SocketAddress) null;
  }
  public boolean isBound(){
    return false;
  }
  public void setReuseAddress(boolean arg1) throws java.net.SocketException{
  }
  public boolean getReuseAddress() throws java.net.SocketException{
    return false;
  }
  public void setReceiveBufferSize(int arg1) throws java.net.SocketException{
  }
  public int getReceiveBufferSize() throws java.net.SocketException{
    return 0;
  }
  public java.net.SocketAddress getRemoteSocketAddress(){
    return (java.net.SocketAddress) null;
  }
  public void setSoLinger(boolean arg1, int arg2) throws java.net.SocketException{
  }
  public void setKeepAlive(boolean arg1) throws java.net.SocketException{
  }
  public void setTrafficClass(int arg1) throws java.net.SocketException{
  }
  public void setSendBufferSize(int arg1) throws java.net.SocketException{
  }
  public boolean getOOBInline() throws java.net.SocketException{
    return false;
  }
  public boolean getKeepAlive() throws java.net.SocketException{
    return false;
  }
  public int getTrafficClass() throws java.net.SocketException{
    return 0;
  }
  public int getSoLinger() throws java.net.SocketException{
    return 0;
  }
  public int getSendBufferSize() throws java.net.SocketException{
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
  protected void initTransportLayer() throws java.io.IOException{
  }
  protected void closeTransportLayer() throws java.io.IOException{
  }
}
