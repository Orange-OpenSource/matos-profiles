package com.android.internal.app;

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


public interface IBatteryStats
  extends android.os.IInterface
{
  // Classes

  public abstract static class Stub
    extends android.os.Binder    implements IBatteryStats
  {
    // Constructors

    public Stub(){
      super();
    }
    // Methods

    public android.os.IBinder asBinder(){
      return (android.os.IBinder) null;
    }
    public static IBatteryStats asInterface(android.os.IBinder arg1){
      return (IBatteryStats) null;
    }
    public boolean onTransact(int arg1, android.os.Parcel arg2, android.os.Parcel arg3, int arg4) throws android.os.RemoteException{
      return false;
    }
  }
  // Methods

  public byte [] getStatistics() throws android.os.RemoteException;
  public void noteStartWakelock(int arg1, int arg2, java.lang.String arg3, int arg4) throws android.os.RemoteException;
  public void noteStopWakelock(int arg1, int arg2, java.lang.String arg3, int arg4) throws android.os.RemoteException;
  public void noteStartSensor(int arg1, int arg2) throws android.os.RemoteException;
  public void noteStopSensor(int arg1, int arg2) throws android.os.RemoteException;
  public void noteStartWakelockFromSource(android.os.WorkSource arg1, int arg2, java.lang.String arg3, int arg4) throws android.os.RemoteException;
  public void noteStopWakelockFromSource(android.os.WorkSource arg1, int arg2, java.lang.String arg3, int arg4) throws android.os.RemoteException;
  public void noteStartGps(int arg1) throws android.os.RemoteException;
  public void noteStopGps(int arg1) throws android.os.RemoteException;
  public void noteScreenOn() throws android.os.RemoteException;
  public void noteScreenBrightness(int arg1) throws android.os.RemoteException;
  public void noteScreenOff() throws android.os.RemoteException;
  public void noteInputEvent() throws android.os.RemoteException;
  public void noteUserActivity(int arg1, int arg2) throws android.os.RemoteException;
  public void notePhoneOn() throws android.os.RemoteException;
  public void notePhoneOff() throws android.os.RemoteException;
  public void notePhoneSignalStrength(android.telephony.SignalStrength arg1) throws android.os.RemoteException;
  public void notePhoneDataConnectionState(int arg1, boolean arg2) throws android.os.RemoteException;
  public void notePhoneState(int arg1) throws android.os.RemoteException;
  public void noteWifiOn() throws android.os.RemoteException;
  public void noteWifiOff() throws android.os.RemoteException;
  public void noteWifiRunning(android.os.WorkSource arg1) throws android.os.RemoteException;
  public void noteWifiRunningChanged(android.os.WorkSource arg1, android.os.WorkSource arg2) throws android.os.RemoteException;
  public void noteWifiStopped(android.os.WorkSource arg1) throws android.os.RemoteException;
  public void noteBluetoothOn() throws android.os.RemoteException;
  public void noteBluetoothOff() throws android.os.RemoteException;
  public void noteFullWifiLockAcquired(int arg1) throws android.os.RemoteException;
  public void noteFullWifiLockReleased(int arg1) throws android.os.RemoteException;
  public void noteScanWifiLockAcquired(int arg1) throws android.os.RemoteException;
  public void noteScanWifiLockReleased(int arg1) throws android.os.RemoteException;
  public void noteWifiMulticastEnabled(int arg1) throws android.os.RemoteException;
  public void noteWifiMulticastDisabled(int arg1) throws android.os.RemoteException;
  public void noteFullWifiLockAcquiredFromSource(android.os.WorkSource arg1) throws android.os.RemoteException;
  public void noteFullWifiLockReleasedFromSource(android.os.WorkSource arg1) throws android.os.RemoteException;
  public void noteScanWifiLockAcquiredFromSource(android.os.WorkSource arg1) throws android.os.RemoteException;
  public void noteScanWifiLockReleasedFromSource(android.os.WorkSource arg1) throws android.os.RemoteException;
  public void noteWifiMulticastEnabledFromSource(android.os.WorkSource arg1) throws android.os.RemoteException;
  public void noteWifiMulticastDisabledFromSource(android.os.WorkSource arg1) throws android.os.RemoteException;
  public void noteNetworkInterfaceType(java.lang.String arg1, int arg2) throws android.os.RemoteException;
  public void setBatteryState(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) throws android.os.RemoteException;
  public long getAwakeTimeBattery() throws android.os.RemoteException;
  public long getAwakeTimePlugged() throws android.os.RemoteException;
}
