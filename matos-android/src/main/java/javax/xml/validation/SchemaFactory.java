package javax.xml.validation;

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


@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.SchemaFactoryImplem", superClass = "")
public abstract class SchemaFactory
{
  // Constructors

  protected SchemaFactory(){
  }
  // Methods

  public void setProperty(java.lang.String arg1, java.lang.Object arg2) throws org.xml.sax.SAXNotRecognizedException, org.xml.sax.SAXNotSupportedException{
  }
  public java.lang.Object getProperty(java.lang.String arg1) throws org.xml.sax.SAXNotRecognizedException, org.xml.sax.SAXNotSupportedException{
    return (java.lang.Object) null;
  }
  public static SchemaFactory newInstance(java.lang.String arg1){
    return (SchemaFactory) null;
  }
  public static SchemaFactory newInstance(java.lang.String arg1, java.lang.String arg2, java.lang.ClassLoader arg3){
    return (SchemaFactory) null;
  }
  public boolean getFeature(java.lang.String arg1) throws org.xml.sax.SAXNotRecognizedException, org.xml.sax.SAXNotSupportedException{
    return false;
  }
  public abstract void setErrorHandler(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handle") org.xml.sax.ErrorHandler arg1);
  public abstract org.xml.sax.ErrorHandler getErrorHandler();
  public abstract void setResourceResolver(@com.francetelecom.rd.stubs.annotation.CallBackRegister("resolveResource") org.w3c.dom.ls.LSResourceResolver arg1);
  public abstract org.w3c.dom.ls.LSResourceResolver getResourceResolver();
  public void setFeature(java.lang.String arg1, boolean arg2) throws org.xml.sax.SAXNotRecognizedException, org.xml.sax.SAXNotSupportedException{
  }
  public abstract boolean isSchemaLanguageSupported(java.lang.String arg1);
  public Schema newSchema(javax.xml.transform.Source arg1) throws org.xml.sax.SAXException{
    return (Schema) null;
  }
  public Schema newSchema(java.io.File arg1) throws org.xml.sax.SAXException{
    return (Schema) null;
  }
  public Schema newSchema(java.net.URL arg1) throws org.xml.sax.SAXException{
    return (Schema) null;
  }
  public abstract Schema newSchema(javax.xml.transform.Source [] arg1) throws org.xml.sax.SAXException;
  public abstract Schema newSchema() throws org.xml.sax.SAXException;
}
