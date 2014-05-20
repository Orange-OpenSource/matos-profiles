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


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public class WifiManager
{
  // Classes

  public class WifiLock
  {
    // Fields

    // Constructors

    private WifiLock(int arg1, java.lang.String arg2){
    }
    // Methods

    protected void finalize() throws java.lang.Throwable{
    }
    public java.lang.String toString(){
      return (java.lang.String) null;
    }
    @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "WifiLock.acquire", pos = 0, report = "-")
    public void acquire(){
    }
    @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "WifiLock.release", pos = 0, report = "-")
    public void release(){
    }
    public boolean isHeld(){
      return false;
    }
    public void setReferenceCounted(boolean arg1){
    }
    public void setWorkSource(android.os.WorkSource arg1){
    }
  }
  public class MulticastLock
  {
    // Fields

    // Constructors

    private MulticastLock(java.lang.String arg1){
    }
    // Methods

    protected void finalize() throws java.lang.Throwable{
    }
    public java.lang.String toString(){
      return (java.lang.String) null;
    }
    @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "MulticastLock.acquire", pos = 0, report = "-")
    public void acquire(){
    }
    @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "MulticastLock.release", pos = 0, report = "-")
    public void release(){
    }
    public boolean isHeld(){
      return false;
    }
    public void setReferenceCounted(boolean arg1){
    }
  }
  // Fields

  public static final int ERROR_AUTHENTICATING = 1;

  public static final java.lang.String WIFI_STATE_CHANGED_ACTION = "android.net.wifi.WIFI_STATE_CHANGED";

  public static final java.lang.String EXTRA_WIFI_STATE = "wifi_state";

  public static final java.lang.String EXTRA_PREVIOUS_WIFI_STATE = "previous_wifi_state";

  public static final int WIFI_STATE_DISABLING = 0;

  public static final int WIFI_STATE_DISABLED = 1;

  public static final int WIFI_STATE_ENABLING = 2;

  public static final int WIFI_STATE_ENABLED = 3;

  public static final int WIFI_STATE_UNKNOWN = 4;

  public static final java.lang.String WIFI_AP_STATE_CHANGED_ACTION = "android.net.wifi.WIFI_AP_STATE_CHANGED";

  public static final java.lang.String EXTRA_WIFI_AP_STATE = "wifi_state";

  public static final java.lang.String EXTRA_PREVIOUS_WIFI_AP_STATE = "previous_wifi_state";

  public static final int WIFI_AP_STATE_DISABLING = 10;

  public static final int WIFI_AP_STATE_DISABLED = 11;

  public static final int WIFI_AP_STATE_ENABLING = 12;

  public static final int WIFI_AP_STATE_ENABLED = 13;

  public static final int WIFI_AP_STATE_FAILED = 14;

  public static final java.lang.String SUPPLICANT_CONNECTION_CHANGE_ACTION = "android.net.wifi.supplicant.CONNECTION_CHANGE";

  public static final java.lang.String EXTRA_SUPPLICANT_CONNECTED = "connected";

  public static final java.lang.String NETWORK_STATE_CHANGED_ACTION = "android.net.wifi.STATE_CHANGE";

  public static final java.lang.String EXTRA_NETWORK_INFO = "networkInfo";

  public static final java.lang.String EXTRA_BSSID = "bssid";

  public static final java.lang.String EXTRA_WIFI_INFO = "wifiInfo";

  public static final java.lang.String SUPPLICANT_STATE_CHANGED_ACTION = "android.net.wifi.supplicant.STATE_CHANGE";

  public static final java.lang.String EXTRA_NEW_STATE = "newState";

  public static final java.lang.String EXTRA_SUPPLICANT_ERROR = "supplicantError";

  public static final java.lang.String ERROR_ACTION = "android.net.wifi.ERROR";

  public static final java.lang.String EXTRA_ERROR_CODE = "errorCode";

  public static final int WPS_OVERLAP_ERROR = 1;

  public static final java.lang.String CONFIGURED_NETWORKS_CHANGED_ACTION = "android.net.wifi.CONFIGURED_NETWORKS_CHANGE";

  public static final java.lang.String SCAN_RESULTS_AVAILABLE_ACTION = "android.net.wifi.SCAN_RESULTS";

  public static final java.lang.String RSSI_CHANGED_ACTION = "android.net.wifi.RSSI_CHANGED";

  public static final java.lang.String EXTRA_NEW_RSSI = "newRssi";

  public static final java.lang.String LINK_CONFIGURATION_CHANGED_ACTION = "android.net.wifi.LINK_CONFIGURATION_CHANGED";

  public static final java.lang.String EXTRA_LINK_PROPERTIES = "linkProperties";

  public static final java.lang.String EXTRA_LINK_CAPABILITIES = "linkCapabilities";

  public static final java.lang.String NETWORK_IDS_CHANGED_ACTION = "android.net.wifi.NETWORK_IDS_CHANGED";

  public static final java.lang.String ACTION_PICK_WIFI_NETWORK = "android.net.wifi.PICK_WIFI_NETWORK";

  public static final int WIFI_MODE_FULL = 1;

  public static final int WIFI_MODE_SCAN_ONLY = 2;

  public static final int WIFI_MODE_FULL_HIGH_PERF = 3;

  public static final int WIFI_FREQUENCY_BAND_AUTO = 0;

  public static final int WIFI_FREQUENCY_BAND_5GHZ = 1;

  public static final int WIFI_FREQUENCY_BAND_2GHZ = 2;

  public static final int DATA_ACTIVITY_NOTIFICATION = 1;

  public static final int DATA_ACTIVITY_NONE = 0;

  public static final int DATA_ACTIVITY_IN = 1;

  public static final int DATA_ACTIVITY_OUT = 2;

  public static final int DATA_ACTIVITY_INOUT = 3;

  public static final int CMD_CONNECT_NETWORK = 1;

  public static final int CMD_FORGET_NETWORK = 2;

  public static final int CMD_SAVE_NETWORK = 3;

  public static final int CMD_START_WPS = 4;

  public static final int CMD_DISABLE_NETWORK = 5;

  public static final int CMD_WPS_COMPLETED = 11;

  public static final int CMD_ENABLE_TRAFFIC_STATS_POLL = 21;

  public static final int CMD_TRAFFIC_STATS_POLL = 22;

  // Constructors

  public WifiManager(IWifiManager arg1, android.os.Handler arg2){
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.UseRule(value = "WifiManager.reconnect", report = "-")
  public boolean reconnect(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "WifiManager.disconnect", report = "-")
  public boolean disconnect(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "WifiManager.setWifiEnabled", pos = 1, report = "-")
  public boolean setWifiEnabled(boolean arg1){
    return false;
  }
  public void setCountryCode(java.lang.String arg1, boolean arg2){
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "WifiManager.getConfiguredNetworks", report = "-")
  public java.util.List<WifiConfiguration> getConfiguredNetworks(){
    return (java.util.List) null;
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "WifiManager.removeNetwork", report = "-")
  public boolean removeNetwork(int arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "WifiManager.enableNetwork", report = "-")
  public boolean enableNetwork(int arg1, boolean arg2){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "WifiManager.disableNetwork", report = "-")
  public boolean disableNetwork(int arg1){
    return false;
  }
  public void disableNetwork(int arg1, int arg2){
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "WifiManager.pingSupplicant", report = "-")
  public boolean pingSupplicant(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "WifiManager.startScan", report = "-")
  public boolean startScan(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "WifiManager.getScanResults", report = "-")
  public java.util.List<ScanResult> getScanResults(){
    return (java.util.List) null;
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "WifiManager.reassociate", report = "-")
  public boolean reassociate(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "WifiManager.getConnectionInfo", report = "-")
  public WifiInfo getConnectionInfo(){
    return (WifiInfo) null;
  }
  public void setFrequencyBand(int arg1, boolean arg2){
  }
  public int getFrequencyBand(){
    return 0;
  }
  public boolean isDualBandSupported(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "WifiManager.saveConfiguration", report = "-")
  public boolean saveConfiguration(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "WifiManager.getDhcpInfo", report = "-")
  public android.net.DhcpInfo getDhcpInfo(){
    return (android.net.DhcpInfo) null;
  }
  public boolean initializeMulticastFiltering(){
    return false;
  }
  public boolean isMulticastEnabled(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "WifiManager.setWifiApEnabled", pos = 2, report = "-")
  public boolean setWifiApEnabled(WifiConfiguration arg1, boolean arg2){
    return false;
  }
  public WifiConfiguration getWifiApConfiguration(){
    return (WifiConfiguration) null;
  }
  public boolean setWifiApConfiguration(WifiConfiguration arg1){
    return false;
  }
  public boolean startWifi(){
    return false;
  }
  public boolean stopWifi(){
    return false;
  }
  public boolean addToBlacklist(java.lang.String arg1){
    return false;
  }
  public boolean clearBlacklist(){
    return false;
  }
  public android.os.Messenger getMessenger(){
    return (android.os.Messenger) null;
  }
  public java.lang.String getConfigFile(){
    return (java.lang.String) null;
  }
  public void saveNetwork(WifiConfiguration arg1){
  }
  public void forgetNetwork(int arg1){
  }
  public void connectNetwork(WifiConfiguration arg1){
  }
  public void connectNetwork(int arg1){
  }
  public void startWps(WpsInfo arg1){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "WifiManager.createWifiLock-1", pos = {2, -1}, report = "-")
  public WifiManager.WifiLock createWifiLock(int arg1, java.lang.String arg2){
    return (WifiManager.WifiLock) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "WifiManager.createWifiLock-2", pos = {1, -1}, report = "-")
  public WifiManager.WifiLock createWifiLock(java.lang.String arg1){
    return (WifiManager.WifiLock) null;
  }
  public void asyncConnect(android.content.Context arg1, android.os.Handler arg2){
  }
  public static int calculateSignalLevel(int arg1, int arg2){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "WifiManager.addNetwork", report = "-")
  public int addNetwork(WifiConfiguration arg1){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "WifiManager.updateNetwork", report = "-")
  public int updateNetwork(WifiConfiguration arg1){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "WifiManager.startScanActivity", report = "-")
  public boolean startScanActive(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "WifiManager.getWifiState", report = "-")
  public int getWifiState(){
    return 0;
  }
  public boolean isWifiEnabled(){
    return false;
  }
  public static int compareSignalLevel(int arg1, int arg2){
    return 0;
  }
  public int getWifiApState(){
    return 0;
  }
  public boolean isWifiApEnabled(){
    return false;
  }
  public WifiManager.MulticastLock createMulticastLock(java.lang.String arg1){
    return (WifiManager.MulticastLock) null;
  }
}
