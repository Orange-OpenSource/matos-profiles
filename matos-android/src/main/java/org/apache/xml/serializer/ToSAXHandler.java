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


public abstract class ToSAXHandler
  extends SerializerBase{
  // Fields

  protected org.xml.sax.ContentHandler m_saxHandler;

  protected org.xml.sax.ext.LexicalHandler m_lexHandler;

  protected TransformStateSetter m_state;

  // Constructors

  public ToSAXHandler(){
    super();
  }
  public ToSAXHandler(org.xml.sax.ContentHandler arg1, org.xml.sax.ext.LexicalHandler arg2, java.lang.String arg3){
    super();
  }
  public ToSAXHandler(org.xml.sax.ContentHandler arg1, java.lang.String arg2){
    super();
  }
  // Methods

  public boolean reset(){
    return false;
  }
  public void fatalError(org.xml.sax.SAXParseException arg1) throws org.xml.sax.SAXException{
  }
  public void error(org.xml.sax.SAXParseException arg1) throws org.xml.sax.SAXException{
  }
  public void comment(java.lang.String arg1) throws org.xml.sax.SAXException{
  }
  public void warning(org.xml.sax.SAXParseException arg1) throws org.xml.sax.SAXException{
  }
  public void startElement(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, org.xml.sax.Attributes arg4) throws org.xml.sax.SAXException{
  }
  public void startElement(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws org.xml.sax.SAXException{
  }
  public void startElement(java.lang.String arg1) throws org.xml.sax.SAXException{
  }
  public void characters(java.lang.String arg1) throws org.xml.sax.SAXException{
  }
  public void characters(org.w3c.dom.Node arg1) throws org.xml.sax.SAXException{
  }
  public void processingInstruction(java.lang.String arg1, java.lang.String arg2) throws org.xml.sax.SAXException{
  }
  public void startDTD(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws org.xml.sax.SAXException{
  }
  public void setContentHandler(org.xml.sax.ContentHandler arg1){
  }
  protected void startDocumentInternal() throws org.xml.sax.SAXException{
  }
  public void setCdataSectionElements(java.util.Vector arg1){
  }
  public void flushPending() throws org.xml.sax.SAXException{
  }
  public void addUniqueAttribute(java.lang.String arg1, java.lang.String arg2, int arg3) throws org.xml.sax.SAXException{
  }
  protected void closeStartTag() throws org.xml.sax.SAXException{
  }
  protected void closeCDATA() throws org.xml.sax.SAXException{
  }
  public void setLexHandler(org.xml.sax.ext.LexicalHandler arg1){
  }
  public void setShouldOutputNSAttr(boolean arg1){
  }
  public void setTransformState(TransformStateSetter arg1){
  }
}
