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

import java.lang.reflect.Modifier;

import com.francetelecom.rd.stubs.annotation.Code;
import com.francetelecom.rd.stubs.annotation.Field;
import com.francetelecom.rd.stubs.annotation.Fields;
import com.francetelecom.rd.stubs.annotation.Real;


@Real("com.francetelecom.rd.fakeandroid.AbstractMultimapImpl")

@Fields({
	@Field(value="values", type="java.util.HashSet<V>", modifier= Modifier.PRIVATE),
	@Field(value="keys", type="K", modifier= Modifier.PRIVATE)
})
public abstract class AbstractMultimap<K, V>
  implements Multimap<K, V>, java.io.Serializable
{
  // Constructors

  protected AbstractMultimap(java.util.Map<K, java.util.Collection<V>> arg1){
  }
  // Methods

  @Code("return values;")
  public java.util.Collection<V> get(@javax.annotation.Nullable K arg1){
    return (java.util.Collection) null;
  }
  public boolean put(@javax.annotation.Nullable K arg1, @javax.annotation.Nullable V arg2){
    return false;
  }
  public boolean equals(@javax.annotation.Nullable java.lang.Object arg1){
    return false;
  }
  public java.lang.String toString(){
    return (java.lang.String) null;
  }
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
  public boolean putAll(@javax.annotation.Nullable K arg1, java.lang.Iterable<? extends V> arg2){
    return false;
  }
  public boolean putAll(Multimap<? extends K, ? extends V> arg1){
    return false;
  }
  public int size(){
    return 0;
  }
  public boolean remove(@javax.annotation.Nullable java.lang.Object arg1, @javax.annotation.Nullable java.lang.Object arg2){
    return false;
  }
  public java.util.Set<K> keySet(){
    return (java.util.Set) null;
  }
  public Multiset<K> keys(){
    return (Multiset) null;
  }
  public boolean containsKey(@javax.annotation.Nullable java.lang.Object arg1){
    return false;
  }
  public boolean containsValue(@javax.annotation.Nullable java.lang.Object arg1){
    return false;
  }
  public java.util.Collection<V> removeAll(@javax.annotation.Nullable java.lang.Object arg1){
    return (java.util.Collection) null;
  }
  public java.util.Collection<java.util.Map.Entry<K, V>> entries(){
    return (java.util.Collection) null;
  }
  public boolean containsEntry(@javax.annotation.Nullable java.lang.Object arg1, @javax.annotation.Nullable java.lang.Object arg2){
    return false;
  }
  public java.util.Map<K, java.util.Collection<V>> asMap(){
    return (java.util.Map) null;
  }
  public java.util.Collection<V> replaceValues(@javax.annotation.Nullable K arg1, java.lang.Iterable<? extends V> arg2){
    return (java.util.Collection) null;
  }
}
