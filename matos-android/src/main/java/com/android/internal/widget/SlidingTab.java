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
public class SlidingTab
  extends android.view.ViewGroup{
  // Classes

  public static interface OnTriggerListener
  {
    // Fields

    public static final int NO_HANDLE = 0;

    public static final int LEFT_HANDLE = 1;

    public static final int RIGHT_HANDLE = 2;

    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onTriggerListener")
    public void onTrigger(android.view.View arg1, int arg2);
    @com.francetelecom.rd.stubs.annotation.CallBack("onTriggerListener")
    public void onGrabbedStateChange(android.view.View arg1, int arg2);
  }
  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public SlidingTab(android.content.Context arg1){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public SlidingTab(android.content.Context arg1, android.util.AttributeSet arg2){
    super((android.content.Context) null);
  }
  // Methods

  public void reset(boolean arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate") 
  public boolean onTouchEvent(android.view.MotionEvent arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate") 
  protected void onMeasure(int arg1, int arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate") 
  protected void onLayout(boolean arg1, int arg2, int arg3, int arg4, int arg5){
  }
  public void setVisibility(int arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate") 
  public boolean onInterceptTouchEvent(android.view.MotionEvent arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate") 
  protected void onVisibilityChanged(android.view.View arg1, int arg2){
  }
  public void setOnTriggerListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onTriggerListener") SlidingTab.OnTriggerListener arg1){
  }
  public void setRightTabResources(int arg1, int arg2, int arg3, int arg4){
  }
  public void setRightHintText(int arg1){
  }
  public void setHoldAfterTrigger(boolean arg1, boolean arg2){
  }
  public void setLeftHintText(int arg1){
  }
  public void setLeftTabResources(int arg1, int arg2, int arg3, int arg4){
  }
}
