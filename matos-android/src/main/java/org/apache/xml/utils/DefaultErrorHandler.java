package org.apache.xml.utils;

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


public class DefaultErrorHandler
  implements javax.xml.transform.ErrorListener, org.xml.sax.ErrorHandler
{
  // Constructors

  public DefaultErrorHandler(java.io.PrintWriter arg1){
  }
  public DefaultErrorHandler(java.io.PrintStream arg1){
  }
  public DefaultErrorHandler(){
  }
  public DefaultErrorHandler(boolean arg1){
  }
  // Methods

  public void fatalError(org.xml.sax.SAXParseException arg1) throws org.xml.sax.SAXException{
  }
  public void fatalError(javax.xml.transform.TransformerException arg1) throws javax.xml.transform.TransformerException{
  }
  public void error(org.xml.sax.SAXParseException arg1) throws org.xml.sax.SAXException{
  }
  public void error(javax.xml.transform.TransformerException arg1) throws javax.xml.transform.TransformerException{
  }
  public void warning(org.xml.sax.SAXParseException arg1) throws org.xml.sax.SAXException{
  }
  public void warning(javax.xml.transform.TransformerException arg1) throws javax.xml.transform.TransformerException{
  }
  public java.io.PrintWriter getErrorWriter(){
    return (java.io.PrintWriter) null;
  }
  public static void ensureLocationSet(javax.xml.transform.TransformerException arg1){
  }
  public static void printLocation(java.io.PrintStream arg1, javax.xml.transform.TransformerException arg2){
  }
  public static void printLocation(java.io.PrintStream arg1, org.xml.sax.SAXParseException arg2){
  }
  public static void printLocation(java.io.PrintWriter arg1, java.lang.Throwable arg2){
  }
}
