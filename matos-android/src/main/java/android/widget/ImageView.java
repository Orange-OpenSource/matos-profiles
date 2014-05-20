package android.widget;

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
public class ImageView
  extends android.view.View{
  // Classes

  public static enum ScaleType
  {
    // Enum Constants

    MATRIX(0)
, FIT_XY(0)
, FIT_START(0)
, FIT_CENTER(0)
, FIT_END(0)
, CENTER(0)
, CENTER_CROP(0)
, CENTER_INSIDE(0)
;
    // Fields

    // Constructors

    private ScaleType(int arg1){
    }
    // Methods

  }
  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public ImageView(android.content.Context arg1){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public ImageView(android.content.Context arg1, android.util.AttributeSet arg2){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public ImageView(android.content.Context arg1, android.util.AttributeSet arg2, int arg3){
    super((android.content.Context) null);
  }
  // Methods

  protected boolean setFrame(int arg1, int arg2, int arg3, int arg4){
    return false;
  }
  protected void onMeasure(int arg1, int arg2){
  }
  protected void drawableStateChanged(){
  }
  public void jumpDrawablesToCurrentState(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public int [] onCreateDrawableState(int arg1){
    return (int []) null;
  }
  public void setAlpha(int arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected boolean onSetAlpha(int arg1){
    return false;
  }
  public void setSelected(boolean arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent arg1){
  }
  public int getResolvedLayoutDirection(android.graphics.drawable.Drawable arg1){
    return 0;
  }
  protected void onDraw(android.graphics.Canvas arg1){
  }
  public void invalidateDrawable(android.graphics.drawable.Drawable arg1){
  }
  protected boolean verifyDrawable(android.graphics.drawable.Drawable arg1){
    return false;
  }
  public int getBaseline(){
    return 0;
  }
  public void setMaxHeight(int arg1){
  }
  public void setMaxWidth(int arg1){
  }
  public final void setColorFilter(int arg1, android.graphics.PorterDuff.Mode arg2){
  }
  public final void setColorFilter(int arg1){
  }
  public void setColorFilter(android.graphics.ColorFilter arg1){
  }
  public final void clearColorFilter(){
  }
  public android.graphics.drawable.Drawable getDrawable(){
    return (android.graphics.drawable.Drawable) null;
  }
  public void setImageResource(int arg1){
  }
  public void setImageURI(android.net.Uri arg1){
  }
  public void setImageDrawable(android.graphics.drawable.Drawable arg1){
  }
  public void setScaleType(ImageView.ScaleType arg1){
  }
  public void setImageBitmap(android.graphics.Bitmap arg1){
  }
  public void setAdjustViewBounds(boolean arg1){
  }
  public void setImageState(int [] arg1, boolean arg2){
  }
  public void setImageLevel(int arg1){
  }
  public ImageView.ScaleType getScaleType(){
    return (ImageView.ScaleType) null;
  }
  public android.graphics.Matrix getImageMatrix(){
    return (android.graphics.Matrix) null;
  }
  public void setImageMatrix(android.graphics.Matrix arg1){
  }
  public void setBaseline(int arg1){
  }
  public void setBaselineAlignBottom(boolean arg1){
  }
  public boolean getBaselineAlignBottom(){
    return false;
  }
}
