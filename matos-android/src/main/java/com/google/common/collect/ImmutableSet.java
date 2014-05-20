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


public abstract class ImmutableSet<E>
  extends ImmutableCollection<E>  implements java.util.Set<E>
{
  // Classes

  public static class Builder<E>
  {
    // Constructors

    public Builder(){
    }
    // Methods

    public ImmutableSet.Builder<E> add(E arg1){
      return (ImmutableSet.Builder) null;
    }
    public ImmutableSet.Builder<E> add(E [] arg1){
      return (ImmutableSet.Builder) null;
    }
    public ImmutableSet.Builder<E> addAll(java.lang.Iterable<? extends E> arg1){
      return (ImmutableSet.Builder) null;
    }
    public ImmutableSet.Builder<E> addAll(java.util.Iterator<? extends E> arg1){
      return (ImmutableSet.Builder) null;
    }
    public ImmutableSet<E> build(){
      return (ImmutableSet) null;
    }
  }
  // Constructors

  ImmutableSet(){
    super();
  }
  // Methods

  public boolean equals(@javax.annotation.Nullable java.lang.Object arg1){
    return false;
  }
  public int hashCode(){
    return 0;
  }
  public static <E>ImmutableSet<E> copyOf(java.lang.Iterable<? extends E> arg1){
    return (ImmutableSet) null;
  }
  public static <E>ImmutableSet<E> copyOf(java.util.Iterator<? extends E> arg1){
    return (ImmutableSet) null;
  }
  public abstract UnmodifiableIterator<E> iterator();
  public static <E>ImmutableSet<E> of(){
    return (ImmutableSet) null;
  }
  public static <E>ImmutableSet<E> of(E arg1){
    return (ImmutableSet) null;
  }
  public static <E>ImmutableSet<E> of(E arg1, E arg2){
    return (ImmutableSet) null;
  }
  public static <E>ImmutableSet<E> of(E arg1, E arg2, E arg3){
    return (ImmutableSet) null;
  }
  public static <E>ImmutableSet<E> of(E arg1, E arg2, E arg3, E arg4){
    return (ImmutableSet) null;
  }
  public static <E>ImmutableSet<E> of(E arg1, E arg2, E arg3, E arg4, E arg5){
    return (ImmutableSet) null;
  }
  public static <E>ImmutableSet<E> of(E [] arg1){
    return (ImmutableSet) null;
  }
  public static <E>ImmutableSet.Builder<E> builder(){
    return (ImmutableSet.Builder) null;
  }
}
