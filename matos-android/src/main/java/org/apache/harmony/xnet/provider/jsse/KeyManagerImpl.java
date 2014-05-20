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


public class KeyManagerImpl
  extends javax.net.ssl.X509ExtendedKeyManager{
  // Constructors

  public KeyManagerImpl(java.security.KeyStore arg1, char [] arg2){
    super();
  }
  // Methods

  public java.security.cert.X509Certificate [] getCertificateChain(java.lang.String arg1){
    return (java.security.cert.X509Certificate []) null;
  }
  public java.security.PrivateKey getPrivateKey(java.lang.String arg1){
    return (java.security.PrivateKey) null;
  }
  public java.lang.String chooseServerAlias(java.lang.String arg1, java.security.Principal [] arg2, java.net.Socket arg3){
    return (java.lang.String) null;
  }
  public java.lang.String chooseClientAlias(java.lang.String [] arg1, java.security.Principal [] arg2, java.net.Socket arg3){
    return (java.lang.String) null;
  }
  public java.lang.String chooseEngineServerAlias(java.lang.String arg1, java.security.Principal [] arg2, javax.net.ssl.SSLEngine arg3){
    return (java.lang.String) null;
  }
  public java.lang.String [] getClientAliases(java.lang.String arg1, java.security.Principal [] arg2){
    return (java.lang.String []) null;
  }
  public java.lang.String [] getServerAliases(java.lang.String arg1, java.security.Principal [] arg2){
    return (java.lang.String []) null;
  }
  public java.lang.String chooseEngineClientAlias(java.lang.String [] arg1, java.security.Principal [] arg2, javax.net.ssl.SSLEngine arg3){
    return (java.lang.String) null;
  }
}
