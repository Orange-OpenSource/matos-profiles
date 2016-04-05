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
@com.francetelecom.rd.stubs.annotation.Field(value="value", type="V", modifier=java.lang.reflect.Modifier.PRIVATE)

public class EnumMap<K extends java.lang.Enum, V>
  extends AbstractMap<K, V>  implements java.io.Serializable, java.lang.Cloneable, Map<K, V>
{
  // Constructors

  public EnumMap(java.lang.Class<K> arg1){
    super();
  }
  @com.francetelecom.rd.stubs.annotation.Code({"key = arg1.key;", "value = arg1.value;"})
  public EnumMap(EnumMap<K, ? extends V> arg1){
    super();
  }
  @com.francetelecom.rd.stubs.annotation.Code({"key = arg1.keySet().iterator().next();", "value = arg1.values().iterator().next();"})
  public EnumMap(Map<K, ? extends V> arg1){
    super();
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.FieldGet("value")
  public V get(java.lang.Object arg1){
    return null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("value")
  public V put(@com.francetelecom.rd.stubs.annotation.FieldSet("key") K arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("value") V arg2){
    return null;
  }
  public boolean equals(java.lang.Object arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.UseSuper
  public Collection<V> values(){
    return (Collection) null;
  }
  public EnumMap<K, V> clone(){
    return (EnumMap) null;
  }
  public void clear(){
  }
  @com.francetelecom.rd.stubs.annotation.Code({"Set <Map.Entry<K,V>> result = new HashSet<Map.Entry<K,V>>();", "result.add(new EntryImplem(this));", "return result;"})
  public Set<Map.Entry<K, V>> entrySet(){
    return (Set) null;
  }
  @com.francetelecom.rd.stubs.annotation.UseSuper
  public void putAll(Map<? extends K, ? extends V> arg1){
  }
  public int size(){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.UseSuper
  public V remove(java.lang.Object arg1){
    return null;
  }
  @com.francetelecom.rd.stubs.annotation.UseSuper
  public Set<K> keySet(){
    return (Set) null;
  }
  public boolean containsKey(java.lang.Object arg1){
    return false;
  }
  public boolean containsValue(java.lang.Object arg1){
    return false;
  }
}
