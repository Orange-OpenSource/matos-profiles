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
public abstract class BatteryStats
  implements Parcelable
{
  // Classes

  public abstract static class Counter
  {
    // Constructors

    public Counter(){
    }
    // Methods

    public abstract int getCountLocked(int arg1);
    public abstract void logState(android.util.Printer arg1, java.lang.String arg2);
  }
  public abstract static class Timer
  {
    // Constructors

    public Timer(){
    }
    // Methods

    public abstract int getCountLocked(int arg1);
    public abstract void logState(android.util.Printer arg1, java.lang.String arg2);
    public abstract long getTotalTimeLocked(long arg1, int arg2);
  }
  public abstract static class Uid
  {
    // Classes

    public abstract static class Wakelock
    {
      // Constructors

      public Wakelock(){
      }
      // Methods

      public abstract BatteryStats.Timer getWakeTime(int arg1);
    }
    public abstract static class Sensor
    {
      // Fields

      public static final int GPS = -10000;

      // Constructors

      public Sensor(){
      }
      // Methods

      public abstract int getHandle();
      public abstract BatteryStats.Timer getSensorTime();
    }
    public class Pid
    {
      // Fields

      public long mWakeSum;

      public long mWakeStart;

      // Constructors

      public Pid(){
      }
    }
    public abstract static class Proc
    {
      // Classes

      public static class ExcessivePower
      {
        // Fields

        public static final int TYPE_WAKE = 1;

        public static final int TYPE_CPU = 2;

        public int type;

        public long overTime;

        public long usedTime;

        // Constructors

        public ExcessivePower(){
        }
      }
      // Constructors

      public Proc(){
      }
      // Methods

      public abstract int getStarts(int arg1);
      public abstract long getUserTime(int arg1);
      public abstract long getSystemTime(int arg1);
      public abstract long getForegroundTime(int arg1);
      public abstract long getTimeAtCpuSpeedStep(int arg1, int arg2);
      public abstract int countExcessivePowers();
      public abstract BatteryStats.Uid.Proc.ExcessivePower getExcessivePower(int arg1);
    }
    public abstract static class Pkg
    {
      // Classes

      public abstract class Serv
      {
        // Fields

        // Constructors

        public Serv(){
        }
        // Methods

        public abstract long getStartTime(long arg1, int arg2);
        public abstract int getStarts(int arg1);
        public abstract int getLaunches(int arg1);
      }
      // Constructors

      public Pkg(){
      }
      // Methods

      public abstract java.util.Map<java.lang.String, ? extends BatteryStats.Uid.Pkg.Serv> getServiceStats();
      public abstract int getWakeups(int arg1);
    }
    // Fields

    public static final int NUM_USER_ACTIVITY_TYPES = 7;

    // Constructors

    public Uid(){
    }
    // Methods

    public abstract int getUid();
    public abstract void noteUserActivityLocked(int arg1);
    public abstract void noteWifiRunningLocked();
    public abstract void noteWifiStoppedLocked();
    public abstract void noteFullWifiLockAcquiredLocked();
    public abstract void noteFullWifiLockReleasedLocked();
    public abstract void noteScanWifiLockAcquiredLocked();
    public abstract void noteScanWifiLockReleasedLocked();
    public abstract void noteWifiMulticastEnabledLocked();
    public abstract void noteWifiMulticastDisabledLocked();
    public abstract java.util.Map<java.lang.String, ? extends BatteryStats.Uid.Wakelock> getWakelockStats();
    public abstract java.util.Map<java.lang.Integer, ? extends BatteryStats.Uid.Sensor> getSensorStats();
    public abstract android.util.SparseArray<? extends BatteryStats.Uid.Pid> getPidStats();
    public abstract java.util.Map<java.lang.String, ? extends BatteryStats.Uid.Proc> getProcessStats();
    public abstract java.util.Map<java.lang.String, ? extends BatteryStats.Uid.Pkg> getPackageStats();
    public abstract long getTcpBytesReceived(int arg1);
    public abstract long getTcpBytesSent(int arg1);
    public abstract void noteAudioTurnedOnLocked();
    public abstract void noteAudioTurnedOffLocked();
    public abstract void noteVideoTurnedOnLocked();
    public abstract void noteVideoTurnedOffLocked();
    public abstract long getWifiRunningTime(long arg1, int arg2);
    public abstract long getFullWifiLockTime(long arg1, int arg2);
    public abstract long getScanWifiLockTime(long arg1, int arg2);
    public abstract long getWifiMulticastTime(long arg1, int arg2);
    public abstract long getAudioTurnedOnTime(long arg1, int arg2);
    public abstract long getVideoTurnedOnTime(long arg1, int arg2);
    public abstract boolean hasUserActivity();
    public abstract int getUserActivityCount(int arg1, int arg2);
  }
  public static final class HistoryItem
    implements Parcelable
  {
    // Fields

    public BatteryStats.HistoryItem next;

    public long time;

    public static final byte CMD_NULL = 0;

    public static final byte CMD_UPDATE = 1;

    public static final byte CMD_START = 2;

    public static final byte CMD_OVERFLOW = 3;

    public byte cmd;

    public byte batteryLevel;

    public byte batteryStatus;

    public byte batteryHealth;

    public byte batteryPlugType;

    public char batteryTemperature;

    public char batteryVoltage;

    public static final int STATE_BRIGHTNESS_MASK = 15;

    public static final int STATE_BRIGHTNESS_SHIFT = 0;

    public static final int STATE_SIGNAL_STRENGTH_MASK = 240;

    public static final int STATE_SIGNAL_STRENGTH_SHIFT = 4;

    public static final int STATE_PHONE_STATE_MASK = 3840;

    public static final int STATE_PHONE_STATE_SHIFT = 8;

    public static final int STATE_DATA_CONNECTION_MASK = 61440;

    public static final int STATE_DATA_CONNECTION_SHIFT = 12;

    public static final int STATE_WAKE_LOCK_FLAG = 1073741824;

    public static final int STATE_SENSOR_ON_FLAG = 536870912;

    public static final int STATE_GPS_ON_FLAG = 268435456;

    public static final int STATE_PHONE_SCANNING_FLAG = 134217728;

    public static final int STATE_WIFI_RUNNING_FLAG = 67108864;

    public static final int STATE_WIFI_FULL_LOCK_FLAG = 33554432;

    public static final int STATE_WIFI_SCAN_LOCK_FLAG = 16777216;

    public static final int STATE_WIFI_MULTICAST_ON_FLAG = 8388608;

    public static final int STATE_AUDIO_ON_FLAG = 4194304;

    public static final int STATE_VIDEO_ON_FLAG = 2097152;

    public static final int STATE_SCREEN_ON_FLAG = 1048576;

    public static final int STATE_BATTERY_PLUGGED_FLAG = 524288;

    public static final int STATE_PHONE_IN_CALL_FLAG = 262144;

    public static final int STATE_WIFI_ON_FLAG = 131072;

    public static final int STATE_BLUETOOTH_ON_FLAG = 65536;

    public static final int MOST_INTERESTING_STATES = 270270464;

    public int states;

    // Constructors

    public HistoryItem(){
    }
    public HistoryItem(long arg1, Parcel arg2){
    }
    // Methods

    public void clear(){
    }
    public void writeToParcel(Parcel arg1, int arg2){
    }
    public int describeContents(){
      return 0;
    }
    public void setTo(BatteryStats.HistoryItem arg1){
    }
    public void setTo(long arg1, byte arg2, BatteryStats.HistoryItem arg3){
    }
    public void writeDelta(Parcel arg1, BatteryStats.HistoryItem arg2){
    }
    public void readDelta(Parcel arg1){
    }
    public boolean same(BatteryStats.HistoryItem arg1){
      return false;
    }
  }
  public static final class BitDescription
  {
    // Fields

    public final int mask = 0;

    public final int shift = 0;

    public final java.lang.String name = (java.lang.String) null;

    public final java.lang.String [] values = (java.lang.String []) null;

    // Constructors

    public BitDescription(int arg1, java.lang.String arg2){
    }
    public BitDescription(int arg1, int arg2, java.lang.String arg3, java.lang.String [] arg4){
    }
  }
  public static class HistoryPrinter
  {
    // Constructors

    public HistoryPrinter(){
    }
    // Methods

    public void printNextItem(java.io.PrintWriter arg1, BatteryStats.HistoryItem arg2, long arg3){
    }
  }
  // Fields

  public static final int WAKE_TYPE_PARTIAL = 0;

  public static final int WAKE_TYPE_FULL = 1;

  public static final int WAKE_TYPE_WINDOW = 2;

  public static final int SENSOR = 3;

  public static final int WIFI_RUNNING = 4;

  public static final int FULL_WIFI_LOCK = 5;

  public static final int SCAN_WIFI_LOCK = 6;

  public static final int WIFI_MULTICAST_ENABLED = 7;

  public static final int AUDIO_TURNED_ON = 7;

  public static final int VIDEO_TURNED_ON = 8;

  public static final int STATS_SINCE_CHARGED = 0;

  public static final int STATS_LAST = 1;

  public static final int STATS_CURRENT = 2;

  public static final int STATS_SINCE_UNPLUGGED = 3;

  public static final int SCREEN_BRIGHTNESS_DARK = 0;

  public static final int SCREEN_BRIGHTNESS_DIM = 1;

  public static final int SCREEN_BRIGHTNESS_MEDIUM = 2;

  public static final int SCREEN_BRIGHTNESS_LIGHT = 3;

  public static final int SCREEN_BRIGHTNESS_BRIGHT = 4;

  public static final int NUM_SCREEN_BRIGHTNESS_BINS = 5;

  public static final int DATA_CONNECTION_NONE = 0;

  public static final int DATA_CONNECTION_GPRS = 1;

  public static final int DATA_CONNECTION_EDGE = 2;

  public static final int DATA_CONNECTION_UMTS = 3;

  public static final int DATA_CONNECTION_CDMA = 4;

  public static final int DATA_CONNECTION_EVDO_0 = 5;

  public static final int DATA_CONNECTION_EVDO_A = 6;

  public static final int DATA_CONNECTION_1xRTT = 7;

  public static final int DATA_CONNECTION_HSDPA = 8;

  public static final int DATA_CONNECTION_HSUPA = 9;

  public static final int DATA_CONNECTION_HSPA = 10;

  public static final int DATA_CONNECTION_IDEN = 11;

  public static final int DATA_CONNECTION_EVDO_B = 12;

  public static final int DATA_CONNECTION_LTE = 13;

  public static final int DATA_CONNECTION_EHRPD = 14;

  public static final int DATA_CONNECTION_OTHER = 15;

  public static final int NUM_DATA_CONNECTION_TYPES = 16;

  public static final BatteryStats.BitDescription [] HISTORY_STATE_DESCRIPTIONS = null;

  // Constructors

  public BatteryStats(){
  }
  // Methods

  public final void dumpLocked(java.io.PrintWriter arg1, java.lang.String arg2, int arg3, int arg4){
  }
  public void dumpLocked(java.io.PrintWriter arg1){
  }
  public final void dumpCheckinLocked(java.io.PrintWriter arg1, int arg2, int arg3){
  }
  public void dumpCheckinLocked(java.io.PrintWriter arg1, java.lang.String [] arg2, java.util.List<android.content.pm.ApplicationInfo> arg3){
  }
  public abstract boolean startIteratingHistoryLocked();
  public abstract boolean getNextHistoryLocked(BatteryStats.HistoryItem arg1);
  public abstract void finishIteratingHistoryLocked();
  public abstract boolean startIteratingOldHistoryLocked();
  public abstract boolean getNextOldHistoryLocked(BatteryStats.HistoryItem arg1);
  public abstract void finishIteratingOldHistoryLocked();
  public abstract long getHistoryBaseTime();
  public abstract int getStartCount();
  public abstract long getScreenOnTime(long arg1, int arg2);
  public abstract long getScreenBrightnessTime(int arg1, long arg2, int arg3);
  public abstract int getInputEventCount(int arg1);
  public abstract long getPhoneOnTime(long arg1, int arg2);
  public abstract long getPhoneSignalStrengthTime(int arg1, long arg2, int arg3);
  public abstract long getPhoneSignalScanningTime(long arg1, int arg2);
  public abstract int getPhoneSignalStrengthCount(int arg1, int arg2);
  public abstract long getPhoneDataConnectionTime(int arg1, long arg2, int arg3);
  public abstract int getPhoneDataConnectionCount(int arg1, int arg2);
  public abstract long getWifiOnTime(long arg1, int arg2);
  public abstract long getGlobalWifiRunningTime(long arg1, int arg2);
  public abstract long getBluetoothOnTime(long arg1, int arg2);
  public abstract boolean getIsOnBattery();
  public abstract android.util.SparseArray<? extends BatteryStats.Uid> getUidStats();
  public abstract long getBatteryUptime(long arg1);
  public long getRadioDataUptimeMs(){
    return 0l;
  }
  public abstract long getRadioDataUptime();
  public abstract long getBatteryRealtime(long arg1);
  public abstract int getDischargeStartLevel();
  public abstract int getDischargeCurrentLevel();
  public abstract int getLowDischargeAmountSinceCharge();
  public abstract int getHighDischargeAmountSinceCharge();
  public abstract int getDischargeAmountScreenOn();
  public abstract int getDischargeAmountScreenOnSinceCharge();
  public abstract int getDischargeAmountScreenOff();
  public abstract int getDischargeAmountScreenOffSinceCharge();
  public abstract long computeBatteryUptime(long arg1, int arg2);
  public abstract long computeBatteryRealtime(long arg1, int arg2);
  public abstract long computeUptime(long arg1, int arg2);
  public abstract long computeRealtime(long arg1, int arg2);
  public abstract java.util.Map<java.lang.String, ? extends BatteryStats.Timer> getKernelWakelockStats();
  public abstract int getCpuSpeedSteps();
  public void prepareForDumpLocked(){
  }
}
