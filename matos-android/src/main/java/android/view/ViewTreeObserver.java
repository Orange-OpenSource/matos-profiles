package android.view;

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
public final class ViewTreeObserver
{
  // Classes

  public static interface OnGlobalFocusChangeListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onGlobalFocusChanged")
    public void onGlobalFocusChanged(View arg1, View arg2);
  }
  public static interface OnGlobalLayoutListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onGlobalLayout")
    public void onGlobalLayout();
  }
  public static interface OnPreDrawListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onPreDraw")
    public boolean onPreDraw();
  }
  public static interface OnTouchModeChangeListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onTouch")
    public void onTouchModeChanged(boolean arg1);
  }
  public static interface OnScrollChangedListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onScroll")
    public void onScrollChanged();
  }
  public static final class InternalInsetsInfo
  {
    // Fields

    public final android.graphics.Rect contentInsets = (android.graphics.Rect) null;

    public final android.graphics.Rect visibleInsets = (android.graphics.Rect) null;

    public final android.graphics.Region touchableRegion = (android.graphics.Region) null;

    public static final int TOUCHABLE_INSETS_FRAME = 0;

    public static final int TOUCHABLE_INSETS_CONTENT = 1;

    public static final int TOUCHABLE_INSETS_VISIBLE = 2;

    public static final int TOUCHABLE_INSETS_REGION = 3;

    // Constructors

    public InternalInsetsInfo(){
    }
    // Methods

    public boolean equals(java.lang.Object arg1){
      return false;
    }
    public void setTouchableInsets(int arg1){
    }
    public int getTouchableInsets(){
      return 0;
    }
  }
  public static interface OnComputeInternalInsetsListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onCompute")
    public void onComputeInternalInsets(ViewTreeObserver.InternalInsetsInfo arg1);
  }
  // Constructors

  ViewTreeObserver(){
  }
  // Methods

  public boolean isAlive(){
    return false;
  }
  public void removeOnTouchModeChangeListener(ViewTreeObserver.OnTouchModeChangeListener arg1){
  }
  public void addOnGlobalLayoutListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("android.view.ViewTreeObserver.OnGlobalLayoutListener.onGlobalLayout") ViewTreeObserver.OnGlobalLayoutListener arg1){
  }
  public void addOnScrollChangedListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("android.view.ViewTreeObserver.OnScrollChangedListener.onScroll") ViewTreeObserver.OnScrollChangedListener arg1){
  }
  public void removeGlobalOnLayoutListener(ViewTreeObserver.OnGlobalLayoutListener arg1){
  }
  public void removeOnScrollChangedListener(ViewTreeObserver.OnScrollChangedListener arg1){
  }
  public void addOnPreDrawListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("android.view.ViewTreeObserver.OnPreDrawListener.onPreDraw") ViewTreeObserver.OnPreDrawListener arg1){
  }
  public void addOnTouchModeChangeListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("android.view.ViewTreeObserver.OnTouchModeChangeListener.onTouch") ViewTreeObserver.OnTouchModeChangeListener arg1){
  }
  public void removeOnPreDrawListener(ViewTreeObserver.OnPreDrawListener arg1){
  }
  public final void dispatchOnGlobalLayout(){
  }
  public final boolean dispatchOnPreDraw(){
    return false;
  }
  public void addOnComputeInternalInsetsListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("android.view.ViewTreeObserver.OnComputeInternalInsetsListener.onCompute") ViewTreeObserver.OnComputeInternalInsetsListener arg1){
  }
  public void removeOnComputeInternalInsetsListener(ViewTreeObserver.OnComputeInternalInsetsListener arg1){
  }
  public void addOnGlobalFocusChangeListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("android.view.ViewTreeObserver.OnGlobalFocusChangedListener.onGlobalFocusChanged") ViewTreeObserver.OnGlobalFocusChangeListener arg1){
  }
  public void removeOnGlobalFocusChangeListener(ViewTreeObserver.OnGlobalFocusChangeListener arg1){
  }
}
