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


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.AtomicLongFieldUpdaterImpl", superClass = "")
public abstract class AtomicLongFieldUpdater<T>
{
  // Constructors

  protected AtomicLongFieldUpdater(){
  }
  // Methods

  public abstract long get(T arg1);
  public abstract void set(T arg1, long arg2);
  public long getAndAdd(T arg1, long arg2){
    return 0l;
  }
  public long addAndGet(T arg1, long arg2){
    return 0l;
  }
  public abstract boolean compareAndSet(T arg1, long arg2, long arg3);
  public long decrementAndGet(T arg1){
    return 0l;
  }
  public long getAndDecrement(T arg1){
    return 0l;
  }
  public long getAndIncrement(T arg1){
    return 0l;
  }
  public long getAndSet(T arg1, long arg2){
    return 0l;
  }
  public long incrementAndGet(T arg1){
    return 0l;
  }
  public abstract void lazySet(T arg1, long arg2);
  public abstract boolean weakCompareAndSet(T arg1, long arg2, long arg3);
  public static <U>AtomicLongFieldUpdater<U> newUpdater(java.lang.Class<U> arg1, java.lang.String arg2){
    return (AtomicLongFieldUpdater) null;
  }
}
