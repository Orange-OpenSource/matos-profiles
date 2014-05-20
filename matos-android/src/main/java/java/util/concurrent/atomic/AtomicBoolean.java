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


public class AtomicBoolean
  implements java.io.Serializable
{
  // Constructors

  public AtomicBoolean(boolean arg1){
  }
  public AtomicBoolean(){
  }
  // Methods

  public final boolean get(){
    return false;
  }
  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public final void set(boolean arg1){
  }
  public final boolean compareAndSet(boolean arg1, boolean arg2){
    return false;
  }
  public final boolean getAndSet(boolean arg1){
    return false;
  }
  public final void lazySet(boolean arg1){
  }
  public boolean weakCompareAndSet(boolean arg1, boolean arg2){
    return false;
  }
}
