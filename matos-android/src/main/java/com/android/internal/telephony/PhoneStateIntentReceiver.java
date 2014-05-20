package com.android.internal.telephony;

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


public final class PhoneStateIntentReceiver
  extends android.content.BroadcastReceiver{
  // Constructors

  public PhoneStateIntentReceiver(){
    super();
  }
  public PhoneStateIntentReceiver(android.content.Context arg1, android.os.Handler arg2){
    super();
  }
  // Methods

  public void onReceive(android.content.Context arg1, android.content.Intent arg2){
  }
  public void setContext(android.content.Context arg1){
  }
  public android.telephony.ServiceState getServiceState(){
    return (android.telephony.ServiceState) null;
  }
  public void setTarget(android.os.Handler arg1){
  }
  public void notifyServiceState(int arg1){
  }
  public void notifySignalStrength(int arg1){
  }
  public Phone.State getPhoneState(){
    return (Phone.State) null;
  }
  public int getSignalStrengthLevelAsu(){
    return 0;
  }
  public int getSignalStrengthDbm(){
    return 0;
  }
  public void notifyPhoneCallState(int arg1){
  }
  public boolean getNotifyPhoneCallState(){
    return false;
  }
  public boolean getNotifyServiceState(){
    return false;
  }
  public boolean getNotifySignalStrength(){
    return false;
  }
  public void registerIntent(){
  }
  public void unregisterIntent(){
  }
}
