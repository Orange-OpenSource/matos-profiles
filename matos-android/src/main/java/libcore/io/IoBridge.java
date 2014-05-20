package libcore.io;

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


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public final class IoBridge
{
  // Fields

  public static final int JAVA_MCAST_JOIN_GROUP = 19;

  public static final int JAVA_MCAST_LEAVE_GROUP = 20;

  public static final int JAVA_IP_MULTICAST_TTL = 17;

  // Constructors

  private IoBridge(){
  }
  // Methods

  public static void write(java.io.FileDescriptor arg1, byte [] arg2, int arg3, int arg4) throws java.io.IOException{
  }
  public static int read(java.io.FileDescriptor arg1, byte [] arg2, int arg3, int arg4) throws java.io.IOException{
    return 0;
  }
  public static int available(java.io.FileDescriptor arg1) throws java.io.IOException{
    return 0;
  }
  public static java.io.FileDescriptor open(java.lang.String arg1, int arg2) throws java.io.FileNotFoundException{
    return (java.io.FileDescriptor) null;
  }
  public static boolean connect(java.io.FileDescriptor arg1, java.net.InetAddress arg2, int arg3) throws java.net.SocketException{
    return false;
  }
  public static boolean connect(java.io.FileDescriptor arg1, java.net.InetAddress arg2, int arg3, int arg4) throws java.net.SocketException, java.net.SocketTimeoutException{
    return false;
  }
  public static void bind(java.io.FileDescriptor arg1, java.net.InetAddress arg2, int arg3) throws java.net.SocketException{
  }
  public static int recvfrom(boolean arg1, java.io.FileDescriptor arg2, byte [] arg3, int arg4, int arg5, int arg6, java.net.DatagramPacket arg7, boolean arg8) throws java.io.IOException{
    return 0;
  }
  public static int recvfrom(boolean arg1, java.io.FileDescriptor arg2, java.nio.ByteBuffer arg3, int arg4, java.net.DatagramPacket arg5, boolean arg6) throws java.io.IOException{
    return 0;
  }
  public static int sendto(java.io.FileDescriptor arg1, byte [] arg2, int arg3, int arg4, int arg5, java.net.InetAddress arg6, int arg7) throws java.io.IOException{
    return 0;
  }
  public static int sendto(java.io.FileDescriptor arg1, java.nio.ByteBuffer arg2, int arg3, java.net.InetAddress arg4, int arg5) throws java.io.IOException{
    return 0;
  }
  public static java.io.FileDescriptor socket(boolean arg1) throws java.net.SocketException{
    return (java.io.FileDescriptor) null;
  }
  public static boolean isConnected(java.io.FileDescriptor arg1, java.net.InetAddress arg2, int arg3, int arg4, int arg5) throws java.io.IOException{
    return false;
  }
  public static void closeSocket(java.io.FileDescriptor arg1) throws java.io.IOException{
  }
  public static java.net.InetAddress getSocketLocalAddress(java.io.FileDescriptor arg1){
    return (java.net.InetAddress) null;
  }
  public static java.lang.Object getSocketOption(java.io.FileDescriptor arg1, int arg2) throws java.net.SocketException{
    return (java.lang.Object) null;
  }
  public static void setSocketOption(java.io.FileDescriptor arg1, int arg2, java.lang.Object arg3) throws java.net.SocketException{
  }
  public static int getSocketLocalPort(java.io.FileDescriptor arg1){
    return 0;
  }
}
