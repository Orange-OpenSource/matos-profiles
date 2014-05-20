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
public class LayoutTransition
{
  // Classes

  public static interface TransitionListener
  {
    // Methods

	@com.francetelecom.rd.stubs.annotation.CallBack("TransitionListener")
	public void startTransition(LayoutTransition arg1, android.view.ViewGroup arg2, android.view.View arg3, int arg4);
	@com.francetelecom.rd.stubs.annotation.CallBack("TransitionListener")
	public void endTransition(LayoutTransition arg1, android.view.ViewGroup arg2, android.view.View arg3, int arg4);
  }
  // Fields

  public static final int CHANGE_APPEARING = 0;

  public static final int CHANGE_DISAPPEARING = 1;

  public static final int APPEARING = 2;

  public static final int DISAPPEARING = 3;

  // Constructors

  public LayoutTransition(){
  }
  // Methods

  public void cancel(){
  }
  public void cancel(int arg1){
  }
  public long getDuration(int arg1){
    return 0l;
  }
  public boolean isRunning(){
    return false;
  }
  
  public void setInterpolator(int arg1,@com.francetelecom.rd.stubs.annotation.FieldSet("timeInterpolator") TimeInterpolator arg2){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("timeInterpolator")
  public TimeInterpolator getInterpolator(int arg1){
    return (TimeInterpolator) null;
  }
  public void setDuration(long arg1){
  }
  public void setDuration(int arg1, long arg2){
  }
  public void removeChild(android.view.ViewGroup arg1, android.view.View arg2){
  }
  public void setStartDelay(int arg1, long arg2){
  }
  public long getStartDelay(int arg1){
    return 0l;
  }
  public void addChild(android.view.ViewGroup arg1, android.view.View arg2){
  }
  public void showChild(android.view.ViewGroup arg1, android.view.View arg2){
  }
  public void hideChild(android.view.ViewGroup arg1, android.view.View arg2){
  }
  public void removeTransitionListener(LayoutTransition.TransitionListener arg1){
  }
  public void addTransitionListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("TransitionListener") LayoutTransition.TransitionListener arg1){
  }
  public boolean isChangingLayout(){
    return false;
  }
  public void startChangingAnimations(){
  }
  public void endChangingAnimations(){
  }
  public void setStagger(int arg1, long arg2){
  }
  public long getStagger(int arg1){
    return 0l;
  }
  
 public void setAnimator(int arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("animator") Animator arg2){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("animator")
 public Animator getAnimator(int arg1){
    return (Animator) null;
  }
  public void setAnimateParentHierarchy(boolean arg1){
  }
  public java.util.List<LayoutTransition.TransitionListener> getTransitionListeners(){
    return (java.util.List) null;
  }
}
