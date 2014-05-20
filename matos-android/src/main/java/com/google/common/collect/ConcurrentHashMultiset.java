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
public final class ConcurrentHashMultiset<E>
  extends AbstractMultiset<E>  implements java.io.Serializable
{
  // Constructors

  ConcurrentHashMultiset(java.util.concurrent.ConcurrentMap<E, java.lang.Integer> arg1){
    super();
  }
  // Methods

  public int add(E arg1, int arg2){
    return 0;
  }
  public int count(@javax.annotation.Nullable java.lang.Object arg1){
    return 0;
  }
  public java.util.Set<Multiset.Entry<E>> entrySet(){
    return (java.util.Set) null;
  }
  public int size(){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.UseSuper
  public java.lang.Object [] toArray(){
    return (java.lang.Object []) null;
  }
  @com.francetelecom.rd.stubs.annotation.UseSuper
  public <T>T [] toArray(T [] arg1){
    return (T []) null;
  }
  public int remove(@javax.annotation.Nullable java.lang.Object arg1, int arg2){
    return 0;
  }
  public static <E>ConcurrentHashMultiset<E> create(){
    return (ConcurrentHashMultiset) null;
  }
  public static <E>ConcurrentHashMultiset<E> create(java.lang.Iterable<? extends E> arg1){
    return (ConcurrentHashMultiset) null;
  }
  public int setCount(E arg1, int arg2){
    return 0;
  }
  public boolean setCount(E arg1, int arg2, int arg3){
    return false;
  }
  public boolean removeExactly(@javax.annotation.Nullable java.lang.Object arg1, int arg2){
    return false;
  }
}
