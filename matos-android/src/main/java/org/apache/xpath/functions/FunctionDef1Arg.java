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


public class FunctionDef1Arg
  extends FunctionOneArg{
  // Constructors

  public FunctionDef1Arg(){
    super();
  }
  // Methods

  protected org.apache.xml.utils.XMLString getArg0AsString(org.apache.xpath.XPathContext arg1) throws javax.xml.transform.TransformerException{
    return (org.apache.xml.utils.XMLString) null;
  }
  public boolean Arg0IsNodesetExpr(){
    return false;
  }
  protected int getArg0AsNode(org.apache.xpath.XPathContext arg1) throws javax.xml.transform.TransformerException{
    return 0;
  }
  protected double getArg0AsNumber(org.apache.xpath.XPathContext arg1) throws javax.xml.transform.TransformerException{
    return 0.0d;
  }
  public void checkNumberArgs(int arg1) throws WrongNumberArgsException{
  }
  protected void reportWrongNumberArgs() throws WrongNumberArgsException{
  }
  public boolean canTraverseOutsideSubtree(){
    return false;
  }
}
