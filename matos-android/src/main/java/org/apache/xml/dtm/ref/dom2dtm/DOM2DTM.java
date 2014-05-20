package org.apache.xml.dtm.ref.dom2dtm;

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


public class DOM2DTM
  extends org.apache.xml.dtm.ref.DTMDefaultBaseIterators{
  // Classes

  public static interface CharacterNodeHandler
  {
    // Methods

    public void characters(org.w3c.dom.Node arg1) throws org.xml.sax.SAXException;
  }
  // Fields

  protected java.util.Vector m_nodes;

  // Constructors

  public DOM2DTM(org.apache.xml.dtm.DTMManager arg1, javax.xml.transform.dom.DOMSource arg2, int arg3, org.apache.xml.dtm.DTMWSFilter arg4, org.apache.xml.utils.XMLStringFactory arg5, boolean arg6){
    super((org.apache.xml.dtm.DTMManager) null, (javax.xml.transform.Source) null, 0, (org.apache.xml.dtm.DTMWSFilter) null, (org.apache.xml.utils.XMLStringFactory) null, false);
  }
  // Methods

  public void setProperty(java.lang.String arg1, java.lang.Object arg2){
  }
  public boolean isWhitespace(int arg1){
    return false;
  }
  public org.xml.sax.ContentHandler getContentHandler(){
    return (org.xml.sax.ContentHandler) null;
  }
  public org.apache.xml.utils.XMLString getStringValue(int arg1){
    return (org.apache.xml.utils.XMLString) null;
  }
  protected boolean nextNode(){
    return false;
  }
  public java.lang.String getLocalName(int arg1){
    return (java.lang.String) null;
  }
  public java.lang.String getNodeName(int arg1){
    return (java.lang.String) null;
  }
  public java.lang.String getNamespaceURI(int arg1){
    return (java.lang.String) null;
  }
  public int getAttributeNode(int arg1, java.lang.String arg2, java.lang.String arg3){
    return 0;
  }
  public java.lang.String getNodeValue(int arg1){
    return (java.lang.String) null;
  }
  public java.lang.String getPrefix(int arg1){
    return (java.lang.String) null;
  }
  public int getElementById(java.lang.String arg1){
    return 0;
  }
  public org.xml.sax.ErrorHandler getErrorHandler(){
    return (org.xml.sax.ErrorHandler) null;
  }
  public org.xml.sax.EntityResolver getEntityResolver(){
    return (org.xml.sax.EntityResolver) null;
  }
  public org.xml.sax.DTDHandler getDTDHandler(){
    return (org.xml.sax.DTDHandler) null;
  }
  public org.xml.sax.ext.LexicalHandler getLexicalHandler(){
    return (org.xml.sax.ext.LexicalHandler) null;
  }
  public void dispatchCharactersEvents(int arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("handle") org.xml.sax.ContentHandler arg2, boolean arg3) throws org.xml.sax.SAXException{
  }
  public org.w3c.dom.Node getNode(int arg1){
    return (org.w3c.dom.Node) null;
  }
  protected int addNode(org.w3c.dom.Node arg1, int arg2, int arg3, int arg4){
    return 0;
  }
  public java.lang.String getNodeNameX(int arg1){
    return (java.lang.String) null;
  }
  public void setIncrementalSAXSource(org.apache.xml.dtm.ref.IncrementalSAXSource arg1){
  }
  public java.lang.String getUnparsedEntityURI(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public org.xml.sax.ext.DeclHandler getDeclHandler(){
    return (org.xml.sax.ext.DeclHandler) null;
  }
  public boolean needsTwoThreads(){
    return false;
  }
  public boolean isAttributeSpecified(int arg1){
    return false;
  }
  public java.lang.String getDocumentTypeDeclarationSystemIdentifier(){
    return (java.lang.String) null;
  }
  protected int getNextNodeIdentity(int arg1){
    return 0;
  }
  public void dispatchToEvents(int arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("handle") org.xml.sax.ContentHandler arg2) throws org.xml.sax.SAXException{
  }
  public int getNumberOfNodes(){
    return 0;
  }
  public java.lang.String getDocumentTypeDeclarationPublicIdentifier(){
    return (java.lang.String) null;
  }
  public javax.xml.transform.SourceLocator getSourceLocatorFor(int arg1){
    return (javax.xml.transform.SourceLocator) null;
  }
  protected static void getNodeData(org.w3c.dom.Node arg1, org.apache.xml.utils.FastStringBuffer arg2){
  }
  public int getHandleOfNode(org.w3c.dom.Node arg1){
    return 0;
  }
  protected org.w3c.dom.Node lookupNode(int arg1){
    return (org.w3c.dom.Node) null;
  }
  protected static void dispatchNodeData(org.w3c.dom.Node arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("handle") org.xml.sax.ContentHandler arg2, int arg3) throws org.xml.sax.SAXException{
  }
}
