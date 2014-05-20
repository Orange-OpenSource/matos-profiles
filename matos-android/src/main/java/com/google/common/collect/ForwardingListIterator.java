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


@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.ForwardingListIteratorImplem", superClass = "")
public abstract class ForwardingListIterator<E>
  extends ForwardingIterator<E>  implements java.util.ListIterator<E>
{
  // Constructors

  public ForwardingListIterator(){
    super();
  }
  // Methods

  public void add(E arg1){
  }
  public void set(E arg1){
  }
  public int nextIndex(){
    return 0;
  }
  public E previous(){
    return null;
  }
  public boolean hasPrevious(){
    return false;
  }
  public int previousIndex(){
    return 0;
  }
  protected abstract java.util.ListIterator<E> delegate();
}
