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


public class ScheduledThreadPoolExecutor
  extends ThreadPoolExecutor  implements ScheduledExecutorService
{
  // Constructors

  public ScheduledThreadPoolExecutor(int arg1){
    super(0, 0, 0l, (TimeUnit) null, (BlockingQueue) null);
  }
  public ScheduledThreadPoolExecutor(int arg1, ThreadFactory arg2){
    super(0, 0, 0l, (TimeUnit) null, (BlockingQueue) null);
  }
  public ScheduledThreadPoolExecutor(int arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("RejectedExecutionHandler") RejectedExecutionHandler arg2){
    super(0, 0, 0l, (TimeUnit) null, (BlockingQueue) null);
  }
  public ScheduledThreadPoolExecutor(int arg1, ThreadFactory arg2, @com.francetelecom.rd.stubs.annotation.CallBackRegister("RejectedExecutionHandler") RejectedExecutionHandler arg3){
    super(0, 0, 0l, (TimeUnit) null, (BlockingQueue) null);
  }
  // Methods

  public void shutdown(){
  }
  public void execute(java.lang.Runnable arg1){
  }
  public BlockingQueue<java.lang.Runnable> getQueue(){
    return (BlockingQueue) null;
  }
  public Future<?> submit(java.lang.Runnable arg1){
    return (Future) null;
  }
  public <T>Future<T> submit(@com.francetelecom.rd.stubs.annotation.CallBackRegister("run") java.lang.Runnable arg1, T arg2){
    return (Future) null;
  }
  public <T>Future<T> submit(@com.francetelecom.rd.stubs.annotation.CallBackRegister("call") Callable<T> arg1){
    return (Future) null;
  }
  public ScheduledFuture<?> schedule(@com.francetelecom.rd.stubs.annotation.CallBackRegister("run") java.lang.Runnable arg1, long arg2, TimeUnit arg3){
    return (ScheduledFuture) null;
  }
  public <V>ScheduledFuture<V> schedule(@com.francetelecom.rd.stubs.annotation.CallBackRegister("call") Callable<V> arg1, long arg2, TimeUnit arg3){
    return (ScheduledFuture) null;
  }
  public java.util.List<java.lang.Runnable> shutdownNow(){
    return (java.util.List) null;
  }
  protected <V>RunnableScheduledFuture<V> decorateTask(java.lang.Runnable arg1, RunnableScheduledFuture<V> arg2){
    return (RunnableScheduledFuture) null;
  }
  protected <V>RunnableScheduledFuture<V> decorateTask(Callable<V> arg1, RunnableScheduledFuture<V> arg2){
    return (RunnableScheduledFuture) null;
  }
  public ScheduledFuture<?> scheduleAtFixedRate(@com.francetelecom.rd.stubs.annotation.CallBackRegister("run") java.lang.Runnable arg1, long arg2, long arg3, TimeUnit arg4){
    return (ScheduledFuture) null;
  }
  public ScheduledFuture<?> scheduleWithFixedDelay(@com.francetelecom.rd.stubs.annotation.CallBackRegister("run") java.lang.Runnable arg1, long arg2, long arg3, TimeUnit arg4){
    return (ScheduledFuture) null;
  }
  public void setContinueExistingPeriodicTasksAfterShutdownPolicy(boolean arg1){
  }
  public boolean getContinueExistingPeriodicTasksAfterShutdownPolicy(){
    return false;
  }
  public void setExecuteExistingDelayedTasksAfterShutdownPolicy(boolean arg1){
  }
  public boolean getExecuteExistingDelayedTasksAfterShutdownPolicy(){
    return false;
  }
}
