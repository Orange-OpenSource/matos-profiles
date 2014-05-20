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


public final class Multimaps
{
  // Constructors

  private Multimaps(){
  }
  // Methods

  public static <K, V>ImmutableListMultimap<K, V> index(java.lang.Iterable<V> arg1, com.google.common.base.Function<? super V, K> arg2){
    return (ImmutableListMultimap) null;
  }
  public static <K, V>Multimap<K, V> newMultimap(java.util.Map<K, java.util.Collection<V>> arg1, com.google.common.base.Supplier<? extends java.util.Collection<V>> arg2){
    return (Multimap) null;
  }
  public static <K, V>ListMultimap<K, V> newListMultimap(java.util.Map<K, java.util.Collection<V>> arg1, com.google.common.base.Supplier<? extends java.util.List<V>> arg2){
    return (ListMultimap) null;
  }
  public static <K, V>SetMultimap<K, V> newSetMultimap(java.util.Map<K, java.util.Collection<V>> arg1, com.google.common.base.Supplier<? extends java.util.Set<V>> arg2){
    return (SetMultimap) null;
  }
  public static <K, V>SortedSetMultimap<K, V> newSortedSetMultimap(java.util.Map<K, java.util.Collection<V>> arg1, com.google.common.base.Supplier<? extends java.util.SortedSet<V>> arg2){
    return (SortedSetMultimap) null;
  }
  public static <K, V, M extends Multimap>M invertFrom(Multimap<? extends V, ? extends K> arg1, M arg2){
    return null;
  }
  public static <K, V>Multimap<K, V> synchronizedMultimap(Multimap<K, V> arg1){
    return (Multimap) null;
  }
  public static <K, V>Multimap<K, V> unmodifiableMultimap(Multimap<K, V> arg1){
    return (Multimap) null;
  }
  public static <K, V>SetMultimap<K, V> synchronizedSetMultimap(SetMultimap<K, V> arg1){
    return (SetMultimap) null;
  }
  public static <K, V>SetMultimap<K, V> unmodifiableSetMultimap(SetMultimap<K, V> arg1){
    return (SetMultimap) null;
  }
  public static <K, V>SortedSetMultimap<K, V> synchronizedSortedSetMultimap(SortedSetMultimap<K, V> arg1){
    return (SortedSetMultimap) null;
  }
  public static <K, V>SortedSetMultimap<K, V> unmodifiableSortedSetMultimap(SortedSetMultimap<K, V> arg1){
    return (SortedSetMultimap) null;
  }
  public static <K, V>ListMultimap<K, V> synchronizedListMultimap(ListMultimap<K, V> arg1){
    return (ListMultimap) null;
  }
  public static <K, V>ListMultimap<K, V> unmodifiableListMultimap(ListMultimap<K, V> arg1){
    return (ListMultimap) null;
  }
  public static <K, V>SetMultimap<K, V> forMap(java.util.Map<K, V> arg1){
    return (SetMultimap) null;
  }
}
