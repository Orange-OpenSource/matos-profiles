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
public class Canvas
{
  // Classes

  public static enum EdgeType
  {
    // Enum Constants

    BW(0)
, AA(0)
;
    // Fields

    public final int nativeInt = 0;

    // Constructors

    private EdgeType(int arg1){
    }
    // Methods

  }
  public static enum VertexMode
  {
    // Enum Constants

    TRIANGLES(0)
, TRIANGLE_STRIP(0)
, TRIANGLE_FAN(0)
;
    // Fields

    public final int nativeInt = 0;

    // Constructors

    private VertexMode(int arg1){
    }
    // Methods

  }
  // Fields

  protected int mDensity;

  protected int mScreenDensity;

  public static final int DIRECTION_LTR = 0;

  public static final int DIRECTION_RTL = 1;

  public static final int MATRIX_SAVE_FLAG = 1;

  public static final int CLIP_SAVE_FLAG = 2;

  public static final int HAS_ALPHA_LAYER_SAVE_FLAG = 4;

  public static final int FULL_COLOR_LAYER_SAVE_FLAG = 8;

  public static final int CLIP_TO_LAYER_SAVE_FLAG = 16;

  public static final int ALL_SAVE_FLAG = 31;

  // Constructors

  public Canvas(){
  }
  public Canvas(Bitmap arg1){
  }
  Canvas(int arg1){
  }
  // Methods

