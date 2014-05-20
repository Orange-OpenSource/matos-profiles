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


public class Stylesheet
  extends ElemTemplateElement  implements java.io.Serializable
{
  // Fields

  public static final java.lang.String STYLESHEET_EXT = ".lxc";

  // Constructors

  public Stylesheet(Stylesheet arg1){
    super();
  }
  // Methods

  public KeyDeclaration getKey(int arg1) throws java.lang.ArrayIndexOutOfBoundsException{
    return (KeyDeclaration) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("id")
  public java.lang.String getId(){
    return (java.lang.String) null;
  }
  protected boolean accept(@com.francetelecom.rd.stubs.annotation.CallBackRegister("XSLTVisitor") XSLTVisitor arg1){
    return false;
  }
  public void setVersion(@com.francetelecom.rd.stubs.annotation.FieldSet("version") java.lang.String arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("version")
  public java.lang.String getVersion(){
    return (java.lang.String) null;
  }
  public void setId(@com.francetelecom.rd.stubs.annotation.FieldSet("id") java.lang.String arg1){
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
  public StylesheetComposed getStylesheetComposed(){
    return (StylesheetComposed) null;
  }
  public Stylesheet getStylesheet(){
    return (Stylesheet) null;
  }
  public StylesheetRoot getStylesheetRoot(){
    return (StylesheetRoot) null;
  }
  public void setLocaterInfo(javax.xml.transform.SourceLocator arg1){
  }
  public boolean containsExcludeResultPrefix(java.lang.String arg1, java.lang.String arg2){
    return false;
  }
  protected void callChildVisitors(@com.francetelecom.rd.stubs.annotation.CallBackRegister("XSLTVisitor") XSLTVisitor arg1, boolean arg2){
  }
  public void setKey(KeyDeclaration arg1){
  }
  public OutputProperties getOutput(int arg1) throws java.lang.ArrayIndexOutOfBoundsException{
    return (OutputProperties) null;
  }
  public void setOutput(OutputProperties arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("href")
  public java.lang.String getHref(){
    return (java.lang.String) null;
  }
  public void setHref(@com.francetelecom.rd.stubs.annotation.FieldSet("href") java.lang.String arg1){
  }
  public boolean containsExtensionElementURI(java.lang.String arg1){
    return false;
  }
  public void setExtensionElementPrefixes(org.apache.xml.utils.StringVector arg1){
  }
  public java.lang.String getExtensionElementPrefix(int arg1) throws java.lang.ArrayIndexOutOfBoundsException{
    return (java.lang.String) null;
  }
  public int getExtensionElementPrefixCount(){
    return 0;
  }
  public void setExcludeResultPrefixes(org.apache.xml.utils.StringVector arg1){
  }
  public ElemParam getParam(org.apache.xml.utils.QName arg1){
    return (ElemParam) null;
  }
  public boolean isRoot(){
    return false;
  }
  public void setDecimalFormat(DecimalFormatProperties arg1){
  }
  public boolean getCompatibleMode(){
    return false;
  }
  public void setTemplate(ElemTemplate arg1){
  }
  public void setAttributeSet(ElemAttributeSet arg1){
  }
  public DecimalFormatProperties getDecimalFormat(org.apache.xml.utils.QName arg1){
    return (DecimalFormatProperties) null;
  }
  public DecimalFormatProperties getDecimalFormat(int arg1) throws java.lang.ArrayIndexOutOfBoundsException{
    return (DecimalFormatProperties) null;
  }
  public void setParam(ElemParam arg1){
  }
  public boolean isAggregatedType(){
    return false;
  }
  public void setXmlnsXsl(@com.francetelecom.rd.stubs.annotation.FieldSet("xmlnsXsl") java.lang.String arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("xmlnsXsl")
  public java.lang.String getXmlnsXsl(){
    return (java.lang.String) null;
  }
  public java.lang.String getExcludeResultPrefix(int arg1) throws java.lang.ArrayIndexOutOfBoundsException{
    return (java.lang.String) null;
  }
  public int getExcludeResultPrefixCount(){
    return 0;
  }
  public void setImport(StylesheetComposed arg1){
  }
  public StylesheetComposed getImport(int arg1) throws java.lang.ArrayIndexOutOfBoundsException{
    return (StylesheetComposed) null;
  }
  public int getImportCount(){
    return 0;
  }
  public void setInclude(Stylesheet arg1){
  }
  public Stylesheet getInclude(int arg1) throws java.lang.ArrayIndexOutOfBoundsException{
    return (Stylesheet) null;
  }
  public int getIncludeCount(){
    return 0;
  }
  public int getDecimalFormatCount(){
    return 0;
  }
  public void setStripSpaces(WhiteSpaceInfo arg1){
  }
  public WhiteSpaceInfo getStripSpace(int arg1) throws java.lang.ArrayIndexOutOfBoundsException{
    return (WhiteSpaceInfo) null;
  }
  public int getStripSpaceCount(){
    return 0;
  }
  public void setPreserveSpaces(WhiteSpaceInfo arg1){
  }
  public WhiteSpaceInfo getPreserveSpace(int arg1) throws java.lang.ArrayIndexOutOfBoundsException{
    return (WhiteSpaceInfo) null;
  }
  public int getPreserveSpaceCount(){
    return 0;
  }
  public int getOutputCount(){
    return 0;
  }
  public int getKeyCount(){
    return 0;
  }
  public ElemAttributeSet getAttributeSet(int arg1) throws java.lang.ArrayIndexOutOfBoundsException{
    return (ElemAttributeSet) null;
  }
  public int getAttributeSetCount(){
    return 0;
  }
  public void setVariable(ElemVariable arg1){
  }
  public ElemVariable getVariableOrParam(org.apache.xml.utils.QName arg1){
    return (ElemVariable) null;
  }
  public ElemVariable getVariableOrParam(int arg1) throws java.lang.ArrayIndexOutOfBoundsException{
    return (ElemVariable) null;
  }
  public ElemVariable getVariable(org.apache.xml.utils.QName arg1){
    return (ElemVariable) null;
  }
  public int getVariableOrParamCount(){
    return 0;
  }
  public ElemTemplate getTemplate(int arg1) throws javax.xml.transform.TransformerException{
    return (ElemTemplate) null;
  }
  public int getTemplateCount(){
    return 0;
  }
  public void setNamespaceAlias(NamespaceAlias arg1){
  }
  public NamespaceAlias getNamespaceAlias(int arg1) throws java.lang.ArrayIndexOutOfBoundsException{
    return (NamespaceAlias) null;
  }
  public int getNamespaceAliasCount(){
    return 0;
  }
  public void setNonXslTopLevel(org.apache.xml.utils.QName arg1, java.lang.Object arg2){
  }
  public java.lang.Object getNonXslTopLevel(org.apache.xml.utils.QName arg1){
    return (java.lang.Object) null;
  }
  public void setStylesheetRoot(StylesheetRoot arg1){
  }
  public Stylesheet getStylesheetParent(){
    return (Stylesheet) null;
  }
  public void setStylesheetParent(Stylesheet arg1){
  }
  public void replaceTemplate(ElemTemplate arg1, int arg2) throws javax.xml.transform.TransformerException{
  }
}
