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
public class ApplicationErrorReport
  implements android.os.Parcelable
{
  // Classes

  public static class CrashInfo
  {
    // Fields

    public java.lang.String exceptionClassName;

    public java.lang.String exceptionMessage;

    public java.lang.String throwFileName;

    public java.lang.String throwClassName;

    public java.lang.String throwMethodName;

    public int throwLineNumber;

    public java.lang.String stackTrace;

    // Constructors

    public CrashInfo(){
    }
    public CrashInfo(java.lang.Throwable arg1){
    }
    public CrashInfo(android.os.Parcel arg1){
    }
    // Methods

    public void dump(android.util.Printer arg1, java.lang.String arg2){
    }
    public void writeToParcel(android.os.Parcel arg1, int arg2){
    }
  }
  public static class AnrInfo
  {
    // Fields

    public java.lang.String activity;

    public java.lang.String cause;

    public java.lang.String info;

    // Constructors

    public AnrInfo(){
    }
    public AnrInfo(android.os.Parcel arg1){
    }
    // Methods

    public void dump(android.util.Printer arg1, java.lang.String arg2){
    }
    public void writeToParcel(android.os.Parcel arg1, int arg2){
    }
  }
  public static class BatteryInfo
  {
    // Fields

    public int usagePercent;

    public long durationMicros;

    public java.lang.String usageDetails;

    public java.lang.String checkinDetails;

    // Constructors

    public BatteryInfo(){
    }
    public BatteryInfo(android.os.Parcel arg1){
    }
    // Methods

    public void dump(android.util.Printer arg1, java.lang.String arg2){
    }
    public void writeToParcel(android.os.Parcel arg1, int arg2){
    }
  }
  public static class RunningServiceInfo
  {
    // Fields

    public long durationMillis;

    public java.lang.String serviceDetails;

    // Constructors

    public RunningServiceInfo(){
    }
    public RunningServiceInfo(android.os.Parcel arg1){
    }
    // Methods

    public void dump(android.util.Printer arg1, java.lang.String arg2){
    }
    public void writeToParcel(android.os.Parcel arg1, int arg2){
    }
  }
  // Fields

  public static final int TYPE_NONE = 0;

  public static final int TYPE_CRASH = 1;

  public static final int TYPE_ANR = 2;

  public static final int TYPE_BATTERY = 3;

  public static final int TYPE_RUNNING_SERVICE = 5;

  public int type;

  public java.lang.String packageName;

  public java.lang.String installerPackageName;

  public java.lang.String processName;

  public long time;

  public boolean systemApp;

  public ApplicationErrorReport.CrashInfo crashInfo;

  public ApplicationErrorReport.AnrInfo anrInfo;

  public ApplicationErrorReport.BatteryInfo batteryInfo;

  public ApplicationErrorReport.RunningServiceInfo runningServiceInfo;

  public static final android.os.Parcelable.Creator<ApplicationErrorReport> CREATOR = null;

  // Constructors

  public ApplicationErrorReport(){
  }
  ApplicationErrorReport(android.os.Parcel arg1){
  }
  // Methods

  public void dump(android.util.Printer arg1, java.lang.String arg2){
  }
  public void writeToParcel(android.os.Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
  public void readFromParcel(android.os.Parcel arg1){
  }
  public static android.content.ComponentName getErrorReportReceiver(android.content.Context arg1, java.lang.String arg2, int arg3){
    return (android.content.ComponentName) null;
  }
}
