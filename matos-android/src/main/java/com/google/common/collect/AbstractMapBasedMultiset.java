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


public abstract class AbstractMapBasedMultiset<E>
  extends java.util.AbstractCollection<E>  implements java.io.Serializable, Multiset<E>
{
  // Constructors

  protected AbstractMapBasedMultiset(java.util.Map<E, java.util.concurrent.atomic.AtomicInteger> arg1){
    super();
  }
  // Methods

  public int add(@javax.annotation.Nullable E arg1, int arg2){
    return 0;
  }
  public boolean add(@javax.annotation.Nullable E arg1){
    return false;
  }
  public boolean equals(@javax.annotation.Nullable java.lang.Object arg1){
    return false;
  }
  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public int hashCode(){
    return 0;
  }
  public void clear(){
  }
  public boolean contains(@javax.annotation.Nullable java.lang.Object arg1){
    return false;
  }
  public int count(@javax.annotation.Nullable java.lang.Object arg1){
    return 0;
  }
  public boolean isEmpty(){
    return false;
  }
  public boolean addAll(java.util.Collection<? extends E> arg1){
    return false;
  }
  public java.util.Set<Multiset.Entry<E>> entrySet(){
    return (java.util.Set) null;
  }
  public java.util.Iterator<E> iterator(){
    return (java.util.Iterator) null;
  }
  public int size(){
    return 0;
  }
  public int remove(@javax.annotation.Nullable java.lang.Object arg1, int arg2){
    return 0;
  }
  public boolean remove(java.lang.Object arg1){
    return false;
  }
  public boolean containsAll(java.util.Collection<?> arg1){
    return false;
  }
  public boolean removeAll(java.util.Collection<?> arg1){
    return false;
  }
  public boolean retainAll(java.util.Collection<?> arg1){
    return false;
  }
  public int setCount(E arg1, int arg2){
    return 0;
  }
  public boolean setCount(E arg1, int arg2, int arg3){
    return false;
  }
  public java.util.Set<E> elementSet(){
    return (java.util.Set) null;
  }
}
