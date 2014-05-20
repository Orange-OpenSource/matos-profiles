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
public interface Node
{
  // Fields

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

  public static final short DOCUMENT_POSITION_DISCONNECTED = 1;

  public static final short DOCUMENT_POSITION_PRECEDING = 2;

  public static final short DOCUMENT_POSITION_FOLLOWING = 4;

  public static final short DOCUMENT_POSITION_CONTAINS = 8;

  public static final short DOCUMENT_POSITION_CONTAINED_BY = 16;

  public static final short DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC = 32;

  // Methods

  public boolean isSupported(java.lang.String arg1, java.lang.String arg2);
  public void normalize();
  public NamedNodeMap getAttributes();
  public java.lang.String getLocalName();
  public Node getNextSibling();
  public java.lang.String getNodeName();
  public short getNodeType();
  public Node getParentNode();
  public Node removeChild(Node arg1) throws DOMException;
  public Node insertBefore(Node arg1, Node arg2) throws DOMException;
  public Node appendChild(Node arg1) throws DOMException;
  public Node getLastChild();
  public boolean hasChildNodes();
  public NodeList getChildNodes();
  public Node replaceChild(Node arg1, Node arg2) throws DOMException;
  public Document getOwnerDocument();
  public Node getPreviousSibling();
  public Node getFirstChild();
  public java.lang.Object getUserData(java.lang.String arg1);
  public java.lang.String getNamespaceURI();
  public java.lang.String getNodeValue() throws DOMException;
  public java.lang.String getPrefix();
  public boolean hasAttributes();
  public Node cloneNode(boolean arg1);
  public void setNodeValue(java.lang.String arg1) throws DOMException;
  public void setPrefix(java.lang.String arg1) throws DOMException;
  public java.lang.Object setUserData(java.lang.String arg1, java.lang.Object arg2, @com.francetelecom.rd.stubs.annotation.CallBackRegister("handle") UserDataHandler arg3);
  public java.lang.Object getFeature(java.lang.String arg1, java.lang.String arg2);
  public boolean isEqualNode(Node arg1);
  public java.lang.String lookupNamespaceURI(java.lang.String arg1);
  public boolean isDefaultNamespace(java.lang.String arg1);
  public java.lang.String lookupPrefix(java.lang.String arg1);
  public boolean isSameNode(Node arg1);
  public void setTextContent(java.lang.String arg1) throws DOMException;
  public java.lang.String getTextContent() throws DOMException;
  public short compareDocumentPosition(Node arg1) throws DOMException;
  public java.lang.String getBaseURI();
}
