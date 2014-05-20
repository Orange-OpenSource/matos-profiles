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


@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.ForwardingConcurrentMapImplem", superClass = "")
public abstract class ForwardingConcurrentMap<K, V>
  extends ForwardingMap<K, V>  implements java.util.concurrent.ConcurrentMap<K, V>
{
  // Constructors

  public ForwardingConcurrentMap(){
    super();
  }
  // Methods

  public V replace(K arg1, V arg2){
    return null;
  }
  public boolean replace(K arg1, V arg2, V arg3){
    return false;
  }
  public boolean remove(java.lang.Object arg1, java.lang.Object arg2){
    return false;
  }
  protected abstract java.util.concurrent.ConcurrentMap<K, V> delegate();
  public V putIfAbsent(K arg1, V arg2){
    return null;
  }
}
