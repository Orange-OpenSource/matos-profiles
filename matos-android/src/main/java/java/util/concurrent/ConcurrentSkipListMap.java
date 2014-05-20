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


public class ConcurrentSkipListMap<K, V>
  extends java.util.AbstractMap<K, V>  implements ConcurrentNavigableMap<K, V>, java.io.Serializable, java.lang.Cloneable
{
  // Constructors

  public ConcurrentSkipListMap(){
    super();
  }
  public ConcurrentSkipListMap(java.util.Comparator<? super K> arg1){
    super();
  }
  public ConcurrentSkipListMap(java.util.Map<? extends K, ? extends V> arg1){
    super();
  }
  public ConcurrentSkipListMap(java.util.SortedMap<K, ? extends V> arg1){
    super();
  }
  // Methods

  public V get(java.lang.Object arg1){
    return null;
  }
  public V put(K arg1, V arg2){
    return null;
  }
  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public java.util.Collection<V> values(){
    return (java.util.Collection) null;
  }
  public ConcurrentSkipListMap<K, V> clone(){
    return (ConcurrentSkipListMap) null;
  }
  public void clear(){
  }
  public boolean isEmpty(){
    return false;
  }
  public boolean replace(K arg1, V arg2, V arg3){
    return false;
  }
  public V replace(K arg1, V arg2){
    return null;
  }
  public java.util.Set<java.util.Map.Entry<K, V>> entrySet(){
    return (java.util.Set) null;
  }
  public int size(){
    return 0;
  }
  public V remove(java.lang.Object arg1){
    return null;
  }
  public boolean remove(java.lang.Object arg1, java.lang.Object arg2){
    return false;
  }
  public java.util.NavigableSet<K> keySet(){
    return (java.util.NavigableSet) null;
  }
  public boolean containsKey(java.lang.Object arg1){
    return false;
  }
  public boolean containsValue(java.lang.Object arg1){
    return false;
  }
  public V putIfAbsent(K arg1, V arg2){
    return null;
  }
  public java.util.Comparator<? super K> comparator(){
    return (java.util.Comparator) null;
  }
  public K firstKey(){
    return null;
  }
  public ConcurrentNavigableMap<K, V> headMap(K arg1, boolean arg2){
    return (ConcurrentNavigableMap) null;
  }
  public ConcurrentNavigableMap<K, V> headMap(K arg1){
    return (ConcurrentNavigableMap) null;
  }
  public K lastKey(){
    return null;
  }
  public ConcurrentNavigableMap<K, V> subMap(K arg1, boolean arg2, K arg3, boolean arg4){
    return (ConcurrentNavigableMap) null;
  }
  public ConcurrentNavigableMap<K, V> subMap(K arg1, K arg2){
    return (ConcurrentNavigableMap) null;
  }
  public ConcurrentNavigableMap<K, V> tailMap(K arg1, boolean arg2){
    return (ConcurrentNavigableMap) null;
  }
  public ConcurrentNavigableMap<K, V> tailMap(K arg1){
    return (ConcurrentNavigableMap) null;
  }
  public ConcurrentNavigableMap<K, V> descendingMap(){
    return (ConcurrentNavigableMap) null;
  }
  public java.util.Map.Entry<K, V> ceilingEntry(K arg1){
    return (java.util.Map.Entry) null;
  }
  public K ceilingKey(K arg1){
    return null;
  }
  public java.util.Map.Entry<K, V> lowerEntry(K arg1){
    return (java.util.Map.Entry) null;
  }
  public K lowerKey(K arg1){
    return null;
  }
  public java.util.Map.Entry<K, V> floorEntry(K arg1){
    return (java.util.Map.Entry) null;
  }
  public K floorKey(K arg1){
    return null;
  }
  public java.util.Map.Entry<K, V> higherEntry(K arg1){
    return (java.util.Map.Entry) null;
  }
  public K higherKey(K arg1){
    return null;
  }
  public java.util.Map.Entry<K, V> firstEntry(){
    return (java.util.Map.Entry) null;
  }
  public java.util.Map.Entry<K, V> lastEntry(){
    return (java.util.Map.Entry) null;
  }
  public java.util.Map.Entry<K, V> pollFirstEntry(){
    return (java.util.Map.Entry) null;
  }
  public java.util.Map.Entry<K, V> pollLastEntry(){
    return (java.util.Map.Entry) null;
  }
  public java.util.NavigableSet<K> navigableKeySet(){
    return (java.util.NavigableSet) null;
  }
  public java.util.NavigableSet<K> descendingKeySet(){
    return (java.util.NavigableSet) null;
  }
}
