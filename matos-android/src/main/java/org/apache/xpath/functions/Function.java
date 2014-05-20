package org.apache.xpath.functions;

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


public abstract class Function
  extends org.apache.xpath.Expression{
  // Constructors

  public Function(){
    super();
  }
  // Methods

  public boolean deepEquals(org.apache.xpath.Expression arg1){
    return false;
  }
  public org.apache.xpath.objects.XObject execute(org.apache.xpath.XPathContext arg1) throws javax.xml.transform.TransformerException{
    return (org.apache.xpath.objects.XObject) null;
  }
  public void checkNumberArgs(int arg1) throws WrongNumberArgsException{
  }
  protected void reportWrongNumberArgs() throws WrongNumberArgsException{
  }
  public void setArg(org.apache.xpath.Expression arg1, int arg2) throws WrongNumberArgsException{
  }
  public void callArgVisitors(org.apache.xpath.XPathVisitor arg1){
  }
  public void callVisitors(org.apache.xpath.ExpressionOwner arg1, org.apache.xpath.XPathVisitor arg2){
  }
  public void postCompileStep(org.apache.xpath.compiler.Compiler arg1){
  }
}
