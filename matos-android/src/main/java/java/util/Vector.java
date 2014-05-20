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

import com.francetelecom.rd.stubs.annotation.Code;
import com.francetelecom.rd.stubs.annotation.FieldGet;
import com.francetelecom.rd.stubs.annotation.FieldSet;


@com.francetelecom.rd.stubs.annotation.ClassDone(0)

public class Vector<E>
  extends AbstractList<E>  implements RandomAccess, java.io.Serializable, List<E>, java.lang.Cloneable
{
	// Added
	protected static class EnumerationImplem<T> implements Enumeration<T> {
		public EnumerationImplem(@com.francetelecom.rd.stubs.annotation.FieldSet("e") T arg1) {}
		public boolean hasMoreElements() {return false;	}

		@com.francetelecom.rd.stubs.annotation.FieldGet("e")
		public T nextElement() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
  // Fields

  protected int elementCount;

  protected java.lang.Object [] elementData;

  protected int capacityIncrement;

  // Constructors

  public Vector(){
    super();
  }
  public Vector(int arg1){
    super();
  }
  public Vector(int arg1, int arg2){
    super();
  }
  public Vector(Collection<? extends E> arg1){
    super();
  }
  // Methods

  public void add(int arg1, @FieldSet("content") E arg2){
  }
  public synchronized boolean add(@com.francetelecom.rd.stubs.annotation.FieldSet("content") E arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("content")
  public E get(int arg1){
    return null;
  }
  public synchronized boolean equals(java.lang.Object arg1){
    return false;
  }
  public synchronized java.lang.String toString(){
    return (java.lang.String) null;
  }
  public synchronized int hashCode(){
    return 0;
  }
  public synchronized java.lang.Object clone(){
    return (java.lang.Object) null;
  }
  public int indexOf(java.lang.Object arg1){
    return 0;
  }
  public synchronized int indexOf(java.lang.Object arg1, int arg2){
    return 0;
  }
  public void clear(){
  }
  public boolean contains(java.lang.Object arg1){
    return false;
  }
  public synchronized boolean isEmpty(){
    return false;
  }
  public synchronized int lastIndexOf(java.lang.Object arg1){
    return 0;
  }
  public synchronized int lastIndexOf(java.lang.Object arg1, int arg2){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.UseSuper
  public synchronized boolean addAll(int arg1, Collection<? extends E> arg2){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.UseSuper
  public synchronized boolean addAll(Collection<? extends E> arg1){
    return false;
  }
  public synchronized int size(){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.UseSuper
  public synchronized java.lang.Object [] toArray(){
    return (java.lang.Object []) null;
  }
  @com.francetelecom.rd.stubs.annotation.UseSuper
  public synchronized <T>T [] toArray(T [] arg1){
    return (T []) null;
  }
  public synchronized void addElement(@FieldSet("content") E arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("content")
  public synchronized E elementAt(int arg1){
    return null;
  }
  @FieldGet("content")
  public synchronized E remove(int arg1){
    return null;
  }
  
  public boolean remove(java.lang.Object arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return new EnumerationImplem<E>(content);")
  public Enumeration<E> elements(){
    return (Enumeration) null;
  }
  
  @FieldGet("content") 
  public synchronized E set(int arg1, @FieldSet("content") E arg2){
    return null;
  }
  public synchronized int capacity(){
    return 0;
  }
  public synchronized void ensureCapacity(int arg1){
  }
  public synchronized void trimToSize(){
  }
  @Code("return this;")
  public synchronized List<E> subList(int arg1, int arg2){
    return (List) null;
  }
  public synchronized boolean containsAll(Collection<?> arg1){
    return false;
  }
  public synchronized boolean removeAll(Collection<?> arg1){
    return false;
  }
  public synchronized boolean retainAll(Collection<?> arg1){
    return false;
  }
  protected void removeRange(int arg1, int arg2){
  }
  public synchronized void copyInto(java.lang.Object [] arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("content")
  public synchronized E firstElement(){
    return null;
  }
  public synchronized void insertElementAt(@FieldSet("content") E arg1, int arg2){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("content")
  public synchronized E lastElement(){
    return null;
  }
  public synchronized void removeAllElements(){
  }
  public synchronized boolean removeElement(java.lang.Object arg1){
    return false;
  }
  public synchronized void removeElementAt(int arg1){
  }
  public synchronized void setElementAt(@com.francetelecom.rd.stubs.annotation.FieldSet("content") E arg1, int arg2){
  }
  public synchronized void setSize(int arg1){
  }
}
