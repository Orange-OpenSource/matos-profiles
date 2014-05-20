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


public class SuballocatedIntVector
{
  // Fields

  protected int m_blocksize;

  protected int m_SHIFT;

  protected int m_MASK;

  protected static final int NUMBLOCKS_DEFAULT = 0;

  protected int m_numblocks;

  protected int [] [] m_map;

  protected int m_firstFree;

  protected int [] m_map0;

  protected int [] m_buildCache;

  protected int m_buildCacheStartIndex;

  // Constructors

  public SuballocatedIntVector(){
  }
  public SuballocatedIntVector(int arg1, int arg2){
  }
  public SuballocatedIntVector(int arg1){
  }
  // Methods

  public int indexOf(int arg1, int arg2){
    return 0;
  }
  public int indexOf(int arg1){
    return 0;
  }
  public int size(){
    return 0;
  }
  public void addElement(int arg1){
  }
  public int elementAt(int arg1){
    return 0;
  }
  public void removeAllElements(){
  }
  public void setElementAt(int arg1, int arg2){
  }
  public void setSize(int arg1){
  }
  public final int [] [] getMap(){
    return (int [] []) null;
  }
  public final int [] getMap0(){
    return (int []) null;
  }
}
