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


public final class TreeMultiset<E>
  extends AbstractMapBasedMultiset<E>{
  // Constructors

  private TreeMultiset(){
    super((java.util.Map) null);
  }
  private TreeMultiset(java.util.Comparator<? super E> arg1){
    super((java.util.Map) null);
  }
  // Methods

  public int count(@javax.annotation.Nullable java.lang.Object arg1){
    return 0;
  }
  public static <E extends java.lang.Comparable>TreeMultiset<E> create(){
    return (TreeMultiset) null;
  }
  public static <E>TreeMultiset<E> create(java.util.Comparator<? super E> arg1){
    return (TreeMultiset) null;
  }
  public static <E extends java.lang.Comparable>TreeMultiset<E> create(java.lang.Iterable<? extends E> arg1){
    return (TreeMultiset) null;
  }
  public java.util.SortedSet<E> elementSet(){
    return (java.util.SortedSet) null;
  }
}
