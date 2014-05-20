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


public class FilterExprWalker
  extends AxesWalker{
  // Constructors

  public FilterExprWalker(WalkingIterator arg1){
    super((LocPathIterator) null, 0);
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
  public void fixupVariables(java.util.Vector arg1, int arg2){
  }
  public void detach(){
  }
  public int getLastPos(org.apache.xpath.XPathContext arg1){
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
  public void callPredicateVisitors(org.apache.xpath.XPathVisitor arg1){
  }
  public short acceptNode(int arg1){
    return (short) 0;
  }
  public int getNextNode(){
    return 0;
  }
  public void setInnerExpression(org.apache.xpath.Expression arg1){
  }
  public org.apache.xpath.Expression getInnerExpression(){
    return (org.apache.xpath.Expression) null;
  }
}
