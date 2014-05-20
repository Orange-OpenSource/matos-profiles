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


@com.francetelecom.rd.stubs.annotation.Field(type = "java.util.Map<K, V>", value = "map", modifier = 4)
public abstract class ForwardingMap<K, V>
  extends ForwardingObject  implements java.util.Map<K, V>
{
  // Constructors

  @com.francetelecom.rd.stubs.annotation.Code("map = delegate();")
  public ForwardingMap(){
    super();
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.Code("return map.get(arg1);")
  public V get(java.lang.Object arg1){
    return null;
  }
  @com.francetelecom.rd.stubs.annotation.Code({"map.put(arg1,arg2);", "return map.get(arg2);"})
  public V put(K arg1, V arg2){
    return null;
  }
  public boolean equals(@javax.annotation.Nullable java.lang.Object arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return map.values();")
  public java.util.Collection<V> values(){
    return (java.util.Collection) null;
  }
  public int hashCode(){
    return 0;
  }
  public void clear(){
  }
  public boolean isEmpty(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return map.entrySet();")
  public java.util.Set<java.util.Map.Entry<K, V>> entrySet(){
    return (java.util.Set) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("put(arg1.keySet().iterator().next(), arg1.values().iterator().next());")
  public void putAll(java.util.Map<? extends K, ? extends V> arg1){
  }
  public int size(){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return map.remove(arg1);")
  public V remove(java.lang.Object arg1){
    return null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return map.keySet();")
  public java.util.Set<K> keySet(){
    return (java.util.Set) null;
  }
  public boolean containsKey(java.lang.Object arg1){
    return false;
  }
  public boolean containsValue(java.lang.Object arg1){
    return false;
  }
  protected abstract java.util.Map<K, V> delegate();
}
