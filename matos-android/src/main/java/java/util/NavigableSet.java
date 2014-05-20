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


public interface NavigableSet<E>
  extends SortedSet<E>
{
  // Methods

  public Iterator<E> iterator();
  public E floor(E arg1);
  public E pollFirst();
  public E pollLast();
  public Iterator<E> descendingIterator();
  public NavigableSet<E> headSet(E arg1, boolean arg2);
  public SortedSet<E> headSet(E arg1);
  public NavigableSet<E> subSet(E arg1, boolean arg2, E arg3, boolean arg4);
  public SortedSet<E> subSet(E arg1, E arg2);
  public NavigableSet<E> tailSet(E arg1, boolean arg2);
  public SortedSet<E> tailSet(E arg1);
  public NavigableSet<E> descendingSet();
  public E higher(E arg1);
  public E lower(E arg1);
  public E ceiling(E arg1);
}
