package gov.nist.javax.sip;

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


public class SipProviderImpl
  implements gov.nist.javax.sip.stack.SIPDialogEventListener, javax.sip.SipProvider, SipProviderExt, gov.nist.javax.sip.stack.SIPTransactionEventListener
{
  // Fields

  protected SipStackImpl sipStack;

  // Constructors

  private SipProviderImpl(){
  }
  protected SipProviderImpl(@com.francetelecom.rd.stubs.annotation.FieldSet("this.sipStack") SipStackImpl arg1){
  }
  // Methods

  protected java.lang.Object clone() throws java.lang.CloneNotSupportedException{
    return (java.lang.Object) null;
  }
  protected void stop(){
  }
  public synchronized void dialogErrorEvent(gov.nist.javax.sip.stack.SIPDialogErrorEvent arg1){
  }
  public javax.sip.SipListener getSipListener(){
    return (javax.sip.SipListener) null;
  }
  public synchronized javax.sip.ListeningPoint [] getListeningPoints(){
    return (javax.sip.ListeningPoint []) null;
  }
  public boolean isAutomaticDialogSupportEnabled(){
    return false;
  }
  public void transactionErrorEvent(gov.nist.javax.sip.stack.SIPTransactionErrorEvent arg1){
  }
  public void sendRequest(javax.sip.message.Request arg1) throws javax.sip.SipException{
  }
  public void sendResponse(javax.sip.message.Response arg1) throws javax.sip.SipException{
  }
  public javax.sip.ClientTransaction getNewClientTransaction(javax.sip.message.Request arg1) throws javax.sip.TransactionUnavailableException{
    return (javax.sip.ClientTransaction) null;
  }
  public void handleEvent(java.util.EventObject arg1, gov.nist.javax.sip.stack.SIPTransaction arg2){
  }
  public synchronized void setListeningPoint(@com.francetelecom.rd.stubs.annotation.CallBackRegister("listeningPoing") javax.sip.ListeningPoint arg1){
  }
  public synchronized void removeListeningPoints(){
  }
  public boolean isDialogErrorsAutomaticallyHandled(){
    return false;
  }
  public javax.sip.ListeningPoint getListeningPoint(java.lang.String arg1){
    return (javax.sip.ListeningPoint) null;
  }
  public javax.sip.ListeningPoint getListeningPoint(){
    return (javax.sip.ListeningPoint) null;
  }
  public void addSipListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("sipListener") javax.sip.SipListener arg1) throws java.util.TooManyListenersException{
  }
  public javax.sip.header.CallIdHeader getNewCallId(){
    return (javax.sip.header.CallIdHeader) null;
  }
  public javax.sip.ServerTransaction getNewServerTransaction(javax.sip.message.Request arg1) throws javax.sip.TransactionAlreadyExistsException, javax.sip.TransactionUnavailableException{
    return (javax.sip.ServerTransaction) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("sipStack")
  public javax.sip.SipStack getSipStack(){
    return (javax.sip.SipStack) null;
  }
  public void removeSipListener(javax.sip.SipListener arg1){
  }
  public javax.sip.Dialog getNewDialog(javax.sip.Transaction arg1) throws javax.sip.SipException{
    return (javax.sip.Dialog) null;
  }
  public synchronized void addListeningPoint(@com.francetelecom.rd.stubs.annotation.CallBackRegister("listeningPoing") javax.sip.ListeningPoint arg1) throws javax.sip.ObjectInUseException{
  }
  public synchronized void removeListeningPoint(javax.sip.ListeningPoint arg1) throws javax.sip.ObjectInUseException{
  }
  public void setAutomaticDialogSupportEnabled(boolean arg1){
  }
  public void setDialogErrorsAutomaticallyHandled(){
  }
}
