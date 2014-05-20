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


@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.AtomicIntegerFieldUpdaterImplem", superClass = "")
public abstract class AtomicIntegerFieldUpdater<T>
{
  // Constructors

  protected AtomicIntegerFieldUpdater(){
  }
  // Methods

  public abstract int get(T arg1);
  public abstract void set(T arg1, int arg2);
  public int getAndAdd(T arg1, int arg2){
    return 0;
  }
  public int addAndGet(T arg1, int arg2){
    return 0;
  }
  public abstract boolean compareAndSet(T arg1, int arg2, int arg3);
  public int decrementAndGet(T arg1){
    return 0;
  }
  public int getAndDecrement(T arg1){
    return 0;
  }
  public int getAndIncrement(T arg1){
    return 0;
  }
  public int getAndSet(T arg1, int arg2){
    return 0;
  }
  public int incrementAndGet(T arg1){
    return 0;
  }
  public abstract void lazySet(T arg1, int arg2);
  public abstract boolean weakCompareAndSet(T arg1, int arg2, int arg3);
  public static <U>AtomicIntegerFieldUpdater<U> newUpdater(java.lang.Class<U> arg1, java.lang.String arg2){
    return (AtomicIntegerFieldUpdater) null;
  }
}
