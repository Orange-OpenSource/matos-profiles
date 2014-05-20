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
public class Vpn
  extends android.net.INetworkManagementEventObserver.Stub{
  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public Vpn(android.content.Context arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("VpnCallback") com.android.server.ConnectivityService.VpnCallback arg2){
    super();
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public synchronized boolean prepare(java.lang.String arg1, java.lang.String arg2){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public synchronized void interfaceStatusChanged(java.lang.String arg1, boolean arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void interfaceLinkStateChanged(java.lang.String arg1, boolean arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void interfaceAdded(java.lang.String arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public synchronized void interfaceRemoved(java.lang.String arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void limitReached(java.lang.String arg1, java.lang.String arg2){
  }
  public synchronized void startLegacyVpn(com.android.internal.net.VpnConfig arg1, java.lang.String [] arg2, java.lang.String [] arg3){
  }
  public synchronized com.android.internal.net.LegacyVpnInfo getLegacyVpnInfo(){
    return (com.android.internal.net.LegacyVpnInfo) null;
  }
  public void protect(android.os.ParcelFileDescriptor arg1, java.lang.String arg2) throws java.lang.Exception{
  }
  public synchronized android.os.ParcelFileDescriptor establish(com.android.internal.net.VpnConfig arg1){
    return (android.os.ParcelFileDescriptor) null;
  }
}
