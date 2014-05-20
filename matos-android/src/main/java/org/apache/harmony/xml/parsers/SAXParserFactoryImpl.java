package org.apache.harmony.xml.parsers;

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


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public class SAXParserFactoryImpl
  extends javax.xml.parsers.SAXParserFactory{
  // Constructors

  public SAXParserFactoryImpl(){
    super();
  }
  // Methods

  public boolean getFeature(java.lang.String arg1) throws org.xml.sax.SAXNotRecognizedException{
    return false;
  }
  public void setFeature(java.lang.String arg1, boolean arg2) throws org.xml.sax.SAXNotRecognizedException{
  }
  public void setNamespaceAware(boolean arg1){
  }
  public boolean isNamespaceAware(){
    return false;
  }
  public boolean isValidating(){
    return false;
  }
  public javax.xml.parsers.SAXParser newSAXParser() throws javax.xml.parsers.ParserConfigurationException{
    return (javax.xml.parsers.SAXParser) null;
  }
  public void setValidating(boolean arg1){
  }
}
