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


public class ConcurrentHashMap<K, V>
  extends java.util.AbstractMap<K, V>  implements ConcurrentMap<K, V>, java.io.Serializable
{
  // Constructors

  public ConcurrentHashMap(int arg1, float arg2, int arg3){
    super();
  }
  public ConcurrentHashMap(int arg1, float arg2){
    super();
  }
  public ConcurrentHashMap(int arg1){
    super();
  }
  public ConcurrentHashMap(){
    super();
  }
  @com.francetelecom.rd.stubs.annotation.Code({"key = arg1.keySet().iterator().next();", "value = arg1.values().iterator().next();"})
  public ConcurrentHashMap(java.util.Map<? extends K, ? extends V> arg1){
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
  @com.francetelecom.rd.stubs.annotation.UseSuper
  public java.util.Collection<V> values(){
    return (java.util.Collection) null;
  }
  public void clear(){
  }
  public boolean contains(java.lang.Object arg1){
    return false;
  }
  public boolean isEmpty(){
    return false;
  }
  public boolean replace(K arg1, V arg2, @com.francetelecom.rd.stubs.annotation.FieldSet("value") V arg3){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("value")
  public V replace(K arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("value") V arg2){
    return null;
  }
  @com.francetelecom.rd.stubs.annotation.Code({"java.util.Set <java.util.Map.Entry<K,V>> result = new java.util.HashSet<java.util.Map.Entry<K,V>>();", "result.add(new EntryImplem(this));", "return result;"})
  public java.util.Set<java.util.Map.Entry<K, V>> entrySet(){
    return (java.util.Set) null;
  }
  @com.francetelecom.rd.stubs.annotation.UseSuper
  public void putAll(java.util.Map<? extends K, ? extends V> arg1){
  }
  public int size(){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("value")
  public V remove(java.lang.Object arg1){
    return null;
  }
  public boolean remove(java.lang.Object arg1, java.lang.Object arg2){
    return false;
  }
  public java.util.Enumeration<V> elements(){
    return (java.util.Enumeration) null;
  }
  @com.francetelecom.rd.stubs.annotation.UseSuper
  public java.util.Set<K> keySet(){
    return (java.util.Set) null;
  }
  public java.util.Enumeration<K> keys(){
    return (java.util.Enumeration) null;
  }
  public boolean containsKey(java.lang.Object arg1){
    return false;
  }
  public boolean containsValue(java.lang.Object arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("value")
  public V putIfAbsent(@com.francetelecom.rd.stubs.annotation.FieldSet("key") K arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("value") V arg2){
    return null;
  }
}
