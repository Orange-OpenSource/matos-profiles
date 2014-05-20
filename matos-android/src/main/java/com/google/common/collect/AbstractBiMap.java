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


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public abstract class AbstractBiMap<K, V>
  extends ForwardingMap<K, V>  implements BiMap<K, V>, java.io.Serializable
{
  // Constructors

  AbstractBiMap(java.util.Map<K, V> arg1, java.util.Map<V, K> arg2){
    super();
  }
  // Methods

  public V put(K arg1, V arg2){
    return null;
  }
  public java.util.Set<V> values(){
    return (java.util.Set) null;
  }
  public void clear(){
  }
  @com.francetelecom.rd.stubs.annotation.UseSuper
  public java.util.Set<java.util.Map.Entry<K, V>> entrySet(){
    return (java.util.Set) null;
  }
  @com.francetelecom.rd.stubs.annotation.UseSuper
  public void putAll(java.util.Map<? extends K, ? extends V> arg1){
  }
  public V remove(java.lang.Object arg1){
    return (V)null;
  }
  @com.francetelecom.rd.stubs.annotation.UseSuper
  public java.util.Set<K> keySet(){
    return (java.util.Set) null;
  }
  public boolean containsValue(java.lang.Object arg1){
    return false;
  }
  protected java.util.Map<K, V> delegate(){
    return (java.util.Map) null;
  }
  public V forcePut(K arg1, V arg2){
    return null;
  }
  public BiMap<V, K> inverse(){
    return (BiMap) null;
  }
}
