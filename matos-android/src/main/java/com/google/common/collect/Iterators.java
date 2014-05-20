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


public final class Iterators
{
  // Constructors

  private Iterators(){
  }
  // Methods

  public static <T>T get(java.util.Iterator<T> arg1, int arg2){
    return null;
  }
  public static java.lang.String toString(java.util.Iterator<?> arg1){
    return (java.lang.String) null;
  }
  public static <T>int indexOf(java.util.Iterator<T> arg1, com.google.common.base.Predicate<? super T> arg2){
    return 0;
  }
  public static <T>java.util.Iterator<T> concat(java.util.Iterator<? extends T> arg1, java.util.Iterator<? extends T> arg2){
    return (java.util.Iterator) null;
  }
  public static <T>java.util.Iterator<T> concat(java.util.Iterator<? extends T> arg1, java.util.Iterator<? extends T> arg2, java.util.Iterator<? extends T> arg3){
    return (java.util.Iterator) null;
  }
  public static <T>java.util.Iterator<T> concat(java.util.Iterator<? extends T> arg1, java.util.Iterator<? extends T> arg2, java.util.Iterator<? extends T> arg3, java.util.Iterator<? extends T> arg4){
    return (java.util.Iterator) null;
  }
  public static <T>java.util.Iterator<T> concat(java.util.Iterator<? extends T> [] arg1){
    return (java.util.Iterator) null;
  }
  public static <T>java.util.Iterator<T> concat(java.util.Iterator<? extends java.util.Iterator<? extends T>> arg1){
    return (java.util.Iterator) null;
  }
  public static boolean contains(java.util.Iterator<?> arg1, @javax.annotation.Nullable java.lang.Object arg2){
    return false;
  }
  public static <T>boolean addAll(java.util.Collection<T> arg1, java.util.Iterator<? extends T> arg2){
    return false;
  }
  public static int size(java.util.Iterator<?> arg1){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.Code({"T[] array = (T[]) java.lang.reflect.Array.newInstance(arg1.getClass().getComponentType(), 1);", "return array;"})
  public static <T>T [] toArray(java.util.Iterator<? extends T> arg1, java.lang.Class<T> arg2){
    return (T []) null;
  }
  public static <T>T find(java.util.Iterator<T> arg1, com.google.common.base.Predicate<? super T> arg2){
    return null;
  }
  public static <F, T>java.util.Iterator<T> transform(java.util.Iterator<F> arg1, com.google.common.base.Function<? super F, ? extends T> arg2){
    return (java.util.Iterator) null;
  }
  public static <T>UnmodifiableIterator<T> emptyIterator(){
    return (UnmodifiableIterator) null;
  }
  public static int frequency(java.util.Iterator<?> arg1, @javax.annotation.Nullable java.lang.Object arg2){
    return 0;
  }
  public static boolean removeAll(java.util.Iterator<?> arg1, java.util.Collection<?> arg2){
    return false;
  }
  public static boolean retainAll(java.util.Iterator<?> arg1, java.util.Collection<?> arg2){
    return false;
  }
  public static <T>boolean all(java.util.Iterator<T> arg1, com.google.common.base.Predicate<? super T> arg2){
    return false;
  }
  public static <T>T getLast(java.util.Iterator<T> arg1){
    return null;
  }
  public static <T>UnmodifiableIterator<T> filter(java.util.Iterator<T> arg1, com.google.common.base.Predicate<? super T> arg2){
    return (UnmodifiableIterator) null;
  }
  public static <T>UnmodifiableIterator<T> filter(java.util.Iterator<?> arg1, java.lang.Class<T> arg2){
    return (UnmodifiableIterator) null;
  }
  public static <T>java.util.Iterator<T> cycle(java.lang.Iterable<T> arg1){
    return (java.util.Iterator) null;
  }
  public static <T>java.util.Iterator<T> cycle(T [] arg1){
    return (java.util.Iterator) null;
  }
  public static <T>boolean any(java.util.Iterator<T> arg1, com.google.common.base.Predicate<? super T> arg2){
    return false;
  }
  public static <T>boolean removeIf(java.util.Iterator<T> arg1, com.google.common.base.Predicate<? super T> arg2){
    return false;
  }
  public static boolean elementsEqual(java.util.Iterator<?> arg1, java.util.Iterator<?> arg2){
    return false;
  }
  public static <T>T getOnlyElement(java.util.Iterator<T> arg1){
    return null;
  }
  public static <T>T getOnlyElement(java.util.Iterator<T> arg1, @javax.annotation.Nullable T arg2){
    return null;
  }
  public static <T>UnmodifiableIterator<java.util.List<T>> partition(java.util.Iterator<T> arg1, int arg2){
    return (UnmodifiableIterator) null;
  }
  public static <T>UnmodifiableIterator<java.util.List<T>> paddedPartition(java.util.Iterator<T> arg1, int arg2){
    return (UnmodifiableIterator) null;
  }
  public static <T>UnmodifiableIterator<T> unmodifiableIterator(java.util.Iterator<T> arg1){
    return (UnmodifiableIterator) null;
  }
  public static <T>java.util.Iterator<T> consumingIterator(java.util.Iterator<T> arg1){
    return (java.util.Iterator) null;
  }
  public static <T>UnmodifiableIterator<T> forArray(T [] arg1){
    return (UnmodifiableIterator) null;
  }
  public static <T>java.util.Enumeration<T> asEnumeration(java.util.Iterator<T> arg1){
    return (java.util.Enumeration) null;
  }
  public static <T>UnmodifiableIterator<T> singletonIterator(@javax.annotation.Nullable T arg1){
    return (UnmodifiableIterator) null;
  }
  public static <T>UnmodifiableIterator<T> forEnumeration(java.util.Enumeration<T> arg1){
    return (UnmodifiableIterator) null;
  }
  public static <T>PeekingIterator<T> peekingIterator(java.util.Iterator<? extends T> arg1){
    return (PeekingIterator) null;
  }
}
