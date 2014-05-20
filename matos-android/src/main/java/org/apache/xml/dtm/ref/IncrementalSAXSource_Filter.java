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


public class IncrementalSAXSource_Filter
  implements org.xml.sax.ext.LexicalHandler, org.xml.sax.ContentHandler, IncrementalSAXSource, org.xml.sax.DTDHandler, org.xml.sax.ErrorHandler, java.lang.Runnable
{
  // Constructors

  public IncrementalSAXSource_Filter(){
  }
  public IncrementalSAXSource_Filter(CoroutineManager arg1, int arg2){
  }
  // Methods

  public void run(){
  }
  public void init(CoroutineManager arg1, int arg2, int arg3){
  }
  public void fatalError(org.xml.sax.SAXParseException arg1) throws org.xml.sax.SAXException{
  }
  public void error(org.xml.sax.SAXParseException arg1) throws org.xml.sax.SAXException{
  }
  public void comment(char [] arg1, int arg2, int arg3) throws org.xml.sax.SAXException{
  }
  public void warning(org.xml.sax.SAXParseException arg1) throws org.xml.sax.SAXException{
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
  public void setContentHandler(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handle") org.xml.sax.ContentHandler arg1){
  }
  public void setDTDHandler(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handle") org.xml.sax.DTDHandler arg1){
  }
  public void setLexicalHandler(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handle") org.xml.sax.ext.LexicalHandler arg1){
  }
  public void notationDecl(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws org.xml.sax.SAXException{
  }
  public void unparsedEntityDecl(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4) throws org.xml.sax.SAXException{
  }
  public void startParse(org.xml.sax.InputSource arg1) throws org.xml.sax.SAXException{
  }
  public java.lang.Object deliverMoreNodes(boolean arg1){
    return (java.lang.Object) null;
  }
  public void setXMLReader(org.xml.sax.XMLReader arg1){
  }
  public static IncrementalSAXSource createIncrementalSAXSource(CoroutineManager arg1, int arg2){
    return (IncrementalSAXSource) null;
  }
  public void setErrHandler(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handle") org.xml.sax.ErrorHandler arg1){
  }
  public void setReturnFrequency(int arg1){
  }
  public int getSourceCoroutineID(){
    return 0;
  }
  public int getControllerCoroutineID(){
    return 0;
  }
  public CoroutineManager getCoroutineManager(){
    return (CoroutineManager) null;
  }
  protected void count_and_yield(boolean arg1) throws org.xml.sax.SAXException{
  }
}
