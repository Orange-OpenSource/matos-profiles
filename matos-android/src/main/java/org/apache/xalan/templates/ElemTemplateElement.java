package org.apache.xalan.templates;

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


public class ElemTemplateElement
  extends org.apache.xml.utils.UnImplNode  implements org.apache.xpath.WhitespaceStrippingElementMatcher, org.apache.xpath.ExpressionNode, org.apache.xml.utils.PrefixResolver, XSLTVisitable, java.io.Serializable
{
  // Fields

  protected boolean m_hasVariableDecl;

  protected int m_docOrderNumber;

  protected ElemTemplateElement m_parentNode;

  // Constructors

  public ElemTemplateElement(){
    super();
  }
  // Methods

  public int getLength(){
    return 0;
  }
  public int compareTo(java.lang.Object arg1) throws java.lang.ClassCastException{
    return 0;
  }
  public int getLineNumber(){
    return 0;
  }
  protected boolean accept(@com.francetelecom.rd.stubs.annotation.CallBackRegister("XSLTVisitor") XSLTVisitor arg1){
    return false;
  }
  public void error(java.lang.String arg1, java.lang.Object [] arg2){
  }
  public void error(java.lang.String arg1){
  }
  public void execute(org.apache.xalan.transformer.TransformerImpl arg1) throws javax.xml.transform.TransformerException{
  }
  public void callVisitors(@com.francetelecom.rd.stubs.annotation.CallBackRegister("XSLTVisitor") XSLTVisitor arg1){
  }
  public void exprSetParent(org.apache.xpath.ExpressionNode arg1){
  }
  public org.apache.xpath.ExpressionNode exprGetParent(){
    return (org.apache.xpath.ExpressionNode) null;
  }
  public void exprAddChild(org.apache.xpath.ExpressionNode arg1, int arg2){
  }
  public org.apache.xpath.ExpressionNode exprGetChild(int arg1){
    return (org.apache.xpath.ExpressionNode) null;
  }
  public int exprGetNumChildren(){
    return 0;
  }
  public java.lang.String getPublicId(){
    return (java.lang.String) null;
  }
  public java.lang.String getSystemId(){
    return (java.lang.String) null;
  }
  public int getColumnNumber(){
    return 0;
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
  public java.lang.String getNodeName(){
    return (java.lang.String) null;
  }
  public int getXSLToken(){
    return 0;
  }
  public short getNodeType(){
    return (short) 0;
  }
  public org.w3c.dom.Node getParentNode(){
    return (org.w3c.dom.Node) null;
  }
  public ElemTemplateElement removeChild(ElemTemplateElement arg1){
    return (ElemTemplateElement) null;
  }
  public org.w3c.dom.Node insertBefore(org.w3c.dom.Node arg1, org.w3c.dom.Node arg2) throws org.w3c.dom.DOMException{
    return (org.w3c.dom.Node) null;
  }
  public org.w3c.dom.Node appendChild(org.w3c.dom.Node arg1) throws org.w3c.dom.DOMException{
    return (org.w3c.dom.Node) null;
  }
  public ElemTemplateElement appendChild(ElemTemplateElement arg1){
    return (ElemTemplateElement) null;
  }
  public org.w3c.dom.Node getLastChild(){
    return (org.w3c.dom.Node) null;
  }
  public boolean isCompiledTemplate(){
    return false;
  }
  public void runtimeInit(org.apache.xalan.transformer.TransformerImpl arg1) throws javax.xml.transform.TransformerException{
  }
  public StylesheetComposed getStylesheetComposed(){
    return (StylesheetComposed) null;
  }
  public Stylesheet getStylesheet(){
    return (Stylesheet) null;
  }
  public StylesheetRoot getStylesheetRoot(){
    return (StylesheetRoot) null;
  }
  public void recompose(StylesheetRoot arg1) throws javax.xml.transform.TransformerException{
  }
  public void compose(StylesheetRoot arg1) throws javax.xml.transform.TransformerException{
  }
  public void endCompose(StylesheetRoot arg1) throws javax.xml.transform.TransformerException{
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
  public ElemTemplateElement replaceChild(ElemTemplateElement arg1, ElemTemplateElement arg2){
    return (ElemTemplateElement) null;
  }
  public org.w3c.dom.Document getOwnerDocument(){
    return (org.w3c.dom.Document) null;
  }
  public ElemTemplate getOwnerXSLTemplate(){
    return (ElemTemplate) null;
  }
  public java.lang.String getTagName(){
    return (java.lang.String) null;
  }
  public boolean hasTextLitOnly(){
    return false;
  }
  public java.lang.String getBaseIdentifier(){
    return (java.lang.String) null;
  }
  public int getEndLineNumber(){
    return 0;
  }
  public int getEndColumnNumber(){
    return 0;
  }
  public void setLocaterInfo(javax.xml.transform.SourceLocator arg1){
  }
  public void setEndLocaterInfo(javax.xml.transform.SourceLocator arg1){
  }
  public boolean hasVariableDecl(){
    return false;
  }
  public void setXmlSpace(int arg1){
  }
  public boolean getXmlSpace(){
    return false;
  }
  public java.util.List getDeclaredPrefixes(){
    return (java.util.List) null;
  }
  public void setPrefixes(org.xml.sax.helpers.NamespaceSupport arg1) throws javax.xml.transform.TransformerException{
  }
  public void setPrefixes(org.xml.sax.helpers.NamespaceSupport arg1, boolean arg2) throws javax.xml.transform.TransformerException{
  }
  public java.lang.String getNamespaceForPrefix(java.lang.String arg1, org.w3c.dom.Node arg2){
    return (java.lang.String) null;
  }
  public java.lang.String getNamespaceForPrefix(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public boolean containsExcludeResultPrefix(java.lang.String arg1, java.lang.String arg2){
    return false;
  }
  public void resolvePrefixTables() throws javax.xml.transform.TransformerException{
  }
  public void setUid(int arg1){
  }
  public int getUid(){
    return 0;
  }
  public ElemTemplateElement getParentElem(){
    return (ElemTemplateElement) null;
  }
  public void setParentElem(ElemTemplateElement arg1){
  }
  public org.w3c.dom.Node getPreviousSibling(){
    return (org.w3c.dom.Node) null;
  }
  public ElemTemplateElement getPreviousSiblingElem(){
    return (ElemTemplateElement) null;
  }
  public ElemTemplateElement getNextSiblingElem(){
    return (ElemTemplateElement) null;
  }
  public ElemTemplateElement getParentNodeElem(){
    return (ElemTemplateElement) null;
  }
  public org.w3c.dom.Node getFirstChild(){
    return (org.w3c.dom.Node) null;
  }
  public ElemTemplateElement getFirstChildElem(){
    return (ElemTemplateElement) null;
  }
  public ElemTemplateElement getLastChildElem(){
    return (ElemTemplateElement) null;
  }
  public org.w3c.dom.Node getDOMBackPointer(){
    return (org.w3c.dom.Node) null;
  }
  public void setDOMBackPointer(org.w3c.dom.Node arg1){
  }
  public boolean shouldStripWhiteSpace(org.apache.xpath.XPathContext arg1, org.w3c.dom.Element arg2) throws javax.xml.transform.TransformerException{
    return false;
  }
  public boolean canStripWhiteSpace(){
    return false;
  }
  public boolean canAcceptVariables(){
    return false;
  }
  protected void callChildVisitors(@com.francetelecom.rd.stubs.annotation.CallBackRegister("XSLTVisitor") XSLTVisitor arg1, boolean arg2){
  }
  protected void callChildVisitors(@com.francetelecom.rd.stubs.annotation.CallBackRegister("XSLTVisitor") XSLTVisitor arg1){
  }
  public boolean handlesNullPrefixes(){
    return false;
  }
}
