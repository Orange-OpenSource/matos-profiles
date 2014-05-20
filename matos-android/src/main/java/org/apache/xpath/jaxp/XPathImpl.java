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


public class XPathImpl
  implements javax.xml.xpath.XPath
{
  // Constructors

  XPathImpl(javax.xml.xpath.XPathVariableResolver arg1, javax.xml.xpath.XPathFunctionResolver arg2){
  }
  XPathImpl(javax.xml.xpath.XPathVariableResolver arg1, javax.xml.xpath.XPathFunctionResolver arg2, boolean arg3){
  }
  // Methods

  public javax.xml.xpath.XPathExpression compile(java.lang.String arg1) throws javax.xml.xpath.XPathExpressionException{
    return (javax.xml.xpath.XPathExpression) null;
  }
  public void reset(){
  }
  public void setXPathVariableResolver(javax.xml.xpath.XPathVariableResolver arg1){
  }
  public javax.xml.xpath.XPathVariableResolver getXPathVariableResolver(){
    return (javax.xml.xpath.XPathVariableResolver) null;
  }
  public void setXPathFunctionResolver(javax.xml.xpath.XPathFunctionResolver arg1){
  }
  public javax.xml.xpath.XPathFunctionResolver getXPathFunctionResolver(){
    return (javax.xml.xpath.XPathFunctionResolver) null;
  }
  public void setNamespaceContext(javax.xml.namespace.NamespaceContext arg1){
  }
  public javax.xml.namespace.NamespaceContext getNamespaceContext(){
    return (javax.xml.namespace.NamespaceContext) null;
  }
  public java.lang.Object evaluate(java.lang.String arg1, java.lang.Object arg2, javax.xml.namespace.QName arg3) throws javax.xml.xpath.XPathExpressionException{
    return (java.lang.Object) null;
  }
  public java.lang.String evaluate(java.lang.String arg1, java.lang.Object arg2) throws javax.xml.xpath.XPathExpressionException{
    return (java.lang.String) null;
  }
  public java.lang.Object evaluate(java.lang.String arg1, org.xml.sax.InputSource arg2, javax.xml.namespace.QName arg3) throws javax.xml.xpath.XPathExpressionException{
    return (java.lang.Object) null;
  }
  public java.lang.String evaluate(java.lang.String arg1, org.xml.sax.InputSource arg2) throws javax.xml.xpath.XPathExpressionException{
    return (java.lang.String) null;
  }
}
