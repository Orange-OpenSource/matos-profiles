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


public class Executors
{
	  // Added
	  private static class MyCallable<T> implements Callable<T> {
	    MyCallable(@com.francetelecom.rd.stubs.annotation.CallBackRegister("run") Runnable arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("v") T arg2 ) {}
	    @com.francetelecom.rd.stubs.annotation.Code({"try {v = arg1.run();} catch (Exception e) {}"})
	    MyCallable(java.security.PrivilegedAction<T> arg1) {}
	    @com.francetelecom.rd.stubs.annotation.Code({"try {v = arg1.run();} catch (Exception e) {}"})
	    MyCallable(java.security.PrivilegedExceptionAction<T> arg1) {}
	    @com.francetelecom.rd.stubs.annotation.Code({"try {v = arg1.call();} catch (Exception e) {}"})
	    MyCallable(Callable<T> arg1) {}
		@com.francetelecom.rd.stubs.annotation.FieldGet("v")
		public T call() throws Exception { return (T) null; }
	  }
  // Constructors

  private Executors(){
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.Code("return new MyCallable(arg1,arg2);")
  public static <T>Callable<T> callable(java.lang.Runnable arg1, T arg2){
    return (Callable) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return new MyCallable(arg1,null);")
  public static Callable<java.lang.Object> callable(java.lang.Runnable arg1){
    return (Callable) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return new MyCallable(arg1);")
  public static Callable<java.lang.Object> callable(java.security.PrivilegedAction<?> arg1){
    return (Callable) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return new MyCallable(arg1);")
  public static Callable<java.lang.Object> callable(java.security.PrivilegedExceptionAction<?> arg1){
    return (Callable) null;
  }
  public static ExecutorService newFixedThreadPool(int arg1){
    return (ExecutorService) null;
  }
  public static ExecutorService newFixedThreadPool(int arg1, ThreadFactory arg2){
    return (ExecutorService) null;
  }
  public static ExecutorService newSingleThreadExecutor(){
    return (ExecutorService) null;
  }
  public static ExecutorService newSingleThreadExecutor(ThreadFactory arg1){
    return (ExecutorService) null;
  }
  public static ExecutorService newCachedThreadPool(){
    return (ExecutorService) null;
  }
  public static ExecutorService newCachedThreadPool(ThreadFactory arg1){
    return (ExecutorService) null;
  }
  public static ScheduledExecutorService newSingleThreadScheduledExecutor(){
    return (ScheduledExecutorService) null;
  }
  public static ScheduledExecutorService newSingleThreadScheduledExecutor(ThreadFactory arg1){
    return (ScheduledExecutorService) null;
  }
  public static ScheduledExecutorService newScheduledThreadPool(int arg1){
    return (ScheduledExecutorService) null;
  }
  public static ScheduledExecutorService newScheduledThreadPool(int arg1, ThreadFactory arg2){
    return (ScheduledExecutorService) null;
  }
  public static ExecutorService unconfigurableExecutorService(ExecutorService arg1){
    return (ExecutorService) null;
  }
  public static ScheduledExecutorService unconfigurableScheduledExecutorService(ScheduledExecutorService arg1){
    return (ScheduledExecutorService) null;
  }
  public static ThreadFactory defaultThreadFactory(){
    return (ThreadFactory) null;
  }
  public static ThreadFactory privilegedThreadFactory(){
    return (ThreadFactory) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return new MyCallable(arg1);")
  public static <T>Callable<T> privilegedCallable(Callable<T> arg1){
    return (Callable) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return new MyCallable(arg1);")
  public static <T>Callable<T> privilegedCallableUsingCurrentClassLoader(Callable<T> arg1){
    return (Callable) null;
  }
}
