package org.apache.xml.dtm.ref.sax2dtm;

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


public class SAX2DTM
  extends org.apache.xml.dtm.ref.DTMDefaultBaseIterators  implements org.xml.sax.ext.LexicalHandler, org.xml.sax.ContentHandler, org.xml.sax.EntityResolver, org.xml.sax.ext.DeclHandler, org.xml.sax.DTDHandler, org.xml.sax.ErrorHandler
{
  // Fields

  protected org.apache.xml.utils.FastStringBuffer m_chars;

  protected org.apache.xml.utils.SuballocatedIntVector m_data;

  protected org.apache.xml.utils.IntStack m_parents;

  protected int m_previous;

  protected java.util.Vector m_prefixMappings;

  protected org.apache.xml.utils.IntStack m_contextIndexes;

  protected int m_textType;

  protected int m_coalescedTextType;

  protected org.xml.sax.Locator m_locator;

  protected boolean m_insideDTD;

  protected org.apache.xml.dtm.ref.DTMTreeWalker m_walker;

  protected org.apache.xml.dtm.ref.DTMStringPool m_valuesOrPrefixes;

  protected boolean m_endDocumentOccured;

  protected org.apache.xml.utils.SuballocatedIntVector m_dataOrQName;

  protected java.util.Hashtable m_idAttributes;

  protected int m_textPendingStart;

  protected boolean m_useSourceLocationProperty;

  protected org.apache.xml.utils.StringVector m_sourceSystemId;

  protected org.apache.xml.utils.IntVector m_sourceLine;

  protected org.apache.xml.utils.IntVector m_sourceColumn;

  // Constructors

  public SAX2DTM(org.apache.xml.dtm.DTMManager arg1, javax.xml.transform.Source arg2, int arg3, org.apache.xml.dtm.DTMWSFilter arg4, org.apache.xml.utils.XMLStringFactory arg5, boolean arg6){
    super((org.apache.xml.dtm.DTMManager) null, (javax.xml.transform.Source) null, 0, (org.apache.xml.dtm.DTMWSFilter) null, (org.apache.xml.utils.XMLStringFactory) null, false);
  }
  public SAX2DTM(org.apache.xml.dtm.DTMManager arg1, javax.xml.transform.Source arg2, int arg3, org.apache.xml.dtm.DTMWSFilter arg4, org.apache.xml.utils.XMLStringFactory arg5, boolean arg6, int arg7, boolean arg8, boolean arg9){
    super((org.apache.xml.dtm.DTMManager) null, (javax.xml.transform.Source) null, 0, (org.apache.xml.dtm.DTMWSFilter) null, (org.apache.xml.utils.XMLStringFactory) null, false);
  }
  // Methods

  public void setProperty(java.lang.String arg1, java.lang.Object arg2){
  }
  public boolean isWhitespace(int arg1){
    return false;
  }
  public void fatalError(org.xml.sax.SAXParseException arg1) throws org.xml.sax.SAXException{
  }
  public void error(org.xml.sax.SAXParseException arg1) throws org.xml.sax.SAXException{
  }
  public void comment(char [] arg1, int arg2, int arg3) throws org.xml.sax.SAXException{
  }
  public void warning(org.xml.sax.SAXParseException arg1) throws org.xml.sax.SAXException{
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
  public void setIDAttribute(java.lang.String arg1, int arg2){
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
  public java.lang.String getNamespaceURI(int arg1){
    return (java.lang.String) null;
  }
  public java.lang.String getNamespaceURI(java.lang.String arg1){
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
  public java.lang.String getPrefix(java.lang.String arg1, java.lang.String arg2){
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
  public void notationDecl(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws org.xml.sax.SAXException{
  }
  public void unparsedEntityDecl(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4) throws org.xml.sax.SAXException{
  }
  public void elementDecl(java.lang.String arg1, java.lang.String arg2) throws org.xml.sax.SAXException{
  }
  public void attributeDecl(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5) throws org.xml.sax.SAXException{
  }
  public void internalEntityDecl(java.lang.String arg1, java.lang.String arg2) throws org.xml.sax.SAXException{
  }
  public void externalEntityDecl(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws org.xml.sax.SAXException{
  }
  public void dispatchCharactersEvents(int arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("handle") org.xml.sax.ContentHandler arg2, boolean arg3) throws org.xml.sax.SAXException{
  }
  public org.xml.sax.InputSource resolveEntity(java.lang.String arg1, java.lang.String arg2) throws org.xml.sax.SAXException{
    return (org.xml.sax.InputSource) null;
  }
  protected int addNode(int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6){
    return 0;
  }
  public int getIdForNamespace(java.lang.String arg1){
    return 0;
  }
  protected void charactersFlush(){
  }
  public java.lang.String getNodeNameX(int arg1){
    return (java.lang.String) null;
  }
  public void setIncrementalSAXSource(org.apache.xml.dtm.ref.IncrementalSAXSource arg1){
  }
  public void clearCoRoutine(){
  }
  public void clearCoRoutine(boolean arg1){
  }
  public java.lang.String getUnparsedEntityURI(java.lang.String arg1){
    return (java.lang.String) null;
  }
  protected boolean declAlreadyDeclared(java.lang.String arg1){
    return false;
  }
  protected void addNewDTMID(int arg1){
  }
  protected void setSourceLocation(){
  }
  protected int _dataOrQName(int arg1){
    return 0;
  }
  public java.lang.String getFixedNames(int arg1){
    return (java.lang.String) null;
  }
  public void setUseSourceLocation(boolean arg1){
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
  public void migrateTo(org.apache.xml.dtm.DTMManager arg1){
  }
  public java.lang.String getDocumentTypeDeclarationPublicIdentifier(){
    return (java.lang.String) null;
  }
  public javax.xml.transform.SourceLocator getSourceLocatorFor(int arg1){
    return (javax.xml.transform.SourceLocator) null;
  }
}
