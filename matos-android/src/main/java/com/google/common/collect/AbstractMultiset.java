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
public abstract class AbstractMultiset<E>
  extends java.util.AbstractCollection<E>  implements Multiset<E>
{
	// Added
	@com.francetelecom.rd.stubs.annotation.Field(type="AbstractMultiset<E>", value="list", modifier=java.lang.reflect.Modifier.PRIVATE)
	protected static class IteratorImplem<E> implements java.util.ListIterator<E> {
		public IteratorImplem(@com.francetelecom.rd.stubs.annotation.FieldSet("list") AbstractMultiset<E> arg1) {}
		public void add(@com.francetelecom.rd.stubs.annotation.FieldSet("list.content") E arg0) { }
		public boolean hasNext() { return false; }
		public boolean hasPrevious() { return false; }
		@com.francetelecom.rd.stubs.annotation.FieldGet("list.content")
		public E next() { return null; }
		public int nextIndex() { return 0; }
		@com.francetelecom.rd.stubs.annotation.FieldGet("list.content")
		public E previous() { return null; }
		public int previousIndex() { return 0; }
		public void remove() { }
		
		public void set(@com.francetelecom.rd.stubs.annotation.FieldSet("list.content") E arg0) {	}
	}
	
	// Constructors

  AbstractMultiset(){
    super();
  }
  // Methods

  public boolean add(@javax.annotation.Nullable E arg1){
    return false;
  }
  public int add(E arg1, int arg2){
    return 0;
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
  public int count(java.lang.Object arg1){
    return 0;
  }
  public boolean isEmpty(){
    return false;
  }
  public boolean addAll(java.util.Collection<? extends E> arg1){
    return false;
  }
  public abstract java.util.Set<Multiset.Entry<E>> entrySet();

 @com.francetelecom.rd.stubs.annotation.Code("return new IteratorImplem(this);")
 public java.util.Iterator<E> iterator(){
    return (java.util.Iterator) null;
  }
  public int size(){
    return 0;
  }
  public boolean remove(java.lang.Object arg1){
    return false;
  }
  public int remove(java.lang.Object arg1, int arg2){
    return 0;
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
