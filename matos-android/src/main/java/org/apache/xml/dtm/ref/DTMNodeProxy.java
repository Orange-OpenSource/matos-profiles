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


public class DTMNodeProxy
  implements org.w3c.dom.Attr, org.w3c.dom.Document, org.w3c.dom.ProcessingInstruction, org.w3c.dom.DocumentFragment, org.w3c.dom.Node, org.w3c.dom.Text, org.w3c.dom.Comment, org.w3c.dom.Element
{
  // Fields

  public org.apache.xml.dtm.DTM dtm;

  protected java.lang.String fDocumentURI;

  protected java.lang.String actualEncoding;

  // Constructors

  public DTMNodeProxy(org.apache.xml.dtm.DTM arg1, int arg2){
  }
  // Methods

  public final boolean equals(org.w3c.dom.Node arg1){
    return false;
  }
  public final boolean equals(java.lang.Object arg1){
    return false;
  }
  public final int getLength(){
    return 0;
  }
  public final java.lang.String getName(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("value")
  public final java.lang.String getValue(){
    return (java.lang.String) null;
  }
  public final void setValue(@com.francetelecom.rd.stubs.annotation.FieldSet("value") java.lang.String arg1){
  }
  public final boolean isSupported(java.lang.String arg1, java.lang.String arg2){
    return false;
  }
  public final void normalize(){
  }
  public final org.w3c.dom.NamedNodeMap getAttributes(){
    return (org.w3c.dom.NamedNodeMap) null;
  }
  public final java.lang.String getAttribute(java.lang.String arg1){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("data")
  public final java.lang.String getData() throws org.w3c.dom.DOMException{
    return (java.lang.String) null;
  }
  public final java.lang.String getStringValue() throws org.w3c.dom.DOMException{
    return (java.lang.String) null;
  }
  public final org.apache.xml.dtm.DTM getDTM(){
    return (org.apache.xml.dtm.DTM) null;
  }
  public final org.w3c.dom.DocumentFragment createDocumentFragment(){
    return (org.w3c.dom.DocumentFragment) null;
  }
  public final java.lang.String getLocalName(){
    return (java.lang.String) null;
  }
  public final java.lang.String getTarget(){
    return (java.lang.String) null;
  }
  public final org.w3c.dom.Node getNextSibling(){
    return (org.w3c.dom.Node) null;
  }
  public final void setAttribute(java.lang.String arg1, java.lang.String arg2) throws org.w3c.dom.DOMException{
  }
  public final java.lang.String getNodeName(){
    return (java.lang.String) null;
  }
  public final short getNodeType(){
    return (short) 0;
  }
  public final org.w3c.dom.Node getParentNode(){
    return (org.w3c.dom.Node) null;
  }
  public final org.w3c.dom.Node removeChild(org.w3c.dom.Node arg1) throws org.w3c.dom.DOMException{
    return (org.w3c.dom.Node) null;
  }
  public final org.w3c.dom.Node insertBefore(org.w3c.dom.Node arg1, org.w3c.dom.Node arg2) throws org.w3c.dom.DOMException{
    return (org.w3c.dom.Node) null;
  }
  public final org.w3c.dom.Node appendChild(org.w3c.dom.Node arg1) throws org.w3c.dom.DOMException{
    return (org.w3c.dom.Node) null;
  }
  public final org.w3c.dom.Node getLastChild(){
    return (org.w3c.dom.Node) null;
  }
  public final boolean hasChildNodes(){
    return false;
  }
  public final org.w3c.dom.NodeList getChildNodes(){
    return (org.w3c.dom.NodeList) null;
  }
  public final org.w3c.dom.Node replaceChild(org.w3c.dom.Node arg1, org.w3c.dom.Node arg2) throws org.w3c.dom.DOMException{
    return (org.w3c.dom.Node) null;
  }
  public final org.w3c.dom.Document getOwnerDocument(){
    return (org.w3c.dom.Document) null;
  }
  public final java.lang.String getTagName(){
    return (java.lang.String) null;
  }
  public final org.w3c.dom.Node getPreviousSibling(){
    return (org.w3c.dom.Node) null;
  }
  public final org.w3c.dom.Node getFirstChild(){
    return (org.w3c.dom.Node) null;
  }
  public java.lang.Object getUserData(java.lang.String arg1){
    return (java.lang.Object) null;
  }
  public final org.w3c.dom.Element getOwnerElement(){
    return (org.w3c.dom.Element) null;
  }
  public final java.lang.String getNamespaceURI(){
    return (java.lang.String) null;
  }
  public final org.w3c.dom.Attr getAttributeNode(java.lang.String arg1){
    return (org.w3c.dom.Attr) null;
  }
  public final void setData(@com.francetelecom.rd.stubs.annotation.FieldSet("data") java.lang.String arg1) throws org.w3c.dom.DOMException{
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("nodeValue")
  public final java.lang.String getNodeValue() throws org.w3c.dom.DOMException{
    return (java.lang.String) null;
  }
  public final org.w3c.dom.Element getDocumentElement(){
    return (org.w3c.dom.Element) null;
  }
  public final org.w3c.dom.Element createElementNS(java.lang.String arg1, java.lang.String arg2) throws org.w3c.dom.DOMException{
    return (org.w3c.dom.Element) null;
  }
  public final void setAttributeNS(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws org.w3c.dom.DOMException{
  }
  public final void appendData(java.lang.String arg1) throws org.w3c.dom.DOMException{
  }
  public final org.w3c.dom.Text createTextNode(java.lang.String arg1){
    return (org.w3c.dom.Text) null;
  }
  public final org.w3c.dom.ProcessingInstruction createProcessingInstruction(java.lang.String arg1, java.lang.String arg2) throws org.w3c.dom.DOMException{
    return (org.w3c.dom.ProcessingInstruction) null;
  }
  public final org.w3c.dom.EntityReference createEntityReference(java.lang.String arg1) throws org.w3c.dom.DOMException{
    return (org.w3c.dom.EntityReference) null;
  }
  public final org.w3c.dom.Comment createComment(java.lang.String arg1){
    return (org.w3c.dom.Comment) null;
  }
  public final org.w3c.dom.CDATASection createCDATASection(java.lang.String arg1) throws org.w3c.dom.DOMException{
    return (org.w3c.dom.CDATASection) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("prefix")
  public final java.lang.String getPrefix(){
    return (java.lang.String) null;
  }
  public final org.w3c.dom.NodeList getElementsByTagName(java.lang.String arg1){
    return (org.w3c.dom.NodeList) null;
  }
  public final org.w3c.dom.Attr removeAttributeNode(org.w3c.dom.Attr arg1) throws org.w3c.dom.DOMException{
    return (org.w3c.dom.Attr) null;
  }
  public final org.w3c.dom.Attr setAttributeNode(org.w3c.dom.Attr arg1) throws org.w3c.dom.DOMException{
    return (org.w3c.dom.Attr) null;
  }
  public boolean hasAttribute(java.lang.String arg1){
    return false;
  }
  public boolean hasAttributeNS(java.lang.String arg1, java.lang.String arg2){
    return false;
  }
  public final void removeAttribute(java.lang.String arg1) throws org.w3c.dom.DOMException{
  }
  public boolean hasAttributes(){
    return false;
  }
  public final org.w3c.dom.NodeList getElementsByTagNameNS(java.lang.String arg1, java.lang.String arg2){
    return (org.w3c.dom.NodeList) null;
  }
  public final org.w3c.dom.Attr setAttributeNodeNS(org.w3c.dom.Attr arg1) throws org.w3c.dom.DOMException{
    return (org.w3c.dom.Attr) null;
  }
  public final org.w3c.dom.Attr getAttributeNodeNS(java.lang.String arg1, java.lang.String arg2){
    return (org.w3c.dom.Attr) null;
  }
  public final void removeAttributeNS(java.lang.String arg1, java.lang.String arg2) throws org.w3c.dom.DOMException{
  }
  public final java.lang.String getAttributeNS(java.lang.String arg1, java.lang.String arg2){
    return (java.lang.String) null;
  }
  public final org.w3c.dom.Node cloneNode(boolean arg1){
    return (org.w3c.dom.Node) null;
  }
  public final void setNodeValue(@com.francetelecom.rd.stubs.annotation.FieldSet("nodeValue") java.lang.String arg1) throws org.w3c.dom.DOMException{
  }
  public final boolean getSpecified(){
    return false;
  }
  public final void setPrefix(@com.francetelecom.rd.stubs.annotation.FieldSet("prefix") java.lang.String arg1) throws org.w3c.dom.DOMException{
  }
  public final org.w3c.dom.DocumentType getDoctype(){
    return (org.w3c.dom.DocumentType) null;
  }
  public final org.w3c.dom.DOMImplementation getImplementation(){
    return (org.w3c.dom.DOMImplementation) null;
  }
  public final org.w3c.dom.Element createElement(java.lang.String arg1) throws org.w3c.dom.DOMException{
    return (org.w3c.dom.Element) null;
  }
  public final org.w3c.dom.Attr createAttribute(java.lang.String arg1) throws org.w3c.dom.DOMException{
    return (org.w3c.dom.Attr) null;
  }
  public final org.w3c.dom.Node importNode(org.w3c.dom.Node arg1, boolean arg2) throws org.w3c.dom.DOMException{
    return (org.w3c.dom.Node) null;
  }
  public final org.w3c.dom.Attr createAttributeNS(java.lang.String arg1, java.lang.String arg2) throws org.w3c.dom.DOMException{
    return (org.w3c.dom.Attr) null;
  }
  public final org.w3c.dom.Element getElementById(java.lang.String arg1){
    return (org.w3c.dom.Element) null;
  }
  public final java.lang.String substringData(int arg1, int arg2) throws org.w3c.dom.DOMException{
    return (java.lang.String) null;
  }
  public final void insertData(int arg1, java.lang.String arg2) throws org.w3c.dom.DOMException{
  }
  public final void deleteData(int arg1, int arg2) throws org.w3c.dom.DOMException{
  }
  public final void replaceData(int arg1, int arg2, java.lang.String arg3) throws org.w3c.dom.DOMException{
  }
  public final org.w3c.dom.Text splitText(int arg1) throws org.w3c.dom.DOMException{
    return (org.w3c.dom.Text) null;
  }
  public org.w3c.dom.Node adoptNode(org.w3c.dom.Node arg1) throws org.w3c.dom.DOMException{
    return (org.w3c.dom.Node) null;
  }
  public java.lang.String getInputEncoding(){
    return (java.lang.String) null;
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
  public void setDocumentURI(@com.francetelecom.rd.stubs.annotation.FieldSet("documentURI") java.lang.String arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("documentURI")
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
  public boolean isElementContentWhitespace(){
    return false;
  }
  public final int getDTMNodeNumber(){
    return 0;
  }
  public final boolean sameNodeAs(org.w3c.dom.Node arg1){
    return false;
  }
  public final boolean supports(java.lang.String arg1, java.lang.String arg2){
    return false;
  }
  public final org.w3c.dom.Node getOwnerNode(){
    return (org.w3c.dom.Node) null;
  }
}
