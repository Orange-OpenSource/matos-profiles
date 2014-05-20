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


public class DOMHelper
{
  // Fields

  protected static final NSInfo m_NSInfoUnProcWithXMLNS = null;

  protected static final NSInfo m_NSInfoUnProcWithoutXMLNS = null;

  protected static final NSInfo m_NSInfoUnProcNoAncestorXMLNS = null;

  protected static final NSInfo m_NSInfoNullWithXMLNS = null;

  protected static final NSInfo m_NSInfoNullWithoutXMLNS = null;

  protected static final NSInfo m_NSInfoNullNoAncestorXMLNS = null;

  protected java.util.Vector m_candidateNoAncestorXMLNS;

  protected org.w3c.dom.Document m_DOMFactory;

  // Constructors

  public DOMHelper(){
  }
  // Methods

  public org.w3c.dom.Node getRoot(org.w3c.dom.Node arg1){
    return (org.w3c.dom.Node) null;
  }
  public short getLevel(org.w3c.dom.Node arg1){
    return (short) 0;
  }
  public org.w3c.dom.Node getRootNode(org.w3c.dom.Node arg1){
    return (org.w3c.dom.Node) null;
  }
  public java.lang.String getNamespaceForPrefix(java.lang.String arg1, org.w3c.dom.Element arg2){
    return (java.lang.String) null;
  }
  public java.lang.String getUnparsedEntityURI(java.lang.String arg1, org.w3c.dom.Document arg2){
    return (java.lang.String) null;
  }
  public static boolean isNodeAfter(org.w3c.dom.Node arg1, org.w3c.dom.Node arg2){
    return false;
  }
  public static org.w3c.dom.Document createDocument(boolean arg1){
    return (org.w3c.dom.Document) null;
  }
  public static org.w3c.dom.Document createDocument(){
    return (org.w3c.dom.Document) null;
  }
  public java.lang.String getNamespaceOfNode(org.w3c.dom.Node arg1){
    return (java.lang.String) null;
  }
  public java.lang.String getLocalNameOfNode(org.w3c.dom.Node arg1){
    return (java.lang.String) null;
  }
  public boolean shouldStripSourceNode(org.w3c.dom.Node arg1) throws javax.xml.transform.TransformerException{
    return false;
  }
  public java.lang.String getUniqueID(org.w3c.dom.Node arg1){
    return (java.lang.String) null;
  }
  public static boolean isNodeTheSame(org.w3c.dom.Node arg1, org.w3c.dom.Node arg2){
    return false;
  }
  public java.lang.String getExpandedElementName(org.w3c.dom.Element arg1){
    return (java.lang.String) null;
  }
  public java.lang.String getExpandedAttributeName(org.w3c.dom.Attr arg1){
    return (java.lang.String) null;
  }
  public boolean isIgnorableWhitespace(org.w3c.dom.Text arg1){
    return false;
  }
  public boolean isNamespaceNode(org.w3c.dom.Node arg1){
    return false;
  }
  public static org.w3c.dom.Node getParentOfNode(org.w3c.dom.Node arg1) throws java.lang.RuntimeException{
    return (org.w3c.dom.Node) null;
  }
  public org.w3c.dom.Element getElementByID(java.lang.String arg1, org.w3c.dom.Document arg2){
    return (org.w3c.dom.Element) null;
  }
  public void setDOMFactory(org.w3c.dom.Document arg1){
  }
  public org.w3c.dom.Document getDOMFactory(){
    return (org.w3c.dom.Document) null;
  }
  public static java.lang.String getNodeData(org.w3c.dom.Node arg1){
    return (java.lang.String) null;
  }
  public static void getNodeData(org.w3c.dom.Node arg1, FastStringBuffer arg2){
  }
}
