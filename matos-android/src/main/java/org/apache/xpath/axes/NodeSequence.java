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


public class NodeSequence
  extends org.apache.xpath.objects.XObject  implements org.apache.xml.dtm.DTMIterator, PathComponent, java.lang.Cloneable
{
  // Fields

  protected int m_last;

  protected int m_next;

  protected org.apache.xml.dtm.DTMIterator m_iter;

  protected org.apache.xml.dtm.DTMManager m_dtmMgr;

  // Constructors

  private NodeSequence(org.apache.xml.dtm.DTMIterator arg1, int arg2, org.apache.xpath.XPathContext arg3, boolean arg4){
    super();
  }
  public NodeSequence(java.lang.Object arg1){
    super();
  }
  private NodeSequence(org.apache.xml.dtm.DTMManager arg1){
    super();
  }
  public NodeSequence(){
    super();
  }
  // Methods

  public java.lang.Object clone() throws java.lang.CloneNotSupportedException{
    return (java.lang.Object) null;
  }
  public int getLength(){
    return 0;
  }
  public void reset(){
  }
  public void fixupVariables(java.util.Vector arg1, int arg2){
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
  public int getAnalysisBits(){
    return 0;
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
  protected void setObject(java.lang.Object arg1){
  }
  public final void setIter(org.apache.xml.dtm.DTMIterator arg1){
  }
  public boolean hasCache(){
    return false;
  }
  protected org.apache.xml.utils.NodeVector getVector(){
    return (org.apache.xml.utils.NodeVector) null;
  }
  protected void SetVector(org.apache.xml.utils.NodeVector arg1){
  }
  public final org.apache.xml.dtm.DTMIterator getContainedIter(){
    return (org.apache.xml.dtm.DTMIterator) null;
  }
  protected int addNodeInDocOrder(int arg1){
    return 0;
  }
}
