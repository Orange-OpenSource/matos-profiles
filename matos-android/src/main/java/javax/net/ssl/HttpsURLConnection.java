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

import com.francetelecom.rd.stubs.annotation.Real;

@Real("com.francetelecom.rd.fakeandroid.HttpsURLConnectionImpl")
public abstract class HttpsURLConnection
  extends java.net.HttpURLConnection{
  // Fields

  protected HostnameVerifier hostnameVerifier;

  // Constructors

  protected HttpsURLConnection(java.net.URL arg1){
    super((java.net.URL) null);
  }
  // Methods

  public abstract java.lang.String getCipherSuite();
  public java.security.Principal getPeerPrincipal() throws SSLPeerUnverifiedException{
    return (java.security.Principal) null;
  }
  public java.security.Principal getLocalPrincipal(){
    return (java.security.Principal) null;
  }
  public abstract java.security.cert.Certificate [] getLocalCertificates();
  public HostnameVerifier getHostnameVerifier(){
    return (HostnameVerifier) null;
  }
  public SSLSocketFactory getSSLSocketFactory(){
    return (SSLSocketFactory) null;
  }
  public abstract java.security.cert.Certificate [] getServerCertificates() throws SSLPeerUnverifiedException;
  public static void setDefaultHostnameVerifier(HostnameVerifier arg1){
  }
  public static HostnameVerifier getDefaultHostnameVerifier(){
    return (HostnameVerifier) null;
  }
  public static void setDefaultSSLSocketFactory(SSLSocketFactory arg1){
  }
  public static SSLSocketFactory getDefaultSSLSocketFactory(){
    return (SSLSocketFactory) null;
  }
  public void setHostnameVerifier(HostnameVerifier arg1){
  }
  public void setSSLSocketFactory(SSLSocketFactory arg1){
  }
}
