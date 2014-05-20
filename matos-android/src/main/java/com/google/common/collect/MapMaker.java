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


public final class MapMaker
{
  // Constructors

  public MapMaker(){
  }
  // Methods

  public <K, V>java.util.concurrent.ConcurrentMap<K, V> makeMap(){
    return (java.util.concurrent.ConcurrentMap) null;
  }
  public MapMaker expiration(long arg1, java.util.concurrent.TimeUnit arg2){
    return (MapMaker) null;
  }
  public MapMaker initialCapacity(int arg1){
    return (MapMaker) null;
  }
  public MapMaker weakKeys(){
    return (MapMaker) null;
  }
  public MapMaker concurrencyLevel(int arg1){
    return (MapMaker) null;
  }
  public <K, V>java.util.concurrent.ConcurrentMap<K, V> makeComputingMap(com.google.common.base.Function<? super K, ? extends V> arg1){
    return (java.util.concurrent.ConcurrentMap) null;
  }
  public MapMaker softKeys(){
    return (MapMaker) null;
  }
  public MapMaker weakValues(){
    return (MapMaker) null;
  }
  public MapMaker softValues(){
    return (MapMaker) null;
  }
}
