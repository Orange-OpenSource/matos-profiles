package android.content;

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


public final class ContentValues
  implements android.os.Parcelable
{
  // Fields

  public static final java.lang.String TAG = "ContentValues";

  public static final android.os.Parcelable.Creator<ContentValues> CREATOR = null;

  // Constructors

  public ContentValues(){
  }
  public ContentValues(int arg1){
  }
  public ContentValues(ContentValues arg1){
  }
  private ContentValues(java.util.HashMap<java.lang.String, java.lang.Object> arg1){
  }
  // Methods

  public java.lang.Object get(java.lang.String arg1){
    return (java.lang.Object) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "ContentValues.put-1", pos = {0, 1, 2}, report = "-")
  public void put(java.lang.String arg1, java.lang.String arg2){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "ContentValues.put-2", pos = {0, 1, 2}, report = "-")
  public void put(java.lang.String arg1, java.lang.Byte arg2){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "ContentValues.put-3", pos = {0, 1, 2}, report = "-")
  public void put(java.lang.String arg1, java.lang.Short arg2){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "ContentValues.put-4", pos = {0, 1, 2}, report = "-")
  public void put(java.lang.String arg1, java.lang.Integer arg2){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "ContentValues.put-5", pos = {0, 1, 2}, report = "-")
  public void put(java.lang.String arg1, java.lang.Long arg2){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "ContentValues.put-6", pos = {0, 1}, report = "-")
  public void put(java.lang.String arg1, java.lang.Float arg2){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "ContentValues.put-7", pos = {0, 1, 2}, report = "-")
  public void put(java.lang.String arg1, java.lang.Double arg2){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "ContentValues.put-8", pos = {0, 1, 2}, report = "-")
  public void put(java.lang.String arg1, java.lang.Boolean arg2){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "ContentValues.put-9", pos = {0, 1}, report = "-")
  public void put(java.lang.String arg1, byte [] arg2){
  }
  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public int hashCode(){
    return 0;
  }
  public void clear(){
  }
  public void putAll(ContentValues arg1){
  }
  public int size(){
    return 0;
  }
  public void remove(java.lang.String arg1){
  }
  public java.util.Set<java.lang.String> keySet(){
    return (java.util.Set) null;
  }
  public boolean containsKey(java.lang.String arg1){
    return false;
  }
  public void writeToParcel(android.os.Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
  public java.util.Set<java.util.Map.Entry<java.lang.String, java.lang.Object>> valueSet(){
    return (java.util.Set) null;
  }
  public void putNull(java.lang.String arg1){
  }
  public java.lang.Integer getAsInteger(java.lang.String arg1){
    return (java.lang.Integer) null;
  }
  public java.lang.Float getAsFloat(java.lang.String arg1){
    return (java.lang.Float) null;
  }
  public java.lang.String getAsString(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public java.lang.Long getAsLong(java.lang.String arg1){
    return (java.lang.Long) null;
  }
  public java.lang.Short getAsShort(java.lang.String arg1){
    return (java.lang.Short) null;
  }
  public java.lang.Byte getAsByte(java.lang.String arg1){
    return (java.lang.Byte) null;
  }
  public java.lang.Double getAsDouble(java.lang.String arg1){
    return (java.lang.Double) null;
  }
  public java.lang.Boolean getAsBoolean(java.lang.String arg1){
    return (java.lang.Boolean) null;
  }
  public byte [] getAsByteArray(java.lang.String arg1){
    return (byte []) null;
  }
  public void putStringArrayList(java.lang.String arg1, java.util.ArrayList<java.lang.String> arg2){
  }
  public java.util.ArrayList<java.lang.String> getStringArrayList(java.lang.String arg1){
    return (java.util.ArrayList) null;
  }
}
