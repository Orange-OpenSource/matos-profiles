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


public abstract class ImmutableMap<K, V>
  implements java.util.Map<K, V>, java.io.Serializable
{
  // Classes

  public static class Builder<K, V>
  {
    // Constructors

    public Builder(){
    }
    // Methods

    public ImmutableMap.Builder<K, V> put(K arg1, V arg2){
      return (ImmutableMap.Builder) null;
    }
    public ImmutableMap.Builder<K, V> putAll(java.util.Map<? extends K, ? extends V> arg1){
      return (ImmutableMap.Builder) null;
    }
    public ImmutableMap<K, V> build(){
      return (ImmutableMap) null;
    }
  }
  // Constructors

  ImmutableMap(){
  }
  // Methods

  public abstract V get(@javax.annotation.Nullable java.lang.Object arg1);
  public final V put(K arg1, V arg2){
    return null;
  }
  public boolean equals(@javax.annotation.Nullable java.lang.Object arg1){
    return false;
  }
  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public abstract ImmutableCollection<V> values();
  public int hashCode(){
    return 0;
  }
  public static <K, V>ImmutableMap<K, V> copyOf(java.util.Map<? extends K, ? extends V> arg1){
    return (ImmutableMap) null;
  }
  public final void clear(){
  }
  public boolean isEmpty(){
    return false;
  }
  public abstract ImmutableSet<java.util.Map.Entry<K, V>> entrySet();
  public final void putAll(java.util.Map<? extends K, ? extends V> arg1){
  }
  public final V remove(java.lang.Object arg1){
    return null;
  }
  public abstract ImmutableSet<K> keySet();
  public boolean containsKey(@javax.annotation.Nullable java.lang.Object arg1){
    return false;
  }
  public abstract boolean containsValue(@javax.annotation.Nullable java.lang.Object arg1);
  public static <K, V>ImmutableMap<K, V> of(){
    return (ImmutableMap) null;
  }
  public static <K, V>ImmutableMap<K, V> of(K arg1, V arg2){
    return (ImmutableMap) null;
  }
  public static <K, V>ImmutableMap<K, V> of(K arg1, V arg2, K arg3, V arg4){
    return (ImmutableMap) null;
  }
  public static <K, V>ImmutableMap<K, V> of(K arg1, V arg2, K arg3, V arg4, K arg5, V arg6){
    return (ImmutableMap) null;
  }
  public static <K, V>ImmutableMap<K, V> of(K arg1, V arg2, K arg3, V arg4, K arg5, V arg6, K arg7, V arg8){
    return (ImmutableMap) null;
  }
  public static <K, V>ImmutableMap<K, V> of(K arg1, V arg2, K arg3, V arg4, K arg5, V arg6, K arg7, V arg8, K arg9, V arg10){
    return (ImmutableMap) null;
  }
  public static <K, V>ImmutableMap.Builder<K, V> builder(){
    return (ImmutableMap.Builder) null;
  }
}
