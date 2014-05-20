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


public class Collections
{
  // Fields

  public static final List EMPTY_LIST = null;

  public static final Set EMPTY_SET = null;

  public static final Map EMPTY_MAP = null;

  // Constructors

  private Collections(){
  }
  // Methods

  public static <T>T min(Collection<? extends T> arg1){
    return null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return arg1.iterator().next();")
  public static <T>T min(Collection<? extends T> arg1, Comparator<? super T> arg2){
    return null;
  }
  public static <T>T max(Collection<? extends T> arg1){
    return null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return arg1.iterator().next();")
  public static <T>T max(Collection<? extends T> arg1, Comparator<? super T> arg2){
    return null;
  }
  @com.francetelecom.rd.stubs.annotation.Code({"arg1.add(arg3);", "return com.francetelecom.rd.stubs.Generator.booleanValue();"})
  public static <T>boolean replaceAll(List<T> arg1, T arg2, T arg3){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.Code({"arg1.add(arg2[0]);", "return com.francetelecom.rd.stubs.Generator.booleanValue();"})
  public static <T>boolean addAll(Collection<? super T> arg1, T [] arg2){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.Code({"java.util.ArrayList<T> ret=new java.util.ArrayList<T>(1);", "ret.add(arg1.nextElement());", "return ret;"})
  public static <T>ArrayList<T> list(Enumeration<T> arg1){
	return (ArrayList) null;
  }
  public static <T>Iterator<T> emptyIterator(){
    return (Iterator) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return arg1;")
  public static <T>Collection<T> synchronizedCollection(Collection<T> arg1){
    return (Collection) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return arg1;")
  public static <E>Set<E> synchronizedSet(Set<E> arg1){
    return (Set) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("arg1.set(0, arg2.get(0));")
  public static <T>void copy(List<? super T> arg1, List<? extends T> arg2){
  }
  public static void reverse(List<?> arg1){
  }
  @com.francetelecom.rd.stubs.annotation.Code("arg1.set(0, arg2);")
  public static <T>void fill(List<? super T> arg1, T arg2){
  }
  @com.francetelecom.rd.stubs.annotation.Code("return arg1;")
  public static <K, V>Map<K, V> synchronizedMap(Map<K, V> arg1){
    return (Map) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return arg1;")
  public static <T>Queue<T> asLifoQueue(Deque<T> arg1){
    return (Queue) null;
  }
  public static <T>int binarySearch(List<? extends java.lang.Comparable<? super T>> arg1, T arg2){
    return 0;
  }
  public static <T>int binarySearch(List<? extends T> arg1, T arg2, Comparator<? super T> arg3){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return arg1;")
  public static <E>Collection<E> checkedCollection(Collection<E> arg1, java.lang.Class<E> arg2){
    return (Collection) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return arg1;")
  public static <E>List<E> checkedList(List<E> arg1, java.lang.Class<E> arg2){
    return (List) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return arg1;")
  public static <K, V>Map<K, V> checkedMap(Map<K, V> arg1, java.lang.Class<K> arg2, java.lang.Class<V> arg3){
    return (Map) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return arg1;")
  public static <E>Set<E> checkedSet(Set<E> arg1, java.lang.Class<E> arg2){
    return (Set) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return arg1;")
  public static <K, V>SortedMap<K, V> checkedSortedMap(SortedMap<K, V> arg1, java.lang.Class<K> arg2, java.lang.Class<V> arg3){
    return (SortedMap) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return arg1;")
  public static <E>SortedSet<E> checkedSortedSet(SortedSet<E> arg1, java.lang.Class<E> arg2){
    return (SortedSet) null;
  }
  public static boolean disjoint(Collection<?> arg1, Collection<?> arg2){
    return false;
  }
  public static final <T>List<T> emptyList(){
    return (List) null;
  }
  public static final <K, V>Map<K, V> emptyMap(){
    return (Map) null;
  }
  public static final <T>Set<T> emptySet(){
    return (Set) null;
  }
  public static <T>Enumeration<T> enumeration(Collection<T> arg1){
    return (Enumeration) null;
  }
  public static int frequency(Collection<?> arg1, java.lang.Object arg2){
    return 0;
  }
  public static int indexOfSubList(List<?> arg1, List<?> arg2){
    return 0;
  }
  public static int lastIndexOfSubList(List<?> arg1, List<?> arg2){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.Code({"java.util.ArrayList<T> l=new java.util.ArrayList<T>(1);", "l.add(arg2);", "return l;"})
  public static <T>List<T> nCopies(int arg1, T arg2){
    return (List) null;
  }
  public static <E>Set<E> newSetFromMap(Map<E, java.lang.Boolean> arg1){
    return (Set) null;
  }
  public static <T>Comparator<T> reverseOrder(){
    return (Comparator) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return arg1;")
  public static <T>Comparator<T> reverseOrder(Comparator<T> arg1){
    return (Comparator) null;
  }
  public static void rotate(List<?> arg1, int arg2){
  }
  public static void shuffle(List<?> arg1){
  }
  public static void shuffle(List<?> arg1, Random arg2){
  }
  @com.francetelecom.rd.stubs.annotation.Code({"java.util.HashSet<E> s= new java.util.HashSet<E>(1);", "s.add(arg1);", "return s;"})
  public static <E>Set<E> singleton(E arg1){
    return (Set) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code({"java.util.ArrayList<E> l= new java.util.ArrayList<E>(1);", "l.add(arg1);", "return l;"})
  public static <E>List<E> singletonList(E arg1){
    return (List) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code({"java.util.HashMap<K, V> m= new java.util.HashMap<K, V>(1);", "m.put(arg1, arg2);", "return m;"})
  public static <K, V>Map<K, V> singletonMap(K arg1, V arg2){
    return (Map) null;
  }
  public static <T extends java.lang.Comparable>void sort(List<T> arg1){
  }
  public static <T>void sort(List<T> arg1, Comparator<? super T> arg2){
  }
  public static void swap(List<?> arg1, int arg2, int arg3){
  }
  @com.francetelecom.rd.stubs.annotation.Code("return arg1;")
  public static <T>List<T> synchronizedList(List<T> arg1){
    return (List) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return arg1;")
  public static <K, V>SortedMap<K, V> synchronizedSortedMap(SortedMap<K, V> arg1){
    return (SortedMap) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return arg1;")
  public static <E>SortedSet<E> synchronizedSortedSet(SortedSet<E> arg1){
    return (SortedSet) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return (Collection<E>) arg1;")
  public static <E>Collection<E> unmodifiableCollection(Collection<? extends E> arg1){
    return (Collection) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return (List<E>) arg1;")
  public static <E>List<E> unmodifiableList(List<? extends E> arg1){
    return (List) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return (Map<K,V>) arg1;")
  public static <K, V>Map<K, V> unmodifiableMap(Map<? extends K, ? extends V> arg1){
    return (Map) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return (Set <E>) arg1;")
  public static <E>Set<E> unmodifiableSet(Set<? extends E> arg1){
    return (Set) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return (SortedMap<K,V>) arg1;")
  public static <K, V>SortedMap<K, V> unmodifiableSortedMap(SortedMap<K, ? extends V> arg1){
    return (SortedMap) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return arg1;")
  public static <E>SortedSet<E> unmodifiableSortedSet(SortedSet<E> arg1){
    return (SortedSet) null;
  }
  public static <T>Enumeration<T> emptyEnumeration(){
    return (Enumeration) null;
  }
  public static <T>ListIterator<T> emptyListIterator(){
    return (ListIterator) null;
  }
}
