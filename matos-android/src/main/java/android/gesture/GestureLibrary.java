package android.gesture;

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


@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.GestureLibraryImplem", superClass = "")
public abstract class GestureLibrary
{
  // Fields

  protected final GestureStore mStore = (GestureStore) null;

  // Constructors

  protected GestureLibrary(){
  }
  // Methods

  public abstract boolean load();
  public abstract boolean save();
  public boolean isReadOnly(){
    return false;
  }
  public void removeEntry(java.lang.String arg1){
  }
  public void setOrientationStyle(int arg1){
  }
  public int getOrientationStyle(){
    return 0;
  }
  public void setSequenceType(int arg1){
  }
  public int getSequenceType(){
    return 0;
  }
  public java.util.Set<java.lang.String> getGestureEntries(){
    return (java.util.Set) null;
  }
  public java.util.ArrayList<Prediction> recognize(Gesture arg1){
    return (java.util.ArrayList) null;
  }
  public void addGesture(java.lang.String arg1, Gesture arg2){
  }
  public void removeGesture(java.lang.String arg1, Gesture arg2){
  }
  public java.util.ArrayList<Gesture> getGestures(java.lang.String arg1){
    return (java.util.ArrayList) null;
  }
}
