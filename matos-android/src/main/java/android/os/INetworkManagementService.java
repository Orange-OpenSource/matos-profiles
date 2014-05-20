package android.os;

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


public interface INetworkManagementService
  extends IInterface
{
  // Classes

  @com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.INetworkManagementServiceStubImplem", superClass = "")
  public abstract static class Stub
    extends Binder    implements INetworkManagementService
  {
    // Constructors

    public Stub(){
      super();
    }
    // Methods

    public IBinder asBinder(){
      return (IBinder) null;
    }
    public static INetworkManagementService asInterface(IBinder arg1){
      return (INetworkManagementService) null;
    }
    @com.francetelecom.rd.stubs.annotation.CallBackRegister("INetworkManagementService")
    public boolean onTransact(int arg1, Parcel arg2, Parcel arg3, int arg4) throws RemoteException{
      return false;
    }
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("INetworkManagementService")
  public void shutdown() throws RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("INetworkManagementService")
  public void addRoute(java.lang.String arg1, android.net.RouteInfo arg2) throws RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("INetworkManagementService")
  public android.net.RouteInfo [] getRoutes(java.lang.String arg1) throws RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("INetworkManagementService")
  public android.net.InterfaceConfiguration getInterfaceConfig(java.lang.String arg1) throws RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("INetworkManagementService")
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "INetworkManagementService.setInterfaceConfig", pos = 1, report = "-")
  public void setInterfaceConfig(java.lang.String arg1, android.net.InterfaceConfiguration arg2) throws RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("INetworkManagementService")
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "INetworkManagementService.startTethering", report = "-")
  public void startTethering(java.lang.String [] arg1) throws RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("INetworkManagementService")
  public void stopTethering() throws RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("INetworkManagementService")
  public void registerObserver(@com.francetelecom.rd.stubs.annotation.CallBackRegister("eventObserver") android.net.INetworkManagementEventObserver arg1) throws RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("INetworkManagementService")
  public void unregisterObserver(android.net.INetworkManagementEventObserver arg1) throws RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("INetworkManagementService")
  public void wifiFirmwareReload(java.lang.String arg1, java.lang.String arg2) throws RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("INetworkManagementService")
  public void setInterfaceDown(java.lang.String arg1) throws RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("INetworkManagementService")
  public void setInterfaceIpv6PrivacyExtensions(java.lang.String arg1, boolean arg2) throws RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("INetworkManagementService")
  public java.lang.String [] listInterfaces() throws RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("INetworkManagementService")
  public void clearInterfaceAddresses(java.lang.String arg1) throws RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("INetworkManagementService")
  public void setInterfaceUp(java.lang.String arg1) throws RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("INetworkManagementService")
  public void disableIpv6(java.lang.String arg1) throws RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("INetworkManagementService")
  public void enableIpv6(java.lang.String arg1) throws RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("INetworkManagementService")
  public void removeRoute(java.lang.String arg1, android.net.RouteInfo arg2) throws RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("INetworkManagementService")
  public boolean getIpForwardingEnabled() throws RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("INetworkManagementService")
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "INetworkManagementService.setIpForwardingEnabled", report = "-")
  public void setIpForwardingEnabled(boolean arg1) throws RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("INetworkManagementService")
  public boolean isTetheringStarted() throws RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("INetworkManagementService")
  public void tetherInterface(java.lang.String arg1) throws RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("INetworkManagementService")
  public void untetherInterface(java.lang.String arg1) throws RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("INetworkManagementService")
  public java.lang.String [] listTetheredInterfaces() throws RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("INetworkManagementService")
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "INetworkManagementService.setDNSForwarders", report = "-")
  public void setDnsForwarders(java.lang.String [] arg1) throws RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("INetworkManagementService")
  public java.lang.String [] getDnsForwarders() throws RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("INetworkManagementService")
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "INetworkManagementService.enableNat", pos = {1, 2}, report = "-")
  public void enableNat(java.lang.String arg1, java.lang.String arg2) throws RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("INetworkManagementService")
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "INetworkManagementService.disableNat", pos = {1, 2}, report = "-")
  public void disableNat(java.lang.String arg1, java.lang.String arg2) throws RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("INetworkManagementService")
  public java.lang.String [] listTtys() throws RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("INetworkManagementService")
  public void attachPppd(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5) throws RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("INetworkManagementService")
  public void detachPppd(java.lang.String arg1) throws RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("INetworkManagementService")
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "INetworkManagementService.startAccessPoint", report = "-")
  public void startAccessPoint(android.net.wifi.WifiConfiguration arg1, java.lang.String arg2, java.lang.String arg3) throws RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("INetworkManagementService")
  public void stopAccessPoint(java.lang.String arg1) throws RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("INetworkManagementService")
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "INetworkManagementService.setAccessPoint", pos = {2, 3}, report = "-")
  public void setAccessPoint(android.net.wifi.WifiConfiguration arg1, java.lang.String arg2, java.lang.String arg3) throws RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("INetworkManagementService")
  public android.net.NetworkStats getNetworkStatsSummary() throws RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("INetworkManagementService")
  public android.net.NetworkStats getNetworkStatsDetail() throws RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("INetworkManagementService")
  public android.net.NetworkStats getNetworkStatsUidDetail(int arg1) throws RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("INetworkManagementService")
  public android.net.NetworkStats getNetworkStatsTethering(java.lang.String [] arg1) throws RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("INetworkManagementService")
  public void setInterfaceQuota(java.lang.String arg1, long arg2) throws RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("INetworkManagementService")
  public void removeInterfaceQuota(java.lang.String arg1) throws RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("INetworkManagementService")
  public void setInterfaceAlert(java.lang.String arg1, long arg2) throws RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("INetworkManagementService")
  public void removeInterfaceAlert(java.lang.String arg1) throws RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("INetworkManagementService")
  public void setGlobalAlert(long arg1) throws RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("INetworkManagementService")
  public void setUidNetworkRules(int arg1, boolean arg2) throws RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("INetworkManagementService")
  public boolean isBandwidthControlEnabled() throws RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("INetworkManagementService")
  public void setInterfaceThrottle(java.lang.String arg1, int arg2, int arg3) throws RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("INetworkManagementService")
  public int getInterfaceRxThrottle(java.lang.String arg1) throws RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("INetworkManagementService")
  public int getInterfaceTxThrottle(java.lang.String arg1) throws RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("INetworkManagementService")
  public void setDefaultInterfaceForDns(java.lang.String arg1) throws RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("INetworkManagementService")
  public void setDnsServersForInterface(java.lang.String arg1, java.lang.String [] arg2) throws RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("INetworkManagementService")
  public void flushDefaultDnsCache() throws RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("INetworkManagementService")
  public void flushInterfaceDnsCache(java.lang.String arg1) throws RemoteException;
}
