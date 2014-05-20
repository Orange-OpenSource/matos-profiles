package com.android.server.am;

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
public final class ActivityManagerService
  extends android.app.ActivityManagerNative  implements com.android.server.Watchdog.Monitor, com.android.internal.os.BatteryStatsImpl.BatteryCallback
{
  // Constructors
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate") 
  private ActivityManagerService(){
    super();
  }
  // Methods

  public static final android.content.Context main(int arg1){
    return (android.content.Context) null;
  }
  public boolean shutdown(int arg1){
    return false;
  }
  public int checkPermission(java.lang.String arg1, int arg2, int arg3){
    return 0;
  }
  public static ActivityManagerService self(){
    return (ActivityManagerService) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate") 
  public boolean onTransact(int arg1, android.os.Parcel arg2, android.os.Parcel arg3, int arg4) throws android.os.RemoteException{
    return false;
  }
  protected void dump(java.io.FileDescriptor arg1, java.io.PrintWriter arg2, java.lang.String [] arg3){
  }
  public final int startActivity(android.app.IApplicationThread arg1, android.content.Intent arg2, java.lang.String arg3, android.net.Uri [] arg4, int arg5, android.os.IBinder arg6, java.lang.String arg7, int arg8, boolean arg9, boolean arg10, java.lang.String arg11, android.os.ParcelFileDescriptor arg12, boolean arg13){
    return 0;
  }
  public final int startActivities(android.app.IApplicationThread arg1, android.content.Intent [] arg2, java.lang.String [] arg3, android.os.IBinder arg4){
    return 0;
  }
  public boolean startNextMatchingActivity(android.os.IBinder arg1, android.content.Intent arg2){
    return false;
  }
  public void overridePendingTransition(android.os.IBinder arg1, java.lang.String arg2, int arg3, int arg4){
  }
  public java.lang.String getCallingPackage(android.os.IBinder arg1){
    return (java.lang.String) null;
  }
  public android.content.ComponentName getCallingActivity(android.os.IBinder arg1){
    return (android.content.ComponentName) null;
  }
  public final boolean finishActivity(android.os.IBinder arg1, int arg2, android.content.Intent arg3){
    return false;
  }
  public void setRequestedOrientation(android.os.IBinder arg1, int arg2){
  }
  public int getRequestedOrientation(android.os.IBinder arg1){
    return 0;
  }
  public void moveTaskToBack(int arg1){
  }
  public boolean isImmersive(android.os.IBinder arg1){
    return false;
  }
  public void setImmersive(android.os.IBinder arg1, boolean arg2){
  }
  public android.content.Intent registerReceiver(android.app.IApplicationThread arg1, java.lang.String arg2, @com.francetelecom.rd.stubs.annotation.CallBackRegister("intentReceiver") android.content.IIntentReceiver arg3, android.content.IntentFilter arg4, java.lang.String arg5){
    return (android.content.Intent) null;
  }
  public void unregisterReceiver(android.content.IIntentReceiver arg1){
  }
  public android.content.ComponentName startService(android.app.IApplicationThread arg1, android.content.Intent arg2, java.lang.String arg3){
    return (android.content.ComponentName) null;
  }
  public int stopService(android.app.IApplicationThread arg1, android.content.Intent arg2, java.lang.String arg3){
    return 0;
  }
  public int bindService(android.app.IApplicationThread arg1, android.os.IBinder arg2, android.content.Intent arg3, java.lang.String arg4, android.app.IServiceConnection arg5, int arg6){
    return 0;
  }
  public boolean unbindService(android.app.IServiceConnection arg1){
    return false;
  }
  public boolean startInstrumentation(android.content.ComponentName arg1, java.lang.String arg2, int arg3, android.os.Bundle arg4, @com.francetelecom.rd.stubs.annotation.CallBackRegister("iInstrumentationWatcher") android.app.IInstrumentationWatcher arg5){
    return false;
  }
  public void grantUriPermission(android.app.IApplicationThread arg1, java.lang.String arg2, android.net.Uri arg3, int arg4){
  }
  public void revokeUriPermission(android.app.IApplicationThread arg1, android.net.Uri arg2, int arg3){
  }
  public int checkUriPermission(android.net.Uri arg1, int arg2, int arg3, int arg4){
    return 0;
  }
  public android.os.IBinder peekService(android.content.Intent arg1, java.lang.String arg2){
    return (android.os.IBinder) null;
  }
  public android.content.IIntentSender getIntentSender(int arg1, java.lang.String arg2, android.os.IBinder arg3, java.lang.String arg4, int arg5, android.content.Intent [] arg6, java.lang.String [] arg7, int arg8){
    return (android.content.IIntentSender) null;
  }
  protected boolean dumpService(java.io.FileDescriptor arg1, java.io.PrintWriter arg2, java.lang.String arg3, java.lang.String [] arg4, int arg5, boolean arg6){
    return false;
  }
  public boolean dumpHeap(java.lang.String arg1, boolean arg2, java.lang.String arg3, android.os.ParcelFileDescriptor arg4) throws android.os.RemoteException{
    return false;
  }
  public void getMemoryInfo(android.app.ActivityManager.MemoryInfo arg1){
  }
  protected boolean dumpActivity(java.io.FileDescriptor arg1, java.io.PrintWriter arg2, java.lang.String arg3, java.lang.String [] arg4, int arg5, boolean arg6){
    return false;
  }
  public void monitor(){
  }
  public void systemReady(java.lang.Runnable arg1){
  }
  public java.util.List<android.app.ActivityManager.RunningServiceInfo> getServices(int arg1, int arg2){
    return (java.util.List) null;
  }
  public void closeSystemDialogs(java.lang.String arg1){
  }
  public android.content.res.Configuration getConfiguration(){
    return (android.content.res.Configuration) null;
  }
  public void updateConfiguration(android.content.res.Configuration arg1){
  }
  public void showBootMessage(java.lang.CharSequence arg1, boolean arg2){
  }
  public boolean clearApplicationUserData(java.lang.String arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("packageDataObserver") android.content.pm.IPackageDataObserver arg2){
    return false;
  }
  public final void enterSafeMode(){
  }
  public int startActivityIntentSender(android.app.IApplicationThread arg1, android.content.IntentSender arg2, android.content.Intent arg3, java.lang.String arg4, android.os.IBinder arg5, java.lang.String arg6, int arg7, int arg8, int arg9){
    return 0;
  }
  public final void finishSubActivity(android.os.IBinder arg1, java.lang.String arg2, int arg3){
  }
  public int getTaskForActivity(android.os.IBinder arg1, boolean arg2){
    return 0;
  }
  public boolean moveActivityTaskToBack(android.os.IBinder arg1, boolean arg2){
    return false;
  }
  public void cancelIntentSender(@com.francetelecom.rd.stubs.annotation.CallBackRegister("intentSender") android.content.IIntentSender arg1){
  }
  public java.lang.String getPackageForIntentSender(@com.francetelecom.rd.stubs.annotation.CallBackRegister("intentSender") android.content.IIntentSender arg1){
    return (java.lang.String) null;
  }
  public boolean isIntentSenderTargetedToPackage(android.content.IIntentSender arg1){
    return false;
  }
  public void unbindBackupAgent(android.content.pm.ApplicationInfo arg1){
  }
  public void killApplicationProcess(java.lang.String arg1, int arg2){
  }
  public java.lang.String getProviderMimeType(android.net.Uri arg1){
    return (java.lang.String) null;
  }
  public void forceStopPackage(java.lang.String arg1){
  }
  public final android.app.IActivityManager.WaitResult startActivityAndWait(android.app.IApplicationThread arg1, android.content.Intent arg2, java.lang.String arg3, android.net.Uri [] arg4, int arg5, android.os.IBinder arg6, java.lang.String arg7, int arg8, boolean arg9, boolean arg10, java.lang.String arg11, android.os.ParcelFileDescriptor arg12, boolean arg13){
    return (android.app.IActivityManager.WaitResult) null;
  }
  public final int broadcastIntent(android.app.IApplicationThread arg1, android.content.Intent arg2, java.lang.String arg3, @com.francetelecom.rd.stubs.annotation.CallBackRegister("intentReceiver") android.content.IIntentReceiver arg4, int arg5, java.lang.String arg6, android.os.Bundle arg7, java.lang.String arg8, boolean arg9, boolean arg10){
    return 0;
  }
  public boolean profileControl(java.lang.String arg1, boolean arg2, java.lang.String arg3, android.os.ParcelFileDescriptor arg4, int arg5) throws android.os.RemoteException{
    return false;
  }
  public void setPackageScreenCompatMode(java.lang.String arg1, int arg2){
  }
  public void handleApplicationStrictModeViolation(android.os.IBinder arg1, int arg2, android.os.StrictMode.ViolationInfo arg3){
  }
  public boolean stopServiceToken(android.content.ComponentName arg1, android.os.IBinder arg2, int arg3){
    return false;
  }
  public void setServiceForeground(android.content.ComponentName arg1, android.os.IBinder arg2, int arg3, android.app.Notification arg4, boolean arg5){
  }
  public void finishInstrumentation(android.app.IApplicationThread arg1, int arg2, android.os.Bundle arg3){
  }
  public final android.app.IActivityManager.ContentProviderHolder getContentProvider(android.app.IApplicationThread arg1, java.lang.String arg2){
    return (android.app.IActivityManager.ContentProviderHolder) null;
  }
  public void signalPersistentProcesses(int arg1) throws android.os.RemoteException{
  }
  public void setActivityController(@com.francetelecom.rd.stubs.annotation.CallBackRegister("ActivityController") android.app.IActivityController arg1){
  }
  public void setProcessForeground(android.os.IBinder arg1, int arg2, boolean arg3){
  }
  public final void activityIdle(android.os.IBinder arg1, android.content.res.Configuration arg2, boolean arg3){
  }
  public void crashApplication(int arg1, int arg2, java.lang.String arg3, java.lang.String arg4){
  }
  public final int startActivityWithConfig(android.app.IApplicationThread arg1, android.content.Intent arg2, java.lang.String arg3, android.net.Uri [] arg4, int arg5, android.os.IBinder arg6, java.lang.String arg7, int arg8, boolean arg9, boolean arg10, android.content.res.Configuration arg11){
    return 0;
  }
  public boolean killPids(int [] arg1, java.lang.String arg2, boolean arg3){
    return false;
  }
  public void finishReceiver(android.os.IBinder arg1, int arg2, java.lang.String arg3, android.os.Bundle arg4, boolean arg5){
  }
  public void stopAppSwitches(){
  }
  public void killApplicationWithUid(java.lang.String arg1, int arg2){
  }
  public void handleApplicationCrash(android.os.IBinder arg1, android.app.ApplicationErrorReport.CrashInfo arg2){
  }
  public boolean willActivityBeVisible(android.os.IBinder arg1){
    return false;
  }
  public final void unbroadcastIntent(android.app.IApplicationThread arg1, android.content.Intent arg2){
  }
  public final void attachApplication(android.app.IApplicationThread arg1){
  }
  public final void activityPaused(android.os.IBinder arg1){
  }
  public final void activityStopped(android.os.IBinder arg1, android.os.Bundle arg2, android.graphics.Bitmap arg3, java.lang.CharSequence arg4){
  }
  public final void activitySlept(android.os.IBinder arg1){
  }
  public final void activityDestroyed(android.os.IBinder arg1){
  }
  public java.util.List getTasks(int arg1, int arg2, android.app.IThumbnailReceiver arg3){
    return (java.util.List) null;
  }
  public java.util.List<android.app.ActivityManager.RecentTaskInfo> getRecentTasks(int arg1, int arg2){
    return (java.util.List) null;
  }
  public android.app.ActivityManager.TaskThumbnails getTaskThumbnails(int arg1){
    return (android.app.ActivityManager.TaskThumbnails) null;
  }
  public java.util.List<android.app.ActivityManager.ProcessErrorStateInfo> getProcessesInErrorState(){
    return (java.util.List) null;
  }
  public void moveTaskToFront(int arg1, int arg2){
  }
  public void moveTaskBackwards(int arg1){
  }
  public void finishOtherInstances(android.os.IBinder arg1, android.content.ComponentName arg2){
  }
  public void reportThumbnail(android.os.IBinder arg1, android.graphics.Bitmap arg2, java.lang.CharSequence arg3){
  }
  public void removeContentProvider(android.app.IApplicationThread arg1, java.lang.String arg2){
  }
  public final void publishContentProviders(android.app.IApplicationThread arg1, java.util.List<android.app.IActivityManager.ContentProviderHolder> arg2){
  }
  public android.app.PendingIntent getRunningServiceControlPanel(android.content.ComponentName arg1){
    return (android.app.PendingIntent) null;
  }
  public void publishService(android.os.IBinder arg1, android.content.Intent arg2, android.os.IBinder arg3){
  }
  public void unbindFinished(android.os.IBinder arg1, android.content.Intent arg2, boolean arg3){
  }
  public void serviceDoneExecuting(android.os.IBinder arg1, int arg2, int arg3, int arg4){
  }
  public boolean bindBackupAgent(android.content.pm.ApplicationInfo arg1, int arg2){
    return false;
  }
  public void backupAgentCreated(java.lang.String arg1, android.os.IBinder arg2){
  }
  public android.content.ComponentName getActivityClassForToken(android.os.IBinder arg1){
    return (android.content.ComponentName) null;
  }
  public java.lang.String getPackageForToken(android.os.IBinder arg1){
    return (java.lang.String) null;
  }
  public void setProcessLimit(int arg1){
  }
  public int getProcessLimit(){
    return 0;
  }
  public void showWaitingForDebugger(android.app.IApplicationThread arg1, boolean arg2){
  }
  public void killBackgroundProcesses(java.lang.String arg1){
  }
  public void goingToSleep(){
  }
  public void wakingUp(){
  }
  public void unhandledBack(){
  }
  public android.os.ParcelFileDescriptor openContentUri(android.net.Uri arg1) throws android.os.RemoteException{
    return (android.os.ParcelFileDescriptor) null;
  }
  public void setDebugApp(java.lang.String arg1, boolean arg2, boolean arg3){
  }
  public void setAlwaysFinish(boolean arg1){
  }
  public void noteWakeupAlarm(@com.francetelecom.rd.stubs.annotation.CallBackRegister("intentSender") android.content.IIntentSender arg1){
  }
  public final void startRunning(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4){
  }
  public boolean handleApplicationWtf(android.os.IBinder arg1, java.lang.String arg2, android.app.ApplicationErrorReport.CrashInfo arg3){
    return false;
  }
  public java.util.List<android.app.ActivityManager.RunningAppProcessInfo> getRunningAppProcesses(){
    return (java.util.List) null;
  }
  public java.util.List<android.content.pm.ApplicationInfo> getRunningExternalApplications(){
    return (java.util.List) null;
  }
  public android.content.pm.ConfigurationInfo getDeviceConfigurationInfo(){
    return (android.content.pm.ConfigurationInfo) null;
  }
  public void resumeAppSwitches(){
  }
  public void registerActivityWatcher(@com.francetelecom.rd.stubs.annotation.CallBackRegister("ActivityWatcher") android.app.IActivityWatcher arg1){
  }
  public void unregisterActivityWatcher(android.app.IActivityWatcher arg1){
  }
  public final int startActivityInPackage(int arg1, android.content.Intent arg2, java.lang.String arg3, android.os.IBinder arg4, java.lang.String arg5, int arg6, boolean arg7){
    return 0;
  }
  public android.os.Debug.MemoryInfo [] getProcessMemoryInfo(int [] arg1) throws android.os.RemoteException{
    return (android.os.Debug.MemoryInfo []) null;
  }
  public boolean isUserAMonkey(){
    return false;
  }
  public final void finishHeavyWeightApp(){
  }
  public boolean isTopActivityImmersive(){
    return false;
  }
  public android.os.IBinder newUriPermissionOwner(java.lang.String arg1){
    return (android.os.IBinder) null;
  }
  public void grantUriPermissionFromOwner(android.os.IBinder arg1, int arg2, java.lang.String arg3, android.net.Uri arg4, int arg5){
  }
  public void revokeUriPermissionFromOwner(android.os.IBinder arg1, android.net.Uri arg2, int arg3){
  }
  public int checkGrantUriPermission(int arg1, java.lang.String arg2, android.net.Uri arg3, int arg4){
    return 0;
  }
  public final int startActivitiesInPackage(int arg1, android.content.Intent [] arg2, java.lang.String [] arg3, android.os.IBinder arg4){
    return 0;
  }
  public int getFrontActivityScreenCompatMode(){
    return 0;
  }
  public void setFrontActivityScreenCompatMode(int arg1){
  }
  public int getPackageScreenCompatMode(java.lang.String arg1){
    return 0;
  }
  public boolean getPackageAskScreenCompat(java.lang.String arg1){
    return false;
  }
  public void setPackageAskScreenCompat(java.lang.String arg1, boolean arg2){
  }
  public boolean switchUser(int arg1){
    return false;
  }
  public boolean removeSubTask(int arg1, int arg2){
    return false;
  }
  public boolean removeTask(int arg1, int arg2){
    return false;
  }
  public void registerProcessObserver(@com.francetelecom.rd.stubs.annotation.CallBackRegister("IProcessObserver") android.app.IProcessObserver arg1){
  }
  public void unregisterProcessObserver(android.app.IProcessObserver arg1){
  }
  public void updatePersistentConfiguration(android.content.res.Configuration arg1){
  }
  public long [] getProcessPss(int [] arg1) throws android.os.RemoteException{
    return (long []) null;
  }
  public void dismissKeyguardOnNextActivity(){
  }
  public boolean testIsSystemReady(){
    return false;
  }
  public static final void installSystemProviders(){
  }
  public void setWindowManager(com.android.server.wm.WindowManagerService arg1){
  }
  public void batteryNeedsCpuUpdate(){
  }
  public void batteryPowerChanged(boolean arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate") 
  public void onCoreSettingsChange(android.os.Bundle arg1){
  }
  public static java.io.File dumpStackTraces(boolean arg1, java.util.ArrayList<java.lang.Integer> arg2, com.android.internal.os.ProcessStats arg3, android.util.SparseArray<java.lang.Boolean> arg4){
    return (java.io.File) null;
  }
  public boolean isSleeping(){
    return false;
  }
  public static void setSystemProcess(){
  }
  public final void showSafeModeOverlay(){
  }
}
