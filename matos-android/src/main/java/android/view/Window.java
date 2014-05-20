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
public abstract class Window
{
  // Classes

  public static interface Callback
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onCallBack")
    public void onWindowAttributesChanged(WindowManager.LayoutParams arg1);
    @com.francetelecom.rd.stubs.annotation.CallBack("onCallBack")
    public void onContentChanged();
    @com.francetelecom.rd.stubs.annotation.CallBack("onCallBack")
    public void onWindowFocusChanged(boolean arg1);
    @com.francetelecom.rd.stubs.annotation.CallBack("onCallBack")
    public void onAttachedToWindow();
    @com.francetelecom.rd.stubs.annotation.CallBack("onCallBack")
    public void onDetachedFromWindow();
    @com.francetelecom.rd.stubs.annotation.CallBack("onCallBack")
    public boolean dispatchKeyEvent(KeyEvent arg1);
    public boolean dispatchKeyShortcutEvent(KeyEvent arg1);
    @com.francetelecom.rd.stubs.annotation.CallBack("onCallBack")
    public boolean dispatchTouchEvent(MotionEvent arg1);
    @com.francetelecom.rd.stubs.annotation.CallBack("onCallBack")
    public boolean dispatchTrackballEvent(MotionEvent arg1);
    @com.francetelecom.rd.stubs.annotation.CallBack("onCallBack")
    public boolean dispatchGenericMotionEvent(MotionEvent arg1);
    @com.francetelecom.rd.stubs.annotation.CallBack("onCallBack")
    public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent arg1);
    @com.francetelecom.rd.stubs.annotation.CallBack("onCallBack")
    public View onCreatePanelView(int arg1);
    @com.francetelecom.rd.stubs.annotation.CallBack("onCallBack")
    public boolean onCreatePanelMenu(int arg1, Menu arg2);
    @com.francetelecom.rd.stubs.annotation.CallBack("onCallBack")
    public boolean onPreparePanel(int arg1, View arg2, Menu arg3);
    @com.francetelecom.rd.stubs.annotation.CallBack("onCallBack")
    public boolean onMenuOpened(int arg1, Menu arg2);
    @com.francetelecom.rd.stubs.annotation.CallBack("onCallBack")
    public boolean onMenuItemSelected(int arg1, MenuItem arg2);
    @com.francetelecom.rd.stubs.annotation.CallBack("onCallBack")
    public void onPanelClosed(int arg1, Menu arg2);
    @com.francetelecom.rd.stubs.annotation.CallBack("onCallBack")
    public boolean onSearchRequested();
    @com.francetelecom.rd.stubs.annotation.CallBack("onCallBack")
    public ActionMode onWindowStartingActionMode(ActionMode.Callback arg1);
    @com.francetelecom.rd.stubs.annotation.CallBack("onCallBack")
    public void onActionModeStarted(ActionMode arg1);
    @com.francetelecom.rd.stubs.annotation.CallBack("onCallBack")
    public void onActionModeFinished(ActionMode arg1);
  }
  // Fields

  public static final int FEATURE_OPTIONS_PANEL = 0;

  public static final int FEATURE_NO_TITLE = 1;

  public static final int FEATURE_PROGRESS = 2;

  public static final int FEATURE_LEFT_ICON = 3;

  public static final int FEATURE_RIGHT_ICON = 4;

  public static final int FEATURE_INDETERMINATE_PROGRESS = 5;

  public static final int FEATURE_CONTEXT_MENU = 6;

  public static final int FEATURE_CUSTOM_TITLE = 7;

  public static final int FEATURE_ACTION_BAR = 8;

  public static final int FEATURE_ACTION_BAR_OVERLAY = 9;

  public static final int FEATURE_ACTION_MODE_OVERLAY = 10;

  public static final int PROGRESS_VISIBILITY_ON = -1;

  public static final int PROGRESS_VISIBILITY_OFF = -2;

  public static final int PROGRESS_INDETERMINATE_ON = -3;

  public static final int PROGRESS_INDETERMINATE_OFF = -4;

  public static final int PROGRESS_START = 0;

  public static final int PROGRESS_END = 10000;

  public static final int PROGRESS_SECONDARY_START = 20000;

  public static final int PROGRESS_SECONDARY_END = 30000;

  protected static final int DEFAULT_FEATURES = 0;

  public static final int ID_ANDROID_CONTENT = 16908290;

  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public Window(android.content.Context arg1){
  }
  // Methods

  public final android.content.Context getContext(){
    return (android.content.Context) null;
  }
  public final void destroy(){
  }
  public final boolean isDestroyed(){
    return false;
  }
  public final WindowManager.LayoutParams getAttributes(){
    return (WindowManager.LayoutParams) null;
  }
  public abstract void setTitle(java.lang.CharSequence arg1);
  public View findViewById(int arg1){
    return (View) null;
  }
  public WindowManager getWindowManager(){
    return (WindowManager) null;
  }
  public abstract View getCurrentFocus();
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public abstract void onConfigurationChanged(android.content.res.Configuration arg1);
  public abstract void setContentView(int arg1);
  public abstract void setContentView(View arg1);
  public abstract void setContentView(View arg1, ViewGroup.LayoutParams arg2);
  public abstract void addContentView(View arg1, ViewGroup.LayoutParams arg2);
  public abstract void takeKeyEvents(boolean arg1);
  public abstract void setFeatureDrawableResource(int arg1, int arg2);
  public abstract void setFeatureDrawableUri(int arg1, android.net.Uri arg2);
  public abstract void setFeatureDrawable(int arg1, android.graphics.drawable.Drawable arg2);
  public abstract void setFeatureDrawableAlpha(int arg1, int arg2);
  public abstract LayoutInflater getLayoutInflater();
  public abstract void setTitleColor(int arg1);
  public abstract void setVolumeControlStream(int arg1);
  public abstract int getVolumeControlStream();
  public abstract void restoreHierarchyState(android.os.Bundle arg1);
  public abstract android.os.Bundle saveHierarchyState();
  public abstract void setBackgroundDrawable(android.graphics.drawable.Drawable arg1);
  public void setGravity(int arg1){
  }
  public void setFlags(int arg1, int arg2){
  }
  public final boolean isActive(){
    return false;
  }
  public void setCallback(@com.francetelecom.rd.stubs.annotation.CallBackRegister("android.view.Window.Callback.onCallBack") Window.Callback arg1){
  }
  public final Window.Callback getCallback(){
    return (Window.Callback) null;
  }
  public void setFormat(int arg1){
  }
  public abstract boolean isShortcutKey(int arg1, KeyEvent arg2);
  public void setType(int arg1){
  }
  public void setSoftInputMode(int arg1){
  }
  public boolean hasFeature(int arg1){
    return false;
  }
  public void setAttributes(WindowManager.LayoutParams arg1){
  }
  public void addFlags(int arg1){
  }
  public final void makeActive(){
  }
  public abstract View getDecorView();
  public void setCloseOnTouchOutside(boolean arg1){
  }
  public abstract boolean performPanelShortcut(int arg1, int arg2, KeyEvent arg3, int arg4);
  public boolean shouldCloseOnTouch(android.content.Context arg1, MotionEvent arg2){
    return false;
  }
  public abstract boolean superDispatchKeyEvent(KeyEvent arg1);
  public abstract boolean superDispatchKeyShortcutEvent(KeyEvent arg1);
  public abstract boolean superDispatchTouchEvent(MotionEvent arg1);
  public abstract boolean superDispatchTrackballEvent(MotionEvent arg1);
  public abstract boolean superDispatchGenericMotionEvent(MotionEvent arg1);
  public abstract void invalidatePanelMenu(int arg1);
  public abstract void openPanel(int arg1, KeyEvent arg2);
  public abstract void closePanel(int arg1);
  public boolean requestFeature(int arg1){
    return false;
  }
  public abstract void setFeatureInt(int arg1, int arg2);
  public void setUiOptions(int arg1){
  }
  public void setUiOptions(int arg1, int arg2){
  }
  public void setWindowManager(WindowManager arg1, android.os.IBinder arg2, java.lang.String arg3){
  }
  public void setWindowManager(WindowManager arg1, android.os.IBinder arg2, java.lang.String arg3, boolean arg4){
  }
  public void setContainer(Window arg1){
  }
  public final android.content.res.TypedArray getWindowStyle(){
    return (android.content.res.TypedArray) null;
  }
  public abstract void closeAllPanels();
  public final boolean hasChildren(){
    return false;
  }
  public abstract void alwaysReadCloseOnTouchAttr();
  public void setBackgroundDrawableResource(int arg1){
  }
  public abstract boolean performPanelIdentifierAction(int arg1, int arg2, int arg3);
  public abstract void takeSurface(@com.francetelecom.rd.stubs.annotation.CallBackRegister("surfaceChange2") SurfaceHolder.Callback2 arg1);
  public abstract void takeInputQueue(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onInputQueue") InputQueue.Callback arg1);
  public abstract boolean isFloating();
  public void clearFlags(int arg1){
  }
  public abstract boolean performContextMenuIdentifierAction(int arg1, int arg2);
  public void setLayout(int arg1, int arg2){
  }
  public final Window getContainer(){
    return (Window) null;
  }
  public void setWindowAnimations(int arg1){
  }
  public void setDimAmount(float arg1){
  }
  protected final int getForcedWindowFlags(){
    return 0;
  }
  protected final boolean hasSoftInputMode(){
    return false;
  }
  public void setCloseOnTouchOutsideIfNotSet(boolean arg1){
  }
  protected void removeFeature(int arg1){
  }
  public abstract void togglePanel(int arg1, KeyEvent arg2);
  public abstract View peekDecorView();
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected abstract void onActive();
  protected final int getFeatures(){
    return 0;
  }
  protected final int getLocalFeatures(){
    return 0;
  }
  protected void setDefaultWindowFormat(int arg1){
  }
  protected boolean haveDimAmount(){
    return false;
  }
  public abstract void setChildDrawable(int arg1, android.graphics.drawable.Drawable arg2);
  public abstract void setChildInt(int arg1, int arg2);
}
