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

@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public interface BluetoothProfile
{
  // Classes

  public static interface ServiceListener
  {
    // Methods
	 @com.francetelecom.rd.stubs.annotation.CallBack("serviceListener")
    public void onServiceConnected(int arg1, BluetoothProfile arg2);
	 @com.francetelecom.rd.stubs.annotation.CallBack("serviceListener")
    public void onServiceDisconnected(int arg1);
  }
  // Fields

  public static final java.lang.String EXTRA_STATE = "android.bluetooth.profile.extra.STATE";

  public static final java.lang.String EXTRA_PREVIOUS_STATE = "android.bluetooth.profile.extra.PREVIOUS_STATE";

  public static final int STATE_DISCONNECTED = 0;

  public static final int STATE_CONNECTING = 1;

  public static final int STATE_CONNECTED = 2;

  public static final int STATE_DISCONNECTING = 3;

  public static final int HEADSET = 1;

  public static final int A2DP = 2;

  public static final int HEALTH = 3;

  public static final int INPUT_DEVICE = 4;

  public static final int PAN = 5;

  public static final int PBAP = 6;

  public static final int PRIORITY_AUTO_CONNECT = 1000;

  public static final int PRIORITY_ON = 100;

  public static final int PRIORITY_OFF = 0;

  public static final int PRIORITY_UNDEFINED = -1;

  // Methods

  public java.util.List<BluetoothDevice> getConnectedDevices();
  public java.util.List<BluetoothDevice> getDevicesMatchingConnectionStates(int [] arg1);
  public int getConnectionState(BluetoothDevice arg1);
}
