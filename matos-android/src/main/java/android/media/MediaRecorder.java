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
public class MediaRecorder
{
  // Classes

  public final class AudioSource
  {
    // Fields

    public static final int DEFAULT = 0;

    public static final int MIC = 1;

    public static final int VOICE_UPLINK = 2;

    public static final int VOICE_DOWNLINK = 3;

    public static final int VOICE_CALL = 4;

    public static final int CAMCORDER = 5;

    public static final int VOICE_RECOGNITION = 6;

    public static final int VOICE_COMMUNICATION = 7;

    // Constructors

    private AudioSource(){
    }
  }
  public final class VideoSource
  {
    // Fields

    public static final int DEFAULT = 0;

    public static final int CAMERA = 1;

    public static final int GRALLOC_BUFFER = 2;

    // Constructors

    private VideoSource(){
    }
  }
  public final class OutputFormat
  {
    // Fields

    public static final int DEFAULT = 0;

    public static final int THREE_GPP = 1;

    public static final int MPEG_4 = 2;

    public static final int RAW_AMR = 3;

    public static final int AMR_NB = 3;

    public static final int AMR_WB = 4;

    public static final int AAC_ADIF = 5;

    public static final int AAC_ADTS = 6;

    public static final int OUTPUT_FORMAT_RTP_AVP = 7;

    public static final int OUTPUT_FORMAT_MPEG2TS = 8;

    // Constructors

    private OutputFormat(){
    }
  }
  public final class AudioEncoder
  {
    // Fields

    public static final int DEFAULT = 0;

    public static final int AMR_NB = 1;

    public static final int AMR_WB = 2;

    public static final int AAC = 3;

    public static final int AAC_PLUS = 4;

    public static final int EAAC_PLUS = 5;

    // Constructors

    private AudioEncoder(){
    }
  }
  public final class VideoEncoder
  {
    // Fields

    public static final int DEFAULT = 0;

    public static final int H263 = 1;

    public static final int H264 = 2;

    public static final int MPEG_4_SP = 3;

    // Constructors

    private VideoEncoder(){
    }
  }
  public static interface OnErrorListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onError")
    public void onError(MediaRecorder arg1, int arg2, int arg3);
  }
  public static interface OnInfoListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onInfo")
    public void onInfo(MediaRecorder arg1, int arg2, int arg3);
  }
  // Fields

  public static final int MEDIA_RECORDER_ERROR_UNKNOWN = 1;

  public static final int MEDIA_RECORDER_INFO_UNKNOWN = 1;

  public static final int MEDIA_RECORDER_INFO_MAX_DURATION_REACHED = 800;

  public static final int MEDIA_RECORDER_INFO_MAX_FILESIZE_REACHED = 801;

  public static final int MEDIA_RECORDER_TRACK_INFO_LIST_START = 1000;

  public static final int MEDIA_RECORDER_TRACK_INFO_COMPLETION_STATUS = 1000;

  public static final int MEDIA_RECORDER_TRACK_INFO_PROGRESS_IN_TIME = 1001;

  public static final int MEDIA_RECORDER_TRACK_INFO_TYPE = 1002;

  public static final int MEDIA_RECORDER_TRACK_INFO_DURATION_MS = 1003;

  public static final int MEDIA_RECORDER_TRACK_INFO_MAX_CHUNK_DUR_MS = 1004;

  public static final int MEDIA_RECORDER_TRACK_INFO_ENCODED_FRAMES = 1005;

  public static final int MEDIA_RECORDER_TRACK_INTER_CHUNK_TIME_MS = 1006;

  public static final int MEDIA_RECORDER_TRACK_INFO_INITIAL_DELAY_MS = 1007;

  public static final int MEDIA_RECORDER_TRACK_INFO_START_OFFSET_MS = 1008;

  public static final int MEDIA_RECORDER_TRACK_INFO_DATA_KBYTES = 1009;

  public static final int MEDIA_RECORDER_TRACK_INFO_LIST_END = 2000;

  // Constructors

  public MediaRecorder(){
  }
  // Methods

  protected void finalize(){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "MediaRecorder.start", pos = 0, report = "-")
  public void start() throws java.lang.IllegalStateException{
  }
  public void stop() throws java.lang.IllegalStateException{
  }
  public void reset(){
  }
  public void release(){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "MediaRecorder.prepare", pos = 0, report = "-")
  public void prepare() throws java.lang.IllegalStateException, java.io.IOException{
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "MediaRecorder.setOutputFormat", pos = {0, 1}, report = "-")
  public void setOutputFormat(int arg1) throws java.lang.IllegalStateException{
  }
  public void setOnErrorListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("android.media.MediaRecorder.OnErrorListener.onError") MediaRecorder.OnErrorListener arg1){
  }
  public void setOnInfoListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("android.media.MediaRecorder.OnInfoListener.onInfo") MediaRecorder.OnInfoListener arg1){
  }
  public void setLocation(float arg1, float arg2){
  }
  public static final int getAudioSourceMax(){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "MediaRecorder.setVideoSource", pos = {0, 1}, report = "-")
  public void setVideoSource(int arg1) throws java.lang.IllegalStateException{
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "MediaRecorder.setAudioSource", pos = {0, 1}, report = "-")
  public void setAudioSource(int arg1) throws java.lang.IllegalStateException{
  }
  public void setProfile(CamcorderProfile arg1){
  }
  public void setVideoEncoder(int arg1) throws java.lang.IllegalStateException{
  }
  public void setVideoSize(int arg1, int arg2) throws java.lang.IllegalStateException{
  }
  public void setVideoFrameRate(int arg1) throws java.lang.IllegalStateException{
  }
  public void setOrientationHint(int arg1){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "MediaRecorder.setOutputFile-1", pos = {0, 1}, report = "-")
  public void setOutputFile(java.io.FileDescriptor arg1) throws java.lang.IllegalStateException{
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "MediaRecorder.setOutputFile-2", pos = {0, 1}, report = "-")
  public void setOutputFile(java.lang.String arg1) throws java.lang.IllegalStateException{
  }
  public void setMaxFileSize(long arg1) throws java.lang.IllegalArgumentException{
  }
  public void setMaxDuration(int arg1) throws java.lang.IllegalArgumentException{
  }
  public void setCamera(android.hardware.Camera arg1){
  }
  public void setPreviewDisplay(android.view.Surface arg1){
  }
  public void setCaptureRate(double arg1){
  }
  public void setAudioEncoder(int arg1) throws java.lang.IllegalStateException{
  }
  public void setAudioSamplingRate(int arg1){
  }
  public void setAudioChannels(int arg1){
  }
  public void setAudioEncodingBitRate(int arg1){
  }
  public void setVideoEncodingBitRate(int arg1){
  }
  public void setAuxiliaryOutputFile(java.io.FileDescriptor arg1){
  }
  public void setAuxiliaryOutputFile(java.lang.String arg1){
  }
  public int getMaxAmplitude() throws java.lang.IllegalStateException{
    return 0;
  }
}
