package org.apache.xml.dtm.ref;

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


public class DTMNamedNodeMap
  implements org.w3c.dom.NamedNodeMap
{
  // Classes

  public class DTMException
    extends org.w3c.dom.DOMException  {
    // Fields

    // Constructors

    public DTMException(short arg1, java.lang.String arg2){
      super((short) 0, (java.lang.String) null);
    }
    public DTMException(short arg1){
      super((short) 0, (java.lang.String) null);
    }
  }
  // Constructors

  public DTMNamedNodeMap(org.apache.xml.dtm.DTM arg1, int arg2){
  }
  // Methods

  public int getLength(){
    return 0;
  }
  public org.w3c.dom.Node item(int arg1){
    return (org.w3c.dom.Node) null;
  }
  public org.w3c.dom.Node getNamedItem(java.lang.String arg1){
    return (org.w3c.dom.Node) null;
  }
  public org.w3c.dom.Node getNamedItemNS(java.lang.String arg1, java.lang.String arg2){
    return (org.w3c.dom.Node) null;
  }
  public org.w3c.dom.Node removeNamedItem(java.lang.String arg1){
    return (org.w3c.dom.Node) null;
  }
  public org.w3c.dom.Node removeNamedItemNS(java.lang.String arg1, java.lang.String arg2) throws org.w3c.dom.DOMException{
    return (org.w3c.dom.Node) null;
  }
  public org.w3c.dom.Node setNamedItem(org.w3c.dom.Node arg1){
    return (org.w3c.dom.Node) null;
  }
  public org.w3c.dom.Node setNamedItemNS(org.w3c.dom.Node arg1) throws org.w3c.dom.DOMException{
    return (org.w3c.dom.Node) null;
  }
}
