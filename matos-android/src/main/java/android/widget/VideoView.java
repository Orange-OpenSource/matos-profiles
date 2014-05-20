package android.widget;

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
public class VideoView
  extends android.view.SurfaceView  implements MediaController.MediaPlayerControl
{
  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public VideoView(android.content.Context arg1){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public VideoView(android.content.Context arg1, android.util.AttributeSet arg2){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public VideoView(android.content.Context arg1, android.util.AttributeSet arg2, int arg3){
    super((android.content.Context) null);
  }
  // Methods

  public void start(){
  }
  public void resume(){
  }
  public void suspend(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onKeyDown(int arg1, android.view.KeyEvent arg2){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onTouchEvent(android.view.MotionEvent arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onTrackballEvent(android.view.MotionEvent arg1){
    return false;
  }
  public int getDuration(){
    return 0;
  }
  protected void onMeasure(int arg1, int arg2){
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
  public int getBufferPercentage(){
    return 0;
  }
  public boolean canPause(){
    return false;
  }
  public boolean canSeekBackward(){
    return false;
  }
  public boolean canSeekForward(){
    return false;
  }
  public void stopPlayback(){
  }
  public void setOnErrorListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onError") android.media.MediaPlayer.OnErrorListener arg1){
  }
  public void setOnCompletionListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onCompletion") android.media.MediaPlayer.OnCompletionListener arg1){
  }
  public void setOnPreparedListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onPrepare") android.media.MediaPlayer.OnPreparedListener arg1){
  }
  public void setVideoURI(android.net.Uri arg1){
  }
  public void setVideoURI(android.net.Uri arg1, java.util.Map<java.lang.String, java.lang.String> arg2){
  }
  public int resolveAdjustedSize(int arg1, int arg2){
    return 0;
  }
  public void setVideoPath(java.lang.String arg1){
  }
  public void setMediaController(MediaController arg1){
  }
}
