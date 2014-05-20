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


public class NumberPicker
  extends LinearLayout{
  // Classes

  public static interface OnValueChangeListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onChanged")
    public void onValueChange(NumberPicker arg1, int arg2, int arg3);
  }
  public static interface OnScrollListener
  {
    // Fields

    public static final int SCROLL_STATE_IDLE = 0;

    public static final int SCROLL_STATE_TOUCH_SCROLL = 1;

    public static final int SCROLL_STATE_FLING = 2;

    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onScrollStateChanged")
    public void onScrollStateChange(NumberPicker arg1, int arg2);
  }
  public static interface Formatter
  {
    // Methods

    public java.lang.String format(int arg1);
  }
  // Fields

  public static final NumberPicker.Formatter TWO_DIGIT_FORMATTER = null;

  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public NumberPicker(android.content.Context arg1){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public NumberPicker(android.content.Context arg1, android.util.AttributeSet arg2){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public NumberPicker(android.content.Context arg1, android.util.AttributeSet arg2, int arg3){
    super((android.content.Context) null);
  }
  // Methods

  public int getValue(){
    return 0;
  }
  public void setValue(int arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onTouchEvent(android.view.MotionEvent arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onAttachedToWindow(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
 protected void onDetachedFromWindow(){
  }
  public boolean dispatchKeyEvent(android.view.KeyEvent arg1){
    return false;
  }
  public boolean dispatchTouchEvent(android.view.MotionEvent arg1){
    return false;
  }
  public boolean dispatchTrackballEvent(android.view.MotionEvent arg1){
    return false;
  }
  public void setFormatter(NumberPicker.Formatter arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onLayout(boolean arg1, int arg2, int arg3, int arg4, int arg5){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onInterceptTouchEvent(android.view.MotionEvent arg1){
    return false;
  }
  protected void dispatchDraw(android.graphics.Canvas arg1){
  }
  public void computeScroll(){
  }
  public void draw(android.graphics.Canvas arg1){
  }
  public int getSolidColor(){
    return 0;
  }
  public void sendAccessibilityEvent(int arg1){
  }
  public void setEnabled(boolean arg1){
  }
  public void scrollBy(int arg1, int arg2){
  }
  protected float getTopFadingEdgeStrength(){
    return 0.0f;
  }
  protected float getBottomFadingEdgeStrength(){
    return 0.0f;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onDraw(android.graphics.Canvas arg1){
  }
  public int getMaxValue(){
    return 0;
  }
  public void setOnScrollListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onScrollStateChanged") NumberPicker.OnScrollListener arg1){
  }
  public int getMinValue(){
    return 0;
  }
  public void setOnValueChangedListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onChanged") NumberPicker.OnValueChangeListener arg1){
  }
  public void setMinValue(int arg1){
  }
  public void setMaxValue(int arg1){
  }
  public void setOnLongPressUpdateInterval(long arg1){
  }
  public void setDisplayedValues(java.lang.String [] arg1){
  }
  public boolean getWrapSelectorWheel(){
    return false;
  }
  public void setWrapSelectorWheel(boolean arg1){
  }
  public java.lang.String [] getDisplayedValues(){
    return (java.lang.String []) null;
  }
}
