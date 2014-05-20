package com.android.internal.telephony.gsm;

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

@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public class SIMRecords
  extends com.android.internal.telephony.IccRecords{
  // Fields

  protected static final java.lang.String LOG_TAG = (java.lang.String) null;

  protected static final boolean DBG = false;

  protected static final int EVENT_GET_IMSI_DONE = 0;

  protected static final int EVENT_GET_ICCID_DONE = 0;

  protected static final int EVENT_GET_AD_DONE = 0;

  protected static final int EVENT_GET_MSISDN_DONE = 0;

  // Constructors
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public SIMRecords(com.android.internal.telephony.PhoneBase arg1){
    super((com.android.internal.telephony.PhoneBase) null);
  }
  // Methods

  protected void finalize(){
  }
  protected void log(java.lang.String arg1){
  }
  protected void loge(java.lang.String arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void handleMessage(android.os.Message arg1){
  }
  public void dispose(){
  }
  protected void onRadioOffOrNotAvailable(){
  }
  public java.lang.String getIMSI(){
    return (java.lang.String) null;
  }
  public java.lang.String getMsisdnNumber(){
    return (java.lang.String) null;
  }
  public void setMsisdnNumber(java.lang.String arg1, java.lang.String arg2, android.os.Message arg3){
  }
  public java.lang.String getMsisdnAlphaTag(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mVoiceMailNumber") 
  public java.lang.String getVoiceMailNumber(){
    return (java.lang.String) null;
  }
  public void setVoiceMailNumber(@com.francetelecom.rd.stubs.annotation.FieldSet("mVoiceMailAlphaTag") java.lang.String arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("mVoiceMailNumber") java.lang.String arg2, android.os.Message arg3){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mVoiceMailAlphaTag")
  public java.lang.String getVoiceMailAlphaTag(){
    return (java.lang.String) null;
  }
  public void setVoiceMessageWaiting(int arg1, int arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onRefresh(boolean arg1, int [] arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onRecordLoaded(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onAllRecordsLoaded(){
  }
  public int getDisplayRule(java.lang.String arg1){
    return 0;
  }
  public boolean isCspPlmnEnabled(){
    return false;
  }
  public java.lang.String getOperatorNumeric(){
    return (java.lang.String) null;
  }
  public boolean getVoiceCallForwardingFlag(){
    return false;
  }
  public void setVoiceCallForwardingFlag(int arg1, boolean arg2){
  }
  protected void fetchSimRecords(){
  }
  protected int dispatchGsmMessage(com.android.internal.telephony.SmsMessageBase arg1){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onSimReady(){
  }
}
