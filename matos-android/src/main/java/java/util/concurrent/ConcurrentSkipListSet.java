package java.util.concurrent;

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


public class ConcurrentSkipListSet<E>
  extends java.util.AbstractSet<E>  implements java.util.NavigableSet<E>, java.io.Serializable, java.lang.Cloneable
{
  // Constructors

  public ConcurrentSkipListSet(){
    super();
  }
  public ConcurrentSkipListSet(java.util.Comparator<? super E> arg1){
    super();
  }
  public ConcurrentSkipListSet(java.util.Collection<? extends E> arg1){
    super();
  }
  public ConcurrentSkipListSet(java.util.SortedSet<E> arg1){
    super();
  }
  ConcurrentSkipListSet(ConcurrentNavigableMap<E, java.lang.Object> arg1){
    super();
  }
  // Methods

  public boolean add(E arg1){
    return false;
  }
  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public ConcurrentSkipListSet<E> clone(){
    return (ConcurrentSkipListSet) null;
  }
  public void clear(){
  }
  public boolean contains(java.lang.Object arg1){
    return false;
  }
  public boolean isEmpty(){
    return false;
  }
  public java.util.Iterator<E> iterator(){
    return (java.util.Iterator) null;
  }
  public int size(){
    return 0;
  }
  public boolean remove(java.lang.Object arg1){
    return false;
  }
  public boolean removeAll(java.util.Collection<?> arg1){
    return false;
  }
  public E floor(E arg1){
    return null;
  }
  public E first(){
    return null;
  }
  public E last(){
    return null;
  }
  public java.util.Comparator<? super E> comparator(){
    return (java.util.Comparator) null;
  }
  public E pollFirst(){
    return null;
  }
  public E pollLast(){
    return null;
  }
  public java.util.Iterator<E> descendingIterator(){
    return (java.util.Iterator) null;
  }
  public java.util.NavigableSet<E> headSet(E arg1, boolean arg2){
    return (java.util.NavigableSet) null;
  }
  public java.util.NavigableSet<E> headSet(E arg1){
    return (java.util.NavigableSet) null;
  }
  public java.util.NavigableSet<E> subSet(E arg1, boolean arg2, E arg3, boolean arg4){
    return (java.util.NavigableSet) null;
  }
  public java.util.NavigableSet<E> subSet(E arg1, E arg2){
    return (java.util.NavigableSet) null;
  }
  public java.util.NavigableSet<E> tailSet(E arg1, boolean arg2){
    return (java.util.NavigableSet) null;
  }
  public java.util.NavigableSet<E> tailSet(E arg1){
    return (java.util.NavigableSet) null;
  }
  public java.util.NavigableSet<E> descendingSet(){
    return (java.util.NavigableSet) null;
  }
  public E higher(E arg1){
    return null;
  }
  public E lower(E arg1){
    return null;
  }
  public E ceiling(E arg1){
    return null;
  }
}
