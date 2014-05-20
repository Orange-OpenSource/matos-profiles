package android.accessibilityservice;

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
public class AccessibilityServiceInfo
  implements android.os.Parcelable
{
  // Fields

  public static final int FEEDBACK_SPOKEN = 1;

  public static final int FEEDBACK_HAPTIC = 2;

  public static final int FEEDBACK_AUDIBLE = 4;

  public static final int FEEDBACK_VISUAL = 8;

  public static final int FEEDBACK_GENERIC = 16;

  public static final int FEEDBACK_ALL_MASK = -1;

  public static final int DEFAULT = 1;

  public int eventTypes;

  public java.lang.String [] packageNames;

  public int feedbackType;

  public long notificationTimeout;

  public int flags;

  public static final android.os.Parcelable.Creator<AccessibilityServiceInfo> CREATOR = null;

  // Constructors

  public AccessibilityServiceInfo(){
  }
  public AccessibilityServiceInfo(android.content.pm.ResolveInfo arg1, android.content.Context arg2) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException{
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public java.lang.String getId(){
    return (java.lang.String) null;
  }
  public void writeToParcel(android.os.Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
  public java.lang.String getDescription(){
    return (java.lang.String) null;
  }
  public void updateDynamicallyConfigurableProperties(AccessibilityServiceInfo arg1){
  }
  public android.content.pm.ResolveInfo getResolveInfo(){
    return (android.content.pm.ResolveInfo) null;
  }
  public java.lang.String getSettingsActivityName(){
    return (java.lang.String) null;
  }
  public boolean getCanRetrieveWindowContent(){
    return false;
  }
  public static java.lang.String feedbackTypeToString(int arg1){
    return (java.lang.String) null;
  }
  public static java.lang.String flagToString(int arg1){
    return (java.lang.String) null;
  }
}
