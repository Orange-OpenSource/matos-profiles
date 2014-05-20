package org.apache.xalan.transformer;

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


public class XalanTransformState
  implements TransformState
{
  // Constructors

  public XalanTransformState(){
  }
  // Methods

  public org.w3c.dom.Node getCurrentNode(){
    return (org.w3c.dom.Node) null;
  }
  public javax.xml.transform.Transformer getTransformer(){
    return (javax.xml.transform.Transformer) null;
  }
  public org.apache.xalan.templates.ElemTemplateElement getCurrentElement(){
    return (org.apache.xalan.templates.ElemTemplateElement) null;
  }
  public org.apache.xalan.templates.ElemTemplate getCurrentTemplate(){
    return (org.apache.xalan.templates.ElemTemplate) null;
  }
  public org.apache.xalan.templates.ElemTemplate getMatchedTemplate(){
    return (org.apache.xalan.templates.ElemTemplate) null;
  }
  public org.w3c.dom.Node getMatchedNode(){
    return (org.w3c.dom.Node) null;
  }
  public org.w3c.dom.traversal.NodeIterator getContextNodeList(){
    return (org.w3c.dom.traversal.NodeIterator) null;
  }
  public void resetState(javax.xml.transform.Transformer arg1){
  }
  public void setCurrentNode(org.w3c.dom.Node arg1){
  }
}
