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


@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.AtomicReferenceFielddUpdaterImplem", superClass = "")
public abstract class AtomicReferenceFieldUpdater<T, V>
{
  // Constructors

  protected AtomicReferenceFieldUpdater(){
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.FieldGet("content")
  public abstract V get(T arg1);
  public abstract void set(@com.francetelecom.rd.stubs.annotation.FieldSet("key") T arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("content") V arg2);
  public abstract boolean compareAndSet(T arg1, V arg2, @com.francetelecom.rd.stubs.annotation.FieldSet("content") V arg3);
  @com.francetelecom.rd.stubs.annotation.FieldGet("content")
  public V getAndSet(T arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("content") V arg2){
    return null;
  }
  public abstract void lazySet(T arg1, V arg2);
  public abstract boolean weakCompareAndSet(T arg1, V arg2, @com.francetelecom.rd.stubs.annotation.FieldSet("content") V arg3);
  public static <U, W>AtomicReferenceFieldUpdater<U, W> newUpdater(java.lang.Class<U> arg1, java.lang.Class<W> arg2, java.lang.String arg3){
    return (AtomicReferenceFieldUpdater) null;
  }
}
