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
public class Instrumentation
{
  // Classes

  public static class ActivityMonitor
  {
    // Constructors

    public ActivityMonitor(android.content.IntentFilter arg1, Instrumentation.ActivityResult arg2, boolean arg3){
    }
    public ActivityMonitor(java.lang.String arg1, Instrumentation.ActivityResult arg2, boolean arg3){
    }
    // Methods

    public final android.content.IntentFilter getFilter(){
      return (android.content.IntentFilter) null;
    }
    public final boolean isBlocking(){
      return false;
    }
    public final Instrumentation.ActivityResult getResult(){
      return (Instrumentation.ActivityResult) null;
    }
    public final int getHits(){
      return 0;
    }
    public final Activity waitForActivity(){
      return (Activity) null;
    }
    public final Activity waitForActivityWithTimeout(long arg1){
      return (Activity) null;
    }
    public final Activity getLastActivity(){
      return (Activity) null;
    }
  }
  public static final class ActivityResult
  {
    // Constructors

    public ActivityResult(int arg1, android.content.Intent arg2){
    }
    // Methods

    public int getResultCode(){
      return 0;
    }
    public android.content.Intent getResultData(){
      return (android.content.Intent) null;
    }
  }
  // Fields

  public static final java.lang.String REPORT_KEY_IDENTIFIER = "id";

  public static final java.lang.String REPORT_KEY_STREAMRESULT = "stream";

  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public Instrumentation(){
  }
  // Methods

  public android.content.Context getContext(){
    return (android.content.Context) null;
  }
  public void start(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onCreate(android.os.Bundle arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onDestroy(){
  }
  public void finish(int arg1, android.os.Bundle arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onStart(){
  }
  public android.content.ComponentName getComponentName(){
    return (android.content.ComponentName) null;
  }
  public Instrumentation.ActivityResult execStartActivity(android.content.Context arg1, android.os.IBinder arg2, android.os.IBinder arg3, Activity arg4, android.content.Intent arg5, int arg6){
    return (Instrumentation.ActivityResult) null;
  }
  public Instrumentation.ActivityResult execStartActivity(android.content.Context arg1, android.os.IBinder arg2, android.os.IBinder arg3, Fragment arg4, android.content.Intent arg5, int arg6){
    return (Instrumentation.ActivityResult) null;
  }
  public void execStartActivities(android.content.Context arg1, android.os.IBinder arg2, android.os.IBinder arg3, Activity arg4, android.content.Intent [] arg5){
  }
  public void callActivityOnStart(Activity arg1){
  }
  public void callActivityOnRestart(Activity arg1){
  }
  public void callActivityOnResume(Activity arg1){
  }
  public void callActivityOnStop(Activity arg1){
  }
  public void startPerformanceSnapshot(){
  }
  public void addMonitor(Instrumentation.ActivityMonitor arg1){
  }
  public Instrumentation.ActivityMonitor addMonitor(android.content.IntentFilter arg1, Instrumentation.ActivityResult arg2, boolean arg3){
    return (Instrumentation.ActivityMonitor) null;
  }
  public Instrumentation.ActivityMonitor addMonitor(java.lang.String arg1, Instrumentation.ActivityResult arg2, boolean arg3){
    return (Instrumentation.ActivityMonitor) null;
  }
  public void setInTouchMode(boolean arg1){
  }
  public void sendStatus(int arg1, android.os.Bundle arg2){
  }
  public android.content.Context getTargetContext(){
    return (android.content.Context) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onException(java.lang.Object arg1, java.lang.Throwable arg2){
    return false;
  }
  public void setAutomaticPerformanceSnapshots(){
  }
  public void endPerformanceSnapshot(){
  }
  public boolean isProfiling(){
    return false;
  }
  public void startProfiling(){
  }
  public void stopProfiling(){
  }
  public void waitForIdle(@com.francetelecom.rd.stubs.annotation.CallBackRegister("run") java.lang.Runnable arg1){
  }
  public void waitForIdleSync(){
  }
  public void runOnMainSync(@com.francetelecom.rd.stubs.annotation.CallBackRegister("run") java.lang.Runnable arg1){
  }
  public Activity startActivitySync(android.content.Intent arg1){
    return (Activity) null;
  }
  public boolean checkMonitorHit(Instrumentation.ActivityMonitor arg1, int arg2){
    return false;
  }
  public Activity waitForMonitor(Instrumentation.ActivityMonitor arg1){
    return (Activity) null;
  }
  public Activity waitForMonitorWithTimeout(Instrumentation.ActivityMonitor arg1, long arg2){
    return (Activity) null;
  }
  public void removeMonitor(Instrumentation.ActivityMonitor arg1){
  }
  public boolean invokeMenuActionSync(Activity arg1, int arg2, int arg3){
    return false;
  }
  public boolean invokeContextMenuAction(Activity arg1, int arg2, int arg3){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "Instrumentation.sendStringSync", report = "-")
  public void sendStringSync(java.lang.String arg1){
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "Instrumentation.sendKeySync", report = "-")
  public void sendKeySync(android.view.KeyEvent arg1){
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "Instrumentation.sendKeyDownUpSync", report = "-")
  public void sendKeyDownUpSync(int arg1){
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "Instrumentation.sendCharacterSync", report = "-")
  public void sendCharacterSync(int arg1){
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "Instrumentation.sendPointerSync", report = "-")
  public void sendPointerSync(android.view.MotionEvent arg1){
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "Instrumentation.sendTrackballEventSync", report = "-")
  public void sendTrackballEventSync(android.view.MotionEvent arg1){
  }
  public Application newApplication(java.lang.ClassLoader arg1, java.lang.String arg2, android.content.Context arg3) throws java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.ClassNotFoundException{
    return (Application) null;
  }
  public static Application newApplication(java.lang.Class<?> arg1, android.content.Context arg2) throws java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.ClassNotFoundException{
    return (Application) null;
  }
  public void callApplicationOnCreate(Application arg1){
  }
  public Activity newActivity(java.lang.Class<?> arg1, android.content.Context arg2, android.os.IBinder arg3, Application arg4, android.content.Intent arg5, android.content.pm.ActivityInfo arg6, java.lang.CharSequence arg7, Activity arg8, java.lang.String arg9, java.lang.Object arg10) throws java.lang.InstantiationException, java.lang.IllegalAccessException{
    return (Activity) null;
  }
  public Activity newActivity(java.lang.ClassLoader arg1, java.lang.String arg2, android.content.Intent arg3) throws java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.ClassNotFoundException{
    return (Activity) null;
  }
  public void callActivityOnCreate(Activity arg1, android.os.Bundle arg2){
  }
  public void callActivityOnDestroy(Activity arg1){
  }
  public void callActivityOnRestoreInstanceState(Activity arg1, android.os.Bundle arg2){
  }
  public void callActivityOnPostCreate(Activity arg1, android.os.Bundle arg2){
  }
  public void callActivityOnNewIntent(Activity arg1, android.content.Intent arg2){
  }
  public void callActivityOnSaveInstanceState(Activity arg1, android.os.Bundle arg2){
  }
  public void callActivityOnPause(Activity arg1){
  }
  public void callActivityOnUserLeaving(Activity arg1){
  }
  public void startAllocCounting(){
  }
  public void stopAllocCounting(){
  }
  public android.os.Bundle getAllocCounts(){
    return (android.os.Bundle) null;
  }
  public android.os.Bundle getBinderCounts(){
    return (android.os.Bundle) null;
  }
}
