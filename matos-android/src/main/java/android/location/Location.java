package android.location;

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
public class Location
  implements android.os.Parcelable
{
  // Fields

  public static final int FORMAT_DEGREES = 0;

  public static final int FORMAT_MINUTES = 1;

  public static final int FORMAT_SECONDS = 2;

  public static final android.os.Parcelable.Creator<Location> CREATOR = null;

  // Constructors

  public Location(java.lang.String arg1){
  }
  public Location(Location arg1){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public void set(Location arg1){
  }
  public void reset(){
  }
  public long getTime(){
    return 0l;
  }
  public void setTime(long arg1){
  }
  public java.lang.String getProvider(){
    return (java.lang.String) null;
  }
  public void dump(android.util.Printer arg1, java.lang.String arg2){
  }
  public void writeToParcel(android.os.Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
  public android.os.Bundle getExtras(){
    return (android.os.Bundle) null;
  }
  public void setExtras(android.os.Bundle arg1){
  }
  public static java.lang.String convert(double arg1, int arg2){
    return (java.lang.String) null;
  }
  public static double convert(java.lang.String arg1){
    return 0.0d;
  }
  public float getAccuracy(){
    return 0.0f;
  }
  public void setProvider(java.lang.String arg1){
  }
  public double getAltitude(){
    return 0.0d;
  }
  public float distanceTo(Location arg1){
    return 0.0f;
  }
  public double getLatitude(){
    return 0.0d;
  }
  public double getLongitude(){
    return 0.0d;
  }
  public void setLatitude(double arg1){
  }
  public void setLongitude(double arg1){
  }
  public void setAccuracy(float arg1){
  }
  public boolean hasAccuracy(){
    return false;
  }
  public void setAltitude(double arg1){
  }
  public void removeAltitude(){
  }
  public void setSpeed(float arg1){
  }
  public void removeSpeed(){
  }
  public void setBearing(float arg1){
  }
  public void removeBearing(){
  }
  public void removeAccuracy(){
  }
  public static void distanceBetween(double arg1, double arg2, double arg3, double arg4, float [] arg5){
  }
  public float bearingTo(Location arg1){
    return 0.0f;
  }
  public boolean hasAltitude(){
    return false;
  }
  public boolean hasSpeed(){
    return false;
  }
  public float getSpeed(){
    return 0.0f;
  }
  public boolean hasBearing(){
    return false;
  }
  public float getBearing(){
    return 0.0f;
  }
}
