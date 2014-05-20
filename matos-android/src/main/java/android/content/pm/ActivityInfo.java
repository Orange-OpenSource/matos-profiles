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
public class ActivityInfo
  extends ComponentInfo  implements android.os.Parcelable
{
  // Fields

  public int theme;

  public static final int LAUNCH_MULTIPLE = 0;

  public static final int LAUNCH_SINGLE_TOP = 1;

  public static final int LAUNCH_SINGLE_TASK = 2;

  public static final int LAUNCH_SINGLE_INSTANCE = 3;

  public int launchMode;

  public java.lang.String permission;

  public java.lang.String taskAffinity;

  public java.lang.String targetActivity;

  public static final int FLAG_MULTIPROCESS = 1;

  public static final int FLAG_FINISH_ON_TASK_LAUNCH = 2;

  public static final int FLAG_CLEAR_TASK_ON_LAUNCH = 4;

  public static final int FLAG_ALWAYS_RETAIN_TASK_STATE = 8;

  public static final int FLAG_STATE_NOT_NEEDED = 16;

  public static final int FLAG_EXCLUDE_FROM_RECENTS = 32;

  public static final int FLAG_ALLOW_TASK_REPARENTING = 64;

  public static final int FLAG_NO_HISTORY = 128;

  public static final int FLAG_FINISH_ON_CLOSE_SYSTEM_DIALOGS = 256;

  public static final int FLAG_HARDWARE_ACCELERATED = 512;

  public static final int FLAG_IMMERSIVE = 1024;

  public int flags;

  public static final int SCREEN_ORIENTATION_UNSPECIFIED = -1;

  public static final int SCREEN_ORIENTATION_LANDSCAPE = 0;

  public static final int SCREEN_ORIENTATION_PORTRAIT = 1;

  public static final int SCREEN_ORIENTATION_USER = 2;

  public static final int SCREEN_ORIENTATION_BEHIND = 3;

  public static final int SCREEN_ORIENTATION_SENSOR = 4;

  public static final int SCREEN_ORIENTATION_NOSENSOR = 5;

  public static final int SCREEN_ORIENTATION_SENSOR_LANDSCAPE = 6;

  public static final int SCREEN_ORIENTATION_SENSOR_PORTRAIT = 7;

  public static final int SCREEN_ORIENTATION_REVERSE_LANDSCAPE = 8;

  public static final int SCREEN_ORIENTATION_REVERSE_PORTRAIT = 9;

  public static final int SCREEN_ORIENTATION_FULL_SENSOR = 10;

  public int screenOrientation;

  public static final int CONFIG_MCC = 1;

  public static final int CONFIG_MNC = 2;

  public static final int CONFIG_LOCALE = 4;

  public static final int CONFIG_TOUCHSCREEN = 8;

  public static final int CONFIG_KEYBOARD = 16;

  public static final int CONFIG_KEYBOARD_HIDDEN = 32;

  public static final int CONFIG_NAVIGATION = 64;

  public static final int CONFIG_ORIENTATION = 128;

  public static final int CONFIG_SCREEN_LAYOUT = 256;

  public static final int CONFIG_UI_MODE = 512;

  public static final int CONFIG_SCREEN_SIZE = 1024;

  public static final int CONFIG_SMALLEST_SCREEN_SIZE = 2048;

  public static final int CONFIG_FONT_SCALE = 1073741824;

  public static int [] CONFIG_NATIVE_BITS;

  public int configChanges;

  public int softInputMode;

  public int uiOptions;

  public static final int UIOPTION_SPLIT_ACTION_BAR_WHEN_NARROW = 1;

  public static final android.os.Parcelable.Creator<ActivityInfo> CREATOR = null;

  // Constructors

  public ActivityInfo(){
    super();
  }
  public ActivityInfo(ActivityInfo arg1){
    super();
  }
  private ActivityInfo(android.os.Parcel arg1){
    super();
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public void dump(android.util.Printer arg1, java.lang.String arg2){
  }
  public void writeToParcel(android.os.Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
  public final int getThemeResource(){
    return 0;
  }
  public static int activityInfoConfigToNative(int arg1){
    return 0;
  }
  public int getRealConfigChanged(){
    return 0;
  }
}
