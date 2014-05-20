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


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public class Gesture
  implements android.os.Parcelable
{
  // Fields

  public static final android.os.Parcelable.Creator<Gesture> CREATOR = null;

  // Constructors

  public Gesture(){
  }
  // Methods

  public java.lang.Object clone(){
    return (java.lang.Object) null;
  }
  public float getLength(){
    return 0.0f;
  }
  public void writeToParcel(android.os.Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
  public long getID(){
    return 0l;
  }
  public java.util.ArrayList<GestureStroke> getStrokes(){
    return (java.util.ArrayList) null;
  }
  public int getStrokesCount(){
    return 0;
  }
  public void addStroke(GestureStroke arg1){
  }
  public android.graphics.RectF getBoundingBox(){
    return (android.graphics.RectF) null;
  }
  public android.graphics.Path toPath(){
    return (android.graphics.Path) null;
  }
  public android.graphics.Path toPath(android.graphics.Path arg1){
    return (android.graphics.Path) null;
  }
  public android.graphics.Path toPath(int arg1, int arg2, int arg3, int arg4){
    return (android.graphics.Path) null;
  }
  public android.graphics.Path toPath(android.graphics.Path arg1, int arg2, int arg3, int arg4, int arg5){
    return (android.graphics.Path) null;
  }
  public android.graphics.Bitmap toBitmap(int arg1, int arg2, int arg3, int arg4, int arg5){
    return (android.graphics.Bitmap) null;
  }
  public android.graphics.Bitmap toBitmap(int arg1, int arg2, int arg3, int arg4){
    return (android.graphics.Bitmap) null;
  }
}
