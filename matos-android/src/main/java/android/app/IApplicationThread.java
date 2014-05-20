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
public interface IApplicationThread
  extends android.os.IInterface
{
  // Fields

  public static final int BACKUP_MODE_INCREMENTAL = 0;

  public static final int BACKUP_MODE_FULL = 1;

  public static final int BACKUP_MODE_RESTORE = 2;

  public static final int BACKUP_MODE_RESTORE_FULL = 3;

  public static final int DEBUG_OFF = 0;

  public static final int DEBUG_ON = 1;

  public static final int DEBUG_WAIT = 2;

  public static final int PACKAGE_REMOVED = 0;

  public static final int EXTERNAL_STORAGE_UNAVAILABLE = 1;

  public static final java.lang.String descriptor = "android.app.IApplicationThread";

  public static final int SCHEDULE_PAUSE_ACTIVITY_TRANSACTION = 1;

  public static final int SCHEDULE_STOP_ACTIVITY_TRANSACTION = 3;

  public static final int SCHEDULE_WINDOW_VISIBILITY_TRANSACTION = 4;

  public static final int SCHEDULE_RESUME_ACTIVITY_TRANSACTION = 5;

  public static final int SCHEDULE_SEND_RESULT_TRANSACTION = 6;

  public static final int SCHEDULE_LAUNCH_ACTIVITY_TRANSACTION = 7;

  public static final int SCHEDULE_NEW_INTENT_TRANSACTION = 8;

  public static final int SCHEDULE_FINISH_ACTIVITY_TRANSACTION = 9;

  public static final int SCHEDULE_RECEIVER_TRANSACTION = 10;

  public static final int SCHEDULE_CREATE_SERVICE_TRANSACTION = 11;

  public static final int SCHEDULE_STOP_SERVICE_TRANSACTION = 12;

  public static final int BIND_APPLICATION_TRANSACTION = 13;

  public static final int SCHEDULE_EXIT_TRANSACTION = 14;

  public static final int REQUEST_THUMBNAIL_TRANSACTION = 15;

  public static final int SCHEDULE_CONFIGURATION_CHANGED_TRANSACTION = 16;

  public static final int SCHEDULE_SERVICE_ARGS_TRANSACTION = 17;

  public static final int UPDATE_TIME_ZONE_TRANSACTION = 18;

  public static final int PROCESS_IN_BACKGROUND_TRANSACTION = 19;

  public static final int SCHEDULE_BIND_SERVICE_TRANSACTION = 20;

  public static final int SCHEDULE_UNBIND_SERVICE_TRANSACTION = 21;

  public static final int DUMP_SERVICE_TRANSACTION = 22;

  public static final int SCHEDULE_REGISTERED_RECEIVER_TRANSACTION = 23;

  public static final int SCHEDULE_LOW_MEMORY_TRANSACTION = 24;

  public static final int SCHEDULE_ACTIVITY_CONFIGURATION_CHANGED_TRANSACTION = 25;

  public static final int SCHEDULE_RELAUNCH_ACTIVITY_TRANSACTION = 26;

  public static final int SCHEDULE_SLEEPING_TRANSACTION = 27;

  public static final int PROFILER_CONTROL_TRANSACTION = 28;

  public static final int SET_SCHEDULING_GROUP_TRANSACTION = 29;

  public static final int SCHEDULE_CREATE_BACKUP_AGENT_TRANSACTION = 30;

  public static final int SCHEDULE_DESTROY_BACKUP_AGENT_TRANSACTION = 31;

  public static final int GET_MEMORY_INFO_TRANSACTION = 32;

  public static final int SCHEDULE_SUICIDE_TRANSACTION = 33;

  public static final int DISPATCH_PACKAGE_BROADCAST_TRANSACTION = 34;

  public static final int SCHEDULE_CRASH_TRANSACTION = 35;

  public static final int DUMP_HEAP_TRANSACTION = 36;

  public static final int DUMP_ACTIVITY_TRANSACTION = 37;

  public static final int CLEAR_DNS_CACHE_TRANSACTION = 38;

  public static final int SET_HTTP_PROXY_TRANSACTION = 39;

  public static final int SET_CORE_SETTINGS_TRANSACTION = 40;

  public static final int UPDATE_PACKAGE_COMPATIBILITY_INFO_TRANSACTION = 41;

  public static final int SCHEDULE_TRIM_MEMORY_TRANSACTION = 42;

  public static final int DUMP_MEM_INFO_TRANSACTION = 43;

  public static final int DUMP_GFX_INFO_TRANSACTION = 44;

  // Methods

  public void clearDnsCache() throws android.os.RemoteException;
  public void schedulePauseActivity(android.os.IBinder arg1, boolean arg2, boolean arg3, int arg4) throws android.os.RemoteException;
  public void scheduleStopActivity(android.os.IBinder arg1, boolean arg2, int arg3) throws android.os.RemoteException;
  public void scheduleWindowVisibility(android.os.IBinder arg1, boolean arg2) throws android.os.RemoteException;
  public void scheduleSleeping(android.os.IBinder arg1, boolean arg2) throws android.os.RemoteException;
  public void scheduleResumeActivity(android.os.IBinder arg1, boolean arg2) throws android.os.RemoteException;
  public void scheduleSendResult(android.os.IBinder arg1, java.util.List<ResultInfo> arg2) throws android.os.RemoteException;
  public void scheduleLaunchActivity(android.content.Intent arg1, android.os.IBinder arg2, int arg3, android.content.pm.ActivityInfo arg4, android.content.res.Configuration arg5, android.content.res.CompatibilityInfo arg6, android.os.Bundle arg7, java.util.List<ResultInfo> arg8, java.util.List<android.content.Intent> arg9, boolean arg10, boolean arg11, java.lang.String arg12, android.os.ParcelFileDescriptor arg13, boolean arg14) throws android.os.RemoteException;
  public void scheduleRelaunchActivity(android.os.IBinder arg1, java.util.List<ResultInfo> arg2, java.util.List<android.content.Intent> arg3, int arg4, boolean arg5, android.content.res.Configuration arg6) throws android.os.RemoteException;
  public void scheduleNewIntent(java.util.List<android.content.Intent> arg1, android.os.IBinder arg2) throws android.os.RemoteException;
  public void scheduleDestroyActivity(android.os.IBinder arg1, boolean arg2, int arg3) throws android.os.RemoteException;
  public void scheduleReceiver(android.content.Intent arg1, android.content.pm.ActivityInfo arg2, android.content.res.CompatibilityInfo arg3, int arg4, java.lang.String arg5, android.os.Bundle arg6, boolean arg7) throws android.os.RemoteException;
  public void scheduleCreateBackupAgent(android.content.pm.ApplicationInfo arg1, android.content.res.CompatibilityInfo arg2, int arg3) throws android.os.RemoteException;
  public void scheduleDestroyBackupAgent(android.content.pm.ApplicationInfo arg1, android.content.res.CompatibilityInfo arg2) throws android.os.RemoteException;
  public void scheduleCreateService(android.os.IBinder arg1, android.content.pm.ServiceInfo arg2, android.content.res.CompatibilityInfo arg3) throws android.os.RemoteException;
  public void scheduleBindService(android.os.IBinder arg1, android.content.Intent arg2, boolean arg3) throws android.os.RemoteException;
  public void scheduleUnbindService(android.os.IBinder arg1, android.content.Intent arg2) throws android.os.RemoteException;
  public void scheduleServiceArgs(android.os.IBinder arg1, boolean arg2, int arg3, int arg4, android.content.Intent arg5) throws android.os.RemoteException;
  public void scheduleStopService(android.os.IBinder arg1) throws android.os.RemoteException;
  public void bindApplication(java.lang.String arg1, android.content.pm.ApplicationInfo arg2, java.util.List<android.content.pm.ProviderInfo> arg3, android.content.ComponentName arg4, java.lang.String arg5, android.os.ParcelFileDescriptor arg6, boolean arg7, android.os.Bundle arg8, @com.francetelecom.rd.stubs.annotation.CallBackRegister("iInstrumentationWatcher") IInstrumentationWatcher arg9, int arg10, boolean arg11, boolean arg12, android.content.res.Configuration arg13, android.content.res.CompatibilityInfo arg14, java.util.Map<java.lang.String, android.os.IBinder> arg15, android.os.Bundle arg16) throws android.os.RemoteException;
  public void scheduleExit() throws android.os.RemoteException;
  public void scheduleSuicide() throws android.os.RemoteException;
  public void requestThumbnail(android.os.IBinder arg1) throws android.os.RemoteException;
  public void scheduleConfigurationChanged(android.content.res.Configuration arg1) throws android.os.RemoteException;
  public void updateTimeZone() throws android.os.RemoteException;
  public void setHttpProxy(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws android.os.RemoteException;
  public void processInBackground() throws android.os.RemoteException;
  public void dumpService(java.io.FileDescriptor arg1, android.os.IBinder arg2, java.lang.String [] arg3) throws android.os.RemoteException;
  public void scheduleRegisteredReceiver(@com.francetelecom.rd.stubs.annotation.CallBackRegister("intentReceiver") android.content.IIntentReceiver arg1, android.content.Intent arg2, int arg3, java.lang.String arg4, android.os.Bundle arg5, boolean arg6, boolean arg7) throws android.os.RemoteException;
  public void scheduleLowMemory() throws android.os.RemoteException;
  public void scheduleActivityConfigurationChanged(android.os.IBinder arg1) throws android.os.RemoteException;
  public void profilerControl(boolean arg1, java.lang.String arg2, android.os.ParcelFileDescriptor arg3, int arg4) throws android.os.RemoteException;
  public void dumpHeap(boolean arg1, java.lang.String arg2, android.os.ParcelFileDescriptor arg3) throws android.os.RemoteException;
  public void setSchedulingGroup(int arg1) throws android.os.RemoteException;
  public void getMemoryInfo(android.os.Debug.MemoryInfo arg1) throws android.os.RemoteException;
  public void dispatchPackageBroadcast(int arg1, java.lang.String [] arg2) throws android.os.RemoteException;
  public void scheduleCrash(java.lang.String arg1) throws android.os.RemoteException;
  public void dumpActivity(java.io.FileDescriptor arg1, android.os.IBinder arg2, java.lang.String arg3, java.lang.String [] arg4) throws android.os.RemoteException;
  public void setCoreSettings(android.os.Bundle arg1) throws android.os.RemoteException;
  public void updatePackageCompatibilityInfo(java.lang.String arg1, android.content.res.CompatibilityInfo arg2) throws android.os.RemoteException;
  public void scheduleTrimMemory(int arg1) throws android.os.RemoteException;
  public android.os.Debug.MemoryInfo dumpMemInfo(java.io.FileDescriptor arg1, boolean arg2, boolean arg3, java.lang.String [] arg4) throws android.os.RemoteException;
  public void dumpGfxInfo(java.io.FileDescriptor arg1, java.lang.String [] arg2) throws android.os.RemoteException;
}
