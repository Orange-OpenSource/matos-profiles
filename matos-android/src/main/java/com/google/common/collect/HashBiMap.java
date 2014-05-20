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


public final class HashBiMap<K, V>
  extends AbstractBiMap<K, V>{
  // Constructors

  private HashBiMap(){
    super((java.util.Map) null, (java.util.Map) null);
  }
  private HashBiMap(int arg1){
    super((java.util.Map) null, (java.util.Map) null);
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.UseSuper
  public V put(@javax.annotation.Nullable K arg1, @javax.annotation.Nullable V arg2){
    return null;
  }
  public static <K, V>HashBiMap<K, V> create(){
    return (HashBiMap) null;
  }
  public static <K, V>HashBiMap<K, V> create(int arg1){
    return (HashBiMap) null;
  }
  public static <K, V>HashBiMap<K, V> create(java.util.Map<? extends K, ? extends V> arg1){
    return (HashBiMap) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code({"map.put(arg1,arg2);", "return map.get(arg1);"})
  public V forcePut(@javax.annotation.Nullable K arg1, @javax.annotation.Nullable V arg2){
    return null;
  }
}
