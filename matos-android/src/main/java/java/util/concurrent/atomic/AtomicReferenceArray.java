package java.util.concurrent.atomic;

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


public class AtomicReferenceArray<E>
  implements java.io.Serializable
{
  // Constructors

  public AtomicReferenceArray(int arg1){
  }
  @com.francetelecom.rd.stubs.annotation.Code("content=arg1[0];")
  public AtomicReferenceArray(E [] arg1){
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.FieldGet("content")
  public final E get(int arg1){
    return null;
  }
  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public final int length(){
    return 0;
  }
  public final void set(int arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("content") E arg2){
  }
  public final boolean compareAndSet(int arg1, E arg2, @com.francetelecom.rd.stubs.annotation.FieldSet("content") E arg3){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("content")
  public final E getAndSet(int arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("content") E arg2){
    return null;
  }
  public final void lazySet(int arg1, E arg2){
  }
  public final boolean weakCompareAndSet(int arg1, E arg2, @com.francetelecom.rd.stubs.annotation.FieldSet("content") E arg3){
    return false;
  }
}
