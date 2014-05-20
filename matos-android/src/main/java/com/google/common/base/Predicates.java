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


public final class Predicates
{
  // Constructors

  private Predicates(){
  }
  // Methods

  public static <T>Predicate<T> in(java.util.Collection<? extends T> arg1){
    return (Predicate) null;
  }
  public static <T>Predicate<T> and(java.lang.Iterable<? extends Predicate<? super T>> arg1){
    return (Predicate) null;
  }
  public static <T>Predicate<T> and(Predicate<? super T> [] arg1){
    return (Predicate) null;
  }
  public static <T>Predicate<T> and(Predicate<? super T> arg1, Predicate<? super T> arg2){
    return (Predicate) null;
  }
  public static <T>Predicate<T> or(java.lang.Iterable<? extends Predicate<? super T>> arg1){
    return (Predicate) null;
  }
  public static <T>Predicate<T> or(Predicate<? super T> [] arg1){
    return (Predicate) null;
  }
  public static <T>Predicate<T> or(Predicate<? super T> arg1, Predicate<? super T> arg2){
    return (Predicate) null;
  }
  public static <A, B>Predicate<A> compose(Predicate<B> arg1, Function<A, ? extends B> arg2){
    return (Predicate) null;
  }
  public static <T>Predicate<T> isNull(){
    return (Predicate) null;
  }
  public static <T>Predicate<T> not(Predicate<T> arg1){
    return (Predicate) null;
  }
  public static <T>Predicate<T> alwaysTrue(){
    return (Predicate) null;
  }
  public static <T>Predicate<T> alwaysFalse(){
    return (Predicate) null;
  }
  public static <T>Predicate<T> notNull(){
    return (Predicate) null;
  }
  public static <T>Predicate<T> equalTo(@javax.annotation.Nullable T arg1){
    return (Predicate) null;
  }
  public static Predicate<java.lang.Object> instanceOf(java.lang.Class<?> arg1){
    return (Predicate) null;
  }
}
