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


public abstract class SerializerBase
  implements SerializationHandler
{
  // Fields

  public static final java.lang.String PKG_NAME = null;

  public static final java.lang.String PKG_PATH = null;

  protected boolean m_needToCallStartDocument;

  protected boolean m_cdataTagOpen;

  protected AttributesImplSerializer m_attributes;

  protected boolean m_inEntityRef;

  protected boolean m_inExternalDTD;

  protected java.lang.String m_doctypeSystem;

  protected java.lang.String m_doctypePublic;

  protected boolean m_shouldNotWriteXMLHeader;

  protected boolean m_standaloneWasSpecified;

  protected boolean m_doIndent;

  protected int m_indentAmount;

  protected java.lang.String m_version;

  protected java.lang.String m_mediatype;

  protected NamespaceMappings m_prefixMap;

  protected SerializerTrace m_tracer;

  protected javax.xml.transform.SourceLocator m_sourceLocator;

  protected java.io.Writer m_writer;

  protected char [] m_charsBuff;

  protected char [] m_attrBuff;

  protected java.lang.String m_StringOfCDATASections;

  protected java.util.Hashtable m_CdataElems;

  // Constructors

  SerializerBase(){
  }
  // Methods

  public void close(){
  }
  public boolean reset(){
    return false;
  }
  public void fatalError(org.xml.sax.SAXParseException arg1) throws org.xml.sax.SAXException{
  }
  public void error(org.xml.sax.SAXParseException arg1) throws org.xml.sax.SAXException{
  }
  public java.lang.String getEncoding(){
    return (java.lang.String) null;
  }
  public void comment(java.lang.String arg1) throws org.xml.sax.SAXException{
  }
  public void warning(org.xml.sax.SAXParseException arg1) throws org.xml.sax.SAXException{
  }
  public void setVersion(java.lang.String arg1){
  }
  public java.lang.String getVersion(){
    return (java.lang.String) null;
  }
  public void setEncoding(java.lang.String arg1){
  }
  protected static java.lang.String getLocalName(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public void setDocumentLocator(org.xml.sax.Locator arg1){
  }
  public void characters(org.w3c.dom.Node arg1) throws org.xml.sax.SAXException{
  }
  public void startDocument() throws org.xml.sax.SAXException{
  }
  public void endEntity(java.lang.String arg1) throws org.xml.sax.SAXException{
  }
  public void entityReference(java.lang.String arg1) throws org.xml.sax.SAXException{
  }
  public java.lang.String getNamespaceURI(java.lang.String arg1, boolean arg2){
    return (java.lang.String) null;
  }
  public java.lang.String getPrefix(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public void notationDecl(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws org.xml.sax.SAXException{
  }
  public void unparsedEntityDecl(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4) throws org.xml.sax.SAXException{
  }
  public void addAttribute(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5, boolean arg6) throws org.xml.sax.SAXException{
  }
  public void addAttribute(java.lang.String arg1, java.lang.String arg2){
  }
  public void addAttribute(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5) throws org.xml.sax.SAXException{
  }
  protected void fireEndElem(java.lang.String arg1) throws org.xml.sax.SAXException{
  }
  protected void fireCharEvent(char [] arg1, int arg2, int arg3) throws org.xml.sax.SAXException{
  }
  protected java.lang.String patchName(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public boolean addAttributeAlways(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5, boolean arg6){
    return false;
  }
  public void addXSLAttribute(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3){
  }
  public void addAttributes(org.xml.sax.Attributes arg1) throws org.xml.sax.SAXException{
  }
  public org.xml.sax.ContentHandler asContentHandler() throws java.io.IOException{
    return (org.xml.sax.ContentHandler) null;
  }
  protected void initCDATA(){
  }
  public void setOmitXMLDeclaration(boolean arg1){
  }
  public boolean getOmitXMLDeclaration(){
    return false;
  }
  public java.lang.String getDoctypePublic(){
    return (java.lang.String) null;
  }
  public void setDoctypePublic(java.lang.String arg1){
  }
  public java.lang.String getDoctypeSystem(){
    return (java.lang.String) null;
  }
  public void setDoctypeSystem(java.lang.String arg1){
  }
  public void setDoctype(java.lang.String arg1, java.lang.String arg2){
  }
  public void setStandalone(java.lang.String arg1){
  }
  protected void setStandaloneInternal(java.lang.String arg1){
  }
  public java.lang.String getStandalone(){
    return (java.lang.String) null;
  }
  public boolean getIndent(){
    return false;
  }
  public java.lang.String getMediaType(){
    return (java.lang.String) null;
  }
  public void setMediaType(java.lang.String arg1){
  }
  public int getIndentAmount(){
    return 0;
  }
  public void setIndentAmount(int arg1){
  }
  public void setIndent(boolean arg1){
  }
  public void namespaceAfterStartElement(java.lang.String arg1, java.lang.String arg2) throws org.xml.sax.SAXException{
  }
  public DOMSerializer asDOMSerializer() throws java.io.IOException{
    return (DOMSerializer) null;
  }
  protected static final java.lang.String getPrefixPart(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public NamespaceMappings getNamespaceMappings(){
    return (NamespaceMappings) null;
  }
  public java.lang.String getNamespaceURIFromPrefix(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public void setTransformer(javax.xml.transform.Transformer arg1){
  }
  public javax.xml.transform.Transformer getTransformer(){
    return (javax.xml.transform.Transformer) null;
  }
  protected void fireStartEntity(java.lang.String arg1) throws org.xml.sax.SAXException{
  }
  protected void fireCDATAEvent(char [] arg1, int arg2, int arg3) throws org.xml.sax.SAXException{
  }
  protected void fireCommentEvent(char [] arg1, int arg2, int arg3) throws org.xml.sax.SAXException{
  }
  public void fireEndEntity(java.lang.String arg1) throws org.xml.sax.SAXException{
  }
  protected void fireStartDoc() throws org.xml.sax.SAXException{
  }
  protected void fireEndDoc() throws org.xml.sax.SAXException{
  }
  protected void fireStartElem(java.lang.String arg1) throws org.xml.sax.SAXException{
  }
  protected void fireEscapingEvent(java.lang.String arg1, java.lang.String arg2) throws org.xml.sax.SAXException{
  }
  protected void fireEntityReference(java.lang.String arg1) throws org.xml.sax.SAXException{
  }
  protected void startDocumentInternal() throws org.xml.sax.SAXException{
  }
  public void setSourceLocator(javax.xml.transform.SourceLocator arg1){
  }
  public void setNamespaceMappings(NamespaceMappings arg1){
  }
  public void setDTDEntityExpansion(boolean arg1){
  }
  public boolean documentIsEmpty(){
    return false;
  }
  protected boolean isCdataSection(){
    return false;
  }
  public java.lang.String getOutputProperty(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public java.lang.String getOutputPropertyNonDefault(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public java.lang.Object asDOM3Serializer() throws java.io.IOException{
    return (java.lang.Object) null;
  }
  public java.lang.String getOutputPropertyDefault(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public void setOutputProperty(java.lang.String arg1, java.lang.String arg2){
  }
  public void setOutputPropertyDefault(java.lang.String arg1, java.lang.String arg2){
  }
  public abstract void setCdataSectionElements(java.util.Vector arg1);
}
