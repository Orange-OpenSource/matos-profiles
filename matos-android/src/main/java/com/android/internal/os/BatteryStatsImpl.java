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


public final class BatteryStatsImpl
  extends android.os.BatteryStats{
  // Classes

  public static interface BatteryCallback
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("batteryCallback")
    public void batteryNeedsCpuUpdate();
    public void batteryPowerChanged(boolean arg1);
  }
  public static interface Unpluggable
  {
    // Methods

    public void unplug(long arg1, long arg2);
    public void plug(long arg1, long arg2);
  }
  public static class Counter
    extends android.os.BatteryStats.Counter    implements BatteryStatsImpl.Unpluggable
  {
    // Constructors

    Counter(java.util.ArrayList<BatteryStatsImpl.Unpluggable> arg1, android.os.Parcel arg2){
      super();
    }
    Counter(java.util.ArrayList<BatteryStatsImpl.Unpluggable> arg1){
      super();
    }
    // Methods

    public void writeToParcel(android.os.Parcel arg1){
    }
    public void unplug(long arg1, long arg2){
    }
    public void plug(long arg1, long arg2){
    }
    public int getCountLocked(int arg1){
      return 0;
    }
    public void logState(android.util.Printer arg1, java.lang.String arg2){
    }
    public static void writeCounterToParcel(android.os.Parcel arg1, BatteryStatsImpl.Counter arg2){
    }
  }
  public static class SamplingCounter
    extends BatteryStatsImpl.Counter  {
    // Constructors

    SamplingCounter(java.util.ArrayList<BatteryStatsImpl.Unpluggable> arg1, android.os.Parcel arg2){
      super((java.util.ArrayList) null, (android.os.Parcel) null);
    }
    SamplingCounter(java.util.ArrayList<BatteryStatsImpl.Unpluggable> arg1){
      super((java.util.ArrayList) null, (android.os.Parcel) null);
    }
    // Methods

    public void addCountAtomic(long arg1){
    }
  }
  public abstract static class Timer
    extends android.os.BatteryStats.Timer    implements BatteryStatsImpl.Unpluggable
  {
    // Constructors

    Timer(int arg1, java.util.ArrayList<BatteryStatsImpl.Unpluggable> arg2, android.os.Parcel arg3){
      super();
    }
    Timer(int arg1, java.util.ArrayList<BatteryStatsImpl.Unpluggable> arg2){
      super();
    }
    // Methods

    public void writeToParcel(android.os.Parcel arg1, long arg2){
    }
    public void unplug(long arg1, long arg2){
    }
    public void plug(long arg1, long arg2){
    }
    public int getCountLocked(int arg1){
      return 0;
    }
    public void logState(android.util.Printer arg1, java.lang.String arg2){
    }
    public long getTotalTimeLocked(long arg1, int arg2){
      return 0l;
    }
    protected abstract long computeRunTimeLocked(long arg1);
    protected abstract int computeCurrentCountLocked();
    public static void writeTimerToParcel(android.os.Parcel arg1, BatteryStatsImpl.Timer arg2, long arg3){
    }
  }
  public static final class SamplingTimer
    extends BatteryStatsImpl.Timer  {
    // Constructors

    SamplingTimer(java.util.ArrayList<BatteryStatsImpl.Unpluggable> arg1, boolean arg2, android.os.Parcel arg3){
      super(0, (java.util.ArrayList) null, (android.os.Parcel) null);
    }
    SamplingTimer(java.util.ArrayList<BatteryStatsImpl.Unpluggable> arg1, boolean arg2, boolean arg3){
      super(0, (java.util.ArrayList) null, (android.os.Parcel) null);
    }
    // Methods

    public void writeToParcel(android.os.Parcel arg1, long arg2){
    }
    public void unplug(long arg1, long arg2){
    }
    public void plug(long arg1, long arg2){
    }
    public void setStale(){
    }
    public void logState(android.util.Printer arg1, java.lang.String arg2){
    }
    protected long computeRunTimeLocked(long arg1){
      return 0l;
    }
    protected int computeCurrentCountLocked(){
      return 0;
    }
    public void updateCurrentReportedCount(int arg1){
    }
    public void updateCurrentReportedTotalTime(long arg1){
    }
    public void setUpdateVersion(int arg1){
    }
    public int getUpdateVersion(){
      return 0;
    }
  }
  public static final class StopwatchTimer
    extends BatteryStatsImpl.Timer  {
    // Constructors

    StopwatchTimer(BatteryStatsImpl.Uid arg1, int arg2, java.util.ArrayList<BatteryStatsImpl.StopwatchTimer> arg3, java.util.ArrayList<BatteryStatsImpl.Unpluggable> arg4, android.os.Parcel arg5){
      super(0, (java.util.ArrayList) null, (android.os.Parcel) null);
    }
    StopwatchTimer(BatteryStatsImpl.Uid arg1, int arg2, java.util.ArrayList<BatteryStatsImpl.StopwatchTimer> arg3, java.util.ArrayList<BatteryStatsImpl.Unpluggable> arg4){
      super(0, (java.util.ArrayList) null, (android.os.Parcel) null);
    }
    // Methods

    public void writeToParcel(android.os.Parcel arg1, long arg2){
    }
    public void plug(long arg1, long arg2){
    }
    public void logState(android.util.Printer arg1, java.lang.String arg2){
    }
    protected long computeRunTimeLocked(long arg1){
      return 0l;
    }
    protected int computeCurrentCountLocked(){
      return 0;
    }
  }
  public final class Uid
    extends android.os.BatteryStats.Uid  {
    // Classes

    public final class Wakelock
      extends android.os.BatteryStats.Uid.Wakelock    {
      // Fields

      // Constructors

      public Wakelock(){
        super();
      }
      // Methods

      public BatteryStatsImpl.Timer getWakeTime(int arg1){
        return (BatteryStatsImpl.Timer) null;
      }
    }
    public final class Sensor
      extends android.os.BatteryStats.Uid.Sensor    {
      // Fields

      // Constructors

      public Sensor(int arg1){
        super();
      }
      // Methods

      public int getHandle(){
        return 0;
      }
      public BatteryStatsImpl.Timer getSensorTime(){
        return (BatteryStatsImpl.Timer) null;
      }
    }
    public final class Proc
      extends android.os.BatteryStats.Uid.Proc      implements BatteryStatsImpl.Unpluggable
    {
      // Fields

      // Constructors

      Proc(){
        super();
      }
      // Methods

      public void unplug(long arg1, long arg2){
      }
      public void plug(long arg1, long arg2){
      }
      public BatteryStatsImpl getBatteryStats(){
        return (BatteryStatsImpl) null;
      }
      public int getStarts(int arg1){
        return 0;
      }
      public long getUserTime(int arg1){
        return 0l;
      }
      public long getSystemTime(int arg1){
        return 0l;
      }
      public long getForegroundTime(int arg1){
        return 0l;
      }
      public long getTimeAtCpuSpeedStep(int arg1, int arg2){
        return 0l;
      }
      public int countExcessivePowers(){
        return 0;
      }
      public android.os.BatteryStats.Uid.Proc.ExcessivePower getExcessivePower(int arg1){
        return (android.os.BatteryStats.Uid.Proc.ExcessivePower) null;
      }
      public void addExcessiveWake(long arg1, long arg2){
      }
      public void addExcessiveCpu(long arg1, long arg2){
      }
      public void addCpuTimeLocked(int arg1, int arg2){
      }
      public void addForegroundTimeLocked(long arg1){
      }
      public void incStartsLocked(){
      }
      public void addSpeedStepTimes(long [] arg1){
      }
    }
    public final class Pkg
      extends android.os.BatteryStats.Uid.Pkg      implements BatteryStatsImpl.Unpluggable
    {
      // Classes

      public final class Serv
        extends android.os.BatteryStats.Uid.Pkg.Serv        implements BatteryStatsImpl.Unpluggable
      {
        // Fields

        // Constructors

        Serv(){
          super();
        }
        // Methods

        public long getStartTime(long arg1, int arg2){
          return 0l;
        }
        public void unplug(long arg1, long arg2){
        }
        public void plug(long arg1, long arg2){
        }
        public BatteryStatsImpl getBatteryStats(){
          return (BatteryStatsImpl) null;
        }
        public int getStarts(int arg1){
          return 0;
        }
        public int getLaunches(int arg1){
          return 0;
        }
        public void startLaunchedLocked(){
        }
        public void stopLaunchedLocked(){
        }
        public void startRunningLocked(){
        }
        public void stopRunningLocked(){
        }
      }
      // Fields

      // Constructors

      Pkg(){
        super();
      }
      // Methods

      public void unplug(long arg1, long arg2){
      }
      public void plug(long arg1, long arg2){
      }
      public java.util.Map<java.lang.String, ? extends android.os.BatteryStats.Uid.Pkg.Serv> getServiceStats(){
        return (java.util.Map) null;
      }
      public int getWakeups(int arg1){
        return 0;
      }
      public BatteryStatsImpl getBatteryStats(){
        return (BatteryStatsImpl) null;
      }
      public void incWakeupsLocked(){
      }
    }
    // Fields

    // Constructors

    public Uid(int arg1){
      super();
    }
    // Methods

    public BatteryStatsImpl getBatteryStats(){
      return (BatteryStatsImpl) null;
    }
    public int getUid(){
      return 0;
    }
    public void noteStartSensor(int arg1){
    }
    public void noteStopSensor(int arg1){
    }
    public void noteStartGps(){
    }
    public void noteStopGps(){
    }
    public void noteUserActivityLocked(int arg1){
    }
    public void noteWifiRunningLocked(){
    }
    public void noteWifiStoppedLocked(){
    }
    public void noteFullWifiLockAcquiredLocked(){
    }
    public void noteFullWifiLockReleasedLocked(){
    }
    public void noteScanWifiLockAcquiredLocked(){
    }
    public void noteScanWifiLockReleasedLocked(){
    }
    public void noteWifiMulticastEnabledLocked(){
    }
    public void noteWifiMulticastDisabledLocked(){
    }
    public java.util.Map<java.lang.String, ? extends android.os.BatteryStats.Uid.Wakelock> getWakelockStats(){
      return (java.util.Map) null;
    }
    public java.util.Map<java.lang.Integer, ? extends android.os.BatteryStats.Uid.Sensor> getSensorStats(){
      return (java.util.Map) null;
    }
    public android.util.SparseArray<? extends android.os.BatteryStats.Uid.Pid> getPidStats(){
      return (android.util.SparseArray) null;
    }
    public java.util.Map<java.lang.String, ? extends android.os.BatteryStats.Uid.Proc> getProcessStats(){
      return (java.util.Map) null;
    }
    public java.util.Map<java.lang.String, ? extends android.os.BatteryStats.Uid.Pkg> getPackageStats(){
      return (java.util.Map) null;
    }
    public long getTcpBytesReceived(int arg1){
      return 0l;
    }
    public long getTcpBytesSent(int arg1){
      return 0l;
    }
    public void noteAudioTurnedOnLocked(){
    }
    public void noteAudioTurnedOffLocked(){
    }
    public void noteVideoTurnedOnLocked(){
    }
    public void noteVideoTurnedOffLocked(){
    }
    public long getWifiRunningTime(long arg1, int arg2){
      return 0l;
    }
    public long getFullWifiLockTime(long arg1, int arg2){
      return 0l;
    }
    public long getScanWifiLockTime(long arg1, int arg2){
      return 0l;
    }
    public long getWifiMulticastTime(long arg1, int arg2){
      return 0l;
    }
    public long getAudioTurnedOnTime(long arg1, int arg2){
      return 0l;
    }
    public long getVideoTurnedOnTime(long arg1, int arg2){
      return 0l;
    }
    public boolean hasUserActivity(){
      return false;
    }
    public int getUserActivityCount(int arg1, int arg2){
      return 0;
    }
    public void noteStartWakeLocked(int arg1, java.lang.String arg2, int arg3){
    }
    public void noteStopWakeLocked(int arg1, java.lang.String arg2, int arg3){
    }
    public long computeCurrentTcpBytesReceived(){
      return 0l;
    }
    public long computeCurrentTcpBytesSent(){
      return 0l;
    }
    public BatteryStatsImpl.Uid.Proc getProcessStatsLocked(java.lang.String arg1){
      return (BatteryStatsImpl.Uid.Proc) null;
    }
    public android.os.BatteryStats.Uid.Pid getPidStatsLocked(int arg1){
      return (android.os.BatteryStats.Uid.Pid) null;
    }
    public BatteryStatsImpl.Uid.Pkg getPackageStatsLocked(java.lang.String arg1){
      return (BatteryStatsImpl.Uid.Pkg) null;
    }
    public BatteryStatsImpl.Uid.Pkg.Serv getServiceStatsLocked(java.lang.String arg1, java.lang.String arg2){
      return (BatteryStatsImpl.Uid.Pkg.Serv) null;
    }
    public BatteryStatsImpl.StopwatchTimer getWakeTimerLocked(java.lang.String arg1, int arg2){
      return (BatteryStatsImpl.StopwatchTimer) null;
    }
    public BatteryStatsImpl.StopwatchTimer getSensorTimerLocked(int arg1, boolean arg2){
      return (BatteryStatsImpl.StopwatchTimer) null;
    }
    public void reportExcessiveWakeLocked(java.lang.String arg1, long arg2, long arg3){
    }
    public void reportExcessiveCpuLocked(java.lang.String arg1, long arg2, long arg3){
    }
  }
  // Fields

  public static final android.os.Parcelable.Creator<BatteryStatsImpl> CREATOR = null;

  // Constructors

  public BatteryStatsImpl(){
    super();
  }
  public BatteryStatsImpl(java.lang.String arg1){
    super();
  }
  public BatteryStatsImpl(android.os.Parcel arg1){
    super();
  }
  // Methods

  public void writeToParcel(android.os.Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
  public void setBatteryState(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6){
  }
  public long getAwakeTimeBattery(){
    return 0l;
  }
  public long getAwakeTimePlugged(){
    return 0l;
  }
  public void readFromParcel(android.os.Parcel arg1){
  }
  public void setCallback(@com.francetelecom.rd.stubs.annotation.CallBackRegister("batteryCallback") BatteryStatsImpl.BatteryCallback arg1){
  }
  public boolean isScreenOn(){
    return false;
  }
  public void dumpLocked(java.io.PrintWriter arg1){
  }
  public boolean isOnBattery(){
    return false;
  }
  public void noteUserActivityLocked(int arg1, int arg2){
  }
  public void noteWifiRunningLocked(android.os.WorkSource arg1){
  }
  public void noteWifiStoppedLocked(android.os.WorkSource arg1){
  }
  public void noteFullWifiLockAcquiredLocked(int arg1){
  }
  public void noteFullWifiLockReleasedLocked(int arg1){
  }
  public void noteScanWifiLockAcquiredLocked(int arg1){
  }
  public void noteScanWifiLockReleasedLocked(int arg1){
  }
  public void noteWifiMulticastEnabledLocked(int arg1){
  }
  public void noteWifiMulticastDisabledLocked(int arg1){
  }
  public void noteStartWakeLocked(int arg1, int arg2, java.lang.String arg3, int arg4){
  }
  public void noteStopWakeLocked(int arg1, int arg2, java.lang.String arg3, int arg4){
  }
  public BatteryStatsImpl.Uid.Proc getProcessStatsLocked(int arg1, java.lang.String arg2){
    return (BatteryStatsImpl.Uid.Proc) null;
  }
  public BatteryStatsImpl.Uid.Proc getProcessStatsLocked(java.lang.String arg1, int arg2){
    return (BatteryStatsImpl.Uid.Proc) null;
  }
  public BatteryStatsImpl.Uid.Pkg getPackageStatsLocked(int arg1, java.lang.String arg2){
    return (BatteryStatsImpl.Uid.Pkg) null;
  }
  public BatteryStatsImpl.Uid.Pkg.Serv getServiceStatsLocked(int arg1, java.lang.String arg2, java.lang.String arg3){
    return (BatteryStatsImpl.Uid.Pkg.Serv) null;
  }
  public void reportExcessiveWakeLocked(int arg1, java.lang.String arg2, long arg3, long arg4){
  }
  public void reportExcessiveCpuLocked(int arg1, java.lang.String arg2, long arg3, long arg4){
  }
  public boolean startIteratingHistoryLocked(){
    return false;
  }
  public boolean getNextHistoryLocked(android.os.BatteryStats.HistoryItem arg1){
    return false;
  }
  public void finishIteratingHistoryLocked(){
  }
  public boolean startIteratingOldHistoryLocked(){
    return false;
  }
  public boolean getNextOldHistoryLocked(android.os.BatteryStats.HistoryItem arg1){
    return false;
  }
  public void finishIteratingOldHistoryLocked(){
  }
  public long getHistoryBaseTime(){
    return 0l;
  }
  public int getStartCount(){
    return 0;
  }
  public long getScreenOnTime(long arg1, int arg2){
    return 0l;
  }
  public long getScreenBrightnessTime(int arg1, long arg2, int arg3){
    return 0l;
  }
  public int getInputEventCount(int arg1){
    return 0;
  }
  public long getPhoneOnTime(long arg1, int arg2){
    return 0l;
  }
  public long getPhoneSignalStrengthTime(int arg1, long arg2, int arg3){
    return 0l;
  }
  public long getPhoneSignalScanningTime(long arg1, int arg2){
    return 0l;
  }
  public int getPhoneSignalStrengthCount(int arg1, int arg2){
    return 0;
  }
  public long getPhoneDataConnectionTime(int arg1, long arg2, int arg3){
    return 0l;
  }
  public int getPhoneDataConnectionCount(int arg1, int arg2){
    return 0;
  }
  public long getWifiOnTime(long arg1, int arg2){
    return 0l;
  }
  public long getGlobalWifiRunningTime(long arg1, int arg2){
    return 0l;
  }
  public long getBluetoothOnTime(long arg1, int arg2){
    return 0l;
  }
  public boolean getIsOnBattery(){
    return false;
  }
  public android.util.SparseArray<? extends android.os.BatteryStats.Uid> getUidStats(){
    return (android.util.SparseArray) null;
  }
  public long getBatteryUptime(long arg1){
    return 0l;
  }
  public long getRadioDataUptimeMs(){
    return 0l;
  }
  public long getRadioDataUptime(){
    return 0l;
  }
  public long getBatteryRealtime(long arg1){
    return 0l;
  }
  public int getDischargeStartLevel(){
    return 0;
  }
  public int getDischargeCurrentLevel(){
    return 0;
  }
  public int getLowDischargeAmountSinceCharge(){
    return 0;
  }
  public int getHighDischargeAmountSinceCharge(){
    return 0;
  }
  public int getDischargeAmountScreenOn(){
    return 0;
  }
  public int getDischargeAmountScreenOnSinceCharge(){
    return 0;
  }
  public int getDischargeAmountScreenOff(){
    return 0;
  }
  public int getDischargeAmountScreenOffSinceCharge(){
    return 0;
  }
  public long computeBatteryUptime(long arg1, int arg2){
    return 0l;
  }
  public long computeBatteryRealtime(long arg1, int arg2){
    return 0l;
  }
  public long computeUptime(long arg1, int arg2){
    return 0l;
  }
  public long computeRealtime(long arg1, int arg2){
    return 0l;
  }
  public java.util.Map<java.lang.String, ? extends BatteryStatsImpl.SamplingTimer> getKernelWakelockStats(){
    return (java.util.Map) null;
  }
  public int getCpuSpeedSteps(){
    return 0;
  }
  public void prepareForDumpLocked(){
  }
  public void commitPendingDataToDisk(){
  }
  public void shutdownLocked(){
  }
  public void setNumSpeedSteps(int arg1){
  }
  public void setRadioScanningTimeout(long arg1){
  }
  public void noteStartWakeFromSourceLocked(android.os.WorkSource arg1, int arg2, java.lang.String arg3, int arg4){
  }
  public void noteStopWakeFromSourceLocked(android.os.WorkSource arg1, int arg2, java.lang.String arg3, int arg4){
  }
  public void noteStartSensorLocked(int arg1, int arg2){
  }
  public void noteStopSensorLocked(int arg1, int arg2){
  }
  public void noteStartGpsLocked(int arg1){
  }
  public void noteStopGpsLocked(int arg1){
  }
  public void noteScreenOnLocked(){
  }
  public void noteScreenBrightnessLocked(int arg1){
  }
  public void noteScreenOffLocked(){
  }
  public void noteInputEventAtomic(){
  }
  public void notePhoneOnLocked(){
  }
  public void notePhoneOffLocked(){
  }
  public void notePhoneSignalStrengthLocked(android.telephony.SignalStrength arg1){
  }
  public void notePhoneDataConnectionStateLocked(int arg1, boolean arg2){
  }
  public void notePhoneStateLocked(int arg1, int arg2){
  }
  public void noteWifiOnLocked(){
  }
  public void noteWifiOffLocked(){
  }
  public void noteAudioOnLocked(int arg1){
  }
  public void noteAudioOffLocked(int arg1){
  }
  public void noteVideoOnLocked(int arg1){
  }
  public void noteVideoOffLocked(int arg1){
  }
  public void noteWifiRunningChangedLocked(android.os.WorkSource arg1, android.os.WorkSource arg2){
  }
  public void noteBluetoothOnLocked(){
  }
  public void setBtHeadset(android.bluetooth.BluetoothHeadset arg1){
  }
  public void noteBluetoothOffLocked(){
  }
  public void noteFullWifiLockAcquiredFromSourceLocked(android.os.WorkSource arg1){
  }
  public void noteFullWifiLockReleasedFromSourceLocked(android.os.WorkSource arg1){
  }
  public void noteScanWifiLockAcquiredFromSourceLocked(android.os.WorkSource arg1){
  }
  public void noteScanWifiLockReleasedFromSourceLocked(android.os.WorkSource arg1){
  }
  public void noteWifiMulticastEnabledFromSourceLocked(android.os.WorkSource arg1){
  }
  public void noteWifiMulticastDisabledFromSourceLocked(android.os.WorkSource arg1){
  }
  public void noteNetworkInterfaceTypeLocked(java.lang.String arg1, int arg2){
  }
  public void resetAllStatsLocked(){
  }
  public void writeSyncLocked(){
  }
  public void readLocked(){
  }
  public void writeAsyncLocked(){
  }
  public int startAddingCpuLocked(){
    return 0;
  }
  public void finishAddingCpuLocked(int arg1, int arg2, int arg3, long [] arg4){
  }
  public void noteProcessDiedLocked(int arg1, int arg2){
  }
  public long getProcessWakeTime(int arg1, int arg2, long arg3){
    return 0l;
  }
  public void removeUidStatsLocked(int arg1){
  }
  public BatteryStatsImpl.SamplingTimer getKernelWakelockTimerLocked(java.lang.String arg1){
    return (BatteryStatsImpl.SamplingTimer) null;
  }
  public int getBluetoothPingCount(){
    return 0;
  }
  public void doUnplugLocked(long arg1, long arg2){
  }
  public void doPlugLocked(long arg1, long arg2){
  }
  public void updateKernelWakelocksLocked(){
  }
  public long getMobileTcpBytesSent(int arg1){
    return 0l;
  }
  public long getMobileTcpBytesReceived(int arg1){
    return 0l;
  }
  public long getTotalTcpBytesSent(int arg1){
    return 0l;
  }
  public long getTotalTcpBytesReceived(int arg1){
    return 0l;
  }
  public int getDischargeStartLevelLocked(){
    return 0;
  }
  public int getDischargeCurrentLevelLocked(){
    return 0;
  }
  public BatteryStatsImpl.Uid getUidStatsLocked(int arg1){
    return (BatteryStatsImpl.Uid) null;
  }
  public void distributeWorkLocked(int arg1){
  }
  public void writeSummaryToParcel(android.os.Parcel arg1){
  }
  public void writeToParcelWithoutUids(android.os.Parcel arg1, int arg2){
  }
}
