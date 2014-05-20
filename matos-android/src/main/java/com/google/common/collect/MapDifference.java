package com.google.common.collect;

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


@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.MapDifferenceImplem", superClass = "")
public interface MapDifference<K, V>
{
  // Classes

  public static interface ValueDifference<V>
  {
    // Methods

    public boolean equals(@javax.annotation.Nullable java.lang.Object arg1);
    public int hashCode();
    public V leftValue();
    public V rightValue();
  }
  // Methods

  public boolean equals(@javax.annotation.Nullable java.lang.Object arg1);
  public int hashCode();
  public boolean areEqual();
  public java.util.Map<K, V> entriesOnlyOnLeft();
  public java.util.Map<K, V> entriesOnlyOnRight();
  public java.util.Map<K, V> entriesInCommon();
  public java.util.Map<K, MapDifference.ValueDifference<V>> entriesDiffering();
}
