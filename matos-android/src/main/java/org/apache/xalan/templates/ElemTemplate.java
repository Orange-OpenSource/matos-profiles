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


public class ElemTemplate
  extends ElemTemplateElement{
  // Fields

  public int m_frameSize;

  // Constructors

  public ElemTemplate(){
    super();
  }
  // Methods

  public org.apache.xml.utils.QName getName(){
    return (org.apache.xml.utils.QName) null;
  }
  public void setPriority(double arg1){
  }
  public double getPriority(){
    return 0.0d;
  }
  public void setName(org.apache.xml.utils.QName arg1){
  }
  public void execute(org.apache.xalan.transformer.TransformerImpl arg1) throws javax.xml.transform.TransformerException{
  }
  public java.lang.String getPublicId(){
    return (java.lang.String) null;
  }
  public java.lang.String getSystemId(){
    return (java.lang.String) null;
  }
  public java.lang.String getNodeName(){
    return (java.lang.String) null;
  }
  public int getXSLToken(){
    return 0;
  }
  public StylesheetComposed getStylesheetComposed(){
    return (StylesheetComposed) null;
  }
  public Stylesheet getStylesheet(){
    return (Stylesheet) null;
  }
  public StylesheetRoot getStylesheetRoot(){
    return (StylesheetRoot) null;
  }
  public void recompose(StylesheetRoot arg1){
  }
  public void compose(StylesheetRoot arg1) throws javax.xml.transform.TransformerException{
  }
  public void endCompose(StylesheetRoot arg1) throws javax.xml.transform.TransformerException{
  }
  public void setLocaterInfo(javax.xml.transform.SourceLocator arg1){
  }
  public org.apache.xml.utils.QName getMode(){
    return (org.apache.xml.utils.QName) null;
  }
  public org.apache.xpath.XPath getMatch(){
    return (org.apache.xpath.XPath) null;
  }
  public void setMode(org.apache.xml.utils.QName arg1){
  }
  public void setMatch(org.apache.xpath.XPath arg1){
  }
  public void setStylesheet(Stylesheet arg1){
  }
}
