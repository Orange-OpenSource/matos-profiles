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


public class RemoteControlClient
{
  // Classes

  public class MetadataEditor
  {
    // Fields

    protected boolean mMetadataChanged;

    protected boolean mArtworkChanged;

    protected android.graphics.Bitmap mEditorArtwork;

    protected android.os.Bundle mEditorMetadata;

    public static final int BITMAP_KEY_ARTWORK = 100;

    public static final int METADATA_KEY_ARTWORK = 100;

    // Constructors

    private MetadataEditor(){
    }
    // Methods

    public java.lang.Object clone() throws java.lang.CloneNotSupportedException{
      return (java.lang.Object) null;
    }
    public synchronized RemoteControlClient.MetadataEditor putLong(int arg1, long arg2) throws java.lang.IllegalArgumentException{
      return (RemoteControlClient.MetadataEditor) null;
    }
    public synchronized void clear(){
    }
    public synchronized RemoteControlClient.MetadataEditor putString(int arg1, java.lang.String arg2) throws java.lang.IllegalArgumentException{
      return (RemoteControlClient.MetadataEditor) null;
    }
    public synchronized void apply(){
    }
    public synchronized RemoteControlClient.MetadataEditor putBitmap(int arg1, android.graphics.Bitmap arg2) throws java.lang.IllegalArgumentException{
      return (RemoteControlClient.MetadataEditor) null;
    }
  }
  // Fields

  public static final int PLAYSTATE_STOPPED = 1;

  public static final int PLAYSTATE_PAUSED = 2;

  public static final int PLAYSTATE_PLAYING = 3;

  public static final int PLAYSTATE_FAST_FORWARDING = 4;

  public static final int PLAYSTATE_REWINDING = 5;

  public static final int PLAYSTATE_SKIPPING_FORWARDS = 6;

  public static final int PLAYSTATE_SKIPPING_BACKWARDS = 7;

  public static final int PLAYSTATE_BUFFERING = 8;

  public static final int PLAYSTATE_ERROR = 9;

  public static final int PLAYSTATE_NONE = 0;

  public static final int FLAG_KEY_MEDIA_PREVIOUS = 1;

  public static final int FLAG_KEY_MEDIA_REWIND = 2;

  public static final int FLAG_KEY_MEDIA_PLAY = 4;

  public static final int FLAG_KEY_MEDIA_PLAY_PAUSE = 8;

  public static final int FLAG_KEY_MEDIA_PAUSE = 16;

  public static final int FLAG_KEY_MEDIA_STOP = 32;

  public static final int FLAG_KEY_MEDIA_FAST_FORWARD = 64;

  public static final int FLAG_KEY_MEDIA_NEXT = 128;

  public static final int FLAGS_KEY_MEDIA_NONE = 0;

  public static final int FLAG_INFORMATION_REQUEST_METADATA = 1;

  public static final int FLAG_INFORMATION_REQUEST_KEY_MEDIA = 2;

  public static final int FLAG_INFORMATION_REQUEST_PLAYSTATE = 4;

  public static final int FLAG_INFORMATION_REQUEST_ALBUM_ART = 8;

  // Constructors

  public RemoteControlClient(android.app.PendingIntent arg1){
  }
  public RemoteControlClient(android.app.PendingIntent arg1, android.os.Looper arg2){
  }
  // Methods

  public void setPlaybackState(int arg1){
  }
  public void setTransportControlFlags(int arg1){
  }
  public RemoteControlClient.MetadataEditor editMetadata(boolean arg1){
    return (RemoteControlClient.MetadataEditor) null;
  }
  public android.app.PendingIntent getRcMediaIntent(){
    return (android.app.PendingIntent) null;
  }
  public IRemoteControlClient getIRemoteControlClient(){
    return (IRemoteControlClient) null;
  }
}
