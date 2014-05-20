package android.view.animation;

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
public class AnimationSet
  extends Animation{
  // Constructors

  public AnimationSet(android.content.Context arg1, android.util.AttributeSet arg2){
    super();
  }
  public AnimationSet(boolean arg1){
    super();
  }
  // Methods

  protected AnimationSet clone() throws java.lang.CloneNotSupportedException{
    return (AnimationSet) null;
  }
  public void reset(){
  }
  public void initialize(int arg1, int arg2, int arg3, int arg4){
  }
  public long getStartTime(){
    return 0l;
  }
  public long getDuration(){
    return 0l;
  }
  public void setDuration(long arg1){
  }
  public void initializeInvalidateRegion(int arg1, int arg2, int arg3, int arg4){
  }
  public boolean getTransformation(long arg1, Transformation arg2){
    return false;
  }
  public boolean willChangeTransformationMatrix(){
    return false;
  }
  public boolean willChangeBounds(){
    return false;
  }
  public boolean hasAlpha(){
    return false;
  }
  public void setStartTime(long arg1){
  }
  public void setFillBefore(boolean arg1){
  }
  public void setStartOffset(long arg1){
  }
  public void restrictDuration(long arg1){
  }
  public void scaleCurrentDuration(float arg1){
  }
  public void setRepeatMode(int arg1){
  }
  public void setFillAfter(boolean arg1){
  }
  public long computeDurationHint(){
    return 0l;
  }
  public void addAnimation(Animation arg1){
  }
  public java.util.List<Animation> getAnimations(){
    return (java.util.List) null;
  }
}
