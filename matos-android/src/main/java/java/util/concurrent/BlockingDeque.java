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


public interface BlockingDeque<E>
  extends java.util.Deque<E>, BlockingQueue<E>
{
  // Methods

  public boolean add(E arg1);
  public void put(E arg1) throws java.lang.InterruptedException;
  public boolean contains(java.lang.Object arg1);
  public java.util.Iterator<E> iterator();
  public int size();
  public void push(E arg1);
  public E remove();
  public boolean remove(java.lang.Object arg1);
  public E poll();
  public E poll(long arg1, TimeUnit arg2) throws java.lang.InterruptedException;
  public E peek();
  public void addFirst(E arg1);
  public void addLast(E arg1);
  public boolean offer(E arg1);
  public boolean offer(E arg1, long arg2, TimeUnit arg3) throws java.lang.InterruptedException;
  public E take() throws java.lang.InterruptedException;
  public E element();
  public boolean offerFirst(E arg1);
  public boolean offerFirst(E arg1, long arg2, TimeUnit arg3) throws java.lang.InterruptedException;
  public boolean offerLast(E arg1);
  public boolean offerLast(E arg1, long arg2, TimeUnit arg3) throws java.lang.InterruptedException;
  public void putFirst(E arg1) throws java.lang.InterruptedException;
  public void putLast(E arg1) throws java.lang.InterruptedException;
  public E takeFirst() throws java.lang.InterruptedException;
  public E takeLast() throws java.lang.InterruptedException;
  public E pollFirst(long arg1, TimeUnit arg2) throws java.lang.InterruptedException;
  public E pollLast(long arg1, TimeUnit arg2) throws java.lang.InterruptedException;
  public boolean removeFirstOccurrence(java.lang.Object arg1);
  public boolean removeLastOccurrence(java.lang.Object arg1);
}
