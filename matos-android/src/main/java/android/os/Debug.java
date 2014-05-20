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
public final class Debug
{
  // Classes

  public static class MemoryInfo
    implements Parcelable
  {
    // Fields

    public int dalvikPss;

    public int dalvikPrivateDirty;

    public int dalvikSharedDirty;

    public int nativePss;

    public int nativePrivateDirty;

    public int nativeSharedDirty;

    public int otherPss;

    public int otherPrivateDirty;

    public int otherSharedDirty;

    public static final int NUM_OTHER_STATS = 9;

    public static final Parcelable.Creator<Debug.MemoryInfo> CREATOR = null;

    // Constructors

    public MemoryInfo(){
    }
    private MemoryInfo(Parcel arg1){
    }
    // Methods

    public void writeToParcel(Parcel arg1, int arg2){
    }
    public int describeContents(){
      return 0;
    }
    public void readFromParcel(Parcel arg1){
    }
    public int getTotalPss(){
      return 0;
    }
    public int getTotalPrivateDirty(){
      return 0;
    }
    public int getTotalSharedDirty(){
      return 0;
    }
    public int getOtherPss(int arg1){
      return 0;
    }
    public int getOtherPrivateDirty(int arg1){
      return 0;
    }
    public int getOtherSharedDirty(int arg1){
      return 0;
    }
    public static java.lang.String getOtherLabel(int arg1){
      return (java.lang.String) null;
    }
  }
  public static class InstructionCount
  {
    // Constructors

    public InstructionCount(){
    }
    // Methods

    public boolean resetAndStart(){
      return false;
    }
    public boolean collect(){
      return false;
    }
    public int globalTotal(){
      return 0;
    }
    public int globalMethodInvocations(){
      return 0;
    }
  }
  public static @interface DebugProperty
  {
  }
  // Fields

  public static final int TRACE_COUNT_ALLOCS = 1;

  public static final int SHOW_FULL_DETAIL = 1;

  public static final int SHOW_CLASSLOADER = 2;

  public static final int SHOW_INITIALIZED = 4;

  // Constructors

  private Debug(){
  }
  // Methods

  public static boolean dumpService(java.lang.String arg1, java.io.FileDescriptor arg2, java.lang.String [] arg3){
    return false;
  }
  public static void getMemoryInfo(Debug.MemoryInfo arg1){
  }
  public static void getMemoryInfo(int arg1, Debug.MemoryInfo arg2){
  }
  public static void startAllocCounting(){
  }
  public static void stopAllocCounting(){
  }
  public static long countInstancesOfClass(java.lang.Class arg1){
    return 0l;
  }
  public static void startMethodTracing(){
  }
  public static void startMethodTracing(java.lang.String arg1){
  }
  public static void startMethodTracing(java.lang.String arg1, int arg2){
  }
  public static void startMethodTracing(java.lang.String arg1, int arg2, int arg3){
  }
  public static void startMethodTracing(java.lang.String arg1, java.io.FileDescriptor arg2, int arg3, int arg4){
  }
  public static void stopMethodTracing(){
  }
  public static boolean isDebuggerConnected(){
    return false;
  }
  public static java.lang.String [] getVmFeatureList(){
    return (java.lang.String []) null;
  }
  public static void startMethodTracingDdms(int arg1, int arg2){
  }
  public static boolean isMethodTracingActive(){
    return false;
  }
  public static long threadCpuTimeNanos(){
    return 0l;
  }
  public static int setAllocationLimit(int arg1){
    return 0;
  }
  public static int setGlobalAllocationLimit(int arg1){
    return 0;
  }
  public static void printLoadedClasses(int arg1){
  }
  public static int getLoadedClassCount(){
    return 0;
  }
  public static void dumpHprofData(java.lang.String arg1) throws java.io.IOException{
  }
  public static void dumpHprofData(java.lang.String arg1, java.io.FileDescriptor arg2) throws java.io.IOException{
  }
  public static void dumpHprofDataDdms(){
  }
  public static final boolean cacheRegisterMap(java.lang.String arg1){
    return false;
  }
  public static final void dumpReferenceTables(){
  }
  public static void waitForDebugger(){
  }
  public static void resetAllCounts(){
  }
  public static int getGlobalAllocCount(){
    return 0;
  }
  public static int getGlobalAllocSize(){
    return 0;
  }
  public static int getGlobalFreedCount(){
    return 0;
  }
  public static int getGlobalFreedSize(){
    return 0;
  }
  public static int getGlobalGcInvocationCount(){
    return 0;
  }
  public static int getBinderSentTransactions(){
    return 0;
  }
  public static int getBinderReceivedTransactions(){
    return 0;
  }
  public static void enableEmulatorTraceOutput(){
  }
  public static boolean waitingForDebugger(){
    return false;
  }
  public static void changeDebugPort(int arg1){
  }
  public static void startNativeTracing(){
  }
  public static void stopNativeTracing(){
  }
  public static int getGlobalClassInitCount(){
    return 0;
  }
  public static int getGlobalClassInitTime(){
    return 0;
  }
  public static int getGlobalExternalAllocCount(){
    return 0;
  }
  public static int getGlobalExternalAllocSize(){
    return 0;
  }
  public static int getGlobalExternalFreedCount(){
    return 0;
  }
  public static int getGlobalExternalFreedSize(){
    return 0;
  }
  public static int getThreadAllocCount(){
    return 0;
  }
  public static int getThreadAllocSize(){
    return 0;
  }
  public static int getThreadExternalAllocCount(){
    return 0;
  }
  public static int getThreadExternalAllocSize(){
    return 0;
  }
  public static int getThreadGcInvocationCount(){
    return 0;
  }
  public static void resetGlobalAllocCount(){
  }
  public static void resetGlobalAllocSize(){
  }
  public static void resetGlobalFreedCount(){
  }
  public static void resetGlobalFreedSize(){
  }
  public static void resetGlobalClassInitCount(){
  }
  public static void resetGlobalClassInitTime(){
  }
  public static void resetGlobalExternalAllocCount(){
  }
  public static void resetGlobalExternalAllocSize(){
  }
  public static void resetGlobalExternalFreedCount(){
  }
  public static void resetGlobalExternalFreedSize(){
  }
  public static void resetGlobalGcInvocationCount(){
  }
  public static void resetThreadAllocCount(){
  }
  public static void resetThreadAllocSize(){
  }
  public static void resetThreadExternalAllocCount(){
  }
  public static void resetThreadExternalAllocSize(){
  }
  public static void resetThreadGcInvocationCount(){
  }
  public static long getNativeHeapSize(){
    return 0l;
  }
  public static long getNativeHeapAllocatedSize(){
    return 0l;
  }
  public static long getNativeHeapFreeSize(){
    return 0l;
  }
  public static long getPss(){
    return 0l;
  }
  public static long getPss(int arg1){
    return 0l;
  }
  public static void dumpNativeHeap(java.io.FileDescriptor arg1){
  }
  public static final int getBinderLocalObjectCount(){
    return 0;
  }
  public static final int getBinderProxyObjectCount(){
    return 0;
  }
  public static final int getBinderDeathObjectCount(){
    return 0;
  }
  public static void setFieldsOn(java.lang.Class<?> arg1){
  }
  public static void setFieldsOn(java.lang.Class<?> arg1, boolean arg2){
  }
}
