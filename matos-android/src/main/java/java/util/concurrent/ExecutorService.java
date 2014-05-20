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


public interface ExecutorService
  extends Executor
{
  // Methods

  public void shutdown();
  public boolean awaitTermination(long arg1, TimeUnit arg2) throws java.lang.InterruptedException;
  public <T>Future<T> submit(Callable<T> arg1);
  public <T>Future<T> submit(java.lang.Runnable arg1, T arg2);
  public Future<?> submit(java.lang.Runnable arg1);
  public java.util.List<java.lang.Runnable> shutdownNow();
  public boolean isTerminated();
  public boolean isShutdown();
  public <T>java.util.List<Future<T>> invokeAll(java.util.Collection<? extends Callable<T>> arg1) throws java.lang.InterruptedException;
  public <T>java.util.List<Future<T>> invokeAll(java.util.Collection<? extends Callable<T>> arg1, long arg2, TimeUnit arg3) throws java.lang.InterruptedException;
  public <T>T invokeAny(java.util.Collection<? extends Callable<T>> arg1) throws java.lang.InterruptedException, ExecutionException;
  public <T>T invokeAny(java.util.Collection<? extends Callable<T>> arg1, long arg2, TimeUnit arg3) throws java.lang.InterruptedException, ExecutionException, TimeoutException;
}
