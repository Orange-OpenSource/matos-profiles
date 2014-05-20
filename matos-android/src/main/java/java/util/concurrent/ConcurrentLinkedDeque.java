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


public class ConcurrentLinkedDeque<E>
  extends java.util.AbstractCollection<E>  implements java.util.Deque<E>, java.io.Serializable
{
  // Constructors

  public ConcurrentLinkedDeque(){
    super();
  }
  public ConcurrentLinkedDeque(java.util.Collection<? extends E> arg1){
    super();
  }
  // Methods

  public boolean add(E arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.UseSuper
  public void clear(){
  }
  @com.francetelecom.rd.stubs.annotation.UseSuper
  public boolean contains(java.lang.Object arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.UseSuper
  public boolean isEmpty(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.UseSuper
  public boolean addAll(java.util.Collection<? extends E> arg1){
    return false;
  }
  public java.util.Iterator<E> iterator(){
    return (java.util.Iterator) null;
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
  @com.francetelecom.rd.stubs.annotation.FieldGet("content")
  public E pop(){
    return null;
  }
  public void push(@com.francetelecom.rd.stubs.annotation.FieldSet("content") E arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("content")
  public E remove(){
    return null;
  }
  @com.francetelecom.rd.stubs.annotation.UseSuper
  public boolean remove(java.lang.Object arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("content")
  public E poll(){
    return null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("content")
  public E peek(){
    return null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("content")
  public E getFirst(){
    return null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("content")
  public E getLast(){
    return null;
  }
  public void addFirst(@com.francetelecom.rd.stubs.annotation.FieldSet("content") E arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("content")
  public E removeFirst(){
    return null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("content")
  public E removeLast(){
    return null;
  }
  public void addLast(@com.francetelecom.rd.stubs.annotation.FieldSet("content") E arg1){
  }
  public boolean offer(@com.francetelecom.rd.stubs.annotation.FieldSet("content") E arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("content")
  public E element(){
    return null;
  }
  public boolean offerFirst(@com.francetelecom.rd.stubs.annotation.FieldSet("content") E arg1){
    return false;
  }
  public boolean offerLast(@com.francetelecom.rd.stubs.annotation.FieldSet("content") E arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("content")
  public E pollFirst(){
    return null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("content")
  public E pollLast(){
    return null;
  }
  public boolean removeFirstOccurrence(java.lang.Object arg1){
    return false;
  }
  public boolean removeLastOccurrence(java.lang.Object arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("content")
  public E peekFirst(){
    return null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("content")
  public E peekLast(){
    return null;
  }
  public java.util.Iterator<E> descendingIterator(){
    return (java.util.Iterator) null;
  }
}
