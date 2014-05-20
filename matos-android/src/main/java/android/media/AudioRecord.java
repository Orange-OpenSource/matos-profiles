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
public class AudioRecord
{
  // Classes

  public static interface OnRecordPositionUpdateListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onRecord")
    public void onMarkerReached(AudioRecord arg1);
    @com.francetelecom.rd.stubs.annotation.CallBack("onRecord")
    public void onPeriodicNotification(AudioRecord arg1);
  }
  // Fields

  public static final int STATE_UNINITIALIZED = 0;

  public static final int STATE_INITIALIZED = 1;

  public static final int RECORDSTATE_STOPPED = 1;

  public static final int RECORDSTATE_RECORDING = 3;

  public static final int SUCCESS = 0;

  public static final int ERROR = -1;

  public static final int ERROR_BAD_VALUE = -2;

  public static final int ERROR_INVALID_OPERATION = -3;

  // Constructors

  public AudioRecord(int arg1, int arg2, int arg3, int arg4, int arg5) throws java.lang.IllegalArgumentException{
  }
  // Methods

  protected void finalize(){
  }
  public int getState(){
    return 0;
  }
  public void stop() throws java.lang.IllegalStateException{
  }
  public int read(byte [] arg1, int arg2, int arg3){
    return 0;
  }
  public int read(short [] arg1, int arg2, int arg3){
    return 0;
  }
  public int read(java.nio.ByteBuffer arg1, int arg2){
    return 0;
  }
  public void release(){
  }
  public int getSampleRate(){
    return 0;
  }
  public int getAudioSource(){
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
  public int getRecordingState(){
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
  public void startRecording() throws java.lang.IllegalStateException{
  }
  public void setRecordPositionUpdateListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("android.media.AudioRecord.OnRecordPositionUpdateListener.onRecord") AudioRecord.OnRecordPositionUpdateListener arg1){
  }
  public void setRecordPositionUpdateListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("android.media.AudioRecord.OnRecordPositionUpdateListener.onRecord") AudioRecord.OnRecordPositionUpdateListener arg1, android.os.Handler arg2){
  }
  public int setNotificationMarkerPosition(int arg1){
    return 0;
  }
  public int setPositionNotificationPeriod(int arg1){
    return 0;
  }
}
