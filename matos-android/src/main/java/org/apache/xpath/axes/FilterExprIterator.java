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


public class FilterExprIterator
  extends BasicTestIterator{
  // Constructors

  public FilterExprIterator(){
    super();
  }
  public FilterExprIterator(org.apache.xpath.Expression arg1){
    super();
  }
  // Methods

  public boolean deepEquals(org.apache.xpath.Expression arg1){
    return false;
  }
  public void fixupVariables(java.util.Vector arg1, int arg2){
  }
  public void detach(){
  }
  public int getAnalysisBits(){
    return 0;
  }
  public void setRoot(int arg1, java.lang.Object arg2){
  }
  public boolean isDocOrdered(){
    return false;
  }
  public void callPredicateVisitors(org.apache.xpath.XPathVisitor arg1){
  }
  protected int getNextNode(){
    return 0;
  }
  public void setInnerExpression(org.apache.xpath.Expression arg1){
  }
  public org.apache.xpath.Expression getInnerExpression(){
    return (org.apache.xpath.Expression) null;
  }
}
