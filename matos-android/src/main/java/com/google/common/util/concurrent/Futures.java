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


public class Futures
{
  // Constructors

  private Futures(){
  }
  // Methods

  public static <I, O>ListenableFuture<O> compose(ListenableFuture<I> arg1, com.google.common.base.Function<? super I, ? extends O> arg2){
    return (ListenableFuture) null;
  }
  public static <I, O>ListenableFuture<O> compose(ListenableFuture<I> arg1, com.google.common.base.Function<? super I, ? extends O> arg2, java.util.concurrent.Executor arg3){
    return (ListenableFuture) null;
  }
  public static <I, O>java.util.concurrent.Future<O> compose(java.util.concurrent.Future<I> arg1, com.google.common.base.Function<? super I, ? extends O> arg2){
    return (java.util.concurrent.Future) null;
  }
  public static <I, O>ListenableFuture<O> chain(ListenableFuture<I> arg1, com.google.common.base.Function<? super I, ? extends ListenableFuture<? extends O>> arg2){
    return (ListenableFuture) null;
  }
  public static <I, O>ListenableFuture<O> chain(ListenableFuture<I> arg1, com.google.common.base.Function<? super I, ? extends ListenableFuture<? extends O>> arg2, java.util.concurrent.Executor arg3){
    return (ListenableFuture) null;
  }
  public static <V>UninterruptibleFuture<V> makeUninterruptible(java.util.concurrent.Future<V> arg1){
    return (UninterruptibleFuture) null;
  }
  public static <T>ListenableFuture<T> makeListenable(java.util.concurrent.Future<T> arg1){
    return (ListenableFuture) null;
  }
  public static <T, E extends java.lang.Exception>CheckedFuture<T, E> makeChecked(java.util.concurrent.Future<T> arg1, com.google.common.base.Function<java.lang.Exception, E> arg2){
    return (CheckedFuture) null;
  }
  public static <T>ListenableFuture<T> immediateFuture(@javax.annotation.Nullable T arg1){
    return (ListenableFuture) null;
  }
  public static <T, E extends java.lang.Exception>CheckedFuture<T, E> immediateCheckedFuture(@javax.annotation.Nullable T arg1){
    return (CheckedFuture) null;
  }
  public static <T>ListenableFuture<T> immediateFailedFuture(java.lang.Throwable arg1){
    return (ListenableFuture) null;
  }
  public static <T, E extends java.lang.Exception>CheckedFuture<T, E> immediateFailedCheckedFuture(E arg1){
    return (CheckedFuture) null;
  }
}
