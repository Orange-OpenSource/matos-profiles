package gov.nist.core.net;

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


public class SslNetworkLayer
  implements NetworkLayer
{
  // Constructors

  public SslNetworkLayer(java.lang.String arg1, java.lang.String arg2, char [] arg3, java.lang.String arg4) throws java.security.GeneralSecurityException, java.io.FileNotFoundException, java.io.IOException{
  }
  // Methods

  public java.net.Socket createSocket(java.net.InetAddress arg1, int arg2) throws java.io.IOException{
    return (java.net.Socket) null;
  }
  public java.net.Socket createSocket(java.net.InetAddress arg1, int arg2, java.net.InetAddress arg3) throws java.io.IOException{
    return (java.net.Socket) null;
  }
  public java.net.Socket createSocket(java.net.InetAddress arg1, int arg2, java.net.InetAddress arg3, int arg4) throws java.io.IOException{
    return (java.net.Socket) null;
  }
  public java.net.ServerSocket createServerSocket(int arg1, int arg2, java.net.InetAddress arg3) throws java.io.IOException{
    return (java.net.ServerSocket) null;
  }
  public java.net.DatagramSocket createDatagramSocket() throws java.net.SocketException{
    return (java.net.DatagramSocket) null;
  }
  public java.net.DatagramSocket createDatagramSocket(int arg1, java.net.InetAddress arg2) throws java.net.SocketException{
    return (java.net.DatagramSocket) null;
  }
  public javax.net.ssl.SSLServerSocket createSSLServerSocket(int arg1, int arg2, java.net.InetAddress arg3) throws java.io.IOException{
    return (javax.net.ssl.SSLServerSocket) null;
  }
  public javax.net.ssl.SSLSocket createSSLSocket(java.net.InetAddress arg1, int arg2) throws java.io.IOException{
    return (javax.net.ssl.SSLSocket) null;
  }
  public javax.net.ssl.SSLSocket createSSLSocket(java.net.InetAddress arg1, int arg2, java.net.InetAddress arg3) throws java.io.IOException{
    return (javax.net.ssl.SSLSocket) null;
  }
}
