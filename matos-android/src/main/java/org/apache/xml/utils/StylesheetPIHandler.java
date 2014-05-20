package org.apache.xml.utils;

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


public class StylesheetPIHandler
  extends org.xml.sax.helpers.DefaultHandler{
  // Constructors

  public StylesheetPIHandler(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4){
    super();
  }
  // Methods

  public void startElement(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, org.xml.sax.Attributes arg4) throws org.xml.sax.SAXException{
  }
  public void processingInstruction(java.lang.String arg1, java.lang.String arg2) throws org.xml.sax.SAXException{
  }
  public javax.xml.transform.Source getAssociatedStylesheet(){
    return (javax.xml.transform.Source) null;
  }
  public void setURIResolver(@com.francetelecom.rd.stubs.annotation.CallBackRegister("resolve") javax.xml.transform.URIResolver arg1){
  }
  public javax.xml.transform.URIResolver getURIResolver(){
    return (javax.xml.transform.URIResolver) null;
  }
  public void setBaseId(java.lang.String arg1){
  }
  public java.lang.String getBaseId(){
    return (java.lang.String) null;
  }
}
