package android.net;

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
public class ConnectivityManager
{
  // Fields

  public static final java.lang.String CONNECTIVITY_ACTION = "android.net.conn.CONNECTIVITY_CHANGE";

  public static final java.lang.String CONNECTIVITY_ACTION_IMMEDIATE = "android.net.conn.CONNECTIVITY_CHANGE_IMMEDIATE";

  public static final java.lang.String EXTRA_NETWORK_INFO = "networkInfo";

  public static final java.lang.String EXTRA_IS_FAILOVER = "isFailover";

  public static final java.lang.String EXTRA_OTHER_NETWORK_INFO = "otherNetwork";

  public static final java.lang.String EXTRA_NO_CONNECTIVITY = "noConnectivity";

  public static final java.lang.String EXTRA_REASON = "reason";

  public static final java.lang.String EXTRA_EXTRA_INFO = "extraInfo";

  public static final java.lang.String EXTRA_INET_CONDITION = "inetCondition";

  public static final java.lang.String ACTION_BACKGROUND_DATA_SETTING_CHANGED = "android.net.conn.BACKGROUND_DATA_SETTING_CHANGED";

  public static final java.lang.String INET_CONDITION_ACTION = "android.net.conn.INET_CONDITION_ACTION";

  public static final java.lang.String ACTION_TETHER_STATE_CHANGED = "android.net.conn.TETHER_STATE_CHANGED";

  public static final java.lang.String EXTRA_AVAILABLE_TETHER = "availableArray";

  public static final java.lang.String EXTRA_ACTIVE_TETHER = "activeArray";

  public static final java.lang.String EXTRA_ERRORED_TETHER = "erroredArray";

  public static final int TYPE_NONE = -1;

  public static final int TYPE_MOBILE = 0;

  public static final int TYPE_WIFI = 1;

  public static final int TYPE_MOBILE_MMS = 2;

  public static final int TYPE_MOBILE_SUPL = 3;

  public static final int TYPE_MOBILE_DUN = 4;

  public static final int TYPE_MOBILE_HIPRI = 5;

  public static final int TYPE_WIMAX = 6;

  public static final int TYPE_BLUETOOTH = 7;

  public static final int TYPE_DUMMY = 8;

  public static final int TYPE_ETHERNET = 9;

  public static final int TYPE_MOBILE_FOTA = 10;

  public static final int TYPE_MOBILE_IMS = 11;

  public static final int TYPE_MOBILE_CBS = 12;

  public static final int TYPE_WIFI_P2P = 13;

  public static final int MAX_RADIO_TYPE = 13;

  public static final int MAX_NETWORK_TYPE = 13;

  public static final int DEFAULT_NETWORK_PREFERENCE = 1;

  public static final int TETHER_ERROR_NO_ERROR = 0;

  public static final int TETHER_ERROR_UNKNOWN_IFACE = 1;

  public static final int TETHER_ERROR_SERVICE_UNAVAIL = 2;

  public static final int TETHER_ERROR_UNSUPPORTED = 3;

  public static final int TETHER_ERROR_UNAVAIL_IFACE = 4;

  public static final int TETHER_ERROR_MASTER_ERROR = 5;

  public static final int TETHER_ERROR_TETHER_IFACE_ERROR = 6;

  public static final int TETHER_ERROR_UNTETHER_IFACE_ERROR = 7;

  public static final int TETHER_ERROR_ENABLE_NAT_ERROR = 8;

  public static final int TETHER_ERROR_DISABLE_NAT_ERROR = 9;

  public static final int TETHER_ERROR_IFACE_CFG_ERROR = 10;

  // Constructors

  public ConnectivityManager(IConnectivityManager arg1){
  }
  // Methods

  public void setGlobalProxy(ProxyProperties arg1){
  }
  public LinkProperties getLinkProperties(int arg1){
    return (LinkProperties) null;
  }
  public boolean setRadio(int arg1, boolean arg2){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "ConnectivityManager.getNetworkInfo", report = "-")
  public NetworkInfo getNetworkInfo(int arg1){
    return (NetworkInfo) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "ConnectivityManager.startUsingNetworkFeature", pos = {1, 2}, report = "-")
  public int startUsingNetworkFeature(int arg1, java.lang.String arg2){
    return 0;
  }
  public int stopUsingNetworkFeature(int arg1, java.lang.String arg2){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "ConnectivityManager.setNetworkPreference", pos = 1, report = "-")
  public void setNetworkPreference(int arg1){
  }
  public ProxyProperties getProxy(){
    return (ProxyProperties) null;
  }
  public boolean isNetworkSupported(int arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "ConnectivityManager.getNetworkPreference", report = "-")
  public int getNetworkPreference(){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "ConnectivityManager.getActiveNetworkInfo", report = "-")
  public NetworkInfo getActiveNetworkInfo(){
    return (NetworkInfo) null;
  }
  public NetworkInfo getActiveNetworkInfoForUid(int arg1){
    return (NetworkInfo) null;
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "ConnectivityManager.getAllNetworkInfo", report = "-")
  public NetworkInfo [] getAllNetworkInfo(){
    return (NetworkInfo []) null;
  }
  public LinkProperties getActiveLinkProperties(){
    return (LinkProperties) null;
  }
  public NetworkQuotaInfo getActiveNetworkQuotaInfo(){
    return (NetworkQuotaInfo) null;
  }
  public boolean setRadios(boolean arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "ConnectivityManager.requestRouteToHost", report = "-")
  public boolean requestRouteToHost(int arg1, int arg2){
    return false;
  }
  public boolean requestRouteToHostAddress(int arg1, java.net.InetAddress arg2){
    return false;
  }
  public boolean getMobileDataEnabled(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "ConnectivityManager.setMobileDataEnabled", pos = 1, report = "-")
  public void setMobileDataEnabled(boolean arg1){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "ConnectivityManager.tether", pos = 1, report = "-")
  public int tether(java.lang.String arg1){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "ConnectivityManager.untether", pos = 1, report = "-")
  public int untether(java.lang.String arg1){
    return 0;
  }
  public int getLastTetherError(java.lang.String arg1){
    return 0;
  }
  public boolean isTetheringSupported(){
    return false;
  }
  public java.lang.String [] getTetherableIfaces(){
    return (java.lang.String []) null;
  }
  public java.lang.String [] getTetheredIfaces(){
    return (java.lang.String []) null;
  }
  public java.lang.String [] getTetheringErroredIfaces(){
    return (java.lang.String []) null;
  }
  public java.lang.String [] getTetherableUsbRegexs(){
    return (java.lang.String []) null;
  }
  public java.lang.String [] getTetherableWifiRegexs(){
    return (java.lang.String []) null;
  }
  public java.lang.String [] getTetherableBluetoothRegexs(){
    return (java.lang.String []) null;
  }
  public int setUsbTethering(boolean arg1){
    return 0;
  }
  public boolean requestNetworkTransitionWakelock(java.lang.String arg1){
    return false;
  }
  public void reportInetCondition(int arg1, int arg2){
  }
  public ProxyProperties getGlobalProxy(){
    return (ProxyProperties) null;
  }
  public void setDataDependency(int arg1, boolean arg2){
  }
  public static java.lang.String getNetworkTypeName(int arg1){
    return (java.lang.String) null;
  }
  public boolean getBackgroundDataSetting(){
    return false;
  }
  public static boolean isNetworkTypeValid(int arg1){
    return false;
  }
  public static boolean isNetworkTypeMobile(int arg1){
    return false;
  }
  public void setBackgroundDataSetting(boolean arg1){
  }
}
