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


@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.ExtensionHandlerImplem", superClass = "")
public abstract class ExtensionHandler
{
  // Fields

  protected java.lang.String m_namespaceUri;

  protected java.lang.String m_scriptLang;

  // Constructors

  protected ExtensionHandler(java.lang.String arg1, java.lang.String arg2){
  }
  // Methods

  public abstract boolean isFunctionAvailable(java.lang.String arg1);
  public abstract boolean isElementAvailable(java.lang.String arg1);
  public abstract java.lang.Object callFunction(java.lang.String arg1, java.util.Vector arg2, java.lang.Object arg3, ExpressionContext arg4) throws javax.xml.transform.TransformerException;
  public abstract java.lang.Object callFunction(org.apache.xpath.functions.FuncExtFunction arg1, java.util.Vector arg2, ExpressionContext arg3) throws javax.xml.transform.TransformerException;
  public abstract void processElement(java.lang.String arg1, org.apache.xalan.templates.ElemTemplateElement arg2, org.apache.xalan.transformer.TransformerImpl arg3, org.apache.xalan.templates.Stylesheet arg4, java.lang.Object arg5) throws javax.xml.transform.TransformerException, java.io.IOException;
}
