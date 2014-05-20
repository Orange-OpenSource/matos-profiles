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
@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.DocumentBuilderImpl", superClass = "")
public abstract class DocumentBuilder
{
  // Constructors

  protected DocumentBuilder(){
  }
  // Methods

  public void reset(){
  }
  public org.w3c.dom.Document parse(java.io.InputStream arg1) throws org.xml.sax.SAXException, java.io.IOException{
    return (org.w3c.dom.Document) null;
  }
  public org.w3c.dom.Document parse(java.io.InputStream arg1, java.lang.String arg2) throws org.xml.sax.SAXException, java.io.IOException{
    return (org.w3c.dom.Document) null;
  }
  public org.w3c.dom.Document parse(java.lang.String arg1) throws org.xml.sax.SAXException, java.io.IOException{
    return (org.w3c.dom.Document) null;
  }
  public org.w3c.dom.Document parse(java.io.File arg1) throws org.xml.sax.SAXException, java.io.IOException{
    return (org.w3c.dom.Document) null;
  }
  public abstract org.w3c.dom.Document parse(org.xml.sax.InputSource arg1) throws org.xml.sax.SAXException, java.io.IOException;
  public abstract void setErrorHandler(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handle") org.xml.sax.ErrorHandler arg1);
  public abstract void setEntityResolver(org.xml.sax.EntityResolver arg1);
  public abstract boolean isNamespaceAware();
  public abstract boolean isValidating();
  public javax.xml.validation.Schema getSchema(){
    return (javax.xml.validation.Schema) null;
  }
  public boolean isXIncludeAware(){
    return false;
  }
  public abstract org.w3c.dom.DOMImplementation getDOMImplementation();
  public abstract org.w3c.dom.Document newDocument();
}
