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


public class UnionPathIterator
  extends LocPathIterator  implements org.apache.xml.dtm.DTMIterator, PathComponent, java.io.Serializable, java.lang.Cloneable
{
  // Fields

  protected LocPathIterator [] m_exprs;

  protected org.apache.xml.dtm.DTMIterator [] m_iterators;

  // Constructors

  public UnionPathIterator(){
    super();
  }
  public UnionPathIterator(org.apache.xpath.compiler.Compiler arg1, int arg2) throws javax.xml.transform.TransformerException{
    super();
  }
  // Methods

  public java.lang.Object clone() throws java.lang.CloneNotSupportedException{
    return (java.lang.Object) null;
  }
  public boolean deepEquals(org.apache.xpath.Expression arg1){
    return false;
  }
  public void fixupVariables(java.util.Vector arg1, int arg2){
  }
  public void callVisitors(org.apache.xpath.ExpressionOwner arg1, org.apache.xpath.XPathVisitor arg2){
  }
  public int nextNode(){
    return 0;
  }
  public void detach(){
  }
  protected LocPathIterator createDTMIterator(org.apache.xpath.compiler.Compiler arg1, int arg2) throws javax.xml.transform.TransformerException{
    return (LocPathIterator) null;
  }
  public int getAnalysisBits(){
    return 0;
  }
  public void setRoot(int arg1, java.lang.Object arg2){
  }
  public int getAxis(){
    return 0;
  }
  public void addIterator(org.apache.xml.dtm.DTMIterator arg1){
  }
  public static LocPathIterator createUnionIterator(org.apache.xpath.compiler.Compiler arg1, int arg2) throws javax.xml.transform.TransformerException{
    return (LocPathIterator) null;
  }
  protected void loadLocationPaths(org.apache.xpath.compiler.Compiler arg1, int arg2, int arg3) throws javax.xml.transform.TransformerException{
  }
}
