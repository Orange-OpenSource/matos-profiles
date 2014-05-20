package android.media;

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
public class AudioSystem
{
  // Classes

  public static interface ErrorCallback
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onError")
    public void onError(int arg1);
  }
  // Fields

  public static final int STREAM_VOICE_CALL = 0;

  public static final int STREAM_SYSTEM = 1;

  public static final int STREAM_RING = 2;

  public static final int STREAM_MUSIC = 3;

  public static final int STREAM_ALARM = 4;

  public static final int STREAM_NOTIFICATION = 5;

  public static final int STREAM_BLUETOOTH_SCO = 6;

  public static final int STREAM_SYSTEM_ENFORCED = 7;

  public static final int STREAM_DTMF = 8;

  public static final int STREAM_TTS = 9;

  public static final int NUM_STREAMS = 5;

  public static final int MODE_INVALID = -2;

  public static final int MODE_CURRENT = -1;

  public static final int MODE_NORMAL = 0;

  public static final int MODE_RINGTONE = 1;

  public static final int MODE_IN_CALL = 2;

  public static final int MODE_IN_COMMUNICATION = 3;

  public static final int NUM_MODES = 4;

  public static final int ROUTE_EARPIECE = 1;

  public static final int ROUTE_SPEAKER = 2;

  public static final int ROUTE_BLUETOOTH = 4;

  public static final int ROUTE_BLUETOOTH_SCO = 4;

  public static final int ROUTE_HEADSET = 8;

  public static final int ROUTE_BLUETOOTH_A2DP = 16;

  public static final int ROUTE_ALL = -1;

  public static final int AUDIO_STATUS_OK = 0;

  public static final int AUDIO_STATUS_ERROR = 1;

  public static final int AUDIO_STATUS_SERVER_DIED = 100;

  public static final int DEVICE_OUT_EARPIECE = 1;

  public static final int DEVICE_OUT_SPEAKER = 2;

  public static final int DEVICE_OUT_WIRED_HEADSET = 4;

  public static final int DEVICE_OUT_WIRED_HEADPHONE = 8;

  public static final int DEVICE_OUT_BLUETOOTH_SCO = 16;

  public static final int DEVICE_OUT_BLUETOOTH_SCO_HEADSET = 32;

  public static final int DEVICE_OUT_BLUETOOTH_SCO_CARKIT = 64;

  public static final int DEVICE_OUT_BLUETOOTH_A2DP = 128;

  public static final int DEVICE_OUT_BLUETOOTH_A2DP_HEADPHONES = 256;

  public static final int DEVICE_OUT_BLUETOOTH_A2DP_SPEAKER = 512;

  public static final int DEVICE_OUT_AUX_DIGITAL = 1024;

  public static final int DEVICE_OUT_ANLG_DOCK_HEADSET = 2048;

  public static final int DEVICE_OUT_DGTL_DOCK_HEADSET = 4096;

  public static final int DEVICE_OUT_DEFAULT = 32768;

  public static final int DEVICE_IN_COMMUNICATION = 65536;

  public static final int DEVICE_IN_AMBIENT = 131072;

  public static final int DEVICE_IN_BUILTIN_MIC1 = 262144;

  public static final int DEVICE_IN_BUILTIN_MIC2 = 524288;

  public static final int DEVICE_IN_MIC_ARRAY = 1048576;

  public static final int DEVICE_IN_BLUETOOTH_SCO_HEADSET = 2097152;

  public static final int DEVICE_IN_WIRED_HEADSET = 4194304;

  public static final int DEVICE_IN_AUX_DIGITAL = 8388608;

  public static final int DEVICE_IN_DEFAULT = -2147483648;

  public static final int DEVICE_STATE_UNAVAILABLE = 0;

  public static final int DEVICE_STATE_AVAILABLE = 1;

  public static final int PHONE_STATE_OFFCALL = 0;

  public static final int PHONE_STATE_RINGING = 1;

  public static final int PHONE_STATE_INCALL = 2;

  public static final int FORCE_NONE = 0;

  public static final int FORCE_SPEAKER = 1;

  public static final int FORCE_HEADPHONES = 2;

  public static final int FORCE_BT_SCO = 3;

  public static final int FORCE_BT_A2DP = 4;

  public static final int FORCE_WIRED_ACCESSORY = 5;

  public static final int FORCE_BT_CAR_DOCK = 6;

  public static final int FORCE_BT_DESK_DOCK = 7;

  public static final int FORCE_ANALOG_DOCK = 8;

  public static final int FORCE_DIGITAL_DOCK = 9;

  public static final int FORCE_DEFAULT = 0;

  public static final int FOR_COMMUNICATION = 0;

  public static final int FOR_MEDIA = 1;

  public static final int FOR_RECORD = 2;

  public static final int FOR_DOCK = 3;

  // Constructors

  public AudioSystem(){
  }
  // Methods

  public static java.lang.String getParameters(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public static int setParameters(java.lang.String arg1){
    return 0;
  }
  public static final int getNumStreamTypes(){
    return 0;
  }
  public static int getDevicesForStream(int arg1){
    return 0;
  }
  public static int setRingerMode(int arg1, int arg2){
    return 0;
  }
  public static int muteMicrophone(boolean arg1){
    return 0;
  }
  public static boolean isMicrophoneMuted(){
    return false;
  }
  public static boolean isStreamActive(int arg1, int arg2){
    return false;
  }
  public static void setErrorCallback(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onError") AudioSystem.ErrorCallback arg1){
  }
  public static int setDeviceConnectionState(int arg1, int arg2, java.lang.String arg3){
    return 0;
  }
  public static int getDeviceConnectionState(int arg1, java.lang.String arg2){
    return 0;
  }
  public static int setPhoneState(int arg1){
    return 0;
  }
  public static int setForceUse(int arg1, int arg2){
    return 0;
  }
  public static int getForceUse(int arg1){
    return 0;
  }
  public static int initStreamVolume(int arg1, int arg2, int arg3){
    return 0;
  }
  public static int setStreamVolumeIndex(int arg1, int arg2){
    return 0;
  }
  public static int getStreamVolumeIndex(int arg1){
    return 0;
  }
}
