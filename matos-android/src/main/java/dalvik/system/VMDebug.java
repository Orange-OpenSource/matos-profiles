package dalvik.system;

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


public final class VMDebug
{
  // Fields

  public static final java.lang.String DEFAULT_METHOD_TRACE_FILE_NAME = "/sdcard/dmtrace.trace";

  public static final int TRACE_COUNT_ALLOCS = 1;

  public static final int KIND_GLOBAL_ALLOCATED_OBJECTS = 1;

  public static final int KIND_GLOBAL_ALLOCATED_BYTES = 2;

  public static final int KIND_GLOBAL_FREED_OBJECTS = 4;

  public static final int KIND_GLOBAL_FREED_BYTES = 8;

  public static final int KIND_GLOBAL_GC_INVOCATIONS = 16;

  public static final int KIND_GLOBAL_CLASS_INIT_COUNT = 32;

  public static final int KIND_GLOBAL_CLASS_INIT_TIME = 64;

  public static final int KIND_GLOBAL_EXT_ALLOCATED_OBJECTS = 4096;

  public static final int KIND_GLOBAL_EXT_ALLOCATED_BYTES = 8192;

  public static final int KIND_GLOBAL_EXT_FREED_OBJECTS = 16384;

  public static final int KIND_GLOBAL_EXT_FREED_BYTES = 32768;

  public static final int KIND_THREAD_ALLOCATED_OBJECTS = 65536;

  public static final int KIND_THREAD_ALLOCATED_BYTES = 131072;

  public static final int KIND_THREAD_FREED_OBJECTS = 262144;

  public static final int KIND_THREAD_FREED_BYTES = 524288;

  public static final int KIND_THREAD_GC_INVOCATIONS = 1048576;

  public static final int KIND_THREAD_CLASS_INIT_COUNT = 2097152;

  public static final int KIND_THREAD_CLASS_INIT_TIME = 4194304;

  public static final int KIND_THREAD_EXT_ALLOCATED_OBJECTS = 268435456;

  public static final int KIND_THREAD_EXT_ALLOCATED_BYTES = 536870912;

  public static final int KIND_THREAD_EXT_FREED_OBJECTS = 1073741824;

  public static final int KIND_THREAD_EXT_FREED_BYTES = -2147483648;

  public static final int KIND_ALL_COUNTS = -1;

  // Constructors

  private VMDebug(){
  }
  // Methods

  public static void crash(){
  }
  public static void startAllocCounting(){
  }
  public static void stopAllocCounting(){
  }
  public static void startInstructionCounting(){
  }
  public static void resetInstructionCount(){
  }
  public static void stopInstructionCounting(){
  }
  public static void getInstructionCount(int [] arg1){
  }
  public static long countInstancesOfClass(java.lang.Class arg1, boolean arg2){
    return 0l;
  }
  public static void startMethodTracing(){
  }
  public static void startMethodTracing(java.lang.String arg1, int arg2, int arg3){
  }
  public static void startMethodTracing(java.lang.String arg1, java.io.FileDescriptor arg2, int arg3, int arg4){
  }
  public static void stopMethodTracing(){
  }
  public static long lastDebuggerActivity(){
    return 0l;
  }
  public static boolean isDebuggingEnabled(){
    return false;
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
  public static void startEmulatorTracing(){
  }
  public static void stopEmulatorTracing(){
  }
  public static long threadCpuTimeNanos(){
    return 0l;
  }
  public static int getAllocCount(int arg1){
    return 0;
  }
  public static void resetAllocCount(int arg1){
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
  public static boolean cacheRegisterMap(java.lang.String arg1){
    return false;
  }
  public static void dumpReferenceTables(){
  }
  public static void infopoint(int arg1){
  }
}
