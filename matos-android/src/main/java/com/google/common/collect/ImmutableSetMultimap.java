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


public class ImmutableSetMultimap<K, V>
  extends ImmutableMultimap<K, V>  implements SetMultimap<K, V>
{
  // Classes

  public static final class Builder<K, V>
    extends ImmutableMultimap.Builder<K, V>  {
    // Constructors

    public Builder(){
      super();
    }
    // Methods

    public ImmutableSetMultimap.Builder<K, V> put(K arg1, V arg2){
      return (ImmutableSetMultimap.Builder) null;
    }
    public ImmutableSetMultimap.Builder<K, V> putAll(K arg1, java.lang.Iterable<? extends V> arg2){
      return (ImmutableSetMultimap.Builder) null;
    }
    public ImmutableSetMultimap.Builder<K, V> putAll(K arg1, V [] arg2){
      return (ImmutableSetMultimap.Builder) null;
    }
    public ImmutableSetMultimap.Builder<K, V> putAll(Multimap<? extends K, ? extends V> arg1){
      return (ImmutableSetMultimap.Builder) null;
    }
    public ImmutableSetMultimap<K, V> build(){
      return (ImmutableSetMultimap) null;
    }
  }
  // Constructors

  ImmutableSetMultimap(ImmutableMap<K, ImmutableSet<V>> arg1, int arg2){
    super((ImmutableMap) null, 0);
  }
  // Methods

  public ImmutableSet<V> get(@javax.annotation.Nullable K arg1){
    return (ImmutableSet) null;
  }
  public static <K, V>ImmutableSetMultimap<K, V> copyOf(Multimap<? extends K, ? extends V> arg1){
    return (ImmutableSetMultimap) null;
  }
  public ImmutableSet<V> removeAll(java.lang.Object arg1){
    return (ImmutableSet) null;
  }
  public ImmutableSet<java.util.Map.Entry<K, V>> entries(){
    return (ImmutableSet) null;
  }
  public static <K, V>ImmutableSetMultimap<K, V> of(){
    return (ImmutableSetMultimap) null;
  }
  public static <K, V>ImmutableSetMultimap<K, V> of(K arg1, V arg2){
    return (ImmutableSetMultimap) null;
  }
  public static <K, V>ImmutableSetMultimap<K, V> of(K arg1, V arg2, K arg3, V arg4){
    return (ImmutableSetMultimap) null;
  }
  public static <K, V>ImmutableSetMultimap<K, V> of(K arg1, V arg2, K arg3, V arg4, K arg5, V arg6){
    return (ImmutableSetMultimap) null;
  }
  public static <K, V>ImmutableSetMultimap<K, V> of(K arg1, V arg2, K arg3, V arg4, K arg5, V arg6, K arg7, V arg8){
    return (ImmutableSetMultimap) null;
  }
  public static <K, V>ImmutableSetMultimap<K, V> of(K arg1, V arg2, K arg3, V arg4, K arg5, V arg6, K arg7, V arg8, K arg9, V arg10){
    return (ImmutableSetMultimap) null;
  }
  public static <K, V>ImmutableSetMultimap.Builder<K, V> builder(){
    return (ImmutableSetMultimap.Builder) null;
  }
  public ImmutableSet<V> replaceValues(K arg1, java.lang.Iterable<? extends V> arg2){
    return (ImmutableSet) null;
  }
}
