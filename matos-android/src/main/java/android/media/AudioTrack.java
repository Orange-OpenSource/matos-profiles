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
public class AudioTrack
{
  // Classes

  public static interface OnPlaybackPositionUpdateListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onPlayBack")
    public void onMarkerReached(AudioTrack arg1);
    @com.francetelecom.rd.stubs.annotation.CallBack("onPlayBack")
    public void onPeriodicNotification(AudioTrack arg1);
  }
  // Fields

  public static final int PLAYSTATE_STOPPED = 1;

  public static final int PLAYSTATE_PAUSED = 2;

  public static final int PLAYSTATE_PLAYING = 3;

  public static final int MODE_STATIC = 0;

  public static final int MODE_STREAM = 1;

  public static final int STATE_UNINITIALIZED = 0;

  public static final int STATE_INITIALIZED = 1;

  public static final int STATE_NO_STATIC_DATA = 2;

  public static final int SUCCESS = 0;

  public static final int ERROR = -1;

  public static final int ERROR_BAD_VALUE = -2;

  public static final int ERROR_INVALID_OPERATION = -3;

  // Constructors

  public AudioTrack(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) throws java.lang.IllegalArgumentException{
  }
  public AudioTrack(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) throws java.lang.IllegalArgumentException{
  }
  // Methods

  protected void finalize(){
  }
  public int write(byte [] arg1, int arg2, int arg3){
    return 0;
  }
  public int write(short [] arg1, int arg2, int arg3){
    return 0;
  }
  public int getState(){
    return 0;
  }
  public void stop() throws java.lang.IllegalStateException{
  }
  public void flush(){
  }
  public void release(){
  }
  protected void setState(int arg1){
  }
  public void pause() throws java.lang.IllegalStateException{
  }
  public void play() throws java.lang.IllegalStateException{
  }
  public int getSampleRate(){
    return 0;
  }
  public int getAudioFormat(){
    return 0;
  }
  public int getChannelConfiguration(){
    return 0;
  }
  public int getChannelCount(){
    return 0;
  }
  public int getNotificationMarkerPosition(){
    return 0;
  }
  public int getPositionNotificationPeriod(){
    return 0;
  }
  public static int getMinBufferSize(int arg1, int arg2, int arg3){
    return 0;
  }
  public int getAudioSessionId(){
    return 0;
  }
  public int setNotificationMarkerPosition(int arg1){
    return 0;
  }
  public int setPositionNotificationPeriod(int arg1){
    return 0;
  }
  public int attachAuxEffect(int arg1){
    return 0;
  }
  public int setAuxEffectSendLevel(float arg1){
    return 0;
  }
  public int getStreamType(){
    return 0;
  }
  public static float getMinVolume(){
    return 0.0f;
  }
  public static float getMaxVolume(){
    return 0.0f;
  }
  public int getPlaybackRate(){
    return 0;
  }
  public int getPlayState(){
    return 0;
  }
  protected int getNativeFrameCount(){
    return 0;
  }
  public int getPlaybackHeadPosition(){
    return 0;
  }
  public static int getNativeOutputSampleRate(int arg1){
    return 0;
  }
  public void setPlaybackPositionUpdateListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("android.media.AudioTrack.OnPlaybackPositionUpdateListener.onPlayBack") AudioTrack.OnPlaybackPositionUpdateListener arg1){
  }
  public void setPlaybackPositionUpdateListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("android.media.AudioTrack.OnPlaybackPositionUpdateListener.onPlayBack") AudioTrack.OnPlaybackPositionUpdateListener arg1, android.os.Handler arg2){
  }
  public int setStereoVolume(float arg1, float arg2){
    return 0;
  }
  public int setPlaybackRate(int arg1){
    return 0;
  }
  public int setPlaybackHeadPosition(int arg1){
    return 0;
  }
  public int setLoopPoints(int arg1, int arg2, int arg3){
    return 0;
  }
  public int reloadStaticData(){
    return 0;
  }
}
