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


public interface ExtendedContentHandler
  extends org.xml.sax.ContentHandler
{
  // Fields

  public static final int NO_BAD_CHARS = 1;

  public static final int HTML_ATTREMPTY = 2;

  public static final int HTML_ATTRURL = 4;

  // Methods

  public void startElement(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws org.xml.sax.SAXException;
  public void startElement(java.lang.String arg1) throws org.xml.sax.SAXException;
  public void characters(java.lang.String arg1) throws org.xml.sax.SAXException;
  public void characters(org.w3c.dom.Node arg1) throws org.xml.sax.SAXException;
  public void endElement(java.lang.String arg1) throws org.xml.sax.SAXException;
  public boolean startPrefixMapping(java.lang.String arg1, java.lang.String arg2, boolean arg3) throws org.xml.sax.SAXException;
  public void entityReference(java.lang.String arg1) throws org.xml.sax.SAXException;
  public java.lang.String getNamespaceURI(java.lang.String arg1, boolean arg2);
  public java.lang.String getPrefix(java.lang.String arg1);
  public void addAttribute(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5, boolean arg6) throws org.xml.sax.SAXException;
  public void addAttribute(java.lang.String arg1, java.lang.String arg2);
  public void addAttribute(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5) throws org.xml.sax.SAXException;
  public void addXSLAttribute(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3);
  public void addAttributes(org.xml.sax.Attributes arg1) throws org.xml.sax.SAXException;
  public void namespaceAfterStartElement(java.lang.String arg1, java.lang.String arg2) throws org.xml.sax.SAXException;
  public NamespaceMappings getNamespaceMappings();
  public java.lang.String getNamespaceURIFromPrefix(java.lang.String arg1);
  public void setSourceLocator(javax.xml.transform.SourceLocator arg1);
  public void addUniqueAttribute(java.lang.String arg1, java.lang.String arg2, int arg3) throws org.xml.sax.SAXException;
}
