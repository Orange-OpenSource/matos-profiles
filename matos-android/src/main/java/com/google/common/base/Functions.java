package com.google.common.base;

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


public final class Functions
{
  // Constructors

  private Functions(){
  }
  // Methods

  public static <E>Function<java.lang.Object, E> constant(@javax.annotation.Nullable E arg1){
    return (Function) null;
  }
  public static <A, B, C>Function<A, C> compose(Function<B, C> arg1, Function<A, ? extends B> arg2){
    return (Function) null;
  }
  public static <K, V>Function<K, V> forMap(java.util.Map<K, V> arg1){
    return (Function) null;
  }
  public static <K, V>Function<K, V> forMap(java.util.Map<K, ? extends V> arg1, @javax.annotation.Nullable V arg2){
    return (Function) null;
  }
  public static <E>Function<E, E> identity(){
    return (Function) null;
  }
  public static <T>Function<T, java.lang.Boolean> forPredicate(Predicate<T> arg1){
    return (Function) null;
  }
  public static Function<java.lang.Object, java.lang.String> toStringFunction(){
    return (Function) null;
  }
}
