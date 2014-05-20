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


public class MulticastSocket
  extends DatagramSocket{
  // Constructors

  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "MulticastSocket-1", pos = 0, report = "-")
  public MulticastSocket() throws java.io.IOException{
    super();
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "MulticastSocket-2", pos = {0, 1}, report = "-")
  public MulticastSocket(int arg1) throws java.io.IOException{
    super();
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "MulticastSocket-3", pos = {0, 1}, report = "-")
  public MulticastSocket(SocketAddress arg1) throws java.io.IOException{
    super();
  }
  // Methods

  public void send(DatagramPacket arg1, byte arg2) throws java.io.IOException{
  }
  public int getTimeToLive() throws java.io.IOException{
    return 0;
  }
  public void setInterface(InetAddress arg1) throws SocketException{
  }
  public InetAddress getInterface() throws SocketException{
    return (InetAddress) null;
  }
  public NetworkInterface getNetworkInterface() throws SocketException{
    return (NetworkInterface) null;
  }
  public byte getTTL() throws java.io.IOException{
    return (byte) 0;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "MulticastSocket.joinGroup-1", pos = {0, 1}, report = "-")
  public void joinGroup(InetAddress arg1) throws java.io.IOException{
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "MulticastSocket.joinGroup-2", pos = {0, 1}, report = "-")
  public void joinGroup(SocketAddress arg1, NetworkInterface arg2) throws java.io.IOException{
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "MulticastSocket.joinGroup-3", pos = {0, 1}, report = "-")
  public void leaveGroup(InetAddress arg1) throws java.io.IOException{
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "MulticastSocket.joinGroup-4", pos = {0, 1}, report = "-")
  public void leaveGroup(SocketAddress arg1, NetworkInterface arg2) throws java.io.IOException{
  }
  public void setNetworkInterface(NetworkInterface arg1) throws SocketException{
  }
  public void setTimeToLive(int arg1) throws java.io.IOException{
  }
  public void setTTL(byte arg1) throws java.io.IOException{
  }
  public boolean getLoopbackMode() throws SocketException{
    return false;
  }
  public void setLoopbackMode(boolean arg1) throws SocketException{
  }
}
