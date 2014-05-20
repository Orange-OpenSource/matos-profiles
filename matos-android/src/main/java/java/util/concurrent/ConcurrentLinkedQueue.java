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


public class ConcurrentLinkedQueue<E>
  extends java.util.AbstractQueue<E>  implements java.util.Queue<E>, java.io.Serializable
{
  // Constructors

  public ConcurrentLinkedQueue(){
    super();
  }
  public ConcurrentLinkedQueue(java.util.Collection<? extends E> arg1){
    super();
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.UseSuper
  public boolean add(E arg1){
    return false;
  }
  public boolean contains(java.lang.Object arg1){
    return false;
  }
  public boolean isEmpty(){
    return false;
  }
  public boolean addAll(java.util.Collection<? extends E> arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return new IteratorImplem(this);")
  public java.util.Iterator<E> iterator(){
    return (java.util.Iterator) null;
  }
  public int size(){
    return 0;
  }
  public java.lang.Object [] toArray(){
    return (java.lang.Object []) null;
  }
  @com.francetelecom.rd.stubs.annotation.UseSuper
  public <T>T [] toArray(T [] arg1){
    return (T []) null;
  }
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
  public boolean offer(@com.francetelecom.rd.stubs.annotation.FieldSet("content") E arg1){
    return false;
  }
}
