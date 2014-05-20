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


public final class ToUnknownStream
  extends SerializerBase{
  // Constructors

  public ToUnknownStream(){
    super();
  }
  // Methods

  public void close(){
  }
  public boolean reset(){
    return false;
  }
  public java.lang.String getEncoding(){
    return (java.lang.String) null;
  }
  public void comment(java.lang.String arg1) throws org.xml.sax.SAXException{
  }
  public void comment(char [] arg1, int arg2, int arg3) throws org.xml.sax.SAXException{
  }
  public java.io.OutputStream getOutputStream(){
    return (java.io.OutputStream) null;
  }
  public void setVersion(java.lang.String arg1){
  }
  public java.lang.String getVersion(){
    return (java.lang.String) null;
  }
  public void setOutputStream(java.io.OutputStream arg1){
  }
  public void setEncoding(java.lang.String arg1){
  }
  public void setDocumentLocator(org.xml.sax.Locator arg1){
  }
  public void startElement(java.lang.String arg1) throws org.xml.sax.SAXException{
  }
  public void startElement(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws org.xml.sax.SAXException{
  }
  public void startElement(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, org.xml.sax.Attributes arg4) throws org.xml.sax.SAXException{
  }
  public void characters(java.lang.String arg1) throws org.xml.sax.SAXException{
  }
  public void characters(char [] arg1, int arg2, int arg3) throws org.xml.sax.SAXException{
  }
  public void endElement(java.lang.String arg1) throws org.xml.sax.SAXException{
  }
  public void endElement(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws org.xml.sax.SAXException{
  }
  public void startDocument() throws org.xml.sax.SAXException{
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
  public void endEntity(java.lang.String arg1) throws org.xml.sax.SAXException{
  }
  public void entityReference(java.lang.String arg1) throws org.xml.sax.SAXException{
  }
  public void startCDATA() throws org.xml.sax.SAXException{
  }
  public void endCDATA() throws org.xml.sax.SAXException{
  }
  public void startDTD(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws org.xml.sax.SAXException{
  }
  public void endDTD() throws org.xml.sax.SAXException{
  }
  public java.lang.String getNamespaceURI(java.lang.String arg1, boolean arg2){
    return (java.lang.String) null;
  }
  public java.lang.String getPrefix(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public java.util.Properties getOutputFormat(){
    return (java.util.Properties) null;
  }
  public void setContentHandler(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handle") org.xml.sax.ContentHandler arg1){
  }
  public void addAttribute(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5, boolean arg6) throws org.xml.sax.SAXException{
  }
  public void addAttribute(java.lang.String arg1, java.lang.String arg2){
  }
  public void addAttributes(org.xml.sax.Attributes arg1) throws org.xml.sax.SAXException{
  }
  public org.xml.sax.ContentHandler asContentHandler() throws java.io.IOException{
    return (org.xml.sax.ContentHandler) null;
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
  public void setSourceLocator(javax.xml.transform.SourceLocator arg1){
  }
  public java.lang.Object asDOM3Serializer() throws java.io.IOException{
    return (java.lang.Object) null;
  }
  public void setCdataSectionElements(java.util.Vector arg1){
  }
  public void serialize(org.w3c.dom.Node arg1) throws java.io.IOException{
  }
  public void flushPending() throws org.xml.sax.SAXException{
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
  public void addUniqueAttribute(java.lang.String arg1, java.lang.String arg2, int arg3) throws org.xml.sax.SAXException{
  }
  protected void firePseudoElement(java.lang.String arg1){
  }
}
