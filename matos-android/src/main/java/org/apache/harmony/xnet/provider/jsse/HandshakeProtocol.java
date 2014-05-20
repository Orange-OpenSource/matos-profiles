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


public abstract class HandshakeProtocol
{
  // Fields

  public static final int NEED_UNWRAP = 1;

  public static final int NOT_HANDSHAKING = 2;

  public static final int FINISHED = 3;

  public static final int NEED_TASK = 4;

  protected int status;

  protected HandshakeIODataStream io_stream;

  protected SSLRecordProtocol recordProtocol;

  protected SSLParametersImpl parameters;

  protected java.util.Vector<DelegatedTask> delegatedTasks;

  protected boolean nonBlocking;

  protected SSLSessionImpl session;

  protected ClientHello clientHello;

  protected ServerHello serverHello;

  protected CertificateMessage serverCert;

  protected ServerKeyExchange serverKeyExchange;

  protected CertificateRequest certificateRequest;

  protected ServerHelloDone serverHelloDone;

  protected CertificateMessage clientCert;

  protected ClientKeyExchange clientKeyExchange;

  protected CertificateVerify certificateVerify;

  protected Finished clientFinished;

  protected Finished serverFinished;

  protected boolean changeCipherSpecReceived;

  protected boolean isResuming;

  protected byte [] preMasterSecret;

  protected java.lang.Exception delegatedTaskErr;

  protected boolean needSendHelloRequest;

  public SSLEngineImpl engineOwner;

  public SSLSocketImpl socketOwner;

  // Constructors

  protected HandshakeProtocol(java.lang.Object arg1){
  }
  // Methods

  protected void shutdown(){
  }
  public abstract void start();
  protected void stop(){
  }
  public byte [] wrap(){
    return (byte []) null;
  }
  public void send(Message arg1){
  }
  protected void fatalAlert(byte arg1, java.lang.String arg2){
  }
  protected void fatalAlert(byte arg1, java.lang.String arg2, java.lang.Exception arg3){
  }
  protected void fatalAlert(byte arg1, javax.net.ssl.SSLException arg2){
  }
  public javax.net.ssl.SSLEngineResult.HandshakeStatus getStatus(){
    return (javax.net.ssl.SSLEngineResult.HandshakeStatus) null;
  }
  public abstract void unwrap(byte [] arg1);
  public SSLSessionImpl getSession(){
    return (SSLSessionImpl) null;
  }
  public abstract void unwrapSSLv2(byte [] arg1);
  public void setRecordProtocol(SSLRecordProtocol arg1){
  }
  protected void sendHelloRequest(){
  }
  protected void unexpectedMessage(){
  }
  public void computerMasterSecret(){
  }
  protected void verifyFinished(byte [] arg1){
  }
  protected void sendChangeCipherSpec(){
  }
  protected void sendWarningAlert(byte arg1){
  }
  protected void clearMessages(){
  }
  protected static int getRSAKeyLength(java.security.PublicKey arg1) throws java.security.NoSuchAlgorithmException, java.security.spec.InvalidKeySpecException{
    return 0;
  }
  protected void computerVerifyDataTLS(java.lang.String arg1, byte [] arg2){
  }
  protected void computerVerifyDataSSLv3(byte [] arg1, byte [] arg2){
  }
  protected void computerReferenceVerifyDataTLS(java.lang.String arg1){
  }
  protected void computerReferenceVerifyDataSSLv3(byte [] arg1){
  }
  @Code("return new Runnable() { public void run() {} };")
  public java.lang.Runnable getTask(){
    return (java.lang.Runnable) null;
  }
}
