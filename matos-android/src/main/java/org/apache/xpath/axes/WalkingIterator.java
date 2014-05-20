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


public class WalkingIterator
  extends LocPathIterator  implements org.apache.xpath.ExpressionOwner
{
  // Fields

  protected AxesWalker m_lastUsedWalker;

  protected AxesWalker m_firstWalker;

  // Constructors

  WalkingIterator(org.apache.xpath.compiler.Compiler arg1, int arg2, int arg3, boolean arg4) throws javax.xml.transform.TransformerException{
    super();
  }
  public WalkingIterator(org.apache.xml.utils.PrefixResolver arg1){
    super();
  }
  // Methods

  public java.lang.Object clone() throws java.lang.CloneNotSupportedException{
    return (java.lang.Object) null;
  }
  public void reset(){
  }
  public boolean deepEquals(org.apache.xpath.Expression arg1){
    return false;
  }
  public void fixupVariables(java.util.Vector arg1, int arg2){
  }
  public org.apache.xpath.Expression getExpression(){
    return (org.apache.xpath.Expression) null;
  }
  public void setExpression(org.apache.xpath.Expression arg1){
  }
  public void callVisitors(org.apache.xpath.ExpressionOwner arg1, org.apache.xpath.XPathVisitor arg2){
  }
  public int nextNode(){
    return 0;
  }
  public void detach(){
  }
  public int getAnalysisBits(){
    return 0;
  }
  public void setRoot(int arg1, java.lang.Object arg2){
  }
  public final AxesWalker getLastUsedWalker(){
    return (AxesWalker) null;
  }
  public final void setLastUsedWalker(AxesWalker arg1){
  }
  public final AxesWalker getFirstWalker(){
    return (AxesWalker) null;
  }
  public final void setFirstWalker(AxesWalker arg1){
  }
}
