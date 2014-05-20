package org.apache.xml.utils;

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


public class DOMBuilder
  implements org.xml.sax.ext.LexicalHandler, org.xml.sax.ContentHandler
{
  // Fields

  public org.w3c.dom.Document m_doc;

  protected org.w3c.dom.Node m_currentNode;

  protected org.w3c.dom.Node m_root;

  protected org.w3c.dom.Node m_nextSibling;

  public org.w3c.dom.DocumentFragment m_docFrag;

  protected java.util.Stack m_elemStack;

  protected java.util.Vector m_prefixMappings;

  protected boolean m_inCData;

  // Constructors

  public DOMBuilder(org.w3c.dom.Document arg1, org.w3c.dom.Node arg2){
  }
  public DOMBuilder(org.w3c.dom.Document arg1, org.w3c.dom.DocumentFragment arg2){
  }
  public DOMBuilder(org.w3c.dom.Document arg1){
  }
  // Methods

  protected void append(org.w3c.dom.Node arg1) throws org.xml.sax.SAXException{
  }
  public void comment(char [] arg1, int arg2, int arg3) throws org.xml.sax.SAXException{
  }
  public org.w3c.dom.Node getCurrentNode(){
    return (org.w3c.dom.Node) null;
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
  public org.w3c.dom.Node getRootDocument(){
    return (org.w3c.dom.Node) null;
  }
  public org.w3c.dom.Node getRootNode(){
    return (org.w3c.dom.Node) null;
  }
  public void setNextSibling(org.w3c.dom.Node arg1){
  }
  public org.w3c.dom.Node getNextSibling(){
    return (org.w3c.dom.Node) null;
  }
  public java.io.Writer getWriter(){
    return (java.io.Writer) null;
  }
  public void setIDAttribute(java.lang.String arg1, org.w3c.dom.Element arg2){
  }
  public void charactersRaw(char [] arg1, int arg2, int arg3) throws org.xml.sax.SAXException{
  }
  public void startEntity(java.lang.String arg1) throws org.xml.sax.SAXException{
  }
  public void endEntity(java.lang.String arg1) throws org.xml.sax.SAXException{
  }
  public void entityReference(java.lang.String arg1) throws org.xml.sax.SAXException{
  }
  public void startCDATA() throws org.xml.sax.SAXException{
  }
  public void endCDATA() throws org.xml.sax.SAXException{
  }
  public void cdata(char [] arg1, int arg2, int arg3) throws org.xml.sax.SAXException{
  }
  public void startDTD(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws org.xml.sax.SAXException{
  }
  public void endDTD() throws org.xml.sax.SAXException{
  }
}
