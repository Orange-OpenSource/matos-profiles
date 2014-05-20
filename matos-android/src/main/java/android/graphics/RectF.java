package android.graphics;

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
public class RectF
  implements android.os.Parcelable
{
  // Fields

  public float left;

  public float top;

  public float right;

  public float bottom;

  public static final android.os.Parcelable.Creator<RectF> CREATOR = null;

  // Constructors

  public RectF(){
  }
  public RectF(float arg1, float arg2, float arg3, float arg4){
  }
  public RectF(RectF arg1){
  }
  public RectF(Rect arg1){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public boolean contains(float arg1, float arg2){
    return false;
  }
  public boolean contains(float arg1, float arg2, float arg3, float arg4){
    return false;
  }
  public boolean contains(RectF arg1){
    return false;
  }
  public final boolean isEmpty(){
    return false;
  }
  public void offset(float arg1, float arg2){
  }
  public void set(float arg1, float arg2, float arg3, float arg4){
  }
  public void set(RectF arg1){
  }
  public void set(Rect arg1){
  }
  public void sort(){
  }
  public void round(Rect arg1){
  }
  public boolean intersects(float arg1, float arg2, float arg3, float arg4){
    return false;
  }
  public static boolean intersects(RectF arg1, RectF arg2){
    return false;
  }
  public void union(float arg1, float arg2, float arg3, float arg4){
  }
  public void union(RectF arg1){
  }
  public void union(float arg1, float arg2){
  }
  public void writeToParcel(android.os.Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
  public void readFromParcel(android.os.Parcel arg1){
  }
  public final float width(){
    return 0.0f;
  }
  public final float height(){
    return 0.0f;
  }
  public java.lang.String toShortString(){
    return (java.lang.String) null;
  }
  public java.lang.String toShortString(java.lang.StringBuilder arg1){
    return (java.lang.String) null;
  }
  public boolean intersect(float arg1, float arg2, float arg3, float arg4){
    return false;
  }
  public boolean intersect(RectF arg1){
    return false;
  }
  public void setEmpty(){
  }
  public void offsetTo(float arg1, float arg2){
  }
  public void inset(float arg1, float arg2){
  }
  public final float centerX(){
    return 0.0f;
  }
  public final float centerY(){
    return 0.0f;
  }
  public void printShortString(java.io.PrintWriter arg1){
  }
  public boolean setIntersect(RectF arg1, RectF arg2){
    return false;
  }
  public void roundOut(Rect arg1){
  }
}
