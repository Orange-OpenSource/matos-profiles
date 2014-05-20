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


public final class ArrayListMultimap<K, V>
  extends AbstractListMultimap<K, V>{
  // Constructors

  private ArrayListMultimap(){
    super((java.util.Map) null);
  }
  private ArrayListMultimap(int arg1, int arg2){
    super((java.util.Map) null);
  }
  private ArrayListMultimap(Multimap<? extends K, ? extends V> arg1){
    super((java.util.Map) null);
  }
  // Methods

  public void trimToSize(){
  }
  public static <K, V>ArrayListMultimap<K, V> create(){
    return (ArrayListMultimap) null;
  }
  public static <K, V>ArrayListMultimap<K, V> create(int arg1, int arg2){
    return (ArrayListMultimap) null;
  }
  public static <K, V>ArrayListMultimap<K, V> create(Multimap<? extends K, ? extends V> arg1){
    return (ArrayListMultimap) null;
  }
}
