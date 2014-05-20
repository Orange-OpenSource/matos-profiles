package javax.net.ssl;

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


public class HandshakeCompletedEvent
  extends java.util.EventObject{
  // Constructors

  public HandshakeCompletedEvent(SSLSocket arg1, SSLSession arg2){
    super((java.lang.Object) null);
  }
  // Methods

  public SSLSession getSession(){
    return (SSLSession) null;
  }
  public java.lang.String getCipherSuite(){
    return (java.lang.String) null;
  }
  public java.security.Principal getPeerPrincipal() throws SSLPeerUnverifiedException{
    return (java.security.Principal) null;
  }
  public java.security.Principal getLocalPrincipal(){
    return (java.security.Principal) null;
  }
  public java.security.cert.Certificate [] getPeerCertificates() throws SSLPeerUnverifiedException{
    return (java.security.cert.Certificate []) null;
  }
  public java.security.cert.Certificate [] getLocalCertificates(){
    return (java.security.cert.Certificate []) null;
  }
  public SSLSocket getSocket(){
    return (SSLSocket) null;
  }
  public javax.security.cert.X509Certificate [] getPeerCertificateChain() throws SSLPeerUnverifiedException{
    return (javax.security.cert.X509Certificate []) null;
  }
}
