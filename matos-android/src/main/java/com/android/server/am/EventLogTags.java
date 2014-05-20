package com.android.server.am;

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


public class EventLogTags
{
  // Fields

  public static final int CONFIGURATION_CHANGED = 2719;

  public static final int CPU = 2721;

  public static final int BOOT_PROGRESS_AMS_READY = 3040;

  public static final int BOOT_PROGRESS_ENABLE_SCREEN = 3050;

  public static final int AM_FINISH_ACTIVITY = 30001;

  public static final int AM_TASK_TO_FRONT = 30002;

  public static final int AM_NEW_INTENT = 30003;

  public static final int AM_CREATE_TASK = 30004;

  public static final int AM_CREATE_ACTIVITY = 30005;

  public static final int AM_RESTART_ACTIVITY = 30006;

  public static final int AM_RESUME_ACTIVITY = 30007;

  public static final int AM_ANR = 30008;

  public static final int ACTIVITY_LAUNCH_TIME = 30009;

  public static final int AM_PROC_BOUND = 30010;

  public static final int AM_PROC_DIED = 30011;

  public static final int AM_FAILED_TO_PAUSE = 30012;

  public static final int AM_PAUSE_ACTIVITY = 30013;

  public static final int AM_PROC_START = 30014;

  public static final int AM_PROC_BAD = 30015;

  public static final int AM_PROC_GOOD = 30016;

  public static final int AM_LOW_MEMORY = 30017;

  public static final int AM_DESTROY_ACTIVITY = 30018;

  public static final int AM_RELAUNCH_RESUME_ACTIVITY = 30019;

  public static final int AM_RELAUNCH_ACTIVITY = 30020;

  public static final int AM_ON_PAUSED_CALLED = 30021;

  public static final int AM_ON_RESUME_CALLED = 30022;

  public static final int AM_KILL = 30023;

  public static final int AM_BROADCAST_DISCARD_FILTER = 30024;

  public static final int AM_BROADCAST_DISCARD_APP = 30025;

  public static final int AM_CREATE_SERVICE = 30030;

  public static final int AM_DESTROY_SERVICE = 30031;

  public static final int AM_PROCESS_CRASHED_TOO_MUCH = 30032;

  public static final int AM_DROP_PROCESS = 30033;

  public static final int AM_SERVICE_CRASHED_TOO_MUCH = 30034;

  public static final int AM_SCHEDULE_SERVICE_RESTART = 30035;

  public static final int AM_PROVIDER_LOST_PROCESS = 30036;

  public static final int AM_PROCESS_START_TIMEOUT = 30037;

  public static final int AM_CRASH = 30039;

  public static final int AM_WTF = 30040;

  // Constructors

  private EventLogTags(){
  }
  // Methods

  public static void writeConfigurationChanged(int arg1){
  }
  public static void writeCpu(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6){
  }
  public static void writeBootProgressAmsReady(long arg1){
  }
  public static void writeBootProgressEnableScreen(long arg1){
  }
  public static void writeAmFinishActivity(int arg1, int arg2, java.lang.String arg3, java.lang.String arg4){
  }
  public static void writeAmTaskToFront(int arg1){
  }
  public static void writeAmNewIntent(int arg1, int arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5, java.lang.String arg6, int arg7){
  }
  public static void writeAmCreateTask(int arg1){
  }
  public static void writeAmCreateActivity(int arg1, int arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5, java.lang.String arg6, int arg7){
  }
  public static void writeAmRestartActivity(int arg1, int arg2, java.lang.String arg3){
  }
  public static void writeAmResumeActivity(int arg1, int arg2, java.lang.String arg3){
  }
  public static void writeAmAnr(int arg1, java.lang.String arg2, int arg3, java.lang.String arg4){
  }
  public static void writeActivityLaunchTime(int arg1, java.lang.String arg2, long arg3){
  }
  public static void writeAmProcBound(int arg1, java.lang.String arg2){
  }
  public static void writeAmProcDied(int arg1, java.lang.String arg2){
  }
  public static void writeAmFailedToPause(int arg1, java.lang.String arg2, java.lang.String arg3){
  }
  public static void writeAmPauseActivity(int arg1, java.lang.String arg2){
  }
  public static void writeAmProcStart(int arg1, int arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5){
  }
  public static void writeAmProcBad(int arg1, java.lang.String arg2){
  }
  public static void writeAmProcGood(int arg1, java.lang.String arg2){
  }
  public static void writeAmLowMemory(int arg1){
  }
  public static void writeAmDestroyActivity(int arg1, int arg2, java.lang.String arg3){
  }
  public static void writeAmRelaunchResumeActivity(int arg1, int arg2, java.lang.String arg3){
  }
  public static void writeAmRelaunchActivity(int arg1, int arg2, java.lang.String arg3){
  }
  public static void writeAmOnPausedCalled(java.lang.String arg1){
  }
  public static void writeAmOnResumeCalled(java.lang.String arg1){
  }
  public static void writeAmKill(int arg1, java.lang.String arg2, int arg3, java.lang.String arg4){
  }
  public static void writeAmBroadcastDiscardFilter(int arg1, java.lang.String arg2, int arg3, int arg4){
  }
  public static void writeAmBroadcastDiscardApp(int arg1, java.lang.String arg2, int arg3, java.lang.String arg4){
  }
  public static void writeAmCreateService(int arg1, java.lang.String arg2, java.lang.String arg3, int arg4){
  }
  public static void writeAmDestroyService(int arg1, java.lang.String arg2, int arg3){
  }
  public static void writeAmProcessCrashedTooMuch(java.lang.String arg1, int arg2){
  }
  public static void writeAmDropProcess(int arg1){
  }
  public static void writeAmServiceCrashedTooMuch(int arg1, java.lang.String arg2, int arg3){
  }
  public static void writeAmScheduleServiceRestart(java.lang.String arg1, long arg2){
  }
  public static void writeAmProviderLostProcess(java.lang.String arg1, int arg2, java.lang.String arg3){
  }
  public static void writeAmProcessStartTimeout(int arg1, int arg2, java.lang.String arg3){
  }
  public static void writeAmCrash(int arg1, java.lang.String arg2, int arg3, java.lang.String arg4, java.lang.String arg5, java.lang.String arg6, int arg7){
  }
  public static void writeAmWtf(int arg1, java.lang.String arg2, int arg3, java.lang.String arg4, java.lang.String arg5){
  }
}
