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
public final class BluetoothPan
  implements BluetoothProfile
{
  // Fields

  public static final java.lang.String ACTION_CONNECTION_STATE_CHANGED = "android.bluetooth.pan.profile.action.CONNECTION_STATE_CHANGED";

  public static final java.lang.String EXTRA_LOCAL_ROLE = "android.bluetooth.pan.extra.LOCAL_ROLE";

  public static final int LOCAL_NAP_ROLE = 1;

  public static final int LOCAL_PANU_ROLE = 2;

  public static final int PAN_DISCONNECT_FAILED_NOT_CONNECTED = 1000;

  public static final int PAN_CONNECT_FAILED_ALREADY_CONNECTED = 1001;

  public static final int PAN_CONNECT_FAILED_ATTEMPT_FAILED = 1002;

  public static final int PAN_OPERATION_GENERIC_FAILURE = 1003;

  public static final int PAN_OPERATION_SUCCESS = 1004;

  // Constructors

  BluetoothPan(android.content.Context arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("serviceListener") BluetoothProfile.ServiceListener arg2){
  }
  // Methods

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
  public void setBluetoothTethering(boolean arg1){
  }
  public boolean isTetheringOn(){
    return false;
  }
}
