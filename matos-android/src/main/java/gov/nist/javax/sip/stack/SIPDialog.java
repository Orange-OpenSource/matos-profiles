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


public class SIPDialog
  implements javax.sip.Dialog, gov.nist.javax.sip.DialogExt
{
  // Classes

  public class ReInviteSender
    implements java.io.Serializable, java.lang.Runnable
  {
    // Fields

    // Constructors

    public ReInviteSender(javax.sip.ClientTransaction arg1){
    }
    // Methods

    public void run(){
    }
    public void terminate(){
    }
  }
  // Fields

  protected java.lang.String myTag;

  protected java.lang.String hisTag;

  protected boolean ackSeen;

  protected boolean ackProcessed;

  protected java.lang.Long nextSeqno;

  public long auditTag;

  protected javax.sip.address.Address localParty;

  protected javax.sip.address.Address remoteParty;

  protected javax.sip.header.CallIdHeader callIdHeader;

  public static final int NULL_STATE = -1;

  public static final int EARLY_STATE = 0;

  public static final int CONFIRMED_STATE = 0;

  public static final int TERMINATED_STATE = 0;

  protected boolean firstTransactionSecure;

  protected boolean firstTransactionSeen;

  protected java.lang.String firstTransactionMethod;

  protected java.lang.String firstTransactionId;

  protected boolean firstTransactionIsServerTransaction;

  protected int firstTransactionPort;

  protected gov.nist.javax.sip.header.Contact contactHeader;

  // Constructors

  private SIPDialog(gov.nist.javax.sip.SipProviderImpl arg1){
  }
  public SIPDialog(SIPTransaction arg1){
  }
  public SIPDialog(SIPClientTransaction arg1, gov.nist.javax.sip.message.SIPResponse arg2){
  }
  public SIPDialog(gov.nist.javax.sip.SipProviderImpl arg1, gov.nist.javax.sip.message.SIPResponse arg2){
  }
  // Methods

  public java.lang.String getMethod(){
    return (java.lang.String) null;
  }
  public javax.sip.DialogState getState(){
    return (javax.sip.DialogState) null;
  }
  public void delete(){
  }
  public void setState(int arg1){
  }
  public boolean isSecure(){
    return false;
  }
  public javax.sip.message.Request createRequest(java.lang.String arg1) throws javax.sip.SipException{
    return (javax.sip.message.Request) null;
  }
  public void setApplicationData(java.lang.Object arg1){
  }
  public java.lang.Object getApplicationData(){
    return (java.lang.Object) null;
  }
  public void setSipProvider(gov.nist.javax.sip.SipProviderImpl arg1){
  }
  public synchronized void addRoute(gov.nist.javax.sip.message.SIPRequest arg1){
  }
  public boolean isBackToBackUserAgent(){
    return false;
  }
  public void addTransaction(SIPTransaction arg1){
  }
  public java.lang.String getDialogId(){
    return (java.lang.String) null;
  }
  public javax.sip.header.CallIdHeader getCallId(){
    return (javax.sip.header.CallIdHeader) null;
  }
  public gov.nist.javax.sip.SipProviderImpl getSipProvider(){
    return (gov.nist.javax.sip.SipProviderImpl) null;
  }
  public void sendRequest(@com.francetelecom.rd.stubs.annotation.CallBackRegister("clientTrasaction") javax.sip.ClientTransaction arg1) throws javax.sip.TransactionDoesNotExistException, javax.sip.SipException{
  }
  public void sendRequest(@com.francetelecom.rd.stubs.annotation.CallBackRegister("clientTrasaction") javax.sip.ClientTransaction arg1, boolean arg2) throws javax.sip.TransactionDoesNotExistException, javax.sip.SipException{
  }
  public javax.sip.message.Request createAck(long arg1) throws javax.sip.InvalidArgumentException, javax.sip.SipException{
    return (javax.sip.message.Request) null;
  }
  public gov.nist.javax.sip.message.SIPResponse getLastResponse(){
    return (gov.nist.javax.sip.message.SIPResponse) null;
  }
  public void addEventListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("SIPDialogEventListener") SIPDialogEventListener arg1){
  }
  public void removeEventListener(SIPDialogEventListener arg1){
  }
  public SIPServerTransaction getInviteTransaction(){
    return (SIPServerTransaction) null;
  }
  public boolean isAckSeen(){
    return false;
  }
  public void sendReliableProvisionalResponse(javax.sip.message.Response arg1) throws javax.sip.SipException{
  }
  protected void stopTimer(){
  }
  protected void startTimer(SIPServerTransaction arg1){
  }
  public synchronized void requestConsumed(){
  }
  public void doDeferredDelete(){
  }
  public synchronized void doDeferredDeleteIfNoAckSent(long arg1){
  }
  public boolean isServer(){
    return false;
  }
  public javax.sip.Transaction getFirstTransaction(){
    return (javax.sip.Transaction) null;
  }
  public gov.nist.javax.sip.header.Contact getMyContactHeader(){
    return (gov.nist.javax.sip.header.Contact) null;
  }
  public SIPTransaction getLastTransaction(){
    return (SIPTransaction) null;
  }
  public boolean isAckSent(long arg1){
    return false;
  }
  public boolean handleAck(SIPServerTransaction arg1){
    return false;
  }
  public boolean isSequnceNumberValidation(){
    return false;
  }
  public boolean handlePrack(gov.nist.javax.sip.message.SIPRequest arg1){
    return false;
  }
  public synchronized boolean isRequestConsumable(gov.nist.javax.sip.message.SIPRequest arg1){
    return false;
  }
  public long getRemoteSeqNumber(){
    return 0l;
  }
  public void setDialogId(java.lang.String arg1){
  }
  public static SIPDialog createFromNOTIFY(SIPClientTransaction arg1, SIPTransaction arg2){
    return (SIPDialog) null;
  }
  public gov.nist.javax.sip.message.SIPRequest getLastAckSent(){
    return (gov.nist.javax.sip.message.SIPRequest) null;
  }
  public void resendAck() throws javax.sip.SipException{
  }
  public void setLastResponse(SIPTransaction arg1, gov.nist.javax.sip.message.SIPResponse arg2){
  }
  public void sendAck(javax.sip.message.Request arg1) throws javax.sip.SipException{
  }
  public java.lang.String getRemoteTag(){
    return (java.lang.String) null;
  }
  public java.lang.String getLocalTag(){
    return (java.lang.String) null;
  }
  public boolean isAssigned(){
    return false;
  }
  protected void setRetransmissionTicks(){
  }
  public void setResponseTags(gov.nist.javax.sip.message.SIPResponse arg1){
  }
  public void startRetransmitTimer(SIPServerTransaction arg1, javax.sip.message.Response arg2){
  }
  public void setAssigned(){
  }
  public void terminateOnBye(boolean arg1) throws javax.sip.SipException{
  }
  public void printDebugInfo(){
  }
  public java.util.Iterator getRouteSet(){
    return (java.util.Iterator) null;
  }
  protected boolean isReInvite(){
    return false;
  }
  public void setRemoteSequenceNumber(long arg1){
  }
  public void incrementLocalSequenceNumber(){
  }
  public int getRemoteSequenceNumber(){
    return 0;
  }
  public int getLocalSequenceNumber(){
    return 0;
  }
  public long getOriginalLocalSequenceNumber(){
    return 0l;
  }
  public long getLocalSeqNumber(){
    return 0l;
  }
  public javax.sip.address.Address getLocalParty(){
    return (javax.sip.address.Address) null;
  }
  public javax.sip.address.Address getRemoteParty(){
    return (javax.sip.address.Address) null;
  }
  public javax.sip.address.Address getRemoteTarget(){
    return (javax.sip.address.Address) null;
  }
  public javax.sip.message.Request createPrack(javax.sip.message.Response arg1) throws javax.sip.DialogDoesNotExistException, javax.sip.SipException{
    return (javax.sip.message.Request) null;
  }
  public javax.sip.message.Response createReliableProvisionalResponse(int arg1) throws javax.sip.InvalidArgumentException, javax.sip.SipException{
    return (javax.sip.message.Response) null;
  }
  protected gov.nist.javax.sip.message.SIPRequest getLastAckReceived(){
    return (gov.nist.javax.sip.message.SIPRequest) null;
  }
  public boolean isAtleastOneAckSent(){
    return false;
  }
  public void setBackToBackUserAgent(){
  }
  public void disableSequenceNumberValidation(){
  }
  public void acquireTimerTaskSem(){
  }
  public void releaseTimerTaskSem(){
  }
}
