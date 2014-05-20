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


public class RuleBasedCollator
  extends Collator{
  // Constructors

  RuleBasedCollator(libcore.icu.RuleBasedCollatorICU arg1){
    super();
  }
  public RuleBasedCollator(java.lang.String arg1) throws ParseException{
    super();
  }
  // Methods

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
  public CollationKey getCollationKey(java.lang.String arg1){
    return (CollationKey) null;
  }
  public java.lang.String getRules(){
    return (java.lang.String) null;
  }
  public CollationElementIterator getCollationElementIterator(CharacterIterator arg1){
    return (CollationElementIterator) null;
  }
  public CollationElementIterator getCollationElementIterator(java.lang.String arg1){
    return (CollationElementIterator) null;
  }
}
