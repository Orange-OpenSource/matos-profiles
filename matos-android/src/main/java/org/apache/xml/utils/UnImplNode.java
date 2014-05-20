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


public class UnImplNode
  implements org.w3c.dom.Document, org.w3c.dom.NodeList, org.w3c.dom.Node, org.w3c.dom.Element
{
  // Fields

  protected java.lang.String fDocumentURI;

  protected java.lang.String actualEncoding;

  // Constructors

  public UnImplNode(){
  }
  // Methods

  public int getLength(){
    return 0;
  }
  public void setValue(java.lang.String arg1) throws org.w3c.dom.DOMException{
  }
  public boolean isSupported(java.lang.String arg1, java.lang.String arg2){
    return false;
  }
  public void normalize(){
  }
  public void error(java.lang.String arg1){
  }
  public void error(java.lang.String arg1, java.lang.Object [] arg2){
  }
  public org.w3c.dom.NamedNodeMap getAttributes(){
    return (org.w3c.dom.NamedNodeMap) null;
  }
  public java.lang.String getAttribute(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public org.w3c.dom.DocumentFragment createDocumentFragment(){
    return (org.w3c.dom.DocumentFragment) null;
  }
  public org.w3c.dom.Node item(int arg1){
    return (org.w3c.dom.Node) null;
  }
  public java.lang.String getLocalName(){
    return (java.lang.String) null;
  }
  public org.w3c.dom.Node getNextSibling(){
    return (org.w3c.dom.Node) null;
  }
  public void setAttribute(java.lang.String arg1, java.lang.String arg2) throws org.w3c.dom.DOMException{
  }
  public java.lang.String getNodeName(){
    return (java.lang.String) null;
  }
  public short getNodeType(){
    return (short) 0;
  }
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
  public org.w3c.dom.Document getOwnerDocument(){
    return (org.w3c.dom.Document) null;
  }
  public java.lang.String getTagName(){
    return (java.lang.String) null;
  }
  public org.w3c.dom.Node getPreviousSibling(){
    return (org.w3c.dom.Node) null;
  }
  public org.w3c.dom.Node getFirstChild(){
    return (org.w3c.dom.Node) null;
  }
  public java.lang.Object getUserData(java.lang.String arg1){
    return (java.lang.Object) null;
  }
  public org.w3c.dom.Element getOwnerElement(){
    return (org.w3c.dom.Element) null;
  }
  public java.lang.String getNamespaceURI(){
    return (java.lang.String) null;
  }
  public org.w3c.dom.Attr getAttributeNode(java.lang.String arg1){
    return (org.w3c.dom.Attr) null;
  }
  public void setData(java.lang.String arg1) throws org.w3c.dom.DOMException{
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("nodeValue")
  public java.lang.String getNodeValue() throws org.w3c.dom.DOMException{
    return (java.lang.String) null;
  }
  public org.w3c.dom.Element getDocumentElement(){
    return (org.w3c.dom.Element) null;
  }
  public org.w3c.dom.Element createElementNS(java.lang.String arg1, java.lang.String arg2) throws org.w3c.dom.DOMException{
    return (org.w3c.dom.Element) null;
  }
  public void setAttributeNS(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws org.w3c.dom.DOMException{
  }
  public void appendData(java.lang.String arg1) throws org.w3c.dom.DOMException{
  }
  public org.w3c.dom.Text createTextNode(java.lang.String arg1){
    return (org.w3c.dom.Text) null;
  }
  public org.w3c.dom.ProcessingInstruction createProcessingInstruction(java.lang.String arg1, java.lang.String arg2) throws org.w3c.dom.DOMException{
    return (org.w3c.dom.ProcessingInstruction) null;
  }
  public org.w3c.dom.EntityReference createEntityReference(java.lang.String arg1) throws org.w3c.dom.DOMException{
    return (org.w3c.dom.EntityReference) null;
  }
  public org.w3c.dom.Comment createComment(java.lang.String arg1){
    return (org.w3c.dom.Comment) null;
  }
  public org.w3c.dom.CDATASection createCDATASection(java.lang.String arg1) throws org.w3c.dom.DOMException{
    return (org.w3c.dom.CDATASection) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("prefix")
  public java.lang.String getPrefix(){
    return (java.lang.String) null;
  }
  public org.w3c.dom.NodeList getElementsByTagName(java.lang.String arg1){
    return (org.w3c.dom.NodeList) null;
  }
  public org.w3c.dom.Attr removeAttributeNode(org.w3c.dom.Attr arg1) throws org.w3c.dom.DOMException{
    return (org.w3c.dom.Attr) null;
  }
  public org.w3c.dom.Attr setAttributeNode(org.w3c.dom.Attr arg1) throws org.w3c.dom.DOMException{
    return (org.w3c.dom.Attr) null;
  }
  public boolean hasAttribute(java.lang.String arg1){
    return false;
  }
  public boolean hasAttributeNS(java.lang.String arg1, java.lang.String arg2){
    return false;
  }
  public void removeAttribute(java.lang.String arg1) throws org.w3c.dom.DOMException{
  }
  public boolean hasAttributes(){
    return false;
  }
  public org.w3c.dom.NodeList getElementsByTagNameNS(java.lang.String arg1, java.lang.String arg2){
    return (org.w3c.dom.NodeList) null;
  }
  public org.w3c.dom.Attr setAttributeNodeNS(org.w3c.dom.Attr arg1) throws org.w3c.dom.DOMException{
    return (org.w3c.dom.Attr) null;
  }
  public org.w3c.dom.Attr getAttributeNodeNS(java.lang.String arg1, java.lang.String arg2){
    return (org.w3c.dom.Attr) null;
  }
  public void removeAttributeNS(java.lang.String arg1, java.lang.String arg2) throws org.w3c.dom.DOMException{
  }
  public java.lang.String getAttributeNS(java.lang.String arg1, java.lang.String arg2){
    return (java.lang.String) null;
  }
  public org.w3c.dom.Node cloneNode(boolean arg1){
    return (org.w3c.dom.Node) null;
  }
  public void setNodeValue(@com.francetelecom.rd.stubs.annotation.FieldSet("nodeValue") java.lang.String arg1) throws org.w3c.dom.DOMException{
  }
  public boolean getSpecified(){
    return false;
  }
  public void setPrefix(@com.francetelecom.rd.stubs.annotation.FieldSet("prefix") java.lang.String arg1) throws org.w3c.dom.DOMException{
  }
  public org.w3c.dom.DocumentType getDoctype(){
    return (org.w3c.dom.DocumentType) null;
  }
  public org.w3c.dom.DOMImplementation getImplementation(){
    return (org.w3c.dom.DOMImplementation) null;
  }
  public org.w3c.dom.Element createElement(java.lang.String arg1) throws org.w3c.dom.DOMException{
    return (org.w3c.dom.Element) null;
  }
  public org.w3c.dom.Attr createAttribute(java.lang.String arg1) throws org.w3c.dom.DOMException{
    return (org.w3c.dom.Attr) null;
  }
  public org.w3c.dom.Node importNode(org.w3c.dom.Node arg1, boolean arg2) throws org.w3c.dom.DOMException{
    return (org.w3c.dom.Node) null;
  }
  public org.w3c.dom.Attr createAttributeNS(java.lang.String arg1, java.lang.String arg2) throws org.w3c.dom.DOMException{
    return (org.w3c.dom.Attr) null;
  }
  public org.w3c.dom.Element getElementById(java.lang.String arg1){
    return (org.w3c.dom.Element) null;
  }
  public java.lang.String substringData(int arg1, int arg2) throws org.w3c.dom.DOMException{
    return (java.lang.String) null;
  }
  public void insertData(int arg1, java.lang.String arg2) throws org.w3c.dom.DOMException{
  }
  public void deleteData(int arg1, int arg2) throws org.w3c.dom.DOMException{
  }
  public void replaceData(int arg1, int arg2, java.lang.String arg3) throws org.w3c.dom.DOMException{
  }
  public org.w3c.dom.Text splitText(int arg1) throws org.w3c.dom.DOMException{
    return (org.w3c.dom.Text) null;
  }
  public org.w3c.dom.Node adoptNode(org.w3c.dom.Node arg1) throws org.w3c.dom.DOMException{
    return (org.w3c.dom.Node) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("inputEncoding")
  public java.lang.String getInputEncoding(){
    return (java.lang.String) null;
  }
  public void setInputEncoding(@com.francetelecom.rd.stubs.annotation.FieldSet("inputEncoding") java.lang.String arg1){
  }
  public boolean getStrictErrorChecking(){
    return false;
  }
  public void setStrictErrorChecking(boolean arg1){
  }
  public java.lang.Object setUserData(java.lang.String arg1, java.lang.Object arg2, @com.francetelecom.rd.stubs.annotation.CallBackRegister("handle") org.w3c.dom.UserDataHandler arg3){
    return (java.lang.Object) null;
  }
  public java.lang.Object getFeature(java.lang.String arg1, java.lang.String arg2){
    return (java.lang.Object) null;
  }
  public boolean isEqualNode(org.w3c.dom.Node arg1){
    return false;
  }
  public java.lang.String lookupNamespaceURI(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public boolean isDefaultNamespace(java.lang.String arg1){
    return false;
  }
  public java.lang.String lookupPrefix(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public boolean isSameNode(org.w3c.dom.Node arg1){
    return false;
  }
  public void setTextContent(@com.francetelecom.rd.stubs.annotation.FieldSet("textContent") java.lang.String arg1) throws org.w3c.dom.DOMException{
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("textContent")
  public java.lang.String getTextContent() throws org.w3c.dom.DOMException{
    return (java.lang.String) null;
  }
  public short compareDocumentPosition(org.w3c.dom.Node arg1) throws org.w3c.dom.DOMException{
    return (short) 0;
  }
  public java.lang.String getBaseURI(){
    return (java.lang.String) null;
  }
  public org.w3c.dom.Node renameNode(org.w3c.dom.Node arg1, java.lang.String arg2, java.lang.String arg3) throws org.w3c.dom.DOMException{
    return (org.w3c.dom.Node) null;
  }
  public void normalizeDocument(){
  }
  public org.w3c.dom.DOMConfiguration getDomConfig(){
    return (org.w3c.dom.DOMConfiguration) null;
  }
  public void setDocumentURI(@com.francetelecom.rd.stubs.annotation.FieldSet("documentUri") java.lang.String arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("documentUri")
  public java.lang.String getDocumentURI(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("actualEncoding")
  public java.lang.String getActualEncoding(){
    return (java.lang.String) null;
  }
  public void setActualEncoding(@com.francetelecom.rd.stubs.annotation.FieldSet("this.actualEncoding") java.lang.String arg1){
  }
  public org.w3c.dom.Text replaceWholeText(java.lang.String arg1) throws org.w3c.dom.DOMException{
    return (org.w3c.dom.Text) null;
  }
  public java.lang.String getWholeText(){
    return (java.lang.String) null;
  }
  public boolean isWhitespaceInElementContent(){
    return false;
  }
  public void setIdAttribute(boolean arg1){
  }
  public void setIdAttribute(java.lang.String arg1, boolean arg2){
  }
  public void setIdAttributeNode(org.w3c.dom.Attr arg1, boolean arg2){
  }
  public void setIdAttributeNS(java.lang.String arg1, java.lang.String arg2, boolean arg3){
  }
  public org.w3c.dom.TypeInfo getSchemaTypeInfo(){
    return (org.w3c.dom.TypeInfo) null;
  }
  public boolean isId(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("xmlEncoding")
  public java.lang.String getXmlEncoding(){
    return (java.lang.String) null;
  }
  public void setXmlEncoding(@com.francetelecom.rd.stubs.annotation.FieldSet("xmlEncoding") java.lang.String arg1){
  }
  public boolean getXmlStandalone(){
    return false;
  }
  public void setXmlStandalone(boolean arg1) throws org.w3c.dom.DOMException{
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("xmlVersion")
  public java.lang.String getXmlVersion(){
    return (java.lang.String) null;
  }
  public void setXmlVersion(@com.francetelecom.rd.stubs.annotation.FieldSet("xmlVersion") java.lang.String arg1) throws org.w3c.dom.DOMException{
  }
}
