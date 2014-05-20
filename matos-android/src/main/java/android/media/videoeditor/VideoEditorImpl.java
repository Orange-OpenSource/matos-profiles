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
public class VideoEditorImpl
  implements VideoEditor
{
  // Constructors

  public VideoEditorImpl(java.lang.String arg1) throws java.io.IOException{
  }
  // Methods

  public void save() throws java.io.IOException{
  }
  public java.lang.String getPath(){
    return (java.lang.String) null;
  }
  public void release(){
  }
  public long getDuration(){
    return 0l;
  }
  public synchronized MediaItem getMediaItem(java.lang.String arg1){
    return (MediaItem) null;
  }
  public int getAspectRatio(){
    return 0;
  }
  public void startPreview(android.view.SurfaceHolder arg1, long arg2, long arg3, boolean arg4, int arg5, @com.francetelecom.rd.stubs.annotation.CallBackRegister("PreviewProgressListener") VideoEditor.PreviewProgressListener arg6){
  }
  public long stopPreview(){
    return 0l;
  }
  public void generatePreview(@com.francetelecom.rd.stubs.annotation.CallBackRegister("MediaProcessingProgressListener") VideoEditor.MediaProcessingProgressListener arg1){
  }
  public void export(java.lang.String arg1, int arg2, int arg3, int arg4, int arg5, @com.francetelecom.rd.stubs.annotation.CallBackRegister("ExportProgressListener") VideoEditor.ExportProgressListener arg6) throws java.io.IOException{
  }
  public void export(java.lang.String arg1, int arg2, int arg3, @com.francetelecom.rd.stubs.annotation.CallBackRegister("ExportProgressListener") VideoEditor.ExportProgressListener arg4) throws java.io.IOException{
  }
  public void cancelExport(java.lang.String arg1){
  }
  public synchronized void addMediaItem(MediaItem arg1){
  }
  public synchronized void insertMediaItem(MediaItem arg1, java.lang.String arg2){
  }
  public synchronized void moveMediaItem(java.lang.String arg1, java.lang.String arg2){
  }
  public synchronized MediaItem removeMediaItem(java.lang.String arg1){
    return (MediaItem) null;
  }
  public synchronized void removeAllMediaItems(){
  }
  public java.util.List<MediaItem> getAllMediaItems(){
    return (java.util.List) null;
  }
  public synchronized void addTransition(Transition arg1){
  }
  public synchronized Transition removeTransition(java.lang.String arg1){
    return (Transition) null;
  }
  public java.util.List<Transition> getAllTransitions(){
    return (java.util.List) null;
  }
  public Transition getTransition(java.lang.String arg1){
    return (Transition) null;
  }
  public synchronized void addAudioTrack(AudioTrack arg1){
  }
  public synchronized void insertAudioTrack(AudioTrack arg1, java.lang.String arg2){
  }
  public synchronized void moveAudioTrack(java.lang.String arg1, java.lang.String arg2){
  }
  public synchronized AudioTrack removeAudioTrack(java.lang.String arg1){
    return (AudioTrack) null;
  }
  public java.util.List<AudioTrack> getAllAudioTracks(){
    return (java.util.List) null;
  }
  public AudioTrack getAudioTrack(java.lang.String arg1){
    return (AudioTrack) null;
  }
  public void setAspectRatio(int arg1){
  }
  public long renderPreviewFrame(android.view.SurfaceHolder arg1, long arg2, VideoEditor.OverlayData arg3){
    return 0l;
  }
  public void clearSurface(android.view.SurfaceHolder arg1){
  }
}
