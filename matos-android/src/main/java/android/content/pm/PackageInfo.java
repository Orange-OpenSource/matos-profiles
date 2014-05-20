package android.content.pm;

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
public class PackageInfo
  implements android.os.Parcelable
{
  // Fields

  public java.lang.String packageName;

  public int versionCode;

  public java.lang.String versionName;

  public java.lang.String sharedUserId;

  public int sharedUserLabel;

  public ApplicationInfo applicationInfo;

  public long firstInstallTime;

  public long lastUpdateTime;

  public int [] gids;

  public ActivityInfo [] activities;

  public ActivityInfo [] receivers;

  public ServiceInfo [] services;

  public ProviderInfo [] providers;

  public InstrumentationInfo [] instrumentation;

  public PermissionInfo [] permissions;

  public java.lang.String [] requestedPermissions;

  public Signature [] signatures;

  public ConfigurationInfo [] configPreferences;

  public FeatureInfo [] reqFeatures;

  public static final int INSTALL_LOCATION_UNSPECIFIED = -1;

  public static final int INSTALL_LOCATION_AUTO = 0;

  public static final int INSTALL_LOCATION_INTERNAL_ONLY = 1;

  public static final int INSTALL_LOCATION_PREFER_EXTERNAL = 2;

  public int installLocation;

  public static final android.os.Parcelable.Creator<PackageInfo> CREATOR = null;

  // Constructors

  public PackageInfo(){
  }
  private PackageInfo(android.os.Parcel arg1){
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
}
