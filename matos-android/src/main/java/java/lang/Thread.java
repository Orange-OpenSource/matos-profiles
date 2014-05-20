package java.lang;

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


public class Thread
  implements Runnable
{
  // Classes

  public static enum State
  {
    // Enum Constants

    NEW()
, RUNNABLE()
, BLOCKED()
, WAITING()
, TIMED_WAITING()
, TERMINATED()
;
    // Fields

    // Constructors

    private State(){
    }
    // Methods

  }
  public static interface UncaughtExceptionHandler
  {
    // Methods
	@com.francetelecom.rd.stubs.annotation.CallBack("UncaughtExceptionHandler")
    public void uncaughtException(Thread arg1, Throwable arg2);
  }
  // Fields

  public static final int MAX_PRIORITY = 10;

  public static final int MIN_PRIORITY = 1;

  public static final int NORM_PRIORITY = 5;

  // Constructors

  @com.francetelecom.rd.stubs.annotation.Code("runnable = this;")
  public Thread(){
  }
  public Thread(@com.francetelecom.rd.stubs.annotation.FieldSet("runnable") Runnable arg1){
  }
  public Thread(@com.francetelecom.rd.stubs.annotation.FieldSet("runnable") Runnable arg1, String arg2){
  }
  @com.francetelecom.rd.stubs.annotation.Code("runnable = this;")
  public Thread(String arg1){
  }
  public Thread(ThreadGroup arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("runnable") Runnable arg2){
  }
  public Thread(ThreadGroup arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("runnable") Runnable arg2, String arg3){
  }
  @com.francetelecom.rd.stubs.annotation.Code("runnable = this;")
  public Thread(ThreadGroup arg1, String arg2){
  }
  public Thread(ThreadGroup arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("runnable") Runnable arg2, String arg3, long arg4){
  }
  @com.francetelecom.rd.stubs.annotation.Code("runnable = this;")
  Thread(ThreadGroup arg1, String arg2, int arg3, boolean arg4){
  }
  // Methods

  public void run(){
  }
  public String toString(){
    return (String) null;
  }
  public boolean isInterrupted(){
    return false;
  }
  public static Thread currentThread(){
    return (Thread) null;
  }
  public void unpark(){
  }
  public final String getName(){
    return (String) null;
  }
  public final ThreadGroup getThreadGroup(){
    return (ThreadGroup) null;
  }
  public StackTraceElement [] getStackTrace(){
    return (StackTraceElement []) null;
  }
  public static void dumpStack(){
  }
  public final void setDaemon(boolean arg1){
  }
  public final void setPriority(int arg1){
  }
  @com.francetelecom.rd.stubs.annotation.Code("runnable.run();")
  public synchronized void start(){
  }
  public static int activeCount(){
    return 0;
  }
  public final void checkAccess(){
  }
  public int countStackFrames(){
    return 0;
  }
  public void destroy(){
  }
  public static int enumerate(Thread [] arg1){
    return 0;
  }
  public static java.util.Map<Thread, StackTraceElement []> getAllStackTraces(){
    return (java.util.Map) null;
  }
  public ClassLoader getContextClassLoader(){
    return (ClassLoader) null;
  }
  public static Thread.UncaughtExceptionHandler getDefaultUncaughtExceptionHandler(){
    return (Thread.UncaughtExceptionHandler) null;
  }
  public long getId(){
    return 0l;
  }
  public final int getPriority(){
    return 0;
  }
  public Thread.State getState(){
    return (Thread.State) null;
  }
  public Thread.UncaughtExceptionHandler getUncaughtExceptionHandler(){
    return (Thread.UncaughtExceptionHandler) null;
  }
  public static boolean holdsLock(Object arg1){
    return false;
  }
  public void interrupt(){
  }
  public static boolean interrupted(){
    return false;
  }
  public final boolean isAlive(){
    return false;
  }
  public final boolean isDaemon(){
    return false;
  }
  public final void join() throws InterruptedException{
  }
  public final void join(long arg1) throws InterruptedException{
  }
  public final void join(long arg1, int arg2) throws InterruptedException{
  }
  public final void resume(){
  }
  public void setContextClassLoader(ClassLoader arg1){
  }
  public static void setDefaultUncaughtExceptionHandler(@com.francetelecom.rd.stubs.annotation.CallBackRegister("UncaughtExceptionHandler") Thread.UncaughtExceptionHandler arg1){
  }
  public final void setName(String arg1){
  }
  public void setUncaughtExceptionHandler(@com.francetelecom.rd.stubs.annotation.CallBackRegister("UncaughtExceptionHandler") Thread.UncaughtExceptionHandler arg1){
  }
  public static void sleep(long arg1) throws InterruptedException{
  }
  public static void sleep(long arg1, int arg2) throws InterruptedException{
  }
  public final void stop(){
  }
  public final synchronized void stop(Throwable arg1){
  }
  public final void suspend(){
  }
  public static void yield(){
  }
  public final void pushInterruptAction$(@com.francetelecom.rd.stubs.annotation.CallBackRegister("run") Runnable arg1){
  }
  public final void popInterruptAction$(Runnable arg1){
  }
  public void parkFor(long arg1){
  }
  public void parkUntil(long arg1){
  }
}
