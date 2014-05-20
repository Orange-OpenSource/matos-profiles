package java.nio.channels;

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


@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.DatagramChannelImpl", superClass = "")
public abstract class DatagramChannel
  extends java.nio.channels.spi.AbstractSelectableChannel  implements ScatteringByteChannel, ByteChannel, GatheringByteChannel
{
  // Constructors

  protected DatagramChannel(java.nio.channels.spi.SelectorProvider arg1){
    super((java.nio.channels.spi.SelectorProvider) null);
  }
  // Methods

  public abstract int write(java.nio.ByteBuffer arg1) throws java.io.IOException;
  public abstract long write(java.nio.ByteBuffer [] arg1, int arg2, int arg3) throws java.io.IOException;
  public final synchronized long write(java.nio.ByteBuffer [] arg1) throws java.io.IOException{
    return 0l;
  }
  public abstract int read(java.nio.ByteBuffer arg1) throws java.io.IOException;
  public abstract long read(java.nio.ByteBuffer [] arg1, int arg2, int arg3) throws java.io.IOException;
  public final synchronized long read(java.nio.ByteBuffer [] arg1) throws java.io.IOException{
    return 0l;
  }
  public abstract int send(java.nio.ByteBuffer arg1, java.net.SocketAddress arg2) throws java.io.IOException;
  public static DatagramChannel open() throws java.io.IOException{
    return (DatagramChannel) null;
  }
  public abstract DatagramChannel connect(java.net.SocketAddress arg1) throws java.io.IOException;
  public abstract java.net.DatagramSocket socket();
  public abstract boolean isConnected();
  public abstract java.net.SocketAddress receive(java.nio.ByteBuffer arg1) throws java.io.IOException;
  public abstract DatagramChannel disconnect() throws java.io.IOException;
  public final int validOps(){
    return 0;
  }
}
