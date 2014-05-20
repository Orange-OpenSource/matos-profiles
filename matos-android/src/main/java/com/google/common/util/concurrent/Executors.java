package com.google.common.util.concurrent;

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


public class Executors
{
  // Constructors

  public Executors(){
  }
  // Methods

  public static java.util.concurrent.ExecutorService sameThreadExecutor(){
    return (java.util.concurrent.ExecutorService) null;
  }
  public static java.util.concurrent.ExecutorService getExitingExecutorService(java.util.concurrent.ThreadPoolExecutor arg1, long arg2, java.util.concurrent.TimeUnit arg3){
    return (java.util.concurrent.ExecutorService) null;
  }
  public static java.util.concurrent.ExecutorService getExitingExecutorService(java.util.concurrent.ThreadPoolExecutor arg1){
    return (java.util.concurrent.ExecutorService) null;
  }
  public static java.util.concurrent.ScheduledExecutorService getExitingScheduledExecutorService(java.util.concurrent.ScheduledThreadPoolExecutor arg1, long arg2, java.util.concurrent.TimeUnit arg3){
    return (java.util.concurrent.ScheduledExecutorService) null;
  }
  public static java.util.concurrent.ScheduledExecutorService getExitingScheduledExecutorService(java.util.concurrent.ScheduledThreadPoolExecutor arg1){
    return (java.util.concurrent.ScheduledExecutorService) null;
  }
  public static void addDelayedShutdownHook(java.util.concurrent.ExecutorService arg1, long arg2, java.util.concurrent.TimeUnit arg3){
  }
  public static java.util.concurrent.ThreadFactory daemonThreadFactory(){
    return (java.util.concurrent.ThreadFactory) null;
  }
  public static java.util.concurrent.ThreadFactory daemonThreadFactory(java.util.concurrent.ThreadFactory arg1){
    return (java.util.concurrent.ThreadFactory) null;
  }
}
