package org.apache.xpath.objects;

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


public class XNodeSetForDOM
  extends XNodeSet{
  // Constructors

  public XNodeSetForDOM(org.w3c.dom.Node arg1, org.apache.xml.dtm.DTMManager arg2){
    super();
  }
  public XNodeSetForDOM(XNodeSet arg1){
    super();
  }
  public XNodeSetForDOM(org.w3c.dom.NodeList arg1, org.apache.xpath.XPathContext arg2){
    super();
  }
  public XNodeSetForDOM(org.w3c.dom.traversal.NodeIterator arg1, org.apache.xpath.XPathContext arg2){
    super();
  }
  // Methods

  public java.lang.Object object(){
    return (java.lang.Object) null;
  }
  public org.w3c.dom.traversal.NodeIterator nodeset() throws javax.xml.transform.TransformerException{
    return (org.w3c.dom.traversal.NodeIterator) null;
  }
  public org.w3c.dom.NodeList nodelist() throws javax.xml.transform.TransformerException{
    return (org.w3c.dom.NodeList) null;
  }
}
