package org.apache.xml.serializer.dom3;

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


public final class LSSerializerImpl
  implements org.w3c.dom.ls.LSSerializer, org.w3c.dom.DOMConfiguration
{
  // Fields

  protected int fFeatures;

  // Constructors

  public LSSerializerImpl(){
  }
  // Methods

  public boolean write(org.w3c.dom.Node arg1, org.w3c.dom.ls.LSOutput arg2) throws org.w3c.dom.ls.LSException{
    return false;
  }
  public java.lang.Object getParameter(java.lang.String arg1) throws org.w3c.dom.DOMException{
    return (java.lang.Object) null;
  }
  public void setParameter(java.lang.String arg1, java.lang.Object arg2) throws org.w3c.dom.DOMException{
  }
  public org.w3c.dom.DOMStringList getParameterNames(){
    return (org.w3c.dom.DOMStringList) null;
  }
  public org.w3c.dom.ls.LSSerializerFilter getFilter(){
    return (org.w3c.dom.ls.LSSerializerFilter) null;
  }
  public void setFilter(org.w3c.dom.ls.LSSerializerFilter arg1){
  }
  protected java.lang.String getInputEncoding(org.w3c.dom.Node arg1){
    return (java.lang.String) null;
  }
  public org.w3c.dom.DOMConfiguration getDomConfig(){
    return (org.w3c.dom.DOMConfiguration) null;
  }
  public org.w3c.dom.DOMErrorHandler getErrorHandler(){
    return (org.w3c.dom.DOMErrorHandler) null;
  }
  public void setNewLine(java.lang.String arg1){
  }
  public java.lang.String getNewLine(){
    return (java.lang.String) null;
  }
  public boolean canSetParameter(java.lang.String arg1, java.lang.Object arg2){
    return false;
  }
  protected java.lang.String getXMLVersion(org.w3c.dom.Node arg1){
    return (java.lang.String) null;
  }
  public void initializeSerializerProps(){
  }
  public java.lang.String writeToString(org.w3c.dom.Node arg1) throws org.w3c.dom.DOMException, org.w3c.dom.ls.LSException{
    return (java.lang.String) null;
  }
  public boolean writeToURI(org.w3c.dom.Node arg1, java.lang.String arg2) throws org.w3c.dom.ls.LSException{
    return false;
  }
  protected java.lang.String getXMLEncoding(org.w3c.dom.Node arg1){
    return (java.lang.String) null;
  }
}
