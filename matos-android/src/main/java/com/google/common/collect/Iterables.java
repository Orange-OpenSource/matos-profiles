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


public final class Iterables
{
  // Constructors

  private Iterables(){
  }
  // Methods

  public static <T>T get(java.lang.Iterable<T> arg1, int arg2){
    return null;
  }
  public static java.lang.String toString(java.lang.Iterable<?> arg1){
    return (java.lang.String) null;
  }
  public static <T>int indexOf(java.lang.Iterable<T> arg1, com.google.common.base.Predicate<? super T> arg2){
    return 0;
  }
  public static <T>java.lang.Iterable<T> concat(java.lang.Iterable<? extends T> arg1, java.lang.Iterable<? extends T> arg2){
    return (java.lang.Iterable) null;
  }
  public static <T>java.lang.Iterable<T> concat(java.lang.Iterable<? extends T> arg1, java.lang.Iterable<? extends T> arg2, java.lang.Iterable<? extends T> arg3){
    return (java.lang.Iterable) null;
  }
  public static <T>java.lang.Iterable<T> concat(java.lang.Iterable<? extends T> arg1, java.lang.Iterable<? extends T> arg2, java.lang.Iterable<? extends T> arg3, java.lang.Iterable<? extends T> arg4){
    return (java.lang.Iterable) null;
  }
  public static <T>java.lang.Iterable<T> concat(java.lang.Iterable<? extends T> [] arg1){
    return (java.lang.Iterable) null;
  }
  public static <T>java.lang.Iterable<T> concat(java.lang.Iterable<? extends java.lang.Iterable<? extends T>> arg1){
    return (java.lang.Iterable) null;
  }
  public static boolean contains(java.lang.Iterable<?> arg1, @javax.annotation.Nullable java.lang.Object arg2){
    return false;
  }
  public static <T>boolean isEmpty(java.lang.Iterable<T> arg1){
    return false;
  }
  public static <T>boolean addAll(java.util.Collection<T> arg1, java.lang.Iterable<? extends T> arg2){
    return false;
  }
  public static int size(java.lang.Iterable<?> arg1){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.Code({"T[] array = (T[]) java.lang.reflect.Array.newInstance(arg1.getClass().getComponentType(), 1);", "return array;"})
  public static <T>T [] toArray(java.lang.Iterable<? extends T> arg1, java.lang.Class<T> arg2){
    return (T []) null;
  }
  public static <T>T find(java.lang.Iterable<T> arg1, com.google.common.base.Predicate<? super T> arg2){
    return null;
  }
  public static <F, T>java.lang.Iterable<T> transform(java.lang.Iterable<F> arg1, com.google.common.base.Function<? super F, ? extends T> arg2){
    return (java.lang.Iterable) null;
  }
  public static <T>java.lang.Iterable<T> reverse(java.util.List<T> arg1){
    return (java.lang.Iterable) null;
  }
  public static int frequency(java.lang.Iterable<?> arg1, @javax.annotation.Nullable java.lang.Object arg2){
    return 0;
  }
  public static boolean removeAll(java.lang.Iterable<?> arg1, java.util.Collection<?> arg2){
    return false;
  }
  public static boolean retainAll(java.lang.Iterable<?> arg1, java.util.Collection<?> arg2){
    return false;
  }
  public static <T>boolean all(java.lang.Iterable<T> arg1, com.google.common.base.Predicate<? super T> arg2){
    return false;
  }
  public static <T>T getLast(java.lang.Iterable<T> arg1){
    return null;
  }
  public static <T>java.lang.Iterable<T> filter(java.lang.Iterable<T> arg1, com.google.common.base.Predicate<? super T> arg2){
    return (java.lang.Iterable) null;
  }
  public static <T>java.lang.Iterable<T> filter(java.lang.Iterable<?> arg1, java.lang.Class<T> arg2){
    return (java.lang.Iterable) null;
  }
  public static <T>java.lang.Iterable<T> cycle(java.lang.Iterable<T> arg1){
    return (java.lang.Iterable) null;
  }
  public static <T>java.lang.Iterable<T> cycle(T [] arg1){
    return (java.lang.Iterable) null;
  }
  public static <T>boolean any(java.lang.Iterable<T> arg1, com.google.common.base.Predicate<? super T> arg2){
    return false;
  }
  public static <T>java.lang.Iterable<T> unmodifiableIterable(java.lang.Iterable<T> arg1){
    return (java.lang.Iterable) null;
  }
  public static <T>boolean removeIf(java.lang.Iterable<T> arg1, com.google.common.base.Predicate<? super T> arg2){
    return false;
  }
  public static boolean elementsEqual(java.lang.Iterable<?> arg1, java.lang.Iterable<?> arg2){
    return false;
  }
  public static <T>T getOnlyElement(java.lang.Iterable<T> arg1){
    return null;
  }
  public static <T>T getOnlyElement(java.lang.Iterable<T> arg1, @javax.annotation.Nullable T arg2){
    return null;
  }
  public static <T>java.lang.Iterable<java.util.List<T>> partition(java.lang.Iterable<T> arg1, int arg2){
    return (java.lang.Iterable) null;
  }
  public static <T>java.lang.Iterable<java.util.List<T>> paddedPartition(java.lang.Iterable<T> arg1, int arg2){
    return (java.lang.Iterable) null;
  }
  public static <T>java.lang.Iterable<T> consumingIterable(java.lang.Iterable<T> arg1){
    return (java.lang.Iterable) null;
  }
}
