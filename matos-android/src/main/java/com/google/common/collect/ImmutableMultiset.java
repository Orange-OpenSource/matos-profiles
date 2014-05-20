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


public class ImmutableMultiset<E>
  extends ImmutableCollection<E>  implements Multiset<E>
{
  // Classes

  public static final class Builder<E>
  {
    // Constructors

    public Builder(){
    }
    // Methods

    public ImmutableMultiset.Builder<E> add(E arg1){
      return (ImmutableMultiset.Builder) null;
    }
    public ImmutableMultiset.Builder<E> add(E [] arg1){
      return (ImmutableMultiset.Builder) null;
    }
    public ImmutableMultiset.Builder<E> addAll(java.lang.Iterable<? extends E> arg1){
      return (ImmutableMultiset.Builder) null;
    }
    public ImmutableMultiset.Builder<E> addAll(java.util.Iterator<? extends E> arg1){
      return (ImmutableMultiset.Builder) null;
    }
    public ImmutableMultiset<E> build(){
      return (ImmutableMultiset) null;
    }
    public ImmutableMultiset.Builder<E> setCount(E arg1, int arg2){
      return (ImmutableMultiset.Builder) null;
    }
    public ImmutableMultiset.Builder<E> addCopies(E arg1, int arg2){
      return (ImmutableMultiset.Builder) null;
    }
  }
  // Constructors

  ImmutableMultiset(ImmutableMap<E, java.lang.Integer> arg1, int arg2){
    super();
  }
  // Methods

  public int add(E arg1, int arg2){
    return 0;
  }
  public boolean equals(@javax.annotation.Nullable java.lang.Object arg1){
    return false;
  }
  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public int hashCode(){
    return 0;
  }
  public static <E>ImmutableMultiset<E> copyOf(java.lang.Iterable<? extends E> arg1){
    return (ImmutableMultiset) null;
  }
  public static <E>ImmutableMultiset<E> copyOf(java.util.Iterator<? extends E> arg1){
    return (ImmutableMultiset) null;
  }
  public boolean contains(@javax.annotation.Nullable java.lang.Object arg1){
    return false;
  }
  public int count(@javax.annotation.Nullable java.lang.Object arg1){
    return 0;
  }
  public java.util.Set<Multiset.Entry<E>> entrySet(){
    return (java.util.Set) null;
  }
  public UnmodifiableIterator<E> iterator(){
    return (UnmodifiableIterator) null;
  }
  public int size(){
    return 0;
  }
  public int remove(java.lang.Object arg1, int arg2){
    return 0;
  }
  public static <E>ImmutableMultiset<E> of(){
    return (ImmutableMultiset) null;
  }
  public static <E>ImmutableMultiset<E> of(E [] arg1){
    return (ImmutableMultiset) null;
  }
  public int setCount(E arg1, int arg2){
    return 0;
  }
  public boolean setCount(E arg1, int arg2, int arg3){
    return false;
  }
  public java.util.Set<E> elementSet(){
    return (java.util.Set) null;
  }
  public static <E>ImmutableMultiset.Builder<E> builder(){
    return (ImmutableMultiset.Builder) null;
  }
}
