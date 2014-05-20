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
public interface IConnectivityManager
  extends android.os.IInterface
{
  // Classes

  public abstract static class Stub
    extends android.os.Binder    implements IConnectivityManager
  {
    // Constructors

    public Stub(){
      super();
    }
    // Methods

    public android.os.IBinder asBinder(){
      return (android.os.IBinder) null;
    }
    public static IConnectivityManager asInterface(android.os.IBinder arg1){
      return (IConnectivityManager) null;
    }
    @com.francetelecom.rd.stubs.annotation.CallBackRegister("IConnectivityManager")
    public boolean onTransact(int arg1, android.os.Parcel arg2, android.os.Parcel arg3, int arg4) throws android.os.RemoteException{
      return false;
    }
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("IConnectivityManager")
  public void setGlobalProxy(ProxyProperties arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IConnectivityManager")
  public LinkProperties getLinkProperties(int arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IConnectivityManager")
  public boolean setRadio(int arg1, boolean arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IConnectivityManager")
  public NetworkInfo getNetworkInfo(int arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IConnectivityManager")
  public void setPolicyDataEnable(int arg1, boolean arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IConnectivityManager")
  public int startUsingNetworkFeature(int arg1, java.lang.String arg2, android.os.IBinder arg3) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IConnectivityManager")
  public int stopUsingNetworkFeature(int arg1, java.lang.String arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IConnectivityManager")
  public void setNetworkPreference(int arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IConnectivityManager")
  public ProxyProperties getProxy() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IConnectivityManager")
  public boolean isNetworkSupported(int arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IConnectivityManager")
  public int getNetworkPreference() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IConnectivityManager")
  public NetworkInfo getActiveNetworkInfo() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IConnectivityManager")
  public NetworkInfo getActiveNetworkInfoForUid(int arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IConnectivityManager")
  public NetworkInfo [] getAllNetworkInfo() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IConnectivityManager")
  public LinkProperties getActiveLinkProperties() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IConnectivityManager")
  public NetworkState [] getAllNetworkState() throws android.os.RemoteException;
  public NetworkQuotaInfo getActiveNetworkQuotaInfo() throws android.os.RemoteException;
  public boolean setRadios(boolean arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IConnectivityManager")
  public boolean requestRouteToHost(int arg1, int arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IConnectivityManager")
  public boolean requestRouteToHostAddress(int arg1, byte [] arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IConnectivityManager")
  public boolean getMobileDataEnabled() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IConnectivityManager")
  public void setMobileDataEnabled(boolean arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IConnectivityManager")
  public int tether(java.lang.String arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IConnectivityManager")
  public int untether(java.lang.String arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IConnectivityManager")
  public int getLastTetherError(java.lang.String arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IConnectivityManager")
  public boolean isTetheringSupported() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IConnectivityManager")
  public java.lang.String [] getTetherableIfaces() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IConnectivityManager")
  public java.lang.String [] getTetheredIfaces() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IConnectivityManager")
  public java.lang.String [] getTetheredIfacePairs() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IConnectivityManager")
  public java.lang.String [] getTetheringErroredIfaces() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IConnectivityManager")
  public java.lang.String [] getTetherableUsbRegexs() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IConnectivityManager")
  public java.lang.String [] getTetherableWifiRegexs() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IConnectivityManager")
  public java.lang.String [] getTetherableBluetoothRegexs() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IConnectivityManager")
  public int setUsbTethering(boolean arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IConnectivityManager")
  public void requestNetworkTransitionWakelock(java.lang.String arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IConnectivityManager")
  public void reportInetCondition(int arg1, int arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IConnectivityManager")
  public ProxyProperties getGlobalProxy() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IConnectivityManager")
  public void setDataDependency(int arg1, boolean arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IConnectivityManager")
  public boolean protectVpn(android.os.ParcelFileDescriptor arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IConnectivityManager")
  public boolean prepareVpn(java.lang.String arg1, java.lang.String arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IConnectivityManager")
  public android.os.ParcelFileDescriptor establishVpn(com.android.internal.net.VpnConfig arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IConnectivityManager")
  public void startLegacyVpn(com.android.internal.net.VpnConfig arg1, java.lang.String [] arg2, java.lang.String [] arg3) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IConnectivityManager")
  public com.android.internal.net.LegacyVpnInfo getLegacyVpnInfo() throws android.os.RemoteException;
}
