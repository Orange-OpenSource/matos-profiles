package gov.nist.javax.sip.stack;

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


public abstract class SIPTransaction
  extends MessageChannel  implements gov.nist.javax.sip.TransactionExt, javax.sip.Transaction
{
  // Fields

  protected boolean toListener;

  protected int BASE_TIMER_INTERVAL;

  protected int T4;

  protected int T2;

  protected int TIMER_I;

  protected int TIMER_K;

  protected int TIMER_D;

  protected static final int T1 = 0;

  protected static final int TIMER_A = 0;

  protected static final int TIMER_B = 0;

  protected static final int TIMER_J = 0;

  protected static final int TIMER_F = 0;

  protected static final int TIMER_H = 0;

  protected java.lang.Object applicationData;

  protected gov.nist.javax.sip.message.SIPResponse lastResponse;

  protected boolean isMapped;

  protected boolean isSemaphoreAquired;

  protected java.lang.String transactionId;

  public long auditTag;

  public static final javax.sip.TransactionState INITIAL_STATE = null;

  public static final javax.sip.TransactionState TRYING_STATE = null;

  public static final javax.sip.TransactionState CALLING_STATE = null;

  public static final javax.sip.TransactionState PROCEEDING_STATE = null;

  public static final javax.sip.TransactionState COMPLETED_STATE = null;

  public static final javax.sip.TransactionState CONFIRMED_STATE = null;

  public static final javax.sip.TransactionState TERMINATED_STATE = null;

  protected static final int MAXIMUM_RETRANSMISSION_TICK_COUNT = 0;

  protected SIPTransactionStack sipStack;

  protected gov.nist.javax.sip.message.SIPRequest originalRequest;

  protected int peerPort;

  protected java.net.InetAddress peerInetAddress;

  protected java.lang.String peerAddress;

  protected java.lang.String peerProtocol;

  protected int peerPacketSourcePort;

  protected java.net.InetAddress peerPacketSourceAddress;

  protected java.util.concurrent.atomic.AtomicBoolean transactionTimerStarted;

  protected int timeoutTimerTicksLeft;

  protected gov.nist.javax.sip.header.From from;

  protected gov.nist.javax.sip.header.To to;

  protected gov.nist.javax.sip.header.Event event;

  protected gov.nist.javax.sip.header.CallID callId;

  protected int collectionTime;

  protected java.lang.String toTag;

  protected java.lang.String fromTag;

  // Constructors

  protected SIPTransaction(SIPTransactionStack arg1, MessageChannel arg2){
    super();
  }
  // Methods

  public int hashCode(){
    return 0;
  }
  public java.lang.String getKey(){
    return (java.lang.String) null;
  }
  public final java.lang.String getMethod(){
    return (java.lang.String) null;
  }
  public javax.sip.TransactionState getState(){
    return (javax.sip.TransactionState) null;
  }
  public void close(){
  }
  public void setState(javax.sip.TransactionState arg1){
  }
  public java.lang.String getHost(){
    return (java.lang.String) null;
  }
  public int getPort(){
    return 0;
  }
  public void sendMessage(gov.nist.javax.sip.message.SIPMessage arg1) throws java.io.IOException{
  }
  protected void sendMessage(byte [] arg1, java.net.InetAddress arg2, int arg3, boolean arg4) throws java.io.IOException{
  }
  public SIPTransactionStack getSIPStack(){
    return (SIPTransactionStack) null;
  }
  public boolean isReliable(){
    return false;
  }
  public java.lang.String getTransport(){
    return (java.lang.String) null;
  }
  public java.lang.String getPeerAddress(){
    return (java.lang.String) null;
  }
  protected java.net.InetAddress getPeerInetAddress(){
    return (java.net.InetAddress) null;
  }
  protected java.lang.String getPeerProtocol(){
    return (java.lang.String) null;
  }
  public java.lang.String getViaHost(){
    return (java.lang.String) null;
  }
  public int getViaPort(){
    return 0;
  }
  public int getPeerPort(){
    return 0;
  }
  public int getPeerPacketSourcePort(){
    return 0;
  }
  public java.net.InetAddress getPeerPacketSourceAddress(){
    return (java.net.InetAddress) null;
  }
  public boolean isSecure(){
    return false;
  }
  public MessageProcessor getMessageProcessor(){
    return (MessageProcessor) null;
  }
  public gov.nist.javax.sip.header.Via getViaHeader(){
    return (gov.nist.javax.sip.header.Via) null;
  }
  public javax.sip.message.Response getResponse(){
    return (javax.sip.message.Response) null;
  }
  public void setApplicationData(java.lang.Object arg1){
  }
  public java.lang.Object getApplicationData(){
    return (java.lang.Object) null;
  }
  public abstract javax.sip.Dialog getDialog();
  public void releaseSem(){
  }
  public boolean acquireSem(){
    return false;
  }
  public java.lang.String getTransactionId(){
    return (java.lang.String) null;
  }
  public final long getCSeq(){
    return 0l;
  }
  public java.lang.String getCipherSuite() throws java.lang.UnsupportedOperationException{
    return (java.lang.String) null;
  }
  public javax.sip.message.Request getRequest(){
    return (javax.sip.message.Request) null;
  }
  protected boolean isServerTransaction(){
    return false;
  }
  public gov.nist.javax.sip.SipProviderImpl getSipProvider(){
    return (gov.nist.javax.sip.SipProviderImpl) null;
  }
  public java.security.cert.Certificate [] getPeerCertificates() throws javax.net.ssl.SSLPeerUnverifiedException{
    return (java.security.cert.Certificate []) null;
  }
  public java.security.cert.Certificate [] getLocalCertificates() throws java.lang.UnsupportedOperationException{
    return (java.security.cert.Certificate []) null;
  }
  public java.lang.String getBranchId(){
    return (java.lang.String) null;
  }
  public int getRetransmitTimer(){
    return 0;
  }
  public void setRetransmitTimer(int arg1){
  }
  public final boolean isTerminated(){
    return false;
  }
  protected abstract void fireTimeoutTimer();
  public abstract boolean isMessagePartOfTransaction(gov.nist.javax.sip.message.SIPMessage arg1);
  public abstract void setDialog(SIPDialog arg1, java.lang.String arg2);
  protected abstract void fireRetransmissionTimer();
  protected abstract void startTransactionTimer();
  public boolean passToListener(){
    return false;
  }
  public final boolean isInviteTransaction(){
    return false;
  }
  public gov.nist.javax.sip.message.SIPResponse getLastResponse(){
    return (gov.nist.javax.sip.message.SIPResponse) null;
  }
  public gov.nist.javax.sip.message.SIPRequest getOriginalRequest(){
    return (gov.nist.javax.sip.message.SIPRequest) null;
  }
  public void setPassToListener(){
  }
  public final java.lang.String getBranch(){
    return (java.lang.String) null;
  }
  public boolean doesCancelMatchTransaction(gov.nist.javax.sip.message.SIPRequest arg1){
    return false;
  }
  public void setOriginalRequest(gov.nist.javax.sip.message.SIPRequest arg1){
  }
  public MessageChannel getMessageChannel(){
    return (MessageChannel) null;
  }
  protected synchronized boolean testAndSetTransactionTerminatedEvent(){
    return false;
  }
  protected final void disableTimeoutTimer(){
  }
  protected final void disableRetransmissionTimer(){
  }
  public void raiseIOExceptionEvent(){
  }
  public final void setBranch(java.lang.String arg1){
  }
  public void addEventListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("SIPTransactionEventListener") SIPTransactionEventListener arg1){
  }
  public void setEncapsulatedChannel(MessageChannel arg1){
  }
  protected final void enableRetransmissionTimer(){
  }
  protected final void enableRetransmissionTimer(int arg1){
  }
  protected final void enableTimeoutTimer(int arg1){
  }
  protected void raiseErrorEvent(int arg1){
  }
  protected void semRelease(){
  }
  public final boolean isCancelTransaction(){
    return false;
  }
  public final boolean isByeTransaction(){
    return false;
  }
  public void removeEventListener(SIPTransactionEventListener arg1){
  }
}
