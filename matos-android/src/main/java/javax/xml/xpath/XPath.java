package javax.xml.xpath;

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


public interface XPath
{
  // Methods

  public XPathExpression compile(java.lang.String arg1) throws XPathExpressionException;
  public void reset();
  public void setXPathVariableResolver(@com.francetelecom.rd.stubs.annotation.CallBackRegister("resolveVariable") XPathVariableResolver arg1);
  public XPathVariableResolver getXPathVariableResolver();
  public void setXPathFunctionResolver(@com.francetelecom.rd.stubs.annotation.CallBackRegister("resolveFunction") XPathFunctionResolver arg1);
  public XPathFunctionResolver getXPathFunctionResolver();
  public void setNamespaceContext(javax.xml.namespace.NamespaceContext arg1);
  public javax.xml.namespace.NamespaceContext getNamespaceContext();
  public java.lang.Object evaluate(java.lang.String arg1, java.lang.Object arg2, javax.xml.namespace.QName arg3) throws XPathExpressionException;
  public java.lang.String evaluate(java.lang.String arg1, java.lang.Object arg2) throws XPathExpressionException;
  public java.lang.Object evaluate(java.lang.String arg1, org.xml.sax.InputSource arg2, javax.xml.namespace.QName arg3) throws XPathExpressionException;
  public java.lang.String evaluate(java.lang.String arg1, org.xml.sax.InputSource arg2) throws XPathExpressionException;
}
