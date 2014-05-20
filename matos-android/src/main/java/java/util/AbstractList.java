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

import java.lang.reflect.Modifier;

import com.francetelecom.rd.stubs.annotation.Code;
import com.francetelecom.rd.stubs.annotation.FieldGet;
import com.francetelecom.rd.stubs.annotation.FieldSet;

@com.francetelecom.rd.stubs.annotation.Field(type = "E", value = "content", modifier = Modifier.PROTECTED)
public abstract class AbstractList<E>
  extends AbstractCollection<E>  implements List<E>
{
	// Added code.
	@com.francetelecom.rd.stubs.annotation.Field(type="AbstractList<E>", value="list", modifier=java.lang.reflect.Modifier.PRIVATE)
	protected static class ListIteratorImplem<E> implements ListIterator<E> {
		public ListIteratorImplem(@com.francetelecom.rd.stubs.annotation.FieldSet(value="list", type = "AbstractList<E>") AbstractList<E> arg1) {}
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

  // Fields

  protected int modCount;

  // Constructors

  protected AbstractList(){
    super();
  }
  // Methods

  public void add(int arg1, @FieldSet("content") E arg2){
  }
  public boolean add(@FieldSet("content") E arg1){
    return false;
  }
  public abstract E get(int arg1);
  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public int hashCode(){
    return 0;
  }
  public int indexOf(java.lang.Object arg1){
    return 0;
  }
  public void clear(){
  }
  public int lastIndexOf(java.lang.Object arg1){
    return 0;
  }
  @Code({ "content = arg2.iterator().next();","return false; " })
  public boolean addAll(int arg1, Collection<? extends E> arg2){
	  
    return false;
  }
  @Code("return new ListIteratorImplem(this);")
  public Iterator<E> iterator(){
    return (Iterator) null;
  }
  public E remove(int arg1){
    return null;
  }
  @FieldGet("content")
  public E set(int arg1,@FieldSet("content") E arg2){
    return null;
  }
  @Code("return new ListIteratorImplem(this);")
  public ListIterator<E> listIterator(){
    return (ListIterator) null;
  }
  @Code("return new ListIteratorImplem(this);")
  public ListIterator<E> listIterator(int arg1){
    return (ListIterator) null;
  }
  @Code("return this;")
  public List<E> subList(int arg1, int arg2){
    return (List) null;
  }
  protected void removeRange(int arg1, int arg2){
  }
}
