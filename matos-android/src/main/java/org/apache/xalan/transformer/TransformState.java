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


public interface TransformState
  extends org.apache.xml.serializer.TransformStateSetter
{
  // Methods

  public org.w3c.dom.Node getCurrentNode();
  public javax.xml.transform.Transformer getTransformer();
  public org.apache.xalan.templates.ElemTemplateElement getCurrentElement();
  public org.apache.xalan.templates.ElemTemplate getCurrentTemplate();
  public org.apache.xalan.templates.ElemTemplate getMatchedTemplate();
  public org.w3c.dom.Node getMatchedNode();
  public org.w3c.dom.traversal.NodeIterator getContextNodeList();
}
