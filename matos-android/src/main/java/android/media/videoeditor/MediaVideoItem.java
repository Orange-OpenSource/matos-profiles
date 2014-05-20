package android.media.videoeditor;

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
public class MediaVideoItem
  extends MediaItem{
  // Constructors

  private MediaVideoItem() throws java.io.IOException{
    super((VideoEditor) null, (java.lang.String) null, (java.lang.String) null, 0);
  }
  public MediaVideoItem(VideoEditor arg1, java.lang.String arg2, java.lang.String arg3, int arg4) throws java.io.IOException{
    super((VideoEditor) null, (java.lang.String) null, (java.lang.String) null, 0);
  }
  MediaVideoItem(VideoEditor arg1, java.lang.String arg2, java.lang.String arg3, int arg4, long arg5, long arg6, int arg7, boolean arg8, java.lang.String arg9) throws java.io.IOException{
    super((VideoEditor) null, (java.lang.String) null, (java.lang.String) null, 0);
  }
  // Methods

  public android.graphics.Bitmap getThumbnail(int arg1, int arg2, long arg3){
    return (android.graphics.Bitmap) null;
  }
  public int getAudioChannels(){
    return 0;
  }
  public int getAudioType(){
    return 0;
  }
  public int getAudioSamplingFrequency(){
    return 0;
  }
  public int getAudioBitrate(){
    return 0;
  }
  public void setVolume(int arg1){
  }
  public int getVolume(){
    return 0;
  }
  public void setMute(boolean arg1){
  }
  public boolean isMuted(){
    return false;
  }
  public long getDuration(){
    return 0l;
  }
  public long getTimelineDuration(){
    return 0l;
  }
  public void setExtractBoundaries(long arg1, long arg2){
  }
  public long getBoundaryBeginTime(){
    return 0l;
  }
  public long getBoundaryEndTime(){
    return 0l;
  }
  public void extractAudioWaveform(@com.francetelecom.rd.stubs.annotation.CallBackRegister("ExtractAudioWaveformProgressListener") ExtractAudioWaveformProgressListener arg1) throws java.io.IOException{
  }
  public WaveformData getWaveformData() throws java.io.IOException{
    return (WaveformData) null;
  }
  public int getWidth(){
    return 0;
  }
  public int getHeight(){
    return 0;
  }
  public int getFileType(){
    return 0;
  }
  public int getAspectRatio(){
    return 0;
  }
  public void addEffect(Effect arg1){
  }
  public void getThumbnailList(int arg1, int arg2, long arg3, long arg4, int arg5, int [] arg6, @com.francetelecom.rd.stubs.annotation.CallBackRegister("GetThumbnailListCallback") MediaItem.GetThumbnailListCallback arg7) throws java.io.IOException{
  }
  public int getFps(){
    return 0;
  }
  public long renderFrame(android.view.SurfaceHolder arg1, long arg2){
    return 0l;
  }
  public int getVideoType(){
    return 0;
  }
  public int getVideoProfile(){
    return 0;
  }
  public int getVideoLevel(){
    return 0;
  }
  public int getVideoBitrate(){
    return 0;
  }
}
