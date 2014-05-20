package android.bluetooth;

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

import com.francetelecom.rd.stubs.annotation.Real;


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public interface IBluetooth
  extends android.os.IInterface
{
  // Classes
	@Real("com.francetelecom.rd.fakeandroid.IBlueToothStubImpl")
  public abstract static class Stub
    extends android.os.Binder    implements IBluetooth
  {
    // Constructors

    public Stub(){
      super();
    }
    // Methods

    public android.os.IBinder asBinder(){
      return (android.os.IBinder) null;
    }
    public static IBluetooth asInterface(android.os.IBinder arg1){
      return (IBluetooth) null;
    }
    public boolean onTransact(int arg1, android.os.Parcel arg2, android.os.Parcel arg3, int arg4) throws android.os.RemoteException{
      return false;
    }
  }
  // Methods

  public java.lang.String getAddress() throws android.os.RemoteException;
  public java.lang.String getName() throws android.os.RemoteException;
  public boolean setName(java.lang.String arg1) throws android.os.RemoteException;
  public boolean disable(boolean arg1) throws android.os.RemoteException;
  public boolean enable() throws android.os.RemoteException;
  public boolean isEnabled() throws android.os.RemoteException;
  public boolean setPin(java.lang.String arg1, byte [] arg2) throws android.os.RemoteException;
  public void setBluetoothTethering(boolean arg1) throws android.os.RemoteException;
  public boolean isTetheringOn() throws android.os.RemoteException;
  public boolean connectPanDevice(BluetoothDevice arg1) throws android.os.RemoteException;
  public boolean disconnectPanDevice(BluetoothDevice arg1) throws android.os.RemoteException;
  public java.util.List<BluetoothDevice> getConnectedPanDevices() throws android.os.RemoteException;
  public java.util.List<BluetoothDevice> getPanDevicesMatchingConnectionStates(int [] arg1) throws android.os.RemoteException;
  public int getPanDeviceConnectionState(BluetoothDevice arg1) throws android.os.RemoteException;
  public boolean disconnectChannel(BluetoothDevice arg1, BluetoothHealthAppConfiguration arg2, int arg3) throws android.os.RemoteException;
  public boolean fetchRemoteUuids(java.lang.String arg1, android.os.ParcelUuid arg2, IBluetoothCallback arg3) throws android.os.RemoteException;
  public int getBluetoothState() throws android.os.RemoteException;
  public boolean connectInputDevice(BluetoothDevice arg1) throws android.os.RemoteException;
  public boolean disconnectInputDevice(BluetoothDevice arg1) throws android.os.RemoteException;
  public int getInputDeviceConnectionState(BluetoothDevice arg1) throws android.os.RemoteException;
  public java.util.List<BluetoothDevice> getConnectedInputDevices() throws android.os.RemoteException;
  public java.util.List<BluetoothDevice> getInputDevicesMatchingConnectionStates(int [] arg1) throws android.os.RemoteException;
  public int getInputDevicePriority(BluetoothDevice arg1) throws android.os.RemoteException;
  public boolean setInputDevicePriority(BluetoothDevice arg1, int arg2) throws android.os.RemoteException;
  public void sendConnectionStateChange(BluetoothDevice arg1, int arg2, int arg3, int arg4) throws android.os.RemoteException;
  public android.os.ParcelUuid [] getUuids() throws android.os.RemoteException;
  public int getScanMode() throws android.os.RemoteException;
  public boolean setScanMode(int arg1, int arg2) throws android.os.RemoteException;
  public int getDiscoverableTimeout() throws android.os.RemoteException;
  public boolean setDiscoverableTimeout(int arg1) throws android.os.RemoteException;
  public boolean startDiscovery() throws android.os.RemoteException;
  public boolean cancelDiscovery() throws android.os.RemoteException;
  public boolean isDiscovering() throws android.os.RemoteException;
  public byte [] readOutOfBandData() throws android.os.RemoteException;
  public int getAdapterConnectionState() throws android.os.RemoteException;
  public int getProfileConnectionState(int arg1) throws android.os.RemoteException;
  public boolean changeApplicationBluetoothState(boolean arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("onBluetoothStateChange") IBluetoothStateChangeCallback arg2, android.os.IBinder arg3) throws android.os.RemoteException;
  public boolean createBond(java.lang.String arg1) throws android.os.RemoteException;
  public boolean createBondOutOfBand(java.lang.String arg1, byte [] arg2, byte [] arg3) throws android.os.RemoteException;
  public boolean cancelBondProcess(java.lang.String arg1) throws android.os.RemoteException;
  public boolean removeBond(java.lang.String arg1) throws android.os.RemoteException;
  public java.lang.String [] listBonds() throws android.os.RemoteException;
  public int getBondState(java.lang.String arg1) throws android.os.RemoteException;
  public boolean setDeviceOutOfBandData(java.lang.String arg1, byte [] arg2, byte [] arg3) throws android.os.RemoteException;
  public java.lang.String getRemoteName(java.lang.String arg1) throws android.os.RemoteException;
  public java.lang.String getRemoteAlias(java.lang.String arg1) throws android.os.RemoteException;
  public boolean setRemoteAlias(java.lang.String arg1, java.lang.String arg2) throws android.os.RemoteException;
  public int getRemoteClass(java.lang.String arg1) throws android.os.RemoteException;
  public android.os.ParcelUuid [] getRemoteUuids(java.lang.String arg1) throws android.os.RemoteException;
  public int getRemoteServiceChannel(java.lang.String arg1, android.os.ParcelUuid arg2) throws android.os.RemoteException;
  public boolean setPasskey(java.lang.String arg1, int arg2) throws android.os.RemoteException;
  public boolean setPairingConfirmation(java.lang.String arg1, boolean arg2) throws android.os.RemoteException;
  public boolean setRemoteOutOfBandData(java.lang.String arg1) throws android.os.RemoteException;
  public boolean cancelPairingUserInput(java.lang.String arg1) throws android.os.RemoteException;
  public boolean setTrust(java.lang.String arg1, boolean arg2) throws android.os.RemoteException;
  public boolean getTrustState(java.lang.String arg1) throws android.os.RemoteException;
  public boolean isBluetoothDock(java.lang.String arg1) throws android.os.RemoteException;
  public int addRfcommServiceRecord(java.lang.String arg1, android.os.ParcelUuid arg2, int arg3, android.os.IBinder arg4) throws android.os.RemoteException;
  public void removeServiceRecord(int arg1) throws android.os.RemoteException;
  public boolean allowIncomingProfileConnect(BluetoothDevice arg1, boolean arg2) throws android.os.RemoteException;
  public boolean connectHeadset(java.lang.String arg1) throws android.os.RemoteException;
  public boolean disconnectHeadset(java.lang.String arg1) throws android.os.RemoteException;
  public boolean notifyIncomingConnection(java.lang.String arg1) throws android.os.RemoteException;
  public boolean registerAppConfiguration(BluetoothHealthAppConfiguration arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("IBluetoothHealthCallback") IBluetoothHealthCallback arg2) throws android.os.RemoteException;
  public boolean unregisterAppConfiguration(BluetoothHealthAppConfiguration arg1) throws android.os.RemoteException;
  public boolean connectChannelToSource(BluetoothDevice arg1, BluetoothHealthAppConfiguration arg2) throws android.os.RemoteException;
  public boolean connectChannelToSink(BluetoothDevice arg1, BluetoothHealthAppConfiguration arg2, int arg3) throws android.os.RemoteException;
  public android.os.ParcelFileDescriptor getMainChannelFd(BluetoothDevice arg1, BluetoothHealthAppConfiguration arg2) throws android.os.RemoteException;
  public java.util.List<BluetoothDevice> getConnectedHealthDevices() throws android.os.RemoteException;
  public java.util.List<BluetoothDevice> getHealthDevicesMatchingConnectionStates(int [] arg1) throws android.os.RemoteException;
  public int getHealthDeviceConnectionState(BluetoothDevice arg1) throws android.os.RemoteException;
}
