package org.apache.harmony.xnet.provider.jsse;

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


public class SSLServerSocketFactoryImpl
  extends javax.net.ssl.SSLServerSocketFactory{
  // Constructors

  public SSLServerSocketFactoryImpl(){
    super();
  }
  protected SSLServerSocketFactoryImpl(SSLParametersImpl arg1){
    super();
  }
  // Methods

  public java.lang.String [] getSupportedCipherSuites(){
    return (java.lang.String []) null;
  }
  public java.lang.String [] getDefaultCipherSuites(){
    return (java.lang.String []) null;
  }
  public java.net.ServerSocket createServerSocket() throws java.io.IOException{
    return (java.net.ServerSocket) null;
  }
  public java.net.ServerSocket createServerSocket(int arg1) throws java.io.IOException{
    return (java.net.ServerSocket) null;
  }
  public java.net.ServerSocket createServerSocket(int arg1, int arg2) throws java.io.IOException{
    return (java.net.ServerSocket) null;
  }
  public java.net.ServerSocket createServerSocket(int arg1, int arg2, java.net.InetAddress arg3) throws java.io.IOException{
    return (java.net.ServerSocket) null;
  }
}
