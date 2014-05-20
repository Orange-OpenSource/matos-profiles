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
public class LockPatternKeyguardView
  extends KeyguardViewBase  implements android.os.Handler.Callback
{
  // Constructors
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public LockPatternKeyguardView(android.content.Context arg1, KeyguardUpdateMonitor arg2, com.android.internal.widget.LockPatternUtils arg3, KeyguardWindowController arg4){
    super((android.content.Context) null);
  }
  // Methods

  public void reset(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onConfigurationChanged(android.content.res.Configuration arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onWindowFocusChanged(boolean arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onDetachedFromWindow(){
  }
  public boolean handleMessage(android.os.Message arg1){
    return false;
  }
  public void show(){
  }
  protected boolean dispatchHoverEvent(android.view.MotionEvent arg1){
    return false;
  }
  protected void dispatchDraw(android.graphics.Canvas arg1){
  }
  public void cleanUp(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onScreenTurnedOff(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onScreenTurnedOn(){
  }
  public void wakeWhenReadyTq(int arg1){
  }
  public void verifyUnlock(){
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
  public void bindToFaceLock(){
  }
  public void stopAndUnbindFromFaceLock(){
  }
  public void startFaceLock(android.os.IBinder arg1, int arg2, int arg3, int arg4, int arg5){
  }
  public void stopFaceLock(){
  }
}
