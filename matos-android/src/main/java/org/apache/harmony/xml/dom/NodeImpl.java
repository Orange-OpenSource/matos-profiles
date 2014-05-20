package org.apache.harmony.xml.dom;

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
public abstract class NodeImpl
  implements org.w3c.dom.Node
{
  // Constructors

  NodeImpl(DocumentImpl arg1){
  }
  // Methods

  public boolean isSupported(java.lang.String arg1, java.lang.String arg2){
    return false;
  }
  public void normalize(){
  }
  public org.w3c.dom.NamedNodeMap getAttributes(){
    return (org.w3c.dom.NamedNodeMap) null;
  }
  public java.lang.String getLocalName(){
    return (java.lang.String) null;
  }
  public org.w3c.dom.Node getNextSibling(){
    return (org.w3c.dom.Node) null;
  }
  public java.lang.String getNodeName(){
    return (java.lang.String) null;
  }
  public abstract short getNodeType();
  public org.w3c.dom.Node getParentNode(){
    return (org.w3c.dom.Node) null;
  }
  public org.w3c.dom.Node removeChild(org.w3c.dom.Node arg1) throws org.w3c.dom.DOMException{
    return (org.w3c.dom.Node) null;
  }
  public org.w3c.dom.Node insertBefore(org.w3c.dom.Node arg1, org.w3c.dom.Node arg2) throws org.w3c.dom.DOMException{
    return (org.w3c.dom.Node) null;
  }
  public org.w3c.dom.Node appendChild(org.w3c.dom.Node arg1) throws org.w3c.dom.DOMException{
    return (org.w3c.dom.Node) null;
  }
  public org.w3c.dom.Node getLastChild(){
    return (org.w3c.dom.Node) null;
  }
  public boolean hasChildNodes(){
    return false;
  }
  public org.w3c.dom.NodeList getChildNodes(){
    return (org.w3c.dom.NodeList) null;
  }
  public org.w3c.dom.Node replaceChild(org.w3c.dom.Node arg1, org.w3c.dom.Node arg2) throws org.w3c.dom.DOMException{
    return (org.w3c.dom.Node) null;
  }
  public final org.w3c.dom.Document getOwnerDocument(){
    return (org.w3c.dom.Document) null;
  }
  public org.w3c.dom.Node getPreviousSibling(){
    return (org.w3c.dom.Node) null;
  }
  public org.w3c.dom.Node getFirstChild(){
    return (org.w3c.dom.Node) null;
  }
  public final java.lang.Object getUserData(java.lang.String arg1){
    return (java.lang.Object) null;
  }
  public java.lang.String getNamespaceURI(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("nodeValue")
  public java.lang.String getNodeValue() throws org.w3c.dom.DOMException{
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("prefix")
  public java.lang.String getPrefix(){
    return (java.lang.String) null;
  }
  public boolean hasAttributes(){
    return false;
  }
  public final org.w3c.dom.Node cloneNode(boolean arg1){
    return (org.w3c.dom.Node) null;
  }
  public final void setNodeValue(@com.francetelecom.rd.stubs.annotation.FieldSet("nodeValue") java.lang.String arg1) throws org.w3c.dom.DOMException{
  }
  public void setPrefix(@com.francetelecom.rd.stubs.annotation.FieldSet("prefix") java.lang.String arg1) throws org.w3c.dom.DOMException{
  }
  public final java.lang.Object setUserData(java.lang.String arg1, java.lang.Object arg2, @com.francetelecom.rd.stubs.annotation.CallBackRegister("handle") org.w3c.dom.UserDataHandler arg3){
    return (java.lang.Object) null;
  }
  public final java.lang.Object getFeature(java.lang.String arg1, java.lang.String arg2){
    return (java.lang.Object) null;
  }
  public final boolean isEqualNode(org.w3c.dom.Node arg1){
    return false;
  }
  public final java.lang.String lookupNamespaceURI(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public final boolean isDefaultNamespace(java.lang.String arg1){
    return false;
  }
  public final java.lang.String lookupPrefix(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public boolean isSameNode(org.w3c.dom.Node arg1){
    return false;
  }
  public final void setTextContent(@com.francetelecom.rd.stubs.annotation.FieldSet("textContent") java.lang.String arg1) throws org.w3c.dom.DOMException{
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("textContent")
  public java.lang.String getTextContent() throws org.w3c.dom.DOMException{
    return (java.lang.String) null;
  }
  public short compareDocumentPosition(org.w3c.dom.Node arg1) throws org.w3c.dom.DOMException{
    return (short) 0;
  }
  public final java.lang.String getBaseURI(){
    return (java.lang.String) null;
  }
}
