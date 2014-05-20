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
public final class Rect
  implements android.os.Parcelable
{
  // Fields

  public int left;

  public int top;

  public int right;

  public int bottom;

  public static final android.os.Parcelable.Creator<Rect> CREATOR = null;

  // Constructors

  public Rect(){
  }
  public Rect(int arg1, int arg2, int arg3, int arg4){
  }
  public Rect(Rect arg1){
  }
  // Methods

  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public boolean contains(int arg1, int arg2){
    return false;
  }
  public boolean contains(int arg1, int arg2, int arg3, int arg4){
    return false;
  }
  public boolean contains(Rect arg1){
    return false;
  }
  public final boolean isEmpty(){
    return false;
  }
  public void offset(int arg1, int arg2){
  }
  public void set(int arg1, int arg2, int arg3, int arg4){
  }
  public void set(Rect arg1){
  }
  public void sort(){
  }
  public void scale(float arg1){
  }
  public boolean intersects(int arg1, int arg2, int arg3, int arg4){
    return false;
  }
  public static boolean intersects(Rect arg1, Rect arg2){
    return false;
  }
  public void union(int arg1, int arg2, int arg3, int arg4){
  }
  public void union(Rect arg1){
  }
  public void union(int arg1, int arg2){
  }
  public void writeToParcel(android.os.Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
  public void readFromParcel(android.os.Parcel arg1){
  }
  public final int width(){
    return 0;
  }
  public final int height(){
    return 0;
  }
  public java.lang.String toShortString(){
    return (java.lang.String) null;
  }
  public java.lang.String toShortString(java.lang.StringBuilder arg1){
    return (java.lang.String) null;
  }
  public boolean intersect(int arg1, int arg2, int arg3, int arg4){
    return false;
  }
  public boolean intersect(Rect arg1){
    return false;
  }
  public void setEmpty(){
  }
  public void offsetTo(int arg1, int arg2){
  }
  public void inset(int arg1, int arg2){
  }
  public final int centerX(){
    return 0;
  }
  public final int centerY(){
    return 0;
  }
  public void printShortString(java.io.PrintWriter arg1){
  }
  public boolean setIntersect(Rect arg1, Rect arg2){
    return false;
  }
  public java.lang.String flattenToString(){
    return (java.lang.String) null;
  }
  public static Rect unflattenFromString(java.lang.String arg1){
    return (Rect) null;
  }
  public final float exactCenterX(){
    return 0.0f;
  }
  public final float exactCenterY(){
    return 0.0f;
  }
}
