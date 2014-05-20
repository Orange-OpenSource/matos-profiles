package android.graphics;

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
public class Matrix
{
  // Classes

  public static enum ScaleToFit
  {
    // Enum Constants

    FILL(0)
, START(0)
, CENTER(0)
, END(0)
;
    // Fields

    // Constructors

    private ScaleToFit(int arg1){
    }
    // Methods

  }
  // Fields

  public static final int MSCALE_X = 0;

  public static final int MSKEW_X = 1;

  public static final int MTRANS_X = 2;

  public static final int MSKEW_Y = 3;

  public static final int MSCALE_Y = 4;

  public static final int MTRANS_Y = 5;

  public static final int MPERSP_0 = 6;

  public static final int MPERSP_1 = 7;

  public static final int MPERSP_2 = 8;

  public static Matrix IDENTITY_MATRIX;

  public int native_instance;

  // Constructors

  public Matrix(){
  }
  public Matrix(Matrix arg1){
  }
  // Methods

  protected void finalize() throws java.lang.Throwable{
  }
  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public void set(Matrix arg1){
  }
  public void reset(){
  }
  public java.lang.String toShortString(){
    return (java.lang.String) null;
  }
  public void toShortString(java.lang.StringBuilder arg1){
  }
  public void printShortString(java.io.PrintWriter arg1){
  }
  public void getValues(float [] arg1){
  }
  public void setValues(float [] arg1){
  }
  public boolean isIdentity(){
    return false;
  }
  public void mapPoints(float [] arg1, int arg2, float [] arg3, int arg4, int arg5){
  }
  public void mapPoints(float [] arg1, float [] arg2){
  }
  public void mapPoints(float [] arg1){
  }
  public boolean mapRect(RectF arg1, RectF arg2){
    return false;
  }
  public boolean mapRect(RectF arg1){
    return false;
  }
  public void setTranslate(float arg1, float arg2){
  }
  public boolean preRotate(float arg1, float arg2, float arg3){
    return false;
  }
  public boolean preRotate(float arg1){
    return false;
  }
  public boolean preScale(float arg1, float arg2, float arg3, float arg4){
    return false;
  }
  public boolean preScale(float arg1, float arg2){
    return false;
  }
  public boolean preTranslate(float arg1, float arg2){
    return false;
  }
  public boolean postTranslate(float arg1, float arg2){
    return false;
  }
  public boolean postConcat(Matrix arg1){
    return false;
  }
  public boolean invert(Matrix arg1){
    return false;
  }
  public void setScale(float arg1, float arg2, float arg3, float arg4){
  }
  public void setScale(float arg1, float arg2){
  }
  public boolean postRotate(float arg1, float arg2, float arg3){
    return false;
  }
  public boolean postRotate(float arg1){
    return false;
  }
  public void setRotate(float arg1, float arg2, float arg3){
  }
  public void setRotate(float arg1){
  }
  public boolean setConcat(Matrix arg1, Matrix arg2){
    return false;
  }
  public boolean rectStaysRect(){
    return false;
  }
  public void setSinCos(float arg1, float arg2, float arg3, float arg4){
  }
  public void setSinCos(float arg1, float arg2){
  }
  public void setSkew(float arg1, float arg2, float arg3, float arg4){
  }
  public void setSkew(float arg1, float arg2){
  }
  public boolean preSkew(float arg1, float arg2, float arg3, float arg4){
    return false;
  }
  public boolean preSkew(float arg1, float arg2){
    return false;
  }
  public boolean preConcat(Matrix arg1){
    return false;
  }
  public boolean postScale(float arg1, float arg2, float arg3, float arg4){
    return false;
  }
  public boolean postScale(float arg1, float arg2){
    return false;
  }
  public boolean postSkew(float arg1, float arg2, float arg3, float arg4){
    return false;
  }
  public boolean postSkew(float arg1, float arg2){
    return false;
  }
  public boolean setRectToRect(RectF arg1, RectF arg2, Matrix.ScaleToFit arg3){
    return false;
  }
  public boolean setPolyToPoly(float [] arg1, int arg2, float [] arg3, int arg4, int arg5){
    return false;
  }
  public void mapVectors(float [] arg1, int arg2, float [] arg3, int arg4, int arg5){
  }
  public void mapVectors(float [] arg1, float [] arg2){
  }
  public void mapVectors(float [] arg1){
  }
  public float mapRadius(float arg1){
    return 0.0f;
  }
}
