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
public class ActivityManager
{
  // Classes

  public static class RecentTaskInfo
    implements android.os.Parcelable
  {
    // Fields

    public int id;

    public int persistentId;

    public android.content.Intent baseIntent;

    public android.content.ComponentName origActivity;

    public java.lang.CharSequence description;

    public static final android.os.Parcelable.Creator<ActivityManager.RecentTaskInfo> CREATOR = null;

    // Constructors

    public RecentTaskInfo(){
    }
    private RecentTaskInfo(android.os.Parcel arg1){
    }
    // Methods

    public void writeToParcel(android.os.Parcel arg1, int arg2){
    }
    public int describeContents(){
      return 0;
    }
    public void readFromParcel(android.os.Parcel arg1){
    }
  }
  public static class RunningTaskInfo
    implements android.os.Parcelable
  {
    // Fields

    public int id;

    public android.content.ComponentName baseActivity;

    public android.content.ComponentName topActivity;

    public android.graphics.Bitmap thumbnail;

    public java.lang.CharSequence description;

    public int numActivities;

    public int numRunning;

    public static final android.os.Parcelable.Creator<ActivityManager.RunningTaskInfo> CREATOR = null;

    // Constructors

    public RunningTaskInfo(){
    }
    private RunningTaskInfo(android.os.Parcel arg1){
    }
    // Methods

    public void writeToParcel(android.os.Parcel arg1, int arg2){
    }
    public int describeContents(){
      return 0;
    }
    public void readFromParcel(android.os.Parcel arg1){
    }
  }
  public static class TaskThumbnails
    implements android.os.Parcelable
  {
    // Fields

    public android.graphics.Bitmap mainThumbnail;

    public int numSubThumbbails;

    public IThumbnailRetriever retriever;

    public static final android.os.Parcelable.Creator<ActivityManager.TaskThumbnails> CREATOR = null;

    // Constructors

    public TaskThumbnails(){
    }
    private TaskThumbnails(android.os.Parcel arg1){
    }
    // Methods

    public void writeToParcel(android.os.Parcel arg1, int arg2){
    }
    public int describeContents(){
      return 0;
    }
    public void readFromParcel(android.os.Parcel arg1){
    }
    public android.graphics.Bitmap getSubThumbnail(int arg1){
      return (android.graphics.Bitmap) null;
    }
  }
  public static class RunningServiceInfo
    implements android.os.Parcelable
  {
    // Fields

    public android.content.ComponentName service;

    public int pid;

    public int uid;

    public java.lang.String process;

    public boolean foreground;

    public long activeSince;

    public boolean started;

    public int clientCount;

    public int crashCount;

    public long lastActivityTime;

    public long restarting;

    public static final int FLAG_STARTED = 1;

    public static final int FLAG_FOREGROUND = 2;

    public static final int FLAG_SYSTEM_PROCESS = 4;

    public static final int FLAG_PERSISTENT_PROCESS = 8;

    public int flags;

    public java.lang.String clientPackage;

    public int clientLabel;

    public static final android.os.Parcelable.Creator<ActivityManager.RunningServiceInfo> CREATOR = null;

    // Constructors

    public RunningServiceInfo(){
    }
    private RunningServiceInfo(android.os.Parcel arg1){
    }
    // Methods

    public void writeToParcel(android.os.Parcel arg1, int arg2){
    }
    public int describeContents(){
      return 0;
    }
    public void readFromParcel(android.os.Parcel arg1){
    }
  }
  public static class MemoryInfo
    implements android.os.Parcelable
  {
    // Fields

    public long availMem;

    public long threshold;

    public boolean lowMemory;

    public long hiddenAppThreshold;

    public long secondaryServerThreshold;

    public long visibleAppThreshold;

    public long foregroundAppThreshold;

    public static final android.os.Parcelable.Creator<ActivityManager.MemoryInfo> CREATOR = null;

    // Constructors

    public MemoryInfo(){
    }
    private MemoryInfo(android.os.Parcel arg1){
    }
    // Methods

    public void writeToParcel(android.os.Parcel arg1, int arg2){
    }
    public int describeContents(){
      return 0;
    }
    public void readFromParcel(android.os.Parcel arg1){
    }
  }
  public static class ProcessErrorStateInfo
    implements android.os.Parcelable
  {
    // Fields

    public static final int NO_ERROR = 0;

    public static final int CRASHED = 1;

    public static final int NOT_RESPONDING = 2;

    public int condition;

    public java.lang.String processName;

    public int pid;

    public int uid;

    public java.lang.String tag;

    public java.lang.String shortMsg;

    public java.lang.String longMsg;

    public java.lang.String stackTrace;

    public byte [] crashData;

    public static final android.os.Parcelable.Creator<ActivityManager.ProcessErrorStateInfo> CREATOR = null;

    // Constructors

    public ProcessErrorStateInfo(){
    }
    private ProcessErrorStateInfo(android.os.Parcel arg1){
    }
    // Methods

    public void writeToParcel(android.os.Parcel arg1, int arg2){
    }
    public int describeContents(){
      return 0;
    }
    public void readFromParcel(android.os.Parcel arg1){
    }
  }
  public static class RunningAppProcessInfo
    implements android.os.Parcelable
  {
    // Fields

    public java.lang.String processName;

    public int pid;

    public int uid;

    public java.lang.String [] pkgList;

    public static final int FLAG_CANT_SAVE_STATE = 1;

    public static final int FLAG_PERSISTENT = 2;

    public int flags;

    public static final int IMPORTANCE_FOREGROUND = 100;

    public static final int IMPORTANCE_VISIBLE = 200;

    public static final int IMPORTANCE_PERCEPTIBLE = 130;

    public static final int IMPORTANCE_CANT_SAVE_STATE = 170;

    public static final int IMPORTANCE_SERVICE = 300;

    public static final int IMPORTANCE_BACKGROUND = 400;

    public static final int IMPORTANCE_EMPTY = 500;

    public int importance;

    public int lru;

    public static final int REASON_UNKNOWN = 0;

    public static final int REASON_PROVIDER_IN_USE = 1;

    public static final int REASON_SERVICE_IN_USE = 2;

    public int importanceReasonCode;

    public int importanceReasonPid;

    public android.content.ComponentName importanceReasonComponent;

    public int importanceReasonImportance;

    public static final android.os.Parcelable.Creator<ActivityManager.RunningAppProcessInfo> CREATOR = null;

    // Constructors

    public RunningAppProcessInfo(){
    }
    public RunningAppProcessInfo(java.lang.String arg1, int arg2, java.lang.String [] arg3){
    }
    private RunningAppProcessInfo(android.os.Parcel arg1){
    }
    // Methods

    public void writeToParcel(android.os.Parcel arg1, int arg2){
    }
    public int describeContents(){
      return 0;
    }
    public void readFromParcel(android.os.Parcel arg1){
    }
  }
  // Fields

