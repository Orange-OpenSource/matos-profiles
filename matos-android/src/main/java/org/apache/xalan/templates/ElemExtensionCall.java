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


public class ElemExtensionCall
  extends ElemLiteralResult{
  // Constructors

  public ElemExtensionCall(){
    super();
  }
  // Methods

  protected boolean accept(@com.francetelecom.rd.stubs.annotation.CallBackRegister("XSLTVisitor") XSLTVisitor arg1){
    return false;
  }
  public java.lang.String getAttribute(java.lang.String arg1, org.w3c.dom.Node arg2, org.apache.xalan.transformer.TransformerImpl arg3) throws javax.xml.transform.TransformerException{
    return (java.lang.String) null;
  }
  public void execute(org.apache.xalan.transformer.TransformerImpl arg1) throws javax.xml.transform.TransformerException{
  }
  public int getXSLToken(){
    return 0;
  }
  public void compose(StylesheetRoot arg1) throws javax.xml.transform.TransformerException{
  }
}
