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
public class Application
  extends android.content.ContextWrapper  implements android.content.ComponentCallbacks2
{
  // Classes

  public static interface ActivityLifecycleCallbacks
  {
    // Methods
	@com.francetelecom.rd.stubs.annotation.CallBack("ActivityLifecycleCallbacks")
    public void onActivityCreated(Activity arg1, android.os.Bundle arg2);
	@com.francetelecom.rd.stubs.annotation.CallBack("ActivityLifecycleCallbacks")
    public void onActivityStarted(Activity arg1);
	@com.francetelecom.rd.stubs.annotation.CallBack("ActivityLifecycleCallbacks")
    public void onActivityResumed(Activity arg1);
	@com.francetelecom.rd.stubs.annotation.CallBack("ActivityLifecycleCallbacks")
    public void onActivityPaused(Activity arg1);
	@com.francetelecom.rd.stubs.annotation.CallBack("ActivityLifecycleCallbacks")
    public void onActivityStopped(Activity arg1);
	@com.francetelecom.rd.stubs.annotation.CallBack("ActivityLifecycleCallbacks")
    public void onActivitySaveInstanceState(Activity arg1, android.os.Bundle arg2);
	@com.francetelecom.rd.stubs.annotation.CallBack("ActivityLifecycleCallbacks")
    public void onActivityDestroyed(Activity arg1);
  }
  // Fields

  public LoadedApk mLoadedApk;

  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("OnCreate")
  public Application(){
    super((android.content.Context) null);
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("OnCreate")
  public void onCreate(){
  }
  public void onConfigurationChanged(android.content.res.Configuration arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("OnCreate")
  public void onLowMemory(){
  }
  public void onTrimMemory(int arg1){
  }
  public void registerComponentCallbacks(@com.francetelecom.rd.stubs.annotation.CallBackRegister("ComponentCallbacks") android.content.ComponentCallbacks arg1){
  }
  public void unregisterComponentCallbacks(android.content.ComponentCallbacks arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("OnCreate")
  public void onTerminate(){
  }
  public void registerActivityLifecycleCallbacks(@com.francetelecom.rd.stubs.annotation.CallBackRegister("ActivityLifecycleCallbacks") Application.ActivityLifecycleCallbacks arg1){
  }
  public void unregisterActivityLifecycleCallbacks(Application.ActivityLifecycleCallbacks arg1){
  }
}
