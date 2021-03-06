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
public final class CdmaDataConnectionTracker
  extends com.android.internal.telephony.DataConnectionTracker{
  // Fields

  protected final java.lang.String LOG_TAG = (java.lang.String) null;

  // Constructors
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  CdmaDataConnectionTracker(CDMAPhone arg1){
    super((com.android.internal.telephony.PhoneBase) null);
  }
  // Methods

  protected void finalize(){
  }
  protected void log(java.lang.String arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mState")
  public synchronized com.android.internal.telephony.DataConnectionTracker.State getState(java.lang.String arg1){
    return (com.android.internal.telephony.DataConnectionTracker.State) null;
  }
  protected void setState(@com.francetelecom.rd.stubs.annotation.FieldSet("mState") com.android.internal.telephony.DataConnectionTracker.State arg1){
  }
  protected void loge(java.lang.String arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void handleMessage(android.os.Message arg1){
  }
  public void dispose(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onRadioOffOrNotAvailable(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onRadioAvailable(){
  }
  public boolean isDisconnected(){
    return false;
  }
  protected boolean isDataPossible(java.lang.String arg1){
    return false;
  }
  protected java.lang.String getActionIntentReconnectAlarm(){
    return (java.lang.String) null;
  }
  protected boolean isApnTypeAvailable(java.lang.String arg1){
    return false;
  }
  protected boolean isDataAllowed(){
    return false;
  }
  protected void startNetStatPoll(){
  }
  protected void stopNetStatPoll(){
  }
  protected void restartRadio(){
  }
  protected void gotoIdleAndNotifyDataConnection(java.lang.String arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onRecordsLoaded(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onNVReady(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onEnableNewApn(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected boolean onTrySetupData(java.lang.String arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onRoamingOff(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onRoamingOn(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onDataSetupComplete(android.os.AsyncResult arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onDisconnectDone(int arg1, android.os.AsyncResult arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onVoiceCallStarted(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onVoiceCallEnded(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onCleanUpConnection(boolean arg1, int arg2, java.lang.String arg3){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onCleanUpAllConnections(java.lang.String arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onDataStateChanged(android.os.AsyncResult arg1){
  }
}
