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
public class Region
  implements android.os.Parcelable
{
  // Classes

  public static enum Op
  {
    // Enum Constants

    DIFFERENCE(0)
, INTERSECT(0)
, UNION(0)
, XOR(0)
, REVERSE_DIFFERENCE(0)
, REPLACE(0)
;
    // Fields

    public final int nativeInt = 0;

    // Constructors

    private Op(int arg1){
    }
    // Methods

  }
  // Fields

  public final int mNativeRegion = 0;

  public static final android.os.Parcelable.Creator<Region> CREATOR = null;

  // Constructors

  public Region(){
  }
  public Region(Region arg1){
  }
  public Region(Rect arg1){
  }
  public Region(int arg1, int arg2, int arg3, int arg4){
  }
  Region(int arg1){
  }
  private Region(int arg1, int arg2){
  }
  // Methods

  protected void finalize() throws java.lang.Throwable{
  }
  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public boolean contains(int arg1, int arg2){
    return false;
  }
  public boolean isEmpty(){
    return false;
  }
  public boolean set(Region arg1){
    return false;
  }
  public boolean set(Rect arg1){
    return false;
  }
  public boolean set(int arg1, int arg2, int arg3, int arg4){
    return false;
  }
  public void scale(float arg1){
  }
  public void scale(float arg1, Region arg2){
  }
  public Rect getBounds(){
    return (Rect) null;
  }
  public boolean getBounds(Rect arg1){
    return false;
  }
  public final boolean union(Rect arg1){
    return false;
  }
  public boolean setPath(Path arg1, Region arg2){
    return false;
  }
  public void writeToParcel(android.os.Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
  public void setEmpty(){
  }
  public boolean op(Rect arg1, Region.Op arg2){
    return false;
  }
  public boolean op(int arg1, int arg2, int arg3, int arg4, Region.Op arg5){
    return false;
  }
  public boolean op(Region arg1, Region.Op arg2){
    return false;
  }
  public boolean op(Rect arg1, Region arg2, Region.Op arg3){
    return false;
  }
  public boolean op(Region arg1, Region arg2, Region.Op arg3){
    return false;
  }
  public boolean quickReject(Rect arg1){
    return false;
  }
  public boolean quickReject(int arg1, int arg2, int arg3, int arg4){
    return false;
  }
  public boolean quickReject(Region arg1){
    return false;
  }
  public void translate(int arg1, int arg2){
  }
  public void translate(int arg1, int arg2, Region arg3){
  }
  public boolean isComplex(){
    return false;
  }
  public boolean isRect(){
    return false;
  }
  public Path getBoundaryPath(){
    return (Path) null;
  }
  public boolean getBoundaryPath(Path arg1){
    return false;
  }
  public boolean quickContains(Rect arg1){
    return false;
  }
  public boolean quickContains(int arg1, int arg2, int arg3, int arg4){
    return false;
  }
}
