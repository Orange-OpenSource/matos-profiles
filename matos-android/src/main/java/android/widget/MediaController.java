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
public class MediaController
  extends FrameLayout{
  // Classes

  public static interface MediaPlayerControl
  {
    // Methods

    public void start();
    public int getDuration();
    public void pause();
    public int getCurrentPosition();
    public void seekTo(int arg1);
    public boolean isPlaying();
    public int getBufferPercentage();
    public boolean canPause();
    public boolean canSeekBackward();
    public boolean canSeekForward();
  }
  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public MediaController(android.content.Context arg1, android.util.AttributeSet arg2){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public MediaController(android.content.Context arg1, boolean arg2){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public MediaController(android.content.Context arg1){
    super((android.content.Context) null);
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onTouchEvent(android.view.MotionEvent arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onTrackballEvent(android.view.MotionEvent arg1){
    return false;
  }
  public boolean dispatchKeyEvent(android.view.KeyEvent arg1){
    return false;
  }
  public void show(){
  }
  public void show(int arg1){
  }
  public void hide(){
  }
  public void setEnabled(boolean arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onFinishInflate(){
  }
  public boolean isShowing(){
    return false;
  }
  public void setAnchorView(android.view.View arg1){
  }
  public void setMediaPlayer(MediaController.MediaPlayerControl arg1){
  }
  protected android.view.View makeControllerView(){
    return (android.view.View) null;
  }
  public void setPrevNextListeners(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onClick") android.view.View.OnClickListener arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("onClick") android.view.View.OnClickListener arg2){
  }
}
