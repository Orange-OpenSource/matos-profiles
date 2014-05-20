package android.graphics.drawable;

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
public class GradientDrawable
  extends Drawable{
  // Classes

  public static enum Orientation
  {
    // Enum Constants

    TOP_BOTTOM()
, TR_BL()
, RIGHT_LEFT()
, BR_TL()
, BOTTOM_TOP()
, BL_TR()
, LEFT_RIGHT()
, TL_BR()
;
    // Fields

    // Constructors

    private Orientation(){
    }
    // Methods

  }
  // Fields

  public static final int RECTANGLE = 0;

  public static final int OVAL = 1;

  public static final int LINE = 2;

  public static final int RING = 3;

  public static final int LINEAR_GRADIENT = 0;

  public static final int RADIAL_GRADIENT = 1;

  public static final int SWEEP_GRADIENT = 2;

  // Constructors

  public GradientDrawable(){
    super();
  }
  public GradientDrawable(GradientDrawable.Orientation arg1, int [] arg2){
    super();
  }
  // Methods

  public void setSize(int arg1, int arg2){
  }
  public void inflate(android.content.res.Resources arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("xmlPullParser") org.xmlpull.v1.XmlPullParser arg2, android.util.AttributeSet arg3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException{
  }
  public int getChangingConfigurations(){
    return 0;
  }
  public void setAlpha(int arg1){
  }
  public void draw(android.graphics.Canvas arg1){
  }
  public void setColor(int arg1){
  }
  public int getOpacity(){
    return 0;
  }
  public Drawable.ConstantState getConstantState(){
    return (Drawable.ConstantState) null;
  }
  public int getIntrinsicWidth(){
    return 0;
  }
  public int getIntrinsicHeight(){
    return 0;
  }
  public void setDither(boolean arg1){
  }
  public void setColorFilter(android.graphics.ColorFilter arg1){
  }
  protected void onBoundsChange(android.graphics.Rect arg1){
  }
  public Drawable mutate(){
    return (Drawable) null;
  }
  public boolean getPadding(android.graphics.Rect arg1){
    return false;
  }
  protected boolean onLevelChange(int arg1){
    return false;
  }
  public void setCornerRadius(float arg1){
  }
  public void setCornerRadii(float [] arg1){
  }
  public void setShape(int arg1){
  }
  public void setGradientType(int arg1){
  }
  public void setGradientCenter(float arg1, float arg2){
  }
  public void setStroke(int arg1, int arg2){
  }
  public void setStroke(int arg1, int arg2, float arg3, float arg4){
  }
  public void setGradientRadius(float arg1){
  }
  public void setUseLevel(boolean arg1){
  }
}
