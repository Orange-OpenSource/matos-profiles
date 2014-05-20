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


public class ElemAttributeSet
  extends ElemUse{
  // Fields

  public org.apache.xml.utils.QName m_qname;

  // Constructors

  public ElemAttributeSet(){
    super();
  }
  // Methods

  public org.apache.xml.utils.QName getName(){
    return (org.apache.xml.utils.QName) null;
  }
  public void setName(org.apache.xml.utils.QName arg1){
  }
  public void execute(org.apache.xalan.transformer.TransformerImpl arg1) throws javax.xml.transform.TransformerException{
  }
  public java.lang.String getNodeName(){
    return (java.lang.String) null;
  }
  public int getXSLToken(){
    return 0;
  }
  public void recompose(StylesheetRoot arg1){
  }
  public ElemTemplateElement appendChildElem(ElemTemplateElement arg1){
    return (ElemTemplateElement) null;
  }
}
