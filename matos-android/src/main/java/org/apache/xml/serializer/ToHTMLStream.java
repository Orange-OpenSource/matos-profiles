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


public class ToHTMLStream
  extends ToStream{
  // Fields

  protected boolean m_inDTD;

  // Constructors

  public ToHTMLStream(){
    super();
  }
  // Methods

  public boolean reset(){
    return false;
  }
  public void comment(char [] arg1, int arg2, int arg3) throws org.xml.sax.SAXException{
  }
  public void startElement(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, org.xml.sax.Attributes arg4) throws org.xml.sax.SAXException{
  }
  public final void characters(char [] arg1, int arg2, int arg3) throws org.xml.sax.SAXException{
  }
  public final void endElement(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws org.xml.sax.SAXException{
  }
  public final void endElement(java.lang.String arg1) throws org.xml.sax.SAXException{
  }
  public final void endDocument() throws org.xml.sax.SAXException{
  }
  public void processingInstruction(java.lang.String arg1, java.lang.String arg2) throws org.xml.sax.SAXException{
  }
  public final void entityReference(java.lang.String arg1) throws org.xml.sax.SAXException{
  }
  public final void cdata(char [] arg1, int arg2, int arg3) throws org.xml.sax.SAXException{
  }
  public void startDTD(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws org.xml.sax.SAXException{
  }
  public void endDTD() throws org.xml.sax.SAXException{
  }
  public void namespaceAfterStartElement(java.lang.String arg1, java.lang.String arg2) throws org.xml.sax.SAXException{
  }
  protected void startDocumentInternal() throws org.xml.sax.SAXException{
  }
  public void elementDecl(java.lang.String arg1, java.lang.String arg2) throws org.xml.sax.SAXException{
  }
  public void attributeDecl(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5) throws org.xml.sax.SAXException{
  }
  public void internalEntityDecl(java.lang.String arg1, java.lang.String arg2) throws org.xml.sax.SAXException{
  }
  public void externalEntityDecl(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws org.xml.sax.SAXException{
  }
  public void setOutputFormat(java.util.Properties arg1){
  }
  public void addUniqueAttribute(java.lang.String arg1, java.lang.String arg2, int arg3) throws org.xml.sax.SAXException{
  }
  protected void closeStartTag() throws org.xml.sax.SAXException{
  }
  public void processAttributes(java.io.Writer arg1, int arg2) throws java.io.IOException, org.xml.sax.SAXException{
  }
  public void writeAttrString(java.io.Writer arg1, java.lang.String arg2, java.lang.String arg3) throws java.io.IOException{
  }
  public void setSpecialEscapeURLs(boolean arg1){
  }
  public void setOmitMetaTag(boolean arg1){
  }
  public static final ElemDesc getElemDesc(java.lang.String arg1){
    return (ElemDesc) null;
  }
  protected void processAttribute(java.io.Writer arg1, java.lang.String arg2, java.lang.String arg3, ElemDesc arg4) throws java.io.IOException{
  }
  public void writeAttrURI(java.io.Writer arg1, java.lang.String arg2, boolean arg3) throws java.io.IOException{
  }
}
