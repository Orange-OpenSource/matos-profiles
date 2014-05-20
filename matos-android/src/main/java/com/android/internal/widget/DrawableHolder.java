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
public class DrawableHolder
  implements android.animation.Animator.AnimatorListener
{
  // Fields

  public static final android.view.animation.DecelerateInterpolator EASE_OUT_INTERPOLATOR = null;

  // Constructors
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public DrawableHolder(@com.francetelecom.rd.stubs.annotation.FieldSet("mDrawable") android.graphics.drawable.BitmapDrawable arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public DrawableHolder(@com.francetelecom.rd.stubs.annotation.FieldSet("mDrawable") android.graphics.drawable.BitmapDrawable arg1, float arg2, float arg3){
  }
  // Methods

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
  public float getX(){
    return 0.0f;
  }
  public float getY(){
    return 0.0f;
  }
  public int getWidth(){
    return 0;
  }
  public void setScaleY(float arg1){
  }
  public void setAlpha(float arg1){
  }
  public int getHeight(){
    return 0;
  }
  public float getAlpha(){
    return 0.0f;
  }
  public void draw(android.graphics.Canvas arg1){
  }
  public float getScaleX(){
    return 0.0f;
  }
  public void setScaleX(float arg1){
  }
  public float getScaleY(){
    return 0.0f;
  }
  public void setX(float arg1){
  }
  public void setY(float arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mDrawable") 
  public android.graphics.drawable.BitmapDrawable getDrawable(){
    return (android.graphics.drawable.BitmapDrawable) null;
  }
  public android.animation.ObjectAnimator addAnimTo(long arg1, long arg2, java.lang.String arg3, float arg4, boolean arg5){
    return (android.animation.ObjectAnimator) null;
  }
  public void removeAnimationFor(java.lang.String arg1){
  }
  public void clearAnimations(){
  }
  public void startAnimations(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onAnimationUpdate")android.animation.ValueAnimator.AnimatorUpdateListener arg1){
  }
}
