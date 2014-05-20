package java.util;

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
public class TreeSet<E>
  extends AbstractSet<E>  implements NavigableSet<E>, java.io.Serializable, java.lang.Cloneable
{
  // Constructors

  TreeSet(NavigableMap<E, java.lang.Object> arg1){
    super();
  }
  public TreeSet(){
    super();
  }
  @com.francetelecom.rd.stubs.annotation.Code("content = arg1.iterator().next();")
  public TreeSet(Collection<? extends E> arg1){
    super();
  }
  public TreeSet(Comparator<? super E> arg1){
    super();
  }
  @com.francetelecom.rd.stubs.annotation.Code("content = arg1.iterator().next();")
  public TreeSet(SortedSet<E> arg1){
    super();
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.UseSuper
  public boolean add(E arg1){
    return false;
  }
  public java.lang.Object clone(){
    return (java.lang.Object) null;
  }
  public void clear(){
  }
  public boolean contains(java.lang.Object arg1){
    return false;
  }
  public boolean isEmpty(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.UseSuper
  public boolean addAll(Collection<? extends E> arg1){
    return false;
  }
  public Iterator<E> iterator(){
    return (Iterator) null;
  }
  public int size(){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.UseSuper
  public boolean remove(java.lang.Object arg1){
    return false;
  }
  public E floor(E arg1){
    return null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("content")
  public E first(){
    return null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("content")
  public E last(){
    return null;
  }
  public Comparator<? super E> comparator(){
    return (Comparator) null;
  }
  public E pollFirst(){
    return null;
  }
  public E pollLast(){
    return null;
  }
  public Iterator<E> descendingIterator(){
    return (Iterator) null;
  }
  public NavigableSet<E> headSet(E arg1, boolean arg2){
    return (NavigableSet) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return new TreeSet(this);")
  public SortedSet<E> headSet(E arg1){
    return (SortedSet) null;
  }
  public NavigableSet<E> subSet(E arg1, boolean arg2, E arg3, boolean arg4){
    return (NavigableSet) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return new TreeSet(this);")
  public SortedSet<E> subSet(E arg1, E arg2){
    return (SortedSet) null;
  }
  public NavigableSet<E> tailSet(E arg1, boolean arg2){
    return (NavigableSet) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return new TreeSet(this);")
  public SortedSet<E> tailSet(E arg1){
    return (SortedSet) null;
  }
  public NavigableSet<E> descendingSet(){
    return (NavigableSet) null;
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
