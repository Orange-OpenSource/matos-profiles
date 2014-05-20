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


public final class LinkedListMultimap<K, V>
  implements java.io.Serializable, ListMultimap<K, V>
{
  // Constructors

  private LinkedListMultimap(){
  }
  private LinkedListMultimap(int arg1){
  }
  private LinkedListMultimap(Multimap<? extends K, ? extends V> arg1){
  }
  // Methods

  public java.util.List<V> get(@javax.annotation.Nullable K arg1){
    return (java.util.List) null;
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
  public java.util.List<V> removeAll(@javax.annotation.Nullable java.lang.Object arg1){
    return (java.util.List) null;
  }
  public static <K, V>LinkedListMultimap<K, V> create(){
    return (LinkedListMultimap) null;
  }
  public static <K, V>LinkedListMultimap<K, V> create(int arg1){
    return (LinkedListMultimap) null;
  }
  public static <K, V>LinkedListMultimap<K, V> create(Multimap<? extends K, ? extends V> arg1){
    return (LinkedListMultimap) null;
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
  public java.util.List<V> replaceValues(@javax.annotation.Nullable K arg1, java.lang.Iterable<? extends V> arg2){
    return (java.util.List) null;
  }
}
