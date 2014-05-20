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
public final class EnumHashBiMap<K extends java.lang.Enum, V>
  extends AbstractBiMap<K, V>{
  // Constructors

  private EnumHashBiMap(java.lang.Class<K> arg1){
    super((java.util.Map) null, (java.util.Map) null);
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.UseSuper
  public V put(K arg1, @javax.annotation.Nullable V arg2){
    return (V)null;
  }
  public static <K extends java.lang.Enum, V>EnumHashBiMap<K, V> create(java.lang.Class<K> arg1){
    return (EnumHashBiMap<K, V>) null;
  }
  public static <K extends java.lang.Enum, V>EnumHashBiMap<K, V> create(java.util.Map<K, ? extends V> arg1){
    return (EnumHashBiMap<K, V>) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code({"map.put(arg1,arg2);", "return map.get(arg1);"})
  public V forcePut(K arg1, @javax.annotation.Nullable V arg2){
    return (V)null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return (Class <K>) map.keySet().iterator().next().getClass();")
  public java.lang.Class<K> keyType(){
    return (java.lang.Class<K>) null;
  }
}
