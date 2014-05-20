package org.xml.sax.helpers;

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
public class XMLReaderAdapter
  implements org.xml.sax.Parser, org.xml.sax.ContentHandler
{
  // Constructors

  public XMLReaderAdapter() throws org.xml.sax.SAXException{
  }
  public XMLReaderAdapter(org.xml.sax.XMLReader arg1){
  }
  // Methods

  public void parse(java.lang.String arg1) throws java.io.IOException, org.xml.sax.SAXException{
  }
  public void parse(org.xml.sax.InputSource arg1) throws java.io.IOException, org.xml.sax.SAXException{
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
  public void startPrefixMapping(java.lang.String arg1, java.lang.String arg2){
  }
  public void endPrefixMapping(java.lang.String arg1){
  }
  public void ignorableWhitespace(char [] arg1, int arg2, int arg3) throws org.xml.sax.SAXException{
  }
  public void processingInstruction(java.lang.String arg1, java.lang.String arg2) throws org.xml.sax.SAXException{
  }
  public void skippedEntity(java.lang.String arg1) throws org.xml.sax.SAXException{
  }
  public void setErrorHandler(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handle") org.xml.sax.ErrorHandler arg1){
  }
  public void setDTDHandler(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handle") org.xml.sax.DTDHandler arg1){
  }
  public void setDocumentHandler(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handle") org.xml.sax.DocumentHandler arg1){
  }
  public void setEntityResolver(@com.francetelecom.rd.stubs.annotation.CallBackRegister("resolve") org.xml.sax.EntityResolver arg1){
  }
  public void setLocale(java.util.Locale arg1) throws org.xml.sax.SAXException{
  }
}
