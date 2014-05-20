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

import com.francetelecom.rd.stubs.annotation.ArgsRule;


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public final class BluetoothAdapter
{
  // Classes

  public static interface BluetoothStateChangeCallback
  {
    // Methods

	@com.francetelecom.rd.stubs.annotation.CallBack("onBluetoothStateChange")
    public void onBluetoothStateChange(boolean arg1);
  }
  public class StateChangeCallbackWrapper
    extends IBluetoothStateChangeCallback.Stub  {
    // Fields

    // Constructors

    StateChangeCallbackWrapper(BluetoothAdapter.BluetoothStateChangeCallback arg1){
      super();
    }
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onBluetoothStateChange")
    public void onBluetoothStateChange(boolean arg1){
    }
  }
  // Fields

  public static final int ERROR = -2147483648;

  public static final java.lang.String ACTION_STATE_CHANGED = "android.bluetooth.adapter.action.STATE_CHANGED";

  public static final java.lang.String EXTRA_STATE = "android.bluetooth.adapter.extra.STATE";

  public static final java.lang.String EXTRA_PREVIOUS_STATE = "android.bluetooth.adapter.extra.PREVIOUS_STATE";

  public static final int STATE_OFF = 10;

  public static final int STATE_TURNING_ON = 11;

  public static final int STATE_ON = 12;

  public static final int STATE_TURNING_OFF = 13;

  public static final java.lang.String ACTION_REQUEST_DISCOVERABLE = "android.bluetooth.adapter.action.REQUEST_DISCOVERABLE";

  public static final java.lang.String EXTRA_DISCOVERABLE_DURATION = "android.bluetooth.adapter.extra.DISCOVERABLE_DURATION";

  public static final java.lang.String ACTION_REQUEST_ENABLE = "android.bluetooth.adapter.action.REQUEST_ENABLE";

  public static final java.lang.String ACTION_SCAN_MODE_CHANGED = "android.bluetooth.adapter.action.SCAN_MODE_CHANGED";

  public static final java.lang.String EXTRA_SCAN_MODE = "android.bluetooth.adapter.extra.SCAN_MODE";

  public static final java.lang.String EXTRA_PREVIOUS_SCAN_MODE = "android.bluetooth.adapter.extra.PREVIOUS_SCAN_MODE";

  public static final int SCAN_MODE_NONE = 20;

  public static final int SCAN_MODE_CONNECTABLE = 21;

  public static final int SCAN_MODE_CONNECTABLE_DISCOVERABLE = 23;

  public static final java.lang.String ACTION_DISCOVERY_STARTED = "android.bluetooth.adapter.action.DISCOVERY_STARTED";

  public static final java.lang.String ACTION_DISCOVERY_FINISHED = "android.bluetooth.adapter.action.DISCOVERY_FINISHED";

  public static final java.lang.String ACTION_LOCAL_NAME_CHANGED = "android.bluetooth.adapter.action.LOCAL_NAME_CHANGED";

  public static final java.lang.String EXTRA_LOCAL_NAME = "android.bluetooth.adapter.extra.LOCAL_NAME";

  public static final java.lang.String ACTION_CONNECTION_STATE_CHANGED = "android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED";

  public static final java.lang.String EXTRA_CONNECTION_STATE = "android.bluetooth.adapter.extra.CONNECTION_STATE";

  public static final java.lang.String EXTRA_PREVIOUS_CONNECTION_STATE = "android.bluetooth.adapter.extra.PREVIOUS_CONNECTION_STATE";

  public static final int STATE_DISCONNECTED = 0;

  public static final int STATE_CONNECTING = 1;

  public static final int STATE_CONNECTED = 2;

  public static final int STATE_DISCONNECTING = 3;

  public static final java.lang.String BLUETOOTH_SERVICE = "bluetooth";

  // Constructors

  public BluetoothAdapter(IBluetooth arg1){
  }
  // Methods

  public java.lang.String getAddress(){
    return (java.lang.String) null;
  }
  public java.lang.String getName(){
    return (java.lang.String) null;
  }
  public int getState(){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "BluetoothAdapter.setName", report = "-")
  public boolean setName(java.lang.String arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "BluetoothAdapter.disable", report = "-")
  public boolean disable(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "BluetoothAdapter.enable", report = "-")
  public boolean enable(){
    return false;
  }
  public boolean isEnabled(){
    return false;
  }
  public int getConnectionState(){
    return 0;
  }
  public static synchronized BluetoothAdapter getDefaultAdapter(){
    return (BluetoothAdapter) null;
  }
  public android.os.ParcelUuid [] getUuids(){
    return (android.os.ParcelUuid []) null;
  }
  public int getScanMode(){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "BluetoothAdapter.setScanMode-1", report = "-")
  public boolean setScanMode(int arg1, int arg2){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "BluetoothAdapter.setScanMode-2", report = "-")
  public boolean setScanMode(int arg1){
    return false;
  }
  public int getDiscoverableTimeout(){
    return 0;
  }
  public void setDiscoverableTimeout(int arg1){
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "BluetoothAdapter.startDiscovery", report = "-")
  public boolean startDiscovery(){
    return false;
  }
  public boolean cancelDiscovery(){
    return false;
  }
  public boolean isDiscovering(){
    return false;
  }
  public android.util.Pair<byte [], byte []> readOutOfBandData(){
    return (android.util.Pair) null;
  }
  public int getProfileConnectionState(int arg1){
    return 0;
  }
  public boolean changeApplicationBluetoothState(boolean arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("onBluetoothStateChange") BluetoothAdapter.BluetoothStateChangeCallback arg2){
    return false;
  }
  public static boolean checkBluetoothAddress(java.lang.String arg1){
    return false;
  }
  @ArgsRule(value="BluetoothAdapter.getProfileProxy", pos=3)
  public boolean getProfileProxy(android.content.Context arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("serviceListener") BluetoothProfile.ServiceListener arg2, int arg3){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "BluetoothAdapter.getRemoteDevice", pos = 1, report = "-")
  public BluetoothDevice getRemoteDevice(java.lang.String arg1){
    return (BluetoothDevice) null;
  }
  public void closeProfileProxy(int arg1, BluetoothProfile arg2){
  }
  public java.util.Set<BluetoothDevice> getBondedDevices(){
    return (java.util.Set) null;
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "BluetoothAdapter.listenUsingRfcommOn", report = "-")
  public BluetoothServerSocket listenUsingRfcommOn(int arg1) throws java.io.IOException{
    return (BluetoothServerSocket) null;
  }
  @ArgsRule(value = "BluetoothAdapter.listenUsingRfcommWithServiceRecord", pos = {1,2})
  public BluetoothServerSocket listenUsingRfcommWithServiceRecord(java.lang.String arg1, java.util.UUID arg2) throws java.io.IOException{
    return (BluetoothServerSocket) null;
  }
  
  @ArgsRule(value = "BluetoothAdapter.listenUsingInsecureRfcommWithServiceRecord", pos = {1,2})
  public BluetoothServerSocket listenUsingInsecureRfcommWithServiceRecord(java.lang.String arg1, java.util.UUID arg2) throws java.io.IOException{
    return (BluetoothServerSocket) null;
  }
  @ArgsRule(value = "BluetoothAdapter.listenUsingEncryptedRfcommWithServiceRecord", pos = {1,2})
  public BluetoothServerSocket listenUsingEncryptedRfcommWithServiceRecord(java.lang.String arg1, java.util.UUID arg2) throws java.io.IOException{
    return (BluetoothServerSocket) null;
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "BluetoothAdapter.listenUsingInsecureRfcommOn", report = "-")
  public BluetoothServerSocket listenUsingInsecureRfcommOn(int arg1) throws java.io.IOException{
    return (BluetoothServerSocket) null;
  }
  
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "BluetoothAdapter.listenUsingEncryptedRfcommOn", report = "-")
  public BluetoothServerSocket listenUsingEncryptedRfcommOn(int arg1) throws java.io.IOException{
    return (BluetoothServerSocket) null;
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "BluetoothAdapter.listenUsingScoOn", report = "-")
  public static BluetoothServerSocket listenUsingScoOn() throws java.io.IOException{
    return (BluetoothServerSocket) null;
  }
}
