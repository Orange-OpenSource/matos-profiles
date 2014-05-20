package com.android.internal.telephony.cdma;

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
public class CdmaServiceStateTracker
  extends com.android.internal.telephony.ServiceStateTracker{
  // Fields

  protected int networkType;

  protected int newNetworkType;

  protected int mDataConnectionState;

  protected int mNewDataConnectionState;

  protected int mRegistrationState;

  protected android.os.RegistrantList cdmaForSubscriptionInfoReadyRegistrants;

  protected boolean mNeedFixZone;

  protected boolean mGotCountryCode;

  protected java.lang.String mCurPlmn;

  protected java.lang.String mMdn;

  protected int [] mHomeSystemId;

  protected int [] mHomeNetworkId;

  protected java.lang.String mMin;

  protected java.lang.String mPrlVersion;

  protected boolean mIsMinInfoReady;

  protected boolean isSubscriptionFromRuim;

  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public CdmaServiceStateTracker(CDMAPhone arg1){
    super();
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
  public java.lang.String getCdmaMin(){
    return (java.lang.String) null;
  }
  public boolean isMinInfoReady(){
    return false;
  }
  public void registerForSubscriptionInfoReady( android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForSubscriptionInfoReady(android.os.Handler arg1){
  }
  protected com.android.internal.telephony.Phone getPhone(){
    return (com.android.internal.telephony.Phone) null;
  }
  protected void setCdmaTechnology(int arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void handlePollStateResultMessage(int arg1, android.os.AsyncResult arg2){
  }
  protected void setSignalStrengthDefaultValues(){
  }
  protected void pollState(){
  }
  protected void pollStateDone(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onSignalStrengthResult(android.os.AsyncResult arg1){
  }
  public boolean isConcurrentVoiceAndDataAllowed(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void handlePollStateResult(int arg1, android.os.AsyncResult arg2){
  }
  protected void queueNextSignalStrengthPoll(){
  }
  protected void parseSidNid(java.lang.String arg1, java.lang.String arg2){
  }
  public java.lang.String getPrlVersion(){
    return (java.lang.String) null;
  }
  protected void updateOtaspState(){
  }
  protected int regCodeToServiceState(int arg1){
    return 0;
  }
  protected int radioTechnologyToDataServiceState(int arg1){
    return 0;
  }
  protected void fixTimeZone(java.lang.String arg1){
  }
  protected void updateSpnDisplay(){
  }
  protected boolean isSidsAllZeros(){
    return false;
  }
  protected void setPowerStateToDesired(){
  }
  public int getCurrentDataConnectionState(){
    return 0;
  }
  public java.lang.String getMdnNumber(){
    return (java.lang.String) null;
  }
  protected void hangupAndPowerOff(){
  }
}
