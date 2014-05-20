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


public class TreeMultimap<K, V>
  extends AbstractSortedSetMultimap<K, V>{
  // Constructors

  TreeMultimap(){
    super((java.util.Map) null);
  }
  TreeMultimap(@javax.annotation.Nullable java.util.Comparator<? super K> arg1, @javax.annotation.Nullable java.util.Comparator<? super V> arg2){
    super((java.util.Map) null);
  }
  // Methods

  public java.util.SortedSet<K> keySet(){
    return (java.util.SortedSet) null;
  }
  public static <K extends java.lang.Comparable, V extends java.lang.Comparable>TreeMultimap<K, V> create(){
    return (TreeMultimap) null;
  }
  public static <K, V>TreeMultimap<K, V> create(java.util.Comparator<? super K> arg1, java.util.Comparator<? super V> arg2){
    return (TreeMultimap) null;
  }
  public static <K extends java.lang.Comparable, V extends java.lang.Comparable>TreeMultimap<K, V> create(Multimap<? extends K, ? extends V> arg1){
    return (TreeMultimap) null;
  }
  public java.util.SortedMap<K, java.util.Collection<V>> asMap(){
    return (java.util.SortedMap) null;
  }
  public java.util.Comparator<? super V> valueComparator(){
    return (java.util.Comparator) null;
  }
  public java.util.Comparator<? super K> keyComparator(){
    return (java.util.Comparator) null;
  }
}
