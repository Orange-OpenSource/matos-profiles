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


public abstract class ImmutableMultimap<K, V>
  implements Multimap<K, V>, java.io.Serializable
{
  // Classes

  public static class Builder<K, V>
  {
    // Constructors

    public Builder(){
    }
    // Methods

    public ImmutableMultimap.Builder<K, V> put(K arg1, V arg2){
      return (ImmutableMultimap.Builder) null;
    }
    public ImmutableMultimap.Builder<K, V> putAll(K arg1, java.lang.Iterable<? extends V> arg2){
      return (ImmutableMultimap.Builder) null;
    }
    public ImmutableMultimap.Builder<K, V> putAll(K arg1, V [] arg2){
      return (ImmutableMultimap.Builder) null;
    }
    public ImmutableMultimap.Builder<K, V> putAll(Multimap<? extends K, ? extends V> arg1){
      return (ImmutableMultimap.Builder) null;
    }
    public ImmutableMultimap<K, V> build(){
      return (ImmutableMultimap) null;
    }
  }
  // Constructors

  ImmutableMultimap(ImmutableMap<K, ? extends ImmutableCollection<V>> arg1, int arg2){
  }
  // Methods

  public abstract ImmutableCollection<V> get(K arg1);
  public boolean put(K arg1, V arg2){
    return false;
  }
  public boolean equals(@javax.annotation.Nullable java.lang.Object arg1){
    return false;
  }
  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public ImmutableCollection<V> values(){
    return (ImmutableCollection) null;
  }
  public int hashCode(){
    return 0;
  }
  public static <K, V>ImmutableMultimap<K, V> copyOf(Multimap<? extends K, ? extends V> arg1){
    return (ImmutableMultimap) null;
  }
  public void clear(){
  }
  public boolean isEmpty(){
    return false;
  }
  public boolean putAll(K arg1, java.lang.Iterable<? extends V> arg2){
    return false;
  }
  public boolean putAll(Multimap<? extends K, ? extends V> arg1){
    return false;
  }
  public int size(){
    return 0;
  }
  public boolean remove(java.lang.Object arg1, java.lang.Object arg2){
    return false;
  }
  public ImmutableSet<K> keySet(){
    return (ImmutableSet) null;
  }
  public ImmutableMultiset<K> keys(){
    return (ImmutableMultiset) null;
  }
  public boolean containsKey(@javax.annotation.Nullable java.lang.Object arg1){
    return false;
  }
  public boolean containsValue(@javax.annotation.Nullable java.lang.Object arg1){
    return false;
  }
  public ImmutableCollection<V> removeAll(java.lang.Object arg1){
    return (ImmutableCollection) null;
  }
  public ImmutableCollection<java.util.Map.Entry<K, V>> entries(){
    return (ImmutableCollection) null;
  }
  public static <K, V>ImmutableMultimap<K, V> of(){
    return (ImmutableMultimap) null;
  }
  public static <K, V>ImmutableMultimap<K, V> of(K arg1, V arg2){
    return (ImmutableMultimap) null;
  }
  public static <K, V>ImmutableMultimap<K, V> of(K arg1, V arg2, K arg3, V arg4){
    return (ImmutableMultimap) null;
  }
  public static <K, V>ImmutableMultimap<K, V> of(K arg1, V arg2, K arg3, V arg4, K arg5, V arg6){
    return (ImmutableMultimap) null;
  }
  public static <K, V>ImmutableMultimap<K, V> of(K arg1, V arg2, K arg3, V arg4, K arg5, V arg6, K arg7, V arg8){
    return (ImmutableMultimap) null;
  }
  public static <K, V>ImmutableMultimap<K, V> of(K arg1, V arg2, K arg3, V arg4, K arg5, V arg6, K arg7, V arg8, K arg9, V arg10){
    return (ImmutableMultimap) null;
  }
  public static <K, V>ImmutableMultimap.Builder<K, V> builder(){
    return (ImmutableMultimap.Builder) null;
  }
  public boolean containsEntry(@javax.annotation.Nullable java.lang.Object arg1, @javax.annotation.Nullable java.lang.Object arg2){
    return false;
  }
  public ImmutableMap<K, java.util.Collection<V>> asMap(){
    return (ImmutableMap) null;
  }
  public ImmutableCollection<V> replaceValues(K arg1, java.lang.Iterable<? extends V> arg2){
    return (ImmutableCollection) null;
  }
}
