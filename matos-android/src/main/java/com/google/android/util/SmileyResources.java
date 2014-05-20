package com.google.android.util;

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


public class SmileyResources
  implements AbstractMessageParser.Resources
{
  // Constructors

  public SmileyResources(java.lang.String [] arg1, int [] arg2){
  }
  // Methods

  public AbstractMessageParser.TrieNode getSmileys(){
    return (AbstractMessageParser.TrieNode) null;
  }
  public AbstractMessageParser.TrieNode getAcronyms(){
    return (AbstractMessageParser.TrieNode) null;
  }
  public AbstractMessageParser.TrieNode getDomainSuffixes(){
    return (AbstractMessageParser.TrieNode) null;
  }
  public java.util.Set<java.lang.String> getSchemes(){
    return (java.util.Set) null;
  }
  public int getSmileyRes(java.lang.String arg1){
    return 0;
  }
}
