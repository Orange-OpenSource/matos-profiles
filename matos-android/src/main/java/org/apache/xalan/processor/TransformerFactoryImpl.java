package org.apache.xalan.processor;

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


public class TransformerFactoryImpl
  extends javax.xml.transform.sax.SAXTransformerFactory{
  // Fields

  public static final java.lang.String XSLT_PROPERTIES = "org/apache/xalan/res/XSLTInfo.properties";

  public static final java.lang.String FEATURE_INCREMENTAL = "http://xml.apache.org/xalan/features/incremental";

  public static final java.lang.String FEATURE_OPTIMIZE = "http://xml.apache.org/xalan/features/optimize";

  public static final java.lang.String FEATURE_SOURCE_LOCATION = "http://xml.apache.org/xalan/properties/source-location";

  // Constructors

  public TransformerFactoryImpl(){
    super();
  }
  // Methods

  public java.lang.Object getAttribute(java.lang.String arg1) throws java.lang.IllegalArgumentException{
    return (java.lang.Object) null;
  }
  public void setAttribute(java.lang.String arg1, java.lang.Object arg2) throws java.lang.IllegalArgumentException{
  }
  public boolean getFeature(java.lang.String arg1){
    return false;
  }
  public void setFeature(java.lang.String arg1, boolean arg2) throws javax.xml.transform.TransformerConfigurationException{
  }
  public javax.xml.transform.ErrorListener getErrorListener(){
    return (javax.xml.transform.ErrorListener) null;
  }
  public javax.xml.transform.Templates processFromNode(org.w3c.dom.Node arg1) throws javax.xml.transform.TransformerConfigurationException{
    return (javax.xml.transform.Templates) null;
  }
  public javax.xml.transform.Source getAssociatedStylesheet(javax.xml.transform.Source arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4) throws javax.xml.transform.TransformerConfigurationException{
    return (javax.xml.transform.Source) null;
  }
  public javax.xml.transform.sax.TemplatesHandler newTemplatesHandler() throws javax.xml.transform.TransformerConfigurationException{
    return (javax.xml.transform.sax.TemplatesHandler) null;
  }
  public org.xml.sax.XMLFilter newXMLFilter(javax.xml.transform.Source arg1) throws javax.xml.transform.TransformerConfigurationException{
    return (org.xml.sax.XMLFilter) null;
  }
  public org.xml.sax.XMLFilter newXMLFilter(javax.xml.transform.Templates arg1) throws javax.xml.transform.TransformerConfigurationException{
    return (org.xml.sax.XMLFilter) null;
  }
  public javax.xml.transform.sax.TransformerHandler newTransformerHandler(javax.xml.transform.Source arg1) throws javax.xml.transform.TransformerConfigurationException{
    return (javax.xml.transform.sax.TransformerHandler) null;
  }
  public javax.xml.transform.sax.TransformerHandler newTransformerHandler(javax.xml.transform.Templates arg1) throws javax.xml.transform.TransformerConfigurationException{
    return (javax.xml.transform.sax.TransformerHandler) null;
  }
  public javax.xml.transform.sax.TransformerHandler newTransformerHandler() throws javax.xml.transform.TransformerConfigurationException{
    return (javax.xml.transform.sax.TransformerHandler) null;
  }
  public javax.xml.transform.Transformer newTransformer(javax.xml.transform.Source arg1) throws javax.xml.transform.TransformerConfigurationException{
    return (javax.xml.transform.Transformer) null;
  }
  public javax.xml.transform.Transformer newTransformer() throws javax.xml.transform.TransformerConfigurationException{
    return (javax.xml.transform.Transformer) null;
  }
  public javax.xml.transform.Templates newTemplates(javax.xml.transform.Source arg1) throws javax.xml.transform.TransformerConfigurationException{
    return (javax.xml.transform.Templates) null;
  }
  public void setURIResolver(javax.xml.transform.URIResolver arg1){
  }
  public javax.xml.transform.URIResolver getURIResolver(){
    return (javax.xml.transform.URIResolver) null;
  }
  public void setErrorListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("ErrorListener") javax.xml.transform.ErrorListener arg1) throws java.lang.IllegalArgumentException{
  }
  public boolean isSecureProcessing(){
    return false;
  }
}
