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


public class ToXMLStream
  extends ToStream{
  // Constructors

  public ToXMLStream(){
    super();
  }
  // Methods

  public boolean reset(){
    return false;
  }
  public void endElement(java.lang.String arg1) throws org.xml.sax.SAXException{
  }
  public void endDocument() throws org.xml.sax.SAXException{
  }
  public void processingInstruction(java.lang.String arg1, java.lang.String arg2) throws org.xml.sax.SAXException{
  }
  public void entityReference(java.lang.String arg1) throws org.xml.sax.SAXException{
  }
  public void addAttribute(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5, boolean arg6) throws org.xml.sax.SAXException{
  }
  public void namespaceAfterStartElement(java.lang.String arg1, java.lang.String arg2) throws org.xml.sax.SAXException{
  }
  public void startDocumentInternal() throws org.xml.sax.SAXException{
  }
  public void addUniqueAttribute(java.lang.String arg1, java.lang.String arg2, int arg3) throws org.xml.sax.SAXException{
  }
  protected boolean pushNamespace(java.lang.String arg1, java.lang.String arg2){
    return false;
  }
  public void CopyFrom(ToXMLStream arg1){
  }
  public void startPreserving() throws org.xml.sax.SAXException{
  }
  public void endPreserving() throws org.xml.sax.SAXException{
  }
}
