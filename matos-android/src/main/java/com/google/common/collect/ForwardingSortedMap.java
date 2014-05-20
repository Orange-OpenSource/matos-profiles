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


@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.ForwardingSortedMapImplem", superClass = "")
public abstract class ForwardingSortedMap<K, V>
  extends ForwardingMap<K, V>  implements java.util.SortedMap<K, V>
{
  // Constructors

  public ForwardingSortedMap(){
    super();
  }
  // Methods

  protected abstract java.util.SortedMap<K, V> delegate();
  public java.util.Comparator<? super K> comparator(){
    return (java.util.Comparator) null;
  }
  public K firstKey(){
    return null;
  }
  public java.util.SortedMap<K, V> headMap(K arg1){
    return (java.util.SortedMap) null;
  }
  public K lastKey(){
    return null;
  }
  public java.util.SortedMap<K, V> subMap(K arg1, K arg2){
    return (java.util.SortedMap) null;
  }
  public java.util.SortedMap<K, V> tailMap(K arg1){
    return (java.util.SortedMap) null;
  }
}
