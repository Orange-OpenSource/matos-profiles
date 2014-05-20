package org.w3c.dom;

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
public interface Document
  extends Node
{
  // Methods

  public DocumentFragment createDocumentFragment();
  public Element getDocumentElement();
  public Element createElementNS(java.lang.String arg1, java.lang.String arg2) throws DOMException;
  public Text createTextNode(java.lang.String arg1);
  public ProcessingInstruction createProcessingInstruction(java.lang.String arg1, java.lang.String arg2) throws DOMException;
  public EntityReference createEntityReference(java.lang.String arg1) throws DOMException;
  public Comment createComment(java.lang.String arg1);
  public CDATASection createCDATASection(java.lang.String arg1) throws DOMException;
  public NodeList getElementsByTagName(java.lang.String arg1);
  public NodeList getElementsByTagNameNS(java.lang.String arg1, java.lang.String arg2);
  public DocumentType getDoctype();
  public DOMImplementation getImplementation();
  public Element createElement(java.lang.String arg1) throws DOMException;
  public Attr createAttribute(java.lang.String arg1) throws DOMException;
  public Node importNode(Node arg1, boolean arg2) throws DOMException;
  public Attr createAttributeNS(java.lang.String arg1, java.lang.String arg2) throws DOMException;
  public Element getElementById(java.lang.String arg1);
  public Node adoptNode(Node arg1) throws DOMException;
  public java.lang.String getInputEncoding();
  public boolean getStrictErrorChecking();
  public void setStrictErrorChecking(boolean arg1);
  public Node renameNode(Node arg1, java.lang.String arg2, java.lang.String arg3) throws DOMException;
  public void normalizeDocument();
  public DOMConfiguration getDomConfig();
  public void setDocumentURI(@com.francetelecom.rd.stubs.annotation.FieldSet("documentURI") java.lang.String arg1);
  @com.francetelecom.rd.stubs.annotation.FieldGet("documentURI")
  public java.lang.String getDocumentURI();
  public java.lang.String getXmlEncoding();
  public boolean getXmlStandalone();
  public void setXmlStandalone(boolean arg1) throws DOMException;
  @com.francetelecom.rd.stubs.annotation.FieldGet("xmlVersion")
  public java.lang.String getXmlVersion();
  public void setXmlVersion(@com.francetelecom.rd.stubs.annotation.FieldSet("xmlVersion") java.lang.String arg1) throws DOMException;
}
