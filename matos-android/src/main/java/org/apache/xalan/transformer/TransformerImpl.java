package org.apache.xalan.transformer;

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


public class TransformerImpl
  extends javax.xml.transform.Transformer  implements org.apache.xml.serializer.SerializerTrace, org.apache.xml.dtm.DTMWSFilter, org.apache.xpath.ExtensionsProvider, java.lang.Runnable
{
  // Constructors

  public TransformerImpl(org.apache.xalan.templates.StylesheetRoot arg1){
    super();
  }
  // Methods

  public void run(){
  }
  public void transform(javax.xml.transform.Source arg1) throws javax.xml.transform.TransformerException{
  }
  public void transform(javax.xml.transform.Source arg1, boolean arg2) throws javax.xml.transform.TransformerException{
  }
  public void transform(javax.xml.transform.Source arg1, javax.xml.transform.Result arg2) throws javax.xml.transform.TransformerException{
  }
  public void transform(javax.xml.transform.Source arg1, javax.xml.transform.Result arg2, boolean arg3) throws javax.xml.transform.TransformerException{
  }
  public void init(org.apache.xml.serializer.ToXMLSAXHandler arg1, javax.xml.transform.Transformer arg2, @com.francetelecom.rd.stubs.annotation.CallBackRegister("handle") org.xml.sax.ContentHandler arg3){
  }
  public void reset(){
  }
  public org.xml.sax.ContentHandler getContentHandler(){
    return (org.xml.sax.ContentHandler) null;
  }
  public java.lang.Object getParameter(java.lang.String arg1){
    return (java.lang.Object) null;
  }
  public void setParameter(java.lang.String arg1, java.lang.String arg2, java.lang.Object arg3){
  }
  public void setParameter(java.lang.String arg1, java.lang.Object arg2){
  }
  public boolean getIncremental(){
    return false;
  }
  public boolean getSource_location(){
    return false;
  }
  public int getCurrentNode(){
    return 0;
  }
  public final org.apache.xpath.XPathContext getXPathContext(){
    return (org.apache.xpath.XPathContext) null;
  }
  public final org.apache.xalan.templates.StylesheetRoot getStylesheet(){
    return (org.apache.xalan.templates.StylesheetRoot) null;
  }
  public boolean getFeature(java.lang.String arg1) throws org.xml.sax.SAXNotRecognizedException, org.xml.sax.SAXNotSupportedException{
    return false;
  }
  public org.apache.xalan.templates.OutputProperties getOutputFormat(){
    return (org.apache.xalan.templates.OutputProperties) null;
  }
  public void setContentHandler(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handle") org.xml.sax.ContentHandler arg1){
  }
  public void setParameters(java.util.Properties arg1){
  }
  public javax.xml.transform.Transformer getTransformer(){
    return (javax.xml.transform.Transformer) null;
  }
  public java.lang.String getOutputProperty(java.lang.String arg1) throws java.lang.IllegalArgumentException{
    return (java.lang.String) null;
  }
  public void setOutputProperty(java.lang.String arg1, java.lang.String arg2) throws java.lang.IllegalArgumentException{
  }
  public void setOutputFormat(org.apache.xalan.templates.OutputProperties arg1){
  }
  public org.apache.xml.utils.QName getMode(){
    return (org.apache.xml.utils.QName) null;
  }
  public javax.xml.transform.ErrorListener getErrorListener(){
    return (javax.xml.transform.ErrorListener) null;
  }
  public void setURIResolver(javax.xml.transform.URIResolver arg1){
  }
  public javax.xml.transform.URIResolver getURIResolver(){
    return (javax.xml.transform.URIResolver) null;
  }
  public void setErrorListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("ErrorListener") javax.xml.transform.ErrorListener arg1) throws java.lang.IllegalArgumentException{
  }
  public void clearParameters(){
  }
  public org.apache.xalan.templates.ElemTemplateElement getCurrentElement(){
    return (org.apache.xalan.templates.ElemTemplateElement) null;
  }
  public org.apache.xalan.templates.ElemTemplate getCurrentTemplate(){
    return (org.apache.xalan.templates.ElemTemplate) null;
  }
  public org.apache.xalan.templates.ElemTemplate getMatchedTemplate(){
    return (org.apache.xalan.templates.ElemTemplate) null;
  }
  public int getMatchedNode(){
    return 0;
  }
  public org.apache.xml.dtm.DTMIterator getContextNodeList(){
    return (org.apache.xml.dtm.DTMIterator) null;
  }
  public void setSerializationHandler(@com.francetelecom.rd.stubs.annotation.CallBackRegister("serializationHandler") org.apache.xml.serializer.SerializationHandler arg1){
  }
  public boolean getOptimize(){
    return false;
  }
  public java.lang.Object extFunction(java.lang.String arg1, java.lang.String arg2, java.util.Vector arg3, java.lang.Object arg4) throws javax.xml.transform.TransformerException{
    return (java.lang.Object) null;
  }
  public java.lang.Object extFunction(org.apache.xpath.functions.FuncExtFunction arg1, java.util.Vector arg2) throws javax.xml.transform.TransformerException{
    return (java.lang.Object) null;
  }
  public boolean functionAvailable(java.lang.String arg1, java.lang.String arg2) throws javax.xml.transform.TransformerException{
    return false;
  }
  public boolean elementAvailable(java.lang.String arg1, java.lang.String arg2) throws javax.xml.transform.TransformerException{
    return false;
  }
  public void setStylesheet(org.apache.xalan.templates.StylesheetRoot arg1){
  }
  public short getShouldStripSpace(int arg1, org.apache.xml.dtm.DTM arg2){
    return (short) 0;
  }
  public KeyManager getKeyManager(){
    return (KeyManager) null;
  }
  public java.util.Properties getOutputProperties(){
    return (java.util.Properties) null;
  }
  public java.lang.String transformToString(org.apache.xalan.templates.ElemTemplateElement arg1) throws javax.xml.transform.TransformerException{
    return (java.lang.String) null;
  }
  public MsgMgr getMsgMgr(){
    return (MsgMgr) null;
  }
  public org.apache.xml.serializer.SerializationHandler getResultTreeHandler(){
    return (org.apache.xml.serializer.SerializationHandler) null;
  }
  public void pushElemTemplateElement(org.apache.xalan.templates.ElemTemplateElement arg1){
  }
  public void popElemTemplateElement(){
  }
  public void pushCurrentTemplateRuleIsNull(boolean arg1){
  }
  public void popCurrentTemplateRuleIsNull(){
  }
  public java.util.Vector processSortKeys(org.apache.xalan.templates.ElemForEach arg1, int arg2) throws javax.xml.transform.TransformerException{
    return (java.util.Vector) null;
  }
  public void setCurrentElement(org.apache.xalan.templates.ElemTemplateElement arg1){
  }
  public void fireGenerateEvent(int arg1, char [] arg2, int arg3, int arg4){
  }
  public void fireGenerateEvent(int arg1, java.lang.String arg2, org.xml.sax.Attributes arg3){
  }
  public void fireGenerateEvent(int arg1, java.lang.String arg2, java.lang.String arg3){
  }
  public void fireGenerateEvent(int arg1, java.lang.String arg2){
  }
  public void fireGenerateEvent(int arg1){
  }
  public boolean hasTraceListeners(){
    return false;
  }
  public int transformToGlobalRTF(org.apache.xalan.templates.ElemTemplateElement arg1) throws javax.xml.transform.TransformerException{
    return 0;
  }
  public int transformToRTF(org.apache.xalan.templates.ElemTemplateElement arg1) throws javax.xml.transform.TransformerException{
    return 0;
  }
  public org.xml.sax.ContentHandler getInputContentHandler(){
    return (org.xml.sax.ContentHandler) null;
  }
  public org.xml.sax.ContentHandler getInputContentHandler(boolean arg1){
    return (org.xml.sax.ContentHandler) null;
  }
  public void pushMode(org.apache.xml.utils.QName arg1){
  }
  public void popMode(){
  }
  public org.apache.xml.serializer.SerializationHandler getSerializationHandler(){
    return (org.apache.xml.serializer.SerializationHandler) null;
  }
  public boolean getQuietConflictWarnings(){
    return false;
  }
  public void pushPairCurrentMatched(org.apache.xalan.templates.ElemTemplateElement arg1, int arg2){
  }
  public void popCurrentMatched(){
  }
  public boolean currentFuncResultSeen(){
    return false;
  }
  public java.lang.Object popCurrentFuncResult(){
    return (java.lang.Object) null;
  }
  public void pushCurrentFuncResult(java.lang.Object arg1){
  }
  public void executeChildTemplates(org.apache.xalan.templates.ElemTemplateElement arg1, org.w3c.dom.Node arg2, org.apache.xml.utils.QName arg3, @com.francetelecom.rd.stubs.annotation.CallBackRegister("handle") org.xml.sax.ContentHandler arg4) throws javax.xml.transform.TransformerException{
  }
  public void executeChildTemplates(org.apache.xalan.templates.ElemTemplateElement arg1, boolean arg2) throws javax.xml.transform.TransformerException{
  }
  public void executeChildTemplates(org.apache.xalan.templates.ElemTemplateElement arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("handle") org.xml.sax.ContentHandler arg2) throws javax.xml.transform.TransformerException{
  }
  public java.lang.String getOutputPropertyNoDefault(java.lang.String arg1) throws java.lang.IllegalArgumentException{
    return (java.lang.String) null;
  }
  public boolean isRecursiveAttrSet(org.apache.xalan.templates.ElemAttributeSet arg1){
    return false;
  }
  public void pushElemAttributeSet(org.apache.xalan.templates.ElemAttributeSet arg1){
  }
  public void popElemAttributeSet(){
  }
  public org.apache.xalan.extensions.ExtensionsTable getExtensionsTable(){
    return (org.apache.xalan.extensions.ExtensionsTable) null;
  }
  public java.lang.Exception getExceptionThrown(){
    return (java.lang.Exception) null;
  }
  public void setExceptionThrown(java.lang.Exception arg1){
  }
  public org.apache.xml.serializer.SerializationHandler createSerializationHandler(javax.xml.transform.Result arg1) throws javax.xml.transform.TransformerException{
    return (org.apache.xml.serializer.SerializationHandler) null;
  }
  public org.apache.xml.serializer.SerializationHandler createSerializationHandler(javax.xml.transform.Result arg1, org.apache.xalan.templates.OutputProperties arg2) throws javax.xml.transform.TransformerException{
    return (org.apache.xml.serializer.SerializationHandler) null;
  }
  public void setSourceTreeDocForThread(int arg1){
  }
  public void runTransformThread(int arg1){
  }
  public void runTransformThread(){
  }
  public static void runTransformThread(java.lang.Runnable arg1){
  }
  public void waitTransformThread() throws org.xml.sax.SAXException{
  }
  public java.lang.Thread getTransformThread(){
    return (java.lang.Thread) null;
  }
  public void setTransformThread(java.lang.Thread arg1){
  }
  public boolean hasTransformThreadErrorCatcher(){
    return false;
  }
  public void setBaseURLOfSource(java.lang.String arg1){
  }
  public void setOutputProperties(java.util.Properties arg1) throws java.lang.IllegalArgumentException{
  }
  public void transformNode(int arg1, javax.xml.transform.Result arg2) throws javax.xml.transform.TransformerException{
  }
  public void transformNode(int arg1) throws javax.xml.transform.TransformerException{
  }
  protected void pushGlobalVars(int arg1) throws javax.xml.transform.TransformerException{
  }
  public boolean applyTemplateToNode(org.apache.xalan.templates.ElemTemplateElement arg1, org.apache.xalan.templates.ElemTemplate arg2, int arg3) throws javax.xml.transform.TransformerException{
    return false;
  }
  public int getCurrentTemplateElementsCount(){
    return 0;
  }
  public org.apache.xml.utils.ObjectStack getCurrentTemplateElements(){
    return (org.apache.xml.utils.ObjectStack) null;
  }
  public void setXPathContext(org.apache.xpath.XPathContext arg1){
  }
  public CountersTable getCountersTable(){
    return (CountersTable) null;
  }
  public boolean currentTemplateRuleIsNull(){
    return false;
  }
}
