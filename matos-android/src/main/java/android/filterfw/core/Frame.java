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


public abstract class Frame
{
  // Fields

  public static final int NO_BINDING = 0;

  public static final long TIMESTAMP_NOT_SET = -2l;

  public static final long TIMESTAMP_UNKNOWN = -1l;

  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  Frame(FrameFormat arg1, FrameManager arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  Frame(FrameFormat arg1, FrameManager arg2, int arg3, long arg4){
  }
  // Methods

  public boolean isReadOnly(){
    return false;
  }
  protected void reset(FrameFormat arg1){
  }
  public void setTimestamp(long arg1){
  }
  public Frame release(){
    return (Frame) null;
  }
  public long getTimestamp(){
    return 0l;
  }
  public abstract java.nio.ByteBuffer getData();
  public FrameFormat getFormat(){
    return (FrameFormat) null;
  }
  public abstract void setData(java.nio.ByteBuffer arg1, int arg2, int arg3);
  public void setData(java.nio.ByteBuffer arg1){
  }
  public void setData(byte [] arg1, int arg2, int arg3){
  }
  public abstract android.graphics.Bitmap getBitmap();
  public FrameManager getFrameManager(){
    return (FrameManager) null;
  }
  protected void setFormat(FrameFormat arg1){
  }
  public abstract void setBitmap(android.graphics.Bitmap arg1);
  public Frame retain(){
    return (Frame) null;
  }
  public abstract java.lang.Object getObjectValue();
  public void setDataFromFrame(Frame arg1){
  }
  protected abstract boolean hasNativeAllocation();
  protected abstract void releaseNativeAllocation();
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onFrameStore(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onFrameFetch(){
  }
  public abstract void setInts(int [] arg1);
  public abstract int [] getInts();
  public abstract float [] getFloats();
  public abstract void setFloats(float [] arg1);
  public void setObjectValue(java.lang.Object arg1){
  }
  public int getCapacity(){
    return 0;
  }
  public int getBindingType(){
    return 0;
  }
  public long getBindingId(){
    return 0l;
  }
  protected void setReusable(boolean arg1){
  }
  protected void assertFrameMutable(){
  }
  protected static android.graphics.Bitmap convertBitmapToRGBA(android.graphics.Bitmap arg1){
    return (android.graphics.Bitmap) null;
  }
  protected boolean requestResize(int [] arg1){
    return false;
  }
  public int getRefCount(){
    return 0;
  }
  protected void setGenericObjectValue(java.lang.Object arg1){
  }
}
