package com.android.server;

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
public class PowerManagerService
  extends android.os.IPowerManager.Stub  implements Watchdog.Monitor, android.os.LocalPowerManager
{
  // Constructors

  PowerManagerService(){
    super();
  }
  // Methods

  public void setPolicy(android.view.WindowManagerPolicy arg1){
  }
  public void dump(java.io.FileDescriptor arg1, java.io.PrintWriter arg2, java.lang.String [] arg3){
  }
  public void monitor(){
  }
  public void reboot(java.lang.String arg1){
  }
  public void releaseWakeLock(android.os.IBinder arg1, int arg2){
  }
  public void acquireWakeLock(int arg1, android.os.IBinder arg2, java.lang.String arg3, android.os.WorkSource arg4){
  }
  public void setMaximumScreenOffTimeount(int arg1){
  }
  public void goToSleepWithReason(long arg1, int arg2){
  }
  public boolean isScreenOn(){
    return false;
  }
  public void updateWakeLockWorkSource(android.os.IBinder arg1, android.os.WorkSource arg2){
  }
  public void goToSleep(long arg1){
  }
  public void userActivity(long arg1, boolean arg2){
  }
  public void userActivity(long arg1, boolean arg2, int arg3){
  }
  public void userActivity(long arg1, boolean arg2, int arg3, boolean arg4){
  }
  public void userActivityWithForce(long arg1, boolean arg2, boolean arg3){
  }
  public void clearUserActivityTimeout(long arg1, long arg2){
  }
  public void setPokeLock(int arg1, android.os.IBinder arg2, java.lang.String arg3){
  }
  public int getSupportedWakeLockFlags(){
    return 0;
  }
  public void setStayOnSetting(int arg1){
  }
  public void preventScreenOn(boolean arg1){
  }
  public void crash(java.lang.String arg1){
  }
  public void setBacklightBrightness(int arg1){
  }
  public void setAttentionLight(boolean arg1, int arg2){
  }
  public void acquireWakeLockLocked(int arg1, android.os.IBinder arg2, int arg3, int arg4, java.lang.String arg5, android.os.WorkSource arg6){
  }
  public void enableUserActivity(boolean arg1){
  }
  public void setScreenBrightnessOverride(int arg1){
  }
  public void setButtonBrightnessOverride(int arg1){
  }
  public long timeSinceScreenOn(){
    return 0l;
  }
  public void setKeyboardVisibility(boolean arg1){
  }
}
