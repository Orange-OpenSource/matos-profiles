package org.apache.http.conn.ssl;

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


public class SSLSocketFactory
  implements org.apache.http.conn.scheme.LayeredSocketFactory
{
  // Fields

  public static final java.lang.String TLS = "TLS";

  public static final java.lang.String SSL = "SSL";

  public static final java.lang.String SSLV2 = "SSLv2";

  public static final X509HostnameVerifier ALLOW_ALL_HOSTNAME_VERIFIER = null;

  public static final X509HostnameVerifier BROWSER_COMPATIBLE_HOSTNAME_VERIFIER = null;

  public static final X509HostnameVerifier STRICT_HOSTNAME_VERIFIER = null;

  // Constructors

  public SSLSocketFactory(java.lang.String arg1, java.security.KeyStore arg2, java.lang.String arg3, java.security.KeyStore arg4, java.security.SecureRandom arg5, @com.francetelecom.rd.stubs.annotation.CallBackRegister("resolve") org.apache.http.conn.scheme.HostNameResolver arg6) throws java.security.NoSuchAlgorithmException, java.security.KeyManagementException, java.security.KeyStoreException, java.security.UnrecoverableKeyException{
  }
  public SSLSocketFactory(java.security.KeyStore arg1, java.lang.String arg2, java.security.KeyStore arg3) throws java.security.NoSuchAlgorithmException, java.security.KeyManagementException, java.security.KeyStoreException, java.security.UnrecoverableKeyException{
  }
  public SSLSocketFactory(java.security.KeyStore arg1, java.lang.String arg2) throws java.security.NoSuchAlgorithmException, java.security.KeyManagementException, java.security.KeyStoreException, java.security.UnrecoverableKeyException{
  }
  public SSLSocketFactory(java.security.KeyStore arg1) throws java.security.NoSuchAlgorithmException, java.security.KeyManagementException, java.security.KeyStoreException, java.security.UnrecoverableKeyException{
  }
  public SSLSocketFactory(javax.net.ssl.SSLSocketFactory arg1){
  }
  private SSLSocketFactory(){
  }
  // Methods

  public boolean isSecure(java.net.Socket arg1) throws java.lang.IllegalArgumentException{
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "SSLSocketFactory.createSocket-1", pos = 0, report = "-")
  public java.net.Socket createSocket() throws java.io.IOException{
    return (java.net.Socket) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "SSLSocketFactory.createSocket-2", pos = {0, 1}, report = "-")
  public java.net.Socket createSocket(java.net.Socket arg1, java.lang.String arg2, int arg3, boolean arg4) throws java.io.IOException, java.net.UnknownHostException{
    return (java.net.Socket) null;
  }
  public static SSLSocketFactory getSocketFactory(){
    return (SSLSocketFactory) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "SSLSocketFactory.connectSocket", pos = {1, 2, 4, 6}, report = "-")
  public java.net.Socket connectSocket(java.net.Socket arg1, java.lang.String arg2, int arg3, java.net.InetAddress arg4, int arg5, org.apache.http.params.HttpParams arg6) throws java.io.IOException{
    return (java.net.Socket) null;
  }
  public X509HostnameVerifier getHostnameVerifier(){
    return (X509HostnameVerifier) null;
  }
  public void setHostnameVerifier(X509HostnameVerifier arg1){
  }
}
