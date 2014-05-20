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


public class Function3Args
  extends Function2Args{
  // Constructors

  public Function3Args(){
    super();
  }
  // Methods

  public boolean deepEquals(org.apache.xpath.Expression arg1){
    return false;
  }
  public void checkNumberArgs(int arg1) throws WrongNumberArgsException{
  }
  protected void reportWrongNumberArgs() throws WrongNumberArgsException{
  }
  public boolean canTraverseOutsideSubtree(){
    return false;
  }
  public void setArg(org.apache.xpath.Expression arg1, int arg2) throws WrongNumberArgsException{
  }
  public void fixupVariables(java.util.Vector arg1, int arg2){
  }
  public void callArgVisitors(org.apache.xpath.XPathVisitor arg1){
  }
  public org.apache.xpath.Expression getArg2(){
    return (org.apache.xpath.Expression) null;
  }
}
