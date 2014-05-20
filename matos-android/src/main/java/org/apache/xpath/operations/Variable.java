package org.apache.xpath.operations;

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


public class Variable
  extends org.apache.xpath.Expression  implements org.apache.xpath.axes.PathComponent
{
  // Fields

  protected org.apache.xml.utils.QName m_qname;

  protected int m_index;

  protected boolean m_isGlobal;

  // Constructors

  public Variable(){
    super();
  }
  // Methods

  public boolean deepEquals(org.apache.xpath.Expression arg1){
    return false;
  }
  public int getIndex(){
    return 0;
  }
  public org.apache.xpath.objects.XObject execute(org.apache.xpath.XPathContext arg1) throws javax.xml.transform.TransformerException{
    return (org.apache.xpath.objects.XObject) null;
  }
  public org.apache.xpath.objects.XObject execute(org.apache.xpath.XPathContext arg1, boolean arg2) throws javax.xml.transform.TransformerException{
    return (org.apache.xpath.objects.XObject) null;
  }
  public void fixupVariables(java.util.Vector arg1, int arg2){
  }
  public void callVisitors(org.apache.xpath.ExpressionOwner arg1, org.apache.xpath.XPathVisitor arg2){
  }
  public boolean isStableNumber(){
    return false;
  }
  public int getAnalysisBits(){
    return 0;
  }
  public void setIndex(int arg1){
  }
  public org.apache.xml.utils.QName getQName(){
    return (org.apache.xml.utils.QName) null;
  }
  public void setQName(org.apache.xml.utils.QName arg1){
  }
  public boolean getGlobal(){
    return false;
  }
  public void setIsGlobal(boolean arg1){
  }
  public org.apache.xalan.templates.ElemVariable getElemVariable(){
    return (org.apache.xalan.templates.ElemVariable) null;
  }
  public boolean isPsuedoVarRef(){
    return false;
  }
}
