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


public class ElemExtensionDecl
  extends ElemTemplateElement{
  // Constructors

  public ElemExtensionDecl(){
    super();
  }
  // Methods

  public int getXSLToken(){
    return 0;
  }
  public void runtimeInit(org.apache.xalan.transformer.TransformerImpl arg1) throws javax.xml.transform.TransformerException{
  }
  public void compose(StylesheetRoot arg1) throws javax.xml.transform.TransformerException{
  }
  public java.lang.String getPrefix(){
    return (java.lang.String) null;
  }
  public void setPrefix(java.lang.String arg1){
  }
  public java.lang.String getElement(int arg1) throws java.lang.ArrayIndexOutOfBoundsException{
    return (java.lang.String) null;
  }
  public org.apache.xml.utils.StringVector getElements(){
    return (org.apache.xml.utils.StringVector) null;
  }
  public void setElements(org.apache.xml.utils.StringVector arg1){
  }
  public java.lang.String getFunction(int arg1) throws java.lang.ArrayIndexOutOfBoundsException{
    return (java.lang.String) null;
  }
  public void setFunctions(org.apache.xml.utils.StringVector arg1){
  }
  public org.apache.xml.utils.StringVector getFunctions(){
    return (org.apache.xml.utils.StringVector) null;
  }
  public int getFunctionCount(){
    return 0;
  }
  public int getElementCount(){
    return 0;
  }
}
