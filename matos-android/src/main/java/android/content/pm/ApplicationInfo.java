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
public class ApplicationInfo
  extends PackageItemInfo  implements android.os.Parcelable
{
  // Classes

  public static class DisplayNameComparator
    implements java.util.Comparator<ApplicationInfo>
  {
    // Constructors

    public DisplayNameComparator(PackageManager arg1){
    }
    // Methods

    public final int compare(ApplicationInfo arg1, ApplicationInfo arg2){
      return 0;
    }
  }
  // Fields

  public java.lang.String taskAffinity;

  public java.lang.String permission;

  public java.lang.String processName;

  public java.lang.String className;

  public int descriptionRes;

  public int theme;

  public java.lang.String manageSpaceActivityName;

  public java.lang.String backupAgentName;

  public int uiOptions;

  public static final int FLAG_SYSTEM = 1;

  public static final int FLAG_DEBUGGABLE = 2;

  public static final int FLAG_HAS_CODE = 4;

  public static final int FLAG_PERSISTENT = 8;

  public static final int FLAG_FACTORY_TEST = 16;

  public static final int FLAG_ALLOW_TASK_REPARENTING = 32;

  public static final int FLAG_ALLOW_CLEAR_USER_DATA = 64;

  public static final int FLAG_UPDATED_SYSTEM_APP = 128;

  public static final int FLAG_TEST_ONLY = 256;

  public static final int FLAG_SUPPORTS_SMALL_SCREENS = 512;

  public static final int FLAG_SUPPORTS_NORMAL_SCREENS = 1024;

  public static final int FLAG_SUPPORTS_LARGE_SCREENS = 2048;

  public static final int FLAG_RESIZEABLE_FOR_SCREENS = 4096;

  public static final int FLAG_SUPPORTS_SCREEN_DENSITIES = 8192;

  public static final int FLAG_VM_SAFE_MODE = 16384;

  public static final int FLAG_ALLOW_BACKUP = 32768;

  public static final int FLAG_KILL_AFTER_RESTORE = 65536;

  public static final int FLAG_RESTORE_ANY_VERSION = 131072;

  public static final int FLAG_EXTERNAL_STORAGE = 262144;

  public static final int FLAG_SUPPORTS_XLARGE_SCREENS = 524288;

  public static final int FLAG_LARGE_HEAP = 1048576;

  public static final int FLAG_STOPPED = 2097152;

  public static final int FLAG_FORWARD_LOCK = 536870912;

  public static final int FLAG_CANT_SAVE_STATE = 268435456;

  public int flags;

  public int requiresSmallestWidthDp;

  public int compatibleWidthLimitDp;

  public int largestWidthLimitDp;

  public java.lang.String sourceDir;

  public java.lang.String publicSourceDir;

  public java.lang.String [] resourceDirs;

  public java.lang.String [] sharedLibraryFiles;

  public java.lang.String dataDir;

  public java.lang.String nativeLibraryDir;

  public int uid;

  public int targetSdkVersion;

  public boolean enabled;

  public int enabledSetting;

  public int installLocation;

  public static final android.os.Parcelable.Creator<ApplicationInfo> CREATOR = null;

  // Constructors

  public ApplicationInfo(){
    super();
  }
  public ApplicationInfo(ApplicationInfo arg1){
    super();
  }
  private ApplicationInfo(android.os.Parcel arg1){
    super();
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public void dump(android.util.Printer arg1, java.lang.String arg2){
  }
  protected ApplicationInfo getApplicationInfo(){
    return (ApplicationInfo) null;
  }
  public void writeToParcel(android.os.Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
  public java.lang.CharSequence loadDescription(PackageManager arg1){
    return (java.lang.CharSequence) null;
  }
  protected android.graphics.drawable.Drawable loadDefaultIcon(PackageManager arg1){
    return (android.graphics.drawable.Drawable) null;
  }
  public void disableCompatibilityMode(){
  }
}
