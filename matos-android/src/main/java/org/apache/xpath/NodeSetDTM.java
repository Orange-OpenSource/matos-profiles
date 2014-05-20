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


public class NodeSetDTM
  extends org.apache.xml.utils.NodeVector  implements org.apache.xml.dtm.DTMIterator, java.lang.Cloneable
{
  // Fields

  protected int m_next;

  protected boolean m_mutable;

  protected boolean m_cacheNodes;

  protected int m_root;

  // Constructors

  public NodeSetDTM(org.apache.xml.dtm.DTMManager arg1){
    super();
  }
  public NodeSetDTM(int arg1, int arg2, org.apache.xml.dtm.DTMManager arg3){
    super();
  }
  public NodeSetDTM(NodeSetDTM arg1){
    super();
  }
  public NodeSetDTM(org.apache.xml.dtm.DTMIterator arg1){
    super();
  }
  public NodeSetDTM(org.w3c.dom.traversal.NodeIterator arg1, XPathContext arg2){
    super();
  }
  public NodeSetDTM(org.w3c.dom.NodeList arg1, XPathContext arg2){
    super();
  }
  public NodeSetDTM(int arg1, org.apache.xml.dtm.DTMManager arg2){
    super();
  }
  // Methods

  public java.lang.Object clone() throws java.lang.CloneNotSupportedException{
    return (java.lang.Object) null;
  }
  public int getLength(){
    return 0;
  }
  public int indexOf(int arg1, int arg2){
    return 0;
  }
  public int indexOf(int arg1){
    return 0;
  }
  public boolean contains(int arg1){
    return false;
  }
  public int size(){
    return 0;
  }
  public void addElement(int arg1){
  }
  public int elementAt(int arg1){
    return 0;
  }
  public void reset(){
  }
  public void insertElementAt(int arg1, int arg2){
  }
  public void removeAllElements(){
  }
  public boolean removeElement(int arg1){
    return false;
  }
  public void removeElementAt(int arg1){
  }
  public void setElementAt(int arg1, int arg2){
  }
  public int nextNode(){
    return 0;
  }
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
  public int getCurrentNode(){
    return 0;
  }
  public int item(int arg1){
    return 0;
  }
  public void setEnvironment(java.lang.Object arg1){
  }
  public org.apache.xml.dtm.DTMManager getDTMManager(){
    return (org.apache.xml.dtm.DTMManager) null;
  }
  public void setRoot(int arg1, java.lang.Object arg2){
  }
  public int getCurrentPos(){
    return 0;
  }
  public void setShouldCacheNodes(boolean arg1){
  }
  public boolean isMutable(){
    return false;
  }
  public void setCurrentPos(int arg1){
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
  public void runTo(int arg1){
  }
  public boolean isDocOrdered(){
    return false;
  }
  public int getAxis(){
    return 0;
  }
  public int getLast(){
    return 0;
  }
  public void appendNodes(org.apache.xml.utils.NodeVector arg1){
  }
  public int addNodeInDocOrder(int arg1, boolean arg2, XPathContext arg3){
    return 0;
  }
  public int addNodeInDocOrder(int arg1, XPathContext arg2){
    return 0;
  }
  public void setLast(int arg1){
  }
  public void addNode(int arg1){
  }
  public void removeNode(int arg1){
  }
  public void insertNode(int arg1, int arg2){
  }
  public void addNodes(org.apache.xml.dtm.DTMIterator arg1){
  }
  public void addNodesInDocOrder(org.apache.xml.dtm.DTMIterator arg1, XPathContext arg2){
  }
  public boolean getShouldCacheNodes(){
    return false;
  }
}
