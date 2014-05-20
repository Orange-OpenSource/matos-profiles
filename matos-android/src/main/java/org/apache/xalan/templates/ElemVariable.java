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


public class ElemVariable
  extends ElemTemplateElement{
  // Fields

  protected int m_index;

  protected org.apache.xml.utils.QName m_qname;

  // Constructors

  public ElemVariable(){
    super();
  }
  public ElemVariable(ElemVariable arg1) throws javax.xml.transform.TransformerException{
    super();
  }
  // Methods

  public org.apache.xml.utils.QName getName(){
    return (org.apache.xml.utils.QName) null;
  }
  public org.apache.xpath.objects.XObject getValue(org.apache.xalan.transformer.TransformerImpl arg1, int arg2) throws javax.xml.transform.TransformerException{
    return (org.apache.xpath.objects.XObject) null;
  }
  public void setName(org.apache.xml.utils.QName arg1){
  }
  protected boolean accept(@com.francetelecom.rd.stubs.annotation.CallBackRegister("XSLTVisitor") XSLTVisitor arg1){
    return false;
  }
  public int getIndex(){
    return 0;
  }
  public void execute(org.apache.xalan.transformer.TransformerImpl arg1) throws javax.xml.transform.TransformerException{
  }
  public void setIsTopLevel(boolean arg1){
  }
  public boolean getIsTopLevel(){
    return false;
  }
  public java.lang.String getNodeName(){
    return (java.lang.String) null;
  }
  public int getXSLToken(){
    return 0;
  }
  public ElemTemplateElement appendChild(ElemTemplateElement arg1){
    return (ElemTemplateElement) null;
  }
  public void recompose(StylesheetRoot arg1){
  }
  public void compose(StylesheetRoot arg1) throws javax.xml.transform.TransformerException{
  }
  public void endCompose(StylesheetRoot arg1) throws javax.xml.transform.TransformerException{
  }
  public void setParentElem(ElemTemplateElement arg1){
  }
  protected void callChildVisitors(@com.francetelecom.rd.stubs.annotation.CallBackRegister("XSLTVisitor") XSLTVisitor arg1, boolean arg2){
  }
  public void setSelect(org.apache.xpath.XPath arg1){
  }
  public org.apache.xpath.XPath getSelect(){
    return (org.apache.xpath.XPath) null;
  }
  public void setIndex(int arg1){
  }
  public boolean isPsuedoVar(){
    return false;
  }
}
