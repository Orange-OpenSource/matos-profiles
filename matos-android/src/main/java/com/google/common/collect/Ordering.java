package com.google.common.collect;

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


@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.OrderingImplem", superClass = "")
public abstract class Ordering<T>
  implements java.util.Comparator<T>
{
  // Constructors

  protected Ordering(){
  }
  // Methods

  public <E extends T>E min(java.lang.Iterable<E> arg1){
    return null;
  }
  public <E extends T>E min(E arg1, E arg2, E arg3, E [] arg4){
    return null;
  }
  public <E extends T>E min(E arg1, E arg2){
    return null;
  }
  public <E extends T>E max(java.lang.Iterable<E> arg1){
    return null;
  }
  public <E extends T>E max(E arg1, E arg2, E arg3, E [] arg4){
    return null;
  }
  public <E extends T>E max(E arg1, E arg2){
    return null;
  }
  public static <T>Ordering<T> from(java.util.Comparator<T> arg1){
    return (Ordering) null;
  }
  public static <T>Ordering<T> from(Ordering<T> arg1){
    return (Ordering) null;
  }
  public <S extends T>Ordering<S> reverse(){
    return (Ordering) null;
  }
  public int binarySearch(java.util.List<? extends T> arg1, T arg2){
    return 0;
  }
  public boolean isOrdered(java.lang.Iterable<? extends T> arg1){
    return false;
  }
  public static <T>Ordering<T> explicit(java.util.List<T> arg1){
    return (Ordering) null;
  }
  public static <T>Ordering<T> explicit(T arg1, T [] arg2){
    return (Ordering) null;
  }
  public <S extends T>Ordering<S> nullsFirst(){
    return (Ordering) null;
  }
  public <S extends T>Ordering<S> nullsLast(){
    return (Ordering) null;
  }
  public static <C extends java.lang.Comparable>Ordering<C> natural(){
    return (Ordering) null;
  }
  public static Ordering<java.lang.Object> arbitrary(){
    return (Ordering) null;
  }
  public static Ordering<java.lang.Object> usingToString(){
    return (Ordering) null;
  }
  public static <T>Ordering<T> compound(java.lang.Iterable<? extends java.util.Comparator<? super T>> arg1){
    return (Ordering) null;
  }
  public <U extends T>Ordering<U> compound(java.util.Comparator<? super U> arg1){
    return (Ordering) null;
  }
  public <F>Ordering<F> onResultOf(com.google.common.base.Function<F, ? extends T> arg1){
    return (Ordering) null;
  }
  public <S extends T>Ordering<java.lang.Iterable<S>> lexicographical(){
    return (Ordering) null;
  }
  public <E extends T>java.util.List<E> sortedCopy(java.lang.Iterable<E> arg1){
    return (java.util.List) null;
  }
  public boolean isStrictlyOrdered(java.lang.Iterable<? extends T> arg1){
    return false;
  }
}
