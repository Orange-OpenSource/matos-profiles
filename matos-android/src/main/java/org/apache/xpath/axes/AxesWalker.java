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


public class AxesWalker
  extends PredicatedNodeTest  implements PathComponent, java.lang.Cloneable, org.apache.xpath.ExpressionOwner
{
  // Fields

  protected AxesWalker m_nextWalker;

  protected int m_axis;

  protected org.apache.xml.dtm.DTMAxisTraverser m_traverser;

  // Constructors

  public AxesWalker(LocPathIterator arg1, int arg2){
    super((LocPathIterator) null);
  }
  // Methods

  public java.lang.Object clone() throws java.lang.CloneNotSupportedException{
    return (java.lang.Object) null;
  }
  public void init(org.apache.xpath.compiler.Compiler arg1, int arg2, int arg3) throws javax.xml.transform.TransformerException{
  }
  public boolean deepEquals(org.apache.xpath.Expression arg1){
    return false;
  }
  public org.apache.xpath.Expression getExpression(){
    return (org.apache.xpath.Expression) null;
  }
  public void setExpression(org.apache.xpath.Expression arg1){
  }
  public void callVisitors(org.apache.xpath.ExpressionOwner arg1, org.apache.xpath.XPathVisitor arg2){
  }
  public int nextNode(){
    return 0;
  }
  public void detach(){
  }
  public int getRoot(){
    return 0;
  }
  public org.apache.xml.dtm.DTM getDTM(int arg1){
    return (org.apache.xml.dtm.DTM) null;
  }
  public int getLastPos(org.apache.xpath.XPathContext arg1){
    return 0;
  }
  public final int getCurrentNode(){
    return 0;
  }
  public int getAnalysisBits(){
    return 0;
  }
  public void setRoot(int arg1){
  }
  public boolean isDocOrdered(){
    return false;
  }
  public int getAxis(){
    return 0;
  }
  protected int getNextNode(){
    return 0;
  }
  public void setNextWalker(AxesWalker arg1){
  }
  public void setPrevWalker(AxesWalker arg1){
  }
  public final WalkingIterator wi(){
    return (WalkingIterator) null;
  }
  public AxesWalker getNextWalker(){
    return (AxesWalker) null;
  }
  public AxesWalker getPrevWalker(){
    return (AxesWalker) null;
  }
  public void setDefaultDTM(org.apache.xml.dtm.DTM arg1){
  }
}
