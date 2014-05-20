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


@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.ForwardingSortedSetImplem", superClass = "")
public abstract class ForwardingSortedSet<E>
  extends ForwardingSet<E>  implements java.util.SortedSet<E>
{
  // Constructors

  public ForwardingSortedSet(){
    super();
  }
  // Methods

  protected abstract java.util.SortedSet<E> delegate();
  public E first(){
    return null;
  }
  public E last(){
    return null;
  }
  public java.util.Comparator<? super E> comparator(){
    return (java.util.Comparator) null;
  }
  public java.util.SortedSet<E> headSet(E arg1){
    return (java.util.SortedSet) null;
  }
  public java.util.SortedSet<E> subSet(E arg1, E arg2){
    return (java.util.SortedSet) null;
  }
  public java.util.SortedSet<E> tailSet(E arg1){
    return (java.util.SortedSet) null;
  }
}
