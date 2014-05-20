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
public interface IWifiManager
  extends android.os.IInterface
{
  // Classes

  public abstract static class Stub
    extends android.os.Binder    implements IWifiManager
  {
    // Constructors

    public Stub(){
      super();
    }
    // Methods

    public android.os.IBinder asBinder(){
      return (android.os.IBinder) null;
    }
    public static IWifiManager asInterface(android.os.IBinder arg1){
      return (IWifiManager) null;
    }
    @com.francetelecom.rd.stubs.annotation.CallBackRegister("IWifiManager")
    public boolean onTransact(int arg1, android.os.Parcel arg2, android.os.Parcel arg3, int arg4) throws android.os.RemoteException{
      return false;
    }
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("IWifiManager")
  public void reconnect() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IWifiManager")
  public void disconnect() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IWifiManager")
  public boolean setWifiEnabled(boolean arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IWifiManager")
  public void setCountryCode(java.lang.String arg1, boolean arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IWifiManager")
  public java.util.List<WifiConfiguration> getConfiguredNetworks() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IWifiManager")
  public int addOrUpdateNetwork(WifiConfiguration arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IWifiManager")
  public boolean removeNetwork(int arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IWifiManager")
  public boolean enableNetwork(int arg1, boolean arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IWifiManager")
  public boolean disableNetwork(int arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IWifiManager")
  public boolean pingSupplicant() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IWifiManager")
  public void startScan(boolean arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IWifiManager")
  public java.util.List<ScanResult> getScanResults() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IWifiManager")
  public void reassociate() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IWifiManager")
  public WifiInfo getConnectionInfo() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IWifiManager")
  public int getWifiEnabledState() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IWifiManager")
  public void setFrequencyBand(int arg1, boolean arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IWifiManager")
  public int getFrequencyBand() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IWifiManager")
  public boolean isDualBandSupported() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IWifiManager")
  public boolean saveConfiguration() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IWifiManager")
  public android.net.DhcpInfo getDhcpInfo() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IWifiManager")
  public boolean acquireWifiLock(android.os.IBinder arg1, int arg2, java.lang.String arg3, android.os.WorkSource arg4) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IWifiManager")
  public void updateWifiLockWorkSource(android.os.IBinder arg1, android.os.WorkSource arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IWifiManager")
  public boolean releaseWifiLock(android.os.IBinder arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IWifiManager")
  public void initializeMulticastFiltering() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IWifiManager")
  public boolean isMulticastEnabled() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IWifiManager")
  public void acquireMulticastLock(android.os.IBinder arg1, java.lang.String arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IWifiManager")
  public void releaseMulticastLock() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IWifiManager")
  public void setWifiApEnabled(WifiConfiguration arg1, boolean arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IWifiManager")
  public int getWifiApEnabledState() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IWifiManager")
  public WifiConfiguration getWifiApConfiguration() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IWifiManager")
  public void setWifiApConfiguration(WifiConfiguration arg1) throws android.os.RemoteException;
  public void startWifi() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IWifiManager")
  public void stopWifi() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IWifiManager")
  public void addToBlacklist(java.lang.String arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IWifiManager")
  public void clearBlacklist() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IWifiManager")
  public android.os.Messenger getMessenger() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IWifiManager")
  public java.lang.String getConfigFile() throws android.os.RemoteException;
}
