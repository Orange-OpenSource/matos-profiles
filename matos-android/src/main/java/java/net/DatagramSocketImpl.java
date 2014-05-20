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


public abstract class DatagramSocketImpl
  implements SocketOptions
{
  // Fields

  protected java.io.FileDescriptor fd;

  protected int localPort;

  // Constructors

  public DatagramSocketImpl(){
  }
  // Methods

  protected abstract void join(InetAddress arg1) throws java.io.IOException;
  protected abstract void close();
  protected abstract int peek(InetAddress arg1) throws java.io.IOException;
  protected abstract void create() throws SocketException;
  protected abstract void send(DatagramPacket arg1) throws java.io.IOException;
  protected void connect(InetAddress arg1, int arg2) throws SocketException{
  }
  protected abstract void bind(int arg1, InetAddress arg2) throws SocketException;
  protected java.io.FileDescriptor getFileDescriptor(){
    return (java.io.FileDescriptor) null;
  }
  protected int getLocalPort(){
    return 0;
  }
  protected abstract void receive(DatagramPacket arg1) throws java.io.IOException;
  protected void disconnect(){
  }
  protected abstract int getTimeToLive() throws java.io.IOException;
  protected abstract byte getTTL() throws java.io.IOException;
  protected abstract void joinGroup(SocketAddress arg1, NetworkInterface arg2) throws java.io.IOException;
  protected abstract void leaveGroup(SocketAddress arg1, NetworkInterface arg2) throws java.io.IOException;
  protected abstract void setTimeToLive(int arg1) throws java.io.IOException;
  protected abstract void setTTL(byte arg1) throws java.io.IOException;
  protected abstract void leave(InetAddress arg1) throws java.io.IOException;
  protected abstract int peekData(DatagramPacket arg1) throws java.io.IOException;
}
