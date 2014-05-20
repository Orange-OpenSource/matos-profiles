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


public class ElemNumber
  extends ElemTemplateElement{
  // Constructors

  public ElemNumber(){
    super();
  }
  // Methods

  public org.apache.xpath.XPath getValue(){
    return (org.apache.xpath.XPath) null;
  }
  public void setValue(org.apache.xpath.XPath arg1){
  }
  public void execute(org.apache.xalan.transformer.TransformerImpl arg1) throws javax.xml.transform.TransformerException{
  }
  public int getLevel(){
    return 0;
  }
  public void setLevel(int arg1){
  }
  public AVT getFormat(){
    return (AVT) null;
  }
  public org.apache.xpath.XPath getCount(){
    return (org.apache.xpath.XPath) null;
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
  public void callChildVisitors(@com.francetelecom.rd.stubs.annotation.CallBackRegister("XSLTVisitor") XSLTVisitor arg1, boolean arg2){
  }
  public void setLang(AVT arg1){
  }
  public AVT getLang(){
    return (AVT) null;
  }
  public org.apache.xpath.XPath getFrom(){
    return (org.apache.xpath.XPath) null;
  }
  public void setFrom(org.apache.xpath.XPath arg1){
  }
  public void setGroupingSeparator(AVT arg1){
  }
  public AVT getGroupingSeparator(){
    return (AVT) null;
  }
  public void setCount(org.apache.xpath.XPath arg1){
  }
  public void setFormat(AVT arg1){
  }
  public AVT getGroupingSize(){
    return (AVT) null;
  }
  public void setGroupingSize(AVT arg1){
  }
  public int getTargetNode(org.apache.xpath.XPathContext arg1, int arg2) throws javax.xml.transform.TransformerException{
    return 0;
  }
  public int getPreviousNode(org.apache.xpath.XPathContext arg1, int arg2) throws javax.xml.transform.TransformerException{
    return 0;
  }
  public void setLetterValue(AVT arg1){
  }
  public AVT getLetterValue(){
    return (AVT) null;
  }
  protected java.lang.String int2singlealphaCount(long arg1, org.apache.xml.utils.res.CharArrayWrapper arg2){
    return (java.lang.String) null;
  }
  protected void int2alphaCount(long arg1, org.apache.xml.utils.res.CharArrayWrapper arg2, org.apache.xml.utils.FastStringBuffer arg3){
  }
  protected java.lang.String tradAlphaCount(long arg1, org.apache.xml.utils.res.XResourceBundle arg2){
    return (java.lang.String) null;
  }
  protected java.lang.String long2roman(long arg1, boolean arg2){
    return (java.lang.String) null;
  }
}
