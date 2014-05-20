package org.apache.xml.dtm.ref;

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


public class DTMDocumentImpl
  implements org.xml.sax.ext.LexicalHandler, org.apache.xml.dtm.DTM, org.xml.sax.ContentHandler
{
  // Fields

  protected static final byte DOCHANDLE_SHIFT = (byte) 0;

  protected static final int NODEHANDLE_MASK = 0;

  protected static final int DOCHANDLE_MASK = 0;

  protected int m_currentNode;

  protected java.lang.String m_documentBaseURI;

  // Constructors

  public DTMDocumentImpl(org.apache.xml.dtm.DTMManager arg1, int arg2, org.apache.xml.dtm.DTMWSFilter arg3, org.apache.xml.utils.XMLStringFactory arg4){
  }
  // Methods

  public void setProperty(java.lang.String arg1, java.lang.Object arg2){
  }
  public int getParent(int arg1){
    return 0;
  }
  public boolean isSupported(java.lang.String arg1, java.lang.String arg2){
    return false;
  }
  public void comment(char [] arg1, int arg2, int arg3) throws org.xml.sax.SAXException{
  }
  public org.xml.sax.ContentHandler getContentHandler(){
    return (org.xml.sax.ContentHandler) null;
  }
  public org.apache.xml.utils.XMLString getStringValue(int arg1){
    return (org.apache.xml.utils.XMLString) null;
  }
  public short getLevel(int arg1){
    return (short) 0;
  }
  public java.lang.String getLocalName(int arg1){
    return (java.lang.String) null;
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
  public int getNextSibling(int arg1){
    return 0;
  }
  public void startEntity(java.lang.String arg1) throws org.xml.sax.SAXException{
  }
  public void endEntity(java.lang.String arg1) throws org.xml.sax.SAXException{
  }
  public void startCDATA() throws org.xml.sax.SAXException{
  }
  public void endCDATA() throws org.xml.sax.SAXException{
  }
  public void startDTD(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws org.xml.sax.SAXException{
  }
  public void endDTD() throws org.xml.sax.SAXException{
  }
  public java.lang.String getNodeName(int arg1){
    return (java.lang.String) null;
  }
  public short getNodeType(int arg1){
    return (short) 0;
  }
  public void appendChild(int arg1, boolean arg2, boolean arg3){
  }
  public int getLastChild(int arg1){
    return 0;
  }
  public boolean hasChildNodes(int arg1){
    return false;
  }
  public int getOwnerDocument(int arg1){
    return 0;
  }
  public int getPreviousSibling(int arg1){
    return 0;
  }
  public int getFirstChild(int arg1){
    return 0;
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
  public void setFeature(java.lang.String arg1, boolean arg2){
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
  public int getFirstAttribute(int arg1){
    return 0;
  }
  public java.lang.String getNodeNameX(int arg1){
    return (java.lang.String) null;
  }
  public void setIncrementalSAXSource(IncrementalSAXSource arg1){
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
  public void dispatchToEvents(int arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("handle") org.xml.sax.ContentHandler arg2) throws org.xml.sax.SAXException{
  }
  public void migrateTo(org.apache.xml.dtm.DTMManager arg1){
  }
  public java.lang.String getDocumentTypeDeclarationPublicIdentifier(){
    return (java.lang.String) null;
  }
  public javax.xml.transform.SourceLocator getSourceLocatorFor(int arg1){
    return (javax.xml.transform.SourceLocator) null;
  }
  public org.apache.xml.dtm.DTMAxisIterator getTypedAxisIterator(int arg1, int arg2){
    return (org.apache.xml.dtm.DTMAxisIterator) null;
  }
  public org.apache.xml.dtm.DTMAxisIterator getAxisIterator(int arg1){
    return (org.apache.xml.dtm.DTMAxisIterator) null;
  }
  public org.apache.xml.dtm.DTMAxisTraverser getAxisTraverser(int arg1){
    return (org.apache.xml.dtm.DTMAxisTraverser) null;
  }
  public void documentRegistration(){
  }
  public void documentRelease(){
  }
  public int getDocument(){
    return 0;
  }
  public int getFirstNamespaceNode(int arg1, boolean arg2){
    return 0;
  }
  public int getNextNamespaceNode(int arg1, int arg2, boolean arg3){
    return 0;
  }
  public int getExpandedTypeID(int arg1){
    return 0;
  }
  public int getExpandedTypeID(java.lang.String arg1, java.lang.String arg2, int arg3){
    return 0;
  }
  public int getDocumentRoot(){
    return 0;
  }
  public int getDocumentRoot(int arg1){
    return 0;
  }
  public void appendTextChild(java.lang.String arg1){
  }
  public boolean isNodeAfter(int arg1, int arg2){
    return false;
  }
  public int getNextAttribute(int arg1){
    return 0;
  }
  public java.lang.String getDocumentBaseURI(){
    return (java.lang.String) null;
  }
  public int getStringValueChunkCount(int arg1){
    return 0;
  }
  public char [] getStringValueChunk(int arg1, int arg2, int [] arg3){
    return (char []) null;
  }
  public java.lang.String getLocalNameFromExpandedNameID(int arg1){
    return (java.lang.String) null;
  }
  public java.lang.String getNamespaceFromExpandedNameID(int arg1){
    return (java.lang.String) null;
  }
  public void setDocumentBaseURI(java.lang.String arg1){
  }
  public java.lang.String getDocumentSystemIdentifier(int arg1){
    return (java.lang.String) null;
  }
  public java.lang.String getDocumentEncoding(int arg1){
    return (java.lang.String) null;
  }
  public java.lang.String getDocumentStandalone(int arg1){
    return (java.lang.String) null;
  }
  public java.lang.String getDocumentVersion(int arg1){
    return (java.lang.String) null;
  }
  public boolean getDocumentAllDeclarationsProcessed(){
    return false;
  }
  public boolean supportsPreStripping(){
    return false;
  }
  public boolean isCharacterElementContentWhitespace(int arg1){
    return false;
  }
  public boolean isDocumentAllDeclarationsProcessed(int arg1){
    return false;
  }
  public void setLocalNameTable(DTMStringPool arg1){
  }
  public DTMStringPool getLocalNameTable(){
    return (DTMStringPool) null;
  }
  public void setNsNameTable(DTMStringPool arg1){
  }
  public DTMStringPool getNsNameTable(){
    return (DTMStringPool) null;
  }
  public void setPrefixNameTable(DTMStringPool arg1){
  }
  public DTMStringPool getPrefixNameTable(){
    return (DTMStringPool) null;
  }
  public int getNextDescendant(int arg1, int arg2){
    return 0;
  }
  public int getNextFollowing(int arg1, int arg2){
    return 0;
  }
  public int getNextPreceding(int arg1, int arg2){
    return 0;
  }
}
