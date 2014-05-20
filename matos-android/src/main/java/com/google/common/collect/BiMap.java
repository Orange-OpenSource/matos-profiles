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


public interface BiMap<K, V>
  extends java.util.Map<K, V>
{
  // Methods

  public V put(@javax.annotation.Nullable K arg1, @javax.annotation.Nullable V arg2);
  public java.util.Set<V> values();
  public void putAll(java.util.Map<? extends K, ? extends V> arg1);
  public V forcePut(@javax.annotation.Nullable K arg1, @javax.annotation.Nullable V arg2);
  public BiMap<V, K> inverse();
}
