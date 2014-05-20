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


@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.ForwardingQueueImplem", superClass = "")
public abstract class ForwardingQueue<E>
  extends ForwardingCollection<E>  implements java.util.Queue<E>
{
  // Constructors

  public ForwardingQueue(){
    super();
  }
  // Methods

  public E remove(){
    return null;
  }
  public E poll(){
    return null;
  }
  public E peek(){
    return null;
  }
  protected abstract java.util.Queue<E> delegate();
  public boolean offer(E arg1){
    return false;
  }
  public E element(){
    return null;
  }
}
