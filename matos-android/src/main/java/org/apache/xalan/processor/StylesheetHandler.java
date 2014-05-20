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


public class StylesheetHandler
  extends org.xml.sax.helpers.DefaultHandler  implements javax.xml.transform.sax.TemplatesHandler, org.apache.xml.utils.PrefixResolver, org.apache.xml.utils.NodeConsumer
{
  // Fields

  public static final int STYPE_ROOT = 1;

  public static final int STYPE_INCLUDE = 2;

  public static final int STYPE_IMPORT = 3;

  // Constructors

  public StylesheetHandler(TransformerFactoryImpl arg1) throws javax.xml.transform.TransformerConfigurationException{
    super();
  }
  // Methods

  public void fatalError(org.xml.sax.SAXParseException arg1) throws org.xml.sax.SAXException{
  }
  protected void error(java.lang.String arg1, java.lang.Exception arg2) throws org.xml.sax.SAXException{
  }
  protected void error(java.lang.String arg1, java.lang.Object [] arg2, java.lang.Exception arg3) throws org.xml.sax.SAXException{
  }
  public void error(org.xml.sax.SAXParseException arg1) throws org.xml.sax.SAXException{
  }
  public void warning(org.xml.sax.SAXParseException arg1) throws org.xml.sax.SAXException{
  }
  public void warn(java.lang.String arg1, java.lang.Object [] arg2) throws org.xml.sax.SAXException{
  }
  public java.lang.String getSystemId(){
    return (java.lang.String) null;
  }
  public boolean getIncremental(){
    return false;
  }
  public boolean getSource_location(){
    return false;
  }
  public void setDocumentLocator(org.xml.sax.Locator arg1){
  }
  public void startElement(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, org.xml.sax.Attributes arg4) throws org.xml.sax.SAXException{
  }
  public void characters(char [] arg1, int arg2, int arg3) throws org.xml.sax.SAXException{
  }
  public void endElement(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws org.xml.sax.SAXException{
  }
  public void startDocument() throws org.xml.sax.SAXException{
  }
  public void endDocument() throws org.xml.sax.SAXException{
  }
  public void startPrefixMapping(java.lang.String arg1, java.lang.String arg2) throws org.xml.sax.SAXException{
  }
  public void endPrefixMapping(java.lang.String arg1) throws org.xml.sax.SAXException{
  }
  public void ignorableWhitespace(char [] arg1, int arg2, int arg3) throws org.xml.sax.SAXException{
  }
  public void processingInstruction(java.lang.String arg1, java.lang.String arg2) throws org.xml.sax.SAXException{
  }
  public void skippedEntity(java.lang.String arg1) throws org.xml.sax.SAXException{
  }
  public org.apache.xalan.templates.StylesheetRoot getStylesheetRoot(){
    return (org.apache.xalan.templates.StylesheetRoot) null;
  }
  public java.lang.String getBaseIdentifier(){
    return (java.lang.String) null;
  }
  public java.lang.String getNamespaceForPrefix(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public java.lang.String getNamespaceForPrefix(java.lang.String arg1, org.w3c.dom.Node arg2){
    return (java.lang.String) null;
  }
  public boolean handlesNullPrefixes(){
    return false;
  }
  public XSLTSchema getSchema(){
    return (XSLTSchema) null;
  }
  public void notationDecl(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3){
  }
  public void unparsedEntityDecl(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4){
  }
  public org.xml.sax.InputSource resolveEntity(java.lang.String arg1, java.lang.String arg2) throws org.xml.sax.SAXException{
    return (org.xml.sax.InputSource) null;
  }
  public void setSystemId(java.lang.String arg1){
  }
  public org.apache.xml.utils.SAXSourceLocator getLocator(){
    return (org.apache.xml.utils.SAXSourceLocator) null;
  }
  public org.w3c.dom.Node getOriginatingNode(){
    return (org.w3c.dom.Node) null;
  }
  public javax.xml.transform.Templates getTemplates(){
    return (javax.xml.transform.Templates) null;
  }
  public void pushStylesheet(org.apache.xalan.templates.Stylesheet arg1){
  }
  public TransformerFactoryImpl getStylesheetProcessor(){
    return (TransformerFactoryImpl) null;
  }
  public void setOriginatingNode(org.w3c.dom.Node arg1){
  }
  public org.apache.xpath.XPath createXPath(java.lang.String arg1, org.apache.xalan.templates.ElemTemplateElement arg2) throws javax.xml.transform.TransformerException{
    return (org.apache.xpath.XPath) null;
  }
  public boolean isStylesheetParsingComplete(){
    return false;
  }
  public boolean getOptimize(){
    return false;
  }
}
