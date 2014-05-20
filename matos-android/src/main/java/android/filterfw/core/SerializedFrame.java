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
public class SerializedFrame
  extends Frame{
  // Constructors

  SerializedFrame(FrameFormat arg1, FrameManager arg2){
    super((FrameFormat) null, (FrameManager) null);
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("data")
  public java.nio.ByteBuffer getData(){
    return (java.nio.ByteBuffer) null;
  }
  public void setData(@com.francetelecom.rd.stubs.annotation.FieldSet("data") java.nio.ByteBuffer arg1, int arg2, int arg3){
  }
  public android.graphics.Bitmap getBitmap(){
    return (android.graphics.Bitmap) null;
  }
  public void setBitmap(android.graphics.Bitmap arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("objectValue")
  public java.lang.Object getObjectValue(){
    return (java.lang.Object) null;
  }
  protected boolean hasNativeAllocation(){
    return false;
  }
  protected void releaseNativeAllocation(){
  }
  public void setInts(int [] arg1){
  }
  public int [] getInts(){
    return (int []) null;
  }
  public float [] getFloats(){
    return (float []) null;
  }
  public void setFloats(float [] arg1){
  }
  protected void setGenericObjectValue(@com.francetelecom.rd.stubs.annotation.FieldSet("objectValue") java.lang.Object arg1){
  }
}
