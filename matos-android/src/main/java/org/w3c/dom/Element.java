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
public interface Element
  extends Node
{
  // Methods

  public java.lang.String getAttribute(java.lang.String arg1);
  public void setAttribute(java.lang.String arg1, java.lang.String arg2) throws DOMException;
  public java.lang.String getTagName();
  public Attr getAttributeNode(java.lang.String arg1);
  public void setAttributeNS(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws DOMException;
  public NodeList getElementsByTagName(java.lang.String arg1);
  public Attr removeAttributeNode(Attr arg1) throws DOMException;
  public Attr setAttributeNode(Attr arg1) throws DOMException;
  public boolean hasAttribute(java.lang.String arg1);
  public boolean hasAttributeNS(java.lang.String arg1, java.lang.String arg2) throws DOMException;
  public void removeAttribute(java.lang.String arg1) throws DOMException;
  public NodeList getElementsByTagNameNS(java.lang.String arg1, java.lang.String arg2) throws DOMException;
  public Attr setAttributeNodeNS(Attr arg1) throws DOMException;
  public Attr getAttributeNodeNS(java.lang.String arg1, java.lang.String arg2) throws DOMException;
  public void removeAttributeNS(java.lang.String arg1, java.lang.String arg2) throws DOMException;
  public java.lang.String getAttributeNS(java.lang.String arg1, java.lang.String arg2) throws DOMException;
  public void setIdAttribute(java.lang.String arg1, boolean arg2) throws DOMException;
  public void setIdAttributeNode(Attr arg1, boolean arg2) throws DOMException;
  public void setIdAttributeNS(java.lang.String arg1, java.lang.String arg2, boolean arg3) throws DOMException;
  public TypeInfo getSchemaTypeInfo();
}
