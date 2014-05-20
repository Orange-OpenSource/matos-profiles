package java.text;

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


public abstract class Collator
  implements java.util.Comparator<java.lang.Object>, java.lang.Cloneable
{
  // Fields

  public static final int NO_DECOMPOSITION = 0;

  public static final int CANONICAL_DECOMPOSITION = 1;

  public static final int FULL_DECOMPOSITION = 2;

  public static final int PRIMARY = 0;

  public static final int SECONDARY = 1;

  public static final int TERTIARY = 2;

  public static final int IDENTICAL = 3;

  // Constructors

  Collator(libcore.icu.RuleBasedCollatorICU arg1){
  }
  protected Collator(){
  }
  // Methods

  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public boolean equals(java.lang.String arg1, java.lang.String arg2){
    return false;
  }
  public abstract int hashCode();
  public java.lang.Object clone(){
    return (java.lang.Object) null;
  }
  public int compare(java.lang.Object arg1, java.lang.Object arg2){
    return 0;
  }
  public abstract int compare(java.lang.String arg1, java.lang.String arg2);
  public static Collator getInstance(){
    return (Collator) null;
  }
  public static Collator getInstance(java.util.Locale arg1){
    return (Collator) null;
  }
  public static java.util.Locale [] getAvailableLocales(){
    return (java.util.Locale []) null;
  }
  public abstract CollationKey getCollationKey(java.lang.String arg1);
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
