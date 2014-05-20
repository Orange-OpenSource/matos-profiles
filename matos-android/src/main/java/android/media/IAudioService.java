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

import com.francetelecom.rd.stubs.annotation.Real;


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public interface IAudioService
  extends android.os.IInterface
{
  // Classes
	@Real("com.francetelecom.rd.fakeandroid.IAudioServiceImpl")
  public abstract static class Stub
    extends android.os.Binder    implements IAudioService
  {
    // Constructors

    public Stub(){
      super();
    }
    // Methods

    public android.os.IBinder asBinder(){
      return (android.os.IBinder) null;
    }
    public static IAudioService asInterface(android.os.IBinder arg1){
      return (IAudioService) null;
    }
    @com.francetelecom.rd.stubs.annotation.CallBackRegister("IAudioService")
    public boolean onTransact(int arg1, android.os.Parcel arg2, android.os.Parcel arg3, int arg4) throws android.os.RemoteException{
      return false;
    }
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("IAudioService")
  public void playSoundEffect(int arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IAudioService")
  public int getMode() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IAudioService")
  public void setMode(int arg1, android.os.IBinder arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IAudioService")
  public void setRingerMode(int arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IAudioService")
  public int requestAudioFocus(int arg1, int arg2, android.os.IBinder arg3, IAudioFocusDispatcher arg4, java.lang.String arg5, java.lang.String arg6) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IAudioService")
  public boolean isStreamMute(int arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IAudioService")
  public int getStreamMaxVolume(int arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IAudioService")
  public int getLastAudibleStreamVolume(int arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IAudioService")
  public boolean shouldVibrate(int arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IAudioService")
  public int getStreamVolume(int arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IAudioService")
  public int getRingerMode() throws android.os.RemoteException;
  public void setStreamVolume(int arg1, int arg2, int arg3) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IAudioService")
  public int abandonAudioFocus(IAudioFocusDispatcher arg1, java.lang.String arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IAudioService")
  public void adjustStreamVolume(int arg1, int arg2, int arg3) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IAudioService")
  public void registerRemoteControlDisplay(IRemoteControlDisplay arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IAudioService")
  public void unregisterRemoteControlDisplay(IRemoteControlDisplay arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IAudioService")
  public void adjustVolume(int arg1, int arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IAudioService")
  public void adjustSuggestedStreamVolume(int arg1, int arg2, int arg3) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IAudioService")
  public void setStreamSolo(int arg1, boolean arg2, android.os.IBinder arg3) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IAudioService")
  public void setStreamMute(int arg1, boolean arg2, android.os.IBinder arg3) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IAudioService")
  public void setVibrateSetting(int arg1, int arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IAudioService")
  public int getVibrateSetting(int arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IAudioService")
  public void playSoundEffectVolume(int arg1, float arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IAudioService")
  public boolean loadSoundEffects() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IAudioService")
  public void unloadSoundEffects() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IAudioService")
  public void reloadAudioSettings() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IAudioService")
  public void setSpeakerphoneOn(boolean arg1) throws android.os.RemoteException;
  public boolean isSpeakerphoneOn() throws android.os.RemoteException;
  public void setBluetoothScoOn(boolean arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IAudioService")
  public boolean isBluetoothScoOn() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IAudioService")
  public void unregisterAudioFocusClient(java.lang.String arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IAudioService")
  public void registerMediaButtonIntent(android.app.PendingIntent arg1, android.content.ComponentName arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IAudioService")
  public void unregisterMediaButtonIntent(android.app.PendingIntent arg1, android.content.ComponentName arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IAudioService")
  public void registerRemoteControlClient(android.app.PendingIntent arg1, IRemoteControlClient arg2, java.lang.String arg3) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IAudioService")
  public void unregisterRemoteControlClient(android.app.PendingIntent arg1, IRemoteControlClient arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IAudioService")
  public void remoteControlDisplayUsesBitmapSize(IRemoteControlDisplay arg1, int arg2, int arg3) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IAudioService")
  public void startBluetoothSco(android.os.IBinder arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IAudioService")
  public void stopBluetoothSco(android.os.IBinder arg1) throws android.os.RemoteException;
}
