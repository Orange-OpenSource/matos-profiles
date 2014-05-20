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
public final class ObjectAnimator
  extends ValueAnimator{
  // Constructors

  public ObjectAnimator(){
    super();
  }
  private ObjectAnimator(java.lang.Object arg1, java.lang.String arg2){
    super();
  }
  private <T>ObjectAnimator(T arg1, android.util.Property<T, ?> arg2){
    super();
  }
  // Methods

  public void setProperty(android.util.Property arg1){
  }
  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public ObjectAnimator clone(){
    return (ObjectAnimator) null;
  }
  public void start(){
  }
  public java.lang.Object getTarget(){
    return (java.lang.Object) null;
  }
  public ObjectAnimator setDuration(long arg1){
    return (ObjectAnimator) null;
  }
  public java.lang.String getPropertyName(){
    return (java.lang.String) null;
  }
  public static ObjectAnimator ofFloat(java.lang.Object arg1, java.lang.String arg2, float [] arg3){
    return (ObjectAnimator) null;
  }
  public static <T>ObjectAnimator ofFloat(T arg1, android.util.Property<T, java.lang.Float> arg2, float [] arg3){
    return (ObjectAnimator) null;
  }
  public static ObjectAnimator ofInt(java.lang.Object arg1, java.lang.String arg2, int [] arg3){
    return (ObjectAnimator) null;
  }
  public static <T>ObjectAnimator ofInt(T arg1, android.util.Property<T, java.lang.Integer> arg2, int [] arg3){
    return (ObjectAnimator) null;
  }
  public static ObjectAnimator ofPropertyValuesHolder(java.lang.Object arg1, PropertyValuesHolder [] arg2){
    return (ObjectAnimator) null;
  }
  public static ObjectAnimator ofObject(java.lang.Object arg1, java.lang.String arg2, TypeEvaluator arg3, java.lang.Object [] arg4){
    return (ObjectAnimator) null;
  }
  public static <T, V>ObjectAnimator ofObject(T arg1, android.util.Property<T, V> arg2, TypeEvaluator<V> arg3, V [] arg4){
    return (ObjectAnimator) null;
  }
  public void setIntValues(int [] arg1){
  }
  public void setFloatValues(float [] arg1){
  }
  public void setObjectValues(java.lang.Object [] arg1){
  }
  public void setTarget(java.lang.Object arg1){
  }
  public void setupStartValues(){
  }
  public void setupEndValues(){
  }
  public void setPropertyName(java.lang.String arg1){
  }
}
