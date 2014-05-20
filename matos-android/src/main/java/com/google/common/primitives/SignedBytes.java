package com.google.common.primitives;

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


public final class SignedBytes
{
  // Constructors

  private SignedBytes(){
  }
  // Methods

  public static byte min(byte [] arg1){
    return (byte) 0;
  }
  public static byte max(byte [] arg1){
    return (byte) 0;
  }
  public static int compare(byte arg1, byte arg2){
    return 0;
  }
  public static java.lang.String join(java.lang.String arg1, byte [] arg2){
    return (java.lang.String) null;
  }
  public static byte checkedCast(long arg1){
    return (byte) 0;
  }
  public static byte saturatedCast(long arg1){
    return (byte) 0;
  }
  public static java.util.Comparator<byte []> lexicographicalComparator(){
    return (java.util.Comparator) null;
  }
}
