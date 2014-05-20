package org.apache.xpath.jaxp;

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


public class XPathExpressionImpl
  implements javax.xml.xpath.XPathExpression
{
  // Constructors

  protected XPathExpressionImpl(){
  }
  protected XPathExpressionImpl(org.apache.xpath.XPath arg1, JAXPPrefixResolver arg2, javax.xml.xpath.XPathFunctionResolver arg3, javax.xml.xpath.XPathVariableResolver arg4){
  }
  protected XPathExpressionImpl(org.apache.xpath.XPath arg1, JAXPPrefixResolver arg2, javax.xml.xpath.XPathFunctionResolver arg3, javax.xml.xpath.XPathVariableResolver arg4, boolean arg5){
  }
  // Methods

  public java.lang.Object evaluate(java.lang.Object arg1, javax.xml.namespace.QName arg2) throws javax.xml.xpath.XPathExpressionException{
    return (java.lang.Object) null;
  }
  public java.lang.String evaluate(java.lang.Object arg1) throws javax.xml.xpath.XPathExpressionException{
    return (java.lang.String) null;
  }
  public java.lang.Object evaluate(org.xml.sax.InputSource arg1, javax.xml.namespace.QName arg2) throws javax.xml.xpath.XPathExpressionException{
    return (java.lang.Object) null;
  }
  public java.lang.String evaluate(org.xml.sax.InputSource arg1) throws javax.xml.xpath.XPathExpressionException{
    return (java.lang.String) null;
  }
  public java.lang.Object eval(java.lang.Object arg1, javax.xml.namespace.QName arg2) throws javax.xml.transform.TransformerException{
    return (java.lang.Object) null;
  }
  public void setXPath(org.apache.xpath.XPath arg1){
  }
}
