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


public class SSLSocketImpl
  extends javax.net.ssl.SSLSocket{
  // Fields

  protected SSLRecordProtocol recordProtocol;

  protected SSLParametersImpl sslParameters;

  protected java.io.InputStream input;

  protected java.io.OutputStream output;

  // Constructors

  protected SSLSocketImpl(SSLParametersImpl arg1){
    super();
  }
  protected SSLSocketImpl(java.lang.String arg1, int arg2, SSLParametersImpl arg3) throws java.io.IOException, java.net.UnknownHostException{
    super();
  }
  protected SSLSocketImpl(java.lang.String arg1, int arg2, java.net.InetAddress arg3, int arg4, SSLParametersImpl arg5) throws java.io.IOException, java.net.UnknownHostException{
    super();
  }
  protected SSLSocketImpl(java.net.InetAddress arg1, int arg2, SSLParametersImpl arg3) throws java.io.IOException{
    super();
  }
  protected SSLSocketImpl(java.net.InetAddress arg1, int arg2, java.net.InetAddress arg3, int arg4, SSLParametersImpl arg5) throws java.io.IOException{
    super();
  }
  // Methods

  protected void init() throws java.io.IOException{
  }
  public void close() throws java.io.IOException{
  }
  public java.io.InputStream getInputStream() throws java.io.IOException{
    return (java.io.InputStream) null;
  }
  public void connect(java.net.SocketAddress arg1) throws java.io.IOException{
  }
  public void connect(java.net.SocketAddress arg1, int arg2) throws java.io.IOException{
  }
  public java.io.OutputStream getOutputStream() throws java.io.IOException{
    return (java.io.OutputStream) null;
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
  public void startHandshake() throws java.io.IOException{
  }
  public void addHandshakeCompletedListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handshakeCompleted") javax.net.ssl.HandshakeCompletedListener arg1){
  }
  public void removeHandshakeCompletedListener(javax.net.ssl.HandshakeCompletedListener arg1){
  }
  public void setOOBInline(boolean arg1) throws java.net.SocketException{
  }
  protected void initTransportLayer() throws java.io.IOException{
  }
  protected void closeTransportLayer() throws java.io.IOException{
  }
  protected void needAppData() throws java.io.IOException{
  }
  protected void writeAppData(byte [] arg1, int arg2, int arg3) throws java.io.IOException{
  }
}
