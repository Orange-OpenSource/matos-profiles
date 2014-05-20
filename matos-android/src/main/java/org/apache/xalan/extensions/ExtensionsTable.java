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


public class ExtensionsTable
{
  // Fields

  public java.util.Hashtable m_extensionFunctionNamespaces;

  // Constructors

  public ExtensionsTable(org.apache.xalan.templates.StylesheetRoot arg1) throws javax.xml.transform.TransformerException{
  }
  // Methods

  public ExtensionHandler get(java.lang.String arg1){
    return (ExtensionHandler) null;
  }
  public java.lang.Object extFunction(java.lang.String arg1, java.lang.String arg2, java.util.Vector arg3, java.lang.Object arg4, ExpressionContext arg5) throws javax.xml.transform.TransformerException{
    return (java.lang.Object) null;
  }
  public java.lang.Object extFunction(org.apache.xpath.functions.FuncExtFunction arg1, java.util.Vector arg2, ExpressionContext arg3) throws javax.xml.transform.TransformerException{
    return (java.lang.Object) null;
  }
  public void addExtensionNamespace(java.lang.String arg1, ExtensionHandler arg2){
  }
  public boolean functionAvailable(java.lang.String arg1, java.lang.String arg2) throws javax.xml.transform.TransformerException{
    return false;
  }
  public boolean elementAvailable(java.lang.String arg1, java.lang.String arg2) throws javax.xml.transform.TransformerException{
    return false;
  }
}
