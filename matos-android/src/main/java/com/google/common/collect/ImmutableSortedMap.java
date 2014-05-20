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


public class ImmutableSortedMap<K, V>
  extends ImmutableMap<K, V>  implements java.util.SortedMap<K, V>
{
  // Classes

  public static final class Builder<K, V>
    extends ImmutableMap.Builder<K, V>  {
    // Constructors

    public Builder(java.util.Comparator<? super K> arg1){
      super();
    }
    // Methods

    public ImmutableSortedMap.Builder<K, V> put(K arg1, V arg2){
      return (ImmutableSortedMap.Builder) null;
    }
    public ImmutableSortedMap.Builder<K, V> putAll(java.util.Map<? extends K, ? extends V> arg1){
      return (ImmutableSortedMap.Builder) null;
    }
    public ImmutableSortedMap<K, V> build(){
      return (ImmutableSortedMap) null;
    }
  }
  // Constructors

  private ImmutableSortedMap(java.util.Map.Entry<?, ?> [] arg1, java.util.Comparator<? super K> arg2, int arg3, int arg4){
    super();
  }
  ImmutableSortedMap(java.util.Map.Entry<?, ?> [] arg1, java.util.Comparator<? super K> arg2){
    super();
  }
  // Methods

  public V get(@javax.annotation.Nullable java.lang.Object arg1){
    return null;
  }
  public ImmutableCollection<V> values(){
    return (ImmutableCollection) null;
  }
  public static <K, V>ImmutableSortedMap<K, V> copyOf(java.util.Map<? extends K, ? extends V> arg1){
    return (ImmutableSortedMap) null;
  }
  public static <K, V>ImmutableSortedMap<K, V> copyOf(java.util.Map<? extends K, ? extends V> arg1, java.util.Comparator<? super K> arg2){
    return (ImmutableSortedMap) null;
  }
  public ImmutableSet<java.util.Map.Entry<K, V>> entrySet(){
    return (ImmutableSet) null;
  }
  public int size(){
    return 0;
  }
  public ImmutableSortedSet<K> keySet(){
    return (ImmutableSortedSet) null;
  }
  public boolean containsValue(@javax.annotation.Nullable java.lang.Object arg1){
    return false;
  }
  public static <K extends java.lang.Comparable, V>ImmutableSortedMap.Builder<K, V> reverseOrder(){
    return (ImmutableSortedMap.Builder) null;
  }
  public java.util.Comparator<? super K> comparator(){
    return (java.util.Comparator) null;
  }
  public K firstKey(){
    return null;
  }
  public ImmutableSortedMap<K, V> headMap(K arg1){
    return (ImmutableSortedMap) null;
  }
  public K lastKey(){
    return null;
  }
  public ImmutableSortedMap<K, V> subMap(K arg1, K arg2){
    return (ImmutableSortedMap) null;
  }
  public ImmutableSortedMap<K, V> tailMap(K arg1){
    return (ImmutableSortedMap) null;
  }
  public static <K, V>ImmutableSortedMap<K, V> of(){
    return (ImmutableSortedMap) null;
  }
  public static <K extends java.lang.Comparable, V>ImmutableSortedMap<K, V> of(K arg1, V arg2){
    return (ImmutableSortedMap) null;
  }
  public static <K extends java.lang.Comparable, V>ImmutableSortedMap<K, V> of(K arg1, V arg2, K arg3, V arg4){
    return (ImmutableSortedMap) null;
  }
  public static <K extends java.lang.Comparable, V>ImmutableSortedMap<K, V> of(K arg1, V arg2, K arg3, V arg4, K arg5, V arg6){
    return (ImmutableSortedMap) null;
  }
  public static <K extends java.lang.Comparable, V>ImmutableSortedMap<K, V> of(K arg1, V arg2, K arg3, V arg4, K arg5, V arg6, K arg7, V arg8){
    return (ImmutableSortedMap) null;
  }
  public static <K extends java.lang.Comparable, V>ImmutableSortedMap<K, V> of(K arg1, V arg2, K arg3, V arg4, K arg5, V arg6, K arg7, V arg8, K arg9, V arg10){
    return (ImmutableSortedMap) null;
  }
  public static <K, V>ImmutableSortedMap<K, V> of(K arg1, V arg2){
    return (ImmutableSortedMap) null;
  }
  public static <K, V>ImmutableSortedMap<K, V> of(K arg1, V arg2, K arg3, V arg4){
    return (ImmutableSortedMap) null;
  }
  public static <K, V>ImmutableSortedMap<K, V> of(K arg1, V arg2, K arg3, V arg4, K arg5, V arg6){
    return (ImmutableSortedMap) null;
  }
  public static <K, V>ImmutableSortedMap<K, V> of(K arg1, V arg2, K arg3, V arg4, K arg5, V arg6, K arg7, V arg8){
    return (ImmutableSortedMap) null;
  }
  public static <K, V>ImmutableSortedMap<K, V> of(K arg1, V arg2, K arg3, V arg4, K arg5, V arg6, K arg7, V arg8, K arg9, V arg10){
    return (ImmutableSortedMap) null;
  }
  public static <K, V>ImmutableSortedMap.Builder<K, V> builder(){
    return (ImmutableSortedMap.Builder) null;
  }
  public static <K extends java.lang.Comparable, V>ImmutableSortedMap.Builder<K, V> naturalOrder(){
    return (ImmutableSortedMap.Builder) null;
  }
  public static <K, V>ImmutableSortedMap<K, V> copyOfSorted(java.util.SortedMap<K, ? extends V> arg1){
    return (ImmutableSortedMap) null;
  }
  public static <K, V>ImmutableSortedMap.Builder<K, V> orderedBy(java.util.Comparator<K> arg1){
    return (ImmutableSortedMap.Builder) null;
  }
}
