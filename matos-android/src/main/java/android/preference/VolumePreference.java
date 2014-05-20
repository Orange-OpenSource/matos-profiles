package android.preference;

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
public class VolumePreference
  extends SeekBarDialogPreference  implements android.view.View.OnKeyListener, PreferenceManager.OnActivityStopListener
{
  // Classes

  public static class VolumeStore
  {
    // Fields

    public int volume;

    public int originalVolume;

    // Constructors

    public VolumeStore(){
    }
  }
  public class SeekBarVolumizer
    implements android.widget.SeekBar.OnSeekBarChangeListener, java.lang.Runnable
  {
    // Fields

    // Constructors
	@com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
    public SeekBarVolumizer(android.content.Context arg1, android.widget.SeekBar arg2, int arg3){
    }
	@com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
    public SeekBarVolumizer(android.content.Context arg1, android.widget.SeekBar arg2, int arg3, android.net.Uri arg4){
    }
    // Methods

    public void run(){
    }
    public void stop(){
    }
    @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
    public void onRestoreInstanceState(VolumePreference.VolumeStore arg1){
    }
    @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
    public void onSaveInstanceState(VolumePreference.VolumeStore arg1){
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
    public void revertVolume(){
    }
    public boolean isSamplePlaying(){
      return false;
    }
    public void startSample(){
    }
    public void stopSample(){
    }
    public android.widget.SeekBar getSeekBar(){
      return (android.widget.SeekBar) null;
    }
    public void changeVolumeBy(int arg1){
    }
    public void muteVolume(){
    }
  }
  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public VolumePreference(android.content.Context arg1, android.util.AttributeSet arg2){
    super((android.content.Context) null, (android.util.AttributeSet) null);
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onRestoreInstanceState(android.os.Parcelable arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected android.os.Parcelable onSaveInstanceState(){
    return (android.os.Parcelable) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onKey(android.view.View arg1, int arg2, android.view.KeyEvent arg3){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onDialogClosed(boolean arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onBindDialogView(android.view.View arg1){
  }
  public void setStreamType(int arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onSampleStarting(VolumePreference.SeekBarVolumizer arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onActivityStop(){
  }
}
