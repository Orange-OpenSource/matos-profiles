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


public class CopyOnWriteArraySet<E>
  extends java.util.AbstractSet<E>  implements java.io.Serializable
{
  // Constructors

  public CopyOnWriteArraySet(){
    super();
  }
  @com.francetelecom.rd.stubs.annotation.Code("content=arg1.iterator().next();")
  public CopyOnWriteArraySet(java.util.Collection<? extends E> arg1){
    super();
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.UseSuper
  public boolean add(E arg1){
    return false;
  }
  public boolean equals(java.lang.Object arg1){
    return false;
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
  @com.francetelecom.rd.stubs.annotation.UseSuper
  public java.lang.Object [] toArray(){
    return (java.lang.Object []) null;
  }
  @com.francetelecom.rd.stubs.annotation.UseSuper
  public <T>T [] toArray(T [] arg1){
    return (T []) null;
  }
  @com.francetelecom.rd.stubs.annotation.UseSuper
  public boolean remove(java.lang.Object arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.UseSuper
  public boolean containsAll(java.util.Collection<?> arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.UseSuper
  public boolean removeAll(java.util.Collection<?> arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.UseSuper
  public boolean retainAll(java.util.Collection<?> arg1){
    return false;
  }
}
