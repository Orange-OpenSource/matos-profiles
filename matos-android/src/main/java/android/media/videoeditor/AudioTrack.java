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
public class AudioTrack
{
  // Constructors

  private AudioTrack() throws java.io.IOException{
  }
  public AudioTrack(VideoEditor arg1, java.lang.String arg2, java.lang.String arg3) throws java.io.IOException{
  }
  AudioTrack(VideoEditor arg1, java.lang.String arg2, java.lang.String arg3, long arg4, long arg5, long arg6, boolean arg7, int arg8, boolean arg9, boolean arg10, int arg11, int arg12, java.lang.String arg13) throws java.io.IOException{
  }
  // Methods

  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public int hashCode(){
    return 0;
  }
  public java.lang.String getId(){
    return (java.lang.String) null;
  }
  public java.lang.String getFilename(){
    return (java.lang.String) null;
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
  public long getStartTime(){
    return 0l;
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
  public void enableLoop(){
  }
  public void disableLoop(){
  }
  public boolean isLooping(){
    return false;
  }
  public void disableDucking(){
  }
  public void enableDucking(int arg1, int arg2){
  }
  public boolean isDuckingEnabled(){
    return false;
  }
  public int getDuckingThreshhold(){
    return 0;
  }
  public int getDuckedTrackVolume(){
    return 0;
  }
  public void extractAudioWaveform(@com.francetelecom.rd.stubs.annotation.CallBackRegister("ExtractAudioWaveformProgressListener") ExtractAudioWaveformProgressListener arg1) throws java.io.IOException{
  }
  public WaveformData getWaveformData() throws java.io.IOException{
    return (WaveformData) null;
  }
}
