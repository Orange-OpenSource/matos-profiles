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

import com.francetelecom.rd.stubs.annotation.FieldSet;


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public class Address
  implements android.os.Parcelable
{
  // Fields

  public static final android.os.Parcelable.Creator<Address> CREATOR = null;

  // Constructors

  public Address(@FieldSet("locale") java.util.Locale arg1){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public void writeToParcel(android.os.Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("url")
  public java.lang.String getUrl(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("extras")
  public android.os.Bundle getExtras(){
    return (android.os.Bundle) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("phone")
  public java.lang.String getPhone(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("locale")
  public java.util.Locale getLocale(){
    return (java.util.Locale) null;
  }
  public void setExtras(@com.francetelecom.rd.stubs.annotation.FieldSet("extras") android.os.Bundle arg1){
  }
  public void setUrl(@com.francetelecom.rd.stubs.annotation.FieldSet("url") java.lang.String arg1){
  }
  public void setCountryCode(@com.francetelecom.rd.stubs.annotation.FieldSet("countryCode") java.lang.String arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("countryCode")
  public java.lang.String getCountryCode(){
    return (java.lang.String) null;
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
  public int getMaxAddressLineIndex(){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("addressLine")
  public java.lang.String getAddressLine(int arg1){
    return (java.lang.String) null;
  }
  public void setAddressLine(int arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("addressLine") java.lang.String arg2){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("featureName")
  public java.lang.String getFeatureName(){
    return (java.lang.String) null;
  }
  public void setFeatureName(@com.francetelecom.rd.stubs.annotation.FieldSet("featureName") java.lang.String arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("adminArea")
  public java.lang.String getAdminArea(){
    return (java.lang.String) null;
  }
  public void setAdminArea(@com.francetelecom.rd.stubs.annotation.FieldSet("adminArea") java.lang.String arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("subAdminArea")
  public java.lang.String getSubAdminArea(){
    return (java.lang.String) null;
  }
  public void setSubAdminArea(@com.francetelecom.rd.stubs.annotation.FieldSet("subAdminArea") java.lang.String arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("locality")
  public java.lang.String getLocality(){
    return (java.lang.String) null;
  }
  public void setLocality(@com.francetelecom.rd.stubs.annotation.FieldSet("locality") java.lang.String arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("subLocality")
  public java.lang.String getSubLocality(){
    return (java.lang.String) null;
  }
  public void setSubLocality(@com.francetelecom.rd.stubs.annotation.FieldSet("subLocality") java.lang.String arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("thoroughfare")
  public java.lang.String getThoroughfare(){
    return (java.lang.String) null;
  }
  public void setThoroughfare(@com.francetelecom.rd.stubs.annotation.FieldSet("thoroughfare") java.lang.String arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("subThoroughfare")
  public java.lang.String getSubThoroughfare(){
    return (java.lang.String) null;
  }
  public void setSubThoroughfare(@com.francetelecom.rd.stubs.annotation.FieldSet("subThoroughfare") java.lang.String arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("premises")
  public java.lang.String getPremises(){
    return (java.lang.String) null;
  }
  public void setPremises(@com.francetelecom.rd.stubs.annotation.FieldSet("premises") java.lang.String arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("postalCode")
  public java.lang.String getPostalCode(){
    return (java.lang.String) null;
  }
  public void setPostalCode(@com.francetelecom.rd.stubs.annotation.FieldSet("postalCode") java.lang.String arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("countryName")
  public java.lang.String getCountryName(){
    return (java.lang.String) null;
  }
  public void setCountryName(@com.francetelecom.rd.stubs.annotation.FieldSet("countryName") java.lang.String arg1){
  }
  public boolean hasLatitude(){
    return false;
  }
  public void clearLatitude(){
  }
  public boolean hasLongitude(){
    return false;
  }
  public void clearLongitude(){
  }
  public void setPhone(@com.francetelecom.rd.stubs.annotation.FieldSet("phone") java.lang.String arg1){
  }
}
