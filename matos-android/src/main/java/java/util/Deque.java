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


public interface Deque<E>
  extends Queue<E>
{
  // Methods

  public boolean add(E arg1);
  public boolean contains(java.lang.Object arg1);
  public Iterator<E> iterator();
  public int size();
  public E pop();
  public void push(E arg1);
  public E remove();
  public boolean remove(java.lang.Object arg1);
  public E poll();
  public E peek();
  public E getFirst();
  public E getLast();
  public void addFirst(E arg1);
  public E removeFirst();
  public E removeLast();
  public void addLast(E arg1);
  public boolean offer(E arg1);
  public E element();
  public boolean offerFirst(E arg1);
  public boolean offerLast(E arg1);
  public E pollFirst();
  public E pollLast();
  public boolean removeFirstOccurrence(java.lang.Object arg1);
  public boolean removeLastOccurrence(java.lang.Object arg1);
  public E peekFirst();
  public E peekLast();
  public Iterator<E> descendingIterator();
}
