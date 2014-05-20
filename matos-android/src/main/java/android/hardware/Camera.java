package android.hardware;

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
public class Camera
{
  // Classes

  public static class CameraInfo
  {
    // Fields

    public static final int CAMERA_FACING_BACK = 0;

    public static final int CAMERA_FACING_FRONT = 1;

    public int facing;

    public int orientation;

    // Constructors

    public CameraInfo(){
    }
  }
  public static interface PreviewCallback
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onPreview")
    public void onPreviewFrame(byte [] arg1, Camera arg2);
  }
  public static interface AutoFocusCallback
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onAutoFocus")
    public void onAutoFocus(boolean arg1, Camera arg2);
  }
  public static interface ShutterCallback
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onShutter")
    public void onShutter();
  }
  public static interface PictureCallback
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onPictureTaken")
    public void onPictureTaken(byte [] arg1, Camera arg2);
  }
  public static interface OnZoomChangeListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onZoomChange")
    public void onZoomChange(int arg1, boolean arg2, Camera arg3);
  }
  public static interface FaceDetectionListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onFaceDetection")
    public void onFaceDetection(Camera.Face [] arg1, Camera arg2);
  }
  public static class Face
  {
    // Fields

    public android.graphics.Rect rect;

    public int score;

    public int id;

    public android.graphics.Point leftEye;

    public android.graphics.Point rightEye;

    public android.graphics.Point mouth;

    // Constructors

    public Face(){
    }
  }
  public static interface ErrorCallback
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onError")
    public void onError(int arg1, Camera arg2);
  }
  public class Size
  {
    // Fields

    public int width;

    public int height;

    // Constructors

    public Size(int arg1, int arg2){
    }
    // Methods

    public boolean equals(java.lang.Object arg1){
      return false;
    }
    public int hashCode(){
      return 0;
    }
  }
  public static class Area
  {
    // Fields

    public android.graphics.Rect rect;

    public int weight;

    // Constructors

    public Area(android.graphics.Rect arg1, int arg2){
    }
    // Methods

    public boolean equals(java.lang.Object arg1){
      return false;
    }
  }
  public class Parameters
  {
    // Fields

    public static final java.lang.String WHITE_BALANCE_AUTO = "auto";

    public static final java.lang.String WHITE_BALANCE_INCANDESCENT = "incandescent";

    public static final java.lang.String WHITE_BALANCE_FLUORESCENT = "fluorescent";

    public static final java.lang.String WHITE_BALANCE_WARM_FLUORESCENT = "warm-fluorescent";

    public static final java.lang.String WHITE_BALANCE_DAYLIGHT = "daylight";

    public static final java.lang.String WHITE_BALANCE_CLOUDY_DAYLIGHT = "cloudy-daylight";

    public static final java.lang.String WHITE_BALANCE_TWILIGHT = "twilight";

    public static final java.lang.String WHITE_BALANCE_SHADE = "shade";

    public static final java.lang.String EFFECT_NONE = "none";

    public static final java.lang.String EFFECT_MONO = "mono";

    public static final java.lang.String EFFECT_NEGATIVE = "negative";

    public static final java.lang.String EFFECT_SOLARIZE = "solarize";

    public static final java.lang.String EFFECT_SEPIA = "sepia";

    public static final java.lang.String EFFECT_POSTERIZE = "posterize";

    public static final java.lang.String EFFECT_WHITEBOARD = "whiteboard";

    public static final java.lang.String EFFECT_BLACKBOARD = "blackboard";

    public static final java.lang.String EFFECT_AQUA = "aqua";

    public static final java.lang.String ANTIBANDING_AUTO = "auto";

    public static final java.lang.String ANTIBANDING_50HZ = "50hz";

    public static final java.lang.String ANTIBANDING_60HZ = "60hz";

    public static final java.lang.String ANTIBANDING_OFF = "off";

    public static final java.lang.String FLASH_MODE_OFF = "off";

    public static final java.lang.String FLASH_MODE_AUTO = "auto";

    public static final java.lang.String FLASH_MODE_ON = "on";

    public static final java.lang.String FLASH_MODE_RED_EYE = "red-eye";

    public static final java.lang.String FLASH_MODE_TORCH = "torch";

    public static final java.lang.String SCENE_MODE_AUTO = "auto";

    public static final java.lang.String SCENE_MODE_ACTION = "action";

    public static final java.lang.String SCENE_MODE_PORTRAIT = "portrait";

    public static final java.lang.String SCENE_MODE_LANDSCAPE = "landscape";

    public static final java.lang.String SCENE_MODE_NIGHT = "night";

    public static final java.lang.String SCENE_MODE_NIGHT_PORTRAIT = "night-portrait";

    public static final java.lang.String SCENE_MODE_THEATRE = "theatre";

    public static final java.lang.String SCENE_MODE_BEACH = "beach";

    public static final java.lang.String SCENE_MODE_SNOW = "snow";

    public static final java.lang.String SCENE_MODE_SUNSET = "sunset";

    public static final java.lang.String SCENE_MODE_STEADYPHOTO = "steadyphoto";

    public static final java.lang.String SCENE_MODE_FIREWORKS = "fireworks";

    public static final java.lang.String SCENE_MODE_SPORTS = "sports";

    public static final java.lang.String SCENE_MODE_PARTY = "party";

    public static final java.lang.String SCENE_MODE_CANDLELIGHT = "candlelight";

    public static final java.lang.String SCENE_MODE_BARCODE = "barcode";

    public static final java.lang.String FOCUS_MODE_AUTO = "auto";

    public static final java.lang.String FOCUS_MODE_INFINITY = "infinity";

    public static final java.lang.String FOCUS_MODE_MACRO = "macro";

    public static final java.lang.String FOCUS_MODE_FIXED = "fixed";

    public static final java.lang.String FOCUS_MODE_EDOF = "edof";

    public static final java.lang.String FOCUS_MODE_CONTINUOUS_VIDEO = "continuous-video";

    public static final java.lang.String FOCUS_MODE_CONTINUOUS_PICTURE = "continuous-picture";

    public static final int FOCUS_DISTANCE_NEAR_INDEX = 0;

    public static final int FOCUS_DISTANCE_OPTIMAL_INDEX = 1;

    public static final int FOCUS_DISTANCE_FAR_INDEX = 2;

    public static final int PREVIEW_FPS_MIN_INDEX = 0;

    public static final int PREVIEW_FPS_MAX_INDEX = 1;

    // Constructors

    private Parameters(){
    }
    // Methods

    public java.lang.String get(java.lang.String arg1){
      return (java.lang.String) null;
    }
    public int getInt(java.lang.String arg1){
      return 0;
    }
    public void remove(java.lang.String arg1){
    }
    public void set(java.lang.String arg1, java.lang.String arg2){
    }
    public void set(java.lang.String arg1, int arg2){
    }
    public void dump(){
    }
    public void setRotation(int arg1){
    }
    public void setZoom(int arg1){
    }
    public java.lang.String flatten(){
      return (java.lang.String) null;
    }
    public void unflatten(java.lang.String arg1){
    }
    public void setPreviewSize(int arg1, int arg2){
    }
    public Camera.Size getPreviewSize(){
      return (Camera.Size) null;
    }
    public java.util.List<Camera.Size> getSupportedPreviewSizes(){
      return (java.util.List) null;
    }
    public java.util.List<Camera.Size> getSupportedVideoSizes(){
      return (java.util.List) null;
    }
    public Camera.Size getPreferredPreviewSizeForVideo(){
      return (Camera.Size) null;
    }
    public void setJpegThumbnailSize(int arg1, int arg2){
    }
    public Camera.Size getJpegThumbnailSize(){
      return (Camera.Size) null;
    }
    public java.util.List<Camera.Size> getSupportedJpegThumbnailSizes(){
      return (java.util.List) null;
    }
    public void setJpegThumbnailQuality(int arg1){
    }
    public int getJpegThumbnailQuality(){
      return 0;
    }
    public void setJpegQuality(int arg1){
    }
    public int getJpegQuality(){
      return 0;
    }
    public void setPreviewFrameRate(int arg1){
    }
    public int getPreviewFrameRate(){
      return 0;
    }
    public java.util.List<java.lang.Integer> getSupportedPreviewFrameRates(){
      return (java.util.List) null;
    }
    public void setPreviewFpsRange(int arg1, int arg2){
    }
    public void getPreviewFpsRange(int [] arg1){
    }
    public java.util.List<int []> getSupportedPreviewFpsRange(){
      return (java.util.List) null;
    }
    public void setPreviewFormat(int arg1){
    }
    public int getPreviewFormat(){
      return 0;
    }
    public java.util.List<java.lang.Integer> getSupportedPreviewFormats(){
      return (java.util.List) null;
    }
    public void setPictureSize(int arg1, int arg2){
    }
    public Camera.Size getPictureSize(){
      return (Camera.Size) null;
    }
    public java.util.List<Camera.Size> getSupportedPictureSizes(){
      return (java.util.List) null;
    }
    public void setPictureFormat(int arg1){
    }
    public int getPictureFormat(){
      return 0;
    }
    public java.util.List<java.lang.Integer> getSupportedPictureFormats(){
      return (java.util.List) null;
    }
    public void setGpsLatitude(double arg1){
    }
    public void setGpsLongitude(double arg1){
    }
    public void setGpsAltitude(double arg1){
    }
    public void setGpsTimestamp(long arg1){
    }
    public void setGpsProcessingMethod(java.lang.String arg1){
    }
    public void removeGpsData(){
    }
    public java.lang.String getWhiteBalance(){
      return (java.lang.String) null;
    }
    public void setWhiteBalance(java.lang.String arg1){
    }
    public java.util.List<java.lang.String> getSupportedWhiteBalance(){
      return (java.util.List) null;
    }
    public java.lang.String getColorEffect(){
      return (java.lang.String) null;
    }
    public void setColorEffect(java.lang.String arg1){
    }
    public java.util.List<java.lang.String> getSupportedColorEffects(){
      return (java.util.List) null;
    }
    public java.lang.String getAntibanding(){
      return (java.lang.String) null;
    }
    public void setAntibanding(java.lang.String arg1){
    }
    public java.util.List<java.lang.String> getSupportedAntibanding(){
      return (java.util.List) null;
    }
    public java.lang.String getSceneMode(){
      return (java.lang.String) null;
    }
    public void setSceneMode(java.lang.String arg1){
    }
    public java.util.List<java.lang.String> getSupportedSceneModes(){
      return (java.util.List) null;
    }
    public java.lang.String getFlashMode(){
      return (java.lang.String) null;
    }
    public void setFlashMode(java.lang.String arg1){
    }
    public java.util.List<java.lang.String> getSupportedFlashModes(){
      return (java.util.List) null;
    }
    public java.lang.String getFocusMode(){
      return (java.lang.String) null;
    }
    public void setFocusMode(java.lang.String arg1){
    }
    public java.util.List<java.lang.String> getSupportedFocusModes(){
      return (java.util.List) null;
    }
    public float getFocalLength(){
      return 0.0f;
    }
    public float getHorizontalViewAngle(){
      return 0.0f;
    }
    public float getVerticalViewAngle(){
      return 0.0f;
    }
    public int getExposureCompensation(){
      return 0;
    }
    public void setExposureCompensation(int arg1){
    }
    public int getMaxExposureCompensation(){
      return 0;
    }
    public int getMinExposureCompensation(){
      return 0;
    }
    public float getExposureCompensationStep(){
      return 0.0f;
    }
    public void setAutoExposureLock(boolean arg1){
    }
    public boolean getAutoExposureLock(){
      return false;
    }
    public boolean isAutoExposureLockSupported(){
      return false;
    }
    public void setAutoWhiteBalanceLock(boolean arg1){
    }
    public boolean getAutoWhiteBalanceLock(){
      return false;
    }
    public boolean isAutoWhiteBalanceLockSupported(){
      return false;
    }
    public int getZoom(){
      return 0;
    }
    public boolean isZoomSupported(){
      return false;
    }
    public int getMaxZoom(){
      return 0;
    }
    public java.util.List<java.lang.Integer> getZoomRatios(){
      return (java.util.List) null;
    }
    public boolean isSmoothZoomSupported(){
      return false;
    }
    public void getFocusDistances(float [] arg1){
    }
    public int getMaxNumFocusAreas(){
      return 0;
    }
    public java.util.List<Camera.Area> getFocusAreas(){
      return (java.util.List) null;
    }
    public void setFocusAreas(java.util.List<Camera.Area> arg1){
    }
    public int getMaxNumMeteringAreas(){
      return 0;
    }
    public java.util.List<Camera.Area> getMeteringAreas(){
      return (java.util.List) null;
    }
    public void setMeteringAreas(java.util.List<Camera.Area> arg1){
    }
    public int getMaxNumDetectedFaces(){
      return 0;
    }
    public void setRecordingHint(boolean arg1){
    }
    public boolean isVideoSnapshotSupported(){
      return false;
    }
    public void setVideoStabilization(boolean arg1){
    }
    public boolean getVideoStabilization(){
      return false;
    }
    public boolean isVideoStabilizationSupported(){
      return false;
    }
  }
  // Fields

  public static final java.lang.String ACTION_NEW_PICTURE = "android.hardware.action.NEW_PICTURE";

  public static final java.lang.String ACTION_NEW_VIDEO = "android.hardware.action.NEW_VIDEO";

  public static final int CAMERA_ERROR_UNKNOWN = 1;

  public static final int CAMERA_ERROR_SERVER_DIED = 100;

  // Constructors

  Camera(int arg1){
  }
  // Methods

  protected void finalize(){
  }
  public final void lock(){
  }
  public final void release(){
  }
  public static Camera open(int arg1){
    return (Camera) null;
  }
  public static Camera open(){
    return (Camera) null;
  }
  public final void unlock(){
  }
  public Camera.Parameters getParameters(){
    return (Camera.Parameters) null;
  }
  public final void reconnect() throws java.io.IOException{
  }
  public void setParameters(Camera.Parameters arg1){
  }
  public final void setDisplayOrientation(int arg1){
  }
  public final void setErrorCallback(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onError") Camera.ErrorCallback arg1){
  }
  public final void setPreviewDisplay(android.view.SurfaceHolder arg1) throws java.io.IOException{
  }
  public static int getNumberOfCameras(){
    return 0;
  }
  public static void getCameraInfo(int arg1, Camera.CameraInfo arg2){
  }
  public final void setPreviewTexture(android.graphics.SurfaceTexture arg1) throws java.io.IOException{
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "Camera.startPreview", report = "-")
  public final void startPreview(){
  }
  public final void stopPreview(){
  }
  public final boolean previewEnabled(){
    return false;
  }
  public final void setPreviewCallback(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onPreview") Camera.PreviewCallback arg1){
  }
  public final void setOneShotPreviewCallback(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onPreview") Camera.PreviewCallback arg1){
  }
  public final void setPreviewCallbackWithBuffer(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onPreview") Camera.PreviewCallback arg1){
  }
  public final void addCallbackBuffer(byte [] arg1){
  }
  public final void addRawImageCallbackBuffer(byte [] arg1){
  }
  public final void autoFocus(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onAutoFocus") Camera.AutoFocusCallback arg1){
  }
  public final void cancelAutoFocus(){
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "Camera.takePicture-1", report = "-")
  public final void takePicture(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onShutter") Camera.ShutterCallback arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("onPictureTaken") Camera.PictureCallback arg2, @com.francetelecom.rd.stubs.annotation.CallBackRegister("onPictureTaken") Camera.PictureCallback arg3){
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "Camera.takePicture-2", report = "-")
  public final void takePicture(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onShutter") Camera.ShutterCallback arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("onPictureTaken") Camera.PictureCallback arg2, @com.francetelecom.rd.stubs.annotation.CallBackRegister("onPictureTaken") Camera.PictureCallback arg3, @com.francetelecom.rd.stubs.annotation.CallBackRegister("onPictureTaken") Camera.PictureCallback arg4){
  }
  public final void startSmoothZoom(int arg1){
  }
  public final void stopSmoothZoom(){
  }
  public final void setZoomChangeListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onZoomChange") Camera.OnZoomChangeListener arg1){
  }
  public final void setFaceDetectionListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onFaceDetection") Camera.FaceDetectionListener arg1){
  }
  public final void startFaceDetection(){
  }
  public final void stopFaceDetection(){
  }
}
