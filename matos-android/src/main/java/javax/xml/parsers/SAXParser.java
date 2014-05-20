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
public abstract class SAXParser
{
  // Constructors

  protected SAXParser(){
  }
  // Methods

  public abstract void setProperty(java.lang.String arg1, java.lang.Object arg2) throws org.xml.sax.SAXNotRecognizedException, org.xml.sax.SAXNotSupportedException;
  public abstract java.lang.Object getProperty(java.lang.String arg1) throws org.xml.sax.SAXNotRecognizedException, org.xml.sax.SAXNotSupportedException;
  public void reset(){
  }
  public void parse(java.io.InputStream arg1, org.xml.sax.HandlerBase arg2) throws org.xml.sax.SAXException, java.io.IOException{
  }
  public void parse(java.io.InputStream arg1, org.xml.sax.HandlerBase arg2, java.lang.String arg3) throws org.xml.sax.SAXException, java.io.IOException{
  }
  public void parse(java.io.InputStream arg1, org.xml.sax.helpers.DefaultHandler arg2) throws org.xml.sax.SAXException, java.io.IOException{
  }
  public void parse(java.io.InputStream arg1, org.xml.sax.helpers.DefaultHandler arg2, java.lang.String arg3) throws org.xml.sax.SAXException, java.io.IOException{
  }
  public void parse(java.lang.String arg1, org.xml.sax.HandlerBase arg2) throws org.xml.sax.SAXException, java.io.IOException{
  }
  public void parse(java.lang.String arg1, org.xml.sax.helpers.DefaultHandler arg2) throws org.xml.sax.SAXException, java.io.IOException{
  }
  public void parse(java.io.File arg1, org.xml.sax.HandlerBase arg2) throws org.xml.sax.SAXException, java.io.IOException{
  }
  public void parse(java.io.File arg1, org.xml.sax.helpers.DefaultHandler arg2) throws org.xml.sax.SAXException, java.io.IOException{
  }
  public void parse(org.xml.sax.InputSource arg1, org.xml.sax.HandlerBase arg2) throws org.xml.sax.SAXException, java.io.IOException{
  }
  public void parse(org.xml.sax.InputSource arg1, org.xml.sax.helpers.DefaultHandler arg2) throws org.xml.sax.SAXException, java.io.IOException{
  }
  public abstract org.xml.sax.XMLReader getXMLReader() throws org.xml.sax.SAXException;
  public abstract boolean isNamespaceAware();
  public abstract boolean isValidating();
  public javax.xml.validation.Schema getSchema(){
    return (javax.xml.validation.Schema) null;
  }
  public boolean isXIncludeAware(){
    return false;
  }
  public abstract org.xml.sax.Parser getParser() throws org.xml.sax.SAXException;
}
