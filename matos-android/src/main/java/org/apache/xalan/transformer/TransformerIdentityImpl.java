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


public class TransformerIdentityImpl
  extends javax.xml.transform.Transformer  implements javax.xml.transform.sax.TransformerHandler, org.xml.sax.ext.DeclHandler
{
  // Constructors

  public TransformerIdentityImpl(boolean arg1){
    super();
  }
  public TransformerIdentityImpl(){
    super();
  }
  // Methods

  public void transform(javax.xml.transform.Source arg1, javax.xml.transform.Result arg2) throws javax.xml.transform.TransformerException{
  }
  public void reset(){
  }
  public void comment(char [] arg1, int arg2, int arg3) throws org.xml.sax.SAXException{
  }
  public java.lang.Object getParameter(java.lang.String arg1){
    return (java.lang.Object) null;
  }
  public void setParameter(java.lang.String arg1, java.lang.Object arg2){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("systemId")
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
  public java.lang.String getOutputProperty(java.lang.String arg1) throws java.lang.IllegalArgumentException{
    return (java.lang.String) null;
  }
  public void setOutputProperty(java.lang.String arg1, java.lang.String arg2) throws java.lang.IllegalArgumentException{
  }
  public void elementDecl(java.lang.String arg1, java.lang.String arg2) throws org.xml.sax.SAXException{
  }
  public void attributeDecl(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5) throws org.xml.sax.SAXException{
  }
  public void internalEntityDecl(java.lang.String arg1, java.lang.String arg2) throws org.xml.sax.SAXException{
  }
  public void externalEntityDecl(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws org.xml.sax.SAXException{
  }
  public javax.xml.transform.ErrorListener getErrorListener(){
    return (javax.xml.transform.ErrorListener) null;
  }
  public void setURIResolver(javax.xml.transform.URIResolver arg1){
  }
  public javax.xml.transform.URIResolver getURIResolver(){
    return (javax.xml.transform.URIResolver) null;
  }
  public void setErrorListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("ErrorListener") javax.xml.transform.ErrorListener arg1) throws java.lang.IllegalArgumentException{
  }
  public void clearParameters(){
  }
  public void setSystemId(@com.francetelecom.rd.stubs.annotation.FieldSet("systemId") java.lang.String arg1){
  }
  public java.util.Properties getOutputProperties(){
    return (java.util.Properties) null;
  }
  public void setOutputProperties(java.util.Properties arg1) throws java.lang.IllegalArgumentException{
  }
  protected final void flushStartDoc() throws org.xml.sax.SAXException{
  }
}
