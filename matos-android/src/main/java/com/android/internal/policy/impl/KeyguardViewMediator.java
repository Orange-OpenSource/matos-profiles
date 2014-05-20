package com.android.internal.policy.impl;

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
public class KeyguardViewMediator
  implements KeyguardViewCallback
{
  // Fields

  protected static final int AWAKE_INTERVAL_DEFAULT_MS = 0;

  protected static final int AWAKE_INTERVAL_DEFAULT_KEYBOARD_OPEN_MS = 0;

  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public KeyguardViewMediator(android.content.Context arg1, PhoneWindowManager arg2, android.os.LocalPowerManager arg3){
  }
  // Methods

  public boolean isSecure(){
    return false;
  }
  public boolean isShowing(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onScreenTurnedOff(int arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onScreenTurnedOn(KeyguardViewManager.ShowListener arg1){
  }
  public void verifyUnlock(@com.francetelecom.rd.stubs.annotation.CallBackRegister("OnKeyguardExitResult") android.view.WindowManagerPolicy.OnKeyguardExitResult arg1){
  }
  public void keyguardDone(boolean arg1){
  }
  public void keyguardDone(boolean arg1, boolean arg2){
  }
  public void pokeWakelock(){
  }
  public void pokeWakelock(int arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onSimStateChanged(com.android.internal.telephony.IccCard.State arg1){
  }
  public void keyguardDoneDrawing(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onSystemReady(){
  }
  public void setKeyguardEnabled(boolean arg1){
  }
  public boolean isShowingAndNotHidden(){
    return false;
  }
  public void setHidden(boolean arg1){
  }
  public void doKeyguardTimeout(){
  }
  public boolean isInputRestricted(){
    return false;
  }
  public boolean doLidChangeTq(boolean arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onWakeKeyWhenKeyguardShowingTq(int arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onWakeMotionWhenKeyguardShowingTq(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onClockVisibilityChanged(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onPhoneStateChanged(int arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onRefreshBatteryInfo(boolean arg1, boolean arg2, int arg3){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onRefreshCarrierInfo(java.lang.CharSequence arg1, java.lang.CharSequence arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onRingerModeChanged(int arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onTimeChanged(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onDeviceProvisioned(){
  }
}
