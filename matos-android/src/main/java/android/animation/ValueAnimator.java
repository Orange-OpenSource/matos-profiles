package android.animation;

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
public class ValueAnimator
  extends Animator{
  // Classes

  public static interface AnimatorUpdateListener
  {
    // Methods
	@com.francetelecom.rd.stubs.annotation.CallBack("onAnimationUpdate")
    public void onAnimationUpdate(ValueAnimator arg1);
  }
  // Fields

  public static final int RESTART = 1;

  public static final int REVERSE = 2;

  public static final int INFINITE = -1;

  // Constructors

  public ValueAnimator(){
    super();
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public ValueAnimator clone(){
    return (ValueAnimator) null;
  }
  public void start(){
  }
  public void reverse(){
  }
  public void end(){
  }
  public void cancel(){
  }
  public long getDuration(){
    return 0l;
  }
  public boolean isRunning(){
    return false;
  }
  public void setInterpolator(TimeInterpolator arg1){
  }
  public TimeInterpolator getInterpolator(){
    return (TimeInterpolator) null;
  }
  public int getRepeatCount(){
    return 0;
  }
  public ValueAnimator setDuration(long arg1){
    return (ValueAnimator) null;
  }
  public void setRepeatMode(int arg1){
  }
  public void setRepeatCount(int arg1){
  }
  public int getRepeatMode(){
    return 0;
  }
  public boolean isStarted(){
    return false;
  }
  public PropertyValuesHolder [] getValues(){
    return (PropertyValuesHolder []) null;
  }
  public static ValueAnimator ofFloat(float [] arg1){
    return (ValueAnimator) null;
  }
  public void setStartDelay(long arg1){
  }
  public float getAnimatedFraction(){
    return 0.0f;
  }
  public static ValueAnimator ofInt(int [] arg1){
    return (ValueAnimator) null;
  }
  public static ValueAnimator ofPropertyValuesHolder(PropertyValuesHolder [] arg1){
    return (ValueAnimator) null;
  }
  public static ValueAnimator ofObject(TypeEvaluator arg1, java.lang.Object [] arg2){
    return (ValueAnimator) null;
  }
  public void setIntValues(int [] arg1){
  }
  public void setFloatValues(float [] arg1){
  }
  public void setObjectValues(java.lang.Object [] arg1){
  }
  public void setValues(PropertyValuesHolder [] arg1){
  }
  public void setCurrentPlayTime(long arg1){
  }
  public long getCurrentPlayTime(){
    return 0l;
  }
  public long getStartDelay(){
    return 0l;
  }
  public static long getFrameDelay(){
    return 0l;
  }
  public static void setFrameDelay(long arg1){
  }
  public java.lang.Object getAnimatedValue(){
    return (java.lang.Object) null;
  }
  public java.lang.Object getAnimatedValue(java.lang.String arg1){
    return (java.lang.Object) null;
  }
  public void addUpdateListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onAnimationUpdate") ValueAnimator.AnimatorUpdateListener arg1){
  }
  public void removeAllUpdateListeners(){
  }
  public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener arg1){
  }
  public void setEvaluator(TypeEvaluator arg1){
  }
  public static int getCurrentAnimationsCount(){
    return 0;
  }
  public static void clearAllAnimations(){
  }
}
