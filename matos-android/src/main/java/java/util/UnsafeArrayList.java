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

import com.francetelecom.rd.stubs.annotation.Code;


public class UnsafeArrayList<T>
  extends AbstractList<T>{
  // Constructors

  public UnsafeArrayList(java.lang.Class<T> arg1, int arg2){
    super();
  }
  // Methods

  public boolean add(T arg1){
    return false;
  }
  public T get(int arg1){
    return null;
  }
  public int size(){
    return 0;
  }
  @Code("return (T [])  new java.lang.Object[]{new java.lang.Object()};")
  public T [] array(){
    return (T []) null;
  }
}
