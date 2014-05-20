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


public abstract class ToStream
  extends SerializerBase{
  // Fields

  protected boolean m_ispreserve;

  protected boolean m_isprevtext;

  protected char [] m_lineSep;

  protected boolean m_lineSepUse;

  protected int m_lineSepLen;

  protected boolean m_spaceBeforeClose;

  protected boolean m_inDoctype;

  protected boolean m_cdataStartCalled;

  protected boolean m_escaping;

  // Constructors

  public ToStream(){
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
  protected void indent(int arg1) throws java.io.IOException{
  }
  protected void indent() throws java.io.IOException{
  }
  public void setOutputStream(java.io.OutputStream arg1){
  }
  public void setEncoding(java.lang.String arg1){
  }
  public void startElement(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, org.xml.sax.Attributes arg4) throws org.xml.sax.SAXException{
  }
  public void startElement(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws org.xml.sax.SAXException{
  }
  public void startElement(java.lang.String arg1) throws org.xml.sax.SAXException{
  }
  public void characters(char [] arg1, int arg2, int arg3) throws org.xml.sax.SAXException{
  }
  public void characters(java.lang.String arg1) throws org.xml.sax.SAXException{
  }
  public void endElement(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws org.xml.sax.SAXException{
  }
  public void endElement(java.lang.String arg1) throws org.xml.sax.SAXException{
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
  public void skippedEntity(java.lang.String arg1) throws org.xml.sax.SAXException{
  }
  public java.io.Writer getWriter(){
    return (java.io.Writer) null;
  }
  protected void charactersRaw(char [] arg1, int arg2, int arg3) throws org.xml.sax.SAXException{
  }
  public void startEntity(java.lang.String arg1) throws org.xml.sax.SAXException{
  }
  public void startCDATA() throws org.xml.sax.SAXException{
  }
  public void endCDATA() throws org.xml.sax.SAXException{
  }
  protected void cdata(char [] arg1, int arg2, int arg3) throws org.xml.sax.SAXException{
  }
  public void startDTD(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws org.xml.sax.SAXException{
  }
  public void endDTD() throws org.xml.sax.SAXException{
  }
  public java.util.Properties getOutputFormat(){
    return (java.util.Properties) null;
  }
  public void setContentHandler(org.xml.sax.ContentHandler arg1){
  }
  public void notationDecl(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws org.xml.sax.SAXException{
  }
  public void unparsedEntityDecl(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4) throws org.xml.sax.SAXException{
  }
  public boolean addAttributeAlways(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5, boolean arg6){
    return false;
  }
  public int getIndentAmount(){
    return 0;
  }
  public void setIndentAmount(int arg1){
  }
  public void setTransformer(javax.xml.transform.Transformer arg1){
  }
  public void setDTDEntityExpansion(boolean arg1){
  }
  public void setCdataSectionElements(java.util.Vector arg1){
  }
  public void serialize(org.w3c.dom.Node arg1) throws java.io.IOException{
  }
  public void flushPending() throws org.xml.sax.SAXException{
  }
  public boolean setEscaping(boolean arg1){
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
  protected void closeCDATA() throws org.xml.sax.SAXException{
  }
  protected final void flushWriter() throws org.xml.sax.SAXException{
  }
  protected void firePseudoAttributes(){
  }
  protected int writeUTF16Surrogate(char arg1, char [] arg2, int arg3, int arg4) throws java.io.IOException{
    return 0;
  }
  protected final void outputLineSep() throws java.io.IOException{
  }
  public boolean setLineSepUse(boolean arg1){
    return false;
  }
  protected boolean escapingNotNeeded(char arg1){
    return false;
  }
  public void endNonEscaping() throws org.xml.sax.SAXException{
  }
  public void startNonEscaping() throws org.xml.sax.SAXException{
  }
  public void processAttributes(java.io.Writer arg1, int arg2) throws java.io.IOException, org.xml.sax.SAXException{
  }
  public void writeAttrString(java.io.Writer arg1, java.lang.String arg2, java.lang.String arg3) throws java.io.IOException{
  }
  protected boolean shouldIndent(){
    return false;
  }
  protected java.lang.String ensureAttributesNamespaceIsDeclared(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws org.xml.sax.SAXException{
    return (java.lang.String) null;
  }
  public void setNewLine(char [] arg1){
  }
  public void addCdataSectionElements(java.lang.String arg1){
  }
}
