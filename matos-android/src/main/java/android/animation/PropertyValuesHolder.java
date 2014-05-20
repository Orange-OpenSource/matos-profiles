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
public class PropertyValuesHolder
  implements java.lang.Cloneable
{
  // Fields

  protected android.util.Property mProperty;

  // Constructors

  private PropertyValuesHolder(java.lang.String arg1){
  }
  private PropertyValuesHolder(android.util.Property arg1){
  }
  // Methods

  public void setProperty(android.util.Property arg1){
  }
  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public PropertyValuesHolder clone(){
    return (PropertyValuesHolder) null;
  }
  public java.lang.String getPropertyName(){
    return (java.lang.String) null;
  }
  public static PropertyValuesHolder ofFloat(java.lang.String arg1, float [] arg2){
    return (PropertyValuesHolder) null;
  }
  public static PropertyValuesHolder ofFloat(android.util.Property<?, java.lang.Float> arg1, float [] arg2){
    return (PropertyValuesHolder) null;
  }
  public static PropertyValuesHolder ofInt(java.lang.String arg1, int [] arg2){
    return (PropertyValuesHolder) null;
  }
  public static PropertyValuesHolder ofInt(android.util.Property<?, java.lang.Integer> arg1, int [] arg2){
    return (PropertyValuesHolder) null;
  }
  public static PropertyValuesHolder ofObject(java.lang.String arg1, TypeEvaluator arg2, java.lang.Object [] arg3){
    return (PropertyValuesHolder) null;
  }
  public static <V>PropertyValuesHolder ofObject(android.util.Property arg1, TypeEvaluator<V> arg2, V [] arg3){
    return (PropertyValuesHolder) null;
  }
  public void setIntValues(int [] arg1){
  }
  public void setFloatValues(float [] arg1){
  }
  public void setObjectValues(java.lang.Object [] arg1){
  }
  public void setEvaluator(TypeEvaluator arg1){
  }
  public void setPropertyName(java.lang.String arg1){
  }
  public static PropertyValuesHolder ofKeyframe(java.lang.String arg1, Keyframe [] arg2){
    return (PropertyValuesHolder) null;
  }
  public static PropertyValuesHolder ofKeyframe(android.util.Property arg1, Keyframe [] arg2){
    return (PropertyValuesHolder) null;
  }
  public void setKeyframes(Keyframe [] arg1){
  }
}
