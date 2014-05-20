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
public interface IWindowManager
  extends android.os.IInterface
{
  // Classes

  public abstract static class Stub
    extends android.os.Binder    implements IWindowManager
  {
    // Constructors

    public Stub(){
      super();
    }
    // Methods

    public android.os.IBinder asBinder(){
      return (android.os.IBinder) null;
    }
    public static IWindowManager asInterface(android.os.IBinder arg1){
      return (IWindowManager) null;
    }
    public boolean onTransact(int arg1, android.os.Parcel arg2, android.os.Parcel arg3, int arg4) throws android.os.RemoteException{
      return false;
    }
  }
  // Methods

  public int getRotation() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "IWindowManager.getSwitchState", report = "-")
  public int getSwitchState(int arg1) throws android.os.RemoteException;
  public boolean hasKeys(int [] arg1, boolean [] arg2) throws android.os.RemoteException;
  public InputChannel monitorInput(java.lang.String arg1) throws android.os.RemoteException;
  public InputDevice getInputDevice(int arg1) throws android.os.RemoteException;
  public int [] getInputDeviceIds() throws android.os.RemoteException;
  public void setPointerSpeed(int arg1) throws android.os.RemoteException;
  public void closeSystemDialogs(java.lang.String arg1) throws android.os.RemoteException;
  public void setInTouchMode(boolean arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "IWindowManager.pauseKeyDispatching", report = "-")
  public void pauseKeyDispatching(android.os.IBinder arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "IWindowManager.resumeKeyDispatching", report = "-")
  public void resumeKeyDispatching(android.os.IBinder arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "IWindowManager.startAppFreezingScreen", report = "-")
  public void startAppFreezingScreen(android.os.IBinder arg1, int arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "IWindowManager.stopAppFreezingScreen", report = "-")
  public void stopAppFreezingScreen(android.os.IBinder arg1, boolean arg2) throws android.os.RemoteException;
  public void exitKeyguardSecurely(IOnKeyguardExitResult arg1) throws android.os.RemoteException;
  public float [] getAnimationScales() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "IWindowManager.setAnimationScale", report = "-")
  public void setAnimationScale(int arg1, float arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "IWindowManager.setAnimationScales", report = "-")
  public void setAnimationScales(float [] arg1) throws android.os.RemoteException;
  public void setForcedDisplaySize(int arg1, int arg2) throws android.os.RemoteException;
  public void clearForcedDisplaySize() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "IWindowManager.addWindowToken", report = "-")
  public void addWindowToken(android.os.IBinder arg1, int arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "IWindowManager.removeWindowToken", report = "-")
  public void removeWindowToken(android.os.IBinder arg1) throws android.os.RemoteException;
  public int getMaximumSizeDimension() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "IWindowManager.injectPointerEvent", report = "-")
  public boolean injectPointerEvent(MotionEvent arg1, boolean arg2) throws android.os.RemoteException;
  public IWindowSession openSession(com.android.internal.view.IInputMethodClient arg1, com.android.internal.view.IInputContext arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "IWindowManager.injectKeyEvent", report = "-")
  public boolean injectKeyEvent(KeyEvent arg1, boolean arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "IWindowManager.injectTrackballEvent", report = "-")
  public boolean injectTrackballEvent(MotionEvent arg1, boolean arg2) throws android.os.RemoteException;
  public boolean inKeyguardRestrictedInputMode() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "IWindowManager.addAppToken", report = "-")
  public void addAppToken(int arg1, IApplicationToken arg2, int arg3, int arg4, boolean arg5) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "IWindowManager.setAppGroupId", report = "-")
  public void setAppGroupId(android.os.IBinder arg1, int arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "IWindowManager.updateOrientationFromAppTokens", report = "-")
  public android.content.res.Configuration updateOrientationFromAppTokens(android.content.res.Configuration arg1, android.os.IBinder arg2) throws android.os.RemoteException;
  public void setNewConfiguration(android.content.res.Configuration arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "IWindowManager.setAppOrientation", report = "-")
  public void setAppOrientation(IApplicationToken arg1, int arg2) throws android.os.RemoteException;
  public int getAppOrientation(IApplicationToken arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "IWindowManager.setFocusedApp", report = "-")
  public void setFocusedApp(android.os.IBinder arg1, boolean arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "IWindowManager.prepareAppTransition", report = "-")
  public void prepareAppTransition(int arg1, boolean arg2) throws android.os.RemoteException;
  public int getPendingAppTransition() throws android.os.RemoteException;
  public void overridePendingAppTransition(java.lang.String arg1, int arg2, int arg3) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "IWindowManager.executeAppTransition", report = "-")
  public void executeAppTransition() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "IWindowManager.setAppStartingWindow", report = "-")
  public void setAppStartingWindow(android.os.IBinder arg1, java.lang.String arg2, int arg3, android.content.res.CompatibilityInfo arg4, java.lang.CharSequence arg5, int arg6, int arg7, int arg8, android.os.IBinder arg9, boolean arg10) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "IWindowManager.setAppWillBeHidden", report = "-")
  public void setAppWillBeHidden(android.os.IBinder arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "IWindowManager.setAppVisibility", report = "-")
  public void setAppVisibility(android.os.IBinder arg1, boolean arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "IWindowManager.removeAppToken", report = "-")
  public void removeAppToken(android.os.IBinder arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "IWindowManager.moveAppToken", report = "-")
  public void moveAppToken(int arg1, android.os.IBinder arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "IWindowManager.removeAppTokensToTop", report = "-")
  public void moveAppTokensToTop(java.util.List<android.os.IBinder> arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "IWindowManager.removeAppTokenToBottom", report = "-")
  public void moveAppTokensToBottom(java.util.List<android.os.IBinder> arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "IWindowManager.disableKeyguard", report = "-")
  public void disableKeyguard(android.os.IBinder arg1, java.lang.String arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "IWindowManager.reenableKeyguard", report = "-")
  public void reenableKeyguard(android.os.IBinder arg1) throws android.os.RemoteException;
  public boolean isKeyguardLocked() throws android.os.RemoteException;
  public boolean isKeyguardSecure() throws android.os.RemoteException;
  public void dismissKeyguard() throws android.os.RemoteException;
  public float getAnimationScale(int arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "IWindowManager.getSwitchStateForDevice", report = "-")
  public int getSwitchStateForDevice(int arg1, int arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "IWindowManager.getScancodeState", report = "-")
  public int getScancodeState(int arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "IWindowManager.getScancodeStateForDevice", report = "-")
  public int getScancodeStateForDevice(int arg1, int arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "IWindowManager.getTrackballScancodeState", report = "-")
  public int getTrackballScancodeState(int arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "IWindowManager.getDPadScancodeState", report = "-")
  public int getDPadScancodeState(int arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "IWindowManager.getKeycodeState", report = "-")
  public int getKeycodeState(int arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "IWindowManager.getKeycodeStateForDevice", report = "-")
  public int getKeycodeStateForDevice(int arg1, int arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "IWindowManager.getTrackballKeycodeState", report = "-")
  public int getTrackballKeycodeState(int arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "IWindowManager.getDPadKeycodeState", report = "-")
  public int getDPadKeycodeState(int arg1) throws android.os.RemoteException;
  public void showStrictModeViolation(boolean arg1) throws android.os.RemoteException;
  public void setStrictModeVisualIndicatorPreference(java.lang.String arg1) throws android.os.RemoteException;
  public android.graphics.Bitmap screenshotApplications(android.os.IBinder arg1, int arg2, int arg3) throws android.os.RemoteException;
  public void freezeRotation(int arg1) throws android.os.RemoteException;
  public void thawRotation() throws android.os.RemoteException;
  public void updateRotation(boolean arg1) throws android.os.RemoteException;
  public int watchRotation(@com.francetelecom.rd.stubs.annotation.CallBackRegister("rotationWatcher") IRotationWatcher arg1) throws android.os.RemoteException;
  public int getPreferredOptionsPanelGravity() throws android.os.RemoteException;
  public boolean startViewServer(int arg1) throws android.os.RemoteException;
  public boolean stopViewServer() throws android.os.RemoteException;
  public boolean isViewServerRunning() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "IWindowManager.setEventDispatching", report = "-")
  public void setEventDispatching(boolean arg1) throws android.os.RemoteException;
  public boolean injectInputEventNoWait(InputEvent arg1) throws android.os.RemoteException;
  public boolean inputMethodClientHasFocus(com.android.internal.view.IInputMethodClient arg1) throws android.os.RemoteException;
  public void getDisplaySize(android.graphics.Point arg1) throws android.os.RemoteException;
  public void getRealDisplaySize(android.graphics.Point arg1) throws android.os.RemoteException;
  public boolean canStatusBarHide() throws android.os.RemoteException;
  public void waitForWindowDrawn(android.os.IBinder arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("IWindowManager.WaitForWindowDrawn") android.os.IRemoteCallback arg2) throws android.os.RemoteException;
  public void statusBarVisibilityChanged(int arg1) throws android.os.RemoteException;
  public boolean hasNavigationBar() throws android.os.RemoteException;
}
