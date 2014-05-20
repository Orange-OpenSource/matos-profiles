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


public final class Sets
{
  // Classes

  @com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.SetViewImplem", superClass = "")
  public abstract static class SetView<E>
    extends java.util.AbstractSet<E>  {
    // Constructors

    private SetView(){
      super();
    }
    // Methods

    public <S extends java.util.Set>S copyInto(S arg1){
      return null;
    }
    public ImmutableSet<E> immutableCopy(){
      return (ImmutableSet) null;
    }
  }
  // Constructors

  private Sets(){
  }
  // Methods

  public static <E>java.util.Set<E> newSetFromMap(java.util.Map<E, java.lang.Boolean> arg1){
    return (java.util.Set) null;
  }
  public static <E>Sets.SetView<E> intersection(java.util.Set<E> arg1, java.util.Set<?> arg2){
    return (Sets.SetView) null;
  }
  public static <E>Sets.SetView<E> union(java.util.Set<? extends E> arg1, java.util.Set<? extends E> arg2){
    return (Sets.SetView) null;
  }
  public static <E>java.util.Set<E> filter(java.util.Set<E> arg1, com.google.common.base.Predicate<? super E> arg2){
    return (java.util.Set) null;
  }
  public static <E extends java.lang.Enum>java.util.EnumSet<E> complementOf(java.util.Collection<E> arg1){
    return (java.util.EnumSet) null;
  }
  public static <E extends java.lang.Enum>java.util.EnumSet<E> complementOf(java.util.Collection<E> arg1, java.lang.Class<E> arg2){
    return (java.util.EnumSet) null;
  }
  public static <E>Sets.SetView<E> difference(java.util.Set<E> arg1, java.util.Set<?> arg2){
    return (Sets.SetView) null;
  }
  public static <E>java.util.HashSet<E> newHashSet(){
    return (java.util.HashSet) null;
  }
  public static <E>java.util.HashSet<E> newHashSet(E [] arg1){
    return (java.util.HashSet) null;
  }
  public static <E>java.util.HashSet<E> newHashSet(java.lang.Iterable<? extends E> arg1){
    return (java.util.HashSet) null;
  }
  public static <E>java.util.HashSet<E> newHashSet(java.util.Iterator<? extends E> arg1){
    return (java.util.HashSet) null;
  }
  public static <E>java.util.LinkedHashSet<E> newLinkedHashSet(){
    return (java.util.LinkedHashSet) null;
  }
  public static <E>java.util.LinkedHashSet<E> newLinkedHashSet(java.lang.Iterable<? extends E> arg1){
    return (java.util.LinkedHashSet) null;
  }
  public static <E>java.util.HashSet<E> newHashSetWithExpectedSize(int arg1){
    return (java.util.HashSet) null;
  }
  public static <E extends java.lang.Enum>ImmutableSet<E> immutableEnumSet(E arg1, E [] arg2){
    return (ImmutableSet) null;
  }
  public static <E extends java.lang.Enum>ImmutableSet<E> immutableEnumSet(java.lang.Iterable<E> arg1){
    return (ImmutableSet) null;
  }
  public static <E extends java.lang.Enum>java.util.EnumSet<E> newEnumSet(java.lang.Iterable<E> arg1, java.lang.Class<E> arg2){
    return (java.util.EnumSet) null;
  }
  public static <E extends java.lang.Comparable>java.util.TreeSet<E> newTreeSet(){
    return (java.util.TreeSet) null;
  }
  public static <E extends java.lang.Comparable>java.util.TreeSet<E> newTreeSet(java.lang.Iterable<? extends E> arg1){
    return (java.util.TreeSet) null;
  }
  public static <E>java.util.TreeSet<E> newTreeSet(java.util.Comparator<? super E> arg1){
    return (java.util.TreeSet) null;
  }
  public static <B>java.util.Set<java.util.List<B>> cartesianProduct(java.util.List<? extends java.util.Set<? extends B>> arg1){
    return (java.util.Set) null;
  }
  public static <B>java.util.Set<java.util.List<B>> cartesianProduct(java.util.Set<? extends B> [] arg1){
    return (java.util.Set) null;
  }
}
