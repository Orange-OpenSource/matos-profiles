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


@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.ImmutableSortedSet", superClass = "")
public abstract class ImmutableSortedSet<E>
  extends ImmutableSet<E>  implements java.util.SortedSet<E>
{
  // Classes

  public static final class Builder<E>
    extends ImmutableSet.Builder<E>  {
    // Constructors

    public Builder(java.util.Comparator<? super E> arg1){
      super();
    }
    // Methods

    public ImmutableSortedSet.Builder<E> add(E arg1){
      return (ImmutableSortedSet.Builder) null;
    }
    public ImmutableSortedSet.Builder<E> add(E [] arg1){
      return (ImmutableSortedSet.Builder) null;
    }
    public ImmutableSortedSet.Builder<E> addAll(java.lang.Iterable<? extends E> arg1){
      return (ImmutableSortedSet.Builder) null;
    }
    public ImmutableSortedSet.Builder<E> addAll(java.util.Iterator<? extends E> arg1){
      return (ImmutableSortedSet.Builder) null;
    }
    public ImmutableSortedSet<E> build(){
      return (ImmutableSortedSet) null;
    }
  }
  // Constructors

  ImmutableSortedSet(java.util.Comparator<? super E> arg1){
    super();
  }
  // Methods

  public static <E>ImmutableSortedSet<E> copyOf(java.lang.Iterable<? extends E> arg1){
    return (ImmutableSortedSet) null;
  }
  public static <E>ImmutableSortedSet<E> copyOf(java.util.Iterator<? extends E> arg1){
    return (ImmutableSortedSet) null;
  }
  public static <E>ImmutableSortedSet<E> copyOf(java.util.Comparator<? super E> arg1, java.lang.Iterable<? extends E> arg2){
    return (ImmutableSortedSet) null;
  }
  public static <E>ImmutableSortedSet<E> copyOf(java.util.Comparator<? super E> arg1, java.util.Iterator<? extends E> arg2){
    return (ImmutableSortedSet) null;
  }
  public static <E extends java.lang.Comparable>ImmutableSortedSet.Builder<E> reverseOrder(){
    return (ImmutableSortedSet.Builder) null;
  }
  public java.util.Comparator<? super E> comparator(){
    return (java.util.Comparator) null;
  }
  public static <E>ImmutableSortedSet<E> of(){
    return (ImmutableSortedSet) null;
  }
  public static <E extends java.lang.Comparable>ImmutableSortedSet<E> of(E arg1){
    return (ImmutableSortedSet) null;
  }
  public static <E extends java.lang.Comparable>ImmutableSortedSet<E> of(E arg1, E arg2){
    return (ImmutableSortedSet) null;
  }
  public static <E extends java.lang.Comparable>ImmutableSortedSet<E> of(E arg1, E arg2, E arg3){
    return (ImmutableSortedSet) null;
  }
  public static <E extends java.lang.Comparable>ImmutableSortedSet<E> of(E arg1, E arg2, E arg3, E arg4){
    return (ImmutableSortedSet) null;
  }
  public static <E extends java.lang.Comparable>ImmutableSortedSet<E> of(E arg1, E arg2, E arg3, E arg4, E arg5){
    return (ImmutableSortedSet) null;
  }
  public static <E extends java.lang.Comparable>ImmutableSortedSet<E> of(E [] arg1){
    return (ImmutableSortedSet) null;
  }
  public static <E>ImmutableSortedSet<E> of(E arg1){
    return (ImmutableSortedSet) null;
  }
  public static <E>ImmutableSortedSet<E> of(E arg1, E arg2){
    return (ImmutableSortedSet) null;
  }
  public static <E>ImmutableSortedSet<E> of(E arg1, E arg2, E arg3){
    return (ImmutableSortedSet) null;
  }
  public static <E>ImmutableSortedSet<E> of(E arg1, E arg2, E arg3, E arg4){
    return (ImmutableSortedSet) null;
  }
  public static <E>ImmutableSortedSet<E> of(E arg1, E arg2, E arg3, E arg4, E arg5){
    return (ImmutableSortedSet) null;
  }
  public static <E>ImmutableSortedSet<E> of(E [] arg1){
    return (ImmutableSortedSet) null;
  }
  public static <E>ImmutableSortedSet.Builder<E> builder(){
    return (ImmutableSortedSet.Builder) null;
  }
  public ImmutableSortedSet<E> headSet(E arg1){
    return (ImmutableSortedSet) null;
  }
  public ImmutableSortedSet<E> subSet(E arg1, E arg2){
    return (ImmutableSortedSet) null;
  }
  public ImmutableSortedSet<E> tailSet(E arg1){
    return (ImmutableSortedSet) null;
  }
  public static <E extends java.lang.Comparable>ImmutableSortedSet.Builder<E> naturalOrder(){
    return (ImmutableSortedSet.Builder) null;
  }
  public static <E>ImmutableSortedSet<E> copyOfSorted(java.util.SortedSet<E> arg1){
    return (ImmutableSortedSet) null;
  }
  public static <E>ImmutableSortedSet.Builder<E> orderedBy(java.util.Comparator<E> arg1){
    return (ImmutableSortedSet.Builder) null;
  }
}
