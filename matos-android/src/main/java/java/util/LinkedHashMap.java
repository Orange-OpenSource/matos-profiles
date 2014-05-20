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


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public class LinkedHashMap<K, V>
  extends HashMap<K, V>{
  // Constructors

  public LinkedHashMap(){
    super();
  }
  public LinkedHashMap(int arg1){
    super();
  }
  public LinkedHashMap(int arg1, float arg2){
    super();
  }
  public LinkedHashMap(int arg1, float arg2, boolean arg3){
    super();
  }
  @com.francetelecom.rd.stubs.annotation.Code({"key = arg1.keySet().iterator().next();", "value = arg1.values().iterator().next();"})
  public LinkedHashMap(Map<? extends K, ? extends V> arg1){
    super();
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.UseSuper
  public V get(java.lang.Object arg1){
    return null;
  }
  public void clear(){
  }
  public boolean containsValue(java.lang.Object arg1){
    return false;
  }
  protected boolean removeEldestEntry(Map.Entry<K, V> arg1){
    return false;
  }
  public Map.Entry<K, V> eldest(){
    return (Map.Entry) null;
  }
}
