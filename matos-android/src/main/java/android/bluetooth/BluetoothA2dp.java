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
public final class BluetoothA2dp
  implements BluetoothProfile
{
  // Fields

  public static final java.lang.String ACTION_CONNECTION_STATE_CHANGED = "android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED";

  public static final java.lang.String ACTION_PLAYING_STATE_CHANGED = "android.bluetooth.a2dp.profile.action.PLAYING_STATE_CHANGED";

  public static final int STATE_PLAYING = 10;

  public static final int STATE_NOT_PLAYING = 11;

  // Constructors

  BluetoothA2dp(android.content.Context arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("serviceListener") BluetoothProfile.ServiceListener arg2){
  }
  // Methods

  public boolean setPriority(BluetoothDevice arg1, int arg2){
    return false;
  }
  public int getPriority(BluetoothDevice arg1){
    return 0;
  }
  public boolean connect(BluetoothDevice arg1){
    return false;
  }
  public boolean disconnect(BluetoothDevice arg1){
    return false;
  }
  public java.util.List<BluetoothDevice> getConnectedDevices(){
    return (java.util.List) null;
  }
  public java.util.List<BluetoothDevice> getDevicesMatchingConnectionStates(int [] arg1){
    return (java.util.List) null;
  }
  public int getConnectionState(BluetoothDevice arg1){
    return 0;
  }
  public boolean allowIncomingConnect(BluetoothDevice arg1, boolean arg2){
    return false;
  }
  public boolean isA2dpPlaying(BluetoothDevice arg1){
    return false;
  }
  public boolean suspendSink(BluetoothDevice arg1){
    return false;
  }
  public boolean resumeSink(BluetoothDevice arg1){
    return false;
  }
  public static java.lang.String stateToString(int arg1){
    return (java.lang.String) null;
  }
  public boolean shouldSendVolumeKeys(BluetoothDevice arg1){
    return false;
  }
}
