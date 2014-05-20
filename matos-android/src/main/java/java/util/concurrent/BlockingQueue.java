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


public interface BlockingQueue<E>
  extends java.util.Queue<E>
{
  // Methods

  public boolean add(E arg1);
  public void put(E arg1) throws java.lang.InterruptedException;
  public boolean contains(java.lang.Object arg1);
  public boolean remove(java.lang.Object arg1);
  public E poll(long arg1, TimeUnit arg2) throws java.lang.InterruptedException;
  public boolean offer(E arg1);
  public boolean offer(E arg1, long arg2, TimeUnit arg3) throws java.lang.InterruptedException;
  public E take() throws java.lang.InterruptedException;
  public int drainTo(java.util.Collection<? super E> arg1);
  public int drainTo(java.util.Collection<? super E> arg1, int arg2);
  public int remainingCapacity();
}
