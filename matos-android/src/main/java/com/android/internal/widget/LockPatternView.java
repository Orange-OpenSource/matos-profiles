package com.android.internal.widget;

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
public class LockPatternView
  extends android.view.View{
  // Classes

  public static class Cell
  {
    // Constructors

    private Cell(int arg1, int arg2){
    }
    // Methods

    public java.lang.String toString(){
      return (java.lang.String) null;
    }
    public static synchronized LockPatternView.Cell of(int arg1, int arg2){
      return (LockPatternView.Cell) null;
    }
    public int getRow(){
      return 0;
    }
    public int getColumn(){
      return 0;
    }
  }
  public static enum DisplayMode
  {
    // Enum Constants

    Correct()
, Animate()
, Wrong()
;
    // Fields

    // Constructors

    private DisplayMode(){
    }
    // Methods

  }
  public static interface OnPatternListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onPatternListener")
    public void onPatternCellAdded(java.util.List<LockPatternView.Cell> arg1);
    @com.francetelecom.rd.stubs.annotation.CallBack("onPatternListener")
    public void onPatternStart();
    @com.francetelecom.rd.stubs.annotation.CallBack("onPatternListener")
    public void onPatternDetected(java.util.List<LockPatternView.Cell> arg1);
    @com.francetelecom.rd.stubs.annotation.CallBack("onPatternListener")
    public void onPatternCleared();
  }
  // Constructors
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public LockPatternView(android.content.Context arg1){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public LockPatternView(android.content.Context arg1, android.util.AttributeSet arg2){
    super((android.content.Context) null);
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onRestoreInstanceState(android.os.Parcelable arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected android.os.Parcelable onSaveInstanceState(){
    return (android.os.Parcelable) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onTouchEvent(android.view.MotionEvent arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onMeasure(int arg1, int arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onHoverEvent(android.view.MotionEvent arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onSizeChanged(int arg1, int arg2, int arg3, int arg4){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onDraw(android.graphics.Canvas arg1){
  }
  protected int getSuggestedMinimumHeight(){
    return 0;
  }
  protected int getSuggestedMinimumWidth(){
    return 0;
  }
  public void setPattern(LockPatternView.DisplayMode arg1, java.util.List<LockPatternView.Cell> arg2){
  }
  public boolean isInStealthMode(){
    return false;
  }
  public boolean isTactileFeedbackEnabled(){
    return false;
  }
  public void setInStealthMode(boolean arg1){
  }
  public void setTactileFeedbackEnabled(boolean arg1){
  }
  public void setOnPatternListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onPatternListener") LockPatternView.OnPatternListener arg1){
  }
  public void setDisplayMode(LockPatternView.DisplayMode arg1){
  }
  public void clearPattern(){
  }
  public void disableInput(){
  }
  public void enableInput(){
  }
}
