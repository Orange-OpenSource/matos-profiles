package java.util.concurrent;

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


public interface ConcurrentNavigableMap<K, V>
  extends ConcurrentMap<K, V>, java.util.NavigableMap<K, V>
{
  // Methods

  public java.util.NavigableSet<K> keySet();
  public ConcurrentNavigableMap<K, V> headMap(K arg1, boolean arg2);
  public ConcurrentNavigableMap<K, V> headMap(K arg1);
  public ConcurrentNavigableMap<K, V> subMap(K arg1, boolean arg2, K arg3, boolean arg4);
  public ConcurrentNavigableMap<K, V> subMap(K arg1, K arg2);
  public ConcurrentNavigableMap<K, V> tailMap(K arg1, boolean arg2);
  public ConcurrentNavigableMap<K, V> tailMap(K arg1);
  public ConcurrentNavigableMap<K, V> descendingMap();
  public java.util.NavigableSet<K> navigableKeySet();
  public java.util.NavigableSet<K> descendingKeySet();
}
