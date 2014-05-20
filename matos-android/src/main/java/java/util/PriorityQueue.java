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
public class PriorityQueue<E>
  extends AbstractQueue<E>  implements java.io.Serializable
{
  // Constructors

  public PriorityQueue(){
    super();
  }
  public PriorityQueue(int arg1){
    super();
  }
  public PriorityQueue(int arg1, Comparator<? super E> arg2){
    super();
  }
  public PriorityQueue(Collection<? extends E> arg1){
    super();
  }
  public PriorityQueue(PriorityQueue<? extends E> arg1){
    super();
  }
  public PriorityQueue(SortedSet<? extends E> arg1){
    super();
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.UseSuper
  public boolean add(E arg1){
    return false;
  }
  public void clear(){
  }
  @com.francetelecom.rd.stubs.annotation.Code("return new IteratorImplem(this);")
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
  @com.francetelecom.rd.stubs.annotation.FieldGet("content")
  public E poll(){
    return null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("content")
  public E peek(){
    return null;
  }
  public Comparator<? super E> comparator(){
    return (Comparator) null;
  }
  public boolean offer(@com.francetelecom.rd.stubs.annotation.FieldSet("content") E arg1){
    return false;
  }
}
