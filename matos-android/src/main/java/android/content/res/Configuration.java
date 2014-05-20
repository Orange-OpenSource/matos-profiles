package android.content.res;

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
public final class Configuration
  implements java.lang.Comparable<Configuration>, android.os.Parcelable
{
  // Fields

  public float fontScale;

  public int mcc;

  public int mnc;

  public java.util.Locale locale;

  public boolean userSetLocale;

  public static final int SCREENLAYOUT_SIZE_MASK = 15;

  public static final int SCREENLAYOUT_SIZE_UNDEFINED = 0;

  public static final int SCREENLAYOUT_SIZE_SMALL = 1;

  public static final int SCREENLAYOUT_SIZE_NORMAL = 2;

  public static final int SCREENLAYOUT_SIZE_LARGE = 3;

  public static final int SCREENLAYOUT_SIZE_XLARGE = 4;

  public static final int SCREENLAYOUT_LONG_MASK = 48;

  public static final int SCREENLAYOUT_LONG_UNDEFINED = 0;

  public static final int SCREENLAYOUT_LONG_NO = 16;

  public static final int SCREENLAYOUT_LONG_YES = 32;

  public static final int SCREENLAYOUT_COMPAT_NEEDED = 268435456;

  public int screenLayout;

  public static final int TOUCHSCREEN_UNDEFINED = 0;

  public static final int TOUCHSCREEN_NOTOUCH = 1;

  public static final int TOUCHSCREEN_STYLUS = 2;

  public static final int TOUCHSCREEN_FINGER = 3;

  public int touchscreen;

  public static final int KEYBOARD_UNDEFINED = 0;

  public static final int KEYBOARD_NOKEYS = 1;

  public static final int KEYBOARD_QWERTY = 2;

  public static final int KEYBOARD_12KEY = 3;

  public int keyboard;

  public static final int KEYBOARDHIDDEN_UNDEFINED = 0;

  public static final int KEYBOARDHIDDEN_NO = 1;

  public static final int KEYBOARDHIDDEN_YES = 2;

  public static final int KEYBOARDHIDDEN_SOFT = 3;

  public int keyboardHidden;

  public static final int HARDKEYBOARDHIDDEN_UNDEFINED = 0;

  public static final int HARDKEYBOARDHIDDEN_NO = 1;

  public static final int HARDKEYBOARDHIDDEN_YES = 2;

  public int hardKeyboardHidden;

  public static final int NAVIGATION_UNDEFINED = 0;

  public static final int NAVIGATION_NONAV = 1;

  public static final int NAVIGATION_DPAD = 2;

  public static final int NAVIGATION_TRACKBALL = 3;

  public static final int NAVIGATION_WHEEL = 4;

  public int navigation;

  public static final int NAVIGATIONHIDDEN_UNDEFINED = 0;

  public static final int NAVIGATIONHIDDEN_NO = 1;

  public static final int NAVIGATIONHIDDEN_YES = 2;

  public int navigationHidden;

  public static final int ORIENTATION_UNDEFINED = 0;

  public static final int ORIENTATION_PORTRAIT = 1;

  public static final int ORIENTATION_LANDSCAPE = 2;

  public static final int ORIENTATION_SQUARE = 3;

  public int orientation;

  public static final int UI_MODE_TYPE_MASK = 15;

  public static final int UI_MODE_TYPE_UNDEFINED = 0;

  public static final int UI_MODE_TYPE_NORMAL = 1;

  public static final int UI_MODE_TYPE_DESK = 2;

  public static final int UI_MODE_TYPE_CAR = 3;

  public static final int UI_MODE_TYPE_TELEVISION = 4;

  public static final int UI_MODE_NIGHT_MASK = 48;

  public static final int UI_MODE_NIGHT_UNDEFINED = 0;

  public static final int UI_MODE_NIGHT_NO = 16;

  public static final int UI_MODE_NIGHT_YES = 32;

  public int uiMode;

  public static final int SCREEN_WIDTH_DP_UNDEFINED = 0;

  public int screenWidthDp;

  public static final int SCREEN_HEIGHT_DP_UNDEFINED = 0;

  public int screenHeightDp;

  public static final int SMALLEST_SCREEN_WIDTH_DP_UNDEFINED = 0;

  public int smallestScreenWidthDp;

  public int compatScreenWidthDp;

  public int compatScreenHeightDp;

  public int compatSmallestScreenWidthDp;

  public int textLayoutDirection;

  public int seq;

  public static final android.os.Parcelable.Creator<Configuration> CREATOR = null;

  // Constructors

  public Configuration(){
  }
  public Configuration(Configuration arg1){
  }
  private Configuration(android.os.Parcel arg1){
  }
  // Methods

  public boolean equals(Configuration arg1){
    return false;
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
  public int compareTo(Configuration arg1){
    return 0;
  }
  public void writeToParcel(android.os.Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
  public int diff(Configuration arg1){
    return 0;
  }
  public void setTo(Configuration arg1){
  }
  public void readFromParcel(android.os.Parcel arg1){
  }
  public void setToDefaults(){
  }
  public void makeDefault(){
  }
  public boolean isOtherSeqNewer(Configuration arg1){
    return false;
  }
  public int updateFrom(Configuration arg1){
    return 0;
  }
  public static boolean needNewResources(int arg1, int arg2){
    return false;
  }
  public boolean isLayoutSizeAtLeast(int arg1){
    return false;
  }
}
