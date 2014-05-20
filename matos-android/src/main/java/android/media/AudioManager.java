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
public class AudioManager
{
  // Classes

  public static interface OnAudioFocusChangeListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onAudioFocusChange")
    public void onAudioFocusChange(int arg1);
  }
  // Fields

  public static final java.lang.String ACTION_AUDIO_BECOMING_NOISY = "android.media.AUDIO_BECOMING_NOISY";

  public static final java.lang.String RINGER_MODE_CHANGED_ACTION = "android.media.RINGER_MODE_CHANGED";

  public static final java.lang.String EXTRA_RINGER_MODE = "android.media.EXTRA_RINGER_MODE";

  public static final java.lang.String VIBRATE_SETTING_CHANGED_ACTION = "android.media.VIBRATE_SETTING_CHANGED";

  public static final java.lang.String VOLUME_CHANGED_ACTION = "android.media.VOLUME_CHANGED_ACTION";

  public static final java.lang.String EXTRA_VIBRATE_SETTING = "android.media.EXTRA_VIBRATE_SETTING";

  public static final java.lang.String EXTRA_VIBRATE_TYPE = "android.media.EXTRA_VIBRATE_TYPE";

  public static final java.lang.String EXTRA_VOLUME_STREAM_TYPE = "android.media.EXTRA_VOLUME_STREAM_TYPE";

  public static final java.lang.String EXTRA_VOLUME_STREAM_VALUE = "android.media.EXTRA_VOLUME_STREAM_VALUE";

  public static final java.lang.String EXTRA_PREV_VOLUME_STREAM_VALUE = "android.media.EXTRA_PREV_VOLUME_STREAM_VALUE";

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

  public static final int [] DEFAULT_STREAM_VOLUME = null;

  public static final int ADJUST_RAISE = 1;

  public static final int ADJUST_LOWER = -1;

  public static final int ADJUST_SAME = 0;

  public static final int FLAG_SHOW_UI = 1;

  public static final int FLAG_ALLOW_RINGER_MODES = 2;

  public static final int FLAG_PLAY_SOUND = 4;

  public static final int FLAG_REMOVE_SOUND_AND_VIBRATE = 8;

  public static final int FLAG_VIBRATE = 16;

  public static final int FLAG_FORCE_STREAM = 32;

  public static final int RINGER_MODE_SILENT = 0;

  public static final int RINGER_MODE_VIBRATE = 1;

  public static final int RINGER_MODE_NORMAL = 2;

  public static final int VIBRATE_TYPE_RINGER = 0;

  public static final int VIBRATE_TYPE_NOTIFICATION = 1;

  public static final int VIBRATE_SETTING_OFF = 0;

  public static final int VIBRATE_SETTING_ON = 1;

  public static final int VIBRATE_SETTING_ONLY_SILENT = 2;

  public static final int USE_DEFAULT_STREAM_TYPE = -2147483648;

  public static final java.lang.String ACTION_SCO_AUDIO_STATE_CHANGED = "android.media.SCO_AUDIO_STATE_CHANGED";

  public static final java.lang.String ACTION_SCO_AUDIO_STATE_UPDATED = "android.media.ACTION_SCO_AUDIO_STATE_UPDATED";

  public static final java.lang.String EXTRA_SCO_AUDIO_STATE = "android.media.extra.SCO_AUDIO_STATE";

  public static final java.lang.String EXTRA_SCO_AUDIO_PREVIOUS_STATE = "android.media.extra.SCO_AUDIO_PREVIOUS_STATE";

  public static final int SCO_AUDIO_STATE_DISCONNECTED = 0;

  public static final int SCO_AUDIO_STATE_CONNECTED = 1;

  public static final int SCO_AUDIO_STATE_CONNECTING = 2;

  public static final int SCO_AUDIO_STATE_ERROR = -1;

  public static final int MODE_INVALID = -2;

  public static final int MODE_CURRENT = -1;

  public static final int MODE_NORMAL = 0;

  public static final int MODE_RINGTONE = 1;

  public static final int MODE_IN_CALL = 2;

  public static final int MODE_IN_COMMUNICATION = 3;

  public static final int ROUTE_EARPIECE = 1;

  public static final int ROUTE_SPEAKER = 2;

  public static final int ROUTE_BLUETOOTH = 4;

  public static final int ROUTE_BLUETOOTH_SCO = 4;

  public static final int ROUTE_HEADSET = 8;

  public static final int ROUTE_BLUETOOTH_A2DP = 16;

  public static final int ROUTE_ALL = -1;

  public static final int FX_KEY_CLICK = 0;

  public static final int FX_FOCUS_NAVIGATION_UP = 1;

  public static final int FX_FOCUS_NAVIGATION_DOWN = 2;

  public static final int FX_FOCUS_NAVIGATION_LEFT = 3;

  public static final int FX_FOCUS_NAVIGATION_RIGHT = 4;

  public static final int FX_KEYPRESS_STANDARD = 5;

  public static final int FX_KEYPRESS_SPACEBAR = 6;

  public static final int FX_KEYPRESS_DELETE = 7;

  public static final int FX_KEYPRESS_RETURN = 8;

  public static final int NUM_SOUND_EFFECTS = 9;

  public static final int AUDIOFOCUS_GAIN = 1;

  public static final int AUDIOFOCUS_GAIN_TRANSIENT = 2;

  public static final int AUDIOFOCUS_GAIN_TRANSIENT_MAY_DUCK = 3;

  public static final int AUDIOFOCUS_LOSS = -1;

  public static final int AUDIOFOCUS_LOSS_TRANSIENT = -2;

  public static final int AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK = -3;

  public static final int AUDIOFOCUS_REQUEST_FAILED = 0;

  public static final int AUDIOFOCUS_REQUEST_GRANTED = 1;

  public static final java.lang.String REMOTE_CONTROL_CLIENT_CHANGED = "android.media.REMOTE_CONTROL_CLIENT_CHANGED";

  public static final java.lang.String EXTRA_REMOTE_CONTROL_CLIENT_GENERATION = "android.media.EXTRA_REMOTE_CONTROL_CLIENT_GENERATION";

  public static final java.lang.String EXTRA_REMOTE_CONTROL_CLIENT_NAME = "android.media.EXTRA_REMOTE_CONTROL_CLIENT_NAME";

  public static final java.lang.String EXTRA_REMOTE_CONTROL_EVENT_RECEIVER = "android.media.EXTRA_REMOTE_CONTROL_EVENT_RECEIVER";

  public static final java.lang.String EXTRA_REMOTE_CONTROL_CLIENT_INFO_CHANGED = "android.media.EXTRA_REMOTE_CONTROL_CLIENT_INFO_CHANGED";

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

  // Constructors

  public AudioManager(android.content.Context arg1){
  }
  // Methods

  public java.lang.String getParameters(java.lang.String arg1){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "AudioManager.setParameter", pos = {1, 2}, report = "-")
  public void setParameter(java.lang.String arg1, java.lang.String arg2){
  }
  public void playSoundEffect(int arg1){
  }
  public void playSoundEffect(int arg1, float arg2){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "AudioManager.setParameters", pos = 1, report = "-")
  public void setParameters(java.lang.String arg1){
  }
  public int getMode(){
    return 0;
  }
  public void handleKeyDown(int arg1, int arg2){
  }
  public void handleKeyUp(int arg1, int arg2){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "AudioManager.setMode", pos = 1, report = "-")
  public void setMode(int arg1){
  }
  public int getDevicesForStream(int arg1){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "AudioManager.setRingerMode", pos = 1, report = "-")
  public void setRingerMode(int arg1){
  }
  public void preDispatchKeyEvent(int arg1, int arg2){
  }
  public int requestAudioFocus(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onAudioFocusChange") AudioManager.OnAudioFocusChangeListener arg1, int arg2, int arg3){
    return 0;
  }
  public boolean isStreamMute(int arg1){
    return false;
  }
  public int getStreamMaxVolume(int arg1){
    return 0;
  }
  public int getLastAudibleStreamVolume(int arg1){
    return 0;
  }
  public boolean shouldVibrate(int arg1){
    return false;
  }
  public int getStreamVolume(int arg1){
    return 0;
  }
  public int getRingerMode(){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "AudioManager.setStreamVolume", pos = {1, 2}, report = "-")
  public void setStreamVolume(int arg1, int arg2, int arg3){
  }
  public int abandonAudioFocus(AudioManager.OnAudioFocusChangeListener arg1){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "AudioManager.adjustStreamVolume", pos = {1, 2}, report = "-")
  public void adjustStreamVolume(int arg1, int arg2, int arg3){
  }
  public void registerRemoteControlDisplay(IRemoteControlDisplay arg1){
  }
  public void unregisterRemoteControlDisplay(IRemoteControlDisplay arg1){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "AudioManager.adjustVolume", pos = 1, report = "-")
  public void adjustVolume(int arg1, int arg2){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "AudioManager.adjustSuggestedStreamVolume", pos = {1, 2}, report = "-")
  public void adjustSuggestedStreamVolume(int arg1, int arg2, int arg3){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "AudioManager.setStreamSolo", pos = {1, 2}, report = "-")
  public void setStreamSolo(int arg1, boolean arg2){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "AudioManager.setStreamMute", pos = {1, 2}, report = "-")
  public void setStreamMute(int arg1, boolean arg2){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "AudioManager.setVibrateSettings", pos = {1, 2}, report = "-")
  public void setVibrateSetting(int arg1, int arg2){
  }
  public int getVibrateSetting(int arg1){
    return 0;
  }
  public void loadSoundEffects(){
  }
  public void unloadSoundEffects(){
  }
  public void reloadAudioSettings(){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "AudioManager.setSpeakerphoneOn", pos = 1, report = "-")
  public void setSpeakerphoneOn(boolean arg1){
  }
  public boolean isSpeakerphoneOn(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "AudioManager.setBluetoothScoOn", pos = 1, report = "-")
  public void setBluetoothScoOn(boolean arg1){
  }
  public boolean isBluetoothScoOn(){
    return false;
  }
  public void registerMediaButtonIntent(android.app.PendingIntent arg1, android.content.ComponentName arg2){
  }
  public void unregisterMediaButtonIntent(android.app.PendingIntent arg1, android.content.ComponentName arg2){
  }
  public void registerRemoteControlClient(RemoteControlClient arg1){
  }
  public void unregisterRemoteControlClient(RemoteControlClient arg1){
  }
  public void remoteControlDisplayUsesBitmapSize(IRemoteControlDisplay arg1, int arg2, int arg3){
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "AudioManager.startBluetoothSco", report = "-")
  public void startBluetoothSco(){
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "AudioManager.stopBluetoothSco", report = "-")
  public void stopBluetoothSco(){
  }
  public void forceVolumeControlStream(int arg1){
  }
  public boolean isSilentMode(){
    return false;
  }
  public boolean isMusicActive(){
    return false;
  }
  public static boolean isValidRingerMode(int arg1){
    return false;
  }
  public boolean isBluetoothScoAvailableOffCall(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "AudioManager.setBluetoothA2dpOn", pos = 1, report = "-")
  public void setBluetoothA2dpOn(boolean arg1){
  }
  public boolean isBluetoothA2dpOn(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "AudioManager.setWiredHeadsetOn", pos = 1, report = "-")
  public void setWiredHeadsetOn(boolean arg1){
  }
  public boolean isWiredHeadsetOn(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "AudioManager.setMicrophoneMute", pos = 1, report = "-")
  public void setMicrophoneMute(boolean arg1){
  }
  public boolean isMicrophoneMute(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "AudioManager.setRouting", pos = {1, 2, 3}, report = "-")
  public void setRouting(int arg1, int arg2, int arg3){
  }
  public int getRouting(int arg1){
    return 0;
  }
  public void registerAudioFocusListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onAudioFocusChange") AudioManager.OnAudioFocusChangeListener arg1){
  }
  public void unregisterAudioFocusListener(AudioManager.OnAudioFocusChangeListener arg1){
  }
  public void registerMediaButtonEventReceiver(android.content.ComponentName arg1){
  }
  public void unregisterMediaButtonEventReceiver(android.content.ComponentName arg1){
  }
}
