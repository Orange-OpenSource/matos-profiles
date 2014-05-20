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


public abstract class AbstractSequentialList<E>
  extends AbstractList<E>{
  // Constructors

  protected AbstractSequentialList(){
    super();
  }
  // Methods

  public void add(int arg1, E arg2){
  }
  public E get(int arg1){
    return null;
  }
  public boolean addAll(int arg1, Collection<? extends E> arg2){
    return false;
  }
  public Iterator<E> iterator(){
    return (Iterator) null;
  }
  public E remove(int arg1){
    return null;
  }
  public E set(int arg1, E arg2){
    return null;
  }
  public abstract ListIterator<E> listIterator(int arg1);
}