  public static final int COMPAT_MODE_ALWAYS = -1;

  public static final int COMPAT_MODE_NEVER = -2;

  public static final int COMPAT_MODE_UNKNOWN = -3;

  public static final int COMPAT_MODE_DISABLED = 0;

  public static final int COMPAT_MODE_ENABLED = 1;

  public static final int COMPAT_MODE_TOGGLE = 2;

  public static final int RECENT_WITH_EXCLUDED = 1;

  public static final int RECENT_IGNORE_UNAVAILABLE = 2;

  public static final int REMOVE_TASK_KILL_PROCESS = 1;

  public static final int MOVE_TASK_WITH_HOME = 1;

  public static final int MOVE_TASK_NO_USER_ACTION = 2;

  // Constructors

  ActivityManager(android.content.Context arg1, android.os.Handler arg2){
  }
  // Methods

  public void getMemoryInfo(ActivityManager.MemoryInfo arg1){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "ActivityManager.clearApplicationUserData", pos = 1, report = "-")
  public boolean clearApplicationUserData(java.lang.String arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("packageDataObserver") android.content.pm.IPackageDataObserver arg2){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "ActivityManager.forceStopPackage", pos = 1, report = "-")
  public void forceStopPackage(java.lang.String arg1){
  }
  public void setPackageScreenCompatMode(java.lang.String arg1, int arg2){
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "ActivityManager.getRecentTasks", report = "-")
  public java.util.List<ActivityManager.RecentTaskInfo> getRecentTasks(int arg1, int arg2) throws java.lang.SecurityException{
    return (java.util.List) null;
  }
  public ActivityManager.TaskThumbnails getTaskThumbnails(int arg1) throws java.lang.SecurityException{
    return (ActivityManager.TaskThumbnails) null;
  }
  public java.util.List<ActivityManager.ProcessErrorStateInfo> getProcessesInErrorState(){
    return (java.util.List) null;
  }
  public void moveTaskToFront(int arg1, int arg2){
  }
  public PendingIntent getRunningServiceControlPanel(android.content.ComponentName arg1) throws java.lang.SecurityException{
    return (PendingIntent) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "ActivityManager.killBackgroundProcesses", pos = 1, report = "-")
  public void killBackgroundProcesses(java.lang.String arg1){
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "ActivityManager.getRunningAppProcesses", report = "-")
  public java.util.List<ActivityManager.RunningAppProcessInfo> getRunningAppProcesses(){
    return (java.util.List) null;
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "ActivityManager.ingExternalApplications", report = "-")
    public java.util.List<android.content.pm.ApplicationInfo> getRunningExternalApplications(){
    return (java.util.List) null;
  }
  public android.content.pm.ConfigurationInfo getDeviceConfigurationInfo(){
    return (android.content.pm.ConfigurationInfo) null;
  }
  public android.os.Debug.MemoryInfo [] getProcessMemoryInfo(int [] arg1){
    return (android.os.Debug.MemoryInfo []) null;
  }
  public static boolean isUserAMonkey(){
    return false;
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
  public boolean removeSubTask(int arg1, int arg2) throws java.lang.SecurityException{
    return false;
  }
  public boolean removeTask(int arg1, int arg2) throws java.lang.SecurityException{
    return false;
  }
  public int getLargeMemoryClass(){
    return 0;
  }
  public static boolean isHighEndGfx(android.view.Display arg1){
    return false;
  }
  public int getMemoryClass(){
    return 0;
  }
  public static boolean isRunningInTestHarness(){
    return false;
  }
  public static int staticGetMemoryClass(){
    return 0;
  }
  public static int staticGetLargeMemoryClass(){
    return 0;
  }
  public static boolean isLargeRAM(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "ActivitiyManager.getRunningTasks-2", report = "-")
  public java.util.List<ActivityManager.RunningTaskInfo> getRunningTasks(int arg1, int arg2, IThumbnailReceiver arg3) throws java.lang.SecurityException{
    return (java.util.List) null;
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "ActivityManager.getRunningTasks", report = "-")
  public java.util.List<ActivityManager.RunningTaskInfo> getRunningTasks(int arg1) throws java.lang.SecurityException{
    return (java.util.List) null;
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "ActivityManager.getRunningServices", report = "-")
  public java.util.List<ActivityManager.RunningServiceInfo> getRunningServices(int arg1) throws java.lang.SecurityException{
    return (java.util.List) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "ActivityManager.restartPackage", pos = 1, report = "-")
  public void restartPackage(java.lang.String arg1){
  }
  public int getLauncherLargeIconDensity(){
    return 0;
  }
  public int getLauncherLargeIconSize(){
    return 0;
  }
  public java.util.Map<java.lang.String, java.lang.Integer> getAllPackageLaunchCounts(){
    return (java.util.Map) null;
  }
  public com.android.internal.os.PkgUsageStats [] getAllPackageUsageStats(){
    return (com.android.internal.os.PkgUsageStats []) null;
  }
}
