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


public abstract class SSLSocket
  extends java.net.Socket{
  // Constructors

  protected SSLSocket(){
    super();
  }
  protected SSLSocket(java.lang.String arg1, int arg2) throws java.io.IOException, java.net.UnknownHostException{
    super();
  }
  protected SSLSocket(java.net.InetAddress arg1, int arg2) throws java.io.IOException{
    super();
  }
  protected SSLSocket(java.lang.String arg1, int arg2, java.net.InetAddress arg3, int arg4) throws java.io.IOException, java.net.UnknownHostException{
    super();
  }
  protected SSLSocket(java.net.InetAddress arg1, int arg2, java.net.InetAddress arg3, int arg4) throws java.io.IOException{
    super();
  }
  // Methods

  public void shutdownInput() throws java.io.IOException{
  }
  public void shutdownOutput() throws java.io.IOException{
  }
  public abstract SSLSession getSession();
  public abstract void setUseClientMode(boolean arg1);
  public abstract java.lang.String [] getSupportedCipherSuites();
  public abstract java.lang.String [] getSupportedProtocols();
  public abstract java.lang.String [] getEnabledCipherSuites();
  public abstract java.lang.String [] getEnabledProtocols();
  public abstract boolean getNeedClientAuth();
  public abstract void setNeedClientAuth(boolean arg1);
  public abstract boolean getWantClientAuth();
  public abstract void setWantClientAuth(boolean arg1);
  public abstract void setEnabledCipherSuites(java.lang.String [] arg1);
  public abstract void setEnabledProtocols(java.lang.String [] arg1);
  public abstract boolean getUseClientMode();
  public abstract void setEnableSessionCreation(boolean arg1);
  public abstract boolean getEnableSessionCreation();
  public abstract void startHandshake() throws java.io.IOException;
  public abstract void addHandshakeCompletedListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handshakeCompleted") HandshakeCompletedListener arg1);
  public abstract void removeHandshakeCompletedListener(HandshakeCompletedListener arg1);
  public SSLParameters getSSLParameters(){
    return (SSLParameters) null;
  }
  public void setSSLParameters(SSLParameters arg1){
  }
}
