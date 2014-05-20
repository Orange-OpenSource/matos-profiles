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
public interface WindowManagerPolicy
{
  // Classes

  public static interface WindowState
  {
    // Methods

    public int getSystemUiVisibility();
    public boolean isDisplayedLw();
    public WindowManager.LayoutParams getAttrs();
    public boolean isVisibleLw();
    public IApplicationToken getAppToken();
    public boolean hideLw(boolean arg1);
    public boolean showLw(boolean arg1);
    public void computeFrameLw(android.graphics.Rect arg1, android.graphics.Rect arg2, android.graphics.Rect arg3, android.graphics.Rect arg4);
    public android.graphics.Rect getFrameLw();
    public android.graphics.RectF getShownFrameLw();
    public android.graphics.Rect getDisplayFrameLw();
    public android.graphics.Rect getContentFrameLw();
    public android.graphics.Rect getVisibleFrameLw();
    public boolean getGivenInsetsPendingLw();
    public android.graphics.Rect getGivenContentInsetsLw();
    public android.graphics.Rect getGivenVisibleInsetsLw();
    public int getSurfaceLayer();
    public boolean hasAppShownWindows();
    public boolean isVisibleOrBehindKeyguardLw();
    public boolean hasDrawnLw();
  }
  public static interface FakeWindow
  {
    // Methods

    public void dismiss();
  }
  public static interface WindowManagerFuncs
  {
    // Methods

