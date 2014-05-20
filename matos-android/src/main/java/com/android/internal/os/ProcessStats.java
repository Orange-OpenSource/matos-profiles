package com.android.internal.os;

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
public class ProcessStats
{
  // Classes

  public static class Stats
  {
    // Fields

    public final int pid = 0;

    public boolean interesting;

    public java.lang.String baseName;

    public java.lang.String name;

    public int nameWidth;

    public long base_uptime;

    public long rel_uptime;

    public long base_utime;

    public long base_stime;

    public int rel_utime;

    public int rel_stime;

    public long base_minfaults;

    public long base_majfaults;

    public int rel_minfaults;

    public int rel_majfaults;

    public boolean active;

    public boolean working;

    public boolean added;

    public boolean removed;

    // Constructors

    Stats(int arg1, int arg2, boolean arg3){
    }
  }
  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public ProcessStats(boolean arg1){
  }
  // Methods

  public void init(){
  }
  public void update(){
  }
  public final java.lang.String printCurrentLoad(){
    return (java.lang.String) null;
  }
  public final java.lang.String printCurrentState(long arg1){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onLoadChanged(float arg1, float arg2, float arg3){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public int onMeasureProcessName(java.lang.String arg1){
    return 0;
  }
  public long getCpuTimeForPid(int arg1){
    return 0l;
  }
  public long [] getLastCpuSpeedTimes(){
    return (long []) null;
  }
  public final int getLastUserTime(){
    return 0;
  }
  public final int getLastSystemTime(){
    return 0;
  }
  public final int getLastIoWaitTime(){
    return 0;
  }
  public final int getLastIrqTime(){
    return 0;
  }
  public final int getLastSoftIrqTime(){
    return 0;
  }
  public final int getLastIdleTime(){
    return 0;
  }
  public final float getTotalCpuPercent(){
    return 0.0f;
  }
  public final int countStats(){
    return 0;
  }
  public final ProcessStats.Stats getStats(int arg1){
    return (ProcessStats.Stats) null;
  }
  public final int countWorkingStats(){
    return 0;
  }
  public final ProcessStats.Stats getWorkingStats(int arg1){
    return (ProcessStats.Stats) null;
  }
}
