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


public abstract class XPathFactory
{
  // Fields

  public static final java.lang.String DEFAULT_PROPERTY_NAME = "javax.xml.xpath.XPathFactory";

  public static final java.lang.String DEFAULT_OBJECT_MODEL_URI = "http://java.sun.com/jaxp/xpath/dom";

  // Constructors

  protected XPathFactory(){
  }
  // Methods

  public static final XPathFactory newInstance(){
    return (XPathFactory) null;
  }
  public static final XPathFactory newInstance(java.lang.String arg1) throws XPathFactoryConfigurationException{
    return (XPathFactory) null;
  }
  public static XPathFactory newInstance(java.lang.String arg1, java.lang.String arg2, java.lang.ClassLoader arg3) throws XPathFactoryConfigurationException{
    return (XPathFactory) null;
  }
  public abstract void setXPathVariableResolver(@com.francetelecom.rd.stubs.annotation.CallBackRegister("resolveVariable") XPathVariableResolver arg1);
  public abstract void setXPathFunctionResolver(@com.francetelecom.rd.stubs.annotation.CallBackRegister("resolveFunction") XPathFunctionResolver arg1);
  public abstract boolean getFeature(java.lang.String arg1) throws XPathFactoryConfigurationException;
  public abstract void setFeature(java.lang.String arg1, boolean arg2) throws XPathFactoryConfigurationException;
  public abstract boolean isObjectModelSupported(java.lang.String arg1);
  public abstract XPath newXPath();
}
