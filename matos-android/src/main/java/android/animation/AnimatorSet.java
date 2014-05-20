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
public final class AnimatorSet
  extends Animator{
  // Classes

  public class Builder
  {
    // Fields

    // Constructors

    Builder(Animator arg1){
    }
    // Methods

    public AnimatorSet.Builder after(Animator arg1){
      return (AnimatorSet.Builder) null;
    }
    public AnimatorSet.Builder after(long arg1){
      return (AnimatorSet.Builder) null;
    }
    public AnimatorSet.Builder before(Animator arg1){
      return (AnimatorSet.Builder) null;
    }
    public AnimatorSet.Builder with(Animator arg1){
      return (AnimatorSet.Builder) null;
    }
  }
  // Constructors

  public AnimatorSet(){
    super();
  }
  // Methods

  public AnimatorSet clone(){
    return (AnimatorSet) null;
  }
  public void start(){
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
  public AnimatorSet setDuration(long arg1){
    return (AnimatorSet) null;
  }
  public boolean isStarted(){
    return false;
  }
  public void setStartDelay(long arg1){
  }
  public long getStartDelay(){
    return 0l;
  }
  public void setTarget(java.lang.Object arg1){
  }
  public void setupStartValues(){
  }
  public void setupEndValues(){
  }
  public AnimatorSet.Builder play(Animator arg1){
    return (AnimatorSet.Builder) null;
  }
  public void playTogether(Animator [] arg1){
  }
  public void playTogether(java.util.Collection<Animator> arg1){
  }
  public void playSequentially(Animator [] arg1){
  }
  public void playSequentially(java.util.List<Animator> arg1){
  }
  public java.util.ArrayList<Animator> getChildAnimations(){
    return (java.util.ArrayList<Animator>) null;
  }
}
