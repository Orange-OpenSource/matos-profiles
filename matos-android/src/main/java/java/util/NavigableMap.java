package java.util;

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


public interface NavigableMap<K, V>
  extends SortedMap<K, V>
{
  // Methods

  public NavigableMap<K, V> headMap(K arg1, boolean arg2);
  public SortedMap<K, V> headMap(K arg1);
  public NavigableMap<K, V> subMap(K arg1, boolean arg2, K arg3, boolean arg4);
  public SortedMap<K, V> subMap(K arg1, K arg2);
  public NavigableMap<K, V> tailMap(K arg1, boolean arg2);
  public SortedMap<K, V> tailMap(K arg1);
  public NavigableMap<K, V> descendingMap();
  public Map.Entry<K, V> ceilingEntry(K arg1);
  public K ceilingKey(K arg1);
  public Map.Entry<K, V> lowerEntry(K arg1);
  public K lowerKey(K arg1);
  public Map.Entry<K, V> floorEntry(K arg1);
  public K floorKey(K arg1);
  public Map.Entry<K, V> higherEntry(K arg1);
  public K higherKey(K arg1);
  public Map.Entry<K, V> firstEntry();
  public Map.Entry<K, V> lastEntry();
  public Map.Entry<K, V> pollFirstEntry();
  public Map.Entry<K, V> pollLastEntry();
  public NavigableSet<K> navigableKeySet();
  public NavigableSet<K> descendingKeySet();
}
