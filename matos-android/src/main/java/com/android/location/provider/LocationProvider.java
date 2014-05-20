package com.android.location.provider;

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
public abstract class LocationProvider
{
  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public LocationProvider(){
  }
  // Methods

  public android.os.IBinder getBinder(){
    return (android.os.IBinder) null;
  }
  public void reportLocation(android.location.Location arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate") 
  public abstract boolean onRequiresNetwork();
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate") 
  public abstract boolean onRequiresSatellite();
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate") 
  public abstract boolean onRequiresCell();
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate") 
  public abstract boolean onHasMonetaryCost();
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate") 
  public abstract boolean onSupportsAltitude();
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate") 
  public abstract boolean onSupportsSpeed();
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate") 
  public abstract boolean onSupportsBearing();
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate") 
  public abstract int onGetPowerRequirement();
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate") 
  public abstract boolean onMeetsCriteria(android.location.Criteria arg1);
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate") 
  public abstract int onGetAccuracy();
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate") 
  public abstract void onEnable();
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate") 
  public abstract void onDisable();
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate") 
  public abstract int onGetStatus(android.os.Bundle arg1);
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate") 
  public abstract long onGetStatusUpdateTime();
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate") 
  public abstract java.lang.String onGetInternalState();
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate") 
  public abstract void onEnableLocationTracking(boolean arg1);
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate") 
  public abstract void onSetMinTime(long arg1, android.os.WorkSource arg2);
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate") 
  public abstract void onUpdateNetworkState(int arg1, android.net.NetworkInfo arg2);
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate") 
  public abstract void onUpdateLocation(android.location.Location arg1);
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate") 
  public abstract boolean onSendExtraCommand(java.lang.String arg1, android.os.Bundle arg2);
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate") 
  public abstract void onAddListener(int arg1, android.os.WorkSource arg2);
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate") 
  public abstract void onRemoveListener(int arg1, android.os.WorkSource arg2);
}
