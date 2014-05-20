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


public class GestureStore
{
  // Fields

  public static final int SEQUENCE_INVARIANT = 1;

  public static final int SEQUENCE_SENSITIVE = 2;

  public static final int ORIENTATION_INVARIANT = 1;

  public static final int ORIENTATION_SENSITIVE = 2;

  // Constructors

  public GestureStore(){
  }
  // Methods

  public void load(java.io.InputStream arg1) throws java.io.IOException{
  }
  public void load(java.io.InputStream arg1, boolean arg2) throws java.io.IOException{
  }
  public void save(java.io.OutputStream arg1) throws java.io.IOException{
  }
  public void save(java.io.OutputStream arg1, boolean arg2) throws java.io.IOException{
  }
  public boolean hasChanged(){
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
