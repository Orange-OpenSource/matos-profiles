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


public class DatagramSocket
{
  // Constructors

  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "DatagramSocket-1", pos = 0, report = "-")
  public DatagramSocket() throws SocketException{
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "DatagramSocket-2", pos = {0, 1}, report = "-")
  public DatagramSocket(int arg1) throws SocketException{
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "DatagramSocket-3", pos = {0, 1, 2}, report = "-")
  public DatagramSocket(int arg1, InetAddress arg2) throws SocketException{
  }
  protected DatagramSocket(DatagramSocketImpl arg1){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "DatagramSocket-4", pos = {0, 1}, report = "-")
  public DatagramSocket(SocketAddress arg1) throws SocketException{
  }
  // Methods

  public void close(){
  }
  public void send(DatagramPacket arg1) throws java.io.IOException{
  }
  public java.nio.channels.DatagramChannel getChannel(){
    return (java.nio.channels.DatagramChannel) null;
  }
  public int getPort(){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Datagram.connect-2", pos = {0, 1}, report = "-")
  public void connect(SocketAddress arg1) throws SocketException{
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Datagram.connect-1", pos = {0, 1}, report = "-")
  public void connect(InetAddress arg1, int arg2){
  }
  public boolean isClosed(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Datagram.bind", pos = {0, 1}, report = "-")
  public void bind(SocketAddress arg1) throws SocketException{
  }
  public synchronized int getSoTimeout() throws SocketException{
    return 0;
  }
  public synchronized void setSoTimeout(int arg1) throws SocketException{
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Datagram.getInetAddress", pos = {0, -1}, report = "-")
  public InetAddress getInetAddress(){
    return (InetAddress) null;
  }
  public int getLocalPort(){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Datagram.getLocalAddress", pos = {0, -1}, report = "-")
  public InetAddress getLocalAddress(){
    return (InetAddress) null;
  }
  public boolean isConnected(){
    return false;
  }
  public boolean getBroadcast() throws SocketException{
    return false;
  }
  public synchronized void receive(DatagramPacket arg1) throws java.io.IOException{
  }
  public void disconnect(){
  }
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
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Datagram.getRemoteSocketAddress", pos = {0, -1}, report = "-")
  public SocketAddress getRemoteSocketAddress(){
    return (SocketAddress) null;
  }
  public void setTrafficClass(int arg1) throws SocketException{
  }
  public synchronized void setSendBufferSize(int arg1) throws SocketException{
  }
  public int getTrafficClass() throws SocketException{
    return 0;
  }
  public synchronized int getSendBufferSize() throws SocketException{
    return 0;
  }
  public final java.io.FileDescriptor getFileDescriptor$(){
    return (java.io.FileDescriptor) null;
  }
  public void setNetworkInterface(NetworkInterface arg1) throws SocketException{
  }
  public static synchronized void setDatagramSocketImplFactory(DatagramSocketImplFactory arg1) throws java.io.IOException{
  }
  public void setBroadcast(boolean arg1) throws SocketException{
  }
}
