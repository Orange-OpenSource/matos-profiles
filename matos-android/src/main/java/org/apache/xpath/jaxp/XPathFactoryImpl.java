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


public class XPathFactoryImpl
  extends javax.xml.xpath.XPathFactory{
  // Constructors

  public XPathFactoryImpl(){
    super();
  }
  // Methods

  public void setXPathVariableResolver(@com.francetelecom.rd.stubs.annotation.CallBackRegister("resolveVariable") javax.xml.xpath.XPathVariableResolver arg1){
  }
  public void setXPathFunctionResolver(@com.francetelecom.rd.stubs.annotation.CallBackRegister("resolveFunction") javax.xml.xpath.XPathFunctionResolver arg1){
  }
  public boolean getFeature(java.lang.String arg1) throws javax.xml.xpath.XPathFactoryConfigurationException{
    return false;
  }
  public void setFeature(java.lang.String arg1, boolean arg2) throws javax.xml.xpath.XPathFactoryConfigurationException{
  }
  public boolean isObjectModelSupported(java.lang.String arg1){
    return false;
  }
  public javax.xml.xpath.XPath newXPath(){
    return (javax.xml.xpath.XPath) null;
  }
}
