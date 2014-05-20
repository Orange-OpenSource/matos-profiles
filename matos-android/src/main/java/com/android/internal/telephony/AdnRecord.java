package com.android.internal.telephony;

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


public class AdnRecord
  implements android.os.Parcelable
{
  // Fields

  public static final android.os.Parcelable.Creator<AdnRecord> CREATOR = null;

  // Constructors

  public AdnRecord(byte [] arg1){
  }
  public AdnRecord(int arg1, int arg2, byte [] arg3){
  }
  public AdnRecord(java.lang.String arg1, java.lang.String arg2){
  }
  public AdnRecord(java.lang.String arg1, java.lang.String arg2, java.lang.String [] arg3){
  }
  public AdnRecord(int arg1, int arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String [] arg5){
  }
  public AdnRecord(int arg1, int arg2, java.lang.String arg3, java.lang.String arg4){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public boolean isEmpty(){
    return false;
  }
  public java.lang.String getNumber(){
    return (java.lang.String) null;
  }
  public boolean isEqual(AdnRecord arg1){
    return false;
  }
  public void writeToParcel(android.os.Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
  public void setEmails(java.lang.String [] arg1){
  }
  public java.lang.String getAlphaTag(){
    return (java.lang.String) null;
  }
  public java.lang.String [] getEmails(){
    return (java.lang.String []) null;
  }
  public byte [] buildAdnString(int arg1){
    return (byte []) null;
  }
  public boolean hasExtendedRecord(){
    return false;
  }
  public void appendExtRecord(byte [] arg1){
  }
}