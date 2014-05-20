package com.android.server.connectivity;

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
public class Tethering
  extends android.net.INetworkManagementEventObserver.Stub{
  // Constructors

  public Tethering(android.content.Context arg1, android.os.INetworkManagementService arg2, android.net.INetworkStatsService arg3, android.os.Looper arg4){
    super();
  }
  // Methods

  public void dump(java.io.FileDescriptor arg1, java.io.PrintWriter arg2, java.lang.String [] arg3){
  }
  public void interfaceStatusChanged(java.lang.String arg1, boolean arg2){
  }
  public void interfaceLinkStateChanged(java.lang.String arg1, boolean arg2){
  }
  public void interfaceAdded(java.lang.String arg1){
  }
  public void interfaceRemoved(java.lang.String arg1){
  }
  public void limitReached(java.lang.String arg1, java.lang.String arg2){
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
  public java.lang.String [] getTetherableIfaces(){
    return (java.lang.String []) null;
  }
  public java.lang.String [] getTetheredIfaces(){
    return (java.lang.String []) null;
  }
  public java.lang.String [] getTetheredIfacePairs(){
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
  public int [] getUpstreamIfaceTypes(){
    return (int []) null;
  }
  public void handleTetherIfaceChange(){
  }
  public java.lang.String [] getErroredIfaces(){
    return (java.lang.String []) null;
  }
  public boolean isWifi(java.lang.String arg1){
    return false;
  }
  public boolean isBluetooth(java.lang.String arg1){
    return false;
  }
  public void checkDunRequired(){
  }
}
