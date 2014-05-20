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


public class OpenSSLSocketImpl
  extends javax.net.ssl.SSLSocket  implements NativeCrypto.SSLHandshakeCallbacks
{
  // Constructors

  protected OpenSSLSocketImpl(SSLParametersImpl arg1) throws java.io.IOException{
    super();
  }
  protected OpenSSLSocketImpl(SSLParametersImpl arg1, java.lang.String [] arg2, java.lang.String [] arg3, java.lang.String [] arg4) throws java.io.IOException{
    super();
  }
  protected OpenSSLSocketImpl(java.lang.String arg1, int arg2, SSLParametersImpl arg3) throws java.io.IOException{
    super();
  }
  protected OpenSSLSocketImpl(java.net.InetAddress arg1, int arg2, SSLParametersImpl arg3) throws java.io.IOException{
    super();
  }
  protected OpenSSLSocketImpl(java.lang.String arg1, int arg2, java.net.InetAddress arg3, int arg4, SSLParametersImpl arg5) throws java.io.IOException{
    super();
  }
  protected OpenSSLSocketImpl(java.net.InetAddress arg1, int arg2, java.net.InetAddress arg3, int arg4, SSLParametersImpl arg5) throws java.io.IOException{
    super();
  }
  protected OpenSSLSocketImpl(java.net.Socket arg1, java.lang.String arg2, int arg3, boolean arg4, SSLParametersImpl arg5) throws java.io.IOException{
    super();
  }
  // Methods

  protected void finalize() throws java.lang.Throwable{
  }
  public void close() throws java.io.IOException{
  }
  public java.io.InputStream getInputStream() throws java.io.IOException{
    return (java.io.InputStream) null;
  }
  public java.io.OutputStream getOutputStream() throws java.io.IOException{
    return (java.io.OutputStream) null;
  }
  public int getSoTimeout() throws java.net.SocketException{
    return 0;
  }
  public void setSoTimeout(int arg1) throws java.net.SocketException{
  }
  public void sendUrgentData(int arg1) throws java.io.IOException{
  }
  public javax.net.ssl.SSLSession getSession(){
    return (javax.net.ssl.SSLSession) null;
  }
  public void setUseClientMode(boolean arg1){
  }
  public java.lang.String [] getSupportedCipherSuites(){
    return (java.lang.String []) null;
  }
  public java.lang.String [] getSupportedProtocols(){
    return (java.lang.String []) null;
  }
  public java.lang.String [] getEnabledCipherSuites(){
    return (java.lang.String []) null;
  }
  public java.lang.String [] getEnabledProtocols(){
    return (java.lang.String []) null;
  }
  public boolean getNeedClientAuth(){
    return false;
  }
  public void setNeedClientAuth(boolean arg1){
  }
  public boolean getWantClientAuth(){
    return false;
  }
  public void setWantClientAuth(boolean arg1){
  }
  public void setEnabledCipherSuites(java.lang.String [] arg1){
  }
  public void setEnabledProtocols(java.lang.String [] arg1){
  }
  public boolean getUseClientMode(){
    return false;
  }
  public void setEnableSessionCreation(boolean arg1){
  }
  public boolean getEnableSessionCreation(){
    return false;
  }
  public void setHostname(@com.francetelecom.rd.stubs.annotation.FieldSet("hostname") java.lang.String arg1){
  }
  public java.io.FileDescriptor getFileDescriptor$(){
    return (java.io.FileDescriptor) null;
  }
  public void handshakeCompleted(){
  }
  public void startHandshake() throws java.io.IOException{
  }
  public synchronized void startHandshake(boolean arg1) throws java.io.IOException{
  }
  public void clientCertificateRequested(byte [] arg1, byte [] [] arg2) throws java.security.cert.CertificateEncodingException, javax.net.ssl.SSLException{
  }
  public void verifyCertificateChain(byte [] [] arg1, java.lang.String arg2) throws java.security.cert.CertificateException{
  }
  public void addHandshakeCompletedListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handshakeCompleted") javax.net.ssl.HandshakeCompletedListener arg1){
  }
  public void removeHandshakeCompletedListener(javax.net.ssl.HandshakeCompletedListener arg1){
  }
  public java.lang.String [] getSupportedCompressionMethods(){
    return (java.lang.String []) null;
  }
  public java.lang.String [] getEnabledCompressionMethods(){
    return (java.lang.String []) null;
  }
  public void setEnabledCompressionMethods(java.lang.String [] arg1){
  }
  public void setUseSessionTickets(boolean arg1){
  }
  public void setOOBInline(boolean arg1) throws java.net.SocketException{
  }
  public void setHandshakeTimeout(int arg1) throws java.net.SocketException{
  }
}
