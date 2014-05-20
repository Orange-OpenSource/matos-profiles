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


public interface Map<K, V>
{
  // Classes

  public static interface Entry<K, V>
  {
    // Methods

    public boolean equals(java.lang.Object arg1);
    public int hashCode();
    public V getValue();
    public K getKey();
    public V setValue(V arg1);
  }
  // Methods

  public V get(java.lang.Object arg1);
  public V put(K arg1, V arg2);
  public boolean equals(java.lang.Object arg1);
  public Collection<V> values();
  public int hashCode();
  public void clear();
  public boolean isEmpty();
  public Set<Map.Entry<K, V>> entrySet();
  public void putAll(Map<? extends K, ? extends V> arg1);
  public int size();
  public V remove(java.lang.Object arg1);
  public Set<K> keySet();
  public boolean containsKey(java.lang.Object arg1);
  public boolean containsValue(java.lang.Object arg1);
}
