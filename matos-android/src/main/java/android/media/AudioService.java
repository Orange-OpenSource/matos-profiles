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
public class AudioService
  extends IAudioService.Stub{
  // Classes

  public class VolumeStreamState
  {
    // Fields

    // Constructors

    private VolumeStreamState(java.lang.String arg1, int arg2){
    }
    // Methods

    public boolean setIndex(int arg1, boolean arg2){
      return false;
    }
    public void mute(android.os.IBinder arg1, boolean arg2){
    }
    public int getMaxIndex(){
      return 0;
    }
    public void setVolumeIndexSettingName(java.lang.String arg1){
    }
    public boolean adjustIndex(int arg1){
      return false;
    }
    public void setLastAudibleIndex(int arg1){
    }
    public void adjustLastAudibleIndex(int arg1){
    }
  }
  // Fields

  protected static final boolean DEBUG_RC = false;

  // Constructors

  public AudioService(android.content.Context arg1){
    super();
  }
  // Methods

  protected void dump(java.io.FileDescriptor arg1, java.io.PrintWriter arg2, java.lang.String [] arg3){
  }
  public void playSoundEffect(int arg1){
  }
  public int getMode(){
    return 0;
  }
  public void setMode(int arg1, android.os.IBinder arg2){
  }
  public void setRingerMode(int arg1){
  }
  public int requestAudioFocus(int arg1, int arg2, android.os.IBinder arg3, IAudioFocusDispatcher arg4, java.lang.String arg5, java.lang.String arg6){
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
  public void setStreamVolume(int arg1, int arg2, int arg3){
  }
  public int abandonAudioFocus(IAudioFocusDispatcher arg1, java.lang.String arg2){
    return 0;
  }
  public void adjustStreamVolume(int arg1, int arg2, int arg3){
  }
  public void registerRemoteControlDisplay(IRemoteControlDisplay arg1){
  }
  public void unregisterRemoteControlDisplay(IRemoteControlDisplay arg1){
  }
  public void adjustVolume(int arg1, int arg2){
  }
  public void adjustSuggestedStreamVolume(int arg1, int arg2, int arg3){
  }
  public void setStreamSolo(int arg1, boolean arg2, android.os.IBinder arg3){
  }
  public void setStreamMute(int arg1, boolean arg2, android.os.IBinder arg3){
  }
  public void setVibrateSetting(int arg1, int arg2){
  }
  public int getVibrateSetting(int arg1){
    return 0;
  }
  public void playSoundEffectVolume(int arg1, float arg2){
  }
  public boolean loadSoundEffects(){
    return false;
  }
  public void unloadSoundEffects(){
  }
  public void reloadAudioSettings(){
  }
  public void setSpeakerphoneOn(boolean arg1){
  }
  public boolean isSpeakerphoneOn(){
    return false;
  }
  public void setBluetoothScoOn(boolean arg1){
  }
  public boolean isBluetoothScoOn(){
    return false;
  }
  public void unregisterAudioFocusClient(java.lang.String arg1){
  }
  public void registerMediaButtonIntent(android.app.PendingIntent arg1, android.content.ComponentName arg2){
  }
  public void unregisterMediaButtonIntent(android.app.PendingIntent arg1, android.content.ComponentName arg2){
  }
  public void registerRemoteControlClient(android.app.PendingIntent arg1, IRemoteControlClient arg2, java.lang.String arg3){
  }
  public void unregisterRemoteControlClient(android.app.PendingIntent arg1, IRemoteControlClient arg2){
  }
  public void remoteControlDisplayUsesBitmapSize(IRemoteControlDisplay arg1, int arg2, int arg3){
  }
  public void startBluetoothSco(android.os.IBinder arg1){
  }
  public void stopBluetoothSco(android.os.IBinder arg1){
  }
  public boolean isStreamAffectedByRingerMode(int arg1){
    return false;
  }
  public static int getValueForVibrateSetting(int arg1, int arg2, int arg3){
    return 0;
  }
  public void clearAllScoClients(int arg1, boolean arg2){
  }
  public boolean isStreamAffectedByMute(int arg1){
    return false;
  }
}
