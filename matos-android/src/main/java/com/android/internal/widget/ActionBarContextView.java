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
public class ActionBarContextView
  extends AbsActionBarView  implements android.animation.Animator.AnimatorListener
{
  // Constructors
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public ActionBarContextView(android.content.Context arg1){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public ActionBarContextView(android.content.Context arg1, android.util.AttributeSet arg2){
    super((android.content.Context) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public ActionBarContextView(android.content.Context arg1, android.util.AttributeSet arg2, int arg3){
    super((android.content.Context) null);
  }
  // Methods

  public void setTitle(@com.francetelecom.rd.stubs.annotation.FieldSet("mTitle") java.lang.CharSequence arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onDetachedFromWindow(){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mTitle")
  public java.lang.CharSequence getTitle(){
    return (java.lang.CharSequence) null;
  }
  public void setSplitActionBar(boolean arg1){
  }
  public void setContentHeight(int arg1){
  }
  public void setCustomView(android.view.View arg1){
  }
  public void setSubtitle(@com.francetelecom.rd.stubs.annotation.FieldSet("mSubtitle") java.lang.CharSequence arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mSubtitle") 
  public java.lang.CharSequence getSubtitle(){
    return (java.lang.CharSequence) null;
  }
  public void initForMode(android.view.ActionMode arg1){
  }
  public void closeMode(){
  }
  public void killMode(){
  }
  public boolean showOverflowMenu(){
    return false;
  }
  public boolean hideOverflowMenu(){
    return false;
  }
  public boolean isOverflowMenuShowing(){
    return false;
  }
  protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams(){
    return (android.view.ViewGroup.LayoutParams) null;
  }
  public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet arg1){
    return (android.view.ViewGroup.LayoutParams) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onMeasure(int arg1, int arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onLayout(boolean arg1, int arg2, int arg3, int arg4, int arg5){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onAnimationStart(android.animation.Animator arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onAnimationEnd(android.animation.Animator arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onAnimationCancel(android.animation.Animator arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onAnimationRepeat(android.animation.Animator arg1){
  }
  public boolean shouldDelayChildPressedState(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent arg1){
  }
}
