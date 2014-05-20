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


public final class SSLSessionImpl
  implements javax.net.ssl.SSLSession, java.lang.Cloneable
{
  // Fields

  public static final SSLSessionImpl NULL_SESSION = null;

  // Constructors

  public SSLSessionImpl(CipherSuite arg1, java.security.SecureRandom arg2){
  }
  public SSLSessionImpl(java.security.SecureRandom arg1){
  }
  // Methods

  public java.lang.Object clone(){
    return (java.lang.Object) null;
  }
  public java.lang.Object getValue(java.lang.String arg1){
    return (java.lang.Object) null;
  }
  public byte [] getId(){
    return (byte []) null;
  }
  public java.lang.String getProtocol(){
    return (java.lang.String) null;
  }
  public void putValue(java.lang.String arg1, java.lang.Object arg2){
  }
  public boolean isValid(){
    return false;
  }
  public int getPeerPort(){
    return 0;
  }
  public void invalidate(){
  }
  public java.lang.String getCipherSuite(){
    return (java.lang.String) null;
  }
  public java.security.Principal getPeerPrincipal() throws javax.net.ssl.SSLPeerUnverifiedException{
    return (java.security.Principal) null;
  }
  public java.security.Principal getLocalPrincipal(){
    return (java.security.Principal) null;
  }
  public java.security.cert.Certificate [] getPeerCertificates() throws javax.net.ssl.SSLPeerUnverifiedException{
    return (java.security.cert.Certificate []) null;
  }
  public java.security.cert.Certificate [] getLocalCertificates(){
    return (java.security.cert.Certificate []) null;
  }
  public javax.security.cert.X509Certificate [] getPeerCertificateChain() throws javax.net.ssl.SSLPeerUnverifiedException{
    return (javax.security.cert.X509Certificate []) null;
  }
  public java.lang.String getPeerHost(){
    return (java.lang.String) null;
  }
  public long getCreationTime(){
    return 0l;
  }
  public long getLastAccessedTime(){
    return 0l;
  }
  public int getApplicationBufferSize(){
    return 0;
  }
  public int getPacketBufferSize(){
    return 0;
  }
  public javax.net.ssl.SSLSessionContext getSessionContext(){
    return (javax.net.ssl.SSLSessionContext) null;
  }
  public java.lang.String [] getValueNames(){
    return (java.lang.String []) null;
  }
  public void removeValue(java.lang.String arg1){
  }
}