  public void concat(Matrix arg1){
  }
  public int save(){
    return 0;
  }
  public int save(int arg1){
    return 0;
  }
  public void rotate(float arg1){
  }
  public final void rotate(float arg1, float arg2, float arg3){
  }
  public void scale(float arg1, float arg2){
  }
  public final void scale(float arg1, float arg2, float arg3, float arg4){
  }
  public boolean isOpaque(){
    return false;
  }
  protected static void checkRange(int arg1, int arg2, int arg3){
  }
  public int getWidth(){
    return 0;
  }
  public boolean isHardwareAccelerated(){
    return false;
  }
  public int getHeight(){
    return 0;
  }
  public void getMatrix(Matrix arg1){
  }
  public final Matrix getMatrix(){
    return (Matrix) null;
  }
  public void restore(){
  }
  public boolean quickReject(RectF arg1, Canvas.EdgeType arg2){
    return false;
  }
  public boolean quickReject(Path arg1, Canvas.EdgeType arg2){
    return false;
  }
  public boolean quickReject(float arg1, float arg2, float arg3, float arg4, Canvas.EdgeType arg5){
    return false;
  }
  public void translate(float arg1, float arg2){
  }
  public void setBitmap(Bitmap arg1){
  }
  public boolean clipRect(RectF arg1, Region.Op arg2){
    return false;
  }
  public boolean clipRect(Rect arg1, Region.Op arg2){
    return false;
  }
  public boolean clipRect(RectF arg1){
    return false;
  }
  public boolean clipRect(Rect arg1){
    return false;
  }
  public boolean clipRect(float arg1, float arg2, float arg3, float arg4, Region.Op arg5){
    return false;
  }
  public boolean clipRect(float arg1, float arg2, float arg3, float arg4){
    return false;
  }
  public boolean clipRect(int arg1, int arg2, int arg3, int arg4){
    return false;
  }
  public void restoreToCount(int arg1){
  }
  public int saveLayerAlpha(RectF arg1, int arg2, int arg3){
    return 0;
  }
  public int saveLayerAlpha(float arg1, float arg2, float arg3, float arg4, int arg5, int arg6){
    return 0;
  }
  public int saveLayer(RectF arg1, Paint arg2, int arg3){
    return 0;
  }
  public int saveLayer(float arg1, float arg2, float arg3, float arg4, Paint arg5, int arg6){
    return 0;
  }
  public void drawBitmap(Bitmap arg1, float arg2, float arg3, Paint arg4){
  }
  public void drawBitmap(Bitmap arg1, Rect arg2, RectF arg3, Paint arg4){
  }
  public void drawBitmap(Bitmap arg1, Rect arg2, Rect arg3, Paint arg4){
  }
  public void drawBitmap(int [] arg1, int arg2, int arg3, float arg4, float arg5, int arg6, int arg7, boolean arg8, Paint arg9){
  }
  public void drawBitmap(int [] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, Paint arg9){
  }
  public void drawBitmap(Bitmap arg1, Matrix arg2, Paint arg3){
  }
  public void setViewport(int arg1, int arg2){
  }
  public void setDensity(int arg1){
  }
  public int getSaveCount(){
    return 0;
  }
  public void drawRect(RectF arg1, Paint arg2){
  }
  public void drawRect(Rect arg1, Paint arg2){
  }
  public void drawRect(float arg1, float arg2, float arg3, float arg4, Paint arg5){
  }
  public void drawColor(int arg1){
  }
  public void drawColor(int arg1, PorterDuff.Mode arg2){
  }
  public void drawPaint(Paint arg1){
  }
  public void drawLine(float arg1, float arg2, float arg3, float arg4, Paint arg5){
  }
  public void drawPicture(Picture arg1){
  }
  public void drawPicture(Picture arg1, RectF arg2){
  }
  public void drawPicture(Picture arg1, Rect arg2){
  }
  public void setDrawFilter(DrawFilter arg1){
  }
  public void drawText(char [] arg1, int arg2, int arg3, float arg4, float arg5, Paint arg6){
  }
  public void drawText(java.lang.String arg1, float arg2, float arg3, Paint arg4){
  }
  public void drawText(java.lang.String arg1, int arg2, int arg3, float arg4, float arg5, Paint arg6){
  }
  public void drawText(java.lang.CharSequence arg1, int arg2, int arg3, float arg4, float arg5, Paint arg6){
  }
  public void drawPath(Path arg1, Paint arg2){
  }
  public int getDensity(){
    return 0;
  }
  public void drawPatch(Bitmap arg1, byte [] arg2, RectF arg3, Paint arg4){
  }
  public void drawBitmapMesh(Bitmap arg1, int arg2, int arg3, float [] arg4, int arg5, int [] arg6, int arg7, Paint arg8){
  }
  public void drawCircle(float arg1, float arg2, float arg3, Paint arg4){
  }
  public void drawLines(float [] arg1, int arg2, int arg3, Paint arg4){
  }
  public void drawLines(float [] arg1, Paint arg2){
  }
  public void drawOval(RectF arg1, Paint arg2){
  }
  public void drawPoint(float arg1, float arg2, Paint arg3){
  }
  public void drawPoints(float [] arg1, int arg2, int arg3, Paint arg4){
  }
  public void drawPoints(float [] arg1, Paint arg2){
  }
  public void drawPosText(char [] arg1, int arg2, int arg3, float [] arg4, Paint arg5){
  }
  public void drawPosText(java.lang.String arg1, float [] arg2, Paint arg3){
  }
  public void drawRoundRect(RectF arg1, float arg2, float arg3, Paint arg4){
  }
  public void drawTextOnPath(char [] arg1, int arg2, int arg3, Path arg4, float arg5, float arg6, Paint arg7){
  }
  public void drawTextOnPath(java.lang.String arg1, Path arg2, float arg3, float arg4, Paint arg5){
  }
  public void drawTextRun(char [] arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, int arg8, Paint arg9){
  }
  public void drawTextRun(java.lang.CharSequence arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, int arg8, Paint arg9){
  }
  public void drawVertices(Canvas.VertexMode arg1, int arg2, float [] arg3, int arg4, float [] arg5, int arg6, int [] arg7, int arg8, short [] arg9, int arg10, int arg11, Paint arg12){
  }
  public int getMaximumBitmapWidth(){
    return 0;
  }
  public int getMaximumBitmapHeight(){
    return 0;
  }
  public boolean clipPath(Path arg1, Region.Op arg2){
    return false;
  }
  public boolean clipPath(Path arg1){
    return false;
  }
  public boolean clipRegion(Region arg1, Region.Op arg2){
    return false;
  }
  public boolean clipRegion(Region arg1){
    return false;
  }
  public boolean getClipBounds(Rect arg1){
    return false;
  }
  public final Rect getClipBounds(){
    return (Rect) null;
  }
  public void skew(float arg1, float arg2){
  }
  public void setMatrix(Matrix arg1){
  }
  public DrawFilter getDrawFilter(){
    return (DrawFilter) null;
  }
  public void drawArc(RectF arg1, float arg2, float arg3, boolean arg4, Paint arg5){
  }
  public void drawARGB(int arg1, int arg2, int arg3, int arg4){
  }
  public void drawRGB(int arg1, int arg2, int arg3){
  }
  @java.lang.Deprecated
  protected javax.microedition.khronos.opengles.GL getGL(){
    return (javax.microedition.khronos.opengles.GL) null;
  }
  public void setScreenDensity(int arg1){
  }
  public static void freeCaches(){
  }
}
