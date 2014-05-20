package com.android.server;

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


public class WifiService
  extends android.net.wifi.IWifiManager.Stub{
  // Constructors

  WifiService(android.content.Context arg1){
    super();
  }
  // Methods

  protected void dump(java.io.FileDescriptor arg1, java.io.PrintWriter arg2, java.lang.String [] arg3){
  }
  public void reconnect(){
  }
  public void disconnect(){
  }
  public synchronized boolean setWifiEnabled(boolean arg1){
    return false;
  }
  public void setCountryCode(java.lang.String arg1, boolean arg2){
  }
  public java.util.List<android.net.wifi.WifiConfiguration> getConfiguredNetworks(){
    return (java.util.List) null;
  }
  public int addOrUpdateNetwork(android.net.wifi.WifiConfiguration arg1){
    return 0;
  }
  public boolean removeNetwork(int arg1){
    return false;
  }
  public boolean enableNetwork(int arg1, boolean arg2){
    return false;
  }
  public boolean disableNetwork(int arg1){
    return false;
  }
  public boolean pingSupplicant(){
    return false;
  }
  public void startScan(boolean arg1){
  }
  public java.util.List<android.net.wifi.ScanResult> getScanResults(){
    return (java.util.List) null;
  }
  public void reassociate(){
  }
  public android.net.wifi.WifiInfo getConnectionInfo(){
    return (android.net.wifi.WifiInfo) null;
  }
  public int getWifiEnabledState(){
    return 0;
  }
  public void setFrequencyBand(int arg1, boolean arg2){
  }
  public int getFrequencyBand(){
    return 0;
  }
  public boolean isDualBandSupported(){
    return false;
  }
  public boolean saveConfiguration(){
    return false;
  }
  public android.net.DhcpInfo getDhcpInfo(){
    return (android.net.DhcpInfo) null;
  }
  public boolean acquireWifiLock(android.os.IBinder arg1, int arg2, java.lang.String arg3, android.os.WorkSource arg4){
    return false;
  }
  public void updateWifiLockWorkSource(android.os.IBinder arg1, android.os.WorkSource arg2){
  }
  public boolean releaseWifiLock(android.os.IBinder arg1){
    return false;
  }
  public void initializeMulticastFiltering(){
  }
  public boolean isMulticastEnabled(){
    return false;
  }
  public void acquireMulticastLock(android.os.IBinder arg1, java.lang.String arg2){
  }
  public void releaseMulticastLock(){
  }
  public void setWifiApEnabled(android.net.wifi.WifiConfiguration arg1, boolean arg2){
  }
  public int getWifiApEnabledState(){
    return 0;
  }
  public android.net.wifi.WifiConfiguration getWifiApConfiguration(){
    return (android.net.wifi.WifiConfiguration) null;
  }
  public void setWifiApConfiguration(android.net.wifi.WifiConfiguration arg1){
  }
  public void startWifi(){
  }
  public void stopWifi(){
  }
  public void addToBlacklist(java.lang.String arg1){
  }
  public void clearBlacklist(){
  }
  public android.os.Messenger getMessenger(){
    return (android.os.Messenger) null;
  }
  public java.lang.String getConfigFile(){
    return (java.lang.String) null;
  }
  public void checkAndStartWifi(){
  }
}
