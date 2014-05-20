package org.apache.xpath;

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


public class XPathException
  extends javax.xml.transform.TransformerException{
  // Fields

  protected java.lang.Exception m_exception;

  // Constructors

  public XPathException(java.lang.String arg1, ExpressionNode arg2){
    super((java.lang.String) null);
  }
  public XPathException(java.lang.String arg1){
    super((java.lang.String) null);
  }
  public XPathException(java.lang.String arg1, java.lang.Object arg2){
    super((java.lang.String) null);
  }
  public XPathException(java.lang.String arg1, org.w3c.dom.Node arg2, java.lang.Exception arg3){
    super((java.lang.String) null);
  }
  public XPathException(java.lang.String arg1, java.lang.Exception arg2){
    super((java.lang.String) null);
  }
  // Methods

  public void printStackTrace(java.io.PrintStream arg1){
  }
  public void printStackTrace(java.io.PrintWriter arg1){
  }
  public java.lang.String getMessage(){
    return (java.lang.String) null;
  }
  public java.lang.Throwable getException(){
    return (java.lang.Throwable) null;
  }
  protected ExpressionNode getExpressionOwner(ExpressionNode arg1){
    return (ExpressionNode) null;
  }
  public java.lang.Object getStylesheetNode(){
    return (java.lang.Object) null;
  }
  public org.w3c.dom.Node getStylesheetNode(ExpressionNode arg1){
    return (org.w3c.dom.Node) null;
  }
  public void setStylesheetNode(java.lang.Object arg1){
  }
}
