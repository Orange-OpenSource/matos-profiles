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
@com.francetelecom.rd.stubs.annotation.DumpHierarchy(value = "android.hierarchy.Service", noAbstract = false)
public abstract class Service
  extends android.content.ContextWrapper  implements android.content.ComponentCallbacks2
{
  // Fields

  public static final int START_CONTINUATION_MASK = 15;

  public static final int START_STICKY_COMPATIBILITY = 0;

  public static final int START_STICKY = 1;

  public static final int START_NOT_STICKY = 2;

  public static final int START_REDELIVER_INTENT = 3;

  public static final int START_TASK_REMOVED_COMPLETE = 1000;

  public static final int START_FLAG_REDELIVERY = 1;

  public static final int START_FLAG_RETRY = 2;

  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onStart")
  public Service(){
    super((android.content.Context) null);
  }
  // Methods

  protected void dump(java.io.FileDescriptor arg1, java.io.PrintWriter arg2, java.lang.String [] arg3){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onStart")
  public void onCreate(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onStart")
  public void onDestroy(){
  }
  public final Application getApplication(){
    return (Application) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onStart")
  public void onStart(android.content.Intent arg1, int arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onStart")
  public void onConfigurationChanged(android.content.res.Configuration arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onStart")
  public void onLowMemory(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onStart")
  public void onTrimMemory(int arg1){
  }
  public final void attach(android.content.Context arg1, ActivityThread arg2, java.lang.String arg3, android.os.IBinder arg4, Application arg5, java.lang.Object arg6){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onStart")
  public abstract android.os.IBinder onBind(android.content.Intent arg1);
  public final void setForeground(boolean arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onStart")
  public int onStartCommand(android.content.Intent arg1, int arg2, int arg3){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onStart")
  public boolean onUnbind(android.content.Intent arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onStart")
  public void onRebind(android.content.Intent arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onStart")
  public void onTaskRemoved(android.content.Intent arg1){
  }
  public final void stopSelf(){
  }
  public final void stopSelf(int arg1){
  }
  public final boolean stopSelfResult(int arg1){
    return false;
  }
  public final void startForeground(int arg1, Notification arg2){
  }
  public final void stopForeground(boolean arg1){
  }
}
