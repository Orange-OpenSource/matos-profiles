package java.util.concurrent;

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


public class ThreadPoolExecutor
  extends AbstractExecutorService{
  // Classes

  public static class CallerRunsPolicy
    implements RejectedExecutionHandler
  {
    // Constructors

    public CallerRunsPolicy(){
    }
    // Methods

    public void rejectedExecution(java.lang.Runnable arg1, ThreadPoolExecutor arg2){
    }
  }
  public static class AbortPolicy
    implements RejectedExecutionHandler
  {
    // Constructors

    public AbortPolicy(){
    }
    // Methods

    public void rejectedExecution(java.lang.Runnable arg1, ThreadPoolExecutor arg2){
    }
  }
  public static class DiscardPolicy
    implements RejectedExecutionHandler
  {
    // Constructors

    public DiscardPolicy(){
    }
    // Methods

    public void rejectedExecution(java.lang.Runnable arg1, ThreadPoolExecutor arg2){
    }
  }
  public static class DiscardOldestPolicy
    implements RejectedExecutionHandler
  {
    // Constructors

    public DiscardOldestPolicy(){
    }
    // Methods

    public void rejectedExecution(java.lang.Runnable arg1, ThreadPoolExecutor arg2){
    }
  }
  // Constructors

  public ThreadPoolExecutor(int arg1, int arg2, long arg3, TimeUnit arg4, BlockingQueue<java.lang.Runnable> arg5){
    super();
  }
  public ThreadPoolExecutor(int arg1, int arg2, long arg3, TimeUnit arg4, BlockingQueue<java.lang.Runnable> arg5, ThreadFactory arg6){
    super();
  }
  public ThreadPoolExecutor(int arg1, int arg2, long arg3, TimeUnit arg4, BlockingQueue<java.lang.Runnable> arg5, @com.francetelecom.rd.stubs.annotation.CallBackRegister("RejectedExecutionHandler") RejectedExecutionHandler arg6){
    super();
  }
  public ThreadPoolExecutor(int arg1, int arg2, long arg3, TimeUnit arg4, BlockingQueue<java.lang.Runnable> arg5, ThreadFactory arg6, @com.francetelecom.rd.stubs.annotation.CallBackRegister("RejectedExecutionHandler") RejectedExecutionHandler arg7){
    super();
  }
  // Methods

  public void shutdown(){
  }
  protected void finalize(){
  }
  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public boolean remove(java.lang.Runnable arg1){
    return false;
  }
  public boolean awaitTermination(long arg1, TimeUnit arg2) throws java.lang.InterruptedException{
    return false;
  }
  public void execute(java.lang.Runnable arg1){
  }
  public BlockingQueue<java.lang.Runnable> getQueue(){
    return (BlockingQueue) null;
  }
  public java.util.List<java.lang.Runnable> shutdownNow(){
    return (java.util.List) null;
  }
  public boolean isTerminated(){
    return false;
  }
  public boolean isShutdown(){
    return false;
  }
  public void purge(){
  }
  public ThreadFactory getThreadFactory(){
    return (ThreadFactory) null;
  }
  public boolean prestartCoreThread(){
    return false;
  }
  public void allowCoreThreadTimeOut(boolean arg1){
  }
  public boolean isTerminating(){
    return false;
  }
  public void setThreadFactory(ThreadFactory arg1){
  }
  public void setRejectedExecutionHandler(@com.francetelecom.rd.stubs.annotation.CallBackRegister("RejectedExecutionHandler") RejectedExecutionHandler arg1){
  }
  public RejectedExecutionHandler getRejectedExecutionHandler(){
    return (RejectedExecutionHandler) null;
  }
  public void setCorePoolSize(int arg1){
  }
  public int getCorePoolSize(){
    return 0;
  }
  public int prestartAllCoreThreads(){
    return 0;
  }
  public boolean allowsCoreThreadTimeOut(){
    return false;
  }
  public void setMaximumPoolSize(int arg1){
  }
  public int getMaximumPoolSize(){
    return 0;
  }
  public void setKeepAliveTime(long arg1, TimeUnit arg2){
  }
  public long getKeepAliveTime(TimeUnit arg1){
    return 0l;
  }
  public int getPoolSize(){
    return 0;
  }
  public int getActiveCount(){
    return 0;
  }
  public int getLargestPoolSize(){
    return 0;
  }
  public long getTaskCount(){
    return 0l;
  }
  public long getCompletedTaskCount(){
    return 0l;
  }
  protected void beforeExecute(java.lang.Thread arg1, java.lang.Runnable arg2){
  }
  protected void afterExecute(java.lang.Runnable arg1, java.lang.Throwable arg2){
  }
  protected void terminated(){
  }
}
