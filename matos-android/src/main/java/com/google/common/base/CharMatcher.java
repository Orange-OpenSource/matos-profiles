package com.google.common.base;

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


@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.CharMatcherImplem", superClass = "")
public abstract class CharMatcher
  implements Predicate<java.lang.Character>
{
  // Classes

  protected static class LookupTable
  {
    // Constructors

    protected LookupTable(){
    }
  }
  // Fields

  public static final CharMatcher WHITESPACE = null;

  public static final CharMatcher BREAKING_WHITESPACE = null;

  public static final CharMatcher ASCII = null;

  public static final CharMatcher DIGIT = null;

  public static final CharMatcher JAVA_WHITESPACE = null;

  public static final CharMatcher JAVA_DIGIT = null;

  public static final CharMatcher JAVA_LETTER = null;

  public static final CharMatcher JAVA_LETTER_OR_DIGIT = null;

  public static final CharMatcher JAVA_UPPER_CASE = null;

  public static final CharMatcher JAVA_LOWER_CASE = null;

  public static final CharMatcher JAVA_ISO_CONTROL = null;

  public static final CharMatcher INVISIBLE = null;

  public static final CharMatcher SINGLE_WIDTH = null;

  public static final CharMatcher ANY = null;

  public static final CharMatcher NONE = null;

  // Constructors

  public CharMatcher(){
  }
  // Methods

  public abstract boolean matches(char arg1);
  public static CharMatcher is(char arg1){
    return (CharMatcher) null;
  }
  public CharMatcher and(CharMatcher arg1){
    return (CharMatcher) null;
  }
  public CharMatcher or(CharMatcher arg1){
    return (CharMatcher) null;
  }
  public static CharMatcher inRange(char arg1, char arg2){
    return (CharMatcher) null;
  }
  public boolean apply(java.lang.Character arg1){
    return false;
  }
  public static CharMatcher noneOf(java.lang.CharSequence arg1){
    return (CharMatcher) null;
  }
  public CharMatcher negate(){
    return (CharMatcher) null;
  }
  public static CharMatcher forPredicate(Predicate<? super java.lang.Character> arg1){
    return (CharMatcher) null;
  }
  public java.lang.String removeFrom(java.lang.CharSequence arg1){
    return (java.lang.String) null;
  }
  protected void setBits(CharMatcher.LookupTable arg1){
  }
  public int indexIn(java.lang.CharSequence arg1){
    return 0;
  }
  public int indexIn(java.lang.CharSequence arg1, int arg2){
    return 0;
  }
  public static CharMatcher isNot(char arg1){
    return (CharMatcher) null;
  }
  public static CharMatcher anyOf(java.lang.CharSequence arg1){
    return (CharMatcher) null;
  }
  public CharMatcher precomputed(){
    return (CharMatcher) null;
  }
  public boolean matchesAllOf(java.lang.CharSequence arg1){
    return false;
  }
  public boolean matchesNoneOf(java.lang.CharSequence arg1){
    return false;
  }
  public int lastIndexIn(java.lang.CharSequence arg1){
    return 0;
  }
  public int countIn(java.lang.CharSequence arg1){
    return 0;
  }
  public java.lang.String retainFrom(java.lang.CharSequence arg1){
    return (java.lang.String) null;
  }
  public java.lang.String replaceFrom(java.lang.CharSequence arg1, char arg2){
    return (java.lang.String) null;
  }
  public java.lang.String replaceFrom(java.lang.CharSequence arg1, java.lang.CharSequence arg2){
    return (java.lang.String) null;
  }
  public java.lang.String trimFrom(java.lang.CharSequence arg1){
    return (java.lang.String) null;
  }
  public java.lang.String trimLeadingFrom(java.lang.CharSequence arg1){
    return (java.lang.String) null;
  }
  public java.lang.String trimTrailingFrom(java.lang.CharSequence arg1){
    return (java.lang.String) null;
  }
  public java.lang.String collapseFrom(java.lang.CharSequence arg1, char arg2){
    return (java.lang.String) null;
  }
  public java.lang.String trimAndCollapseFrom(java.lang.CharSequence arg1, char arg2){
    return (java.lang.String) null;
  }
}
