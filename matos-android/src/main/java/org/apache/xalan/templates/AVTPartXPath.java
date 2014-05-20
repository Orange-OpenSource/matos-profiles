package org.apache.xalan.templates;

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


public class AVTPartXPath
  extends AVTPart{
  // Constructors

  public AVTPartXPath(org.apache.xpath.XPath arg1){
    super();
  }
  public AVTPartXPath(java.lang.String arg1, org.apache.xml.utils.PrefixResolver arg2, org.apache.xpath.compiler.XPathParser arg3, org.apache.xpath.XPathFactory arg4, org.apache.xpath.XPathContext arg5) throws javax.xml.transform.TransformerException{
    super();
  }
  // Methods

  public void evaluate(org.apache.xpath.XPathContext arg1, org.apache.xml.utils.FastStringBuffer arg2, int arg3, org.apache.xml.utils.PrefixResolver arg4) throws javax.xml.transform.TransformerException{
  }
  public boolean canTraverseOutsideSubtree(){
    return false;
  }
  public void fixupVariables(java.util.Vector arg1, int arg2){
  }
  public void callVisitors(XSLTVisitor arg1){
  }
  public java.lang.String getSimpleString(){
    return (java.lang.String) null;
  }
}
