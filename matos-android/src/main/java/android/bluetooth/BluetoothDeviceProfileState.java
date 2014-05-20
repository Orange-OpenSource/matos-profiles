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


public final class BluetoothDeviceProfileState
  extends com.android.internal.util.StateMachine{
  // Fields

  public static final int CONNECT_HFP_OUTGOING = 1;

  public static final int CONNECT_HFP_INCOMING = 2;

  public static final int CONNECT_A2DP_OUTGOING = 3;

  public static final int CONNECT_A2DP_INCOMING = 4;

  public static final int CONNECT_HID_OUTGOING = 5;

  public static final int CONNECT_HID_INCOMING = 6;

  public static final int DISCONNECT_HFP_OUTGOING = 50;

  public static final int DISCONNECT_A2DP_OUTGOING = 52;

  public static final int DISCONNECT_A2DP_INCOMING = 53;

  public static final int DISCONNECT_HID_OUTGOING = 54;

  public static final int DISCONNECT_HID_INCOMING = 55;

  public static final int DISCONNECT_PBAP_OUTGOING = 56;

  public static final int UNPAIR = 100;

  public static final int AUTO_CONNECT_PROFILES = 101;

  public static final int TRANSITION_TO_STABLE = 102;

  public static final int CONNECT_OTHER_PROFILES = 103;

  // Constructors

  public BluetoothDeviceProfileState(android.content.Context arg1, java.lang.String arg2, android.server.BluetoothService arg3, android.server.BluetoothA2dpService arg4, boolean arg5){
    super((java.lang.String) null);
  }
}
