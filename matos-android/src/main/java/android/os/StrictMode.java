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


public final class StrictMode
{
  // Classes

  public static final class ThreadPolicy
  {
    // Classes

    public static final class Builder
    {
      // Constructors

      public Builder(){
      }
      public Builder(StrictMode.ThreadPolicy arg1){
      }
      // Methods

      public StrictMode.ThreadPolicy build(){
        return (StrictMode.ThreadPolicy) null;
      }
      public StrictMode.ThreadPolicy.Builder detectAll(){
        return (StrictMode.ThreadPolicy.Builder) null;
      }
      public StrictMode.ThreadPolicy.Builder penaltyDeath(){
        return (StrictMode.ThreadPolicy.Builder) null;
      }
      public StrictMode.ThreadPolicy.Builder penaltyLog(){
        return (StrictMode.ThreadPolicy.Builder) null;
      }
      public StrictMode.ThreadPolicy.Builder penaltyDropBox(){
        return (StrictMode.ThreadPolicy.Builder) null;
      }
      public StrictMode.ThreadPolicy.Builder permitAll(){
        return (StrictMode.ThreadPolicy.Builder) null;
      }
      public StrictMode.ThreadPolicy.Builder detectNetwork(){
        return (StrictMode.ThreadPolicy.Builder) null;
      }
      public StrictMode.ThreadPolicy.Builder permitNetwork(){
        return (StrictMode.ThreadPolicy.Builder) null;
      }
      public StrictMode.ThreadPolicy.Builder detectDiskReads(){
        return (StrictMode.ThreadPolicy.Builder) null;
      }
      public StrictMode.ThreadPolicy.Builder permitDiskReads(){
        return (StrictMode.ThreadPolicy.Builder) null;
      }
      public StrictMode.ThreadPolicy.Builder detectCustomSlowCalls(){
        return (StrictMode.ThreadPolicy.Builder) null;
      }
      public StrictMode.ThreadPolicy.Builder permitCustomSlowCalls(){
        return (StrictMode.ThreadPolicy.Builder) null;
      }
      public StrictMode.ThreadPolicy.Builder detectDiskWrites(){
        return (StrictMode.ThreadPolicy.Builder) null;
      }
      public StrictMode.ThreadPolicy.Builder permitDiskWrites(){
        return (StrictMode.ThreadPolicy.Builder) null;
      }
      public StrictMode.ThreadPolicy.Builder penaltyDialog(){
        return (StrictMode.ThreadPolicy.Builder) null;
      }
      public StrictMode.ThreadPolicy.Builder penaltyDeathOnNetwork(){
        return (StrictMode.ThreadPolicy.Builder) null;
      }
      public StrictMode.ThreadPolicy.Builder penaltyFlashScreen(){
        return (StrictMode.ThreadPolicy.Builder) null;
      }
    }
    // Fields

    public static final StrictMode.ThreadPolicy LAX = null;

    // Constructors

    private ThreadPolicy(int arg1){
    }
    // Methods

    public java.lang.String toString(){
      return (java.lang.String) null;
    }
  }
  public static final class VmPolicy
  {
    // Classes

    public static final class Builder
    {
      // Constructors

      public Builder(){
      }
      public Builder(StrictMode.VmPolicy arg1){
      }
      // Methods

      public StrictMode.VmPolicy build(){
        return (StrictMode.VmPolicy) null;
      }
      public StrictMode.VmPolicy.Builder setClassInstanceLimit(java.lang.Class arg1, int arg2){
        return (StrictMode.VmPolicy.Builder) null;
      }
      public StrictMode.VmPolicy.Builder detectActivityLeaks(){
        return (StrictMode.VmPolicy.Builder) null;
      }
      public StrictMode.VmPolicy.Builder detectAll(){
        return (StrictMode.VmPolicy.Builder) null;
      }
      public StrictMode.VmPolicy.Builder detectLeakedSqlLiteObjects(){
        return (StrictMode.VmPolicy.Builder) null;
      }
      public StrictMode.VmPolicy.Builder detectLeakedClosableObjects(){
        return (StrictMode.VmPolicy.Builder) null;
      }
      public StrictMode.VmPolicy.Builder penaltyDeath(){
        return (StrictMode.VmPolicy.Builder) null;
      }
      public StrictMode.VmPolicy.Builder penaltyLog(){
        return (StrictMode.VmPolicy.Builder) null;
      }
      public StrictMode.VmPolicy.Builder penaltyDropBox(){
        return (StrictMode.VmPolicy.Builder) null;
      }
    }
    // Fields

    public static final StrictMode.VmPolicy LAX = null;

    // Constructors

    private VmPolicy(int arg1, java.util.HashMap<java.lang.Class, java.lang.Integer> arg2){
    }
    // Methods

