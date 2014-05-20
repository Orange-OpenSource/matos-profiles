package org.xml.sax.ext;

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
public class DefaultHandler2
  extends org.xml.sax.helpers.DefaultHandler  implements LexicalHandler, DeclHandler, EntityResolver2
{
  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("handle")
  public DefaultHandler2(){
    super();
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("handle")
  public void comment(char [] arg1, int arg2, int arg3) throws org.xml.sax.SAXException{
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("handle")
  public void startEntity(java.lang.String arg1) throws org.xml.sax.SAXException{
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("handle")
  public void endEntity(java.lang.String arg1) throws org.xml.sax.SAXException{
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("handle")
  public void startCDATA() throws org.xml.sax.SAXException{
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("handle")
  public void endCDATA() throws org.xml.sax.SAXException{
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("handle")
  public void startDTD(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws org.xml.sax.SAXException{
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("handle")
  public void endDTD() throws org.xml.sax.SAXException{
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("handle")
  public void elementDecl(java.lang.String arg1, java.lang.String arg2) throws org.xml.sax.SAXException{
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("handle")
  public void attributeDecl(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5) throws org.xml.sax.SAXException{
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("handle")
  public void internalEntityDecl(java.lang.String arg1, java.lang.String arg2) throws org.xml.sax.SAXException{
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("handle")
  public void externalEntityDecl(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws org.xml.sax.SAXException{
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("handle")
  public org.xml.sax.InputSource resolveEntity(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4) throws org.xml.sax.SAXException, java.io.IOException{
    return (org.xml.sax.InputSource) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("handle")
  public org.xml.sax.InputSource resolveEntity(java.lang.String arg1, java.lang.String arg2) throws org.xml.sax.SAXException, java.io.IOException{
    return (org.xml.sax.InputSource) null;
  }
  public org.xml.sax.InputSource getExternalSubset(java.lang.String arg1, java.lang.String arg2) throws org.xml.sax.SAXException, java.io.IOException{
    return (org.xml.sax.InputSource) null;
  }
}
