package org.apache.harmony.luni.util;

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


public class TwoKeyHashMap<E, K, V>
  extends java.util.AbstractMap<java.lang.String, V>{
  // Classes

  public static class Entry<E, K, V>
    implements java.util.Map.Entry<java.lang.String, V>
  {
    // Constructors

    public Entry(int arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("e") E arg2, @com.francetelecom.rd.stubs.annotation.FieldSet("k") K arg3, @com.francetelecom.rd.stubs.annotation.FieldSet("v") V arg4, TwoKeyHashMap.Entry<E, K, V> arg5){
    }
    // Methods

    public boolean equals(java.lang.Object arg1){
      return false;
    }
    public int hashCode(){
      return 0;
    }
    @com.francetelecom.rd.stubs.annotation.FieldGet("v")
    public V getValue(){
      return null;
    }
    public java.lang.String getKey(){
      return (java.lang.String) null;
    }
    @com.francetelecom.rd.stubs.annotation.FieldGet("v")
    public V setValue(@com.francetelecom.rd.stubs.annotation.FieldSet("v") V arg1){
      return null;
    }
    @com.francetelecom.rd.stubs.annotation.FieldGet("e")
    public E getKey1(){
      return null;
    }
    @com.francetelecom.rd.stubs.annotation.FieldGet("k")
    public K getKey2(){
      return null;
    }
  }
  // Constructors

  public TwoKeyHashMap(){
    super();
  }
  public TwoKeyHashMap(int arg1){
    super();
  }
  public TwoKeyHashMap(int arg1, float arg2){
    super();
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.FieldGet("value")
  public V get(java.lang.Object arg1, java.lang.Object arg2){
    return null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("value")
  public V put(@com.francetelecom.rd.stubs.annotation.FieldSet("e") E arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("k") K arg2, @com.francetelecom.rd.stubs.annotation.FieldSet("this.value") V arg3){
    return null;
  }
  @com.francetelecom.rd.stubs.annotation.UseSuper
  public java.util.Collection<V> values(){
    return (java.util.Collection) null;
  }
  public void clear(){
  }
  public boolean isEmpty(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.Code({"java.util.Set <java.util.Map.Entry<String,V>> result = new java.util.HashSet<java.util.Map.Entry<String,V>>();", "result.add(new EntryImplem(this));", "return result;"})
  public java.util.Set<java.util.Map.Entry<java.lang.String, V>> entrySet(){
    return (java.util.Set) null;
  }
  public int size(){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("value")
  public V remove(java.lang.Object arg1, java.lang.Object arg2){
    return null;
  }
  public boolean containsKey(java.lang.Object arg1, java.lang.Object arg2){
    return false;
  }
}
