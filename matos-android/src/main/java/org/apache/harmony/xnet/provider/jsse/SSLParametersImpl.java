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


public class SSLParametersImpl
  implements java.lang.Cloneable
{
  // Constructors

  protected SSLParametersImpl(javax.net.ssl.KeyManager [] arg1, javax.net.ssl.TrustManager [] arg2, java.security.SecureRandom arg3, ClientSessionContext arg4, ServerSessionContext arg5) throws java.security.KeyManagementException{
  }
  // Methods

  protected java.lang.Object clone(){
    return (java.lang.Object) null;
  }
  protected static SSLParametersImpl getDefault() throws java.security.KeyManagementException{
    return (SSLParametersImpl) null;
  }
  protected void setUseClientMode(boolean arg1){
  }
  protected java.lang.String [] getEnabledCipherSuites(){
    return (java.lang.String []) null;
  }
  protected java.lang.String [] getEnabledProtocols(){
    return (java.lang.String []) null;
  }
  protected boolean getNeedClientAuth(){
    return false;
  }
  protected void setNeedClientAuth(boolean arg1){
  }
  protected boolean getWantClientAuth(){
    return false;
  }
  protected void setWantClientAuth(boolean arg1){
  }
  protected void setEnabledCipherSuites(java.lang.String [] arg1){
  }
  protected void setEnabledProtocols(java.lang.String [] arg1){
  }
  protected boolean getUseClientMode(){
    return false;
  }
  protected void setEnableSessionCreation(boolean arg1){
  }
  protected boolean getEnableSessionCreation(){
    return false;
  }
  protected java.security.SecureRandom getSecureRandomMember(){
    return (java.security.SecureRandom) null;
  }
  protected ClientSessionContext getClientSessionContext(){
    return (ClientSessionContext) null;
  }
  protected ServerSessionContext getServerSessionContext(){
    return (ServerSessionContext) null;
  }
  protected javax.net.ssl.X509KeyManager getKeyManager(){
    return (javax.net.ssl.X509KeyManager) null;
  }
  protected javax.net.ssl.X509TrustManager getTrustManager(){
    return (javax.net.ssl.X509TrustManager) null;
  }
  protected java.security.SecureRandom getSecureRandom(){
    return (java.security.SecureRandom) null;
  }
  protected CipherSuite [] getEnabledCipherSuitesMember(){
    return (CipherSuite []) null;
  }
  public static javax.net.ssl.X509TrustManager getDefaultTrustManager(){
    return (javax.net.ssl.X509TrustManager) null;
  }
}
