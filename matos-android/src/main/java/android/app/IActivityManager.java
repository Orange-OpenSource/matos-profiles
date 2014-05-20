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
public interface IActivityManager
  extends android.os.IInterface
{
  // Classes

  public static class ContentProviderHolder
    implements android.os.Parcelable
  {
    // Fields

    public final android.content.pm.ProviderInfo info = (android.content.pm.ProviderInfo) null;

    public android.content.IContentProvider provider;

    public boolean noReleaseNeeded;

    public static final android.os.Parcelable.Creator<IActivityManager.ContentProviderHolder> CREATOR = null;

    // Constructors

    public ContentProviderHolder(android.content.pm.ProviderInfo arg1){
    }
    private ContentProviderHolder(android.os.Parcel arg1){
    }
    // Methods

    public void writeToParcel(android.os.Parcel arg1, int arg2){
    }
    public int describeContents(){
      return 0;
    }
  }
  public static class WaitResult
    implements android.os.Parcelable
  {
    // Fields

    public int result;

    public boolean timeout;

    public android.content.ComponentName who;

    public long thisTime;

    public long totalTime;

    public static final android.os.Parcelable.Creator<IActivityManager.WaitResult> CREATOR = null;

    // Constructors

    public WaitResult(){
    }
    private WaitResult(android.os.Parcel arg1){
    }
    // Methods

    public void writeToParcel(android.os.Parcel arg1, int arg2){
    }
    public int describeContents(){
      return 0;
    }
  }
  // Fields

  public static final int START_SWITCHES_CANCELED = 4;

  public static final int START_DELIVERED_TO_TOP = 3;

  public static final int START_TASK_TO_FRONT = 2;

  public static final int START_RETURN_INTENT_TO_CALLER = 1;

  public static final int START_SUCCESS = 0;

  public static final int START_INTENT_NOT_RESOLVED = -1;

  public static final int START_CLASS_NOT_FOUND = -2;

  public static final int START_FORWARD_AND_REQUEST_CONFLICT = -3;

  public static final int START_PERMISSION_DENIED = -4;

  public static final int START_NOT_ACTIVITY = -5;

  public static final int START_CANCELED = -6;

  public static final int BROADCAST_SUCCESS = 0;

  public static final int BROADCAST_STICKY_CANT_HAVE_PERMISSION = -1;

  public static final int INTENT_SENDER_BROADCAST = 1;

  public static final int INTENT_SENDER_ACTIVITY = 2;

  public static final int INTENT_SENDER_ACTIVITY_RESULT = 3;

  public static final int INTENT_SENDER_SERVICE = 4;

  public static final java.lang.String descriptor = "android.app.IActivityManager";

  public static final int START_RUNNING_TRANSACTION = 1;

  public static final int HANDLE_APPLICATION_CRASH_TRANSACTION = 2;

  public static final int START_ACTIVITY_TRANSACTION = 3;

  public static final int UNHANDLED_BACK_TRANSACTION = 4;

  public static final int OPEN_CONTENT_URI_TRANSACTION = 5;

  public static final int FINISH_ACTIVITY_TRANSACTION = 11;

  public static final int REGISTER_RECEIVER_TRANSACTION = 12;

  public static final int UNREGISTER_RECEIVER_TRANSACTION = 13;

  public static final int BROADCAST_INTENT_TRANSACTION = 14;

  public static final int UNBROADCAST_INTENT_TRANSACTION = 15;

  public static final int FINISH_RECEIVER_TRANSACTION = 16;

  public static final int ATTACH_APPLICATION_TRANSACTION = 17;

  public static final int ACTIVITY_IDLE_TRANSACTION = 18;

  public static final int ACTIVITY_PAUSED_TRANSACTION = 19;

  public static final int ACTIVITY_STOPPED_TRANSACTION = 20;

  public static final int GET_CALLING_PACKAGE_TRANSACTION = 21;

  public static final int GET_CALLING_ACTIVITY_TRANSACTION = 22;

  public static final int GET_TASKS_TRANSACTION = 23;

  public static final int MOVE_TASK_TO_FRONT_TRANSACTION = 24;

  public static final int MOVE_TASK_TO_BACK_TRANSACTION = 25;

  public static final int MOVE_TASK_BACKWARDS_TRANSACTION = 26;

  public static final int GET_TASK_FOR_ACTIVITY_TRANSACTION = 27;

  public static final int REPORT_THUMBNAIL_TRANSACTION = 28;

  public static final int GET_CONTENT_PROVIDER_TRANSACTION = 29;

  public static final int PUBLISH_CONTENT_PROVIDERS_TRANSACTION = 30;

  public static final int FINISH_SUB_ACTIVITY_TRANSACTION = 32;

  public static final int GET_RUNNING_SERVICE_CONTROL_PANEL_TRANSACTION = 33;

  public static final int START_SERVICE_TRANSACTION = 34;

  public static final int STOP_SERVICE_TRANSACTION = 35;

  public static final int BIND_SERVICE_TRANSACTION = 36;

  public static final int UNBIND_SERVICE_TRANSACTION = 37;

  public static final int PUBLISH_SERVICE_TRANSACTION = 38;

  public static final int FINISH_OTHER_INSTANCES_TRANSACTION = 39;

  public static final int GOING_TO_SLEEP_TRANSACTION = 40;

  public static final int WAKING_UP_TRANSACTION = 41;

  public static final int SET_DEBUG_APP_TRANSACTION = 42;

  public static final int SET_ALWAYS_FINISH_TRANSACTION = 43;

  public static final int START_INSTRUMENTATION_TRANSACTION = 44;

  public static final int FINISH_INSTRUMENTATION_TRANSACTION = 45;

  public static final int GET_CONFIGURATION_TRANSACTION = 46;

  public static final int UPDATE_CONFIGURATION_TRANSACTION = 47;

  public static final int STOP_SERVICE_TOKEN_TRANSACTION = 48;

  public static final int GET_ACTIVITY_CLASS_FOR_TOKEN_TRANSACTION = 49;

  public static final int GET_PACKAGE_FOR_TOKEN_TRANSACTION = 50;

  public static final int SET_PROCESS_LIMIT_TRANSACTION = 51;

  public static final int GET_PROCESS_LIMIT_TRANSACTION = 52;

  public static final int CHECK_PERMISSION_TRANSACTION = 53;

  public static final int CHECK_URI_PERMISSION_TRANSACTION = 54;

  public static final int GRANT_URI_PERMISSION_TRANSACTION = 55;

  public static final int REVOKE_URI_PERMISSION_TRANSACTION = 56;

  public static final int SET_ACTIVITY_CONTROLLER_TRANSACTION = 57;

  public static final int SHOW_WAITING_FOR_DEBUGGER_TRANSACTION = 58;

  public static final int SIGNAL_PERSISTENT_PROCESSES_TRANSACTION = 59;

  public static final int GET_RECENT_TASKS_TRANSACTION = 60;

  public static final int SERVICE_DONE_EXECUTING_TRANSACTION = 61;

  public static final int ACTIVITY_DESTROYED_TRANSACTION = 62;

  public static final int GET_INTENT_SENDER_TRANSACTION = 63;

  public static final int CANCEL_INTENT_SENDER_TRANSACTION = 64;

  public static final int GET_PACKAGE_FOR_INTENT_SENDER_TRANSACTION = 65;

  public static final int ENTER_SAFE_MODE_TRANSACTION = 66;

  public static final int START_NEXT_MATCHING_ACTIVITY_TRANSACTION = 67;

  public static final int NOTE_WAKEUP_ALARM_TRANSACTION = 68;

  public static final int REMOVE_CONTENT_PROVIDER_TRANSACTION = 69;

  public static final int SET_REQUESTED_ORIENTATION_TRANSACTION = 70;

  public static final int GET_REQUESTED_ORIENTATION_TRANSACTION = 71;

  public static final int UNBIND_FINISHED_TRANSACTION = 72;

  public static final int SET_PROCESS_FOREGROUND_TRANSACTION = 73;

  public static final int SET_SERVICE_FOREGROUND_TRANSACTION = 74;

  public static final int MOVE_ACTIVITY_TASK_TO_BACK_TRANSACTION = 75;

  public static final int GET_MEMORY_INFO_TRANSACTION = 76;

  public static final int GET_PROCESSES_IN_ERROR_STATE_TRANSACTION = 77;

  public static final int CLEAR_APP_DATA_TRANSACTION = 78;

  public static final int FORCE_STOP_PACKAGE_TRANSACTION = 79;

  public static final int KILL_PIDS_TRANSACTION = 80;

  public static final int GET_SERVICES_TRANSACTION = 81;

  public static final int GET_TASK_THUMBNAILS_TRANSACTION = 82;

  public static final int GET_RUNNING_APP_PROCESSES_TRANSACTION = 83;

  public static final int GET_DEVICE_CONFIGURATION_TRANSACTION = 84;

  public static final int PEEK_SERVICE_TRANSACTION = 85;

  public static final int PROFILE_CONTROL_TRANSACTION = 86;

  public static final int SHUTDOWN_TRANSACTION = 87;

  public static final int STOP_APP_SWITCHES_TRANSACTION = 88;

  public static final int RESUME_APP_SWITCHES_TRANSACTION = 89;

  public static final int START_BACKUP_AGENT_TRANSACTION = 90;

  public static final int BACKUP_AGENT_CREATED_TRANSACTION = 91;

  public static final int UNBIND_BACKUP_AGENT_TRANSACTION = 92;

  public static final int REGISTER_ACTIVITY_WATCHER_TRANSACTION = 93;

  public static final int UNREGISTER_ACTIVITY_WATCHER_TRANSACTION = 94;

  public static final int START_ACTIVITY_IN_PACKAGE_TRANSACTION = 95;

  public static final int KILL_APPLICATION_WITH_UID_TRANSACTION = 96;

  public static final int CLOSE_SYSTEM_DIALOGS_TRANSACTION = 97;

  public static final int GET_PROCESS_MEMORY_INFO_TRANSACTION = 98;

  public static final int KILL_APPLICATION_PROCESS_TRANSACTION = 99;

  public static final int START_ACTIVITY_INTENT_SENDER_TRANSACTION = 100;

  public static final int OVERRIDE_PENDING_TRANSITION_TRANSACTION = 101;

  public static final int HANDLE_APPLICATION_WTF_TRANSACTION = 102;

  public static final int KILL_BACKGROUND_PROCESSES_TRANSACTION = 103;

  public static final int IS_USER_A_MONKEY_TRANSACTION = 104;

  public static final int START_ACTIVITY_AND_WAIT_TRANSACTION = 105;

  public static final int WILL_ACTIVITY_BE_VISIBLE_TRANSACTION = 106;

  public static final int START_ACTIVITY_WITH_CONFIG_TRANSACTION = 107;

  public static final int GET_RUNNING_EXTERNAL_APPLICATIONS_TRANSACTION = 108;

  public static final int FINISH_HEAVY_WEIGHT_APP_TRANSACTION = 109;

  public static final int HANDLE_APPLICATION_STRICT_MODE_VIOLATION_TRANSACTION = 110;

  public static final int IS_IMMERSIVE_TRANSACTION = 111;

  public static final int SET_IMMERSIVE_TRANSACTION = 112;

  public static final int IS_TOP_ACTIVITY_IMMERSIVE_TRANSACTION = 113;

  public static final int CRASH_APPLICATION_TRANSACTION = 114;

  public static final int GET_PROVIDER_MIME_TYPE_TRANSACTION = 115;

  public static final int NEW_URI_PERMISSION_OWNER_TRANSACTION = 116;

  public static final int GRANT_URI_PERMISSION_FROM_OWNER_TRANSACTION = 117;

  public static final int REVOKE_URI_PERMISSION_FROM_OWNER_TRANSACTION = 118;

  public static final int CHECK_GRANT_URI_PERMISSION_TRANSACTION = 119;

  public static final int DUMP_HEAP_TRANSACTION = 120;

  public static final int START_ACTIVITIES_TRANSACTION = 121;

  public static final int START_ACTIVITIES_IN_PACKAGE_TRANSACTION = 122;

  public static final int ACTIVITY_SLEPT_TRANSACTION = 123;

  public static final int GET_FRONT_ACTIVITY_SCREEN_COMPAT_MODE_TRANSACTION = 124;

  public static final int SET_FRONT_ACTIVITY_SCREEN_COMPAT_MODE_TRANSACTION = 125;

  public static final int GET_PACKAGE_SCREEN_COMPAT_MODE_TRANSACTION = 126;

  public static final int SET_PACKAGE_SCREEN_COMPAT_MODE_TRANSACTION = 127;

  public static final int GET_PACKAGE_ASK_SCREEN_COMPAT_TRANSACTION = 128;

  public static final int SET_PACKAGE_ASK_SCREEN_COMPAT_TRANSACTION = 129;

  public static final int SWITCH_USER_TRANSACTION = 130;

  public static final int REMOVE_SUB_TASK_TRANSACTION = 131;

  public static final int REMOVE_TASK_TRANSACTION = 132;

  public static final int REGISTER_PROCESS_OBSERVER_TRANSACTION = 133;

  public static final int UNREGISTER_PROCESS_OBSERVER_TRANSACTION = 134;

  public static final int IS_INTENT_SENDER_TARGETED_TO_PACKAGE_TRANSACTION = 135;

  public static final int UPDATE_PERSISTENT_CONFIGURATION_TRANSACTION = 136;

  public static final int GET_PROCESS_PSS_TRANSACTION = 137;

  public static final int SHOW_BOOT_MESSAGE_TRANSACTION = 138;

  public static final int DISMISS_KEYGUARD_ON_NEXT_ACTIVITY_TRANSACTION = 139;

  // Methods

  @com.francetelecom.rd.stubs.annotation.UseRule(value = "IActivityManager.shutdown", report = "-")
  public boolean shutdown(int arg1) throws android.os.RemoteException;
  public int checkPermission(java.lang.String arg1, int arg2, int arg3) throws android.os.RemoteException;
  public int startActivity(IApplicationThread arg1, android.content.Intent arg2, java.lang.String arg3, android.net.Uri [] arg4, int arg5, android.os.IBinder arg6, java.lang.String arg7, int arg8, boolean arg9, boolean arg10, java.lang.String arg11, android.os.ParcelFileDescriptor arg12, boolean arg13) throws android.os.RemoteException;
  public int startActivities(IApplicationThread arg1, android.content.Intent [] arg2, java.lang.String [] arg3, android.os.IBinder arg4) throws android.os.RemoteException;
  public boolean startNextMatchingActivity(android.os.IBinder arg1, android.content.Intent arg2) throws android.os.RemoteException;
  public void overridePendingTransition(android.os.IBinder arg1, java.lang.String arg2, int arg3, int arg4) throws android.os.RemoteException;
  public java.lang.String getCallingPackage(android.os.IBinder arg1) throws android.os.RemoteException;
  public android.content.ComponentName getCallingActivity(android.os.IBinder arg1) throws android.os.RemoteException;
  public boolean finishActivity(android.os.IBinder arg1, int arg2, android.content.Intent arg3) throws android.os.RemoteException;
  public void setRequestedOrientation(android.os.IBinder arg1, int arg2) throws android.os.RemoteException;
  public int getRequestedOrientation(android.os.IBinder arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "IActivityManager.moveTaskToBack", report = "-")
  public void moveTaskToBack(int arg1) throws android.os.RemoteException;
  public boolean isImmersive(android.os.IBinder arg1) throws android.os.RemoteException;
  public void setImmersive(android.os.IBinder arg1, boolean arg2) throws android.os.RemoteException;
  public android.content.Intent registerReceiver(IApplicationThread arg1, java.lang.String arg2, @com.francetelecom.rd.stubs.annotation.CallBackRegister("intentReceiver") android.content.IIntentReceiver arg3, android.content.IntentFilter arg4, java.lang.String arg5) throws android.os.RemoteException;
  public void unregisterReceiver(android.content.IIntentReceiver arg1) throws android.os.RemoteException;
  public android.content.ComponentName startService(IApplicationThread arg1, android.content.Intent arg2, java.lang.String arg3) throws android.os.RemoteException;
  public int stopService(IApplicationThread arg1, android.content.Intent arg2, java.lang.String arg3) throws android.os.RemoteException;
  public int bindService(IApplicationThread arg1, android.os.IBinder arg2, android.content.Intent arg3, java.lang.String arg4, IServiceConnection arg5, int arg6) throws android.os.RemoteException;
  public boolean unbindService(IServiceConnection arg1) throws android.os.RemoteException;
  public boolean startInstrumentation(android.content.ComponentName arg1, java.lang.String arg2, int arg3, android.os.Bundle arg4, IInstrumentationWatcher arg5) throws android.os.RemoteException;
  public void grantUriPermission(IApplicationThread arg1, java.lang.String arg2, android.net.Uri arg3, int arg4) throws android.os.RemoteException;
  public void revokeUriPermission(IApplicationThread arg1, android.net.Uri arg2, int arg3) throws android.os.RemoteException;
  public int checkUriPermission(android.net.Uri arg1, int arg2, int arg3, int arg4) throws android.os.RemoteException;
  public android.os.IBinder peekService(android.content.Intent arg1, java.lang.String arg2) throws android.os.RemoteException;
  public android.content.IIntentSender getIntentSender(int arg1, java.lang.String arg2, android.os.IBinder arg3, java.lang.String arg4, int arg5, android.content.Intent [] arg6, java.lang.String [] arg7, int arg8) throws android.os.RemoteException;
  public boolean dumpHeap(java.lang.String arg1, boolean arg2, java.lang.String arg3, android.os.ParcelFileDescriptor arg4) throws android.os.RemoteException;
  public void getMemoryInfo(ActivityManager.MemoryInfo arg1) throws android.os.RemoteException;
  public java.util.List getServices(int arg1, int arg2) throws android.os.RemoteException;
  public void closeSystemDialogs(java.lang.String arg1) throws android.os.RemoteException;
  public android.content.res.Configuration getConfiguration() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "IActivityManager.updateConfiguration", report = "-")
  public void updateConfiguration(android.content.res.Configuration arg1) throws android.os.RemoteException;
  public void showBootMessage(java.lang.CharSequence arg1, boolean arg2) throws android.os.RemoteException;
  public boolean clearApplicationUserData(java.lang.String arg1, android.content.pm.IPackageDataObserver arg2) throws android.os.RemoteException;
  public void enterSafeMode() throws android.os.RemoteException;
  public int startActivityIntentSender(IApplicationThread arg1, android.content.IntentSender arg2, android.content.Intent arg3, java.lang.String arg4, android.os.IBinder arg5, java.lang.String arg6, int arg7, int arg8, int arg9) throws android.os.RemoteException;
  public void finishSubActivity(android.os.IBinder arg1, java.lang.String arg2, int arg3) throws android.os.RemoteException;
  public int getTaskForActivity(android.os.IBinder arg1, boolean arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "IActivityManager.moveActivityTaskToBack", report = "-")
  public boolean moveActivityTaskToBack(android.os.IBinder arg1, boolean arg2) throws android.os.RemoteException;
  public void cancelIntentSender(android.content.IIntentSender arg1) throws android.os.RemoteException;
  public java.lang.String getPackageForIntentSender(android.content.IIntentSender arg1) throws android.os.RemoteException;
  public boolean isIntentSenderTargetedToPackage(android.content.IIntentSender arg1) throws android.os.RemoteException;
  public void unbindBackupAgent(android.content.pm.ApplicationInfo arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "IActivityManager.killApplicationProcess", pos = 1, report = "-")
  public void killApplicationProcess(java.lang.String arg1, int arg2) throws android.os.RemoteException;
  public java.lang.String getProviderMimeType(android.net.Uri arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "IActivityManager.forceStopPackage", pos = 1, report = "-")
  public void forceStopPackage(java.lang.String arg1) throws android.os.RemoteException;
  public IActivityManager.WaitResult startActivityAndWait(IApplicationThread arg1, android.content.Intent arg2, java.lang.String arg3, android.net.Uri [] arg4, int arg5, android.os.IBinder arg6, java.lang.String arg7, int arg8, boolean arg9, boolean arg10, java.lang.String arg11, android.os.ParcelFileDescriptor arg12, boolean arg13) throws android.os.RemoteException;
  public int broadcastIntent(IApplicationThread arg1, android.content.Intent arg2, java.lang.String arg3, android.content.IIntentReceiver arg4, int arg5, java.lang.String arg6, android.os.Bundle arg7, java.lang.String arg8, boolean arg9, boolean arg10) throws android.os.RemoteException;
  public boolean profileControl(java.lang.String arg1, boolean arg2, java.lang.String arg3, android.os.ParcelFileDescriptor arg4, int arg5) throws android.os.RemoteException;
  public void setPackageScreenCompatMode(java.lang.String arg1, int arg2) throws android.os.RemoteException;
  public void handleApplicationStrictModeViolation(android.os.IBinder arg1, int arg2, android.os.StrictMode.ViolationInfo arg3) throws android.os.RemoteException;
  public boolean stopServiceToken(android.content.ComponentName arg1, android.os.IBinder arg2, int arg3) throws android.os.RemoteException;
  public void setServiceForeground(android.content.ComponentName arg1, android.os.IBinder arg2, int arg3, Notification arg4, boolean arg5) throws android.os.RemoteException;
  public void finishInstrumentation(IApplicationThread arg1, int arg2, android.os.Bundle arg3) throws android.os.RemoteException;
  public IActivityManager.ContentProviderHolder getContentProvider(IApplicationThread arg1, java.lang.String arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "IActivityManager.signalPersistentProcess", report = "-")
  public void signalPersistentProcesses(int arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "IActivityManager.setActivityController", report = "-")
  public void setActivityController(IActivityController arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "IActivityManager.setProcessForeground", report = "-")
  public void setProcessForeground(android.os.IBinder arg1, int arg2, boolean arg3) throws android.os.RemoteException;
  public void activityIdle(android.os.IBinder arg1, android.content.res.Configuration arg2, boolean arg3) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "IActivityManager.crashApplication", pos = {3, 4}, report = "-")
  public void crashApplication(int arg1, int arg2, java.lang.String arg3, java.lang.String arg4) throws android.os.RemoteException;
  public int startActivityWithConfig(IApplicationThread arg1, android.content.Intent arg2, java.lang.String arg3, android.net.Uri [] arg4, int arg5, android.os.IBinder arg6, java.lang.String arg7, int arg8, boolean arg9, boolean arg10, android.content.res.Configuration arg11) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "IActivityManager.killPids", pos = 2, report = "-")
  public boolean killPids(int [] arg1, java.lang.String arg2, boolean arg3) throws android.os.RemoteException;
  public void finishReceiver(android.os.IBinder arg1, int arg2, java.lang.String arg3, android.os.Bundle arg4, boolean arg5) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "IActivityManager.stopAppSwitches", report = "-")
  public void stopAppSwitches() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "IActivityManager.killApplicationWithUid", pos = 1, report = "-")
  public void killApplicationWithUid(java.lang.String arg1, int arg2) throws android.os.RemoteException;
  public void handleApplicationCrash(android.os.IBinder arg1, ApplicationErrorReport.CrashInfo arg2) throws android.os.RemoteException;
  public boolean willActivityBeVisible(android.os.IBinder arg1) throws android.os.RemoteException;
  public void unbroadcastIntent(IApplicationThread arg1, android.content.Intent arg2) throws android.os.RemoteException;
  public void attachApplication(IApplicationThread arg1) throws android.os.RemoteException;
  public void activityPaused(android.os.IBinder arg1) throws android.os.RemoteException;
  public void activityStopped(android.os.IBinder arg1, android.os.Bundle arg2, android.graphics.Bitmap arg3, java.lang.CharSequence arg4) throws android.os.RemoteException;
  public void activitySlept(android.os.IBinder arg1) throws android.os.RemoteException;
  public void activityDestroyed(android.os.IBinder arg1) throws android.os.RemoteException;
  public java.util.List getTasks(int arg1, int arg2, IThumbnailReceiver arg3) throws android.os.RemoteException;
  public java.util.List<ActivityManager.RecentTaskInfo> getRecentTasks(int arg1, int arg2) throws android.os.RemoteException;
  public ActivityManager.TaskThumbnails getTaskThumbnails(int arg1) throws android.os.RemoteException;
  public java.util.List<ActivityManager.ProcessErrorStateInfo> getProcessesInErrorState() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "IActivityManager.moveTaskToFront", report = "-")
  public void moveTaskToFront(int arg1, int arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "IActivityManager.moveTaskBackwards", report = "-")
  public void moveTaskBackwards(int arg1) throws android.os.RemoteException;
  public void finishOtherInstances(android.os.IBinder arg1, android.content.ComponentName arg2) throws android.os.RemoteException;
  public void reportThumbnail(android.os.IBinder arg1, android.graphics.Bitmap arg2, java.lang.CharSequence arg3) throws android.os.RemoteException;
  public void removeContentProvider(IApplicationThread arg1, java.lang.String arg2) throws android.os.RemoteException;
  public void publishContentProviders(IApplicationThread arg1, java.util.List<IActivityManager.ContentProviderHolder> arg2) throws android.os.RemoteException;
  public PendingIntent getRunningServiceControlPanel(android.content.ComponentName arg1) throws android.os.RemoteException;
  public void publishService(android.os.IBinder arg1, android.content.Intent arg2, android.os.IBinder arg3) throws android.os.RemoteException;
  public void unbindFinished(android.os.IBinder arg1, android.content.Intent arg2, boolean arg3) throws android.os.RemoteException;
  public void serviceDoneExecuting(android.os.IBinder arg1, int arg2, int arg3, int arg4) throws android.os.RemoteException;
  public boolean bindBackupAgent(android.content.pm.ApplicationInfo arg1, int arg2) throws android.os.RemoteException;
  public void backupAgentCreated(java.lang.String arg1, android.os.IBinder arg2) throws android.os.RemoteException;
  public android.content.ComponentName getActivityClassForToken(android.os.IBinder arg1) throws android.os.RemoteException;
  public java.lang.String getPackageForToken(android.os.IBinder arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "IActivityManager.setProcessLimit", report = "-")
  public void setProcessLimit(int arg1) throws android.os.RemoteException;
  public int getProcessLimit() throws android.os.RemoteException;
  public void showWaitingForDebugger(IApplicationThread arg1, boolean arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "IActivityManager.killBackgroundProcesses", pos = 1, report = "-")
  public void killBackgroundProcesses(java.lang.String arg1) throws android.os.RemoteException;
  public void goingToSleep() throws android.os.RemoteException;
  public void wakingUp() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "IActivityManager.unhandledBack", report = "-")
  public void unhandledBack() throws android.os.RemoteException;
  public android.os.ParcelFileDescriptor openContentUri(android.net.Uri arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "IActivityManager.setDebugApp", pos = 1, report = "-")
  public void setDebugApp(java.lang.String arg1, boolean arg2, boolean arg3) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "IActivityManager.setAlwaysFinish", report = "-")
  public void setAlwaysFinish(boolean arg1) throws android.os.RemoteException;
  public void noteWakeupAlarm(android.content.IIntentSender arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "IActivityManager.startRunning", pos = {1, 2, 3, 4}, report = "-")
  public void startRunning(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4) throws android.os.RemoteException;
  public boolean handleApplicationWtf(android.os.IBinder arg1, java.lang.String arg2, ApplicationErrorReport.CrashInfo arg3) throws android.os.RemoteException;
  public java.util.List<ActivityManager.RunningAppProcessInfo> getRunningAppProcesses() throws android.os.RemoteException;
  public java.util.List<android.content.pm.ApplicationInfo> getRunningExternalApplications() throws android.os.RemoteException;
  public android.content.pm.ConfigurationInfo getDeviceConfigurationInfo() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "IActivityManager.resumeAppSwitches", report = "-")
  public void resumeAppSwitches() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "IActivityManager.registerActivityWatcher", report = "-")
  public void registerActivityWatcher(@com.francetelecom.rd.stubs.annotation.CallBackRegister("ActivityWatcher") IActivityWatcher arg1) throws android.os.RemoteException;
  public void unregisterActivityWatcher(IActivityWatcher arg1) throws android.os.RemoteException;
  public int startActivityInPackage(int arg1, android.content.Intent arg2, java.lang.String arg3, android.os.IBinder arg4, java.lang.String arg5, int arg6, boolean arg7) throws android.os.RemoteException;
  public android.os.Debug.MemoryInfo [] getProcessMemoryInfo(int [] arg1) throws android.os.RemoteException;
  public boolean isUserAMonkey() throws android.os.RemoteException;
  public void finishHeavyWeightApp() throws android.os.RemoteException;
  public boolean isTopActivityImmersive() throws android.os.RemoteException;
  public android.os.IBinder newUriPermissionOwner(java.lang.String arg1) throws android.os.RemoteException;
  public void grantUriPermissionFromOwner(android.os.IBinder arg1, int arg2, java.lang.String arg3, android.net.Uri arg4, int arg5) throws android.os.RemoteException;
  public void revokeUriPermissionFromOwner(android.os.IBinder arg1, android.net.Uri arg2, int arg3) throws android.os.RemoteException;
  public int checkGrantUriPermission(int arg1, java.lang.String arg2, android.net.Uri arg3, int arg4) throws android.os.RemoteException;
  public int startActivitiesInPackage(int arg1, android.content.Intent [] arg2, java.lang.String [] arg3, android.os.IBinder arg4) throws android.os.RemoteException;
  public int getFrontActivityScreenCompatMode() throws android.os.RemoteException;
  public void setFrontActivityScreenCompatMode(int arg1) throws android.os.RemoteException;
  public int getPackageScreenCompatMode(java.lang.String arg1) throws android.os.RemoteException;
  public boolean getPackageAskScreenCompat(java.lang.String arg1) throws android.os.RemoteException;
  public void setPackageAskScreenCompat(java.lang.String arg1, boolean arg2) throws android.os.RemoteException;
  public boolean switchUser(int arg1) throws android.os.RemoteException;
  public boolean removeSubTask(int arg1, int arg2) throws android.os.RemoteException;
  public boolean removeTask(int arg1, int arg2) throws android.os.RemoteException;
  public void registerProcessObserver(@com.francetelecom.rd.stubs.annotation.CallBackRegister("IProcessObserver") IProcessObserver arg1) throws android.os.RemoteException;
  public void unregisterProcessObserver(IProcessObserver arg1) throws android.os.RemoteException;
  public void updatePersistentConfiguration(android.content.res.Configuration arg1) throws android.os.RemoteException;
  public long [] getProcessPss(int [] arg1) throws android.os.RemoteException;
  public void dismissKeyguardOnNextActivity() throws android.os.RemoteException;
  public boolean testIsSystemReady();
}