    public java.lang.String toString(){
      return (java.lang.String) null;
    }
  }
  public static class StrictModeViolation
    extends dalvik.system.BlockGuard.BlockGuardPolicyException  {
    // Constructors

    public StrictModeViolation(int arg1, int arg2, java.lang.String arg3){
      super(0, 0);
    }
  }
  public static class StrictModeNetworkViolation
    extends StrictMode.StrictModeViolation  {
    // Constructors

    public StrictModeNetworkViolation(int arg1){
      super(0, 0, (java.lang.String) null);
    }
  }
  public static class Span
  {
    // Constructors

    protected Span(){
    }
    // Methods

    public void finish(){
    }
  }
  public static class ViolationInfo
  {
    // Fields

    public final android.app.ApplicationErrorReport.CrashInfo crashInfo = (android.app.ApplicationErrorReport.CrashInfo) null;

    public final int policy = 0;

    public int durationMillis;

    public int numAnimationsRunning;

    public java.lang.String [] tags;

    public int violationNumThisLoop;

    public long violationUptimeMillis;

    public java.lang.String broadcastIntentAction;

    public long numInstances;

    // Constructors

    public ViolationInfo(){
    }
    public ViolationInfo(java.lang.Throwable arg1, int arg2){
    }
    public ViolationInfo(Parcel arg1){
    }
    public ViolationInfo(Parcel arg1, boolean arg2){
    }
    // Methods

    public int hashCode(){
      return 0;
    }
    public void dump(android.util.Printer arg1, java.lang.String arg2){
    }
    public void writeToParcel(Parcel arg1, int arg2){
    }
  }
  // Fields

  public static final java.lang.String VISUAL_PROPERTY = "persist.sys.strictmode.visual";

  public static final int DETECT_DISK_WRITE = 1;

  public static final int DETECT_DISK_READ = 2;

  public static final int DETECT_NETWORK = 4;

  public static final int DETECT_CUSTOM = 8;

  public static final int DETECT_VM_CURSOR_LEAKS = 512;

  public static final int DETECT_VM_CLOSABLE_LEAKS = 1024;

  public static final int DETECT_VM_ACTIVITY_LEAKS = 2048;

  public static final int PENALTY_LOG = 16;

  public static final int PENALTY_DIALOG = 32;

  public static final int PENALTY_DEATH = 64;

  public static final int PENALTY_DEATH_ON_NETWORK = 512;

  public static final int PENALTY_FLASH = 2048;

  public static final int PENALTY_DROPBOX = 128;

  public static final int PENALTY_GATHER = 256;

  // Constructors

  private StrictMode(){
  }
  // Methods

  public static java.lang.Object trackActivity(java.lang.Object arg1){
    return (java.lang.Object) null;
  }
  public static StrictMode.ThreadPolicy getThreadPolicy(){
    return (StrictMode.ThreadPolicy) null;
  }
  public static boolean conditionallyEnableDebugLogging(){
    return false;
  }
  public static void onWebViewMethodCalledOnWrongThread(java.lang.Throwable arg1){
  }
  public static void noteDiskRead(){
  }
  public static void setThreadPolicy(StrictMode.ThreadPolicy arg1){
  }
  public static int getThreadPolicyMask(){
    return 0;
  }
  public static StrictMode.ThreadPolicy allowThreadDiskWrites(){
    return (StrictMode.ThreadPolicy) null;
  }
  public static StrictMode.ThreadPolicy allowThreadDiskReads(){
    return (StrictMode.ThreadPolicy) null;
  }
  public static void enableDeathOnNetwork(){
  }
  public static void conditionallyCheckInstanceCounts(){
  }
  public static void setVmPolicy(StrictMode.VmPolicy arg1){
  }
  public static StrictMode.VmPolicy getVmPolicy(){
    return (StrictMode.VmPolicy) null;
  }
  public static void enableDefaults(){
  }
  public static boolean vmSqliteObjectLeaksEnabled(){
    return false;
  }
  public static boolean vmClosableObjectLeaksEnabled(){
    return false;
  }
  public static void onSqliteObjectLeaked(java.lang.String arg1, java.lang.Throwable arg2){
  }
  public static void onVmPolicyViolation(java.lang.String arg1, java.lang.Throwable arg2){
  }
  public static StrictMode.Span enterCriticalSpan(java.lang.String arg1){
    return (StrictMode.Span) null;
  }
  public static void noteSlowCall(java.lang.String arg1){
  }
  public static void noteDiskWrite(){
  }
  public static void incrementExpectedActivityCount(java.lang.Class arg1){
  }
  public static void decrementExpectedActivityCount(java.lang.Class arg1){
  }
}
