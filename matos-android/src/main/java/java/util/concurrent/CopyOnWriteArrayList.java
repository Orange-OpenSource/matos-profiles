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


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public class CopyOnWriteArrayList<E>
  implements java.util.RandomAccess, java.util.List<E>, java.io.Serializable, java.lang.Cloneable
{
	  // Added
	  @com.francetelecom.rd.stubs.annotation.Field(
				value = "collection",
				type = "CopyOnWriteArrayList<T>",
				modifier = java.lang.reflect.Modifier.PRIVATE
			)
		protected static class IteratorImplem<T> implements java.util.Iterator<T> {

			public IteratorImplem(@com.francetelecom.rd.stubs.annotation.FieldSet("collection") CopyOnWriteArrayList<T> arg) { }

			public boolean hasNext() { return false; }

			@com.francetelecom.rd.stubs.annotation.FieldGet("collection.content")
			public T next() { return null; }

			public void remove() { }
			
		}
	  
		@com.francetelecom.rd.stubs.annotation.Field(type="CopyOnWriteArrayList<E>", value="list", modifier=java.lang.reflect.Modifier.PRIVATE)
		protected static class ListIteratorImplem<E> implements java.util.ListIterator<E> {
			public ListIteratorImplem(@com.francetelecom.rd.stubs.annotation.FieldSet("list") CopyOnWriteArrayList<E> arg1) {}
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

  public CopyOnWriteArrayList(){
  }
  public CopyOnWriteArrayList(java.util.Collection<? extends E> arg1){
  }
  public CopyOnWriteArrayList(E [] arg1){
  }
  // Methods

  public synchronized boolean add(E arg1){
    return false;
  }
  public synchronized void add(int arg1, E arg2){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("content")
  public E get(int arg1){
    return null;
  }
  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public int hashCode(){
    return 0;
  }
  public java.lang.Object clone(){
    return (java.lang.Object) null;
  }
  public int indexOf(E arg1, int arg2){
    return 0;
  }
  public int indexOf(java.lang.Object arg1){
    return 0;
  }
  public synchronized void clear(){
  }
  public boolean contains(java.lang.Object arg1){
    return false;
  }
  public boolean isEmpty(){
    return false;
  }
  public int lastIndexOf(E arg1, int arg2){
    return 0;
  }
  public int lastIndexOf(java.lang.Object arg1){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.Code({"content = arg1.iterator().next();", "return com.francetelecom.rd.stubs.Generator.booleanValue();"})
  public synchronized boolean addAll(java.util.Collection<? extends E> arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.Code({"content = arg2.iterator().next();", "return com.francetelecom.rd.stubs.Generator.booleanValue();"})
  public synchronized boolean addAll(int arg1, java.util.Collection<? extends E> arg2){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return new IteratorImplem(this);")
  public java.util.Iterator<E> iterator(){
    return (java.util.Iterator) null;
  }
  public int size(){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return new java.lang.Object[] { content };")
  public java.lang.Object [] toArray(){
    return (java.lang.Object []) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code({"T[] array = (T[]) java.lang.reflect.Array.newInstance(arg1.getClass().getComponentType(), 1);", "array[0]=(T) content;", "return array;"})
  public <T>T [] toArray(T [] arg1){
    return (T []) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("content")
  public synchronized E remove(int arg1){
    return null;
  }
  public synchronized boolean remove(java.lang.Object arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("content")
  public synchronized E set(int arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("content") E arg2){
    return null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return new ListIteratorImplem(this);")
  public java.util.ListIterator<E> listIterator(int arg1){
    return (java.util.ListIterator) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return new ListIteratorImplem(this);")
  public java.util.ListIterator<E> listIterator(){
    return (java.util.ListIterator) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code({"java.util.List<E> r = new java.util.LinkedList<E>();", "r.add(content);", "return r;"})
  public java.util.List<E> subList(int arg1, int arg2){
    return (java.util.List) null;
  }
  public boolean containsAll(java.util.Collection<?> arg1){
    return false;
  }
  public synchronized boolean removeAll(java.util.Collection<?> arg1){
    return false;
  }
  public synchronized boolean retainAll(java.util.Collection<?> arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.Code({"content = arg1.iterator().next();", "return com.francetelecom.rd.stubs.Generator.intValue();"})
  public synchronized int addAllAbsent(java.util.Collection<? extends E> arg1){
    return 0;
  }
  public synchronized boolean addIfAbsent(E arg1){
    return false;
  }
}
