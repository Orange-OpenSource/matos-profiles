package libcore.util;

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
public class BasicLruCache<K, V>
{
  // Constructors

  public BasicLruCache(int arg1){
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.FieldGet("value")
  public final synchronized V get(K arg1){
    return null;
  }
  @com.francetelecom.rd.stubs.annotation.Code({"return arg2;"})
    public final synchronized V put(K arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("value") V arg2){
    return null;
  }
  protected V create(K arg1){
    return null;
  }
  public final synchronized java.util.Map<K, V> snapshot(){
    return (java.util.Map) null;
  }
  public final synchronized void evictAll(){
  }
  protected void entryEvicted(K arg1, V arg2){
  }
}
