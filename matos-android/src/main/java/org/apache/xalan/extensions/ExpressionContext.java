package org.apache.xalan.extensions;

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


public interface ExpressionContext
{
  // Methods

  public java.lang.String toString(org.w3c.dom.Node arg1);
  public org.apache.xpath.XPathContext getXPathContext() throws javax.xml.transform.TransformerException;
  public javax.xml.transform.ErrorListener getErrorListener();
  public org.w3c.dom.Node getContextNode();
  public org.w3c.dom.traversal.NodeIterator getContextNodes();
  public org.apache.xpath.objects.XObject getVariableOrParam(org.apache.xml.utils.QName arg1) throws javax.xml.transform.TransformerException;
  public double toNumber(org.w3c.dom.Node arg1);
}
