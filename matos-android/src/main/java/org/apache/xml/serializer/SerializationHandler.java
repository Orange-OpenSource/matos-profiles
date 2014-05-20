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


public interface SerializationHandler
  extends DOMSerializer, Serializer, org.xml.sax.ext.DeclHandler, org.xml.sax.DTDHandler, ExtendedContentHandler, org.xml.sax.ErrorHandler, ExtendedLexicalHandler
{
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("serializationHandler")
  public void close();
  @com.francetelecom.rd.stubs.annotation.CallBack("serializationHandler")
  public java.lang.String getEncoding();
  @com.francetelecom.rd.stubs.annotation.CallBack("serializationHandler")
  public void setVersion(java.lang.String arg1);
  @com.francetelecom.rd.stubs.annotation.CallBack("serializationHandler")
  public java.lang.String getVersion();
  @com.francetelecom.rd.stubs.annotation.CallBack("serializationHandler")
  public void setEncoding(java.lang.String arg1);
  @com.francetelecom.rd.stubs.annotation.CallBack("serializationHandler")
  public void setContentHandler(org.xml.sax.ContentHandler arg1);
  @com.francetelecom.rd.stubs.annotation.CallBack("serializationHandler")
  public void setOmitXMLDeclaration(boolean arg1);
  @com.francetelecom.rd.stubs.annotation.CallBack("serializationHandler")
  public boolean getOmitXMLDeclaration();
  @com.francetelecom.rd.stubs.annotation.CallBack("serializationHandler")
  public java.lang.String getDoctypePublic();
  @com.francetelecom.rd.stubs.annotation.CallBack("serializationHandler")
  public void setDoctypePublic(java.lang.String arg1);
  @com.francetelecom.rd.stubs.annotation.CallBack("serializationHandler")
  public java.lang.String getDoctypeSystem();
  @com.francetelecom.rd.stubs.annotation.CallBack("serializationHandler")
  public void setDoctypeSystem(java.lang.String arg1);
  @com.francetelecom.rd.stubs.annotation.CallBack("serializationHandler")
  public void setDoctype(java.lang.String arg1, java.lang.String arg2);
  @com.francetelecom.rd.stubs.annotation.CallBack("serializationHandler")
  public void setStandalone(java.lang.String arg1);
  @com.francetelecom.rd.stubs.annotation.CallBack("serializationHandler")
  public java.lang.String getStandalone();
  @com.francetelecom.rd.stubs.annotation.CallBack("serializationHandler")
  public boolean getIndent();
  @com.francetelecom.rd.stubs.annotation.CallBack("serializationHandler")
  public java.lang.String getMediaType();
  @com.francetelecom.rd.stubs.annotation.CallBack("serializationHandler")
  public void setMediaType(java.lang.String arg1);
  @com.francetelecom.rd.stubs.annotation.CallBack("serializationHandler")
  public int getIndentAmount();
  @com.francetelecom.rd.stubs.annotation.CallBack("serializationHandler")
  public void setIndentAmount(int arg1);
  @com.francetelecom.rd.stubs.annotation.CallBack("serializationHandler")
  public void setIndent(boolean arg1);
  @com.francetelecom.rd.stubs.annotation.CallBack("serializationHandler")
  public void setTransformer(javax.xml.transform.Transformer arg1);
  @com.francetelecom.rd.stubs.annotation.CallBack("serializationHandler")
  public javax.xml.transform.Transformer getTransformer();
  @com.francetelecom.rd.stubs.annotation.CallBack("serializationHandler")
  public void setNamespaceMappings(NamespaceMappings arg1);
  @com.francetelecom.rd.stubs.annotation.CallBack("serializationHandler")
  public void setDTDEntityExpansion(boolean arg1);
  @com.francetelecom.rd.stubs.annotation.CallBack("serializationHandler")
  public java.lang.String getOutputProperty(java.lang.String arg1);
  @com.francetelecom.rd.stubs.annotation.CallBack("serializationHandler")
  public java.lang.String getOutputPropertyDefault(java.lang.String arg1);
  @com.francetelecom.rd.stubs.annotation.CallBack("serializationHandler")
  public void setOutputProperty(java.lang.String arg1, java.lang.String arg2);
  @com.francetelecom.rd.stubs.annotation.CallBack("serializationHandler")
  public void setOutputPropertyDefault(java.lang.String arg1, java.lang.String arg2);
  @com.francetelecom.rd.stubs.annotation.CallBack("serializationHandler")
  public void setCdataSectionElements(java.util.Vector arg1);
  @com.francetelecom.rd.stubs.annotation.CallBack("serializationHandler")
  public void serialize(org.w3c.dom.Node arg1) throws java.io.IOException;
  @com.francetelecom.rd.stubs.annotation.CallBack("serializationHandler")
  public void flushPending() throws org.xml.sax.SAXException;
  @com.francetelecom.rd.stubs.annotation.CallBack("serializationHandler")
  public boolean setEscaping(boolean arg1) throws org.xml.sax.SAXException;
}
