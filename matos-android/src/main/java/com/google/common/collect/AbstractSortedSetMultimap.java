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


public abstract class AbstractSortedSetMultimap<K, V>
  implements SortedSetMultimap<K, V>, Multimap<K, V>, SetMultimap<K, V>, java.io.Serializable
{
  // Constructors

  protected AbstractSortedSetMultimap(java.util.Map<K, java.util.Collection<V>> arg1){
  }
  // Methods

  public java.util.SortedSet<V> get(@javax.annotation.Nullable K arg1){
    return (java.util.SortedSet) null;
  }
  public boolean put(K arg1, V arg2){
    return false;
  }
  public boolean equals(@javax.annotation.Nullable java.lang.Object arg1){
    return false;
  }
  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public java.util.Collection<V> values(){
    return (java.util.Collection) null;
  }
  public int hashCode(){
    return 0;
  }
  public void clear(){
  }
  public boolean isEmpty(){
    return false;
  }
  public boolean putAll(@javax.annotation.Nullable K arg1, java.lang.Iterable<? extends V> arg2){
    return false;
  }
  public boolean putAll(Multimap<? extends K, ? extends V> arg1){
    return false;
  }
  public int size(){
    return 0;
  }
  public boolean remove(@javax.annotation.Nullable java.lang.Object arg1, @javax.annotation.Nullable java.lang.Object arg2){
    return false;
  }
  public java.util.Set<K> keySet(){
    return (java.util.Set) null;
  }
  public Multiset<K> keys(){
    return (Multiset) null;
  }
  public boolean containsKey(@javax.annotation.Nullable java.lang.Object arg1){
    return false;
  }
  public boolean containsValue(@javax.annotation.Nullable java.lang.Object arg1){
    return false;
  }
  public java.util.SortedSet<V> removeAll(@javax.annotation.Nullable java.lang.Object arg1){
    return (java.util.SortedSet) null;
  }
  public java.util.Set<java.util.Map.Entry<K, V>> entries(){
    return (java.util.Set) null;
  }
  public boolean containsEntry(@javax.annotation.Nullable java.lang.Object arg1, @javax.annotation.Nullable java.lang.Object arg2){
    return false;
  }
  public java.util.Map<K, java.util.Collection<V>> asMap(){
    return (java.util.Map) null;
  }
  public java.util.SortedSet<V> replaceValues(K arg1, java.lang.Iterable<? extends V> arg2){
    return (java.util.SortedSet) null;
  }
}
