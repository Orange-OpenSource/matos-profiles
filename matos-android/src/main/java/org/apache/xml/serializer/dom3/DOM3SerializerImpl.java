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


public final class DOM3SerializerImpl
  implements org.apache.xml.serializer.DOM3Serializer
{
  // Constructors

  public DOM3SerializerImpl(@com.francetelecom.rd.stubs.annotation.CallBackRegister("serializationHandler") org.apache.xml.serializer.SerializationHandler arg1){
  }
  // Methods

  public void setErrorHandler(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handleError") org.w3c.dom.DOMErrorHandler arg1){
  }
  public org.w3c.dom.DOMErrorHandler getErrorHandler(){
    return (org.w3c.dom.DOMErrorHandler) null;
  }
  public void setNewLine(char [] arg1){
  }
  public org.w3c.dom.ls.LSSerializerFilter getNodeFilter(){
    return (org.w3c.dom.ls.LSSerializerFilter) null;
  }
  public char [] getNewLine(){
    return (char []) null;
  }
  public void serializeDOM3(org.w3c.dom.Node arg1) throws java.io.IOException{
  }
  public void setNodeFilter(org.w3c.dom.ls.LSSerializerFilter arg1){
  }
  public void setSerializationHandler(@com.francetelecom.rd.stubs.annotation.CallBackRegister("serializationHandler") org.apache.xml.serializer.SerializationHandler arg1){
  }
}
