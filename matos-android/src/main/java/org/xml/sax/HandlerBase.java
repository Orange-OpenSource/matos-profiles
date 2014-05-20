package org.xml.sax;

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


public class HandlerBase
  implements DocumentHandler, EntityResolver, DTDHandler, ErrorHandler
{
  // Constructors

  public HandlerBase(){
  }
  // Methods

  public void fatalError(SAXParseException arg1) throws SAXException{
  }
  public void error(SAXParseException arg1) throws SAXException{
  }
  public void warning(SAXParseException arg1) throws SAXException{
  }
  public void setDocumentLocator(Locator arg1){
  }
  public void startElement(java.lang.String arg1, AttributeList arg2) throws SAXException{
  }
  public void characters(char [] arg1, int arg2, int arg3) throws SAXException{
  }
  public void endElement(java.lang.String arg1) throws SAXException{
  }
  public void startDocument() throws SAXException{
  }
  public void endDocument() throws SAXException{
  }
  public void ignorableWhitespace(char [] arg1, int arg2, int arg3) throws SAXException{
  }
  public void processingInstruction(java.lang.String arg1, java.lang.String arg2) throws SAXException{
  }
  public void notationDecl(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3){
  }
  public void unparsedEntityDecl(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4){
  }
  public InputSource resolveEntity(java.lang.String arg1, java.lang.String arg2) throws SAXException{
    return (InputSource) null;
  }
}
