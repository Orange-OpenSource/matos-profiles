package libcore.icu;

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
public final class RuleBasedCollatorICU
  implements java.lang.Cloneable
{
  // Fields

  public static final int VALUE_DEFAULT = -1;

  public static final int VALUE_PRIMARY = 0;

  public static final int VALUE_SECONDARY = 1;

  public static final int VALUE_TERTIARY = 2;

  public static final int VALUE_DEFAULT_STRENGTH = 2;

  public static final int VALUE_QUATERNARY = 3;

  public static final int VALUE_IDENTICAL = 15;

  public static final int VALUE_OFF = 16;

  public static final int VALUE_ON = 17;

  public static final int VALUE_SHIFTED = 20;

  public static final int VALUE_NON_IGNORABLE = 21;

  public static final int VALUE_LOWER_FIRST = 24;

  public static final int VALUE_UPPER_FIRST = 25;

  public static final int VALUE_ON_WITHOUT_HANGUL = 28;

  public static final int VALUE_ATTRIBUTE_VALUE_COUNT = 29;

  public static final int FRENCH_COLLATION = 0;

  public static final int ALTERNATE_HANDLING = 1;

  public static final int CASE_FIRST = 2;

  public static final int CASE_LEVEL = 3;

  public static final int DECOMPOSITION_MODE = 4;

  public static final int STRENGTH = 5;

  // Constructors

  public RuleBasedCollatorICU(java.lang.String arg1) throws java.text.ParseException{
  }
  public RuleBasedCollatorICU(java.util.Locale arg1){
  }
  private RuleBasedCollatorICU(int arg1){
  }
  // Methods

  protected void finalize() throws java.lang.Throwable{
  }
  public boolean equals(java.lang.String arg1, java.lang.String arg2){
    return false;
  }
  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public int hashCode(){
    return 0;
  }
  public java.lang.Object clone(){
    return (java.lang.Object) null;
  }
  public int compare(java.lang.String arg1, java.lang.String arg2){
    return 0;
  }
  public int getAttribute(int arg1){
    return 0;
  }
  public java.text.CollationKey getCollationKey(java.lang.String arg1){
    return (java.text.CollationKey) null;
  }
  public java.lang.String getRules(){
    return (java.lang.String) null;
  }
  public CollationElementIteratorICU getCollationElementIterator(java.lang.String arg1){
    return (CollationElementIteratorICU) null;
  }
  public CollationElementIteratorICU getCollationElementIterator(java.text.CharacterIterator arg1){
    return (CollationElementIteratorICU) null;
  }
  public void setAttribute(int arg1, int arg2){
  }
  public void setStrength(int arg1){
  }
  public int getStrength(){
    return 0;
  }
  public int getDecomposition(){
    return 0;
  }
  public void setDecomposition(int arg1){
  }
}
