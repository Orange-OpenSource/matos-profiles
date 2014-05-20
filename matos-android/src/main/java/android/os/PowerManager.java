package android.os;

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
public class PowerManager
{
  // Classes

  public class WakeLock
  {
    // Fields

    // Constructors

    WakeLock(int arg1, java.lang.String arg2){
    }
    // Methods

    protected void finalize() throws java.lang.Throwable{
    }
    public java.lang.String toString(){
      return (java.lang.String) null;
    }
    @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "WakeLock.acquire-1", pos = 0, report = "-")
    public void acquire(){
    }
    @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "WakeLock.acquire-2", pos = 0, report = "-")
    public void acquire(long arg1){
    }
    @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "WakeLock.release-1", pos = 0, report = "-")
    public void release(){
    }
    @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "WakeLock.release-2", pos = 0, report = "-")
    public void release(int arg1){
    }
    public boolean isHeld(){
      return false;
    }
    public void setReferenceCounted(boolean arg1){
    }
    public void setWorkSource(WorkSource arg1){
    }
  }
  // Fields

  public static final int PARTIAL_WAKE_LOCK = 1;

  public static final int FULL_WAKE_LOCK = 26;

  public static final int SCREEN_BRIGHT_WAKE_LOCK = 10;

  public static final int SCREEN_DIM_WAKE_LOCK = 6;

  public static final int PROXIMITY_SCREEN_OFF_WAKE_LOCK = 32;

  public static final int WAIT_FOR_PROXIMITY_NEGATIVE = 1;

  public static final int ACQUIRE_CAUSES_WAKEUP = 268435456;

  public static final int ON_AFTER_RELEASE = 536870912;

  // Constructors

  private PowerManager(){
  }
  public PowerManager(IPowerManager arg1, Handler arg2){
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.UseRule(value = "PowerManager.reboot", report = "-")
  public void reboot(java.lang.String arg1){
  }
  public boolean isScreenOn(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "PowerManager.goToSleep", report = "-")
  public void goToSleep(long arg1){
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "PowerManager.userActivity", report = "-")
  public void userActivity(long arg1, boolean arg2){
  }
  public int getSupportedWakeLockFlags(){
    return 0;
  }
  public void setBacklightBrightness(int arg1){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "PowerManager.newWakeLock", pos = {1, -1}, report = "-")
  public PowerManager.WakeLock newWakeLock(int arg1, java.lang.String arg2){
    return (PowerManager.WakeLock) null;
  }
}
