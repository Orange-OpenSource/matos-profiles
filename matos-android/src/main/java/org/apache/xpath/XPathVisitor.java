package org.apache.xpath;

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


public class XPathVisitor
{
  // Constructors

  public XPathVisitor(){
  }
  // Methods

  public boolean visitFunction(ExpressionOwner arg1, org.apache.xpath.functions.Function arg2){
    return false;
  }
  public boolean visitVariableRef(ExpressionOwner arg1, org.apache.xpath.operations.Variable arg2){
    return false;
  }
  public boolean visitLocationPath(ExpressionOwner arg1, org.apache.xpath.axes.LocPathIterator arg2){
    return false;
  }
  public boolean visitStep(ExpressionOwner arg1, org.apache.xpath.patterns.NodeTest arg2){
    return false;
  }
  public boolean visitPredicate(ExpressionOwner arg1, Expression arg2){
    return false;
  }
  public boolean visitBinaryOperation(ExpressionOwner arg1, org.apache.xpath.operations.Operation arg2){
    return false;
  }
  public boolean visitMatchPattern(ExpressionOwner arg1, org.apache.xpath.patterns.StepPattern arg2){
    return false;
  }
  public boolean visitUnaryOperation(ExpressionOwner arg1, org.apache.xpath.operations.UnaryOperation arg2){
    return false;
  }
  public boolean visitUnionPath(ExpressionOwner arg1, org.apache.xpath.axes.UnionPathIterator arg2){
    return false;
  }
  public boolean visitUnionPattern(ExpressionOwner arg1, org.apache.xpath.patterns.UnionPattern arg2){
    return false;
  }
  public boolean visitStringLiteral(ExpressionOwner arg1, org.apache.xpath.objects.XString arg2){
    return false;
  }
  public boolean visitNumberLiteral(ExpressionOwner arg1, org.apache.xpath.objects.XNumber arg2){
    return false;
  }
}
