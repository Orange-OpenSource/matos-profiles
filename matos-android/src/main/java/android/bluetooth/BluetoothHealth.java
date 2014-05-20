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
import com.francetelecom.rd.stubs.annotation.UseRule;


public final class BluetoothHealth
  implements BluetoothProfile
{
  // Fields

  public static final int SOURCE_ROLE = 1;

  public static final int SINK_ROLE = 2;

  public static final int CHANNEL_TYPE_RELIABLE = 10;

  public static final int CHANNEL_TYPE_STREAMING = 11;

  public static final int CHANNEL_TYPE_ANY = 12;

  public static final int HEALTH_OPERATION_SUCCESS = 6000;

  public static final int HEALTH_OPERATION_ERROR = 6001;

  public static final int HEALTH_OPERATION_INVALID_ARGS = 6002;

  public static final int HEALTH_OPERATION_GENERIC_FAILURE = 6003;

  public static final int HEALTH_OPERATION_NOT_FOUND = 6004;

  public static final int HEALTH_OPERATION_NOT_ALLOWED = 6005;

  public static final int STATE_CHANNEL_DISCONNECTED = 0;

  public static final int STATE_CHANNEL_CONNECTING = 1;

  public static final int STATE_CHANNEL_CONNECTED = 2;

  public static final int STATE_CHANNEL_DISCONNECTING = 3;

  public static final int APP_CONFIG_REGISTRATION_SUCCESS = 0;

  public static final int APP_CONFIG_REGISTRATION_FAILURE = 1;

  public static final int APP_CONFIG_UNREGISTRATION_SUCCESS = 2;

  public static final int APP_CONFIG_UNREGISTRATION_FAILURE = 3;

  // Constructors

  BluetoothHealth(android.content.Context arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("serviceListener") BluetoothProfile.ServiceListener arg2){
  }
  // Methods

  public java.util.List<BluetoothDevice> getConnectedDevices(){
    return (java.util.List) null;
  }
  public java.util.List<BluetoothDevice> getDevicesMatchingConnectionStates(int [] arg1){
    return (java.util.List) null;
  }
  public int getConnectionState(BluetoothDevice arg1){
    return 0;
  }
  public boolean disconnectChannel(BluetoothDevice arg1, BluetoothHealthAppConfiguration arg2, int arg3){
    return false;
  }
  @UseRule("Bluetooth.registerAppConfiguration")
  public boolean registerAppConfiguration(java.lang.String arg1, int arg2, int arg3, int arg4, @com.francetelecom.rd.stubs.annotation.CallBackRegister("BluetoothHealthCallback") BluetoothHealthCallback arg5){
    return false;
  }
  public boolean unregisterAppConfiguration(BluetoothHealthAppConfiguration arg1){
    return false;
  }
  public boolean connectChannelToSource(BluetoothDevice arg1, BluetoothHealthAppConfiguration arg2){
    return false;
  }
  public boolean connectChannelToSink(BluetoothDevice arg1, BluetoothHealthAppConfiguration arg2, int arg3){
    return false;
  }
  public android.os.ParcelFileDescriptor getMainChannelFd(BluetoothDevice arg1, BluetoothHealthAppConfiguration arg2){
    return (android.os.ParcelFileDescriptor) null;
  }
  public boolean registerSinkAppConfiguration(java.lang.String arg1, int arg2, @com.francetelecom.rd.stubs.annotation.CallBackRegister("BluetoothHealthCallback") BluetoothHealthCallback arg3){
    return false;
  }
}
