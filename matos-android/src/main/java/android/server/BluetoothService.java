package android.server;

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
public class BluetoothService
  extends android.bluetooth.IBluetooth.Stub{
  // Constructors

  public BluetoothService(android.content.Context arg1){
    super();
  }
  // Methods

  protected void finalize() throws java.lang.Throwable{
  }
  public synchronized java.lang.String getAddress(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("name")
  public synchronized java.lang.String getName(){
    return (java.lang.String) null;
  }
  public synchronized boolean setName(@com.francetelecom.rd.stubs.annotation.FieldSet("name") java.lang.String arg1){
    return false;
  }
  public boolean disable(){
    return false;
  }
  public synchronized boolean disable(boolean arg1){
    return false;
  }
  public boolean enable(){
    return false;
  }
  public synchronized boolean enable(boolean arg1){
    return false;
  }
  protected void dump(java.io.FileDescriptor arg1, java.io.PrintWriter arg2, java.lang.String [] arg3){
  }
  public boolean isEnabled(){
    return false;
  }
  public synchronized boolean setPin(java.lang.String arg1, byte [] arg2){
    return false;
  }
  public void setBluetoothTethering(boolean arg1){
  }
  public boolean isTetheringOn(){
    return false;
  }
  public boolean connectPanDevice(android.bluetooth.BluetoothDevice arg1){
    return false;
  }
  public boolean disconnectPanDevice(android.bluetooth.BluetoothDevice arg1){
    return false;
  }
  public java.util.List<android.bluetooth.BluetoothDevice> getConnectedPanDevices(){
    return (java.util.List) null;
  }
  public java.util.List<android.bluetooth.BluetoothDevice> getPanDevicesMatchingConnectionStates(int [] arg1){
    return (java.util.List) null;
  }
  public int getPanDeviceConnectionState(android.bluetooth.BluetoothDevice arg1){
    return 0;
  }
  public boolean disconnectChannel(android.bluetooth.BluetoothDevice arg1, android.bluetooth.BluetoothHealthAppConfiguration arg2, int arg3){
    return false;
  }
  public synchronized boolean fetchRemoteUuids(java.lang.String arg1, android.os.ParcelUuid arg2, @com.francetelecom.rd.stubs.annotation.CallBackRegister("iBluetoothCallback") android.bluetooth.IBluetoothCallback arg3){
    return false;
  }
  public int getBluetoothState(){
    return 0;
  }
  public boolean connectInputDevice(android.bluetooth.BluetoothDevice arg1){
    return false;
  }
  public boolean disconnectInputDevice(android.bluetooth.BluetoothDevice arg1){
    return false;
  }
  public int getInputDeviceConnectionState(android.bluetooth.BluetoothDevice arg1){
    return 0;
  }
  public java.util.List<android.bluetooth.BluetoothDevice> getConnectedInputDevices(){
    return (java.util.List) null;
  }
  public java.util.List<android.bluetooth.BluetoothDevice> getInputDevicesMatchingConnectionStates(int [] arg1){
    return (java.util.List) null;
  }
  public int getInputDevicePriority(android.bluetooth.BluetoothDevice arg1){
    return 0;
  }
  public boolean setInputDevicePriority(android.bluetooth.BluetoothDevice arg1, int arg2){
    return false;
  }
  public synchronized void sendConnectionStateChange(android.bluetooth.BluetoothDevice arg1, int arg2, int arg3, int arg4){
  }
  public synchronized android.os.ParcelUuid [] getUuids(){
    return (android.os.ParcelUuid []) null;
  }
  public synchronized int getScanMode(){
    return 0;
  }
  public synchronized boolean setScanMode(int arg1, int arg2){
    return false;
  }
  public synchronized int getDiscoverableTimeout(){
    return 0;
  }
  public synchronized boolean setDiscoverableTimeout(int arg1){
    return false;
  }
  public synchronized boolean startDiscovery(){
    return false;
  }
  public synchronized boolean cancelDiscovery(){
    return false;
  }
  public synchronized boolean isDiscovering(){
    return false;
  }
  public synchronized byte [] readOutOfBandData(){
    return (byte []) null;
  }
  public int getAdapterConnectionState(){
    return 0;
  }
  public int getProfileConnectionState(int arg1){
    return 0;
  }
  public boolean changeApplicationBluetoothState(boolean arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("onBluetoothStateChange") android.bluetooth.IBluetoothStateChangeCallback arg2, android.os.IBinder arg3){
    return false;
  }
  public synchronized boolean createBond(java.lang.String arg1){
    return false;
  }
  public synchronized boolean createBondOutOfBand(java.lang.String arg1, byte [] arg2, byte [] arg3){
    return false;
  }
  public synchronized boolean cancelBondProcess(java.lang.String arg1){
    return false;
  }
  public synchronized boolean removeBond(java.lang.String arg1){
    return false;
  }
  public synchronized java.lang.String [] listBonds(){
    return (java.lang.String []) null;
  }
  public synchronized int getBondState(java.lang.String arg1){
    return 0;
  }
  public synchronized boolean setDeviceOutOfBandData(java.lang.String arg1, byte [] arg2, byte [] arg3){
    return false;
  }
  public synchronized java.lang.String getRemoteName(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public synchronized java.lang.String getRemoteAlias(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public synchronized boolean setRemoteAlias(java.lang.String arg1, java.lang.String arg2){
    return false;
  }
  public synchronized int getRemoteClass(java.lang.String arg1){
    return 0;
  }
  public synchronized android.os.ParcelUuid [] getRemoteUuids(java.lang.String arg1){
    return (android.os.ParcelUuid []) null;
  }
  public int getRemoteServiceChannel(java.lang.String arg1, android.os.ParcelUuid arg2){
    return 0;
  }
  public synchronized boolean setPasskey(java.lang.String arg1, int arg2){
    return false;
  }
  public synchronized boolean setPairingConfirmation(java.lang.String arg1, boolean arg2){
    return false;
  }
  public synchronized boolean setRemoteOutOfBandData(java.lang.String arg1){
    return false;
  }
  public synchronized boolean cancelPairingUserInput(java.lang.String arg1){
    return false;
  }
  public synchronized boolean setTrust(java.lang.String arg1, boolean arg2){
    return false;
  }
  public synchronized boolean getTrustState(java.lang.String arg1){
    return false;
  }
  public synchronized boolean isBluetoothDock(java.lang.String arg1){
    return false;
  }
  public synchronized int addRfcommServiceRecord(java.lang.String arg1, android.os.ParcelUuid arg2, int arg3, android.os.IBinder arg4){
    return 0;
  }
  public void removeServiceRecord(int arg1){
  }
  public boolean allowIncomingProfileConnect(android.bluetooth.BluetoothDevice arg1, boolean arg2){
    return false;
  }
  public boolean connectHeadset(java.lang.String arg1){
    return false;
  }
  public boolean disconnectHeadset(java.lang.String arg1){
    return false;
  }
  public boolean notifyIncomingConnection(java.lang.String arg1){
    return false;
  }
  public boolean registerAppConfiguration(android.bluetooth.BluetoothHealthAppConfiguration arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("IBluetoothHealthCallback") android.bluetooth.IBluetoothHealthCallback arg2){
    return false;
  }
  public boolean unregisterAppConfiguration(android.bluetooth.BluetoothHealthAppConfiguration arg1){
    return false;
  }
  public boolean connectChannelToSource(android.bluetooth.BluetoothDevice arg1, android.bluetooth.BluetoothHealthAppConfiguration arg2){
    return false;
  }
  public boolean connectChannelToSink(android.bluetooth.BluetoothDevice arg1, android.bluetooth.BluetoothHealthAppConfiguration arg2, int arg3){
    return false;
  }
  public android.os.ParcelFileDescriptor getMainChannelFd(android.bluetooth.BluetoothDevice arg1, android.bluetooth.BluetoothHealthAppConfiguration arg2){
    return (android.os.ParcelFileDescriptor) null;
  }
  public java.util.List<android.bluetooth.BluetoothDevice> getConnectedHealthDevices(){
    return (java.util.List) null;
  }
  public java.util.List<android.bluetooth.BluetoothDevice> getHealthDevicesMatchingConnectionStates(int [] arg1){
    return (java.util.List) null;
  }
  public int getHealthDeviceConnectionState(android.bluetooth.BluetoothDevice arg1){
    return 0;
  }
  public boolean connectInputDeviceInternal(android.bluetooth.BluetoothDevice arg1){
    return false;
  }
  public boolean disconnectInputDeviceInternal(android.bluetooth.BluetoothDevice arg1){
    return false;
  }
  public void sendProfileStateMessage(int arg1, int arg2){
  }
  public android.util.Pair<java.lang.Integer, java.lang.String> getIncomingState(java.lang.String arg1){
    return (android.util.Pair) null;
  }
  public void writeIncomingConnectionState(java.lang.String arg1, android.util.Pair<java.lang.Integer, java.lang.String> arg2){
  }
  public synchronized boolean removeBondInternal(java.lang.String arg1){
    return false;
  }
  public boolean connectSink(java.lang.String arg1){
    return false;
  }
  public boolean disconnectSink(java.lang.String arg1){
    return false;
  }
  public synchronized void initAfterRegistration(){
  }
  public synchronized void initAfterA2dpRegistration(){
  }
  public static synchronized java.lang.String readDockBluetoothAddress(){
    return (java.lang.String) null;
  }
}
