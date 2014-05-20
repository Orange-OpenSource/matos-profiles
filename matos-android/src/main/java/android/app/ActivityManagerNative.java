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
public abstract class ActivityManagerNative
  extends android.os.Binder  implements IActivityManager
{
  // Constructors

  public ActivityManagerNative(){
    super();
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.UseRule(value = "ActivityManagerNative.getDefault", report = "-")
  public static IActivityManager getDefault(){
    return (IActivityManager) null;
  }
  public android.os.IBinder asBinder(){
    return (android.os.IBinder) null;
  }
  public static IActivityManager asInterface(android.os.IBinder arg1){
    return (IActivityManager) null;
  }
  public boolean onTransact(int arg1, android.os.Parcel arg2, android.os.Parcel arg3, int arg4) throws android.os.RemoteException{
    return false;
  }
  public static void noteWakeupAlarm(PendingIntent arg1){
  }
  public static boolean isSystemReady(){
    return false;
  }
  public static void broadcastStickyIntent(android.content.Intent arg1, java.lang.String arg2){
  }
}
