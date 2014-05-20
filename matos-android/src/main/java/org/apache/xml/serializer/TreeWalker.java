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


public final class TreeWalker
{
  // Fields

  protected final org.apache.xml.serializer.utils.DOM2Helper m_dh = (org.apache.xml.serializer.utils.DOM2Helper) null;

  // Constructors

  public TreeWalker(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handle") org.xml.sax.ContentHandler arg1){
  }
  public TreeWalker(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handle") org.xml.sax.ContentHandler arg1, java.lang.String arg2){
  }
  // Methods

  public org.xml.sax.ContentHandler getContentHandler(){
    return (org.xml.sax.ContentHandler) null;
  }
  public void traverse(org.w3c.dom.Node arg1) throws org.xml.sax.SAXException{
  }
  public void traverse(org.w3c.dom.Node arg1, org.w3c.dom.Node arg2) throws org.xml.sax.SAXException{
  }
  protected void startNode(org.w3c.dom.Node arg1) throws org.xml.sax.SAXException{
  }
  protected void endNode(org.w3c.dom.Node arg1) throws org.xml.sax.SAXException{
  }
}
