package org.apache.harmony.xml;

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


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public class ExpatReader
  implements org.xml.sax.XMLReader
{
  // Constructors

  public ExpatReader(){
  }
  // Methods

  public void setProperty(java.lang.String arg1, java.lang.Object arg2) throws org.xml.sax.SAXNotRecognizedException, org.xml.sax.SAXNotSupportedException{
  }
  public java.lang.Object getProperty(java.lang.String arg1) throws org.xml.sax.SAXNotRecognizedException, org.xml.sax.SAXNotSupportedException{
    return (java.lang.Object) null;
  }
  public void parse(org.xml.sax.InputSource arg1) throws java.io.IOException, org.xml.sax.SAXException{
  }
  public void parse(java.lang.String arg1) throws java.io.IOException, org.xml.sax.SAXException{
  }
  public org.xml.sax.ContentHandler getContentHandler(){
    return (org.xml.sax.ContentHandler) null;
  }
  public boolean getFeature(java.lang.String arg1) throws org.xml.sax.SAXNotRecognizedException, org.xml.sax.SAXNotSupportedException{
    return false;
  }
  public void setContentHandler(@com.francetelecom.rd.stubs.annotation.FieldSet("contentHandler") @com.francetelecom.rd.stubs.annotation.CallBackRegister("handle") org.xml.sax.ContentHandler arg1){
  }
  public void setErrorHandler(@com.francetelecom.rd.stubs.annotation.FieldSet("errorHandler") @com.francetelecom.rd.stubs.annotation.CallBackRegister("handle") org.xml.sax.ErrorHandler arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("errorHandler")
  public org.xml.sax.ErrorHandler getErrorHandler(){
    return (org.xml.sax.ErrorHandler) null;
  }
  public void setFeature(@com.francetelecom.rd.stubs.annotation.FieldSet("feature") java.lang.String arg1, boolean arg2) throws org.xml.sax.SAXNotRecognizedException, org.xml.sax.SAXNotSupportedException{
  }
  public void setDTDHandler(@com.francetelecom.rd.stubs.annotation.FieldSet("dtdHandler") @com.francetelecom.rd.stubs.annotation.CallBackRegister("handle") org.xml.sax.DTDHandler arg1){
  }
  public void setEntityResolver(@com.francetelecom.rd.stubs.annotation.FieldSet("entityResolver") @com.francetelecom.rd.stubs.annotation.CallBackRegister("resolve") org.xml.sax.EntityResolver arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("entityResolver")
  public org.xml.sax.EntityResolver getEntityResolver(){
    return (org.xml.sax.EntityResolver) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("dtdHandler")
  public org.xml.sax.DTDHandler getDTDHandler(){
    return (org.xml.sax.DTDHandler) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("lexicalHandler")
  public org.xml.sax.ext.LexicalHandler getLexicalHandler(){
    return (org.xml.sax.ext.LexicalHandler) null;
  }
  public void setLexicalHandler(@com.francetelecom.rd.stubs.annotation.FieldSet("lexicalHandler") @com.francetelecom.rd.stubs.annotation.CallBackRegister("handle") org.xml.sax.ext.LexicalHandler arg1){
  }
  public boolean isNamespaceProcessingEnabled(){
    return false;
  }
  public void setNamespaceProcessingEnabled(boolean arg1){
  }
}
