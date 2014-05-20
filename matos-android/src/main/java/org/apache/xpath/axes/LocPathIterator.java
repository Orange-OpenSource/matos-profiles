package org.apache.xpath.axes;

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


public abstract class LocPathIterator
  extends PredicatedNodeTest  implements org.apache.xml.dtm.DTMIterator, PathComponent, java.io.Serializable, java.lang.Cloneable
{
  // Fields

  protected boolean m_allowDetach;

  protected IteratorPool m_clones;

  protected org.apache.xml.dtm.DTM m_cdtm;

  public int m_lastFetched;

  protected int m_context;

  protected int m_currentContextNode;

  protected int m_pos;

  protected int m_length;

  protected org.apache.xpath.XPathContext m_execContext;

  // Constructors

  protected LocPathIterator(){
    super((LocPathIterator) null);
  }
  protected LocPathIterator(org.apache.xml.utils.PrefixResolver arg1){
    super((LocPathIterator) null);
  }
  protected LocPathIterator(org.apache.xpath.compiler.Compiler arg1, int arg2, int arg3) throws javax.xml.transform.TransformerException{
    super((LocPathIterator) null);
  }
  protected LocPathIterator(org.apache.xpath.compiler.Compiler arg1, int arg2, int arg3, boolean arg4) throws javax.xml.transform.TransformerException{
    super((LocPathIterator) null);
  }
  // Methods

  public int getLength(){
    return 0;
  }
  public int size(){
    return 0;
  }
  public final int getContext(){
    return 0;
  }
  public void reset(){
  }
  public org.apache.xpath.objects.XObject execute(org.apache.xpath.XPathContext arg1) throws javax.xml.transform.TransformerException{
    return (org.apache.xpath.objects.XObject) null;
  }
  public void executeCharsToContentHandler(org.apache.xpath.XPathContext arg1, org.xml.sax.ContentHandler arg2) throws javax.xml.transform.TransformerException, org.xml.sax.SAXException{
  }
  public void callVisitors(org.apache.xpath.ExpressionOwner arg1, org.apache.xpath.XPathVisitor arg2){
  }
  public int asNode(org.apache.xpath.XPathContext arg1) throws javax.xml.transform.TransformerException{
    return 0;
  }
  public boolean isNodesetExpr(){
    return false;
  }
  public boolean bool(org.apache.xpath.XPathContext arg1) throws javax.xml.transform.TransformerException{
    return false;
  }
  public org.apache.xml.dtm.DTMIterator asIterator(org.apache.xpath.XPathContext arg1, int arg2) throws javax.xml.transform.TransformerException{
    return (org.apache.xml.dtm.DTMIterator) null;
  }
  public abstract int nextNode();
  public void detach(){
  }
  public int getRoot(){
    return 0;
  }
  public int getWhatToShow(){
    return 0;
  }
  public org.apache.xml.dtm.DTMFilter getFilter(){
    return (org.apache.xml.dtm.DTMFilter) null;
  }
  public boolean getExpandEntityReferences(){
    return false;
  }
  public int previousNode(){
    return 0;
  }
  public org.apache.xml.dtm.DTM getDTM(int arg1){
    return (org.apache.xml.dtm.DTM) null;
  }
  public int getLastPos(org.apache.xpath.XPathContext arg1){
    return 0;
  }
  public int getCurrentNode(){
    return 0;
  }
  public int item(int arg1){
    return 0;
  }
  public int getAnalysisBits(){
    return 0;
  }
  public void setEnvironment(java.lang.Object arg1){
  }
  public org.apache.xml.dtm.DTMManager getDTMManager(){
    return (org.apache.xml.dtm.DTMManager) null;
  }
  public void setIsTopLevel(boolean arg1){
  }
  public boolean getIsTopLevel(){
    return false;
  }
  public void setRoot(int arg1, java.lang.Object arg2){
  }
  protected void setNextPosition(int arg1){
  }
  public final int getCurrentPos(){
    return 0;
  }
  public void setShouldCacheNodes(boolean arg1){
  }
  public boolean isMutable(){
    return false;
  }
  public void setCurrentPos(int arg1){
  }
  public void incrementCurrentPos(){
  }
  public void setItem(int arg1, int arg2){
  }
  public boolean isFresh(){
    return false;
  }
  public void allowDetachToRelease(boolean arg1){
  }
  public org.apache.xml.dtm.DTMIterator cloneWithReset() throws java.lang.CloneNotSupportedException{
    return (org.apache.xml.dtm.DTMIterator) null;
  }
  protected int returnNextNode(int arg1){
    return 0;
  }
  public void runTo(int arg1){
  }
  public final boolean getFoundLast(){
    return false;
  }
  public final org.apache.xpath.XPathContext getXPathContext(){
    return (org.apache.xpath.XPathContext) null;
  }
  public final int getCurrentContextNode(){
    return 0;
  }
  public final void setCurrentContextNode(int arg1){
  }
  public final org.apache.xml.utils.PrefixResolver getPrefixResolver(){
    return (org.apache.xml.utils.PrefixResolver) null;
  }
  public boolean isDocOrdered(){
    return false;
  }
  public int getAxis(){
    return 0;
  }
}
