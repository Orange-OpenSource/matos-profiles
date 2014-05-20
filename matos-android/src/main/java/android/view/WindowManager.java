package android.view;

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
public interface WindowManager
  extends ViewManager
{
  // Classes

  public static class BadTokenException
    extends java.lang.RuntimeException  {
    // Constructors

    public BadTokenException(){
      super();
    }
    public BadTokenException(java.lang.String arg1){
      super();
    }
  }
  public static class LayoutParams
    extends ViewGroup.LayoutParams    implements android.os.Parcelable
  {
    // Fields

    public int x;

    public int y;

    public float horizontalWeight;

    public float verticalWeight;

    @com.francetelecom.rd.stubs.annotation.FieldRule(value = "LayoutFormat.type", report = "-")
    public int type;

    public static final int FIRST_APPLICATION_WINDOW = 1;

    public static final int TYPE_BASE_APPLICATION = 1;

    public static final int TYPE_APPLICATION = 2;

    public static final int TYPE_APPLICATION_STARTING = 3;

    public static final int LAST_APPLICATION_WINDOW = 99;

    public static final int FIRST_SUB_WINDOW = 1000;

    public static final int TYPE_APPLICATION_PANEL = 1000;

    public static final int TYPE_APPLICATION_MEDIA = 1001;

    public static final int TYPE_APPLICATION_SUB_PANEL = 1002;

    public static final int TYPE_APPLICATION_ATTACHED_DIALOG = 1003;

    public static final int TYPE_APPLICATION_MEDIA_OVERLAY = 1004;

    public static final int LAST_SUB_WINDOW = 1999;

    public static final int FIRST_SYSTEM_WINDOW = 2000;

    public static final int TYPE_STATUS_BAR = 2000;

    public static final int TYPE_SEARCH_BAR = 2001;

    public static final int TYPE_PHONE = 2002;

    public static final int TYPE_SYSTEM_ALERT = 2003;

    public static final int TYPE_KEYGUARD = 2004;

    public static final int TYPE_TOAST = 2005;

    public static final int TYPE_SYSTEM_OVERLAY = 2006;

    public static final int TYPE_PRIORITY_PHONE = 2007;

    public static final int TYPE_SYSTEM_DIALOG = 2008;

    public static final int TYPE_KEYGUARD_DIALOG = 2009;

    public static final int TYPE_SYSTEM_ERROR = 2010;

    public static final int TYPE_INPUT_METHOD = 2011;

    public static final int TYPE_INPUT_METHOD_DIALOG = 2012;

    public static final int TYPE_WALLPAPER = 2013;

    public static final int TYPE_STATUS_BAR_PANEL = 2014;

    public static final int TYPE_SECURE_SYSTEM_OVERLAY = 2015;

    public static final int TYPE_DRAG = 2016;

    public static final int TYPE_STATUS_BAR_SUB_PANEL = 2017;

    public static final int TYPE_POINTER = 2018;

    public static final int TYPE_NAVIGATION_BAR = 2019;

    public static final int TYPE_VOLUME_OVERLAY = 2020;

    public static final int TYPE_BOOT_PROGRESS = 2021;

    public static final int TYPE_HIDDEN_NAV_CONSUMER = 2022;

    public static final int LAST_SYSTEM_WINDOW = 2999;

    public static final int MEMORY_TYPE_NORMAL = 0;

    public static final int MEMORY_TYPE_HARDWARE = 1;

    public static final int MEMORY_TYPE_GPU = 2;

    public static final int MEMORY_TYPE_PUSH_BUFFERS = 3;

    public int memoryType;

    public static final int FLAG_ALLOW_LOCK_WHILE_SCREEN_ON = 1;

    public static final int FLAG_DIM_BEHIND = 2;

    public static final int FLAG_BLUR_BEHIND = 4;

    public static final int FLAG_NOT_FOCUSABLE = 8;

    public static final int FLAG_NOT_TOUCHABLE = 16;

    public static final int FLAG_NOT_TOUCH_MODAL = 32;

    public static final int FLAG_TOUCHABLE_WHEN_WAKING = 64;

    public static final int FLAG_KEEP_SCREEN_ON = 128;

    public static final int FLAG_LAYOUT_IN_SCREEN = 256;

    public static final int FLAG_LAYOUT_NO_LIMITS = 512;

    public static final int FLAG_FULLSCREEN = 1024;

    public static final int FLAG_FORCE_NOT_FULLSCREEN = 2048;

    public static final int FLAG_DITHER = 4096;

    public static final int FLAG_SECURE = 8192;

    public static final int FLAG_SCALED = 16384;

    public static final int FLAG_IGNORE_CHEEK_PRESSES = 32768;

    public static final int FLAG_LAYOUT_INSET_DECOR = 65536;

    public static final int FLAG_ALT_FOCUSABLE_IM = 131072;

    public static final int FLAG_WATCH_OUTSIDE_TOUCH = 262144;

    public static final int FLAG_SHOW_WHEN_LOCKED = 524288;

    public static final int FLAG_SHOW_WALLPAPER = 1048576;

    public static final int FLAG_TURN_SCREEN_ON = 2097152;

    public static final int FLAG_DISMISS_KEYGUARD = 4194304;

    public static final int FLAG_SPLIT_TOUCH = 8388608;

    public static final int FLAG_HARDWARE_ACCELERATED = 16777216;

    public static final int FLAG_SLIPPERY = 67108864;

    public static final int FLAG_NEEDS_MENU_KEY = 134217728;

    public static final int FLAG_KEEP_SURFACE_WHILE_ANIMATING = 268435456;

    public static final int FLAG_COMPATIBLE_WINDOW = 536870912;

    public static final int FLAG_SYSTEM_ERROR = 1073741824;

    @com.francetelecom.rd.stubs.annotation.FieldRule(value = "LayoutFormat.flags", report = "-")
    public int flags;

    public static final int PRIVATE_FLAG_FAKE_HARDWARE_ACCELERATED = 1;

    public static final int PRIVATE_FLAG_FORCE_HARDWARE_ACCELERATED = 2;

    public int privateFlags;

    public static final int SOFT_INPUT_MASK_STATE = 15;

    public static final int SOFT_INPUT_STATE_UNSPECIFIED = 0;

    public static final int SOFT_INPUT_STATE_UNCHANGED = 1;

    public static final int SOFT_INPUT_STATE_HIDDEN = 2;

    public static final int SOFT_INPUT_STATE_ALWAYS_HIDDEN = 3;

    public static final int SOFT_INPUT_STATE_VISIBLE = 4;

    public static final int SOFT_INPUT_STATE_ALWAYS_VISIBLE = 5;

    public static final int SOFT_INPUT_MASK_ADJUST = 240;

    public static final int SOFT_INPUT_ADJUST_UNSPECIFIED = 0;

    public static final int SOFT_INPUT_ADJUST_RESIZE = 16;

    public static final int SOFT_INPUT_ADJUST_PAN = 32;

    public static final int SOFT_INPUT_ADJUST_NOTHING = 48;

    public static final int SOFT_INPUT_IS_FORWARD_NAVIGATION = 256;

    public int softInputMode;

    public int gravity;

    public float horizontalMargin;

    public float verticalMargin;

    public int format;

    public int windowAnimations;

    public float alpha;

    public float dimAmount;

    public static final float BRIGHTNESS_OVERRIDE_NONE = -1.0f;

    public static final float BRIGHTNESS_OVERRIDE_OFF = 0.0f;

    public static final float BRIGHTNESS_OVERRIDE_FULL = 1.0f;

    public float screenBrightness;

    public float buttonBrightness;

    public android.os.IBinder token;

    public java.lang.String packageName;

    public int screenOrientation;

    public int systemUiVisibility;

    public int subtreeSystemUiVisibility;

    public boolean hasSystemUiListeners;

    public static final int INPUT_FEATURE_DISABLE_POINTER_GESTURES = 1;

    public static final int INPUT_FEATURE_NO_INPUT_CHANNEL = 2;

    public int inputFeatures;

    public static final android.os.Parcelable.Creator<WindowManager.LayoutParams> CREATOR = null;

    public static final int LAYOUT_CHANGED = 1;

    public static final int TYPE_CHANGED = 2;

    public static final int FLAGS_CHANGED = 4;

    public static final int FORMAT_CHANGED = 8;

    public static final int ANIMATION_CHANGED = 16;

    public static final int DIM_AMOUNT_CHANGED = 32;

    public static final int TITLE_CHANGED = 64;

    public static final int ALPHA_CHANGED = 128;

    public static final int MEMORY_TYPE_CHANGED = 256;

    public static final int SOFT_INPUT_MODE_CHANGED = 512;

    public static final int SCREEN_ORIENTATION_CHANGED = 1024;

    public static final int SCREEN_BRIGHTNESS_CHANGED = 2048;

    public static final int BUTTON_BRIGHTNESS_CHANGED = 4096;

    public static final int SYSTEM_UI_VISIBILITY_CHANGED = 8192;

    public static final int SYSTEM_UI_LISTENER_CHANGED = 16384;

    public static final int INPUT_FEATURES_CHANGED = 32768;

    public static final int PRIVATE_FLAGS_CHANGED = 65536;

    public static final int EVERYTHING_CHANGED = -1;

    // Constructors

    public LayoutParams(){
      super((android.content.Context) null, (android.util.AttributeSet) null);
    }
    @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "LayoutParams-1", pos = 1, report = "-")
    public LayoutParams(int arg1){
      super((android.content.Context) null, (android.util.AttributeSet) null);
    }
    @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "LayoutParams-2", pos = {1, 2}, report = "-")
    public LayoutParams(int arg1, int arg2){
      super((android.content.Context) null, (android.util.AttributeSet) null);
    }
    @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "LayoutParams-3", pos = 1, report = "-")
    public LayoutParams(int arg1, int arg2, int arg3){
      super((android.content.Context) null, (android.util.AttributeSet) null);
    }
    @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "LayoutParams-4", pos = {3, 4}, report = "-")
    public LayoutParams(int arg1, int arg2, int arg3, int arg4, int arg5){
      super((android.content.Context) null, (android.util.AttributeSet) null);
    }
    @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "LayoutParams-5", pos = {5, 6}, report = "-")
    public LayoutParams(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7){
      super((android.content.Context) null, (android.util.AttributeSet) null);
    }
    public LayoutParams(android.os.Parcel arg1){
      super((android.content.Context) null, (android.util.AttributeSet) null);
    }
    // Methods

    public java.lang.String toString(){
      return (java.lang.String) null;
    }
    public java.lang.String debug(java.lang.String arg1){
      return (java.lang.String) null;
    }
    public void scale(float arg1){
    }
    public final void setTitle(java.lang.CharSequence arg1){
    }
    public final java.lang.CharSequence getTitle(){
      return (java.lang.CharSequence) null;
    }
    public void writeToParcel(android.os.Parcel arg1, int arg2){
    }
    public int describeContents(){
      return 0;
    }
    public final int copyFrom(WindowManager.LayoutParams arg1){
      return 0;
    }
    public static boolean mayUseInputMethod(int arg1){
      return false;
    }
  }
  // Methods

  public boolean isHardwareAccelerated();
  public Display getDefaultDisplay();
  public void removeViewImmediate(View arg1);
}
