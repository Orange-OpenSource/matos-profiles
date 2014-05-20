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


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public abstract class AbstractExecutorService
  implements ExecutorService
{
  // Constructors

  public AbstractExecutorService(){
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.Code("return new FutureTask(arg1, null);")
  public Future<?> submit(java.lang.Runnable arg1){
    return (Future) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return new FutureTask<T>(arg1,arg2);")
  public <T>Future<T> submit(java.lang.Runnable arg1, T arg2){
    return (Future) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return new FutureTask<T>(arg1);")
  public <T>Future<T> submit(Callable<T> arg1){
    return (Future) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code({"java.util.List<Future<T>> r = new java.util.LinkedList<Future<T>>();", "r.add(new FutureTask<T>(arg1.iterator().next()));", "return r;"})
  public <T>java.util.List<Future<T>> invokeAll(java.util.Collection<? extends Callable<T>> arg1) throws java.lang.InterruptedException{
    return (java.util.List) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code({"java.util.List<Future<T>> r = new java.util.LinkedList<Future<T>>();", "r.add(new FutureTask<T>(arg1.iterator().next()));", "return r;"})
  public <T>java.util.List<Future<T>> invokeAll(java.util.Collection<? extends Callable<T>> arg1, long arg2, TimeUnit arg3) throws java.lang.InterruptedException{
    return (java.util.List) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return new FutureTask<T>(arg1.iterator().next()).get();")
  public <T>T invokeAny(java.util.Collection<? extends Callable<T>> arg1) throws java.lang.InterruptedException, ExecutionException{
    return null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return new FutureTask<T>(arg1.iterator().next()).get();")
  public <T>T invokeAny(java.util.Collection<? extends Callable<T>> arg1, long arg2, TimeUnit arg3) throws java.lang.InterruptedException, ExecutionException, TimeoutException{
    return null;
  }
  protected <T>RunnableFuture<T> newTaskFor(java.lang.Runnable arg1, T arg2){
    return (RunnableFuture) null;
  }
  protected <T>RunnableFuture<T> newTaskFor(Callable<T> arg1){
    return (RunnableFuture) null;
  }
}
