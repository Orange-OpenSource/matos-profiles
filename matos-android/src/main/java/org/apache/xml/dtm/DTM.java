package org.apache.xml.dtm;

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


public interface DTM
{
  // Fields

  public static final int NULL = -1;

  public static final short ROOT_NODE = 0;

  public static final short ELEMENT_NODE = 1;

  public static final short ATTRIBUTE_NODE = 2;

  public static final short TEXT_NODE = 3;

  public static final short CDATA_SECTION_NODE = 4;

  public static final short ENTITY_REFERENCE_NODE = 5;

  public static final short ENTITY_NODE = 6;

  public static final short PROCESSING_INSTRUCTION_NODE = 7;

  public static final short COMMENT_NODE = 8;

  public static final short DOCUMENT_NODE = 9;

  public static final short DOCUMENT_TYPE_NODE = 10;

  public static final short DOCUMENT_FRAGMENT_NODE = 11;

  public static final short NOTATION_NODE = 12;

  public static final short NAMESPACE_NODE = 13;

  public static final short NTYPES = 14;

  // Methods

  public void setProperty(java.lang.String arg1, java.lang.Object arg2);
  public int getParent(int arg1);
  public boolean isSupported(java.lang.String arg1, java.lang.String arg2);
  public org.xml.sax.ContentHandler getContentHandler();
  public org.apache.xml.utils.XMLString getStringValue(int arg1);
  public short getLevel(int arg1);
  public java.lang.String getLocalName(int arg1);
  public int getNextSibling(int arg1);
  public java.lang.String getNodeName(int arg1);
  public short getNodeType(int arg1);
  public void appendChild(int arg1, boolean arg2, boolean arg3);
  public int getLastChild(int arg1);
  public boolean hasChildNodes(int arg1);
  public int getOwnerDocument(int arg1);
  public int getPreviousSibling(int arg1);
  public int getFirstChild(int arg1);
  public java.lang.String getNamespaceURI(int arg1);
  public int getAttributeNode(int arg1, java.lang.String arg2, java.lang.String arg3);
  public java.lang.String getNodeValue(int arg1);
  public java.lang.String getPrefix(int arg1);
  public int getElementById(java.lang.String arg1);
  public org.xml.sax.ErrorHandler getErrorHandler();
  public void setFeature(java.lang.String arg1, boolean arg2);
  public org.xml.sax.EntityResolver getEntityResolver();
  public org.xml.sax.DTDHandler getDTDHandler();
  public org.xml.sax.ext.LexicalHandler getLexicalHandler();
  public void dispatchCharactersEvents(int arg1, org.xml.sax.ContentHandler arg2, boolean arg3) throws org.xml.sax.SAXException;
  public org.w3c.dom.Node getNode(int arg1);
  public int getFirstAttribute(int arg1);
  public java.lang.String getNodeNameX(int arg1);
  public java.lang.String getUnparsedEntityURI(java.lang.String arg1);
  public org.xml.sax.ext.DeclHandler getDeclHandler();
  public boolean needsTwoThreads();
  public boolean isAttributeSpecified(int arg1);
  public java.lang.String getDocumentTypeDeclarationSystemIdentifier();
  public void dispatchToEvents(int arg1, org.xml.sax.ContentHandler arg2) throws org.xml.sax.SAXException;
  public void migrateTo(DTMManager arg1);
  public java.lang.String getDocumentTypeDeclarationPublicIdentifier();
  public javax.xml.transform.SourceLocator getSourceLocatorFor(int arg1);
  public DTMAxisIterator getTypedAxisIterator(int arg1, int arg2);
  public DTMAxisIterator getAxisIterator(int arg1);
  public DTMAxisTraverser getAxisTraverser(int arg1);
  public void documentRegistration();
  public void documentRelease();
  public int getDocument();
  public int getFirstNamespaceNode(int arg1, boolean arg2);
  public int getNextNamespaceNode(int arg1, int arg2, boolean arg3);
  public int getExpandedTypeID(int arg1);
  public int getExpandedTypeID(java.lang.String arg1, java.lang.String arg2, int arg3);
  public int getDocumentRoot(int arg1);
  public void appendTextChild(java.lang.String arg1);
  public boolean isNodeAfter(int arg1, int arg2);
  public int getNextAttribute(int arg1);
  public java.lang.String getDocumentBaseURI();
  public int getStringValueChunkCount(int arg1);
  public char [] getStringValueChunk(int arg1, int arg2, int [] arg3);
  public java.lang.String getLocalNameFromExpandedNameID(int arg1);
  public java.lang.String getNamespaceFromExpandedNameID(int arg1);
  public void setDocumentBaseURI(java.lang.String arg1);
  public java.lang.String getDocumentSystemIdentifier(int arg1);
  public java.lang.String getDocumentEncoding(int arg1);
  public java.lang.String getDocumentStandalone(int arg1);
  public java.lang.String getDocumentVersion(int arg1);
  public boolean getDocumentAllDeclarationsProcessed();
  public boolean supportsPreStripping();
  public boolean isCharacterElementContentWhitespace(int arg1);
  public boolean isDocumentAllDeclarationsProcessed(int arg1);
}
