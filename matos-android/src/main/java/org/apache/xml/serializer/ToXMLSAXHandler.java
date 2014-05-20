package org.apache.xml.serializer;

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


public final class ToXMLSAXHandler
  extends ToSAXHandler{
  // Fields

  protected boolean m_escapeSetting;

  // Constructors

  public ToXMLSAXHandler(){
    super();
  }
  public ToXMLSAXHandler(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handle") org.xml.sax.ContentHandler arg1, java.lang.String arg2){
    super();
  }
  public ToXMLSAXHandler(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handle") org.xml.sax.ContentHandler arg1, org.xml.sax.ext.LexicalHandler arg2, java.lang.String arg3){
    super();
  }
  // Methods

  public boolean reset(){
    return false;
  }
  public void comment(char [] arg1, int arg2, int arg3) throws org.xml.sax.SAXException{
  }
  public java.io.OutputStream getOutputStream(){
    return (java.io.OutputStream) null;
  }
  public void indent(int arg1) throws org.xml.sax.SAXException{
  }
  public void setOutputStream(java.io.OutputStream arg1){
  }
  public void setDocumentLocator(org.xml.sax.Locator arg1){
  }
  public void startElement(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws org.xml.sax.SAXException{
  }
  public void startElement(java.lang.String arg1) throws org.xml.sax.SAXException{
  }
  public void startElement(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, org.xml.sax.Attributes arg4) throws org.xml.sax.SAXException{
  }
  public void characters(java.lang.String arg1) throws org.xml.sax.SAXException{
  }
  public void characters(char [] arg1, int arg2, int arg3) throws org.xml.sax.SAXException{
  }
  public void endElement(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws org.xml.sax.SAXException{
  }
  public void endElement(java.lang.String arg1) throws org.xml.sax.SAXException{
  }
  public void endDocument() throws org.xml.sax.SAXException{
  }
  public void startPrefixMapping(java.lang.String arg1, java.lang.String arg2) throws org.xml.sax.SAXException{
  }
  public boolean startPrefixMapping(java.lang.String arg1, java.lang.String arg2, boolean arg3) throws org.xml.sax.SAXException{
    return false;
  }
  public void endPrefixMapping(java.lang.String arg1) throws org.xml.sax.SAXException{
  }
  public void ignorableWhitespace(char [] arg1, int arg2, int arg3) throws org.xml.sax.SAXException{
  }
  public void processingInstruction(java.lang.String arg1, java.lang.String arg2) throws org.xml.sax.SAXException{
  }
  public void skippedEntity(java.lang.String arg1) throws org.xml.sax.SAXException{
  }
  public java.io.Writer getWriter(){
    return (java.io.Writer) null;
  }
  public void startEntity(java.lang.String arg1) throws org.xml.sax.SAXException{
  }
  public void startCDATA() throws org.xml.sax.SAXException{
  }
  public void endCDATA() throws org.xml.sax.SAXException{
  }
  public void endDTD() throws org.xml.sax.SAXException{
  }
  public java.util.Properties getOutputFormat(){
    return (java.util.Properties) null;
  }
  public void addAttribute(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5, boolean arg6) throws org.xml.sax.SAXException{
  }
  public void namespaceAfterStartElement(java.lang.String arg1, java.lang.String arg2) throws org.xml.sax.SAXException{
  }
  public void serialize(org.w3c.dom.Node arg1) throws java.io.IOException{
  }
  public boolean setEscaping(boolean arg1) throws org.xml.sax.SAXException{
    return false;
  }
  public void elementDecl(java.lang.String arg1, java.lang.String arg2) throws org.xml.sax.SAXException{
  }
  public void attributeDecl(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5) throws org.xml.sax.SAXException{
  }
  public void internalEntityDecl(java.lang.String arg1, java.lang.String arg2) throws org.xml.sax.SAXException{
  }
  public void externalEntityDecl(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws org.xml.sax.SAXException{
  }
  public void setWriter(java.io.Writer arg1){
  }
  public void setOutputFormat(java.util.Properties arg1){
  }
  protected void closeStartTag() throws org.xml.sax.SAXException{
  }
  public void closeCDATA() throws org.xml.sax.SAXException{
  }
  protected boolean popNamespace(java.lang.String arg1){
    return false;
  }
}
