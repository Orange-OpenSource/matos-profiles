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


@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.ForwardingMultisetImplem", superClass = "")
public abstract class ForwardingMultiset<E>
  extends ForwardingCollection<E>  implements Multiset<E>
{
  // Constructors

  public ForwardingMultiset(){
    super();
  }
  // Methods

  public int add(E arg1, int arg2){
    return 0;
  }
  public boolean equals(@javax.annotation.Nullable java.lang.Object arg1){
    return false;
  }
  public int hashCode(){
    return 0;
  }
  public int count(java.lang.Object arg1){
    return 0;
  }
  public java.util.Set<Multiset.Entry<E>> entrySet(){
    return (java.util.Set) null;
  }
  public int remove(java.lang.Object arg1, int arg2){
    return 0;
  }
  protected abstract Multiset<E> delegate();
  public int setCount(E arg1, int arg2){
    return 0;
  }
  public boolean setCount(E arg1, int arg2, int arg3){
    return false;
  }
  public java.util.Set<E> elementSet(){
    return (java.util.Set) null;
  }
}
