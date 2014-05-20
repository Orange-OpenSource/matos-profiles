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


public class SSLContextImpl
  extends javax.net.ssl.SSLContextSpi{
  // Fields

  protected SSLParametersImpl sslParameters;

  // Constructors

  public SSLContextImpl(){
    super();
  }
  protected SSLContextImpl(DefaultSSLContextImpl arg1) throws java.security.GeneralSecurityException, java.io.IOException{
    super();
  }
  // Methods

  public void engineInit(javax.net.ssl.KeyManager [] arg1, javax.net.ssl.TrustManager [] arg2, java.security.SecureRandom arg3) throws java.security.KeyManagementException{
  }
  public javax.net.ssl.SSLSocketFactory engineGetSocketFactory(){
    return (javax.net.ssl.SSLSocketFactory) null;
  }
  public javax.net.ssl.SSLServerSocketFactory engineGetServerSocketFactory(){
    return (javax.net.ssl.SSLServerSocketFactory) null;
  }
  public javax.net.ssl.SSLEngine engineCreateSSLEngine(java.lang.String arg1, int arg2){
    return (javax.net.ssl.SSLEngine) null;
  }
  public javax.net.ssl.SSLEngine engineCreateSSLEngine(){
    return (javax.net.ssl.SSLEngine) null;
  }
  public ServerSessionContext engineGetServerSessionContext(){
    return (ServerSessionContext) null;
  }
  public ClientSessionContext engineGetClientSessionContext(){
    return (ClientSessionContext) null;
  }
}
