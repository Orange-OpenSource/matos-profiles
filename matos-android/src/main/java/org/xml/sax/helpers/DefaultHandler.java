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
public class DefaultHandler
  implements org.xml.sax.ContentHandler, org.xml.sax.EntityResolver, org.xml.sax.DTDHandler, org.xml.sax.ErrorHandler
{
  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("handle")
  public DefaultHandler(){
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("handle")
  public void fatalError(org.xml.sax.SAXParseException arg1) throws org.xml.sax.SAXException{
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("handle")
  public void error(org.xml.sax.SAXParseException arg1) throws org.xml.sax.SAXException{
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("handle")
  public void warning(org.xml.sax.SAXParseException arg1) throws org.xml.sax.SAXException{
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("handle")
  public void setDocumentLocator(org.xml.sax.Locator arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("handle")
  public void startElement(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, org.xml.sax.Attributes arg4) throws org.xml.sax.SAXException{
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("handle")
  public void characters(char [] arg1, int arg2, int arg3) throws org.xml.sax.SAXException{
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("handle")
  public void endElement(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws org.xml.sax.SAXException{
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("handle")
  public void startDocument() throws org.xml.sax.SAXException{
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("handle")
  public void endDocument() throws org.xml.sax.SAXException{
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("handle")
  public void startPrefixMapping(java.lang.String arg1, java.lang.String arg2) throws org.xml.sax.SAXException{
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("handle")
  public void endPrefixMapping(java.lang.String arg1) throws org.xml.sax.SAXException{
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("handle")
  public void ignorableWhitespace(char [] arg1, int arg2, int arg3) throws org.xml.sax.SAXException{
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("handle")
  public void processingInstruction(java.lang.String arg1, java.lang.String arg2) throws org.xml.sax.SAXException{
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("handle")
  public void skippedEntity(java.lang.String arg1) throws org.xml.sax.SAXException{
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("handle")
  public void notationDecl(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws org.xml.sax.SAXException{
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("handle")
  public void unparsedEntityDecl(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4) throws org.xml.sax.SAXException{
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("handle")
  public org.xml.sax.InputSource resolveEntity(java.lang.String arg1, java.lang.String arg2) throws java.io.IOException, org.xml.sax.SAXException{
    return (org.xml.sax.InputSource) null;
  }
}
