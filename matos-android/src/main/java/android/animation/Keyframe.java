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

import com.francetelecom.rd.stubs.annotation.Real;


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
@Real("com.francetelecom.rd.fakeandroid.KeyFrameImpl")
public abstract class Keyframe
  implements java.lang.Cloneable
{
  // Constructors

  public Keyframe(){
  }
  // Methods

  public abstract Keyframe clone();
  @com.francetelecom.rd.stubs.annotation.FieldGet("value")
  public abstract java.lang.Object getValue();
  public java.lang.Class getType(){
    return (java.lang.Class) null;
  }
  
  public abstract void setValue(@com.francetelecom.rd.stubs.annotation.FieldSet("value") java.lang.Object arg1);
  public void setInterpolator(TimeInterpolator arg1){
  }
  public TimeInterpolator getInterpolator(){
    return (TimeInterpolator) null;
  }
  public static Keyframe ofFloat(float arg1, float arg2){
    return (Keyframe) null;
  }
  public static Keyframe ofFloat(float arg1){
    return (Keyframe) null;
  }
  public static Keyframe ofInt(float arg1, int arg2){
    return (Keyframe) null;
  }
  public static Keyframe ofInt(float arg1){
    return (Keyframe) null;
  }
  public static Keyframe ofObject(float arg1, java.lang.Object arg2){
    return (Keyframe) null;
  }
  public static Keyframe ofObject(float arg1){
    return (Keyframe) null;
  }
  public float getFraction(){
    return 0.0f;
  }
  public boolean hasValue(){
    return false;
  }
  public void setFraction(float arg1){
  }
}
