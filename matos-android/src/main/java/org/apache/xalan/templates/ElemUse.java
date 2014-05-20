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


public class ElemUse
  extends ElemTemplateElement{
  // Constructors

  public ElemUse(){
    super();
  }
  // Methods

  public void execute(org.apache.xalan.transformer.TransformerImpl arg1) throws javax.xml.transform.TransformerException{
  }
  public void setUseAttributeSets(java.util.Vector arg1){
  }
  public void setUseAttributeSets(org.apache.xml.utils.QName [] arg1){
  }
  public org.apache.xml.utils.QName [] getUseAttributeSets(){
    return (org.apache.xml.utils.QName []) null;
  }
  public void applyAttrSets(org.apache.xalan.transformer.TransformerImpl arg1, StylesheetRoot arg2) throws javax.xml.transform.TransformerException{
  }
}
