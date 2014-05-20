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


public interface Multimap<K, V>
{
  // Methods

  public java.util.Collection<V> get(@javax.annotation.Nullable K arg1);
  public boolean put(@javax.annotation.Nullable K arg1, @javax.annotation.Nullable V arg2);
  public boolean equals(@javax.annotation.Nullable java.lang.Object arg1);
  public java.util.Collection<V> values();
  public int hashCode();
  public void clear();
  public boolean isEmpty();
  public boolean putAll(@javax.annotation.Nullable K arg1, java.lang.Iterable<? extends V> arg2);
  public boolean putAll(Multimap<? extends K, ? extends V> arg1);
  public int size();
  public boolean remove(@javax.annotation.Nullable java.lang.Object arg1, @javax.annotation.Nullable java.lang.Object arg2);
  public java.util.Set<K> keySet();
  public Multiset<K> keys();
  public boolean containsKey(@javax.annotation.Nullable java.lang.Object arg1);
  public boolean containsValue(@javax.annotation.Nullable java.lang.Object arg1);
  public java.util.Collection<V> removeAll(@javax.annotation.Nullable java.lang.Object arg1);
  public java.util.Collection<java.util.Map.Entry<K, V>> entries();
  public boolean containsEntry(@javax.annotation.Nullable java.lang.Object arg1, @javax.annotation.Nullable java.lang.Object arg2);
  public java.util.Map<K, java.util.Collection<V>> asMap();
  public java.util.Collection<V> replaceValues(@javax.annotation.Nullable K arg1, java.lang.Iterable<? extends V> arg2);
}
