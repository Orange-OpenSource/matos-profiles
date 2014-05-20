package android.filterfw.core;

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
public class GLFrame
  extends Frame{
  // Fields

  public static final int EXISTING_TEXTURE_BINDING = 100;

  public static final int EXISTING_FBO_BINDING = 101;

  public static final int NEW_TEXTURE_BINDING = 102;

  public static final int NEW_FBO_BINDING = 103;

  public static final int EXTERNAL_TEXTURE = 104;

  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  GLFrame(FrameFormat arg1, FrameManager arg2){
    super((FrameFormat) null, (FrameManager) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
 GLFrame(FrameFormat arg1, FrameManager arg2, int arg3, long arg4){
    super((FrameFormat) null, (FrameManager) null);
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  protected void reset(FrameFormat arg1){
  }
  public java.nio.ByteBuffer getData(){
    return (java.nio.ByteBuffer) null;
  }
  public void focus(){
  }
  public void setData(java.nio.ByteBuffer arg1, int arg2, int arg3){
  }
  public android.graphics.Bitmap getBitmap(){
    return (android.graphics.Bitmap) null;
  }
  public GLEnvironment getGLEnvironment(){
    return (GLEnvironment) null;
  }
  public void setBitmap(android.graphics.Bitmap arg1){
  }
  public void setViewport(int arg1, int arg2, int arg3, int arg4){
  }
  public void setViewport(android.graphics.Rect arg1){
  }
  public java.lang.Object getObjectValue(){
    return (java.lang.Object) null;
  }
  public void setDataFromFrame(Frame arg1){
  }
  protected synchronized boolean hasNativeAllocation(){
    return false;
  }
  protected synchronized void releaseNativeAllocation(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onFrameStore(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onFrameFetch(){
  }
  public int getTextureId(){
    return 0;
  }
  public void setInts(int [] arg1){
  }
  public int [] getInts(){
    return (int []) null;
  }
  public void generateMipMap(){
  }
  public void setTextureParameter(int arg1, int arg2){
  }
  public float [] getFloats(){
    return (float []) null;
  }
  public void setFloats(float [] arg1){
  }
  public int getFboId(){
    return 0;
  }
}
