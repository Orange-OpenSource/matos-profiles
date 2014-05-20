package org.xmlpull.v1.sax2;

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
public class Driver
  implements org.xml.sax.Attributes, org.xml.sax.Locator, org.xml.sax.XMLReader
{
  // Fields

  protected static final java.lang.String DECLARATION_HANDLER_PROPERTY = (java.lang.String) null;

  protected static final java.lang.String LEXICAL_HANDLER_PROPERTY = (java.lang.String) null;

  protected static final java.lang.String NAMESPACES_FEATURE = (java.lang.String) null;

  protected static final java.lang.String NAMESPACE_PREFIXES_FEATURE = (java.lang.String) null;

  protected static final java.lang.String VALIDATION_FEATURE = (java.lang.String) null;

  protected static final java.lang.String APACHE_SCHEMA_VALIDATION_FEATURE = (java.lang.String) null;

  protected static final java.lang.String APACHE_DYNAMIC_VALIDATION_FEATURE = (java.lang.String) null;

  protected org.xml.sax.ContentHandler contentHandler;

  protected org.xml.sax.ErrorHandler errorHandler;

  protected java.lang.String systemId;

  protected org.xmlpull.v1.XmlPullParser pp;

  // Constructors

  public Driver() throws org.xmlpull.v1.XmlPullParserException{
  }
  public Driver(@com.francetelecom.rd.stubs.annotation.CallBackRegister("xmlPullParser") org.xmlpull.v1.XmlPullParser arg1) throws org.xmlpull.v1.XmlPullParserException{
  }
  // Methods

  public void setProperty(java.lang.String arg1, java.lang.Object arg2) throws org.xml.sax.SAXNotRecognizedException, org.xml.sax.SAXNotSupportedException{
  }
  public java.lang.Object getProperty(java.lang.String arg1) throws org.xml.sax.SAXNotRecognizedException, org.xml.sax.SAXNotSupportedException{
    return (java.lang.Object) null;
  }
  public int getLength(){
    return 0;
  }
  public java.lang.String getValue(int arg1){
    return (java.lang.String) null;
  }
  public java.lang.String getValue(java.lang.String arg1, java.lang.String arg2){
    return (java.lang.String) null;
  }
  public java.lang.String getValue(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public java.lang.String getType(int arg1){
    return (java.lang.String) null;
  }
  public java.lang.String getType(java.lang.String arg1, java.lang.String arg2){
    return (java.lang.String) null;
  }
  public java.lang.String getType(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public int getLineNumber(){
    return 0;
  }
  public void parse(org.xml.sax.InputSource arg1) throws org.xml.sax.SAXException, java.io.IOException{
  }
  public void parse(java.lang.String arg1) throws org.xml.sax.SAXException, java.io.IOException{
  }
  public int getIndex(java.lang.String arg1, java.lang.String arg2){
    return 0;
  }
  public int getIndex(java.lang.String arg1){
    return 0;
  }
  public org.xml.sax.ContentHandler getContentHandler(){
    return (org.xml.sax.ContentHandler) null;
  }
  public java.lang.String getPublicId(){
    return (java.lang.String) null;
  }
  public java.lang.String getSystemId(){
    return (java.lang.String) null;
  }
  public int getColumnNumber(){
    return 0;
  }
  public java.lang.String getLocalName(int arg1){
    return (java.lang.String) null;
  }
  protected void startElement(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws org.xml.sax.SAXException{
  }
  public boolean getFeature(java.lang.String arg1) throws org.xml.sax.SAXNotRecognizedException, org.xml.sax.SAXNotSupportedException{
    return false;
  }
  public void setContentHandler(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handle") org.xml.sax.ContentHandler arg1){
  }
  public void setErrorHandler(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handle") org.xml.sax.ErrorHandler arg1){
  }
  public org.xml.sax.ErrorHandler getErrorHandler(){
    return (org.xml.sax.ErrorHandler) null;
  }
  public void setFeature(java.lang.String arg1, boolean arg2) throws org.xml.sax.SAXNotRecognizedException, org.xml.sax.SAXNotSupportedException{
  }
  public void setDTDHandler(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handle") org.xml.sax.DTDHandler arg1){
  }
  public void setEntityResolver(@com.francetelecom.rd.stubs.annotation.CallBackRegister("resolve") org.xml.sax.EntityResolver arg1){
  }
  public org.xml.sax.EntityResolver getEntityResolver(){
    return (org.xml.sax.EntityResolver) null;
  }
  public org.xml.sax.DTDHandler getDTDHandler(){
    return (org.xml.sax.DTDHandler) null;
  }
  public java.lang.String getURI(int arg1){
    return (java.lang.String) null;
  }
  public java.lang.String getQName(int arg1){
    return (java.lang.String) null;
  }
  public void parseSubTree(@com.francetelecom.rd.stubs.annotation.CallBackRegister("xmlPullParser") org.xmlpull.v1.XmlPullParser arg1) throws org.xml.sax.SAXException, java.io.IOException{
  }
}
