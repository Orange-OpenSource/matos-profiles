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

public final class BluetoothHeadset
  implements BluetoothProfile
{
  // Classes

  public static interface ServiceListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("serviceListener")
    public void onServiceConnected();
    @com.francetelecom.rd.stubs.annotation.CallBack("serviceListener")
    public void onServiceDisconnected();
  }
  // Fields

  public static final java.lang.String ACTION_CONNECTION_STATE_CHANGED = "android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED";

  public static final java.lang.String ACTION_AUDIO_STATE_CHANGED = "android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED";

  public static final java.lang.String ACTION_VENDOR_SPECIFIC_HEADSET_EVENT = "android.bluetooth.headset.action.VENDOR_SPECIFIC_HEADSET_EVENT";

  public static final java.lang.String EXTRA_VENDOR_SPECIFIC_HEADSET_EVENT_CMD = "android.bluetooth.headset.extra.VENDOR_SPECIFIC_HEADSET_EVENT_CMD";

  public static final java.lang.String EXTRA_VENDOR_SPECIFIC_HEADSET_EVENT_CMD_TYPE = "android.bluetooth.headset.extra.VENDOR_SPECIFIC_HEADSET_EVENT_CMD_TYPE";

  public static final int AT_CMD_TYPE_READ = 0;

  public static final int AT_CMD_TYPE_TEST = 1;

  public static final int AT_CMD_TYPE_SET = 2;

  public static final int AT_CMD_TYPE_BASIC = 3;

  public static final int AT_CMD_TYPE_ACTION = 4;

  public static final java.lang.String EXTRA_VENDOR_SPECIFIC_HEADSET_EVENT_ARGS = "android.bluetooth.headset.extra.VENDOR_SPECIFIC_HEADSET_EVENT_ARGS";

  public static final java.lang.String VENDOR_SPECIFIC_HEADSET_EVENT_COMPANY_ID_CATEGORY = "android.bluetooth.headset.intent.category.companyid";

  public static final int STATE_AUDIO_DISCONNECTED = 10;

  public static final int STATE_AUDIO_CONNECTING = 11;

  public static final int STATE_AUDIO_CONNECTED = 12;

  // Constructors

  BluetoothHeadset(android.content.Context arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("serviceListener") BluetoothProfile.ServiceListener arg2){
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
    return (java.util.List<BluetoothDevice>) null;
  }
  public java.util.List<BluetoothDevice> getDevicesMatchingConnectionStates(int [] arg1){
    return (java.util.List<BluetoothDevice>) null;
  }
  public int getConnectionState(BluetoothDevice arg1){
    return 0;
  }
  public boolean startVoiceRecognition(BluetoothDevice arg1){
    return false;
  }
  public boolean stopVoiceRecognition(BluetoothDevice arg1){
    return false;
  }
  public boolean isAudioConnected(BluetoothDevice arg1){
    return false;
  }
  public int getBatteryUsageHint(BluetoothDevice arg1){
    return 0;
  }
  public boolean createIncomingConnect(BluetoothDevice arg1){
    return false;
  }
  public boolean acceptIncomingConnect(BluetoothDevice arg1){
    return false;
  }
  public boolean rejectIncomingConnect(BluetoothDevice arg1){
    return false;
  }
  public boolean cancelConnectThread(){
    return false;
  }
  public boolean connectHeadsetInternal(BluetoothDevice arg1){
    return false;
  }
  public boolean disconnectHeadsetInternal(BluetoothDevice arg1){
    return false;
  }
  public boolean setAudioState(BluetoothDevice arg1, int arg2){
    return false;
  }
  public int getAudioState(BluetoothDevice arg1){
    return 0;
  }
  public boolean startScoUsingVirtualVoiceCall(BluetoothDevice arg1){
    return false;
  }
  public boolean stopScoUsingVirtualVoiceCall(BluetoothDevice arg1){
    return false;
  }
  public static boolean isBluetoothVoiceDialingEnabled(android.content.Context arg1){
    return false;
  }
}
