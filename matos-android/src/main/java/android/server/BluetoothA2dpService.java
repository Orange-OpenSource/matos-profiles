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
public class BluetoothA2dpService
  extends android.bluetooth.IBluetoothA2dp.Stub{
  // Fields

  public static final java.lang.String BLUETOOTH_A2DP_SERVICE = "bluetooth_a2dp";

  // Constructors

  public BluetoothA2dpService(android.content.Context arg1, BluetoothService arg2){
    super();
  }
  // Methods

  protected void finalize() throws java.lang.Throwable{
  }
  public synchronized boolean setPriority(android.bluetooth.BluetoothDevice arg1, int arg2){
    return false;
  }
  public synchronized int getPriority(android.bluetooth.BluetoothDevice arg1){
    return 0;
  }
  public synchronized boolean connect(android.bluetooth.BluetoothDevice arg1){
    return false;
  }
  protected synchronized void dump(java.io.FileDescriptor arg1, java.io.PrintWriter arg2, java.lang.String [] arg3){
  }
  public synchronized boolean disconnect(android.bluetooth.BluetoothDevice arg1){
    return false;
  }
  public synchronized java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices(){
    return (java.util.List) null;
  }
  public synchronized java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int [] arg1){
    return (java.util.List) null;
  }
  public synchronized int getConnectionState(android.bluetooth.BluetoothDevice arg1){
    return 0;
  }
  public synchronized boolean allowIncomingConnect(android.bluetooth.BluetoothDevice arg1, boolean arg2){
    return false;
  }
  public synchronized boolean connectSinkInternal(android.bluetooth.BluetoothDevice arg1){
    return false;
  }
  public synchronized boolean disconnectSinkInternal(android.bluetooth.BluetoothDevice arg1){
    return false;
  }
  public synchronized boolean isA2dpPlaying(android.bluetooth.BluetoothDevice arg1){
    return false;
  }
  public synchronized boolean suspendSink(android.bluetooth.BluetoothDevice arg1){
    return false;
  }
  public synchronized boolean resumeSink(android.bluetooth.BluetoothDevice arg1){
    return false;
  }
}
