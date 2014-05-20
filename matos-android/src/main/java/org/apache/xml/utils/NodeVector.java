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


public class NodeVector
  implements java.io.Serializable, java.lang.Cloneable
{
  // Fields

  protected int m_firstFree;

  // Constructors

  public NodeVector(){
  }
  public NodeVector(int arg1){
  }
  // Methods

  public java.lang.Object clone() throws java.lang.CloneNotSupportedException{
    return (java.lang.Object) null;
  }
  public int indexOf(int arg1, int arg2){
    return 0;
  }
  public int indexOf(int arg1){
    return 0;
  }
  public boolean contains(int arg1){
    return false;
  }
  public int size(){
    return 0;
  }
  public void addElement(int arg1){
  }
  public int elementAt(int arg1){
    return 0;
  }
  public final int pop(){
    return 0;
  }
  public final void push(int arg1){
  }
  public void sort(int [] arg1, int arg2, int arg3) throws java.lang.Exception{
  }
  public void sort() throws java.lang.Exception{
  }
  public void insertElementAt(int arg1, int arg2){
  }
  public void removeAllElements(){
  }
  public boolean removeElement(int arg1){
    return false;
  }
  public void removeElementAt(int arg1){
  }
  public void setElementAt(int arg1, int arg2){
  }
  public final int popAndTop(){
    return 0;
  }
  public final void popQuick(){
  }
  public final int peepOrNull(){
    return 0;
  }
  public final void pushPair(int arg1, int arg2){
  }
  public final void popPair(){
  }
  public final void setTail(int arg1){
  }
  public final void setTailSub1(int arg1){
  }
  public final int peepTail(){
    return 0;
  }
  public final int peepTailSub1(){
    return 0;
  }
  public void insertInOrder(int arg1){
  }
  public void appendNodes(NodeVector arg1){
  }
  public void RemoveAllNoClear(){
  }
}
