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


@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.ComparisonChainImplem", superClass = "")
public abstract class ComparisonChain
{
  // Constructors

  private ComparisonChain(){
  }
  // Methods

  public abstract ComparisonChain compare(java.lang.Comparable<?> arg1, java.lang.Comparable<?> arg2);
  public abstract <T>ComparisonChain compare(@javax.annotation.Nullable T arg1, @javax.annotation.Nullable T arg2, java.util.Comparator<T> arg3);
  public abstract ComparisonChain compare(int arg1, int arg2);
  public abstract ComparisonChain compare(long arg1, long arg2);
  public abstract ComparisonChain compare(float arg1, float arg2);
  public abstract ComparisonChain compare(double arg1, double arg2);
  public abstract ComparisonChain compare(boolean arg1, boolean arg2);
  public static ComparisonChain start(){
    return (ComparisonChain) null;
  }
  public abstract int result();
}
