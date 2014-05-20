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


public class NodeSet
  implements org.w3c.dom.traversal.NodeIterator, org.w3c.dom.NodeList, java.lang.Cloneable, org.apache.xpath.axes.ContextNodeList
{
  // Fields

  protected int m_next;

  protected boolean m_mutable;

  protected boolean m_cacheNodes;

  protected int m_firstFree;

  // Constructors

  public NodeSet(){
  }
  public NodeSet(int arg1){
  }
  public NodeSet(org.w3c.dom.NodeList arg1){
  }
  public NodeSet(NodeSet arg1){
  }
  public NodeSet(org.w3c.dom.traversal.NodeIterator arg1){
  }
  public NodeSet(org.w3c.dom.Node arg1){
  }
  // Methods

  public java.lang.Object clone() throws java.lang.CloneNotSupportedException{
    return (java.lang.Object) null;
  }
  public int getLength(){
    return 0;
  }
  public int indexOf(org.w3c.dom.Node arg1, int arg2){
    return 0;
  }
  public int indexOf(org.w3c.dom.Node arg1){
    return 0;
  }
  public boolean contains(org.w3c.dom.Node arg1){
    return false;
  }
  public int size(){
    return 0;
  }
  public void addElement(org.w3c.dom.Node arg1){
  }
  public org.w3c.dom.Node elementAt(int arg1){
    return (org.w3c.dom.Node) null;
  }
  public final org.w3c.dom.Node pop(){
    return (org.w3c.dom.Node) null;
  }
  public final void push(org.w3c.dom.Node arg1){
  }
  public void reset(){
  }
  public void insertElementAt(org.w3c.dom.Node arg1, int arg2){
  }
  public void removeAllElements(){
  }
  public boolean removeElement(org.w3c.dom.Node arg1){
    return false;
  }
  public void removeElementAt(int arg1){
  }
  public void setElementAt(org.w3c.dom.Node arg1, int arg2){
  }
  public org.w3c.dom.Node nextNode() throws org.w3c.dom.DOMException{
    return (org.w3c.dom.Node) null;
  }
  public void detach(){
  }
  public org.w3c.dom.Node getRoot(){
    return (org.w3c.dom.Node) null;
  }
  public int getWhatToShow(){
    return 0;
  }
  public org.w3c.dom.traversal.NodeFilter getFilter(){
    return (org.w3c.dom.traversal.NodeFilter) null;
  }
  public boolean getExpandEntityReferences(){
    return false;
  }
  public org.w3c.dom.Node previousNode() throws org.w3c.dom.DOMException{
    return (org.w3c.dom.Node) null;
  }
  public org.w3c.dom.Node getCurrentNode(){
    return (org.w3c.dom.Node) null;
  }
  public org.w3c.dom.Node item(int arg1){
    return (org.w3c.dom.Node) null;
  }
  public int getCurrentPos(){
    return 0;
  }
  public void setShouldCacheNodes(boolean arg1){
  }
  public void setCurrentPos(int arg1){
  }
  public boolean isFresh(){
    return false;
  }
  public org.w3c.dom.traversal.NodeIterator cloneWithReset() throws java.lang.CloneNotSupportedException{
    return (org.w3c.dom.traversal.NodeIterator) null;
  }
  public void runTo(int arg1){
  }
  public int getLast(){
    return 0;
  }
  public final org.w3c.dom.Node popAndTop(){
    return (org.w3c.dom.Node) null;
  }
  public final void popQuick(){
  }
  public final org.w3c.dom.Node peepOrNull(){
    return (org.w3c.dom.Node) null;
  }
  public final void pushPair(org.w3c.dom.Node arg1, org.w3c.dom.Node arg2){
  }
  public final void popPair(){
  }
  public final void setTail(org.w3c.dom.Node arg1){
  }
  public final void setTailSub1(org.w3c.dom.Node arg1){
  }
  public final org.w3c.dom.Node peepTail(){
    return (org.w3c.dom.Node) null;
  }
  public final org.w3c.dom.Node peepTailSub1(){
    return (org.w3c.dom.Node) null;
  }
  public void appendNodes(NodeSet arg1){
  }
  public int addNodeInDocOrder(org.w3c.dom.Node arg1, boolean arg2, XPathContext arg3){
    return 0;
  }
  public int addNodeInDocOrder(org.w3c.dom.Node arg1, XPathContext arg2){
    return 0;
  }
  public void setLast(int arg1){
  }
  public void addNode(org.w3c.dom.Node arg1){
  }
  public void removeNode(org.w3c.dom.Node arg1){
  }
  public void insertNode(org.w3c.dom.Node arg1, int arg2){
  }
  public void addNodes(org.w3c.dom.NodeList arg1){
  }
  public void addNodes(NodeSet arg1){
  }
  public void addNodes(org.w3c.dom.traversal.NodeIterator arg1){
  }
  public void addNodesInDocOrder(org.w3c.dom.NodeList arg1, XPathContext arg2){
  }
  public void addNodesInDocOrder(org.w3c.dom.traversal.NodeIterator arg1, XPathContext arg2){
  }
  public boolean getShouldCacheNodes(){
    return false;
  }
}
