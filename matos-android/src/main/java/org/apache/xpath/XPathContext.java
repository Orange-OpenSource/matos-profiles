package org.apache.xpath;

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


public class XPathContext
  extends org.apache.xml.dtm.DTMManager{
  // Classes

  public class XPathExpressionContext
    implements org.apache.xalan.extensions.ExpressionContext
  {
    // Fields

    // Constructors

    public XPathExpressionContext(){
    }
    // Methods

    public java.lang.String toString(org.w3c.dom.Node arg1){
      return (java.lang.String) null;
    }
    public org.apache.xml.dtm.DTMManager getDTMManager(){
      return (org.apache.xml.dtm.DTMManager) null;
    }
    public XPathContext getXPathContext(){
      return (XPathContext) null;
    }
    public javax.xml.transform.ErrorListener getErrorListener(){
      return (javax.xml.transform.ErrorListener) null;
    }
    public org.w3c.dom.Node getContextNode(){
      return (org.w3c.dom.Node) null;
    }
    public org.w3c.dom.traversal.NodeIterator getContextNodes(){
      return (org.w3c.dom.traversal.NodeIterator) null;
    }
    public final org.apache.xpath.objects.XObject getVariableOrParam(org.apache.xml.utils.QName arg1) throws javax.xml.transform.TransformerException{
      return (org.apache.xpath.objects.XObject) null;
    }
    public double toNumber(org.w3c.dom.Node arg1){
      return 0.0d;
    }
  }
  // Fields

  protected org.apache.xml.dtm.DTMManager m_dtmManager;

  public org.xml.sax.XMLReader m_primaryReader;

  public static final int RECURSIONLIMIT = 4096;

  // Constructors

  public XPathContext(){
    super();
  }
  public XPathContext(boolean arg1){
    super();
  }
  public XPathContext(java.lang.Object arg1){
    super();
  }
  public XPathContext(java.lang.Object arg1, boolean arg2){
    super();
  }
  // Methods

  public void reset(){
  }
  public boolean release(org.apache.xml.dtm.DTM arg1, boolean arg2){
    return false;
  }
  public final void setNamespaceContext(org.apache.xml.utils.PrefixResolver arg1){
  }
  public final org.apache.xml.utils.PrefixResolver getNamespaceContext(){
    return (org.apache.xml.utils.PrefixResolver) null;
  }
  public org.apache.xml.dtm.DTM getDTM(javax.xml.transform.Source arg1, boolean arg2, org.apache.xml.dtm.DTMWSFilter arg3, boolean arg4, boolean arg5){
    return (org.apache.xml.dtm.DTM) null;
  }
  public org.apache.xml.dtm.DTM getDTM(int arg1){
    return (org.apache.xml.dtm.DTM) null;
  }
  public int getDTMHandleFromNode(org.w3c.dom.Node arg1){
    return 0;
  }
  public int getDTMIdentity(org.apache.xml.dtm.DTM arg1){
    return 0;
  }
  public org.apache.xml.dtm.DTM createDocumentFragment(){
    return (org.apache.xml.dtm.DTM) null;
  }
  public org.apache.xml.dtm.DTMIterator createDTMIterator(java.lang.Object arg1, int arg2){
    return (org.apache.xml.dtm.DTMIterator) null;
  }
  public org.apache.xml.dtm.DTMIterator createDTMIterator(java.lang.String arg1, org.apache.xml.utils.PrefixResolver arg2){
    return (org.apache.xml.dtm.DTMIterator) null;
  }
  public org.apache.xml.dtm.DTMIterator createDTMIterator(int arg1, org.apache.xml.dtm.DTMFilter arg2, boolean arg3){
    return (org.apache.xml.dtm.DTMIterator) null;
  }
  public org.apache.xml.dtm.DTMIterator createDTMIterator(int arg1){
    return (org.apache.xml.dtm.DTMIterator) null;
  }
  public final int getCurrentNode(){
    return 0;
  }
  public org.apache.xml.dtm.DTMManager getDTMManager(){
    return (org.apache.xml.dtm.DTMManager) null;
  }
  public final javax.xml.transform.ErrorListener getErrorListener(){
    return (javax.xml.transform.ErrorListener) null;
  }
  public void setURIResolver(@com.francetelecom.rd.stubs.annotation.CallBackRegister("resolve") javax.xml.transform.URIResolver arg1){
  }
  public final javax.xml.transform.URIResolver getURIResolver(){
    return (javax.xml.transform.URIResolver) null;
  }
  public void setErrorListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("ErrorListener") javax.xml.transform.ErrorListener arg1) throws java.lang.IllegalArgumentException{
  }
  public boolean isSecureProcessing(){
    return false;
  }
  public final org.apache.xml.dtm.DTMIterator getContextNodeList(){
    return (org.apache.xml.dtm.DTMIterator) null;
  }
  public final void pushCurrentNodeAndExpression(int arg1, int arg2){
  }
  public final void popCurrentNodeAndExpression(){
  }
  public javax.xml.transform.SourceLocator getSAXLocator(){
    return (javax.xml.transform.SourceLocator) null;
  }
  public final VariableStack getVarStack(){
    return (VariableStack) null;
  }
  public org.apache.xpath.axes.SubContextList getSubContextList(){
    return (org.apache.xpath.axes.SubContextList) null;
  }
  public final void pushSubContextList(org.apache.xpath.axes.SubContextList arg1){
  }
  public final void pushNamespaceContext(org.apache.xml.utils.PrefixResolver arg1){
  }
  public final void pushCurrentNode(int arg1){
  }
  public final void popCurrentNode(){
  }
  public final void popNamespaceContext(){
  }
  public final void popSubContextList(){
  }
  public void setSAXLocator(javax.xml.transform.SourceLocator arg1){
  }
  public final void pushContextNodeList(org.apache.xml.dtm.DTMIterator arg1){
  }
  public final void popContextNodeList(){
  }
  public org.apache.xml.utils.IntStack getCurrentNodeStack(){
    return (org.apache.xml.utils.IntStack) null;
  }
  public final void pushCurrentExpressionNode(int arg1){
  }
  public org.apache.xml.utils.IntStack getCurrentExpressionNodeStack(){
    return (org.apache.xml.utils.IntStack) null;
  }
  public void pushSAXLocatorNull(){
  }
  public final SourceTreeManager getSourceTreeManager(){
    return (SourceTreeManager) null;
  }
  public void popSAXLocator(){
  }
  public final void popCurrentExpressionNode(){
  }
  public final void pushPredicatePos(int arg1){
  }
  public final void popPredicatePos(){
  }
  public final int getPredicatePos(){
    return 0;
  }
  public final int getIteratorRoot(){
    return 0;
  }
  public void setSecureProcessing(boolean arg1){
  }
  public void pushRTFContext(){
  }
  public void popRTFContext(){
  }
  public java.lang.Object getOwnerObject(){
    return (java.lang.Object) null;
  }
  public org.apache.xpath.axes.SubContextList getCurrentNodeList(){
    return (org.apache.xpath.axes.SubContextList) null;
  }
  public final int getContextNode(){
    return 0;
  }
  public final void setVarStack(VariableStack arg1){
  }
  public void pushSAXLocator(javax.xml.transform.SourceLocator arg1){
  }
  public void setSourceTreeManager(SourceTreeManager arg1){
  }
  public final org.xml.sax.XMLReader getPrimaryReader(){
    return (org.xml.sax.XMLReader) null;
  }
  public void setPrimaryReader(org.xml.sax.XMLReader arg1){
  }
  public java.util.Stack getContextNodeListsStack(){
    return (java.util.Stack) null;
  }
  public void setContextNodeListsStack(java.util.Stack arg1){
  }
  public void setCurrentNodeStack(org.apache.xml.utils.IntStack arg1){
  }
  public final void pushExpressionState(int arg1, int arg2, org.apache.xml.utils.PrefixResolver arg3){
  }
  public final void popExpressionState(){
  }
  public final void pushPredicateRoot(int arg1){
  }
  public final void popPredicateRoot(){
  }
  public final int getPredicateRoot(){
    return 0;
  }
  public final void pushIteratorRoot(int arg1){
  }
  public final void popIteratorRoot(){
  }
  public void setCurrentExpressionNodeStack(org.apache.xml.utils.IntStack arg1){
  }
  public final int getCurrentExpressionNode(){
    return 0;
  }
  public final void pushNamespaceContextNull(){
  }
  public java.util.Stack getAxesIteratorStackStacks(){
    return (java.util.Stack) null;
  }
  public void setAxesIteratorStackStacks(java.util.Stack arg1){
  }
  public final org.apache.xml.dtm.DTMIterator getContextNodes(){
    return (org.apache.xml.dtm.DTMIterator) null;
  }
  public org.apache.xalan.extensions.ExpressionContext getExpressionContext(){
    return (org.apache.xalan.extensions.ExpressionContext) null;
  }
  public org.apache.xml.dtm.DTM getGlobalRTFDTM(){
    return (org.apache.xml.dtm.DTM) null;
  }
  public org.apache.xml.dtm.DTM getRTFDTM(){
    return (org.apache.xml.dtm.DTM) null;
  }
  public org.apache.xpath.objects.DTMXRTreeFrag getDTMXRTreeFrag(int arg1){
    return (org.apache.xpath.objects.DTMXRTreeFrag) null;
  }
}
