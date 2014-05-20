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


public abstract class SocketImpl
  implements SocketOptions
{
  // Fields

  protected InetAddress address;

  protected int port;

  protected java.io.FileDescriptor fd;

  protected int localport;

  // Constructors

  public SocketImpl(){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  protected abstract void close() throws java.io.IOException;
  protected abstract void create(boolean arg1) throws java.io.IOException;
  protected abstract void accept(SocketImpl arg1) throws java.io.IOException;
  protected abstract int available() throws java.io.IOException;
  protected abstract java.io.InputStream getInputStream() throws java.io.IOException;
  protected int getPort(){
    return 0;
  }
  protected abstract void connect(java.lang.String arg1, int arg2) throws java.io.IOException;
  protected abstract void connect(InetAddress arg1, int arg2) throws java.io.IOException;
  protected abstract void connect(SocketAddress arg1, int arg2) throws java.io.IOException;
  protected abstract java.io.OutputStream getOutputStream() throws java.io.IOException;
  protected abstract void bind(InetAddress arg1, int arg2) throws java.io.IOException;
  protected abstract void listen(int arg1) throws java.io.IOException;
  protected java.io.FileDescriptor getFileDescriptor(){
    return (java.io.FileDescriptor) null;
  }
  public java.io.FileDescriptor getFD$(){
    return (java.io.FileDescriptor) null;
  }
  protected InetAddress getInetAddress(){
    return (InetAddress) null;
  }
  protected int getLocalPort(){
    return 0;
  }
  protected void shutdownInput() throws java.io.IOException{
  }
  protected void shutdownOutput() throws java.io.IOException{
  }
  protected boolean supportsUrgentData(){
    return false;
  }
  protected abstract void sendUrgentData(int arg1) throws java.io.IOException;
  protected void setPerformancePreferences(int arg1, int arg2, int arg3){
  }
}
