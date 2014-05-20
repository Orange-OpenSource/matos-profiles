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


public final class LinkedHashMultimap<K, V>
  extends AbstractSetMultimap<K, V>{
  // Constructors

  private LinkedHashMultimap(){
    super((java.util.Map) null);
  }
  private LinkedHashMultimap(int arg1, int arg2){
    super((java.util.Map) null);
  }
  private LinkedHashMultimap(Multimap<? extends K, ? extends V> arg1){
    super((java.util.Map) null);
  }
  // Methods

  public java.util.Collection<V> values(){
    return (java.util.Collection) null;
  }
  public static <K, V>LinkedHashMultimap<K, V> create(){
    return (LinkedHashMultimap) null;
  }
  public static <K, V>LinkedHashMultimap<K, V> create(int arg1, int arg2){
    return (LinkedHashMultimap) null;
  }
  public static <K, V>LinkedHashMultimap<K, V> create(Multimap<? extends K, ? extends V> arg1){
    return (LinkedHashMultimap) null;
  }
  public java.util.Set<java.util.Map.Entry<K, V>> entries(){
    return (java.util.Set) null;
  }
  public java.util.Set<V> replaceValues(@javax.annotation.Nullable K arg1, java.lang.Iterable<? extends V> arg2){
    return (java.util.Set) null;
  }
}
