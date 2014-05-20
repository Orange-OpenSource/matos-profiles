package android.view;

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
public class VolumePanel
  extends android.os.Handler  implements View.OnClickListener, android.widget.SeekBar.OnSeekBarChangeListener
{
  // Fields

  public static final int PLAY_SOUND_DELAY = 300;

  public static final int VIBRATE_DELAY = 300;

  protected android.content.Context mContext;

  protected android.media.AudioService mAudioService;

  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public VolumePanel(android.content.Context arg1, android.media.AudioService arg2){
    super();
  }
  // Methods

  public void handleMessage(android.os.Message arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onClick(View arg1){
  }
  public void postVolumeChanged(int arg1, int arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onVolumeChanged(int arg1, int arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onShowVolumeChanged(int arg1, int arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onPlaySound(int arg1, int arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onStopSounds(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onVibrate(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onFreeResources(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onProgressChanged(android.widget.SeekBar arg1, int arg2, boolean arg3){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onStartTrackingTouch(android.widget.SeekBar arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onStopTrackingTouch(android.widget.SeekBar arg1){
  }
}
