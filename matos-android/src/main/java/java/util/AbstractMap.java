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
public abstract class AbstractMap<K, V>
  implements Map<K, V>
{
	// Added 
	protected static class EntryImplem<K, V> implements Map.Entry<K, V> {
		public EntryImplem(@com.francetelecom.rd.stubs.annotation.FieldSet("map") AbstractMap<K, V> arg1){}
		
		@com.francetelecom.rd.stubs.annotation.FieldGet("map.key")
		public K getKey() { return null; }

		@com.francetelecom.rd.stubs.annotation.FieldGet("map.value")
		public V getValue() { return null;	}

		
		public V setValue(@com.francetelecom.rd.stubs.annotation.FieldSet("map.value")V arg1) { return null; }	
	}
  // Classes

  public static class SimpleImmutableEntry<K, V>
    implements Map.Entry<K, V>, java.io.Serializable
  {
    // Constructors

    public SimpleImmutableEntry(K arg1, V arg2){
    }
    public SimpleImmutableEntry(Map.Entry<? extends K, ? extends V> arg1){
    }
    // Methods

    public boolean equals(java.lang.Object arg1){
      return false;
    }
    public java.lang.String toString(){
      return (java.lang.String) null;
    }
    public int hashCode(){
      return 0;
    }
    public V getValue(){
      return null;
    }
    public K getKey(){
      return null;
    }
    public V setValue(V arg1){
      return null;
    }
  }
  public static class SimpleEntry<K, V>
    implements Map.Entry<K, V>, java.io.Serializable
  {
    // Constructors

    public SimpleEntry(K arg1, V arg2){
    }
    public SimpleEntry(Map.Entry<? extends K, ? extends V> arg1){
    }
    // Methods

    public boolean equals(java.lang.Object arg1){
      return false;
    }
    public java.lang.String toString(){
      return (java.lang.String) null;
    }
    public int hashCode(){
      return 0;
    }
    public V getValue(){
      return null;
    }
    public K getKey(){
      return null;
    }
    public V setValue(V arg1){
      return null;
    }
  }
  // Constructors

  protected AbstractMap(){
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
  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code({"Collection<V> r = new HashSet<V>();", "r.add(value);", "return r;"})
  public Collection<V> values(){
    return (Collection<V>) null;
  }
  public int hashCode(){
    return 0;
  }
  protected java.lang.Object clone() throws java.lang.CloneNotSupportedException{
    return (java.lang.Object) null;
  }
  public void clear(){
  }
  public boolean isEmpty(){
    return false;
  }
  public abstract Set<Map.Entry<K, V>> entrySet();
  @com.francetelecom.rd.stubs.annotation.Code({"java.util.Map.Entry<? extends K, ? extends V> e = arg1.entrySet().iterator().next();", "key  = e.getKey();", "value = e.getValue();"})
  public void putAll(Map<? extends K, ? extends V> arg1){
  }
  public int size(){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("value")
  public V remove(java.lang.Object arg1){
    return null;
  }
  @com.francetelecom.rd.stubs.annotation.Code({"Set<K> r = new HashSet<K>();", "r.add(key);", "return r;"})
  public Set<K> keySet(){
    return (Set<K>) null;
  }
  public boolean containsKey(java.lang.Object arg1){
    return false;
  }
  public boolean containsValue(java.lang.Object arg1){
    return false;
  }
}
