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
public class Hashtable<K, V>
  extends Dictionary<K, V>  implements Map<K, V>, java.io.Serializable, java.lang.Cloneable
{
	// Added
	protected static class EnumerationImplem<T> implements Enumeration<T> {
		public EnumerationImplem(@com.francetelecom.rd.stubs.annotation.FieldSet("e") T arg1) {}
		public boolean hasMoreElements() {return false;	}

		@com.francetelecom.rd.stubs.annotation.FieldGet("e")
		public T nextElement() {
			return null;
		}
		
	}
	
	protected static class EntryImplem<K1,V1> implements Map.Entry<K1, V1> {
		
		public EntryImplem(@com.francetelecom.rd.stubs.annotation.FieldSet("t") Hashtable<K1,V1> arg1) {}
		@com.francetelecom.rd.stubs.annotation.FieldGet("t.key")
		public K1 getKey() { return null; }
		@com.francetelecom.rd.stubs.annotation.FieldGet("t.value")
		public V1 getValue() { return null;	}
		@com.francetelecom.rd.stubs.annotation.FieldGet("t.value")
		public V1 setValue(@com.francetelecom.rd.stubs.annotation.FieldSet("t.value") V1 arg1) { return null; }
	}

  // Constructors

  public Hashtable(){
    super();
  }
  public Hashtable(int arg1){
    super();
  }
  public Hashtable(int arg1, float arg2){
    super();
  }
  @com.francetelecom.rd.stubs.annotation.Code({"super();", "key = arg1.keySet().iterator().next();", "value = arg1.values().iterator().next();"})
  public Hashtable(Map<? extends K, ? extends V> arg1){
    super();
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.FieldGet("value")
  public synchronized V get(java.lang.Object arg1){
    return null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("value")
  public synchronized V put(@com.francetelecom.rd.stubs.annotation.FieldSet("key") K arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("value") V arg2){
    return null;
  }
  public synchronized boolean equals(java.lang.Object arg1){
    return false;
  }
  public synchronized java.lang.String toString(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code({"Collection<V> r = new HashSet<V> ();", "r.add(value);", "return r;"})
  public synchronized Collection<V> values(){
    return (Collection) null;
  }
  public synchronized int hashCode(){
    return 0;
  }
  public synchronized java.lang.Object clone(){
    return (java.lang.Object) null;
  }
  public synchronized void clear(){
  }
  public boolean contains(java.lang.Object arg1){
    return false;
  }
  public synchronized boolean isEmpty(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.Code({"Map.Entry<K, V> e = new EntryImplem(this);", "Set<Map.Entry<K, V>> r = new HashSet<Map.Entry<K, V>>();", "r.add(e);", "return r;"})
  public synchronized Set<Map.Entry<K, V>> entrySet(){
    return (Set) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code({"key = arg1.keySet().iterator().next();", "value = arg1.values().iterator().next();"})
  public synchronized void putAll(Map<? extends K, ? extends V> arg1){
  }
  public synchronized int size(){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("value")
  public synchronized V remove(java.lang.Object arg1){
    return null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return new EnumerationImplem<V>(value);")
  public synchronized Enumeration<V> elements(){
    return (Enumeration) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code({"Set <K> r = new HashSet<K> ();", "r.add(key);", "return r;"})
  public synchronized Set<K> keySet(){
    return (Set) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return new EnumerationImplem<K>(key);")
  public synchronized Enumeration<K> keys(){
    return (Enumeration) null;
  }
  public synchronized boolean containsKey(java.lang.Object arg1){
    return false;
  }
  public synchronized boolean containsValue(java.lang.Object arg1){
    return false;
  }
  protected void rehash(){
  }
}
