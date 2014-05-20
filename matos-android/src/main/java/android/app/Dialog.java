package android.app;

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
public class Dialog
  implements android.view.View.OnCreateContextMenuListener, android.view.Window.Callback, android.view.KeyEvent.Callback, android.content.DialogInterface
{
  // Fields

  protected boolean mCancelable;

  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public Dialog(android.content.Context arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public Dialog(android.content.Context arg1, int arg2){
  }
  Dialog(android.content.Context arg1, int arg2, boolean arg3){
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  protected Dialog(android.content.Context arg1, boolean arg2, android.os.Message arg3){
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  protected Dialog(android.content.Context arg1, boolean arg2, @com.francetelecom.rd.stubs.annotation.CallBackRegister("android.content.DialogInterface.onCancel") android.content.DialogInterface.OnCancelListener arg3){
  }
  // Methods

  public final android.content.Context getContext(){
    return (android.content.Context) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onCreate(android.os.Bundle arg1){
  }
  public void setTitle(java.lang.CharSequence arg1){
  }
  public void setTitle(int arg1){
  }
  public android.view.Window getWindow(){
    return (android.view.Window) null;
  }
  public android.view.View findViewById(int arg1){
    return (android.view.View) null;
  }
  public android.view.View getCurrentFocus(){
    return (android.view.View) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onRestoreInstanceState(android.os.Bundle arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onStart(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public android.os.Bundle onSaveInstanceState(){
    return (android.os.Bundle) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onStop(){
  }
  public ActionBar getActionBar(){
    return (ActionBar) null;
  }
  public void setContentView(int arg1){
  }
  public void setContentView(android.view.View arg1){
  }
  public void setContentView(android.view.View arg1, android.view.ViewGroup.LayoutParams arg2){
  }
  public void addContentView(android.view.View arg1, android.view.ViewGroup.LayoutParams arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onKeyDown(int arg1, android.view.KeyEvent arg2){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onKeyLongPress(int arg1, android.view.KeyEvent arg2){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onKeyUp(int arg1, android.view.KeyEvent arg2){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onKeyMultiple(int arg1, int arg2, android.view.KeyEvent arg3){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onBackPressed(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onKeyShortcut(int arg1, android.view.KeyEvent arg2){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onTouchEvent(android.view.MotionEvent arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onTrackballEvent(android.view.MotionEvent arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onGenericMotionEvent(android.view.MotionEvent arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onWindowAttributesChanged(android.view.WindowManager.LayoutParams arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onContentChanged(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onWindowFocusChanged(boolean arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onAttachedToWindow(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onDetachedFromWindow(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean dispatchKeyEvent(android.view.KeyEvent arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean dispatchKeyShortcutEvent(android.view.KeyEvent arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean dispatchTouchEvent(android.view.MotionEvent arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean dispatchTrackballEvent(android.view.MotionEvent arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean dispatchGenericMotionEvent(android.view.MotionEvent arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public android.view.View onCreatePanelView(int arg1){
    return (android.view.View) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onCreatePanelMenu(int arg1, android.view.Menu arg2){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onPreparePanel(int arg1, android.view.View arg2, android.view.Menu arg3){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onMenuOpened(int arg1, android.view.Menu arg2){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onMenuItemSelected(int arg1, android.view.MenuItem arg2){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onPanelClosed(int arg1, android.view.Menu arg2){
  }
  public void invalidateOptionsMenu(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onCreateOptionsMenu(android.view.Menu arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onPrepareOptionsMenu(android.view.Menu arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onOptionsItemSelected(android.view.MenuItem arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onOptionsMenuClosed(android.view.Menu arg1){
  }
  public void openOptionsMenu(){
  }
  public void closeOptionsMenu(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreateContextMenu")
  public void onCreateContextMenu(android.view.ContextMenu arg1, android.view.View arg2, android.view.ContextMenu.ContextMenuInfo arg3){
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreateContextMenu")
  public void registerForContextMenu(android.view.View arg1){
  }
  public void unregisterForContextMenu(android.view.View arg1){
  }
  public void openContextMenu(android.view.View arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onContextItemSelected(android.view.MenuItem arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onContextMenuClosed(android.view.Menu arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onSearchRequested(){
    return false;
  }
  public void takeKeyEvents(boolean arg1){
  }
  public final boolean requestWindowFeature(int arg1){
    return false;
  }
  public final void setFeatureDrawableResource(int arg1, int arg2){
  }
  public final void setFeatureDrawableUri(int arg1, android.net.Uri arg2){
  }
  public final void setFeatureDrawable(int arg1, android.graphics.drawable.Drawable arg2){
  }
  public final void setFeatureDrawableAlpha(int arg1, int arg2){
  }
  public android.view.LayoutInflater getLayoutInflater(){
    return (android.view.LayoutInflater) null;
  }
  public final void setVolumeControlStream(int arg1){
  }
  public final int getVolumeControlStream(){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public android.view.ActionMode onWindowStartingActionMode(@com.francetelecom.rd.stubs.annotation.CallBackRegister("actionMode") android.view.ActionMode.Callback arg1){
    return (android.view.ActionMode) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onActionModeStarted(android.view.ActionMode arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onActionModeFinished(android.view.ActionMode arg1){
  }
  public void cancel(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public void show(){
  }
  public void hide(){
  }
  public void setOnKeyListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("android.content.DialogInterface.OnKey") android.content.DialogInterface.OnKeyListener arg1){
  }
  public void dismiss(){
  }
  public boolean isShowing(){
    return false;
  }
  public final void setOwnerActivity(Activity arg1){
  }
  public void setOnCancelListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("android.content.DialogInterface.onCancel") android.content.DialogInterface.OnCancelListener arg1){
  }
  public void setCancelable(boolean arg1){
  }
  public void setOnDismissListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("android.content.DialogInterface.onDismiss") android.content.DialogInterface.OnDismissListener arg1){
  }
  public final Activity getOwnerActivity(){
    return (Activity) null;
  }
  public void setCanceledOnTouchOutside(boolean arg1){
  }
  public void setCancelMessage(android.os.Message arg1){
  }
  public void setOnShowListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("android.content.DialogInterface.onShow") android.content.DialogInterface.OnShowListener arg1){
  }
  public void setDismissMessage(android.os.Message arg1){
  }
  public boolean takeCancelAndDismissListeners(java.lang.String arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("android.content.DialogInterface.onCancel") android.content.DialogInterface.OnCancelListener arg2, @com.francetelecom.rd.stubs.annotation.CallBackRegister("android.content.DialogInterface.onDismiss") android.content.DialogInterface.OnDismissListener arg3){
    return false;
  }
}
