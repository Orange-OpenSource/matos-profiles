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


@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.ForwardingListImplem", superClass = "")
public abstract class ForwardingList<E>
  extends ForwardingCollection<E>  implements java.util.List<E>
{
  // Constructors

  public ForwardingList(){
    super();
  }
  // Methods

  public void add(int arg1, E arg2){
  }
  public E get(int arg1){
    return null;
  }
  public boolean equals(@javax.annotation.Nullable java.lang.Object arg1){
    return false;
  }
  public int hashCode(){
    return 0;
  }
  public int indexOf(java.lang.Object arg1){
    return 0;
  }
  public int lastIndexOf(java.lang.Object arg1){
    return 0;
  }
  public boolean addAll(int arg1, java.util.Collection<? extends E> arg2){
    return false;
  }
  public E remove(int arg1){
    return null;
  }
  public E set(int arg1, E arg2){
    return null;
  }
  public java.util.ListIterator<E> listIterator(){
    return (java.util.ListIterator) null;
  }
  public java.util.ListIterator<E> listIterator(int arg1){
    return (java.util.ListIterator) null;
  }
  public java.util.List<E> subList(int arg1, int arg2){
    return (java.util.List) null;
  }
  protected abstract java.util.List<E> delegate();
}
