package com.android.internal.telephony.sip;

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


public class SipPhone
  extends SipPhoneBase{
  // Constructors

  SipPhone(android.content.Context arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("phoneNotifier") com.android.internal.telephony.PhoneNotifier arg2, android.net.sip.SipProfile arg3){
    super((android.content.Context) null, (com.android.internal.telephony.PhoneNotifier) null);
  }
  // Methods

  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public boolean equals(SipPhone arg1){
    return false;
  }
  public void setMute(boolean arg1){
  }
  public com.android.internal.telephony.Connection dial(java.lang.String arg1) throws com.android.internal.telephony.CallStateException{
    return (com.android.internal.telephony.Connection) null;
  }
  public void conference() throws com.android.internal.telephony.CallStateException{
  }
  public void conference(com.android.internal.telephony.Call arg1) throws com.android.internal.telephony.CallStateException{
  }
  public void acceptCall() throws com.android.internal.telephony.CallStateException{
  }
  public void rejectCall() throws com.android.internal.telephony.CallStateException{
  }
  public void explicitCallTransfer() throws com.android.internal.telephony.CallStateException{
  }
  public boolean getMute(){
    return false;
  }
  public void sendDtmf(char arg1){
  }
  public void startDtmf(char arg1){
  }
  public void stopDtmf(){
  }
  public void sendBurstDtmf(java.lang.String arg1){
  }
  public void setCallWaiting(boolean arg1, android.os.Message arg2){
  }
  public void clearDisconnected(){
  }
  public void switchHoldingAndActive() throws com.android.internal.telephony.CallStateException{
  }
  public android.telephony.ServiceState getServiceState(){
    return (android.telephony.ServiceState) null;
  }
  public boolean canConference(){
    return false;
  }
  public boolean canTransfer(){
    return false;
  }
  public java.lang.String getPhoneName(){
    return (java.lang.String) null;
  }
  public java.lang.String getSipUri(){
    return (java.lang.String) null;
  }
  public boolean canTake(java.lang.Object arg1){
    return false;
  }
  public void getOutgoingCallerIdDisplay(android.os.Message arg1){
  }
  public void setOutgoingCallerIdDisplay(int arg1, android.os.Message arg2){
  }
  public void getCallWaiting(android.os.Message arg1){
  }
  public void setEchoSuppressionEnabled(boolean arg1){
  }
  public com.android.internal.telephony.Call getForegroundCall(){
    return (com.android.internal.telephony.Call) null;
  }
  public com.android.internal.telephony.Call getBackgroundCall(){
    return (com.android.internal.telephony.Call) null;
  }
  public com.android.internal.telephony.Call getRingingCall(){
    return (com.android.internal.telephony.Call) null;
  }
}
