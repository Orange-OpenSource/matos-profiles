package android.webkit;

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
public class HTML5VideoView
  implements android.media.MediaPlayer.OnPreparedListener
{
  // Fields

  protected static final java.lang.String LOGTAG = (java.lang.String) null;

  protected static final java.lang.String COOKIE = (java.lang.String) null;

  protected static final java.lang.String HIDE_URL_LOGS = (java.lang.String) null;

  protected int mCurrentState;

  protected int mSaveSeekTime;

  protected int mVideoLayerId;

  protected android.media.MediaPlayer mPlayer;

  protected boolean mAutostart;

  protected android.net.Uri mUri;

  protected java.util.Map<java.lang.String, java.lang.String> mHeaders;

  protected static java.util.Timer mTimer;

  protected boolean mPauseDuringPreparing;

  public boolean mPlayerBuffering;

  // Constructors

  protected HTML5VideoView(){
  }
  // Methods

  public void init(int arg1, int arg2, boolean arg3){
  }
  public void start(){
  }
  public void release(){
  }
  public int getDuration(){
    return 0;
  }
  public void pause(){
  }
  public int getCurrentPosition(){
    return 0;
  }
  public void seekTo(int arg1){
  }
  public boolean isPlaying(){
    return false;
  }
  public void onPrepared(android.media.MediaPlayer arg1){
  }
  public int getCurrentState(){
    return 0;
  }
  public void decideDisplayMode(){
  }
  public android.graphics.SurfaceTexture getSurfaceTexture(int arg1){
    return (android.graphics.SurfaceTexture) null;
  }
  public boolean surfaceTextureDeleted(){
    return false;
  }
  public void deleteSurfaceTexture(){
  }
  public int getTextureName(){
    return 0;
  }
  public boolean getPauseDuringPreparing(){
    return false;
  }
  public int getVideoLayerId(){
    return 0;
  }
  public void stopPlayback(){
  }
  public boolean getAutostart(){
    return false;
  }
  public boolean isFullScreenMode(){
    return false;
  }
  public boolean getReadyToUseSurfTex(){
    return false;
  }
  public boolean getPlayerBuffering(){
    return false;
  }
  public void setPlayerBuffering(boolean arg1){
  }
  protected void switchProgressView(boolean arg1){
  }
  public boolean fullScreenExited(){
    return false;
  }
}
