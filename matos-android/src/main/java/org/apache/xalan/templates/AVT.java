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


public class AVT
  implements XSLTVisitable, java.io.Serializable
{
  // Constructors

  public AVT(org.apache.xalan.processor.StylesheetHandler arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5, ElemTemplateElement arg6) throws javax.xml.transform.TransformerException{
  }
  // Methods

  public java.lang.String getName(){
    return (java.lang.String) null;
  }
  public void setName(java.lang.String arg1){
  }
  public java.lang.String evaluate(org.apache.xpath.XPathContext arg1, int arg2, org.apache.xml.utils.PrefixResolver arg3) throws javax.xml.transform.TransformerException{
    return (java.lang.String) null;
  }
  public boolean canTraverseOutsideSubtree(){
    return false;
  }
  public void fixupVariables(java.util.Vector arg1, int arg2){
  }
  public void callVisitors(XSLTVisitor arg1){
  }
  public java.lang.String getURI(){
    return (java.lang.String) null;
  }
  public void setURI(java.lang.String arg1){
  }
  public java.lang.String getSimpleString(){
    return (java.lang.String) null;
  }
  public void setRawName(java.lang.String arg1){
  }
  public java.lang.String getRawName(){
    return (java.lang.String) null;
  }
  public boolean isSimple(){
    return false;
  }
  public boolean isContextInsensitive(){
    return false;
  }
}
