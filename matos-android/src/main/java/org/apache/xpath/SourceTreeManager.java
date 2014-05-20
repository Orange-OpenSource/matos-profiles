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


public class SourceTreeManager
{
  // Constructors

  public SourceTreeManager(){
  }
  // Methods

  public void reset(){
  }
  public static org.xml.sax.XMLReader getXMLReader(javax.xml.transform.Source arg1, javax.xml.transform.SourceLocator arg2) throws javax.xml.transform.TransformerException{
    return (org.xml.sax.XMLReader) null;
  }
  public void setURIResolver(@com.francetelecom.rd.stubs.annotation.CallBackRegister("resolve") javax.xml.transform.URIResolver arg1){
  }
  public javax.xml.transform.URIResolver getURIResolver(){
    return (javax.xml.transform.URIResolver) null;
  }
  public int getNode(javax.xml.transform.Source arg1){
    return 0;
  }
  public void removeDocumentFromCache(int arg1){
  }
  public java.lang.String findURIFromDoc(int arg1){
    return (java.lang.String) null;
  }
  public javax.xml.transform.Source resolveURI(java.lang.String arg1, java.lang.String arg2, javax.xml.transform.SourceLocator arg3) throws javax.xml.transform.TransformerException, java.io.IOException{
    return (javax.xml.transform.Source) null;
  }
  public void putDocumentInCache(int arg1, javax.xml.transform.Source arg2){
  }
  public int getSourceTree(java.lang.String arg1, java.lang.String arg2, javax.xml.transform.SourceLocator arg3, XPathContext arg4) throws javax.xml.transform.TransformerException{
    return 0;
  }
  public int getSourceTree(javax.xml.transform.Source arg1, javax.xml.transform.SourceLocator arg2, XPathContext arg3) throws javax.xml.transform.TransformerException{
    return 0;
  }
  public int parseToNode(javax.xml.transform.Source arg1, javax.xml.transform.SourceLocator arg2, XPathContext arg3) throws javax.xml.transform.TransformerException{
    return 0;
  }
}
