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


public interface Multiset<E>
  extends java.util.Collection<E>
{
  // Classes

  @com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.MultisetEntryImplem", superClass = "")
  public static interface Entry<E>
  {
    // Methods

    public boolean equals(java.lang.Object arg1);
    public java.lang.String toString();
    public int hashCode();
    public int getCount();
    public E getElement();
  }
  // Methods

  public int add(@javax.annotation.Nullable E arg1, int arg2);
  public boolean add(E arg1);
  public boolean equals(@javax.annotation.Nullable java.lang.Object arg1);
  public java.lang.String toString();
  public int hashCode();
  public boolean contains(@javax.annotation.Nullable java.lang.Object arg1);
  public int count(@javax.annotation.Nullable java.lang.Object arg1);
  public java.util.Set<Multiset.Entry<E>> entrySet();
  public java.util.Iterator<E> iterator();
  public int remove(@javax.annotation.Nullable java.lang.Object arg1, int arg2);
  public boolean remove(@javax.annotation.Nullable java.lang.Object arg1);
  public boolean containsAll(java.util.Collection<?> arg1);
  public boolean removeAll(java.util.Collection<?> arg1);
  public boolean retainAll(java.util.Collection<?> arg1);
  public int setCount(E arg1, int arg2);
  public boolean setCount(E arg1, int arg2, int arg3);
  public java.util.Set<E> elementSet();
}
