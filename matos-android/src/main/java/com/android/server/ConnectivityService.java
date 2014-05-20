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


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public class ConnectivityService
  extends android.net.IConnectivityManager.Stub{
  // Classes

  public class VpnCallback
  {
    // Fields

    // Constructors

    private VpnCallback(){
    }
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("VpnCallback")
    public void override(java.util.List<java.lang.String> arg1, java.util.List<java.lang.String> arg2){
    }
    @com.francetelecom.rd.stubs.annotation.CallBack("VpnCallback")
    public void restore(){
    }
  }
  // Constructors

  public ConnectivityService(android.content.Context arg1, android.os.INetworkManagementService arg2, android.net.INetworkStatsService arg3, android.net.INetworkPolicyManager arg4){
    super();
  }
  // Methods

  protected void dump(java.io.FileDescriptor arg1, java.io.PrintWriter arg2, java.lang.String [] arg3){
  }
  public void setGlobalProxy(@com.francetelecom.rd.stubs.annotation.FieldSet("globalProxy") android.net.ProxyProperties arg1){
  }
  public android.net.LinkProperties getLinkProperties(int arg1){
    return (android.net.LinkProperties) null;
  }
  public boolean setRadio(int arg1, boolean arg2){
    return false;
  }
  public android.net.NetworkInfo getNetworkInfo(int arg1){
    return (android.net.NetworkInfo) null;
  }
  public void setPolicyDataEnable(int arg1, boolean arg2){
  }
  public int startUsingNetworkFeature(int arg1, java.lang.String arg2, android.os.IBinder arg3){
    return 0;
  }
  public int stopUsingNetworkFeature(int arg1, java.lang.String arg2){
    return 0;
  }
  public void setNetworkPreference(int arg1){
  }
  public android.net.ProxyProperties getProxy(){
    return (android.net.ProxyProperties) null;
  }
  public boolean isNetworkSupported(int arg1){
    return false;
  }
  public int getNetworkPreference(){
    return 0;
  }
  public android.net.NetworkInfo getActiveNetworkInfo(){
    return (android.net.NetworkInfo) null;
  }
  public android.net.NetworkInfo getActiveNetworkInfoForUid(int arg1){
    return (android.net.NetworkInfo) null;
  }
  public android.net.NetworkInfo [] getAllNetworkInfo(){
    return (android.net.NetworkInfo []) null;
  }
  public android.net.LinkProperties getActiveLinkProperties(){
    return (android.net.LinkProperties) null;
  }
  public android.net.NetworkState [] getAllNetworkState(){
    return (android.net.NetworkState []) null;
  }
  public android.net.NetworkQuotaInfo getActiveNetworkQuotaInfo(){
    return (android.net.NetworkQuotaInfo) null;
  }
  public boolean setRadios(boolean arg1){
    return false;
  }
  public boolean requestRouteToHost(int arg1, int arg2){
    return false;
  }
  public boolean requestRouteToHostAddress(int arg1, byte [] arg2){
    return false;
  }
  public boolean getMobileDataEnabled(){
    return false;
  }
  public void setMobileDataEnabled(boolean arg1){
  }
  public int tether(java.lang.String arg1){
    return 0;
  }
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
  public java.lang.String [] getTetheredIfacePairs(){
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
  public void requestNetworkTransitionWakelock(java.lang.String arg1){
  }
  public void reportInetCondition(int arg1, int arg2){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("globalProxy")
  public android.net.ProxyProperties getGlobalProxy(){
    return (android.net.ProxyProperties) null;
  }
  public void setDataDependency(int arg1, boolean arg2){
  }
  public boolean protectVpn(android.os.ParcelFileDescriptor arg1){
    return false;
  }
  public boolean prepareVpn(java.lang.String arg1, java.lang.String arg2){
    return false;
  }
  public android.os.ParcelFileDescriptor establishVpn(com.android.internal.net.VpnConfig arg1){
    return (android.os.ParcelFileDescriptor) null;
  }
  public void startLegacyVpn(com.android.internal.net.VpnConfig arg1, java.lang.String [] arg2, java.lang.String [] arg3){
  }
  public com.android.internal.net.LegacyVpnInfo getLegacyVpnInfo(){
    return (com.android.internal.net.LegacyVpnInfo) null;
  }
  public void updateNetworkSettings(android.net.NetworkStateTracker arg1){
  }
}
