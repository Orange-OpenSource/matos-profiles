package android.net.wifi;

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


public class WifiStateMachine
  extends com.android.internal.util.StateMachine{
  // Fields

  public static final int WIFI_ENABLE_PENDING = 131203;

  public static final int P2P_ENABLE_PROCEED = 131204;

  // Constructors

  public WifiStateMachine(android.content.Context arg1, java.lang.String arg2){
    super((java.lang.String) null);
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public void setWifiEnabled(boolean arg1){
  }
  public void setCountryCode(java.lang.String arg1, boolean arg2){
  }
  public void disableNetwork(android.os.Messenger arg1, int arg2, int arg3){
  }
  public void startScan(boolean arg1){
  }
  public void setFrequencyBand(int arg1, boolean arg2){
  }
  public int getFrequencyBand(){
    return 0;
  }
  public void setWifiApEnabled(WifiConfiguration arg1, boolean arg2){
  }
  public void setWifiApConfiguration(WifiConfiguration arg1){
  }
  public void addToBlacklist(java.lang.String arg1){
  }
  public void clearBlacklist(){
  }
  public java.lang.String getConfigFile(){
    return (java.lang.String) null;
  }
  public void disconnectCommand(){
  }
  public void reconnectCommand(){
  }
  public void reassociateCommand(){
  }
  public void startFilteringMulticastV4Packets(){
  }
  public void stopFilteringMulticastV4Packets(){
  }
  public void enableBackgroundScanCommand(boolean arg1){
  }
  public void startFilteringMulticastV6Packets(){
  }
  public void stopFilteringMulticastV6Packets(){
  }
  public void enableAllNetworks(){
  }
  public void saveNetwork(WifiConfiguration arg1){
  }
  public void forgetNetwork(int arg1){
  }
  public void enableRssiPolling(boolean arg1){
  }
  public boolean syncPingSupplicant(com.android.internal.util.AsyncChannel arg1){
    return false;
  }
  public int syncGetWifiState(){
    return 0;
  }
  public int syncGetWifiApState(){
    return 0;
  }
  public WifiConfiguration syncGetWifiApConfiguration(com.android.internal.util.AsyncChannel arg1){
    return (WifiConfiguration) null;
  }
  public java.util.List<WifiConfiguration> syncGetConfiguredNetworks(){
    return (java.util.List) null;
  }
  public int syncAddOrUpdateNetwork(com.android.internal.util.AsyncChannel arg1, WifiConfiguration arg2){
    return 0;
  }
  public boolean syncRemoveNetwork(com.android.internal.util.AsyncChannel arg1, int arg2){
    return false;
  }
  public boolean syncEnableNetwork(com.android.internal.util.AsyncChannel arg1, int arg2, boolean arg3){
    return false;
  }
  public boolean syncDisableNetwork(com.android.internal.util.AsyncChannel arg1, int arg2){
    return false;
  }
  public WifiInfo syncRequestConnectionInfo(){
    return (WifiInfo) null;
  }
  public java.util.List<ScanResult> syncGetScanResultsList(){
    return (java.util.List) null;
  }
  public boolean syncSaveConfig(com.android.internal.util.AsyncChannel arg1){
    return false;
  }
  public android.net.DhcpInfo syncGetDhcpInfo(){
    return (android.net.DhcpInfo) null;
  }
  public void setDriverStart(boolean arg1){
  }
  public void updateBatteryWorkSource(android.os.WorkSource arg1){
  }
  public void setScanOnlyMode(boolean arg1){
  }
  public void setHighPerfModeEnabled(boolean arg1){
  }
  public void requestCmWakeLock(){
  }
  public java.lang.String syncGetWifiStateByName(){
    return (java.lang.String) null;
  }
  public void sendBluetoothAdapterStateChange(int arg1){
  }
  public void connectNetwork(int arg1){
  }
  public void connectNetwork(WifiConfiguration arg1){
  }
  public void startWps(android.os.Messenger arg1, WpsInfo arg2){
  }
  public java.lang.String syncGetWifiApStateByName(){
    return (java.lang.String) null;
  }
  public void setScanType(boolean arg1){
  }
}
