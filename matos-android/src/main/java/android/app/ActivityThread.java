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
public final class ActivityThread
{
  // Fields

  public static final java.lang.String TAG = "ActivityThread";

  public static final boolean DEBUG_BROADCAST = false;

  // Constructors

  ActivityThread(){
  }
  // Methods

  public static void main(java.lang.String [] arg1){
  }
  public final LoadedApk getPackageInfo(java.lang.String arg1, android.content.res.CompatibilityInfo arg2, int arg3){
    return (LoadedApk) null;
  }
  public final LoadedApk getPackageInfo(android.content.pm.ApplicationInfo arg1, android.content.res.CompatibilityInfo arg2, int arg3){
    return (LoadedApk) null;
  }
  public Application getApplication(){
    return (Application) null;
  }
  public static android.content.pm.IPackageManager getPackageManager(){
    return (android.content.pm.IPackageManager) null;
  }
  public android.os.Looper getLooper(){
    return (android.os.Looper) null;
  }
  public final Activity getActivity(android.os.IBinder arg1){
    return (Activity) null;
  }
  public boolean isProfiling(){
    return false;
  }
  public Instrumentation getInstrumentation(){
    return (Instrumentation) null;
  }
  public android.content.res.Configuration getConfiguration(){
    return (android.content.res.Configuration) null;
  }
  public final boolean releaseProvider(android.content.IContentProvider arg1){
    return false;
  }
  public final android.content.IContentProvider acquireProvider(android.content.Context arg1, java.lang.String arg2){
    return (android.content.IContentProvider) null;
  }
  public final android.content.IContentProvider acquireExistingProvider(android.content.Context arg1, java.lang.String arg2){
    return (android.content.IContentProvider) null;
  }
  public int getIntCoreSetting(java.lang.String arg1, int arg2){
    return 0;
  }
  public final void sendActivityResult(android.os.IBinder arg1, java.lang.String arg2, int arg3, int arg4, android.content.Intent arg5){
  }
  public final void requestRelaunchActivity(android.os.IBinder arg1, java.util.List<ResultInfo> arg2, java.util.List<android.content.Intent> arg3, int arg4, boolean arg5, android.content.res.Configuration arg6, boolean arg7){
  }
  public final android.content.pm.ActivityInfo resolveActivityInfo(android.content.Intent arg1){
    return (android.content.pm.ActivityInfo) null;
  }
  public java.lang.String getProfileFilePath(){
    return (java.lang.String) null;
  }
  public java.lang.String getProcessName(){
    return (java.lang.String) null;
  }
  public static ActivityThread currentActivityThread(){
    return (ActivityThread) null;
  }
  public void registerOnActivityPausedListener(Activity arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("onPause") OnActivityPausedListener arg2){
  }
  public void unregisterOnActivityPausedListener(Activity arg1, OnActivityPausedListener arg2){
  }
  public static android.content.Intent getIntentBeingBroadcast(){
    return (android.content.Intent) null;
  }
  public static Application currentApplication(){
    return (Application) null;
  }
  public static java.lang.String currentPackageName(){
    return (java.lang.String) null;
  }
  public final void installSystemProviders(java.util.List<android.content.pm.ProviderInfo> arg1){
  }
  public final void performNewIntents(android.os.IBinder arg1, java.util.List<android.content.Intent> arg2){
  }
  public final LoadedApk getPackageInfoNoCheck(android.content.pm.ApplicationInfo arg1, android.content.res.CompatibilityInfo arg2){
    return (LoadedApk) null;
  }
  public final LoadedApk peekPackageInfo(java.lang.String arg1, boolean arg2){
    return (LoadedApk) null;
  }
  public void installSystemApplicationInfo(android.content.pm.ApplicationInfo arg1){
  }
  public final void applyConfigurationToResources(android.content.res.Configuration arg1){
  }
  public final java.lang.String removeProviderLocked(android.content.IContentProvider arg1){
    return (java.lang.String) null;
  }
  public static final ActivityThread systemMain(){
    return (ActivityThread) null;
  }
}
