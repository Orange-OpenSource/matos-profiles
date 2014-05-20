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


public class SIPClientTransaction
  extends SIPTransaction  implements ServerResponseInterface, javax.sip.ClientTransaction, gov.nist.javax.sip.ClientTransactionExt
{
  // Classes

  public class TransactionTimer
    extends SIPStackTimerTask  {
    // Fields

    // Constructors

    public TransactionTimer(){
      super();
    }
    // Methods

    protected void runTask(){
    }
  }
  // Constructors

  protected SIPClientTransaction(SIPTransactionStack arg1, MessageChannel arg2){
    super((SIPTransactionStack) null, (MessageChannel) null);
  }
  // Methods

  public void setState(javax.sip.TransactionState arg1){
  }
  public void sendMessage(gov.nist.javax.sip.message.SIPMessage arg1) throws java.io.IOException{
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("viaHost")
  public java.lang.String getViaHost(){
    return (java.lang.String) null;
  }
  public int getViaPort(){
    return 0;
  }
  public void clearState(){
  }
  public synchronized void processResponse(gov.nist.javax.sip.message.SIPResponse arg1, MessageChannel arg2, SIPDialog arg3){
  }
  public void processResponse(gov.nist.javax.sip.message.SIPResponse arg1, MessageChannel arg2){
  }
  public javax.sip.Dialog getDialog(){
    return (javax.sip.Dialog) null;
  }
  public SIPDialog getDialog(java.lang.String arg1){
    return (SIPDialog) null;
  }
  public javax.sip.address.Hop getNextHop(){
    return (javax.sip.address.Hop) null;
  }
  public void terminate() throws javax.sip.ObjectInUseException{
  }
  public void sendRequest() throws javax.sip.SipException{
  }
  public javax.sip.message.Request createAck() throws javax.sip.SipException{
    return (javax.sip.message.Request) null;
  }
  public javax.sip.message.Request createCancel() throws javax.sip.SipException{
    return (javax.sip.message.Request) null;
  }
  public void alertIfStillInCallingStateBy(int arg1){
  }
  public void setNotifyOnRetransmit(boolean arg1){
  }
  public boolean checkFromTag(gov.nist.javax.sip.message.SIPResponse arg1){
    return false;
  }
  protected void fireTimeoutTimer(){
  }
  public boolean isMessagePartOfTransaction(gov.nist.javax.sip.message.SIPMessage arg1){
    return false;
  }
  public void setResponseInterface(ServerResponseInterface arg1){
  }
  protected void setViaPort(int arg1){
  }
  protected void setViaHost(@com.francetelecom.rd.stubs.annotation.FieldSet("viaHost") java.lang.String arg1){
  }
  public void setDialog(SIPDialog arg1, java.lang.String arg2){
  }
  public SIPDialog getDefaultDialog(){
    return (SIPDialog) null;
  }
  public void setNextHop(javax.sip.address.Hop arg1){
  }
  public MessageChannel getRequestChannel(){
    return (MessageChannel) null;
  }
  protected void fireRetransmissionTimer(){
  }
  public gov.nist.javax.sip.header.Via getOutgoingViaHeader(){
    return (gov.nist.javax.sip.header.Via) null;
  }
  protected void startTransactionTimer(){
  }
  public boolean isNotifyOnRetransmit(){
    return false;
  }
}
