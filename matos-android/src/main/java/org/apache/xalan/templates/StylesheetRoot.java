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


public class StylesheetRoot
  extends StylesheetComposed  implements javax.xml.transform.Templates, java.io.Serializable
{
  // Constructors

  public StylesheetRoot(@com.francetelecom.rd.stubs.annotation.CallBackRegister("ErrorListener") javax.xml.transform.ErrorListener arg1) throws javax.xml.transform.TransformerConfigurationException{
    super((Stylesheet) null);
  }
  public StylesheetRoot(org.apache.xalan.processor.XSLTSchema arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("ErrorListener") javax.xml.transform.ErrorListener arg2) throws javax.xml.transform.TransformerConfigurationException{
    super((Stylesheet) null);
  }
  // Methods

  public boolean getIncremental(){
    return false;
  }
  public void setIncremental(boolean arg1){
  }
  public boolean getSource_location(){
    return false;
  }
  public void setSource_location(boolean arg1){
  }
  public void recompose() throws javax.xml.transform.TransformerException{
  }
  public boolean shouldStripWhiteSpace(org.apache.xpath.XPathContext arg1, int arg2) throws javax.xml.transform.TransformerException{
    return false;
  }
  public boolean canStripWhiteSpace(){
    return false;
  }
  public javax.xml.transform.Transformer newTransformer(){
    return (javax.xml.transform.Transformer) null;
  }
  public boolean isSecureProcessing(){
    return false;
  }
  public java.util.Vector getExtensions(){
    return (java.util.Vector) null;
  }
  public java.util.Properties getOutputProperties(){
    return (java.util.Properties) null;
  }
  public void setSecureProcessing(boolean arg1){
  }
  public boolean isRoot(){
    return false;
  }
  public NamespaceAlias getNamespaceAliasComposed(java.lang.String arg1){
    return (NamespaceAlias) null;
  }
  public ElemTemplate getTemplateComposed(org.apache.xpath.XPathContext arg1, int arg2, org.apache.xml.utils.QName arg3, boolean arg4, org.apache.xml.dtm.DTM arg5) throws javax.xml.transform.TransformerException{
    return (ElemTemplate) null;
  }
  public ElemTemplate getTemplateComposed(org.apache.xpath.XPathContext arg1, int arg2, org.apache.xml.utils.QName arg3, int arg4, int arg5, boolean arg6, org.apache.xml.dtm.DTM arg7) throws javax.xml.transform.TransformerException{
    return (ElemTemplate) null;
  }
  public ElemTemplate getTemplateComposed(org.apache.xml.utils.QName arg1){
    return (ElemTemplate) null;
  }
  public boolean getOptimizer(){
    return false;
  }
  public final TemplateList getTemplateListComposed(){
    return (TemplateList) null;
  }
  public final ElemTemplate getDefaultRule(){
    return (ElemTemplate) null;
  }
  public final ElemTemplate getDefaultTextRule(){
    return (ElemTemplate) null;
  }
  public final ElemTemplate getDefaultRootRule(){
    return (ElemTemplate) null;
  }
  public void setOptimizer(boolean arg1){
  }
  public java.util.ArrayList getAttributeSetComposed(org.apache.xml.utils.QName arg1) throws java.lang.ArrayIndexOutOfBoundsException{
    return (java.util.ArrayList) null;
  }
  public org.apache.xalan.extensions.ExtensionNamespacesManager getExtensionNamespacesManager(){
    return (org.apache.xalan.extensions.ExtensionNamespacesManager) null;
  }
  public int getGlobalImportCount(){
    return 0;
  }
  public StylesheetComposed getGlobalImport(int arg1){
    return (StylesheetComposed) null;
  }
  public java.text.DecimalFormatSymbols getDecimalFormatComposed(org.apache.xml.utils.QName arg1){
    return (java.text.DecimalFormatSymbols) null;
  }
  public ElemVariable getVariableOrParamComposed(org.apache.xml.utils.QName arg1){
    return (ElemVariable) null;
  }
  public java.lang.String getExtensionHandlerClass(){
    return (java.lang.String) null;
  }
  public OutputProperties getOutputComposed(){
    return (OutputProperties) null;
  }
  public java.util.Vector getVariablesAndParamsComposed(){
    return (java.util.Vector) null;
  }
  public WhiteSpaceInfo getWhiteSpaceInfo(org.apache.xpath.XPathContext arg1, int arg2, org.apache.xml.dtm.DTM arg3) throws javax.xml.transform.TransformerException{
    return (WhiteSpaceInfo) null;
  }
  public java.util.HashMap getAvailableElements(){
    return (java.util.HashMap) null;
  }
  public java.util.Properties getDefaultOutputProps(){
    return (java.util.Properties) null;
  }
  protected void addImports(Stylesheet arg1, boolean arg2, java.util.Vector arg3){
  }
  public int getImportNumber(StylesheetComposed arg1){
    return 0;
  }
  public boolean isOutputMethodSet(){
    return false;
  }
  public java.util.Vector getKeysComposed(){
    return (java.util.Vector) null;
  }
  public final void setTemplateListComposed(TemplateList arg1){
  }
  public boolean shouldCheckWhitespace(){
    return false;
  }
  public final ElemTemplate getStartRule(){
    return (ElemTemplate) null;
  }
  public java.lang.String setExtensionHandlerClass(java.lang.String arg1){
    return (java.lang.String) null;
  }
}
