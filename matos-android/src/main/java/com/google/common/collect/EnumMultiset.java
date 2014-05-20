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


public final class EnumMultiset<E extends java.lang.Enum>
  extends AbstractMapBasedMultiset<E>{
  // Constructors

  private EnumMultiset(java.lang.Class<E> arg1){
    super((java.util.Map) null);
  }
  // Methods

  public int add(@javax.annotation.Nullable E arg1, int arg2){
    return 0;
  }
  public boolean add(@javax.annotation.Nullable E arg1){
    return false;
  }
  public static <E extends java.lang.Enum>EnumMultiset<E> create(java.lang.Class<E> arg1){
    return (EnumMultiset) null;
  }
  public static <E extends java.lang.Enum>EnumMultiset<E> create(java.lang.Iterable<E> arg1){
    return (EnumMultiset) null;
  }
  public int setCount(E arg1, int arg2){
    return 0;
  }
  public boolean setCount(E arg1, int arg2, int arg3){
    return false;
  }
}
