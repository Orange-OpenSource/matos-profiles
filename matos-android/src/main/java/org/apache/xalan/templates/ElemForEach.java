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


public class ElemForEach
  extends ElemTemplateElement  implements org.apache.xpath.ExpressionOwner
{
  // Fields

  public boolean m_doc_cache_off;

  protected org.apache.xpath.Expression m_selectExpression;

  protected org.apache.xpath.XPath m_xpath;

  protected java.util.Vector m_sortElems;

  // Constructors

  public ElemForEach(){
    super();
  }
  // Methods

  public void execute(org.apache.xalan.transformer.TransformerImpl arg1) throws javax.xml.transform.TransformerException{
  }
  public org.apache.xpath.Expression getExpression(){
    return (org.apache.xpath.Expression) null;
  }
  public void setExpression(org.apache.xpath.Expression arg1){
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
  public void compose(StylesheetRoot arg1) throws javax.xml.transform.TransformerException{
  }
  public void endCompose(StylesheetRoot arg1) throws javax.xml.transform.TransformerException{
  }
  public void callChildVisitors(@com.francetelecom.rd.stubs.annotation.CallBackRegister("XSLTVisitor") XSLTVisitor arg1, boolean arg2){
  }
  public void setSelect(org.apache.xpath.XPath arg1){
  }
  public org.apache.xpath.Expression getSelect(){
    return (org.apache.xpath.Expression) null;
  }
  public int getSortElemCount(){
    return 0;
  }
  public ElemSort getSortElem(int arg1){
    return (ElemSort) null;
  }
  public void setSortElem(ElemSort arg1){
  }
  protected ElemTemplateElement getTemplateMatch(){
    return (ElemTemplateElement) null;
  }
  public org.apache.xml.dtm.DTMIterator sortNodes(org.apache.xpath.XPathContext arg1, java.util.Vector arg2, org.apache.xml.dtm.DTMIterator arg3) throws javax.xml.transform.TransformerException{
    return (org.apache.xml.dtm.DTMIterator) null;
  }
  public void transformSelectedNodes(org.apache.xalan.transformer.TransformerImpl arg1) throws javax.xml.transform.TransformerException{
  }
}
