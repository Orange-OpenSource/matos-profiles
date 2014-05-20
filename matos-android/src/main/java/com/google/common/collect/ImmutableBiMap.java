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


@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.ImmutableBiMapImplem", superClass = "")
public abstract class ImmutableBiMap<K, V>
  extends ImmutableMap<K, V>  implements BiMap<K, V>
{
  // Classes

  public static final class Builder<K, V>
    extends ImmutableMap.Builder<K, V>  {
    // Constructors

    public Builder(){
      super();
    }
    // Methods

    public ImmutableBiMap.Builder<K, V> put(K arg1, V arg2){
      return (ImmutableBiMap.Builder) null;
    }
    public ImmutableBiMap.Builder<K, V> putAll(java.util.Map<? extends K, ? extends V> arg1){
      return (ImmutableBiMap.Builder) null;
    }
    public ImmutableBiMap<K, V> build(){
      return (ImmutableBiMap) null;
    }
  }
  // Constructors

  ImmutableBiMap(){
    super();
  }
  // Methods

  public V get(@javax.annotation.Nullable java.lang.Object arg1){
    return null;
  }
  public boolean equals(@javax.annotation.Nullable java.lang.Object arg1){
    return false;
  }
  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public ImmutableSet<V> values(){
    return (ImmutableSet) null;
  }
  public int hashCode(){
    return 0;
  }
  public static <K, V>ImmutableBiMap<K, V> copyOf(java.util.Map<? extends K, ? extends V> arg1){
    return (ImmutableBiMap) null;
  }
  public boolean isEmpty(){
    return false;
  }
  public ImmutableSet<java.util.Map.Entry<K, V>> entrySet(){
    return (ImmutableSet) null;
  }
  public int size(){
    return 0;
  }
  public ImmutableSet<K> keySet(){
    return (ImmutableSet) null;
  }
  public boolean containsKey(@javax.annotation.Nullable java.lang.Object arg1){
    return false;
  }
  public boolean containsValue(@javax.annotation.Nullable java.lang.Object arg1){
    return false;
  }
  public static <K, V>ImmutableBiMap<K, V> of(){
    return (ImmutableBiMap) null;
  }
  public static <K, V>ImmutableBiMap<K, V> of(K arg1, V arg2){
    return (ImmutableBiMap) null;
  }
  public static <K, V>ImmutableBiMap<K, V> of(K arg1, V arg2, K arg3, V arg4){
    return (ImmutableBiMap) null;
  }
  public static <K, V>ImmutableBiMap<K, V> of(K arg1, V arg2, K arg3, V arg4, K arg5, V arg6){
    return (ImmutableBiMap) null;
  }
  public static <K, V>ImmutableBiMap<K, V> of(K arg1, V arg2, K arg3, V arg4, K arg5, V arg6, K arg7, V arg8){
    return (ImmutableBiMap) null;
  }
  public static <K, V>ImmutableBiMap<K, V> of(K arg1, V arg2, K arg3, V arg4, K arg5, V arg6, K arg7, V arg8, K arg9, V arg10){
    return (ImmutableBiMap) null;
  }
  public V forcePut(K arg1, V arg2){
    return null;
  }
  public abstract ImmutableBiMap<V, K> inverse();
  public static <K, V>ImmutableBiMap.Builder<K, V> builder(){
    return (ImmutableBiMap.Builder) null;
  }
}
