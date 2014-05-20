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
public abstract class Animator
  implements java.lang.Cloneable
{
  // Classes

  public static interface AnimatorListener
  {
    // Methods
	@com.francetelecom.rd.stubs.annotation.CallBack("onAnimation")
    public void onAnimationStart(Animator arg1);
	@com.francetelecom.rd.stubs.annotation.CallBack("onAnimation")
    public void onAnimationEnd(Animator arg1);
	@com.francetelecom.rd.stubs.annotation.CallBack("onAnimation")
    public void onAnimationCancel(Animator arg1);
	@com.francetelecom.rd.stubs.annotation.CallBack("onAnimation")
    public void onAnimationRepeat(Animator arg1);
  }
  // Constructors

  public Animator(){
  }
  // Methods

  public Animator clone(){
    return (Animator) null;
  }
  public void start(){
  }
  public void end(){
  }
  public void cancel(){
  }
  public abstract long getDuration();
  public abstract boolean isRunning();
  public abstract void setInterpolator(TimeInterpolator arg1);
  public abstract Animator setDuration(long arg1);
  public void addListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onAnimation") Animator.AnimatorListener arg1){
  }
  public boolean isStarted(){
    return false;
  }
  public abstract void setStartDelay(long arg1);
  public abstract long getStartDelay();
  public void removeListener(Animator.AnimatorListener arg1){
  }
  public void setTarget(java.lang.Object arg1){
  }
  public java.util.ArrayList<Animator.AnimatorListener> getListeners(){
    return (java.util.ArrayList<Animator.AnimatorListener>) null;
  }
  public void removeAllListeners(){
  }
  public void setupStartValues(){
  }
  public void setupEndValues(){
  }
}
