package com.android.internal.statusbar;

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


public class StatusBarIconList
  implements android.os.Parcelable
{
  // Fields

  public static final android.os.Parcelable.Creator<StatusBarIconList> CREATOR = null;

  // Constructors

  public StatusBarIconList(){
  }
  public StatusBarIconList(android.os.Parcel arg1){
  }
  // Methods

  public int size(){
    return 0;
  }
  public java.lang.String getSlot(int arg1){
    return (java.lang.String) null;
  }
  public void dump(java.io.PrintWriter arg1){
  }
  public void writeToParcel(android.os.Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
  public void setIcon(int arg1, StatusBarIcon arg2){
  }
  public StatusBarIcon getIcon(int arg1){
    return (StatusBarIcon) null;
  }
  public void readFromParcel(android.os.Parcel arg1){
  }
  public void removeIcon(int arg1){
  }
  public void copyFrom(StatusBarIconList arg1){
  }
  public void defineSlots(java.lang.String [] arg1){
  }
  public int getSlotIndex(java.lang.String arg1){
    return 0;
  }
  public int getViewIndex(int arg1){
    return 0;
  }
}
