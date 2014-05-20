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


public class SIPServerTransaction
  extends SIPTransaction  implements ServerRequestInterface, gov.nist.javax.sip.ServerTransactionExt, javax.sip.ServerTransaction
{
  // Fields

  protected boolean isAckSeen;

  // Constructors

  protected SIPServerTransaction(SIPTransactionStack arg1, MessageChannel arg2){
    super((SIPTransactionStack) null, (MessageChannel) null);
  }
  // Methods

  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public javax.sip.TransactionState getState(){
    return (javax.sip.TransactionState) null;
  }
  protected void map(){
  }
  public void setState(javax.sip.TransactionState arg1){
  }
  public void sendMessage(gov.nist.javax.sip.message.SIPMessage arg1) throws java.io.IOException{
  }
  public java.lang.String getViaHost(){
    return (java.lang.String) null;
  }
  public int getViaPort(){
    return 0;
  }
  public void processRequest(gov.nist.javax.sip.message.SIPRequest arg1, MessageChannel arg2){
  }
  public javax.sip.Dialog getDialog(){
    return (javax.sip.Dialog) null;
  }
  public void releaseSem(){
  }
  public void terminate() throws javax.sip.ObjectInUseException{
  }
  public void sendResponse(javax.sip.message.Response arg1) throws javax.sip.SipException{
  }
  protected void fireTimeoutTimer(){
  }
  public boolean isMessagePartOfTransaction(gov.nist.javax.sip.message.SIPMessage arg1){
    return false;
  }
  public void setDialog(SIPDialog arg1, java.lang.String arg2){
  }
  protected void fireRetransmissionTimer(){
  }
  protected void startTransactionTimer(){
  }
  public gov.nist.javax.sip.message.SIPResponse getLastResponse(){
    return (gov.nist.javax.sip.message.SIPResponse) null;
  }
  public void setOriginalRequest(gov.nist.javax.sip.message.SIPRequest arg1){
  }
  public void setInviteTransaction(SIPServerTransaction arg1){
  }
  public void setRequestInterface(@com.francetelecom.rd.stubs.annotation.CallBackRegister("processRequest") ServerRequestInterface arg1){
  }
  public boolean isRetransmissionAlertEnabled(){
    return false;
  }
  public void disableRetransmissionAlerts(){
  }
  public void setAckSeen(){
  }
  public void scheduleAckRemoval() throws java.lang.IllegalStateException{
  }
  public void setMapped(boolean arg1){
  }
  public boolean isTransactionMapped(){
    return false;
  }
  public void setPendingSubscribe(SIPClientTransaction arg1){
  }
  public boolean ackSeen(){
    return false;
  }
  public MessageChannel getResponseChannel(){
    return (MessageChannel) null;
  }
  protected void sendReliableProvisionalResponse(javax.sip.message.Response arg1) throws javax.sip.SipException{
  }
  public gov.nist.javax.sip.message.SIPResponse getReliableProvisionalResponse(){
    return (gov.nist.javax.sip.message.SIPResponse) null;
  }
  public boolean prackRecieved(){
    return false;
  }
  public void enableRetransmissionAlerts() throws javax.sip.SipException{
  }
  public SIPServerTransaction getCanceledInviteTransaction(){
    return (SIPServerTransaction) null;
  }
}
