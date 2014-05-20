package java.util.regex;

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


public final class Pattern
  implements java.io.Serializable
{
  // Fields

  public static final int UNIX_LINES = 1;

  public static final int CASE_INSENSITIVE = 2;

  public static final int COMMENTS = 4;

  public static final int MULTILINE = 8;

  public static final int LITERAL = 16;

  public static final int DOTALL = 32;

  public static final int UNICODE_CASE = 64;

  public static final int CANON_EQ = 128;

  // Constructors

  private Pattern(java.lang.String arg1, int arg2) throws PatternSyntaxException{
  }
  // Methods

  protected void finalize() throws java.lang.Throwable{
  }
  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public int flags(){
    return 0;
  }
  public static Pattern compile(java.lang.String arg1, int arg2) throws PatternSyntaxException{
    return (Pattern) null;
  }
  public static Pattern compile(java.lang.String arg1){
    return (Pattern) null;
  }
  public Matcher matcher(java.lang.CharSequence arg1){
    return (Matcher) null;
  }
  public static boolean matches(java.lang.String arg1, java.lang.CharSequence arg2){
    return false;
  }
  public java.lang.String [] split(java.lang.CharSequence arg1, int arg2){
    return (java.lang.String []) null;
  }
  public java.lang.String [] split(java.lang.CharSequence arg1){
    return (java.lang.String []) null;
  }
  public static java.lang.String quote(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public java.lang.String pattern(){
    return (java.lang.String) null;
  }
}
