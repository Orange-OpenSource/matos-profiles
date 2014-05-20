package org.apache.xml.utils;

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


public class StringVector
  implements java.io.Serializable
{
  // Fields

  protected int m_blocksize;

  protected java.lang.String [] m_map;

  protected int m_firstFree;

  protected int m_mapSize;

  // Constructors

  public StringVector(){
  }
  public StringVector(int arg1){
  }
  // Methods

  public int getLength(){
    return 0;
  }
  public final boolean contains(java.lang.String arg1){
    return false;
  }
  public final int size(){
    return 0;
  }
  public final void addElement(java.lang.String arg1){
  }
  public final java.lang.String elementAt(int arg1){
    return (java.lang.String) null;
  }
  public final java.lang.String pop(){
    return (java.lang.String) null;
  }
  public final void push(java.lang.String arg1){
  }
  public final java.lang.String peek(){
    return (java.lang.String) null;
  }
  public final boolean containsIgnoreCase(java.lang.String arg1){
    return false;
  }
}
