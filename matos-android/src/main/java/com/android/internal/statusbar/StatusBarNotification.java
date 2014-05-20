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

@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public class StatusBarNotification
  implements android.os.Parcelable
{
  // Fields

  public static int PRIORITY_JIFFY_EXPRESS;

  public static int PRIORITY_NORMAL;

  public static int PRIORITY_ONGOING;

  public static int PRIORITY_SYSTEM;

  public java.lang.String pkg;

  public int id;

  public java.lang.String tag;

  public int uid;

  public int initialPid;

  public android.app.Notification notification;

  public int priority;

  public static final android.os.Parcelable.Creator<StatusBarNotification> CREATOR = null;

  // Constructors

  public StatusBarNotification(){
  }
  public StatusBarNotification(java.lang.String arg1, int arg2, java.lang.String arg3, int arg4, int arg5, android.app.Notification arg6){
  }
  public StatusBarNotification(android.os.Parcel arg1){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public StatusBarNotification clone(){
    return (StatusBarNotification) null;
  }
  public void writeToParcel(android.os.Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
  public void readFromParcel(android.os.Parcel arg1){
  }
  public boolean isOngoing(){
    return false;
  }
  public boolean isClearable(){
    return false;
  }
}
