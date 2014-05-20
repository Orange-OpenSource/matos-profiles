package com.android.server.wm;

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


public class WindowManagerService
  extends android.view.IWindowManager.Stub  implements android.view.WindowManagerPolicy.WindowManagerFuncs, com.android.server.Watchdog.Monitor
{
  // Classes

  public static interface WindowChangeListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("windowChangeListener")
    public void focusChanged();
    @com.francetelecom.rd.stubs.annotation.CallBack("windowChangeListener")
    public void windowsChanged();
  }
  public static interface OnHardKeyboardStatusChangeListener
  {
    // Methods

	@com.francetelecom.rd.stubs.annotation.CallBack("onHardKeyboardStatusChange")
	public void onHardKeyboardStatusChange(boolean arg1, boolean arg2);
  }
  // Constructors

  private WindowManagerService(android.content.Context arg1, com.android.server.PowerManagerService arg2, boolean arg3, boolean arg4){
    super();
  }
  // Methods

  public static WindowManagerService main(android.content.Context arg1, com.android.server.PowerManagerService arg2, boolean arg3, boolean arg4){
    return (WindowManagerService) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onTransact")
  public boolean onTransact(int arg1, android.os.Parcel arg2, android.os.Parcel arg3, int arg4) throws android.os.RemoteException{
    return false;
  }
  public void dump(java.io.FileDescriptor arg1, java.io.PrintWriter arg2, java.lang.String [] arg3){
  }
  public int getRotation(){
    return 0;
  }
  public int getSwitchState(int arg1){
    return 0;
  }
  public boolean hasKeys(int [] arg1, boolean [] arg2){
    return false;
  }
  public android.view.InputChannel monitorInput(java.lang.String arg1){
    return (android.view.InputChannel) null;
  }
  public void setInputFilter(InputFilter arg1){
  }
  public android.view.InputDevice getInputDevice(int arg1){
    return (android.view.InputDevice) null;
  }
  public int [] getInputDeviceIds(){
    return (int []) null;
  }
  public void setPointerSpeed(int arg1){
  }
  public void monitor(){
  }
  public void systemReady(){
  }
  public void reevaluateStatusBarVisibility(){
  }
  public android.view.WindowManagerPolicy.FakeWindow addFakeWindow(android.os.Looper arg1, android.view.InputHandler arg2, java.lang.String arg3, int arg4, int arg5, boolean arg6, boolean arg7, boolean arg8){
    return (android.view.WindowManagerPolicy.FakeWindow) null;
  }
  public void closeSystemDialogs(java.lang.String arg1){
  }
  public void setInTouchMode(boolean arg1){
  }
  public void setHardKeyboardEnabled(boolean arg1){
  }
  public void pauseKeyDispatching(android.os.IBinder arg1){
  }
  public void resumeKeyDispatching(android.os.IBinder arg1){
  }
  public void startAppFreezingScreen(android.os.IBinder arg1, int arg2){
  }
  public void stopAppFreezingScreen(android.os.IBinder arg1, boolean arg2){
  }
  public void exitKeyguardSecurely(@com.francetelecom.rd.stubs.annotation.CallBackRegister("IOnKeyguardExitResult") android.view.IOnKeyguardExitResult arg1){
  }
  public float [] getAnimationScales(){
    return (float []) null;
  }
  public void setAnimationScale(int arg1, float arg2){
  }
  public void setAnimationScales(float [] arg1){
  }
  public void setForcedDisplaySize(int arg1, int arg2){
  }
  public void clearForcedDisplaySize(){
  }
  public void addWindowToken(android.os.IBinder arg1, int arg2){
  }
  public void removeWindowToken(android.os.IBinder arg1){
  }
  public int getMaximumSizeDimension(){
    return 0;
  }
  public boolean injectPointerEvent(android.view.MotionEvent arg1, boolean arg2){
    return false;
  }
  public android.view.IWindowSession openSession(com.android.internal.view.IInputMethodClient arg1, com.android.internal.view.IInputContext arg2){
    return (android.view.IWindowSession) null;
  }
  public boolean injectKeyEvent(android.view.KeyEvent arg1, boolean arg2){
    return false;
  }
  public boolean injectTrackballEvent(android.view.MotionEvent arg1, boolean arg2){
    return false;
  }
  public boolean inKeyguardRestrictedInputMode(){
    return false;
  }
  public void getInitialDisplaySize(android.graphics.Point arg1){
  }
  public float getWindowCompatibilityScale(android.os.IBinder arg1){
    return 0.0f;
  }
  public void validateAppTokens(java.util.List arg1){
  }
  public void addAppToken(int arg1, android.view.IApplicationToken arg2, int arg3, int arg4, boolean arg5){
  }
  public void setAppGroupId(android.os.IBinder arg1, int arg2){
  }
  public int getOrientationFromWindowsLocked(){
    return 0;
  }
  public int getOrientationFromAppTokensLocked(){
    return 0;
  }
  public android.content.res.Configuration updateOrientationFromAppTokens(android.content.res.Configuration arg1, android.os.IBinder arg2){
    return (android.content.res.Configuration) null;
  }
  public void setNewConfiguration(android.content.res.Configuration arg1){
  }
  public void setAppOrientation(android.view.IApplicationToken arg1, int arg2){
  }
  public int getAppOrientation(android.view.IApplicationToken arg1){
    return 0;
  }
  public void setFocusedApp(android.os.IBinder arg1, boolean arg2){
  }
  public void prepareAppTransition(int arg1, boolean arg2){
  }
  public int getPendingAppTransition(){
    return 0;
  }
  public void overridePendingAppTransition(java.lang.String arg1, int arg2, int arg3){
  }
  public void executeAppTransition(){
  }
  public void setAppStartingWindow(android.os.IBinder arg1, java.lang.String arg2, int arg3, android.content.res.CompatibilityInfo arg4, java.lang.CharSequence arg5, int arg6, int arg7, int arg8, android.os.IBinder arg9, boolean arg10){
  }
  public void setAppWillBeHidden(android.os.IBinder arg1){
  }
  public void setAppVisibility(android.os.IBinder arg1, boolean arg2){
  }
  public void removeAppToken(android.os.IBinder arg1){
  }
  public void moveAppToken(int arg1, android.os.IBinder arg2){
  }
  public void moveAppTokensToTop(java.util.List<android.os.IBinder> arg1){
  }
  public void moveAppTokensToBottom(java.util.List<android.os.IBinder> arg1){
  }
  public void disableKeyguard(android.os.IBinder arg1, java.lang.String arg2){
  }
  public void reenableKeyguard(android.os.IBinder arg1){
  }
  public boolean isKeyguardLocked(){
    return false;
  }
  public boolean isKeyguardSecure(){
    return false;
  }
  public void dismissKeyguard(){
  }
  public float getAnimationScale(int arg1){
    return 0.0f;
  }
  public int getSwitchStateForDevice(int arg1, int arg2){
    return 0;
  }
  public int getScancodeState(int arg1){
    return 0;
  }
  public int getScancodeStateForDevice(int arg1, int arg2){
    return 0;
  }
  public int getTrackballScancodeState(int arg1){
    return 0;
  }
  public int getDPadScancodeState(int arg1){
    return 0;
  }
  public int getKeycodeState(int arg1){
    return 0;
  }
  public int getKeycodeStateForDevice(int arg1, int arg2){
    return 0;
  }
  public int getTrackballKeycodeState(int arg1){
    return 0;
  }
  public int getDPadKeycodeState(int arg1){
    return 0;
  }
  public void enableScreenAfterBoot(){
  }
  public void performBootTimeout(){
  }
  public void performEnableScreen(){
  }
  public void showBootMessage(java.lang.CharSequence arg1, boolean arg2){
  }
  public void hideBootMessagesLocked(){
  }
  public void showStrictModeViolation(boolean arg1){
  }
  public void setStrictModeVisualIndicatorPreference(java.lang.String arg1){
  }
  public android.graphics.Bitmap screenshotApplications(android.os.IBinder arg1, int arg2, int arg3){
    return (android.graphics.Bitmap) null;
  }
  public void freezeRotation(int arg1){
  }
  public void thawRotation(){
  }
  public void updateRotation(boolean arg1){
  }
  public void updateRotationUnchecked(boolean arg1){
  }
  public boolean updateRotationUncheckedLocked(boolean arg1){
    return false;
  }
  public int watchRotation(@com.francetelecom.rd.stubs.annotation.CallBackRegister("rotationWatcher") android.view.IRotationWatcher arg1){
    return 0;
  }
  public int getPreferredOptionsPanelGravity(){
    return 0;
  }
  public boolean startViewServer(int arg1){
    return false;
  }
  public boolean stopViewServer(){
    return false;
  }
  public boolean isViewServerRunning(){
    return false;
  }
  public void addWindowChangeListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("windowChangeListener") WindowManagerService.WindowChangeListener arg1){
  }
  public void removeWindowChangeListener(WindowManagerService.WindowChangeListener arg1){
  }
  public android.content.res.Configuration computeNewConfiguration(){
    return (android.content.res.Configuration) null;
  }
  public boolean isHardKeyboardAvailable(){
    return false;
  }
  public boolean isHardKeyboardEnabled(){
    return false;
  }
  public void setOnHardKeyboardStatusChangeListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onHardKeyboardStatusChange") WindowManagerService.OnHardKeyboardStatusChangeListener arg1){
  }
  public void setEventDispatching(boolean arg1){
  }
  public boolean injectInputEventNoWait(android.view.InputEvent arg1){
    return false;
  }
  public boolean detectSafeMode(){
    return false;
  }
  public void displayReady(){
  }
  public boolean inputMethodClientHasFocus(com.android.internal.view.IInputMethodClient arg1){
    return false;
  }
  public void getDisplaySize(android.graphics.Point arg1){
  }
  public void getRealDisplaySize(android.graphics.Point arg1){
  }
  public boolean canStatusBarHide(){
    return false;
  }
  public void waitForWindowDrawn(android.os.IBinder arg1, android.os.IRemoteCallback arg2){
  }
  public void statusBarVisibilityChanged(int arg1){
  }
  public boolean hasNavigationBar(){
    return false;
  }
}
