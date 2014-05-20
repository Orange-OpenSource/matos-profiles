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


public final class Chars
{
  // Fields

  public static final int BYTES = 2;

  // Constructors

  private Chars(){
  }
  // Methods

  public static int hashCode(char arg1){
    return 0;
  }
  public static char min(char [] arg1){
    return '\u0000';
  }
  public static char max(char [] arg1){
    return '\u0000';
  }
  public static int indexOf(char [] arg1, char arg2){
    return 0;
  }
  public static int indexOf(char [] arg1, char [] arg2){
    return 0;
  }
  public static int compare(char arg1, char arg2){
    return 0;
  }
  public static char [] concat(char [] [] arg1){
    return (char []) null;
  }
  public static boolean contains(char [] arg1, char arg2){
    return false;
  }
  public static int lastIndexOf(char [] arg1, char arg2){
    return 0;
  }
  public static char [] toArray(java.util.Collection<java.lang.Character> arg1){
    return (char []) null;
  }
  public static java.lang.String join(java.lang.String arg1, char [] arg2){
    return (java.lang.String) null;
  }
  public static char [] ensureCapacity(char [] arg1, int arg2, int arg3){
    return (char []) null;
  }
  public static java.util.List<java.lang.Character> asList(char [] arg1){
    return (java.util.List) null;
  }
  public static byte [] toByteArray(char arg1){
    return (byte []) null;
  }
  public static char fromByteArray(byte [] arg1){
    return '\u0000';
  }
  public static char checkedCast(long arg1){
    return '\u0000';
  }
  public static char saturatedCast(long arg1){
    return '\u0000';
  }
  public static java.util.Comparator<char []> lexicographicalComparator(){
    return (java.util.Comparator) null;
  }
}
