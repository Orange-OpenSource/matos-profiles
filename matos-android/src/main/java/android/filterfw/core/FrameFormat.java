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


public class FrameFormat
{
  // Fields

  public static final int TYPE_UNSPECIFIED = 0;

  public static final int TYPE_BIT = 1;

  public static final int TYPE_BYTE = 2;

  public static final int TYPE_INT16 = 3;

  public static final int TYPE_INT32 = 4;

  public static final int TYPE_FLOAT = 5;

  public static final int TYPE_DOUBLE = 6;

  public static final int TYPE_POINTER = 7;

  public static final int TYPE_OBJECT = 8;

  public static final int TARGET_UNSPECIFIED = 0;

  public static final int TARGET_SIMPLE = 1;

  public static final int TARGET_NATIVE = 2;

  public static final int TARGET_GPU = 3;

  public static final int TARGET_VERTEXBUFFER = 4;

  public static final int TARGET_RS = 5;

  public static final int SIZE_UNSPECIFIED = 0;

  public static final int BYTES_PER_SAMPLE_UNSPECIFIED = 1;

  protected static final int SIZE_UNKNOWN = 0;

  protected int mBaseType;

  protected int mBytesPerSample;

  protected int mSize;

  protected int mTarget;

  protected int [] mDimensions;

  protected KeyValueMap mMetaData;

  protected java.lang.Class mObjectClass;

  // Constructors

  protected FrameFormat(){
  }
  public FrameFormat(int arg1, int arg2){
  }
  // Methods

  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public int hashCode(){
    return 0;
  }
  public int getLength(){
    return 0;
  }
  public int getSize(){
    return 0;
  }
  public boolean isCompatibleWith(FrameFormat arg1){
    return false;
  }
  public int getTarget(){
    return 0;
  }
  public int getWidth(){
    return 0;
  }
  public int getHeight(){
    return 0;
  }
  public int getDepth(){
    return 0;
  }
  public int getDimension(int arg1){
    return 0;
  }
  public int getBaseType(){
    return 0;
  }
  public java.lang.Class getObjectClass(){
    return (java.lang.Class) null;
  }
  public MutableFrameFormat mutableCopy(){
    return (MutableFrameFormat) null;
  }
  public int getBytesPerSample(){
    return 0;
  }
  public static java.lang.String targetToString(int arg1){
    return (java.lang.String) null;
  }
  public static int readTargetString(java.lang.String arg1){
    return 0;
  }
  public static FrameFormat unspecified(){
    return (FrameFormat) null;
  }
  public boolean isBinaryDataType(){
    return false;
  }
  public int getValuesPerSample(){
    return 0;
  }
  public int [] getDimensions(){
    return (int []) null;
  }
  public int getDimensionCount(){
    return 0;
  }
  public boolean hasMetaKey(java.lang.String arg1){
    return false;
  }
  public boolean hasMetaKey(java.lang.String arg1, java.lang.Class arg2){
    return false;
  }
  public java.lang.Object getMetaValue(java.lang.String arg1){
    return (java.lang.Object) null;
  }
  public int getNumberOfDimensions(){
    return 0;
  }
  public boolean mayBeCompatibleWith(FrameFormat arg1){
    return false;
  }
  public static int bytesPerSampleOf(int arg1){
    return 0;
  }
  public static java.lang.String dimensionsToString(int [] arg1){
    return (java.lang.String) null;
  }
  public static java.lang.String baseTypeToString(int arg1){
    return (java.lang.String) null;
  }
  public static java.lang.String metaDataToString(KeyValueMap arg1){
    return (java.lang.String) null;
  }
}
