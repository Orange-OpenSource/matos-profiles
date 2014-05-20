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
public class NetworkManagementService
  extends android.os.INetworkManagementService.Stub  implements Watchdog.Monitor
{
  // Fields

  public static final java.lang.String LIMIT_GLOBAL_ALERT = "globalAlert";

  // Constructors
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  private NetworkManagementService(android.content.Context arg1){
    super();
  }
  // Methods

  public void shutdown(){
  }
  public static NetworkManagementService create(android.content.Context arg1) throws java.lang.InterruptedException{
    return (NetworkManagementService) null;
  }
  protected void dump(java.io.FileDescriptor arg1, java.io.PrintWriter arg2, java.lang.String [] arg3){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void monitor(){
  }
  public void systemReady(){
  }
  public void addRoute(java.lang.String arg1, android.net.RouteInfo arg2){
  }
  public android.net.RouteInfo [] getRoutes(java.lang.String arg1){
    return (android.net.RouteInfo []) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("interfaceConfig")
  public android.net.InterfaceConfiguration getInterfaceConfig(java.lang.String arg1) throws java.lang.IllegalStateException{
    return (android.net.InterfaceConfiguration) null;
  }
  public void setInterfaceConfig(java.lang.String arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("interfaceConfig") android.net.InterfaceConfiguration arg2) throws java.lang.IllegalStateException{
  }
  public void startTethering(java.lang.String [] arg1) throws java.lang.IllegalStateException{
  }
  public void stopTethering() throws java.lang.IllegalStateException{
  }
  public void registerObserver(@com.francetelecom.rd.stubs.annotation.CallBackRegister("eventObserver") android.net.INetworkManagementEventObserver arg1){
  }
  public void unregisterObserver(android.net.INetworkManagementEventObserver arg1){
  }
  public void wifiFirmwareReload(java.lang.String arg1, java.lang.String arg2) throws java.lang.IllegalStateException{
  }
  public void setInterfaceDown(java.lang.String arg1) throws java.lang.IllegalStateException{
  }
  public void setInterfaceIpv6PrivacyExtensions(java.lang.String arg1, boolean arg2) throws java.lang.IllegalStateException{
  }
  public java.lang.String [] listInterfaces() throws java.lang.IllegalStateException{
    return (java.lang.String []) null;
  }
  public void clearInterfaceAddresses(java.lang.String arg1) throws java.lang.IllegalStateException{
  }
  public void setInterfaceUp(java.lang.String arg1) throws java.lang.IllegalStateException{
  }
  public void disableIpv6(java.lang.String arg1) throws java.lang.IllegalStateException{
  }
  public void enableIpv6(java.lang.String arg1) throws java.lang.IllegalStateException{
  }
  public void removeRoute(java.lang.String arg1, android.net.RouteInfo arg2){
  }
  public boolean getIpForwardingEnabled() throws java.lang.IllegalStateException{
    return false;
  }
  public void setIpForwardingEnabled(boolean arg1) throws java.lang.IllegalStateException{
  }
  public boolean isTetheringStarted() throws java.lang.IllegalStateException{
    return false;
  }
  public void tetherInterface(java.lang.String arg1) throws java.lang.IllegalStateException{
  }
  public void untetherInterface(java.lang.String arg1){
  }
  public java.lang.String [] listTetheredInterfaces() throws java.lang.IllegalStateException{
    return (java.lang.String []) null;
  }
  public void setDnsForwarders(@com.francetelecom.rd.stubs.annotation.FieldSet("dnsForwarders") java.lang.String [] arg1) throws java.lang.IllegalStateException{
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("dnsForwarders")
  public java.lang.String [] getDnsForwarders() throws java.lang.IllegalStateException{
    return (java.lang.String []) null;
  }
  public void enableNat(java.lang.String arg1, java.lang.String arg2) throws java.lang.IllegalStateException{
  }
  public void disableNat(java.lang.String arg1, java.lang.String arg2) throws java.lang.IllegalStateException{
  }
  public java.lang.String [] listTtys() throws java.lang.IllegalStateException{
    return (java.lang.String []) null;
  }
  public void attachPppd(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5) throws java.lang.IllegalStateException{
  }
  public void detachPppd(java.lang.String arg1) throws java.lang.IllegalStateException{
  }
  public void startAccessPoint(android.net.wifi.WifiConfiguration arg1, java.lang.String arg2, java.lang.String arg3) throws java.lang.IllegalStateException{
  }
  public void stopAccessPoint(java.lang.String arg1) throws java.lang.IllegalStateException{
  }
  public void setAccessPoint(android.net.wifi.WifiConfiguration arg1, java.lang.String arg2, java.lang.String arg3) throws java.lang.IllegalStateException{
  }
  public android.net.NetworkStats getNetworkStatsSummary(){
    return (android.net.NetworkStats) null;
  }
  public android.net.NetworkStats getNetworkStatsDetail(){
    return (android.net.NetworkStats) null;
  }
  public android.net.NetworkStats getNetworkStatsUidDetail(int arg1){
    return (android.net.NetworkStats) null;
  }
  public android.net.NetworkStats getNetworkStatsTethering(java.lang.String [] arg1){
    return (android.net.NetworkStats) null;
  }
  public void setInterfaceQuota(java.lang.String arg1, long arg2){
  }
  public void removeInterfaceQuota(java.lang.String arg1){
  }
  public void setInterfaceAlert(java.lang.String arg1, long arg2){
  }
  public void removeInterfaceAlert(java.lang.String arg1){
  }
  public void setGlobalAlert(long arg1){
  }
  public void setUidNetworkRules(int arg1, boolean arg2){
  }
  public boolean isBandwidthControlEnabled(){
    return false;
  }
  public void setInterfaceThrottle(java.lang.String arg1, int arg2, int arg3){
  }
  public int getInterfaceRxThrottle(java.lang.String arg1){
    return 0;
  }
  public int getInterfaceTxThrottle(java.lang.String arg1){
    return 0;
  }
  public void setDefaultInterfaceForDns(java.lang.String arg1) throws java.lang.IllegalStateException{
  }
  public void setDnsServersForInterface(java.lang.String arg1, java.lang.String [] arg2) throws java.lang.IllegalStateException{
  }
  public void flushDefaultDnsCache() throws java.lang.IllegalStateException{
  }
  public void flushInterfaceDnsCache(java.lang.String arg1) throws java.lang.IllegalStateException{
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onDaemonConnected(){
  }
}
