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
public class HTML5VideoFullScreen
  extends HTML5VideoView  implements android.view.View.OnTouchListener, android.widget.MediaController.MediaPlayerControl, android.media.MediaPlayer.OnPreparedListener
{
  // Constructors

  HTML5VideoFullScreen(android.content.Context arg1, int arg2, int arg3, boolean arg4){
    super();
  }
  // Methods

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
  public void onPrepared(android.media.MediaPlayer arg1){
  }
  public void decideDisplayMode(){
  }
  public boolean isFullScreenMode(){
    return false;
  }
  protected void switchProgressView(boolean arg1){
  }
  public boolean fullScreenExited(){
    return false;
  }
  public boolean onTouch(android.view.View arg1, android.view.MotionEvent arg2){
    return false;
  }
}
