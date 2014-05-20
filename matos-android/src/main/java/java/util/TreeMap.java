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


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public class TreeMap<K, V>
  extends AbstractMap<K, V>  implements java.io.Serializable, NavigableMap<K, V>, java.lang.Cloneable, SortedMap<K, V>
{
  // Constructors

  public TreeMap(){
    super();
  }
  @com.francetelecom.rd.stubs.annotation.Code({"key = arg1.keySet().iterator().next();", "value = arg1.values().iterator().next();"})
  public TreeMap(Map<? extends K, ? extends V> arg1){
    super();
  }
  public TreeMap(Comparator<? super K> arg1){
    super();
  }
  @com.francetelecom.rd.stubs.annotation.Code({"key = arg1.keySet().iterator().next();", "value = arg1.values().iterator().next();"})
  public TreeMap(SortedMap<K, ? extends V> arg1){
    super();
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.UseSuper
  public V get(java.lang.Object arg1){
    return null;
  }
  @com.francetelecom.rd.stubs.annotation.UseSuper
  public V put(K arg1, V arg2){
    return null;
  }
  public java.lang.Object clone(){
    return (java.lang.Object) null;
  }
  public void clear(){
  }
  public boolean isEmpty(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.Code({"Set <Map.Entry<K,V>> result = new HashSet<Map.Entry<K,V>>();", "result.add(new EntryImplem(this));", "return result;"})
  public Set<Map.Entry<K, V>> entrySet(){
    return (Set) null;
  }
  public int size(){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.UseSuper
  public V remove(java.lang.Object arg1){
    return null;
  }
  @com.francetelecom.rd.stubs.annotation.UseSuper
  public Set<K> keySet(){
    return (Set) null;
  }
  public boolean containsKey(java.lang.Object arg1){
    return false;
  }
  public Comparator<? super K> comparator(){
    return (Comparator) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("key")
  public K firstKey(){
    return null;
  }
  public NavigableMap<K, V> headMap(K arg1, boolean arg2){
    return (NavigableMap) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return new TreeMap(this);")
  public SortedMap<K, V> headMap(K arg1){
    return (SortedMap) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("key")
  public K lastKey(){
    return null;
  }
  public NavigableMap<K, V> subMap(K arg1, boolean arg2, K arg3, boolean arg4){
    return (NavigableMap) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return new TreeMap(this);")
  public SortedMap<K, V> subMap(K arg1, K arg2){
    return (SortedMap) null;
  }
  public NavigableMap<K, V> tailMap(K arg1, boolean arg2){
    return (NavigableMap) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return new TreeMap(this);")
  public SortedMap<K, V> tailMap(K arg1){
    return (SortedMap) null;
  }
  public NavigableMap<K, V> descendingMap(){
    return (NavigableMap) null;
  }
  public Map.Entry<K, V> ceilingEntry(K arg1){
    return (Map.Entry) null;
  }
  public K ceilingKey(K arg1){
    return null;
  }
  public Map.Entry<K, V> lowerEntry(K arg1){
    return (Map.Entry) null;
  }
  public K lowerKey(K arg1){
    return null;
  }
  public Map.Entry<K, V> floorEntry(K arg1){
    return (Map.Entry) null;
  }
  public K floorKey(K arg1){
    return null;
  }
  public Map.Entry<K, V> higherEntry(K arg1){
    return (Map.Entry) null;
  }
  public K higherKey(K arg1){
    return null;
  }
  public Map.Entry<K, V> firstEntry(){
    return (Map.Entry) null;
  }
  public Map.Entry<K, V> lastEntry(){
    return (Map.Entry) null;
  }
  public Map.Entry<K, V> pollFirstEntry(){
    return (Map.Entry) null;
  }
  public Map.Entry<K, V> pollLastEntry(){
    return (Map.Entry) null;
  }
  public NavigableSet<K> navigableKeySet(){
    return (NavigableSet) null;
  }
  public NavigableSet<K> descendingKeySet(){
    return (NavigableSet) null;
  }
}
