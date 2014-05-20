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
public class WifiNative
{
  // Constructors

  public WifiNative(){
  }
  // Methods

  public static java.lang.String p2pGetInterfaceAddress(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public static boolean setPersistentReconnect(boolean arg1){
    return false;
  }
  public static boolean setDeviceName(java.lang.String arg1){
    return false;
  }
  public static boolean setDeviceType(java.lang.String arg1){
    return false;
  }
  public static java.lang.String p2pGetDeviceAddress(){
    return (java.lang.String) null;
  }
  public static java.lang.String getErrorString(int arg1){
    return (java.lang.String) null;
  }
  public static boolean startSupplicant(){
    return false;
  }
  public static boolean disconnectCommand(){
    return false;
  }
  public static boolean reconnectCommand(){
    return false;
  }
  public static boolean reassociateCommand(){
    return false;
  }
  public static boolean setScanResultHandlingCommand(int arg1){
    return false;
  }
  public static boolean p2pCancelConnect(){
    return false;
  }
  public static void setScanIntervalCommand(int arg1){
  }
  public static boolean killSupplicant(){
    return false;
  }
  public static void closeSupplicantConnection(){
  }
  public static java.lang.String scanResultsCommand(){
    return (java.lang.String) null;
  }
  public static boolean pingCommand(){
    return false;
  }
  public static boolean addToBlacklistCommand(java.lang.String arg1){
    return false;
  }
  public static boolean clearBlacklistCommand(){
    return false;
  }
  public static boolean unloadDriver(){
    return false;
  }
  public static java.lang.String waitForEvent(){
    return (java.lang.String) null;
  }
  public static boolean loadDriver(){
    return false;
  }
  public static boolean connectToSupplicant(){
    return false;
  }
  public static boolean startFilteringMulticastV4Packets(){
    return false;
  }
  public static boolean stopFilteringMulticastV4Packets(){
    return false;
  }
  public static boolean stopSupplicant(){
    return false;
  }
  public static boolean startDriverCommand(){
    return false;
  }
  public static void enableBackgroundScanCommand(boolean arg1){
  }
  public static boolean isDriverLoaded(){
    return false;
  }
  public static boolean startP2pSupplicant(){
    return false;
  }
  public static boolean scanCommand(boolean arg1){
    return false;
  }
  public static boolean setScanModeCommand(boolean arg1){
    return false;
  }
  public static java.lang.String listNetworksCommand(){
    return (java.lang.String) null;
  }
  public static int addNetworkCommand(){
    return 0;
  }
  public static boolean setNetworkVariableCommand(int arg1, java.lang.String arg2, java.lang.String arg3){
    return false;
  }
  public static java.lang.String getNetworkVariableCommand(int arg1, java.lang.String arg2){
    return (java.lang.String) null;
  }
  public static boolean removeNetworkCommand(int arg1){
    return false;
  }
  public static boolean enableNetworkCommand(int arg1, boolean arg2){
    return false;
  }
  public static boolean disableNetworkCommand(int arg1){
    return false;
  }
  public static java.lang.String statusCommand(){
    return (java.lang.String) null;
  }
  public static java.lang.String getMacAddressCommand(){
    return (java.lang.String) null;
  }
  public static boolean stopDriverCommand(){
    return false;
  }
  public static boolean startFilteringMulticastV6Packets(){
    return false;
  }
  public static boolean stopFilteringMulticastV6Packets(){
    return false;
  }
  public static boolean setPowerModeCommand(int arg1){
    return false;
  }
  public static int getBandCommand(){
    return 0;
  }
  public static boolean setBandCommand(int arg1){
    return false;
  }
  public static int getPowerModeCommand(){
    return 0;
  }
  public static boolean setBluetoothCoexistenceModeCommand(int arg1){
    return false;
  }
  public static boolean setBluetoothCoexistenceScanModeCommand(boolean arg1){
    return false;
  }
  public static boolean saveConfigCommand(){
    return false;
  }
  public static boolean reloadConfigCommand(){
    return false;
  }
  public static boolean startWpsPbcCommand(java.lang.String arg1){
    return false;
  }
  public static boolean startWpsWithPinFromAccessPointCommand(java.lang.String arg1, java.lang.String arg2){
    return false;
  }
  public static java.lang.String startWpsWithPinFromDeviceCommand(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public static boolean setSuspendOptimizationsCommand(boolean arg1){
    return false;
  }
  public static boolean setCountryCodeCommand(java.lang.String arg1){
    return false;
  }
  public static java.lang.String signalPoll(){
    return (java.lang.String) null;
  }
  public static boolean wpsPbc(){
    return false;
  }
  public static boolean wpsPin(java.lang.String arg1){
    return false;
  }
  public static boolean p2pFind(){
    return false;
  }
  public static boolean p2pFind(int arg1){
    return false;
  }
  public static boolean p2pListen(){
    return false;
  }
  public static boolean p2pListen(int arg1){
    return false;
  }
  public static boolean p2pFlush(){
    return false;
  }
  public static java.lang.String p2pConnect(android.net.wifi.p2p.WifiP2pConfig arg1, boolean arg2){
    return (java.lang.String) null;
  }
  public static boolean p2pGroupAdd(){
    return false;
  }
  public static boolean p2pGroupRemove(java.lang.String arg1){
    return false;
  }
  public static boolean p2pReject(java.lang.String arg1){
    return false;
  }
  public static boolean p2pInvite(android.net.wifi.p2p.WifiP2pGroup arg1, java.lang.String arg2){
    return false;
  }
  public static boolean p2pReinvoke(int arg1, java.lang.String arg2){
    return false;
  }
  public static java.lang.String p2pPeer(java.lang.String arg1){
    return (java.lang.String) null;
  }
}
