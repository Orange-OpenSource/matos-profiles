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


public class KeyguardUpdateMonitor
{
  // Constructors

  public KeyguardUpdateMonitor(android.content.Context arg1){
  }
  // Methods

  public com.android.internal.telephony.IccCard.State getSimState(){
    return (com.android.internal.telephony.IccCard.State) null;
  }
  public int getPhoneState(){
    return 0;
  }
  public void removeCallback(java.lang.Object arg1){
  }
  public void reportFailedAttempt(){
  }
  protected void handleRingerModeChange(int arg1){
  }
  protected void handlePhoneStateChanged(java.lang.String arg1){
  }
  protected void handleDeviceProvisioned(){
  }
  public boolean shouldShowBatteryInfo(){
    return false;
  }
  public boolean isDevicePluggedIn(){
    return false;
  }
  public int getBatteryLevel(){
    return 0;
  }
  public boolean isDeviceCharged(){
    return false;
  }
  public boolean isDeviceProvisioned(){
    return false;
  }
  public int getFailedAttempts(){
    return 0;
  }
  public void reportSimUnlocked(){
  }
  public boolean isKeyguardBypassEnabled(){
    return false;
  }
  public void clearFailedAttempts(){
  }
  public void reportClockVisible(boolean arg1){
  }
  public java.lang.CharSequence getTelephonyPlmn(){
    return (java.lang.CharSequence) null;
  }
  public java.lang.CharSequence getTelephonySpn(){
    return (java.lang.CharSequence) null;
  }
  public boolean isClockVisible(){
    return false;
  }
}
