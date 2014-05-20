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


@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.ServerSocketChannelImpl", superClass = "")
public abstract class ServerSocketChannel
  extends java.nio.channels.spi.AbstractSelectableChannel{
  // Constructors

  protected ServerSocketChannel(java.nio.channels.spi.SelectorProvider arg1){
    super((java.nio.channels.spi.SelectorProvider) null);
  }
  // Methods

  public abstract SocketChannel accept() throws java.io.IOException;
  public static ServerSocketChannel open() throws java.io.IOException{
    return (ServerSocketChannel) null;
  }
  public abstract java.net.ServerSocket socket();
  public final int validOps(){
    return 0;
  }
}
