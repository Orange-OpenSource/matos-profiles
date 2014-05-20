package android.net;

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
public class SSLCertificateSocketFactory
  extends javax.net.ssl.SSLSocketFactory{
  // Constructors

  public SSLCertificateSocketFactory(int arg1){
    super();
  }
  private SSLCertificateSocketFactory(int arg1, SSLSessionCache arg2, boolean arg3){
    super();
  }
  // Methods

  public static javax.net.SocketFactory getDefault(int arg1){
    return (javax.net.SocketFactory) null;
  }
  public static javax.net.ssl.SSLSocketFactory getDefault(int arg1, SSLSessionCache arg2){
    return (javax.net.ssl.SSLSocketFactory) null;
  }
  public java.net.Socket createSocket(java.net.Socket arg1, java.lang.String arg2, int arg3, boolean arg4) throws java.io.IOException{
    return (java.net.Socket) null;
  }
  public java.net.Socket createSocket() throws java.io.IOException{
    return (java.net.Socket) null;
  }
  public java.net.Socket createSocket(java.net.InetAddress arg1, int arg2, java.net.InetAddress arg3, int arg4) throws java.io.IOException{
    return (java.net.Socket) null;
  }
  public java.net.Socket createSocket(java.net.InetAddress arg1, int arg2) throws java.io.IOException{
    return (java.net.Socket) null;
  }
  public java.net.Socket createSocket(java.lang.String arg1, int arg2, java.net.InetAddress arg3, int arg4) throws java.io.IOException{
    return (java.net.Socket) null;
  }
  public java.net.Socket createSocket(java.lang.String arg1, int arg2) throws java.io.IOException{
    return (java.net.Socket) null;
  }
  public java.lang.String [] getSupportedCipherSuites(){
    return (java.lang.String []) null;
  }
  public java.lang.String [] getDefaultCipherSuites(){
    return (java.lang.String []) null;
  }
  public static javax.net.ssl.SSLSocketFactory getInsecure(int arg1, SSLSessionCache arg2){
    return (javax.net.ssl.SSLSocketFactory) null;
  }
  public static org.apache.http.conn.ssl.SSLSocketFactory getHttpSocketFactory(int arg1, SSLSessionCache arg2){
    return (org.apache.http.conn.ssl.SSLSocketFactory) null;
  }
  public static void verifyHostname(java.net.Socket arg1, java.lang.String arg2) throws java.io.IOException{
  }
  public void setTrustManagers(javax.net.ssl.TrustManager [] arg1){
  }
  public void setKeyManagers(javax.net.ssl.KeyManager [] arg1){
  }
}
