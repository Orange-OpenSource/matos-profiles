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
public class Path
{
  // Classes

  public static enum FillType
  {
    // Enum Constants

    WINDING(0)
, EVEN_ODD(0)
, INVERSE_WINDING(0)
, INVERSE_EVEN_ODD(0)
;
    // Fields

    // Constructors

    private FillType(int arg1){
    }
    // Methods

  }
  public static enum Direction
  {
    // Enum Constants

    CW(0)
, CCW(0)
;
    // Fields

    // Constructors

    private Direction(int arg1){
    }
    // Methods

  }
  // Fields

  public final int mNativePath = 0;

  public boolean isSimplePath;

  public Region rects;

  // Constructors

  public Path(){
  }
  public Path(Path arg1){
  }
  // Methods

  protected void finalize() throws java.lang.Throwable{
  }
  public boolean isEmpty(){
    return false;
  }
  public void offset(float arg1, float arg2, Path arg3){
  }
  public void offset(float arg1, float arg2){
  }
  public void transform(Matrix arg1, Path arg2){
  }
  public void transform(Matrix arg1){
  }
  public void close(){
  }
  public void set(Path arg1){
  }
  public void reset(){
  }
  public void rewind(){
  }
  public boolean isRect(RectF arg1){
    return false;
  }
  public void computeBounds(RectF arg1, boolean arg2){
  }
  public void moveTo(float arg1, float arg2){
  }
  public void addPath(Path arg1, float arg2, float arg3){
  }
  public void addPath(Path arg1){
  }
  public void addPath(Path arg1, Matrix arg2){
  }
  public void addCircle(float arg1, float arg2, float arg3, Path.Direction arg4){
  }
  public void lineTo(float arg1, float arg2){
  }
  public void addRoundRect(RectF arg1, float arg2, float arg3, Path.Direction arg4){
  }
  public void addRoundRect(RectF arg1, float [] arg2, Path.Direction arg3){
  }
  public void addRect(RectF arg1, Path.Direction arg2){
  }
  public void addRect(float arg1, float arg2, float arg3, float arg4, Path.Direction arg5){
  }
  public void quadTo(float arg1, float arg2, float arg3, float arg4){
  }
  public void setFillType(Path.FillType arg1){
  }
  public void arcTo(RectF arg1, float arg2, float arg3, boolean arg4){
  }
  public void arcTo(RectF arg1, float arg2, float arg3){
  }
  public void addOval(RectF arg1, Path.Direction arg2){
  }
  public Path.FillType getFillType(){
    return (Path.FillType) null;
  }
  public boolean isInverseFillType(){
    return false;
  }
  public void toggleInverseFillType(){
  }
  public void incReserve(int arg1){
  }
  public void rMoveTo(float arg1, float arg2){
  }
  public void rLineTo(float arg1, float arg2){
  }
  public void rQuadTo(float arg1, float arg2, float arg3, float arg4){
  }
  public void cubicTo(float arg1, float arg2, float arg3, float arg4, float arg5, float arg6){
  }
  public void rCubicTo(float arg1, float arg2, float arg3, float arg4, float arg5, float arg6){
  }
  public void addArc(RectF arg1, float arg2, float arg3){
  }
  public void setLastPoint(float arg1, float arg2){
  }
}
