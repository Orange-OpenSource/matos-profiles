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


public class ImmutableListMultimap<K, V>
  extends ImmutableMultimap<K, V>  implements ListMultimap<K, V>
{
  // Classes

  public static final class Builder<K, V>
    extends ImmutableMultimap.Builder<K, V>  {
    // Constructors

    public Builder(){
      super();
    }
    // Methods

    public ImmutableListMultimap.Builder<K, V> put(K arg1, V arg2){
      return (ImmutableListMultimap.Builder) null;
    }
    public ImmutableListMultimap.Builder<K, V> putAll(K arg1, java.lang.Iterable<? extends V> arg2){
      return (ImmutableListMultimap.Builder) null;
    }
    public ImmutableListMultimap.Builder<K, V> putAll(K arg1, V [] arg2){
      return (ImmutableListMultimap.Builder) null;
    }
    public ImmutableListMultimap.Builder<K, V> putAll(Multimap<? extends K, ? extends V> arg1){
      return (ImmutableListMultimap.Builder) null;
    }
    public ImmutableListMultimap<K, V> build(){
      return (ImmutableListMultimap) null;
    }
  }
  // Constructors

  ImmutableListMultimap(ImmutableMap<K, ImmutableList<V>> arg1, int arg2){
    super((ImmutableMap) null, 0);
  }
  // Methods

  public ImmutableList<V> get(@javax.annotation.Nullable K arg1){
    return (ImmutableList) null;
  }
  public static <K, V>ImmutableListMultimap<K, V> copyOf(Multimap<? extends K, ? extends V> arg1){
    return (ImmutableListMultimap) null;
  }
  public ImmutableList<V> removeAll(java.lang.Object arg1){
    return (ImmutableList) null;
  }
  public static <K, V>ImmutableListMultimap<K, V> of(){
    return (ImmutableListMultimap) null;
  }
  public static <K, V>ImmutableListMultimap<K, V> of(K arg1, V arg2){
    return (ImmutableListMultimap) null;
  }
  public static <K, V>ImmutableListMultimap<K, V> of(K arg1, V arg2, K arg3, V arg4){
    return (ImmutableListMultimap) null;
  }
  public static <K, V>ImmutableListMultimap<K, V> of(K arg1, V arg2, K arg3, V arg4, K arg5, V arg6){
    return (ImmutableListMultimap) null;
  }
  public static <K, V>ImmutableListMultimap<K, V> of(K arg1, V arg2, K arg3, V arg4, K arg5, V arg6, K arg7, V arg8){
    return (ImmutableListMultimap) null;
  }
  public static <K, V>ImmutableListMultimap<K, V> of(K arg1, V arg2, K arg3, V arg4, K arg5, V arg6, K arg7, V arg8, K arg9, V arg10){
    return (ImmutableListMultimap) null;
  }
  public static <K, V>ImmutableListMultimap.Builder<K, V> builder(){
    return (ImmutableListMultimap.Builder) null;
  }
  public ImmutableList<V> replaceValues(K arg1, java.lang.Iterable<? extends V> arg2){
    return (ImmutableList) null;
  }
}
