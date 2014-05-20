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
public abstract class DocumentBuilderFactory
{
  // Constructors

  protected DocumentBuilderFactory(){
  }
  // Methods

  public static DocumentBuilderFactory newInstance(){
    return (DocumentBuilderFactory) null;
  }
  public static DocumentBuilderFactory newInstance(java.lang.String arg1, java.lang.ClassLoader arg2){
    return (DocumentBuilderFactory) null;
  }
  public abstract java.lang.Object getAttribute(java.lang.String arg1) throws java.lang.IllegalArgumentException;
  public abstract void setAttribute(java.lang.String arg1, java.lang.Object arg2) throws java.lang.IllegalArgumentException;
  public abstract boolean getFeature(java.lang.String arg1) throws ParserConfigurationException;
  public abstract void setFeature(java.lang.String arg1, boolean arg2) throws ParserConfigurationException;
  public void setNamespaceAware(boolean arg1){
  }
  public boolean isNamespaceAware(){
    return false;
  }
  public boolean isValidating(){
    return false;
  }
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
  public abstract DocumentBuilder newDocumentBuilder() throws ParserConfigurationException;
  public void setCoalescing(boolean arg1){
  }
  public void setIgnoringElementContentWhitespace(boolean arg1){
  }
  public void setExpandEntityReferences(boolean arg1){
  }
  public void setIgnoringComments(boolean arg1){
  }
  public boolean isIgnoringElementContentWhitespace(){
    return false;
  }
  public boolean isExpandEntityReferences(){
    return false;
  }
  public boolean isIgnoringComments(){
    return false;
  }
  public boolean isCoalescing(){
    return false;
  }
}
