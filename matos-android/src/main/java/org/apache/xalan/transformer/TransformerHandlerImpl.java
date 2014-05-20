package org.apache.xalan.transformer;

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


public class TransformerHandlerImpl
  implements javax.xml.transform.sax.TransformerHandler, org.xml.sax.ext.LexicalHandler, org.xml.sax.ContentHandler, org.xml.sax.EntityResolver, org.xml.sax.ext.DeclHandler, org.xml.sax.DTDHandler, org.xml.sax.ErrorHandler
{
  // Constructors

  public TransformerHandlerImpl(TransformerImpl arg1, boolean arg2, java.lang.String arg3){
  }
  // Methods

  public void fatalError(org.xml.sax.SAXParseException arg1) throws org.xml.sax.SAXException{
  }
  public void error(org.xml.sax.SAXParseException arg1) throws org.xml.sax.SAXException{
  }
  public void comment(char [] arg1, int arg2, int arg3) throws org.xml.sax.SAXException{
  }
  public void warning(org.xml.sax.SAXParseException arg1) throws org.xml.sax.SAXException{
  }
  public java.lang.String getSystemId(){
    return (java.lang.String) null;
  }
  public void setResult(javax.xml.transform.Result arg1) throws java.lang.IllegalArgumentException{
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
  public void notationDecl(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws org.xml.sax.SAXException{
  }
  public void unparsedEntityDecl(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4) throws org.xml.sax.SAXException{
  }
  public javax.xml.transform.Transformer getTransformer(){
    return (javax.xml.transform.Transformer) null;
  }
  public void elementDecl(java.lang.String arg1, java.lang.String arg2) throws org.xml.sax.SAXException{
  }
  public void attributeDecl(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5) throws org.xml.sax.SAXException{
  }
  public void internalEntityDecl(java.lang.String arg1, java.lang.String arg2) throws org.xml.sax.SAXException{
  }
  public void externalEntityDecl(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws org.xml.sax.SAXException{
  }
  public org.xml.sax.InputSource resolveEntity(java.lang.String arg1, java.lang.String arg2) throws org.xml.sax.SAXException, java.io.IOException{
    return (org.xml.sax.InputSource) null;
  }
  public void setSystemId(java.lang.String arg1){
  }
  protected void clearCoRoutine(){
  }
  protected void clearCoRoutine(org.xml.sax.SAXException arg1){
  }
}