    public void reevaluateStatusBarVisibility();
    public WindowManagerPolicy.FakeWindow addFakeWindow(android.os.Looper arg1, InputHandler arg2, java.lang.String arg3, int arg4, int arg5, boolean arg6, boolean arg7, boolean arg8);
  }
  public static interface ScreenOnListener
  {
    // Methods
	@com.francetelecom.rd.stubs.annotation.CallBack("ScreenOnListener")
    public void onScreenOn();
  }
  public static interface OnKeyguardExitResult
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("OnKeyguardExitResult")
    public void onKeyguardExitResult(boolean arg1);
  }
  // Fields

  public static final int FLAG_WAKE = 1;

  public static final int FLAG_WAKE_DROPPED = 2;

  public static final int FLAG_SHIFT = 4;

  public static final int FLAG_CAPS_LOCK = 8;

  public static final int FLAG_ALT = 16;

  public static final int FLAG_ALT_GR = 32;

  public static final int FLAG_MENU = 64;

  public static final int FLAG_LAUNCHER = 128;

  public static final int FLAG_VIRTUAL = 256;

  public static final int FLAG_INJECTED = 16777216;

  public static final int FLAG_TRUSTED = 33554432;

  public static final int FLAG_FILTERED = 67108864;

  public static final int FLAG_DISABLE_KEY_REPEAT = 134217728;

  public static final int FLAG_WOKE_HERE = 268435456;

  public static final int FLAG_BRIGHT_HERE = 536870912;

  public static final int FLAG_PASS_TO_USER = 1073741824;

  public static final boolean WATCH_POINTER = false;

  public static final java.lang.String ACTION_HDMI_PLUGGED = "android.intent.action.HDMI_PLUGGED";

  public static final java.lang.String EXTRA_HDMI_PLUGGED_STATE = "state";

  public static final int ACTION_PASS_TO_USER = 1;

  public static final int ACTION_POKE_USER_ACTIVITY = 2;

  public static final int ACTION_GO_TO_SLEEP = 4;

  public static final int TRANSIT_ENTER_MASK = 4096;

  public static final int TRANSIT_EXIT_MASK = 8192;

  public static final int TRANSIT_UNSET = -1;

  public static final int TRANSIT_NONE = 0;

  public static final int TRANSIT_ENTER = 4097;

  public static final int TRANSIT_EXIT = 8194;

  public static final int TRANSIT_SHOW = 4099;

  public static final int TRANSIT_HIDE = 8196;

  public static final int TRANSIT_PREVIEW_DONE = 5;

  public static final int TRANSIT_ACTIVITY_OPEN = 4102;

  public static final int TRANSIT_ACTIVITY_CLOSE = 8199;

  public static final int TRANSIT_TASK_OPEN = 4104;

  public static final int TRANSIT_TASK_CLOSE = 8201;

  public static final int TRANSIT_TASK_TO_FRONT = 4106;

  public static final int TRANSIT_TASK_TO_BACK = 8203;

  public static final int TRANSIT_WALLPAPER_CLOSE = 8204;

  public static final int TRANSIT_WALLPAPER_OPEN = 4109;

  public static final int TRANSIT_WALLPAPER_INTRA_OPEN = 4110;

  public static final int TRANSIT_WALLPAPER_INTRA_CLOSE = 8207;

  public static final int OFF_BECAUSE_OF_ADMIN = 1;

  public static final int OFF_BECAUSE_OF_USER = 2;

  public static final int OFF_BECAUSE_OF_TIMEOUT = 3;

  public static final int OFF_BECAUSE_OF_PROX_SENSOR = 4;

  public static final int USER_ROTATION_FREE = 0;

  public static final int USER_ROTATION_LOCKED = 1;

  public static final int FINISH_LAYOUT_REDO_LAYOUT = 1;

  public static final int FINISH_LAYOUT_REDO_CONFIG = 2;

  public static final int FINISH_LAYOUT_REDO_WALLPAPER = 4;

  public static final int FINISH_LAYOUT_REDO_ANIM = 8;

  // Methods

  public void init(android.content.Context arg1, IWindowManager arg2, WindowManagerPolicy.WindowManagerFuncs arg3, android.os.LocalPowerManager arg4);
  public void dump(java.lang.String arg1, java.io.FileDescriptor arg2, java.io.PrintWriter arg3, java.lang.String [] arg4);
  public void systemReady();
  public void userActivity();
  public void exitKeyguardSecurely(@com.francetelecom.rd.stubs.annotation.CallBackRegister("OnKeyguardExitResult") WindowManagerPolicy.OnKeyguardExitResult arg1);
  public boolean isKeyguardLocked();
  public boolean isKeyguardSecure();
  public void enableScreenAfterBoot();
  public void showBootMessage(java.lang.CharSequence arg1, boolean arg2);
  public boolean detectSafeMode();
  public boolean canStatusBarHide();
  public boolean hasNavigationBar();
  public boolean performHapticFeedbackLw(WindowManagerPolicy.WindowState arg1, int arg2, boolean arg3);
  public int getMaxWallpaperLayer();
  public int checkAddPermission(WindowManager.LayoutParams arg1);
  public void adjustWindowParamsLw(WindowManager.LayoutParams arg1);
  public int prepareAddWindowLw(WindowManagerPolicy.WindowState arg1, WindowManager.LayoutParams arg2);
  public void getContentInsetHintLw(WindowManager.LayoutParams arg1, android.graphics.Rect arg2);
  public boolean isScreenOnFully();
  public void removeWindowLw(WindowManagerPolicy.WindowState arg1);
  public int selectAnimationLw(WindowManagerPolicy.WindowState arg1, int arg2);
  public void setCurrentOrientationLw(int arg1);
  public boolean inKeyguardRestrictedKeyInputMode();
  public void dismissKeyguardLw();
  public void systemBooted();
  public void hideBootMessages();
  public int windowTypeToLayerLw(int arg1);
  public void setUserRotationMode(int arg1, int arg2);
  public int rotationForOrientationLw(int arg1, int arg2);
  public boolean rotationHasCompatibleMetricsLw(int arg1, int arg2);
  public void setRotationLw(int arg1);
  public int getConfigDisplayWidth(int arg1, int arg2, int arg3);
  public int getNonDecorDisplayWidth(int arg1, int arg2, int arg3);
  public int getNonDecorDisplayHeight(int arg1, int arg2, int arg3);
  public int getConfigDisplayHeight(int arg1, int arg2, int arg3);
  public void adjustConfigurationLw(android.content.res.Configuration arg1);
  public void setInitialDisplaySize(int arg1, int arg2);
  public void beginLayoutLw(int arg1, int arg2, int arg3);
  public void layoutWindowLw(WindowManagerPolicy.WindowState arg1, WindowManager.LayoutParams arg2, WindowManagerPolicy.WindowState arg3);
  public int finishLayoutLw();
  public void beginAnimationLw(int arg1, int arg2);
  public boolean doesForceHide(WindowManagerPolicy.WindowState arg1, WindowManager.LayoutParams arg2);
  public boolean canBeForceHidden(WindowManagerPolicy.WindowState arg1, WindowManager.LayoutParams arg2);
  public android.view.animation.Animation createForceHideEnterAnimation();
  public void animatingWindowLw(WindowManagerPolicy.WindowState arg1, WindowManager.LayoutParams arg2);
  public int finishAnimationLw();
  public boolean allowAppAnimationsLw();
  public void screenOnStartedLw();
  public void screenOnStoppedLw();
  public int focusChangedLw(WindowManagerPolicy.WindowState arg1, WindowManagerPolicy.WindowState arg2);
  public int adjustSystemUiVisibilityLw(int arg1);
  public void notifyLidSwitchChanged(long arg1, boolean arg2);
  public int interceptKeyBeforeQueueing(KeyEvent arg1, int arg2, boolean arg3);
  public int interceptMotionBeforeQueueingWhenScreenOff(int arg1);
  public long interceptKeyBeforeDispatching(WindowManagerPolicy.WindowState arg1, KeyEvent arg2, int arg3);
  public KeyEvent dispatchUnhandledKey(WindowManagerPolicy.WindowState arg1, KeyEvent arg2, int arg3);
  public void screenTurningOn(@com.francetelecom.rd.stubs.annotation.CallBackRegister("ScreenOnListener") WindowManagerPolicy.ScreenOnListener arg1);
  public void screenTurnedOff(int arg1);
  public int subWindowTypeToLayerLw(int arg1);
  public View addStartingWindow(android.os.IBinder arg1, java.lang.String arg2, int arg3, android.content.res.CompatibilityInfo arg4, java.lang.CharSequence arg5, int arg6, int arg7, int arg8);
  public void removeStartingWindow(android.os.IBinder arg1, View arg2);
  public boolean isScreenOnEarly();
  public void enableKeyguard(boolean arg1);
  public boolean allowKeyRepeat();
}
