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
@com.francetelecom.rd.stubs.annotation.Accumulator("stubAccumulator")
@com.francetelecom.rd.stubs.annotation.DumpHierarchy(value = "android.hierarchy.Activity", noAbstract = false)
public class Activity
  extends android.view.ContextThemeWrapper  implements android.view.View.OnCreateContextMenuListener, android.view.LayoutInflater.Factory2, android.view.Window.Callback, android.view.KeyEvent.Callback, android.content.ComponentCallbacks2
{
  // Fields

  public static final int RESULT_CANCELED = 0;

  public static final int RESULT_OK = -1;

  public static final int RESULT_FIRST_USER = 1;

  protected static final int [] FOCUSED_STATE_SET = null;

  public static final int DEFAULT_KEYS_DISABLE = 0;

  public static final int DEFAULT_KEYS_DIALER = 1;

  public static final int DEFAULT_KEYS_SHORTCUT = 2;

  public static final int DEFAULT_KEYS_SEARCH_LOCAL = 3;

  public static final int DEFAULT_KEYS_SEARCH_GLOBAL = 4;

  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreateActivity")
  public Activity(){
    super();
  }
  // Methods

  public final Activity getParent(){
    return (Activity) null;
  }
  public void dump(java.lang.String arg1, java.io.FileDescriptor arg2, java.io.PrintWriter arg3, java.lang.String [] arg4){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreateActivity")
  protected void onCreate(android.os.Bundle arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreateActivity")
  protected void onNewIntent(android.content.Intent arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreateActivity")
  protected void onResume(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreateActivity")
  protected void onPause(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreateActivity")
  protected void onDestroy(){
  }
  public final void setResult(int arg1){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Activity.setResult", pos = 2, report = "-")
  public final void setResult(int arg1, android.content.Intent arg2){
  }
  public void finish(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister({"OnTitleChanged", "OnChildTitleChanged"})
  public void setTitle(@com.francetelecom.rd.stubs.annotation.FieldSet("title") java.lang.CharSequence arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister({"OnTitleChanged", "OnChildTitleChanged"})
  public void setTitle(int arg1){
  }
  public android.view.Window getWindow(){
    return (android.view.Window) null;
  }
  public android.view.View findViewById(int arg1){
    return (android.view.View) null;
  }
  @com.francetelecom.rd.stubs.annotation.UseSuper
  public java.lang.Object getSystemService(java.lang.String arg1){
    return (java.lang.Object) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Activity.getIntent", pos = -1, report = "-")
  public android.content.Intent getIntent(){
    return (android.content.Intent) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Activity.setIntent", pos = 1, report = "-")
  public void setIntent(android.content.Intent arg1){
  }
  public final Application getApplication(){
    return (Application) null;
  }
  public final boolean isChild(){
    return false;
  }
  public android.view.WindowManager getWindowManager(){
    return (android.view.WindowManager) null;
  }
  public LoaderManager getLoaderManager(){
    return (LoaderManager) null;
  }
  public android.view.View getCurrentFocus(){
    return (android.view.View) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreateActivity")
  protected void onRestoreInstanceState(android.os.Bundle arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreateActivity")
  protected void onPostCreate(android.os.Bundle arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreateActivity")
  protected void onStart(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreateActivity")
  protected void onRestart(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreateActivity")
  protected void onPostResume(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreateActivity")
  protected void onSaveInstanceState(android.os.Bundle arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreateActivity")
  protected void onUserLeaveHint(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreateActivity")
  public boolean onCreateThumbnail(android.graphics.Bitmap arg1, android.graphics.Canvas arg2){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreateActivity")
  public java.lang.CharSequence onCreateDescription(){
    return (java.lang.CharSequence) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreateActivity")
  protected void onStop(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreateActivity")
  public void onConfigurationChanged(android.content.res.Configuration arg1){
  }
  public int getChangingConfigurations(){
    return 0;
  }
  public java.lang.Object getLastNonConfigurationInstance(){
    return (java.lang.Object) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreateActivity")
  public java.lang.Object onRetainNonConfigurationInstance(){
    return (java.lang.Object) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreateActivity")
  public void onLowMemory(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreateActivity")
  public void onTrimMemory(int arg1){
  }
  public FragmentManager getFragmentManager(){
    return (FragmentManager) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreateActivity")
  public void onAttachFragment(Fragment arg1){
  }
  public final android.database.Cursor managedQuery(android.net.Uri arg1, java.lang.String [] arg2, java.lang.String arg3, java.lang.String arg4){
    return (android.database.Cursor) null;
  }
  public final android.database.Cursor managedQuery(android.net.Uri arg1, java.lang.String [] arg2, java.lang.String arg3, java.lang.String [] arg4, java.lang.String arg5){
    return (android.database.Cursor) null;
  }
  public void startManagingCursor(android.database.Cursor arg1){
  }
  public void stopManagingCursor(android.database.Cursor arg1){
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "Activity.setPersistent", report = "-")
  public void setPersistent(boolean arg1){
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
  public void setFinishOnTouchOutside(boolean arg1){
  }
  public final void setDefaultKeyMode(int arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreateActivity")
  public boolean onKeyDown(int arg1, android.view.KeyEvent arg2){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreateActivity")
  public boolean onKeyLongPress(int arg1, android.view.KeyEvent arg2){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreateActivity")
  public boolean onKeyUp(int arg1, android.view.KeyEvent arg2){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreateActivity")
  public boolean onKeyMultiple(int arg1, int arg2, android.view.KeyEvent arg3){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreateActivity")
  public void onBackPressed(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreateActivity")
  public boolean onKeyShortcut(int arg1, android.view.KeyEvent arg2){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreateActivity")
  public boolean onTouchEvent(android.view.MotionEvent arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreateActivity")
  public boolean onTrackballEvent(android.view.MotionEvent arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreateActivity")
  public boolean onGenericMotionEvent(android.view.MotionEvent arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreateActivity")
  public void onUserInteraction(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreateActivity")
  public void onWindowAttributesChanged(android.view.WindowManager.LayoutParams arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreateActivity")
  public void onContentChanged(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreateActivity")
  public void onWindowFocusChanged(boolean arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreateActivity")
  public void onAttachedToWindow(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreateActivity")
  public void onDetachedFromWindow(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreateActivity")
  public boolean hasWindowFocus(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreateActivity")
  public boolean dispatchKeyEvent(android.view.KeyEvent arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreateActivity")
  public boolean dispatchKeyShortcutEvent(android.view.KeyEvent arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreateActivity")
  public boolean dispatchTouchEvent(android.view.MotionEvent arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreateActivity")
  public boolean dispatchTrackballEvent(android.view.MotionEvent arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreateActivity")
  public boolean dispatchGenericMotionEvent(android.view.MotionEvent arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreateActivity")
  public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreateActivity")
  public android.view.View onCreatePanelView(int arg1){
    return (android.view.View) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreateActivity")
  public boolean onCreatePanelMenu(int arg1, android.view.Menu arg2){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreateActivity")
  public boolean onPreparePanel(int arg1, android.view.View arg2, android.view.Menu arg3){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreateActivity")
  public boolean onMenuOpened(int arg1, android.view.Menu arg2){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreateActivity")
  public boolean onMenuItemSelected(int arg1, android.view.MenuItem arg2){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreateActivity")
  public void onPanelClosed(int arg1, android.view.Menu arg2){
  }
  public void invalidateOptionsMenu(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreateActivity")
  public boolean onCreateOptionsMenu(android.view.Menu arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreateActivity")
  public boolean onPrepareOptionsMenu(android.view.Menu arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreateActivity")
  public boolean onOptionsItemSelected(android.view.MenuItem arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreateActivity")
  public void onOptionsMenuClosed(android.view.Menu arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreateActivity")
  public void openOptionsMenu(){
  }
  public void closeOptionsMenu(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onContextMenu")
  public void onCreateContextMenu(android.view.ContextMenu arg1, android.view.View arg2, android.view.ContextMenu.ContextMenuInfo arg3){
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onContextMenu")
  public void registerForContextMenu(android.view.View arg1){
  }
  public void unregisterForContextMenu(android.view.View arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onContextMenu")
  public void openContextMenu(android.view.View arg1){
  }
  public void closeContextMenu(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onContextMenu")
  public boolean onContextItemSelected(android.view.MenuItem arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onContextMenu")
  public void onContextMenuClosed(android.view.Menu arg1){
  }
  protected Dialog onCreateDialog(int arg1){
    return (Dialog) null;
  }
  protected Dialog onCreateDialog(int arg1, android.os.Bundle arg2){
    return (Dialog) null;
  }
  protected void onPrepareDialog(int arg1, Dialog arg2){
  }
  protected void onPrepareDialog(int arg1, Dialog arg2, android.os.Bundle arg3){
  }
  @com.francetelecom.rd.stubs.annotation.Code("onPrepareDialog(arg1,onCreateDialog(arg1));")
  public final void showDialog(int arg1){
  }
  @com.francetelecom.rd.stubs.annotation.Code({"onPrepareDialog(arg1,onCreateDialog(arg1, arg2));", "return com.francetelecom.rd.stubs.Generator.booleanValue();"})
  public final boolean showDialog(int arg1, android.os.Bundle arg2){
    return false;
  }
  public final void dismissDialog(int arg1){
  }
  public final void removeDialog(int arg1){
  }
  public boolean onSearchRequested(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.Code("onSearchRequested();")
  public void startSearch(java.lang.String arg1, boolean arg2, android.os.Bundle arg3, boolean arg4){
  }
  public void triggerSearch(java.lang.String arg1, android.os.Bundle arg2){
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
  public android.view.MenuInflater getMenuInflater(){
    return (android.view.MenuInflater) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreateActivity")
  protected void onApplyThemeResource(android.content.res.Resources.Theme arg1, int arg2, boolean arg3){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Activity.startActivityForResult", pos = 1, report = "-")
  public void startActivityForResult(android.content.Intent arg1, int arg2){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Activity.startIntentSenderForResult", pos = {1, 3}, report = "-")
  public void startIntentSenderForResult(android.content.IntentSender arg1, int arg2, android.content.Intent arg3, int arg4, int arg5, int arg6) throws android.content.IntentSender.SendIntentException{
  }
  @com.francetelecom.rd.stubs.annotation.UseSuper
  public void startActivity(android.content.Intent arg1){
  }
  @com.francetelecom.rd.stubs.annotation.UseSuper
  public void startActivities(android.content.Intent [] arg1){
  }
  @com.francetelecom.rd.stubs.annotation.UseSuper
  public void startIntentSender(android.content.IntentSender arg1, android.content.Intent arg2, int arg3, int arg4, int arg5) throws android.content.IntentSender.SendIntentException{
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Activity.startActivityIfNeeded", pos = 1, report = "-")
  public boolean startActivityIfNeeded(android.content.Intent arg1, int arg2){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Activity.startNextMatchingActivity", pos = 1, report = "-")
  public boolean startNextMatchingActivity(android.content.Intent arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Activity.startActivityFromChild", pos = {1, 2}, report = "-")
  public void startActivityFromChild(Activity arg1, android.content.Intent arg2, int arg3){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Activity.startActivityFromFragment", pos = {1, 2}, report = "-")
  public void startActivityFromFragment(Fragment arg1, android.content.Intent arg2, int arg3){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Activity.startIntentSenderFromChild", pos = {2, 4}, report = "-")
  public void startIntentSenderFromChild(Activity arg1, android.content.IntentSender arg2, int arg3, android.content.Intent arg4, int arg5, int arg6, int arg7) throws android.content.IntentSender.SendIntentException{
  }
  public void overridePendingTransition(int arg1, int arg2){
  }
  public java.lang.String getCallingPackage(){
    return (java.lang.String) null;
  }
  public android.content.ComponentName getCallingActivity(){
    return (android.content.ComponentName) null;
  }
  public void setVisible(boolean arg1){
  }
  public boolean isFinishing(){
    return false;
  }
  public boolean isChangingConfigurations(){
    return false;
  }
  public void recreate(){
  }
  public void finishFromChild(Activity arg1){
  }
  public void finishActivity(int arg1){
  }
  public void finishActivityFromChild(Activity arg1, int arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreateActivity")
  protected void onActivityResult(int arg1, int arg2, android.content.Intent arg3){
  }
  public PendingIntent createPendingResult(int arg1, android.content.Intent arg2, int arg3){
    return (PendingIntent) null;
  }
  public void setRequestedOrientation(int arg1){
  }
  public int getRequestedOrientation(){
    return 0;
  }
  public int getTaskId(){
    return 0;
  }
  public boolean isTaskRoot(){
    return false;
  }
  public boolean moveTaskToBack(boolean arg1){
    return false;
  }
  public java.lang.String getLocalClassName(){
    return (java.lang.String) null;
  }
  public android.content.ComponentName getComponentName(){
    return (android.content.ComponentName) null;
  }
  public android.content.SharedPreferences getPreferences(int arg1){
    return (android.content.SharedPreferences) null;
  }
  public void setTitleColor(int arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("title")
  public final java.lang.CharSequence getTitle(){
    return (java.lang.CharSequence) null;
  }
  public final int getTitleColor(){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("OnTitleChanged")
  protected void onTitleChanged(java.lang.CharSequence arg1, int arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("OnChildTitleChanged")
  protected void onChildTitleChanged(Activity arg1, java.lang.CharSequence arg2){
  }
  public final void setProgressBarVisibility(boolean arg1){
  }
  public final void setProgressBarIndeterminateVisibility(boolean arg1){
  }
  public final void setProgressBarIndeterminate(boolean arg1){
  }
  public final void setProgress(int arg1){
  }
  public final void setSecondaryProgress(int arg1){
  }
  public final void setVolumeControlStream(int arg1){
  }
  public final int getVolumeControlStream(){
    return 0;
  }
  public final void runOnUiThread(@com.francetelecom.rd.stubs.annotation.CallBackRegister("run") java.lang.Runnable arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreateActivity")
  public android.view.View onCreateView(java.lang.String arg1, android.content.Context arg2, android.util.AttributeSet arg3){
    return (android.view.View) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreateActivity")
  public android.view.View onCreateView(android.view.View arg1, java.lang.String arg2, android.content.Context arg3, android.util.AttributeSet arg4){
    return (android.view.View) null;
  }
  public boolean isImmersive(){
    return false;
  }
  public void setImmersive(boolean arg1){
  }
  public android.view.ActionMode startActionMode(@com.francetelecom.rd.stubs.annotation.CallBackRegister("actionMode") android.view.ActionMode.Callback arg1){
    return (android.view.ActionMode) null;
  }
  public android.view.ActionMode onWindowStartingActionMode(@com.francetelecom.rd.stubs.annotation.CallBackRegister("actionMode") android.view.ActionMode.Callback arg1){
    return (android.view.ActionMode) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("actionMode") 
  public void onActionModeStarted(android.view.ActionMode arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("actionMode") 
  public void onActionModeFinished(android.view.ActionMode arg1){
  }
  public final boolean isResumed(){
    return false;
  }
}
