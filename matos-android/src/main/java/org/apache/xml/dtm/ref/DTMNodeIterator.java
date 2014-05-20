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


public class DTMNodeIterator
  implements org.w3c.dom.traversal.NodeIterator
{
  // Constructors

  public DTMNodeIterator(org.apache.xml.dtm.DTMIterator arg1){
  }
  // Methods

  public org.w3c.dom.Node nextNode() throws org.w3c.dom.DOMException{
    return (org.w3c.dom.Node) null;
  }
  public void detach(){
  }
  public org.w3c.dom.Node getRoot(){
    return (org.w3c.dom.Node) null;
  }
  public int getWhatToShow(){
    return 0;
  }
  public org.w3c.dom.traversal.NodeFilter getFilter(){
    return (org.w3c.dom.traversal.NodeFilter) null;
  }
  public boolean getExpandEntityReferences(){
    return false;
  }
  public org.w3c.dom.Node previousNode(){
    return (org.w3c.dom.Node) null;
  }
  public org.apache.xml.dtm.DTMIterator getDTMIterator(){
    return (org.apache.xml.dtm.DTMIterator) null;
  }
}
