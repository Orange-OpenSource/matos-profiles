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
public final class ViewRootImpl
  extends android.os.Handler  implements ViewParent
{
  // Classes

  public static final class CalledFromWrongThreadException
    extends android.util.AndroidRuntimeException  {
    // Constructors

    public CalledFromWrongThreadException(java.lang.String arg1){
      super();
    }
  }
  // Fields

  protected final InputEventConsistencyVerifier mInputEventConsistencyVerifier = (InputEventConsistencyVerifier) null;

  public static final int DO_TRAVERSAL = 1000;

  public static final int DIE = 1001;

  public static final int RESIZED = 1002;

  public static final int RESIZED_REPORT = 1003;

  public static final int WINDOW_FOCUS_CHANGED = 1004;

  public static final int DISPATCH_KEY = 1005;

  public static final int DISPATCH_POINTER = 1006;

  public static final int DISPATCH_TRACKBALL = 1007;

  public static final int DISPATCH_APP_VISIBILITY = 1008;

  public static final int DISPATCH_GET_NEW_SURFACE = 1009;

  public static final int FINISHED_EVENT = 1010;

  public static final int DISPATCH_KEY_FROM_IME = 1011;

  public static final int FINISH_INPUT_CONNECTION = 1012;

  public static final int CHECK_FOCUS = 1013;

  public static final int CLOSE_SYSTEM_DIALOGS = 1014;

  public static final int DISPATCH_DRAG_EVENT = 1015;

  public static final int DISPATCH_DRAG_LOCATION_EVENT = 1016;

  public static final int DISPATCH_SYSTEM_UI_VISIBILITY = 1017;

  public static final int DISPATCH_GENERIC_MOTION = 1018;

  public static final int UPDATE_CONFIGURATION = 1019;

  public static final int DO_PERFORM_ACCESSIBILITY_ACTION = 1020;

  public static final int DO_FIND_ACCESSIBLITY_NODE_INFO_BY_ACCESSIBILITY_ID = 1021;

  public static final int DO_FIND_ACCESSIBLITY_NODE_INFO_BY_VIEW_ID = 1022;

  public static final int DO_FIND_ACCESSIBLITY_NODE_INFO_BY_VIEW_TEXT = 1023;

  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public ViewRootImpl(android.content.Context arg1){
    super();
  }
  // Methods

  public void profile(){
  }
  public ViewParent getParent(){
    return (ViewParent) null;
  }
  public void debug(){
  }
  public void handleMessage(android.os.Message arg1){
  }
  public java.lang.String getMessageName(android.os.Message arg1){
    return (java.lang.String) null;
  }
  public View getView(){
    return (View) null;
  }
  public void dispatchDragEvent(DragEvent arg1){
  }
  public void dispatchSystemUiVisibilityChanged(int arg1, int arg2, int arg3, int arg4){
  }
  public void requestChildFocus(View arg1, View arg2){
  }
  public void focusableViewAvailable(View arg1){
  }
  public boolean showContextMenuForChild(View arg1){
    return false;
  }
  public ActionMode startActionModeForChild(View arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("actionMode") ActionMode.Callback arg2){
    return (ActionMode) null;
  }
  public View focusSearch(View arg1, int arg2){
    return (View) null;
  }
  public boolean requestChildRectangleOnScreen(View arg1, android.graphics.Rect arg2, boolean arg3){
    return false;
  }
  public boolean requestSendAccessibilityEvent(View arg1, android.view.accessibility.AccessibilityEvent arg2){
    return false;
  }
  public void clearChildFocus(View arg1){
  }
  public void recomputeViewAttributes(View arg1){
  }
  public void bringChildToFront(View arg1){
  }
  public void requestDisallowInterceptTouchEvent(boolean arg1){
  }
  public void invalidateChild(View arg1, android.graphics.Rect arg2){
  }
  public ViewParent invalidateChildInParent(int [] arg1, android.graphics.Rect arg2){
    return (ViewParent) null;
  }
  public boolean getChildVisibleRect(View arg1, android.graphics.Rect arg2, android.graphics.Point arg3){
    return false;
  }
  public void requestTransparentRegion(View arg1){
  }
  public void childDrawableStateChanged(View arg1){
  }
  public void requestTransitionStart(android.animation.LayoutTransition arg1){
  }
  public void requestLayout(){
  }
  public boolean isLayoutRequested(){
    return false;
  }
  public void createContextMenu(ContextMenu arg1){
  }
  public void playSoundEffect(int arg1){
  }
  public boolean performHapticFeedback(int arg1, boolean arg2){
    return false;
  }
  public void dumpGfxInfo(java.io.PrintWriter arg1, int [] arg2){
  }
  public void dispatchAppVisibility(boolean arg1){
  }
  public void dispatchGetNewSurface(){
  }
  public void windowFocusChanged(boolean arg1, boolean arg2){
  }
  public void setView(View arg1, WindowManager.LayoutParams arg2, View arg3){
  }
  public void setDragFocus(View arg1){
  }
  public static IWindowSession getWindowSession(android.os.Looper arg1){
    return (IWindowSession) null;
  }
  public void getLastTouchPoint(android.graphics.Point arg1){
  }
  public void dispatchFinishedEvent(int arg1, boolean arg2){
  }
  public void scheduleTraversals(){
  }
  public static void addFirstDrawHandler(@com.francetelecom.rd.stubs.annotation.CallBackRegister("run") java.lang.Runnable arg1){
  }
  public static void addConfigCallback(@com.francetelecom.rd.stubs.annotation.CallBackRegister("ComponentCallbacks") android.content.ComponentCallbacks arg1){
  }
  public void unscheduleTraversals(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onHardwarePreDraw(HardwareCanvas arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onHardwarePostDraw(HardwareCanvas arg1){
  }
  public void die(boolean arg1){
  }
  public void requestUpdateConfiguration(android.content.res.Configuration arg1){
  }
  public void dispatchResized(int arg1, int arg2, android.graphics.Rect arg3, android.graphics.Rect arg4, boolean arg5, android.content.res.Configuration arg6){
  }
  public void dispatchKey(KeyEvent arg1){
  }
  public void dispatchCloseSystemDialogs(java.lang.String arg1){
  }
}
