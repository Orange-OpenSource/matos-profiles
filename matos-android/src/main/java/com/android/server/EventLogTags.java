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


public class EventLogTags
{
  // Fields

  public static final int BATTERY_LEVEL = 2722;

  public static final int BATTERY_STATUS = 2723;

  public static final int BATTERY_DISCHARGE = 2730;

  public static final int POWER_SLEEP_REQUESTED = 2724;

  public static final int POWER_SCREEN_BROADCAST_SEND = 2725;

  public static final int POWER_SCREEN_BROADCAST_DONE = 2726;

  public static final int POWER_SCREEN_BROADCAST_STOP = 2727;

  public static final int POWER_SCREEN_STATE = 2728;

  public static final int POWER_PARTIAL_WAKE_STATE = 2729;

  public static final int FREE_STORAGE_CHANGED = 2744;

  public static final int LOW_STORAGE = 2745;

  public static final int FREE_STORAGE_LEFT = 2746;

  public static final int NOTIFICATION_ENQUEUE = 2750;

  public static final int NOTIFICATION_CANCEL = 2751;

  public static final int NOTIFICATION_CANCEL_ALL = 2752;

  public static final int WATCHDOG = 2802;

  public static final int WATCHDOG_PROC_PSS = 2803;

  public static final int WATCHDOG_SOFT_RESET = 2804;

  public static final int WATCHDOG_HARD_RESET = 2805;

  public static final int WATCHDOG_PSS_STATS = 2806;

  public static final int WATCHDOG_PROC_STATS = 2807;

  public static final int WATCHDOG_SCHEDULED_REBOOT = 2808;

  public static final int WATCHDOG_MEMINFO = 2809;

  public static final int WATCHDOG_VMSTAT = 2810;

  public static final int WATCHDOG_REQUESTED_REBOOT = 2811;

  public static final int BACKUP_DATA_CHANGED = 2820;

  public static final int BACKUP_START = 2821;

  public static final int BACKUP_TRANSPORT_FAILURE = 2822;

  public static final int BACKUP_AGENT_FAILURE = 2823;

  public static final int BACKUP_PACKAGE = 2824;

  public static final int BACKUP_SUCCESS = 2825;

  public static final int BACKUP_RESET = 2826;

  public static final int BACKUP_INITIALIZE = 2827;

  public static final int RESTORE_START = 2830;

  public static final int RESTORE_TRANSPORT_FAILURE = 2831;

  public static final int RESTORE_AGENT_FAILURE = 2832;

  public static final int RESTORE_PACKAGE = 2833;

  public static final int RESTORE_SUCCESS = 2834;

  public static final int BOOT_PROGRESS_SYSTEM_RUN = 3010;

  public static final int BOOT_PROGRESS_PMS_START = 3060;

  public static final int BOOT_PROGRESS_PMS_SYSTEM_SCAN_START = 3070;

  public static final int BOOT_PROGRESS_PMS_DATA_SCAN_START = 3080;

  public static final int BOOT_PROGRESS_PMS_SCAN_END = 3090;

  public static final int BOOT_PROGRESS_PMS_READY = 3100;

  public static final int WM_NO_SURFACE_MEMORY = 31000;

  public static final int IMF_FORCE_RECONNECT_IME = 32000;

  public static final int CONNECTIVITY_STATE_CHANGED = 50020;

  public static final int NETSTATS_MOBILE_SAMPLE = 51100;

  public static final int NETSTATS_WIFI_SAMPLE = 51101;

  // Constructors

  private EventLogTags(){
  }
  // Methods

