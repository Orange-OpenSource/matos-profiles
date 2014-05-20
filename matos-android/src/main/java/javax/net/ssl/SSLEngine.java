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


public abstract class SSLEngine
{
  // Constructors

  protected SSLEngine(){
  }
  protected SSLEngine(java.lang.String arg1, int arg2){
  }
  // Methods

  public abstract SSLEngineResult wrap(java.nio.ByteBuffer [] arg1, int arg2, int arg3, java.nio.ByteBuffer arg4) throws SSLException;
  public SSLEngineResult wrap(java.nio.ByteBuffer [] arg1, java.nio.ByteBuffer arg2) throws SSLException{
    return (SSLEngineResult) null;
  }
  public SSLEngineResult wrap(java.nio.ByteBuffer arg1, java.nio.ByteBuffer arg2) throws SSLException{
    return (SSLEngineResult) null;
  }
  public int getPeerPort(){
    return 0;
  }
  public abstract SSLEngineResult unwrap(java.nio.ByteBuffer arg1, java.nio.ByteBuffer [] arg2, int arg3, int arg4) throws SSLException;
  public SSLEngineResult unwrap(java.nio.ByteBuffer arg1, java.nio.ByteBuffer arg2) throws SSLException{
    return (SSLEngineResult) null;
  }
  public SSLEngineResult unwrap(java.nio.ByteBuffer arg1, java.nio.ByteBuffer [] arg2) throws SSLException{
    return (SSLEngineResult) null;
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
  public SSLParameters getSSLParameters(){
    return (SSLParameters) null;
  }
  public void setSSLParameters(SSLParameters arg1){
  }
  public java.lang.String getPeerHost(){
    return (java.lang.String) null;
  }
  public abstract void beginHandshake() throws SSLException;
  public abstract void closeInbound() throws SSLException;
  public abstract void closeOutbound();
  public abstract java.lang.Runnable getDelegatedTask();
  public abstract SSLEngineResult.HandshakeStatus getHandshakeStatus();
  public abstract boolean isInboundDone();
  public abstract boolean isOutboundDone();
}
