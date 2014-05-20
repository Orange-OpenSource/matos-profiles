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
public final class LoadedApk
{
  // Fields

  public final android.view.CompatibilityInfoHolder mCompatibilityInfo = (android.view.CompatibilityInfoHolder) null;

  // Constructors

  public LoadedApk(ActivityThread arg1, android.content.pm.ApplicationInfo arg2, android.content.res.CompatibilityInfo arg3, ActivityThread arg4, java.lang.ClassLoader arg5, boolean arg6, boolean arg7){
  }
  public LoadedApk(ActivityThread arg1, java.lang.String arg2, android.content.Context arg3, android.content.pm.ApplicationInfo arg4, android.content.res.CompatibilityInfo arg5){
  }
  // Methods

  public java.lang.ClassLoader getClassLoader(){
    return (java.lang.ClassLoader) null;
  }
  public android.content.res.Resources getResources(ActivityThread arg1){
    return (android.content.res.Resources) null;
  }
  public java.lang.String getPackageName(){
    return (java.lang.String) null;
  }
  public android.content.pm.ApplicationInfo getApplicationInfo(){
    return (android.content.pm.ApplicationInfo) null;
  }
  public android.content.res.AssetManager getAssets(ActivityThread arg1){
    return (android.content.res.AssetManager) null;
  }
  public boolean isSecurityViolation(){
    return false;
  }
  public java.lang.String getAppDir(){
    return (java.lang.String) null;
  }
  public java.lang.String getResDir(){
    return (java.lang.String) null;
  }
  public java.lang.String getDataDir(){
    return (java.lang.String) null;
  }
  public java.io.File getDataDirFile(){
    return (java.io.File) null;
  }
  public Application makeApplication(boolean arg1, Instrumentation arg2){
    return (Application) null;
  }
  public void removeContextRegistrations(android.content.Context arg1, java.lang.String arg2, java.lang.String arg3){
  }
  public android.content.IIntentReceiver getReceiverDispatcher(android.content.BroadcastReceiver arg1, android.content.Context arg2, android.os.Handler arg3, Instrumentation arg4, boolean arg5){
    return (android.content.IIntentReceiver) null;
  }
  public android.content.IIntentReceiver forgetReceiverDispatcher(android.content.Context arg1, android.content.BroadcastReceiver arg2){
    return (android.content.IIntentReceiver) null;
  }
  public final IServiceConnection getServiceDispatcher(android.content.ServiceConnection arg1, android.content.Context arg2, android.os.Handler arg3, int arg4){
    return (IServiceConnection) null;
  }
  public final IServiceConnection forgetServiceDispatcher(android.content.Context arg1, android.content.ServiceConnection arg2){
    return (IServiceConnection) null;
  }
}
