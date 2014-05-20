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


public class ObjectVector
  implements java.lang.Cloneable
{
  // Fields

  protected int m_blocksize;

  protected java.lang.Object [] m_map;

  protected int m_firstFree;

  protected int m_mapSize;

  // Constructors

  public ObjectVector(){
  }
  public ObjectVector(int arg1){
  }
  public ObjectVector(int arg1, int arg2){
  }
  public ObjectVector(ObjectVector arg1){
  }
  // Methods

  public java.lang.Object clone() throws java.lang.CloneNotSupportedException{
    return (java.lang.Object) null;
  }
  public final int indexOf(java.lang.Object arg1, int arg2){
    return 0;
  }
  public final int indexOf(java.lang.Object arg1){
    return 0;
  }
  public final boolean contains(java.lang.Object arg1){
    return false;
  }
  public final int lastIndexOf(java.lang.Object arg1){
    return 0;
  }
  public final int size(){
    return 0;
  }
  public final void addElement(java.lang.Object arg1){
  }
  public final java.lang.Object elementAt(int arg1){
    return (java.lang.Object) null;
  }
  public final void insertElementAt(java.lang.Object arg1, int arg2){
  }
  public final void removeAllElements(){
  }
  public final boolean removeElement(java.lang.Object arg1){
    return false;
  }
  public final void removeElementAt(int arg1){
  }
  public final void setElementAt(java.lang.Object arg1, int arg2){
  }
  public final void setSize(int arg1){
  }
  public final void setToSize(int arg1){
  }
  public final void addElements(java.lang.Object arg1, int arg2){
  }
  public final void addElements(int arg1){
  }
}
