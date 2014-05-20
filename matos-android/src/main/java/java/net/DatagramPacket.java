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


public final class DatagramPacket
{
  // Constructors

  public DatagramPacket(byte [] arg1, int arg2){
  }
  public DatagramPacket(byte [] arg1, int arg2, int arg3){
  }
  public DatagramPacket(byte [] arg1, int arg2, int arg3, InetAddress arg4, int arg5){
  }
  public DatagramPacket(byte [] arg1, int arg2, InetAddress arg3, int arg4){
  }
  public DatagramPacket(byte [] arg1, int arg2, SocketAddress arg3) throws SocketException{
  }
  public DatagramPacket(byte [] arg1, int arg2, int arg3, SocketAddress arg4) throws SocketException{
  }
  // Methods

  public synchronized int getLength(){
    return 0;
  }
  public synchronized InetAddress getAddress(){
    return (InetAddress) null;
  }
  public synchronized void setLength(int arg1){
  }
  public synchronized int getOffset(){
    return 0;
  }
  public synchronized int getPort(){
    return 0;
  }
  public synchronized byte [] getData(){
    return (byte []) null;
  }
  public synchronized void setAddress(InetAddress arg1){
  }
  public synchronized void setData(byte [] arg1, int arg2, int arg3){
  }
  public synchronized void setData(byte [] arg1){
  }
  public synchronized void setPort(int arg1){
  }
  public synchronized SocketAddress getSocketAddress(){
    return (SocketAddress) null;
  }
  public synchronized void setSocketAddress(SocketAddress arg1){
  }
}
