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

import com.francetelecom.rd.stubs.annotation.Code;


public class SSLEngineImpl
  extends javax.net.ssl.SSLEngine{
  // Fields

  protected SSLRecordProtocol recordProtocol;

  protected SSLParametersImpl sslParameters;

  // Constructors

  protected SSLEngineImpl(SSLParametersImpl arg1){
    super();
  }
  protected SSLEngineImpl(java.lang.String arg1, int arg2, SSLParametersImpl arg3){
    super();
  }
  // Methods

  public javax.net.ssl.SSLEngineResult wrap(java.nio.ByteBuffer [] arg1, int arg2, int arg3, java.nio.ByteBuffer arg4) throws javax.net.ssl.SSLException{
    return (javax.net.ssl.SSLEngineResult) null;
  }
  public javax.net.ssl.SSLEngineResult unwrap(java.nio.ByteBuffer arg1, java.nio.ByteBuffer [] arg2, int arg3, int arg4) throws javax.net.ssl.SSLException{
    return (javax.net.ssl.SSLEngineResult) null;
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
  public void beginHandshake() throws javax.net.ssl.SSLException{
  }
  public void closeInbound() throws javax.net.ssl.SSLException{
  }
  public void closeOutbound(){
  }
  @Code("return new Runnable() { public void run() {} };")
  public java.lang.Runnable getDelegatedTask(){
    return (java.lang.Runnable) null;
  }
  public javax.net.ssl.SSLEngineResult.HandshakeStatus getHandshakeStatus(){
    return (javax.net.ssl.SSLEngineResult.HandshakeStatus) null;
  }
  public boolean isInboundDone(){
    return false;
  }
  public boolean isOutboundDone(){
    return false;
  }
}
