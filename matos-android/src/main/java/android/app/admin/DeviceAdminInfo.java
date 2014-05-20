package android.app.admin;

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


public final class DeviceAdminInfo
  implements android.os.Parcelable
{
  // Classes

  public static class PolicyInfo
  {
    // Fields

    public final int ident = 0;

    public final java.lang.String tag = (java.lang.String) null;

    public final int label = 0;

    public final int description = 0;

    // Constructors

    public PolicyInfo(int arg1, java.lang.String arg2, int arg3, int arg4){
    }
  }
  // Fields

  public static final int USES_POLICY_LIMIT_PASSWORD = 0;

  public static final int USES_POLICY_WATCH_LOGIN = 1;

  public static final int USES_POLICY_RESET_PASSWORD = 2;

  public static final int USES_POLICY_FORCE_LOCK = 3;

  public static final int USES_POLICY_WIPE_DATA = 4;

  public static final int USES_POLICY_SETS_GLOBAL_PROXY = 5;

  public static final int USES_POLICY_EXPIRE_PASSWORD = 6;

  public static final int USES_ENCRYPTED_STORAGE = 7;

  public static final int USES_POLICY_DISABLE_CAMERA = 8;

  public static final android.os.Parcelable.Creator<DeviceAdminInfo> CREATOR = null;

  // Constructors

  public DeviceAdminInfo(android.content.Context arg1, android.content.pm.ResolveInfo arg2) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException{
  }
  DeviceAdminInfo(android.os.Parcel arg1){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public java.lang.String getPackageName(){
    return (java.lang.String) null;
  }
  public boolean isVisible(){
    return false;
  }
  public void dump(android.util.Printer arg1, java.lang.String arg2){
  }
  public void writeToParcel(android.os.Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
  public boolean usesPolicy(int arg1){
    return false;
  }
  public android.content.ComponentName getComponent(){
    return (android.content.ComponentName) null;
  }
  public java.lang.CharSequence loadLabel(android.content.pm.PackageManager arg1){
    return (java.lang.CharSequence) null;
  }
  public android.graphics.drawable.Drawable loadIcon(android.content.pm.PackageManager arg1){
    return (android.graphics.drawable.Drawable) null;
  }
  public java.lang.String getReceiverName(){
    return (java.lang.String) null;
  }
  public android.content.pm.ActivityInfo getActivityInfo(){
    return (android.content.pm.ActivityInfo) null;
  }
  public java.lang.CharSequence loadDescription(android.content.pm.PackageManager arg1) throws android.content.res.Resources.NotFoundException{
    return (java.lang.CharSequence) null;
  }
  public java.lang.String getTagForPolicy(int arg1){
    return (java.lang.String) null;
  }
  public java.util.ArrayList<DeviceAdminInfo.PolicyInfo> getUsedPolicies(){
    return (java.util.ArrayList) null;
  }
  public void writePoliciesToXml(@com.francetelecom.rd.stubs.annotation.CallBackRegister("xmlSerializer") org.xmlpull.v1.XmlSerializer arg1) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.io.IOException{
  }
  public void readPoliciesFromXml(@com.francetelecom.rd.stubs.annotation.CallBackRegister("xmlPullParser") org.xmlpull.v1.XmlPullParser arg1) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException{
  }
}
