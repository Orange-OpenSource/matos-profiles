package javax.xml.parsers;

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
public abstract class SAXParserFactory
{
  // Constructors

  protected SAXParserFactory(){
  }
  // Methods

  public static SAXParserFactory newInstance(){
    return (SAXParserFactory) null;
  }
  public static SAXParserFactory newInstance(java.lang.String arg1, java.lang.ClassLoader arg2){
    return (SAXParserFactory) null;
  }
  public abstract boolean getFeature(java.lang.String arg1) throws ParserConfigurationException, org.xml.sax.SAXNotRecognizedException, org.xml.sax.SAXNotSupportedException;
  public abstract void setFeature(java.lang.String arg1, boolean arg2) throws ParserConfigurationException, org.xml.sax.SAXNotRecognizedException, org.xml.sax.SAXNotSupportedException;
  public void setNamespaceAware(boolean arg1){
  }
  public boolean isNamespaceAware(){
    return false;
  }
  public boolean isValidating(){
    return false;
  }
  public abstract SAXParser newSAXParser() throws ParserConfigurationException, org.xml.sax.SAXException;
  public void setValidating(boolean arg1){
  }
  public javax.xml.validation.Schema getSchema(){
    return (javax.xml.validation.Schema) null;
  }
  public void setSchema(javax.xml.validation.Schema arg1){
  }
  public void setXIncludeAware(boolean arg1){
  }
  public boolean isXIncludeAware(){
    return false;
  }
}
