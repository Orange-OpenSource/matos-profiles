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


public interface List<E>
  extends Collection<E>
{
  // Methods

  public void add(int arg1, E arg2);
  public boolean add(E arg1);
  public E get(int arg1);
  public boolean equals(java.lang.Object arg1);
  public int hashCode();
  public int indexOf(java.lang.Object arg1);
  public void clear();
  public boolean contains(java.lang.Object arg1);
  public boolean isEmpty();
  public int lastIndexOf(java.lang.Object arg1);
  public boolean addAll(int arg1, Collection<? extends E> arg2);
  public boolean addAll(Collection<? extends E> arg1);
  public Iterator<E> iterator();
  public int size();
  public java.lang.Object [] toArray();
  public <T>T [] toArray(T [] arg1);
  public E remove(int arg1);
  public boolean remove(java.lang.Object arg1);
  public E set(int arg1, E arg2);
  public ListIterator<E> listIterator();
  public ListIterator<E> listIterator(int arg1);
  public List<E> subList(int arg1, int arg2);
  public boolean containsAll(Collection<?> arg1);
  public boolean removeAll(Collection<?> arg1);
  public boolean retainAll(Collection<?> arg1);
}
