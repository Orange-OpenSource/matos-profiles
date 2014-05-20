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
public class Surface
  implements android.os.Parcelable
{
  // Classes

  public static class OutOfResourcesException
    extends java.lang.Exception  {
    // Constructors

    public OutOfResourcesException(){
      super();
    }
    public OutOfResourcesException(java.lang.String arg1){
      super();
    }
  }
  // Fields

  public static final int ROTATION_0 = 0;

  public static final int ROTATION_90 = 1;

  public static final int ROTATION_180 = 2;

  public static final int ROTATION_270 = 3;

  public static final int HIDDEN = 4;

  public static final int SECURE = 128;

  public static final int NON_PREMULTIPLIED = 256;

  public static final int OPAQUE = 1024;

  public static final int PROTECTED_APP = 2048;

  public static final int FX_SURFACE_NORMAL = 0;

  public static final int FX_SURFACE_BLUR = 65536;

  public static final int FX_SURFACE_DIM = 131072;

  public static final int FX_SURFACE_SCREENSHOT = 196608;

  public static final int FX_SURFACE_MASK = 983040;

  public static final int SURFACE_HIDDEN = 1;

  public static final int SURFACE_FROZEN = 2;

  public static final int SURFACE_DITHER = 4;

  public static final android.os.Parcelable.Creator<Surface> CREATOR = null;

  // Constructors

  public Surface(android.graphics.SurfaceTexture arg1){
  }
  public Surface(SurfaceSession arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) throws Surface.OutOfResourcesException{
  }
  public Surface(SurfaceSession arg1, int arg2, java.lang.String arg3, int arg4, int arg5, int arg6, int arg7, int arg8) throws Surface.OutOfResourcesException{
  }
  public Surface(){
  }
  private Surface(android.os.Parcel arg1) throws Surface.OutOfResourcesException{
  }
  // Methods

  protected void finalize() throws java.lang.Throwable{
  }
  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public void destroy(){
  }
  public void setSize(int arg1, int arg2){
  }
  public void release(){
  }
  public boolean isValid(){
    return false;
  }
  public void writeToParcel(android.os.Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
  public void show(){
  }
  public void hide(){
  }
  public void setAlpha(float arg1){
  }
  public void readFromParcel(android.os.Parcel arg1){
  }
  public void setFlags(int arg1, int arg2){
  }
  public android.graphics.Canvas lockCanvas(android.graphics.Rect arg1) throws Surface.OutOfResourcesException, java.lang.IllegalArgumentException{
    return (android.graphics.Canvas) null;
  }
  public void unlockCanvasAndPost(android.graphics.Canvas arg1){
  }
  public static void setOrientation(int arg1, int arg2, int arg3){
  }
  public static void setOrientation(int arg1, int arg2){
  }
  public void copyFrom(Surface arg1){
  }
  public static void openTransaction(){
  }
  public void setMatrix(float arg1, float arg2, float arg3, float arg4){
  }
  public void setPosition(int arg1, int arg2){
  }
  public void setPosition(float arg1, float arg2){
  }
  public void setLayer(int arg1){
  }
  public static void closeTransaction(){
  }
  public int getGenerationId(){
    return 0;
  }
  public void unlockCanvas(android.graphics.Canvas arg1){
  }
  public static void freezeDisplay(int arg1){
  }
  public static void unfreezeDisplay(int arg1){
  }
  public static android.graphics.Bitmap screenshot(int arg1, int arg2){
    return (android.graphics.Bitmap) null;
  }
  public static android.graphics.Bitmap screenshot(int arg1, int arg2, int arg3, int arg4){
    return (android.graphics.Bitmap) null;
  }
  public void setTransparentRegionHint(android.graphics.Region arg1){
  }
  public void freeze(){
  }
  public void unfreeze(){
  }
  public void setFreezeTint(int arg1){
  }
}
