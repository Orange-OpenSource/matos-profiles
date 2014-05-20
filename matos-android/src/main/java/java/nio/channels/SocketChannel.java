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


@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.socketChannelImpl", superClass = "")
public abstract class SocketChannel
  extends java.nio.channels.spi.AbstractSelectableChannel  implements ScatteringByteChannel, ByteChannel, GatheringByteChannel
{
  // Constructors

  protected SocketChannel(java.nio.channels.spi.SelectorProvider arg1){
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
  public static SocketChannel open() throws java.io.IOException{
    return (SocketChannel) null;
  }
  public static SocketChannel open(java.net.SocketAddress arg1) throws java.io.IOException{
    return (SocketChannel) null;
  }
  public abstract boolean connect(java.net.SocketAddress arg1) throws java.io.IOException;
  public abstract java.net.Socket socket();
  public abstract boolean isConnected();
  public final int validOps(){
    return 0;
  }
  public abstract boolean isConnectionPending();
  public abstract boolean finishConnect() throws java.io.IOException;
}
