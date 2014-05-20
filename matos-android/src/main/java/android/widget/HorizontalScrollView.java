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
public class HorizontalScrollView
  extends FrameLayout{
  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public HorizontalScrollView(android.content.Context arg1){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public HorizontalScrollView(android.content.Context arg1, android.util.AttributeSet arg2){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public HorizontalScrollView(android.content.Context arg1, android.util.AttributeSet arg2, int arg3){
    super((android.content.Context) null);
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onTouchEvent(android.view.MotionEvent arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onGenericMotionEvent(android.view.MotionEvent arg1){
    return false;
  }
  public boolean dispatchKeyEvent(android.view.KeyEvent arg1){
    return false;
  }
  protected void onMeasure(int arg1, int arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onLayout(boolean arg1, int arg2, int arg3, int arg4, int arg5){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent arg1){
  }
  public void addView(android.view.View arg1){
  }
  public void addView(android.view.View arg1, int arg2){
  }
  public void addView(android.view.View arg1, android.view.ViewGroup.LayoutParams arg2){
  }
  public void addView(android.view.View arg1, int arg2, android.view.ViewGroup.LayoutParams arg3){
  }
  public void requestChildFocus(android.view.View arg1, android.view.View arg2){
  }
  public boolean requestChildRectangleOnScreen(android.view.View arg1, android.graphics.Rect arg2, boolean arg3){
    return false;
  }
  public void requestDisallowInterceptTouchEvent(boolean arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onInterceptTouchEvent(android.view.MotionEvent arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected boolean onRequestFocusInDescendants(int arg1, android.graphics.Rect arg2){
    return false;
  }
  protected void measureChild(android.view.View arg1, int arg2, int arg3){
  }
  protected void measureChildWithMargins(android.view.View arg1, int arg2, int arg3, int arg4, int arg5){
  }
  public void requestLayout(){
  }
  public void computeScroll(){
  }
  public void draw(android.graphics.Canvas arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo arg1){
  }
  protected void onSizeChanged(int arg1, int arg2, int arg3, int arg4){
  }
  public void scrollTo(int arg1, int arg2){
  }
  protected float getLeftFadingEdgeStrength(){
    return 0.0f;
  }
  protected float getRightFadingEdgeStrength(){
    return 0.0f;
  }
  protected int computeHorizontalScrollRange(){
    return 0;
  }
  protected int computeHorizontalScrollOffset(){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onOverScrolled(int arg1, int arg2, boolean arg3, boolean arg4){
  }
  public void setOverScrollMode(int arg1){
  }
  public void fling(int arg1){
  }
  public int getMaxScrollAmount(){
    return 0;
  }
  public final void smoothScrollBy(int arg1, int arg2){
  }
  public final void smoothScrollTo(int arg1, int arg2){
  }
  public boolean pageScroll(int arg1){
    return false;
  }
  public boolean fullScroll(int arg1){
    return false;
  }
  public boolean arrowScroll(int arg1){
    return false;
  }
  public boolean isFillViewport(){
    return false;
  }
  public void setFillViewport(boolean arg1){
  }
  public boolean isSmoothScrollingEnabled(){
    return false;
  }
  public void setSmoothScrollingEnabled(boolean arg1){
  }
  public boolean executeKeyEvent(android.view.KeyEvent arg1){
    return false;
  }
  protected int computeScrollDeltaToGetChildRectOnScreen(android.graphics.Rect arg1){
    return 0;
  }
}
