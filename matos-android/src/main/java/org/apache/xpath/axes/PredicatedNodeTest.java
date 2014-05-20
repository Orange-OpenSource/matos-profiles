package org.apache.xpath.axes;

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


public abstract class PredicatedNodeTest
  extends org.apache.xpath.patterns.NodeTest  implements SubContextList
{
  // Fields

  protected int m_predCount;

  protected boolean m_foundLast;

  protected LocPathIterator m_lpi;

  protected int [] m_proximityPositions;

  // Constructors

  PredicatedNodeTest(LocPathIterator arg1){
    super(0, (java.lang.String) null, (java.lang.String) null);
  }
  PredicatedNodeTest(){
    super(0, (java.lang.String) null, (java.lang.String) null);
  }
  // Methods

  public java.lang.Object clone() throws java.lang.CloneNotSupportedException{
    return (java.lang.Object) null;
  }
  public boolean deepEquals(org.apache.xpath.Expression arg1){
    return false;
  }
  public boolean canTraverseOutsideSubtree(){
    return false;
  }
  public void fixupVariables(java.util.Vector arg1, int arg2){
  }
  public abstract int getLastPos(org.apache.xpath.XPathContext arg1);
  public void setLocPathIterator(LocPathIterator arg1){
  }
  public int getPredicateCount(){
    return 0;
  }
  public int getProximityPosition(){
    return 0;
  }
  public int getProximityPosition(org.apache.xpath.XPathContext arg1){
    return 0;
  }
  protected int getProximityPosition(int arg1){
    return 0;
  }
  public void callPredicateVisitors(org.apache.xpath.XPathVisitor arg1){
  }
  public void setPredicateCount(int arg1){
  }
  protected void initPredicateInfo(org.apache.xpath.compiler.Compiler arg1, int arg2) throws javax.xml.transform.TransformerException{
  }
  public org.apache.xpath.Expression getPredicate(int arg1){
    return (org.apache.xpath.Expression) null;
  }
  public void resetProximityPositions(){
  }
  public void initProximityPosition(int arg1) throws javax.xml.transform.TransformerException{
  }
  protected void countProximityPosition(int arg1){
  }
  public boolean isReverseAxes(){
    return false;
  }
  public int getPredicateIndex(){
    return 0;
  }
  protected java.lang.String nodeToString(int arg1){
    return (java.lang.String) null;
  }
  public short acceptNode(int arg1){
    return (short) 0;
  }
  public LocPathIterator getLocPathIterator(){
    return (LocPathIterator) null;
  }
}
