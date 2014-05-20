package java.lang.reflect;

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


public class AccessibleObject
  implements AnnotatedElement
{
  // Constructors

  protected AccessibleObject(){
  }
  // Methods

  public <T extends java.lang.annotation.Annotation>T getAnnotation(java.lang.Class<T> arg1){
    return null;
  }
  public java.lang.annotation.Annotation [] getAnnotations(){
    return (java.lang.annotation.Annotation []) null;
  }
  public java.lang.annotation.Annotation [] getDeclaredAnnotations(){
    return (java.lang.annotation.Annotation []) null;
  }
  public boolean isAnnotationPresent(java.lang.Class<? extends java.lang.annotation.Annotation> arg1){
    return false;
  }
  public boolean isAccessible(){
    return false;
  }
  public static void setAccessible(AccessibleObject [] arg1, boolean arg2){
  }
  public void setAccessible(boolean arg1){
  }
}
