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


public interface SetMultimap<K, V>
  extends Multimap<K, V>
{
  // Methods

  public java.util.Set<V> get(@javax.annotation.Nullable K arg1);
  public boolean equals(@javax.annotation.Nullable java.lang.Object arg1);
  public java.util.Set<V> removeAll(@javax.annotation.Nullable java.lang.Object arg1);
  public java.util.Set<java.util.Map.Entry<K, V>> entries();
  public java.util.Map<K, java.util.Collection<V>> asMap();
  public java.util.Set<V> replaceValues(K arg1, java.lang.Iterable<? extends V> arg2);
}
