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
public class Process
{
  // Classes

  public static final class ProcessStartResult
  {
    // Fields

    public int pid;

    public boolean usingWrapper;

    // Constructors

    public ProcessStartResult(){
    }
  }
  // Fields

  public static final java.lang.String ANDROID_SHARED_MEDIA = "com.android.process.media";

  public static final java.lang.String GOOGLE_SHARED_APP_CONTENT = "com.google.process.content";

  public static final int SYSTEM_UID = 1000;

  public static final int PHONE_UID = 1001;

  public static final int SHELL_UID = 2000;

  public static final int LOG_UID = 1007;

  public static final int WIFI_UID = 1010;

  public static final int MEDIA_UID = 1013;

  public static final int SDCARD_RW_GID = 1015;

  public static final int NFC_UID = 1025;

  public static final int MEDIA_RW_GID = 1023;

  public static final int FIRST_APPLICATION_UID = 10000;

  public static final int LAST_APPLICATION_UID = 99999;

  public static final int BLUETOOTH_GID = 2000;

  public static final int THREAD_PRIORITY_DEFAULT = 0;

  public static final int THREAD_PRIORITY_LOWEST = 19;

  public static final int THREAD_PRIORITY_BACKGROUND = 10;

  public static final int THREAD_PRIORITY_FOREGROUND = -2;

  public static final int THREAD_PRIORITY_DISPLAY = -4;

  public static final int THREAD_PRIORITY_URGENT_DISPLAY = -8;

  public static final int THREAD_PRIORITY_AUDIO = -16;

  public static final int THREAD_PRIORITY_URGENT_AUDIO = -19;

  public static final int THREAD_PRIORITY_MORE_FAVORABLE = -1;

  public static final int THREAD_PRIORITY_LESS_FAVORABLE = 1;

  public static final int THREAD_GROUP_DEFAULT = 0;

  public static final int THREAD_GROUP_BG_NONINTERACTIVE = 1;

  public static final int THREAD_GROUP_FG_BOOST = 2;

  public static final int SIGNAL_QUIT = 3;

  public static final int SIGNAL_KILL = 9;

  public static final int SIGNAL_USR1 = 10;

  public static final int PROC_TERM_MASK = 255;

  public static final int PROC_ZERO_TERM = 0;

  public static final int PROC_SPACE_TERM = 32;

  public static final int PROC_TAB_TERM = 9;

  public static final int PROC_COMBINE = 256;

  public static final int PROC_PARENS = 512;

  public static final int PROC_OUT_STRING = 4096;

  public static final int PROC_OUT_LONG = 8192;

  public static final int PROC_OUT_FLOAT = 16384;

  // Constructors

  public Process(){
  }
  // Methods

  public static final Process.ProcessStartResult start(java.lang.String arg1, java.lang.String arg2, int arg3, int arg4, int [] arg5, int arg6, int arg7, java.lang.String [] arg8){
    return (Process.ProcessStartResult) null;
  }
  public static final int setUid(int arg1){
    return 0;
  }
  public static final long getPss(int arg1){
    return 0l;
  }
  public static final int myUid(){
    return 0;
  }
  public static final void setThreadPriority(int arg1, int arg2) throws java.lang.IllegalArgumentException, java.lang.SecurityException{
  }
  public static final void setThreadPriority(int arg1) throws java.lang.IllegalArgumentException, java.lang.SecurityException{
  }
  public static final void setCanSelfBackground(boolean arg1){
  }
  public static final int myTid(){
    return 0;
  }
  public static final int myPid(){
    return 0;
  }
  public static final void killProcess(int arg1){
  }
  public static final void setArgV0(java.lang.String arg1){
  }
  public static final boolean readProcFile(java.lang.String arg1, int [] arg2, java.lang.String [] arg3, long [] arg4, float [] arg5){
    return false;
  }
  public static final int [] getPids(java.lang.String arg1, int [] arg2){
    return (int []) null;
  }
  public static final int getThreadPriority(int arg1) throws java.lang.IllegalArgumentException{
    return 0;
  }
  public static final int getUidForName(java.lang.String arg1){
    return 0;
  }
  public static final int getGidForName(java.lang.String arg1){
    return 0;
  }
  public static final int getParentPid(int arg1){
    return 0;
  }
  public static final long getElapsedCpuTime(){
    return 0l;
  }
  public static final int getUidForPid(int arg1){
    return 0;
  }
  public static final void setThreadGroup(int arg1, int arg2) throws java.lang.IllegalArgumentException, java.lang.SecurityException{
  }
  public static final void setProcessGroup(int arg1, int arg2) throws java.lang.IllegalArgumentException, java.lang.SecurityException{
  }
  public static final boolean supportsProcesses(){
    return false;
  }
  public static final boolean setOomAdj(int arg1, int arg2){
    return false;
  }
  public static final int setGid(int arg1){
    return 0;
  }
  public static final void sendSignal(int arg1, int arg2){
  }
  public static final void killProcessQuiet(int arg1){
  }
  public static final void sendSignalQuiet(int arg1, int arg2){
  }
  public static final long getFreeMemory(){
    return 0l;
  }
  public static final void readProcLines(java.lang.String arg1, java.lang.String [] arg2, long [] arg3){
  }
  public static final boolean parseProcLine(byte [] arg1, int arg2, int arg3, int [] arg4, java.lang.String [] arg5, long [] arg6, float [] arg7){
    return false;
  }
}