  public static void writeBatteryLevel(int arg1, int arg2, int arg3){
  }
  public static void writeBatteryStatus(int arg1, int arg2, int arg3, int arg4, java.lang.String arg5){
  }
  public static void writeBatteryDischarge(long arg1, int arg2, int arg3){
  }
  public static void writePowerSleepRequested(int arg1){
  }
  public static void writePowerScreenBroadcastSend(int arg1){
  }
  public static void writePowerScreenBroadcastDone(int arg1, long arg2, int arg3){
  }
  public static void writePowerScreenBroadcastStop(int arg1, int arg2){
  }
  public static void writePowerScreenState(int arg1, int arg2, long arg3, int arg4){
  }
  public static void writePowerPartialWakeState(int arg1, java.lang.String arg2){
  }
  public static void writeFreeStorageChanged(long arg1){
  }
  public static void writeLowStorage(long arg1){
  }
  public static void writeFreeStorageLeft(long arg1, long arg2, long arg3){
  }
  public static void writeNotificationEnqueue(java.lang.String arg1, int arg2, java.lang.String arg3){
  }
  public static void writeNotificationCancel(java.lang.String arg1, int arg2, int arg3){
  }
  public static void writeNotificationCancelAll(java.lang.String arg1, int arg2){
  }
  public static void writeWatchdog(java.lang.String arg1){
  }
  public static void writeWatchdogProcPss(java.lang.String arg1, int arg2, int arg3){
  }
  public static void writeWatchdogSoftReset(java.lang.String arg1, int arg2, int arg3, int arg4, java.lang.String arg5){
  }
  public static void writeWatchdogHardReset(java.lang.String arg1, int arg2, int arg3, int arg4){
  }
  public static void writeWatchdogPssStats(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11){
  }
  public static void writeWatchdogProcStats(int arg1, int arg2, int arg3, int arg4, int arg5){
  }
  public static void writeWatchdogScheduledReboot(long arg1, int arg2, int arg3, int arg4, java.lang.String arg5){
  }
  public static void writeWatchdogMeminfo(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11){
  }
  public static void writeWatchdogVmstat(long arg1, int arg2, int arg3, int arg4, int arg5, int arg6){
  }
  public static void writeWatchdogRequestedReboot(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7){
  }
  public static void writeBackupDataChanged(java.lang.String arg1){
  }
  public static void writeBackupStart(java.lang.String arg1){
  }
  public static void writeBackupTransportFailure(java.lang.String arg1){
  }
  public static void writeBackupAgentFailure(java.lang.String arg1, java.lang.String arg2){
  }
  public static void writeBackupPackage(java.lang.String arg1, int arg2){
  }
  public static void writeBackupSuccess(int arg1, int arg2){
  }
  public static void writeBackupReset(java.lang.String arg1){
  }
  public static void writeBackupInitialize(){
  }
  public static void writeRestoreStart(java.lang.String arg1, long arg2){
  }
  public static void writeRestoreTransportFailure(){
  }
  public static void writeRestoreAgentFailure(java.lang.String arg1, java.lang.String arg2){
  }
  public static void writeRestorePackage(java.lang.String arg1, int arg2){
  }
  public static void writeRestoreSuccess(int arg1, int arg2){
  }
  public static void writeBootProgressSystemRun(long arg1){
  }
  public static void writeBootProgressPmsStart(long arg1){
  }
  public static void writeBootProgressPmsSystemScanStart(long arg1){
  }
  public static void writeBootProgressPmsDataScanStart(long arg1){
  }
  public static void writeBootProgressPmsScanEnd(long arg1){
  }
  public static void writeBootProgressPmsReady(long arg1){
  }
  public static void writeWmNoSurfaceMemory(java.lang.String arg1, int arg2, java.lang.String arg3){
  }
  public static void writeImfForceReconnectIme(java.lang.Object [] arg1, long arg2, int arg3){
  }
  public static void writeConnectivityStateChanged(int arg1){
  }
  public static void writeNetstatsMobileSample(long arg1, long arg2, long arg3, long arg4, long arg5, long arg6, long arg7, long arg8, long arg9, long arg10, long arg11, long arg12, long arg13){
  }
  public static void writeNetstatsWifiSample(long arg1, long arg2, long arg3, long arg4, long arg5, long arg6, long arg7, long arg8, long arg9, long arg10, long arg11, long arg12, long arg13){
  }
}
