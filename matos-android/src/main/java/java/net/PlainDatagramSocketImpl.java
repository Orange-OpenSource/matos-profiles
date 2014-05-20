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


public class PlainDatagramSocketImpl
  extends DatagramSocketImpl{
  // Constructors

  public PlainDatagramSocketImpl(java.io.FileDescriptor arg1, int arg2){
    super();
  }
  public PlainDatagramSocketImpl(){
    super();
  }
  // Methods

  protected void finalize() throws java.lang.Throwable{
  }
  public void join(InetAddress arg1) throws java.io.IOException{
  }
  public synchronized void close(){
  }
  protected int peek(InetAddress arg1) throws java.io.IOException{
    return 0;
  }
  public void create() throws SocketException{
  }
  public void send(DatagramPacket arg1) throws java.io.IOException{
  }
  public void connect(InetAddress arg1, int arg2) throws SocketException{
  }
  public void bind(int arg1, InetAddress arg2) throws SocketException{
  }
  public java.lang.Object getOption(int arg1) throws SocketException{
    return (java.lang.Object) null;
  }
  public void setOption(int arg1, java.lang.Object arg2) throws SocketException{
  }
  public void receive(DatagramPacket arg1) throws java.io.IOException{
  }
  public void disconnect(){
  }
  public int getTimeToLive() throws java.io.IOException{
    return 0;
  }
  public byte getTTL() throws java.io.IOException{
    return (byte) 0;
  }
  public void joinGroup(SocketAddress arg1, NetworkInterface arg2) throws java.io.IOException{
  }
  public void leaveGroup(SocketAddress arg1, NetworkInterface arg2) throws java.io.IOException{
  }
  public void setTimeToLive(int arg1) throws java.io.IOException{
  }
  public void setTTL(byte arg1) throws java.io.IOException{
  }
  public void leave(InetAddress arg1) throws java.io.IOException{
  }
  public int peekData(DatagramPacket arg1) throws java.io.IOException{
    return 0;
  }
}
