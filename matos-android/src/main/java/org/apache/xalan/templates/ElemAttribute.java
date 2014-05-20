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


public class ElemAttribute
  extends ElemElement{
  // Constructors

  public ElemAttribute(){
    super();
  }
  // Methods

  public void setName(AVT arg1){
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
  protected java.lang.String resolvePrefix(@com.francetelecom.rd.stubs.annotation.CallBackRegister("serializationHandler") org.apache.xml.serializer.SerializationHandler arg1, java.lang.String arg2, java.lang.String arg3) throws javax.xml.transform.TransformerException{
    return (java.lang.String) null;
  }
  protected boolean validateNodeName(java.lang.String arg1){
    return false;
  }
}
