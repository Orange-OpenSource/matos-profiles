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
public class LinearLayout
  extends android.view.ViewGroup{
  // Classes

  public static class LayoutParams
    extends android.view.ViewGroup.MarginLayoutParams  {
    // Fields

    public float weight;

    public int gravity;

    // Constructors

    public LayoutParams(android.content.Context arg1, android.util.AttributeSet arg2){
      super((android.content.Context) null, (android.util.AttributeSet) null);
    }
    public LayoutParams(int arg1, int arg2){
      super((android.content.Context) null, (android.util.AttributeSet) null);
    }
    public LayoutParams(int arg1, int arg2, float arg3){
      super((android.content.Context) null, (android.util.AttributeSet) null);
    }
    public LayoutParams(android.view.ViewGroup.LayoutParams arg1){
      super((android.content.Context) null, (android.util.AttributeSet) null);
    }
    public LayoutParams(android.view.ViewGroup.MarginLayoutParams arg1){
      super((android.content.Context) null, (android.util.AttributeSet) null);
    }
    // Methods

    public java.lang.String debug(java.lang.String arg1){
      return (java.lang.String) null;
    }
  }
  // Fields

  public static final int HORIZONTAL = 0;

  public static final int VERTICAL = 1;

  public static final int SHOW_DIVIDER_NONE = 0;

  public static final int SHOW_DIVIDER_BEGINNING = 1;

  public static final int SHOW_DIVIDER_MIDDLE = 2;

  public static final int SHOW_DIVIDER_END = 4;

  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public LinearLayout(android.content.Context arg1){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public LinearLayout(android.content.Context arg1, android.util.AttributeSet arg2){
    super((android.content.Context) null);
  }
  public LinearLayout(android.content.Context arg1, android.util.AttributeSet arg2, int arg3){
    super((android.content.Context) null);
  }
  // Methods

  protected LinearLayout.LayoutParams generateDefaultLayoutParams(){
    return (LinearLayout.LayoutParams) null;
  }
  public LinearLayout.LayoutParams generateLayoutParams(android.util.AttributeSet arg1){
    return (LinearLayout.LayoutParams) null;
  }
  protected LinearLayout.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams arg1){
    return (LinearLayout.LayoutParams) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onMeasure(int arg1, int arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onLayout(boolean arg1, int arg2, int arg3, int arg4, int arg5){
  }
  public boolean shouldDelayChildPressedState(){
    return false;
  }
  protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams arg1){
    return false;
  }
  protected void onDraw(android.graphics.Canvas arg1){
  }
  public int getBaseline(){
    return 0;
  }
  public void setGravity(int arg1){
  }
  public void setHorizontalGravity(int arg1){
  }
  public void setVerticalGravity(int arg1){
  }
  public void setOrientation(int arg1){
  }
  public void setShowDividers(int arg1){
  }
  public int getShowDividers(){
    return 0;
  }
  public void setDividerDrawable(android.graphics.drawable.Drawable arg1){
  }
  public void setDividerPadding(int arg1){
  }
  public int getDividerPadding(){
    return 0;
  }
  public int getDividerWidth(){
    return 0;
  }
  public boolean isBaselineAligned(){
    return false;
  }
  public void setBaselineAligned(boolean arg1){
  }
  public boolean isMeasureWithLargestChildEnabled(){
    return false;
  }
  @android.view.RemotableViewMethod
  public void setMeasureWithLargestChildEnabled(boolean arg1){
  }
  public int getBaselineAlignedChildIndex(){
    return 0;
  }
  public void setBaselineAlignedChildIndex(int arg1){
  }
  public float getWeightSum(){
    return 0.0f;
  }
  public void setWeightSum(float arg1){
  }
  protected boolean hasDividerBeforeChildAt(int arg1){
    return false;
  }
  public int getOrientation(){
    return 0;
  }
}
