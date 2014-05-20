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


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public class MediaPlayer
{
  // Classes

  public static interface OnPreparedListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onPrepare")
    public void onPrepared(MediaPlayer arg1);
  }
  public static interface OnCompletionListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onCompletion")
    public void onCompletion(MediaPlayer arg1);
  }
  public static interface OnBufferingUpdateListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onBufferingUpdate")
    public void onBufferingUpdate(MediaPlayer arg1, int arg2);
  }
  public static interface OnSeekCompleteListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onSeekComplete")
    public void onSeekComplete(MediaPlayer arg1);
  }
  public static interface OnVideoSizeChangedListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onVideoSizeChange")
    public void onVideoSizeChanged(MediaPlayer arg1, int arg2, int arg3);
  }
  public static interface OnTimedTextListener
  {
    // Methods

	  @com.francetelecom.rd.stubs.annotation.CallBack("onTimedText")
    public void onTimedText(MediaPlayer arg1, TimedText arg2);
  }
  public static interface OnErrorListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onError")
    public boolean onError(MediaPlayer arg1, int arg2, int arg3);
  }
  public static interface OnInfoListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onInfo")
    public boolean onInfo(MediaPlayer arg1, int arg2, int arg3);
  }
  // Fields

  public static final boolean METADATA_UPDATE_ONLY = true;

  public static final boolean METADATA_ALL = false;

  public static final boolean APPLY_METADATA_FILTER = true;

  public static final boolean BYPASS_METADATA_FILTER = false;

  public static final int MEDIA_ERROR_UNKNOWN = 1;

  public static final int MEDIA_ERROR_SERVER_DIED = 100;

  public static final int MEDIA_ERROR_NOT_VALID_FOR_PROGRESSIVE_PLAYBACK = 200;

  public static final int MEDIA_INFO_UNKNOWN = 1;

  public static final int MEDIA_INFO_VIDEO_TRACK_LAGGING = 700;

  public static final int MEDIA_INFO_BUFFERING_START = 701;

  public static final int MEDIA_INFO_BUFFERING_END = 702;

  public static final int MEDIA_INFO_BAD_INTERLEAVING = 800;

  public static final int MEDIA_INFO_NOT_SEEKABLE = 801;

  public static final int MEDIA_INFO_METADATA_UPDATE = 802;

  // Constructors

  public MediaPlayer(){
  }
  // Methods

  public int invoke(android.os.Parcel arg1, android.os.Parcel arg2){
    return 0;
  }
  protected void finalize(){
  }
  public void start() throws java.lang.IllegalStateException{
  }
  public void stop() throws java.lang.IllegalStateException{
  }
  public void reset(){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "MediaPlayer.create-1", pos = {-1, 1, 2}, report = "-")
  public static MediaPlayer create(android.content.Context arg1, android.net.Uri arg2){
    return (MediaPlayer) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "MediaPlayer.create-2", pos = {-1, 1, 2}, report = "-")
  public static MediaPlayer create(android.content.Context arg1, android.net.Uri arg2, android.view.SurfaceHolder arg3){
    return (MediaPlayer) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "MediaPlayer.create-3", pos = {-1, 1, 2}, report = "-")
  public static MediaPlayer create(android.content.Context arg1, int arg2){
    return (MediaPlayer) null;
  }
  public void release(){
  }
  public void prepare() throws java.io.IOException, java.lang.IllegalStateException{
  }
  public boolean setParameter(int arg1, android.os.Parcel arg2){
    return false;
  }
  public boolean setParameter(int arg1, java.lang.String arg2){
    return false;
  }
  public boolean setParameter(int arg1, int arg2){
    return false;
  }
  public void setVolume(float arg1, float arg2){
  }
  public int getDuration(){
    return 0;
  }
  public boolean isLooping(){
    return false;
  }
  public void pause() throws java.lang.IllegalStateException{
  }
  public int getCurrentPosition(){
    return 0;
  }
  public void seekTo(int arg1) throws java.lang.IllegalStateException{
  }
  public boolean isPlaying(){
    return false;
  }
  public int getIntParameter(int arg1){
    return 0;
  }
  public int getAudioSessionId(){
    return 0;
  }
  public android.os.Parcel newRequest(){
    return (android.os.Parcel) null;
  }
  public void setOnErrorListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("android.media.MediaPlayer.OnErrorListener.onError") MediaPlayer.OnErrorListener arg1){
  }
  public void setOnCompletionListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("android.media.MediaPlayer.OnCompletionListener.onCompletion") MediaPlayer.OnCompletionListener arg1){
  }
  public void setAudioStreamType(int arg1){
  }
  public void setSurface(android.view.Surface arg1){
  }
  public void setWakeMode(android.content.Context arg1, int arg2){
  }
  public void setOnPreparedListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("android.media.MediaPlayer.OnPreparedListener.onPrepare") MediaPlayer.OnPreparedListener arg1){
  }
  public void setOnInfoListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("android.media.MediaPlayer.OnInfoListener.onInfo") MediaPlayer.OnInfoListener arg1){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "MediaPlayer.setDataSource-1", pos = {0, 1, 2}, report = "-")
  public void setDataSource(android.content.Context arg1, android.net.Uri arg2) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.SecurityException, java.lang.IllegalStateException{
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "MediaPlayer.setDataSource-5", pos = {0, 1, 2, 3}, report = "-")
  public void setDataSource(android.content.Context arg1, android.net.Uri arg2, java.util.Map<java.lang.String, java.lang.String> arg3) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.SecurityException, java.lang.IllegalStateException{
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "MediaPlayer.setDataSource-2", pos = {0, 1}, report = "-")
  public void setDataSource(java.lang.String arg1) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.SecurityException, java.lang.IllegalStateException{
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "MediaPlayer.setDataSource-5", pos = {0, 1}, report = "-")
  public void setDataSource(java.lang.String arg1, java.util.Map<java.lang.String, java.lang.String> arg2) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.SecurityException, java.lang.IllegalStateException{
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "MediaPlayer.setDataSource-3", pos = {0, 1}, report = "-")
  public void setDataSource(java.io.FileDescriptor arg1) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException{
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "MediaPlayer.setDataSource-4", pos = {0, 1, 2}, report = "-")
  public void setDataSource(java.io.FileDescriptor arg1, long arg2, long arg3) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException{
  }
  public void prepareAsync() throws java.lang.IllegalStateException{
  }
  public void setOnBufferingUpdateListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("android.media.MediaPlayer.OnBufferingUpdateListener.onBufferingUpdate") MediaPlayer.OnBufferingUpdateListener arg1){
  }
  public void setOnSeekCompleteListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("android.media.MediaPlayer.OnSeekCompleteListener.onSeekComplete") MediaPlayer.OnSeekCompleteListener arg1){
  }
  public void setLooping(boolean arg1){
  }
  public void setOnVideoSizeChangedListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("android.media.MediaPlayer.OnVideoSizeChangedListener.onVideoSizeChange") MediaPlayer.OnVideoSizeChangedListener arg1){
  }
  public int getVideoWidth(){
    return 0;
  }
  public int getVideoHeight(){
    return 0;
  }
  public Metadata getMetadata(boolean arg1, boolean arg2){
    return (Metadata) null;
  }
  public void setDisplay(android.view.SurfaceHolder arg1){
  }
  public void setScreenOnWhilePlaying(boolean arg1){
  }
  public int setMetadataFilter(java.util.Set<java.lang.Integer> arg1, java.util.Set<java.lang.Integer> arg2){
    return 0;
  }
  public android.graphics.Bitmap getFrameAt(int arg1) throws java.lang.IllegalStateException{
    return (android.graphics.Bitmap) null;
  }
  public void setAudioSessionId(int arg1) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException{
  }
  public void attachAuxEffect(int arg1){
  }
  public android.os.Parcel getParcelParameter(int arg1){
    return (android.os.Parcel) null;
  }
  public java.lang.String getStringParameter(int arg1){
    return (java.lang.String) null;
  }
  public void setAuxEffectSendLevel(float arg1){
  }
  public boolean enableTimedTextTrackIndex(int arg1){
    return false;
  }
  public boolean enableTimedText(){
    return false;
  }
  public boolean disableTimedText(){
    return false;
  }
  public static int native_pullBatteryData(android.os.Parcel arg1){
    return 0;
  }
  public void setOnTimedTextListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onTimedText") MediaPlayer.OnTimedTextListener arg1){
  }
}
