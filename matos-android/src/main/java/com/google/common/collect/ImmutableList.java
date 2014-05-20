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


@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.ImmutableListImplem", superClass = "")
public abstract class ImmutableList<E>
  extends ImmutableCollection<E>  implements java.util.RandomAccess, java.util.List<E>
{
  // Classes

  public static final class Builder<E>
  {
    // Constructors

    public Builder(){
    }
    // Methods

    public ImmutableList.Builder<E> add(E arg1){
      return (ImmutableList.Builder) null;
    }
    public ImmutableList.Builder<E> add(E [] arg1){
      return (ImmutableList.Builder) null;
    }
    public ImmutableList.Builder<E> addAll(java.lang.Iterable<? extends E> arg1){
      return (ImmutableList.Builder) null;
    }
    public ImmutableList.Builder<E> addAll(java.util.Iterator<? extends E> arg1){
      return (ImmutableList.Builder) null;
    }
    public ImmutableList<E> build(){
      return (ImmutableList) null;
    }
  }
  // Constructors

  ImmutableList(){
    super();
  }
  // Methods

  public final void add(int arg1, E arg2){
  }
  public static <E>ImmutableList<E> copyOf(java.lang.Iterable<? extends E> arg1){
    return (ImmutableList) null;
  }
  public static <E>ImmutableList<E> copyOf(java.util.Collection<? extends E> arg1){
    return (ImmutableList) null;
  }
  public static <E>ImmutableList<E> copyOf(java.util.Iterator<? extends E> arg1){
    return (ImmutableList) null;
  }
  public abstract int indexOf(@javax.annotation.Nullable java.lang.Object arg1);
  public abstract int lastIndexOf(@javax.annotation.Nullable java.lang.Object arg1);
  public final boolean addAll(int arg1, java.util.Collection<? extends E> arg2){
    return false;
  }
  public abstract UnmodifiableIterator<E> iterator();
  public final E remove(int arg1){
    return null;
  }
  public final E set(int arg1, E arg2){
    return null;
  }
  public abstract ImmutableList<E> subList(int arg1, int arg2);
  public ImmutableList<E> asList(){
    return (ImmutableList) null;
  }
  public static <E>ImmutableList<E> of(){
    return (ImmutableList) null;
  }
  public static <E>ImmutableList<E> of(E arg1){
    return (ImmutableList) null;
  }
  public static <E>ImmutableList<E> of(E arg1, E arg2){
    return (ImmutableList) null;
  }
  public static <E>ImmutableList<E> of(E arg1, E arg2, E arg3){
    return (ImmutableList) null;
  }
  public static <E>ImmutableList<E> of(E arg1, E arg2, E arg3, E arg4){
    return (ImmutableList) null;
  }
  public static <E>ImmutableList<E> of(E arg1, E arg2, E arg3, E arg4, E arg5){
    return (ImmutableList) null;
  }
  public static <E>ImmutableList<E> of(E arg1, E arg2, E arg3, E arg4, E arg5, E arg6){
    return (ImmutableList) null;
  }
  public static <E>ImmutableList<E> of(E arg1, E arg2, E arg3, E arg4, E arg5, E arg6, E arg7){
    return (ImmutableList) null;
  }
  public static <E>ImmutableList<E> of(E arg1, E arg2, E arg3, E arg4, E arg5, E arg6, E arg7, E arg8){
    return (ImmutableList) null;
  }
  public static <E>ImmutableList<E> of(E arg1, E arg2, E arg3, E arg4, E arg5, E arg6, E arg7, E arg8, E arg9){
    return (ImmutableList) null;
  }
  public static <E>ImmutableList<E> of(E arg1, E arg2, E arg3, E arg4, E arg5, E arg6, E arg7, E arg8, E arg9, E arg10){
    return (ImmutableList) null;
  }
  public static <E>ImmutableList<E> of(E arg1, E arg2, E arg3, E arg4, E arg5, E arg6, E arg7, E arg8, E arg9, E arg10, E arg11){
    return (ImmutableList) null;
  }
  public static <E>ImmutableList<E> of(E [] arg1){
    return (ImmutableList) null;
  }
  public static <E>ImmutableList.Builder<E> builder(){
    return (ImmutableList.Builder) null;
  }
}
