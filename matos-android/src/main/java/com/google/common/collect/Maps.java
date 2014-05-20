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


public final class Maps
{
  // Constructors

  private Maps(){
  }
  // Methods

  public static <K, V>java.util.Map.Entry<K, V> immutableEntry(@javax.annotation.Nullable K arg1, @javax.annotation.Nullable V arg2){
    return (java.util.Map.Entry) null;
  }
  public static <K, V>java.util.HashMap<K, V> newHashMap(){
    return (java.util.HashMap) null;
  }
  public static <K, V>java.util.HashMap<K, V> newHashMap(java.util.Map<? extends K, ? extends V> arg1){
    return (java.util.HashMap) null;
  }
  public static <K, V>java.util.HashMap<K, V> newHashMapWithExpectedSize(int arg1){
    return (java.util.HashMap) null;
  }
  public static <K, V>java.util.LinkedHashMap<K, V> newLinkedHashMap(){
    return (java.util.LinkedHashMap) null;
  }
  public static <K, V>java.util.LinkedHashMap<K, V> newLinkedHashMap(java.util.Map<? extends K, ? extends V> arg1){
    return (java.util.LinkedHashMap) null;
  }
  public static <K extends java.lang.Comparable, V>java.util.TreeMap<K, V> newTreeMap(){
    return (java.util.TreeMap) null;
  }
  public static <K, V>java.util.TreeMap<K, V> newTreeMap(java.util.SortedMap<K, ? extends V> arg1){
    return (java.util.TreeMap) null;
  }
  public static <C, K extends C, V>java.util.TreeMap<K, V> newTreeMap(@javax.annotation.Nullable java.util.Comparator<C> arg1){
    return (java.util.TreeMap) null;
  }
  public static <K extends java.lang.Enum, V>java.util.EnumMap<K, V> newEnumMap(java.lang.Class<K> arg1){
    return (java.util.EnumMap) null;
  }
  public static <K extends java.lang.Enum, V>java.util.EnumMap<K, V> newEnumMap(java.util.Map<K, ? extends V> arg1){
    return (java.util.EnumMap) null;
  }
  public static <K, V>java.util.IdentityHashMap<K, V> newIdentityHashMap(){
    return (java.util.IdentityHashMap) null;
  }
  public static <K, V>BiMap<K, V> synchronizedBiMap(BiMap<K, V> arg1){
    return (BiMap) null;
  }
  public static <K, V>MapDifference<K, V> difference(java.util.Map<? extends K, ? extends V> arg1, java.util.Map<? extends K, ? extends V> arg2){
    return (MapDifference) null;
  }
  public static <K, V>ImmutableMap<K, V> uniqueIndex(java.lang.Iterable<V> arg1, com.google.common.base.Function<? super V, K> arg2){
    return (ImmutableMap) null;
  }
  public static ImmutableMap<java.lang.String, java.lang.String> fromProperties(java.util.Properties arg1){
    return (ImmutableMap) null;
  }
  public static <K, V>BiMap<K, V> unmodifiableBiMap(BiMap<? extends K, ? extends V> arg1){
    return (BiMap) null;
  }
  public static <K, V1, V2>java.util.Map<K, V2> transformValues(java.util.Map<K, V1> arg1, com.google.common.base.Function<? super V1, V2> arg2){
    return (java.util.Map) null;
  }
  public static <K, V>java.util.Map<K, V> filterKeys(java.util.Map<K, V> arg1, com.google.common.base.Predicate<? super K> arg2){
    return (java.util.Map) null;
  }
  public static <K, V>java.util.Map<K, V> filterValues(java.util.Map<K, V> arg1, com.google.common.base.Predicate<? super V> arg2){
    return (java.util.Map) null;
  }
  public static <K, V>java.util.Map<K, V> filterEntries(java.util.Map<K, V> arg1, com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> arg2){
    return (java.util.Map) null;
  }
}
