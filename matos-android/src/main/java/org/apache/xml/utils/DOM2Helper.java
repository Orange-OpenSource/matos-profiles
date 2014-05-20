package org.apache.xml.utils;

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


public class DOM2Helper
  extends DOMHelper{
  // Constructors

  public DOM2Helper(){
    super();
  }
  // Methods

  public void parse(org.xml.sax.InputSource arg1) throws javax.xml.transform.TransformerException{
  }
  public org.w3c.dom.Document getDocument(){
    return (org.w3c.dom.Document) null;
  }
  public static boolean isNodeAfter(org.w3c.dom.Node arg1, org.w3c.dom.Node arg2){
    return false;
  }
  public java.lang.String getNamespaceOfNode(org.w3c.dom.Node arg1){
    return (java.lang.String) null;
  }
  public java.lang.String getLocalNameOfNode(org.w3c.dom.Node arg1){
    return (java.lang.String) null;
  }
  public static org.w3c.dom.Node getParentOfNode(org.w3c.dom.Node arg1){
    return (org.w3c.dom.Node) null;
  }
  public org.w3c.dom.Element getElementByID(java.lang.String arg1, org.w3c.dom.Document arg2){
    return (org.w3c.dom.Element) null;
  }
  public void checkNode(org.w3c.dom.Node arg1) throws javax.xml.transform.TransformerException{
  }
  public boolean supportsSAX(){
    return false;
  }
  public void setDocument(org.w3c.dom.Document arg1){
  }
}
