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
@com.francetelecom.rd.stubs.annotation.Field(type = "E", value = "content", modifier = 4)
@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.AbstractCollectionImplem", superClass = "")
public abstract class AbstractCollection<E>
  implements Collection<E>
{
	// Added Code
	@com.francetelecom.rd.stubs.annotation.Field(value = "collection", type = "AbstractCollection<T>", modifier = java.lang.reflect.Modifier.PRIVATE)
	protected static class IteratorImplem<T> implements java.util.Iterator<T> {

		public IteratorImplem(@com.francetelecom.rd.stubs.annotation.FieldSet(value = "collection", type = "AbstractCollection<T>") AbstractCollection<T> arg) { }

		public boolean hasNext() { return false; }

		@com.francetelecom.rd.stubs.annotation.FieldGet("collection.content")
		public T next() { return null; }

		public void remove() { }
		
	}

  // Constructors

  protected AbstractCollection(){
  }
  // Methods

  public boolean add(@com.francetelecom.rd.stubs.annotation.FieldSet("content") E arg1){
    return false;
  }
  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public void clear(){
  }
  public boolean contains(java.lang.Object arg1){
    return false;
  }
  public boolean isEmpty(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.Code({"content=arg1.iterator().next();", "return com.francetelecom.rd.stubs.Generator.booleanValue();"})
  public boolean addAll(Collection<? extends E> arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return new IteratorImplem(this);")
  public abstract Iterator<E> iterator();
  public abstract int size();
  @com.francetelecom.rd.stubs.annotation.Code("return new java.lang.Object[] { content };")
  public java.lang.Object [] toArray(){
    return (java.lang.Object []) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code({"T[] array = (T[]) java.lang.reflect.Array.newInstance(arg1.getClass().getComponentType(), 1);", "array[0]=(T) content;", "return array;"})
  public <T>T [] toArray(T [] arg1){
    return (T []) null;
  }
  public boolean remove(java.lang.Object arg1){
    return false;
  }
  public boolean containsAll(Collection<?> arg1){
    return false;
  }
  public boolean removeAll(Collection<?> arg1){
    return false;
  }
  public boolean retainAll(Collection<?> arg1){
    return false;
  }
}
