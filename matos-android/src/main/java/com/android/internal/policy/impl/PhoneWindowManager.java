package com.android.internal.policy.impl;

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
public class PhoneWindowManager
  implements android.view.WindowManagerPolicy
{
  // Fields

  public static final java.lang.String SYSTEM_DIALOG_REASON_KEY = "reason";

  public static final java.lang.String SYSTEM_DIALOG_REASON_GLOBAL_ACTIONS = "globalactions";

  public static final java.lang.String SYSTEM_DIALOG_REASON_RECENT_APPS = "recentapps";

  public static final java.lang.String SYSTEM_DIALOG_REASON_HOME_KEY = "homekey";

  // Constructors

  public PhoneWindowManager(){
  }
  // Methods

  public void init(android.content.Context arg1, android.view.IWindowManager arg2, android.view.WindowManagerPolicy.WindowManagerFuncs arg3, android.os.LocalPowerManager arg4){
  }
  public void dump(java.lang.String arg1, java.io.FileDescriptor arg2, java.io.PrintWriter arg3, java.lang.String [] arg4){
  }
  public void systemReady(){
  }
  public void userActivity(){
  }
  public void exitKeyguardSecurely(android.view.WindowManagerPolicy.OnKeyguardExitResult arg1){
  }
  public boolean isKeyguardLocked(){
    return false;
  }
  public boolean isKeyguardSecure(){
    return false;
  }
  public void enableScreenAfterBoot(){
  }
  public void showBootMessage(java.lang.CharSequence arg1, boolean arg2){
  }
  public boolean detectSafeMode(){
    return false;
  }
  public boolean canStatusBarHide(){
    return false;
  }
  public boolean hasNavigationBar(){
    return false;
  }
  public boolean performHapticFeedbackLw(android.view.WindowManagerPolicy.WindowState arg1, int arg2, boolean arg3){
    return false;
  }
  public int getMaxWallpaperLayer(){
    return 0;
  }
  public int checkAddPermission(android.view.WindowManager.LayoutParams arg1){
    return 0;
  }
  public void adjustWindowParamsLw(android.view.WindowManager.LayoutParams arg1){
  }
  public int prepareAddWindowLw(android.view.WindowManagerPolicy.WindowState arg1, android.view.WindowManager.LayoutParams arg2){
    return 0;
  }
  public void getContentInsetHintLw(android.view.WindowManager.LayoutParams arg1, android.graphics.Rect arg2){
  }
  public boolean isScreenOnFully(){
    return false;
  }
  public void removeWindowLw(android.view.WindowManagerPolicy.WindowState arg1){
  }
  public int selectAnimationLw(android.view.WindowManagerPolicy.WindowState arg1, int arg2){
    return 0;
  }
  public void setCurrentOrientationLw(int arg1){
  }
  public boolean inKeyguardRestrictedKeyInputMode(){
    return false;
  }
  public void dismissKeyguardLw(){
  }
  public void systemBooted(){
  }
  public void hideBootMessages(){
  }
  public int windowTypeToLayerLw(int arg1){
    return 0;
  }
  public void setUserRotationMode(int arg1, int arg2){
  }
  public int rotationForOrientationLw(int arg1, int arg2){
    return 0;
  }
  public boolean rotationHasCompatibleMetricsLw(int arg1, int arg2){
    return false;
  }
  public void setRotationLw(int arg1){
  }
  public int getConfigDisplayWidth(int arg1, int arg2, int arg3){
    return 0;
  }
  public int getNonDecorDisplayWidth(int arg1, int arg2, int arg3){
    return 0;
  }
  public int getNonDecorDisplayHeight(int arg1, int arg2, int arg3){
    return 0;
  }
  public int getConfigDisplayHeight(int arg1, int arg2, int arg3){
    return 0;
  }
  public void adjustConfigurationLw(android.content.res.Configuration arg1){
  }
  public void setInitialDisplaySize(int arg1, int arg2){
  }
  public void beginLayoutLw(int arg1, int arg2, int arg3){
  }
  public void layoutWindowLw(android.view.WindowManagerPolicy.WindowState arg1, android.view.WindowManager.LayoutParams arg2, android.view.WindowManagerPolicy.WindowState arg3){
  }
  public int finishLayoutLw(){
    return 0;
  }
  public void beginAnimationLw(int arg1, int arg2){
  }
  public boolean doesForceHide(android.view.WindowManagerPolicy.WindowState arg1, android.view.WindowManager.LayoutParams arg2){
    return false;
  }
  public boolean canBeForceHidden(android.view.WindowManagerPolicy.WindowState arg1, android.view.WindowManager.LayoutParams arg2){
    return false;
  }
  public android.view.animation.Animation createForceHideEnterAnimation(){
    return (android.view.animation.Animation) null;
  }
  public void animatingWindowLw(android.view.WindowManagerPolicy.WindowState arg1, android.view.WindowManager.LayoutParams arg2){
  }
  public int finishAnimationLw(){
    return 0;
  }
  public boolean allowAppAnimationsLw(){
    return false;
  }
  public void screenOnStartedLw(){
  }
  public void screenOnStoppedLw(){
  }
  public int focusChangedLw(android.view.WindowManagerPolicy.WindowState arg1, android.view.WindowManagerPolicy.WindowState arg2){
    return 0;
  }
  public int adjustSystemUiVisibilityLw(int arg1){
    return 0;
  }
  public void notifyLidSwitchChanged(long arg1, boolean arg2){
  }
  public int interceptKeyBeforeQueueing(android.view.KeyEvent arg1, int arg2, boolean arg3){
    return 0;
  }
  public int interceptMotionBeforeQueueingWhenScreenOff(int arg1){
    return 0;
  }
  public long interceptKeyBeforeDispatching(android.view.WindowManagerPolicy.WindowState arg1, android.view.KeyEvent arg2, int arg3){
    return 0l;
  }
  public android.view.KeyEvent dispatchUnhandledKey(android.view.WindowManagerPolicy.WindowState arg1, android.view.KeyEvent arg2, int arg3){
    return (android.view.KeyEvent) null;
  }
  public void updateSettings(){
  }
  public void screenTurningOn(@com.francetelecom.rd.stubs.annotation.CallBackRegister("ScreenOnListener") android.view.WindowManagerPolicy.ScreenOnListener arg1){
  }
  public void screenTurnedOff(int arg1){
  }
  public int subWindowTypeToLayerLw(int arg1){
    return 0;
  }
  public android.view.View addStartingWindow(android.os.IBinder arg1, java.lang.String arg2, int arg3, android.content.res.CompatibilityInfo arg4, java.lang.CharSequence arg5, int arg6, int arg7, int arg8){
    return (android.view.View) null;
  }
  public void removeStartingWindow(android.os.IBinder arg1, android.view.View arg2){
  }
  public boolean isScreenOnEarly(){
    return false;
  }
  public void enableKeyguard(boolean arg1){
  }
  public boolean allowKeyRepeat(){
    return false;
  }
}
