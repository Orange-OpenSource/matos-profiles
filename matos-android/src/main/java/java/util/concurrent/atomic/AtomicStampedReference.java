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


public class AtomicStampedReference<V>
{
  // Constructors

  public AtomicStampedReference(@com.francetelecom.rd.stubs.annotation.FieldSet("content") V arg1, int arg2){
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.FieldGet("content")
  public V get(int [] arg1){
    return null;
  }
  public void set(@com.francetelecom.rd.stubs.annotation.FieldSet("content") V arg1, int arg2){
  }
  public boolean compareAndSet(V arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("content") V arg2, int arg3, int arg4){
    return false;
  }
  public boolean weakCompareAndSet(V arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("content") V arg2, int arg3, int arg4){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("content")
  public V getReference(){
    return null;
  }
  public int getStamp(){
    return 0;
  }
  public boolean attemptStamp(V arg1, int arg2){
    return false;
  }
}
