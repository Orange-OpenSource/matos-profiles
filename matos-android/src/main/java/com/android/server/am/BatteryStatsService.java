package com.android.server.am;

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


public final class BatteryStatsService
  extends com.android.internal.app.IBatteryStats.Stub{
  // Constructors

  BatteryStatsService(java.lang.String arg1){
    super();
  }
  // Methods

  public void shutdown(){
  }
  protected void dump(java.io.FileDescriptor arg1, java.io.PrintWriter arg2, java.lang.String [] arg3){
  }
  public void enforceCallingPermission(){
  }
  public void publish(android.content.Context arg1){
  }
  public static com.android.internal.app.IBatteryStats getService(){
    return (com.android.internal.app.IBatteryStats) null;
  }
  public byte [] getStatistics(){
    return (byte []) null;
  }
  public void noteStartWakelock(int arg1, int arg2, java.lang.String arg3, int arg4){
  }
  public void noteStopWakelock(int arg1, int arg2, java.lang.String arg3, int arg4){
  }
  public void noteStartSensor(int arg1, int arg2){
  }
  public void noteStopSensor(int arg1, int arg2){
  }
  public void noteStartWakelockFromSource(android.os.WorkSource arg1, int arg2, java.lang.String arg3, int arg4){
  }
  public void noteStopWakelockFromSource(android.os.WorkSource arg1, int arg2, java.lang.String arg3, int arg4){
  }
  public void noteStartGps(int arg1){
  }
  public void noteStopGps(int arg1){
  }
  public void noteScreenOn(){
  }
  public void noteScreenBrightness(int arg1){
  }
  public void noteScreenOff(){
  }
  public void noteInputEvent(){
  }
  public void noteUserActivity(int arg1, int arg2){
  }
  public void notePhoneOn(){
  }
  public void notePhoneOff(){
  }
  public void notePhoneSignalStrength(android.telephony.SignalStrength arg1){
  }
  public void notePhoneDataConnectionState(int arg1, boolean arg2){
  }
  public void notePhoneState(int arg1){
  }
  public void noteWifiOn(){
  }
  public void noteWifiOff(){
  }
  public void noteWifiRunning(android.os.WorkSource arg1){
  }
  public void noteWifiRunningChanged(android.os.WorkSource arg1, android.os.WorkSource arg2){
  }
  public void noteWifiStopped(android.os.WorkSource arg1){
  }
  public void noteBluetoothOn(){
  }
  public void noteBluetoothOff(){
  }
  public void noteFullWifiLockAcquired(int arg1){
  }
  public void noteFullWifiLockReleased(int arg1){
  }
  public void noteScanWifiLockAcquired(int arg1){
  }
  public void noteScanWifiLockReleased(int arg1){
  }
  public void noteWifiMulticastEnabled(int arg1){
  }
  public void noteWifiMulticastDisabled(int arg1){
  }
  public void noteFullWifiLockAcquiredFromSource(android.os.WorkSource arg1){
  }
  public void noteFullWifiLockReleasedFromSource(android.os.WorkSource arg1){
  }
  public void noteScanWifiLockAcquiredFromSource(android.os.WorkSource arg1){
  }
  public void noteScanWifiLockReleasedFromSource(android.os.WorkSource arg1){
  }
  public void noteWifiMulticastEnabledFromSource(android.os.WorkSource arg1){
  }
  public void noteWifiMulticastDisabledFromSource(android.os.WorkSource arg1){
  }
  public void noteNetworkInterfaceType(java.lang.String arg1, int arg2){
  }
  public void setBatteryState(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6){
  }
  public long getAwakeTimeBattery(){
    return 0l;
  }
  public long getAwakeTimePlugged(){
    return 0l;
  }
  public com.android.internal.os.BatteryStatsImpl getActiveStatistics(){
    return (com.android.internal.os.BatteryStatsImpl) null;
  }
  public void noteStartAudio(int arg1){
  }
  public void noteStopAudio(int arg1){
  }
  public void noteStartVideo(int arg1){
  }
  public void noteStopVideo(int arg1){
  }
  public boolean isOnBattery(){
    return false;
  }
}
