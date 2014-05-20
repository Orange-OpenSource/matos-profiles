package org.apache.xpath.compiler;

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


public class OpMap
{
  // Fields

  protected java.lang.String m_currentPattern;

  public static final int MAPINDEX_LENGTH = 1;

  // Constructors

  public OpMap(){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public void error(java.lang.String arg1, java.lang.Object [] arg2) throws javax.xml.transform.TransformerException{
  }
  public int getFirstPredicateOpPos(int arg1) throws javax.xml.transform.TransformerException{
    return 0;
  }
  public int getOp(int arg1){
    return 0;
  }
  public int getNextStepPos(int arg1){
    return 0;
  }
  public static int getFirstChildPos(int arg1){
    return 0;
  }
  public int getNextOpPos(int arg1){
    return 0;
  }
  public static int getNextOpPos(int [] arg1, int arg2){
    return 0;
  }
  public int getArgLength(int arg1){
    return 0;
  }
  public int getArgLengthOfStep(int arg1){
    return 0;
  }
  public int getStepTestType(int arg1){
    return 0;
  }
  public java.lang.String getStepNS(int arg1){
    return (java.lang.String) null;
  }
  public java.lang.String getStepLocalName(int arg1){
    return (java.lang.String) null;
  }
  public void setOp(int arg1, int arg2){
  }
  public int getTokenQueueSize(){
    return 0;
  }
  public java.lang.String getPatternString(){
    return (java.lang.String) null;
  }
  public org.apache.xml.utils.ObjectVector getTokenQueue(){
    return (org.apache.xml.utils.ObjectVector) null;
  }
  public java.lang.Object getToken(int arg1){
    return (java.lang.Object) null;
  }
  public OpMapVector getOpMap(){
    return (OpMapVector) null;
  }
  public static int getFirstChildPosOfStep(int arg1){
    return 0;
  }
}
