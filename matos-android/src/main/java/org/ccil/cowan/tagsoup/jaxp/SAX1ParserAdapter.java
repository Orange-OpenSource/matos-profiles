package org.ccil.cowan.tagsoup.jaxp;

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
public class SAX1ParserAdapter
  implements org.xml.sax.Parser
{
  // Constructors

  public SAX1ParserAdapter(org.xml.sax.XMLReader arg1){
  }
  // Methods

  public void parse(org.xml.sax.InputSource arg1) throws org.xml.sax.SAXException{
  }
  public void parse(java.lang.String arg1) throws org.xml.sax.SAXException{
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
