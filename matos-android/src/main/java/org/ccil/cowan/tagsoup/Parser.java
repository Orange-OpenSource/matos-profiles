package org.ccil.cowan.tagsoup;

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
public class Parser
  extends org.xml.sax.helpers.DefaultHandler  implements ScanHandler, org.xml.sax.ext.LexicalHandler, org.xml.sax.XMLReader
{
  // Fields

  public static final java.lang.String namespacesFeature = "http://xml.org/sax/features/namespaces";

  public static final java.lang.String namespacePrefixesFeature = "http://xml.org/sax/features/namespace-prefixes";

  public static final java.lang.String externalGeneralEntitiesFeature = "http://xml.org/sax/features/external-general-entities";

  public static final java.lang.String externalParameterEntitiesFeature = "http://xml.org/sax/features/external-parameter-entities";

  public static final java.lang.String isStandaloneFeature = "http://xml.org/sax/features/is-standalone";

  public static final java.lang.String lexicalHandlerParameterEntitiesFeature = "http://xml.org/sax/features/lexical-handler/parameter-entities";

  public static final java.lang.String resolveDTDURIsFeature = "http://xml.org/sax/features/resolve-dtd-uris";

  public static final java.lang.String stringInterningFeature = "http://xml.org/sax/features/string-interning";

  public static final java.lang.String useAttributes2Feature = "http://xml.org/sax/features/use-attributes2";

  public static final java.lang.String useLocator2Feature = "http://xml.org/sax/features/use-locator2";

  public static final java.lang.String useEntityResolver2Feature = "http://xml.org/sax/features/use-entity-resolver2";

  public static final java.lang.String validationFeature = "http://xml.org/sax/features/validation";

  public static final java.lang.String unicodeNormalizationCheckingFeature = "http://xml.org/sax/features/unicode-normalization-checking";

  public static final java.lang.String xmlnsURIsFeature = "http://xml.org/sax/features/xmlns-uris";

  public static final java.lang.String XML11Feature = "http://xml.org/sax/features/xml-1.1";

  public static final java.lang.String ignoreBogonsFeature = "http://www.ccil.org/~cowan/tagsoup/features/ignore-bogons";

  public static final java.lang.String bogonsEmptyFeature = "http://www.ccil.org/~cowan/tagsoup/features/bogons-empty";

  public static final java.lang.String rootBogonsFeature = "http://www.ccil.org/~cowan/tagsoup/features/root-bogons";

  public static final java.lang.String defaultAttributesFeature = "http://www.ccil.org/~cowan/tagsoup/features/default-attributes";

  public static final java.lang.String translateColonsFeature = "http://www.ccil.org/~cowan/tagsoup/features/translate-colons";

  public static final java.lang.String restartElementsFeature = "http://www.ccil.org/~cowan/tagsoup/features/restart-elements";

  public static final java.lang.String ignorableWhitespaceFeature = "http://www.ccil.org/~cowan/tagsoup/features/ignorable-whitespace";

  public static final java.lang.String CDATAElementsFeature = "http://www.ccil.org/~cowan/tagsoup/features/cdata-elements";

  public static final java.lang.String lexicalHandlerProperty = "http://xml.org/sax/properties/lexical-handler";

  public static final java.lang.String scannerProperty = "http://www.ccil.org/~cowan/tagsoup/properties/scanner";

  public static final java.lang.String schemaProperty = "http://www.ccil.org/~cowan/tagsoup/properties/schema";

  public static final java.lang.String autoDetectorProperty = "http://www.ccil.org/~cowan/tagsoup/properties/auto-detector";

  // Constructors

  public Parser(){
    super();
  }
  // Methods

  public void setProperty(java.lang.String arg1, java.lang.Object arg2) throws org.xml.sax.SAXNotRecognizedException, org.xml.sax.SAXNotSupportedException{
  }
  public java.lang.Object getProperty(java.lang.String arg1) throws org.xml.sax.SAXNotRecognizedException, org.xml.sax.SAXNotSupportedException{
    return (java.lang.Object) null;
  }
  public void parse(org.xml.sax.InputSource arg1) throws java.io.IOException, org.xml.sax.SAXException{
  }
  public void parse(java.lang.String arg1) throws java.io.IOException, org.xml.sax.SAXException{
  }
  public void comment(char [] arg1, int arg2, int arg3) throws org.xml.sax.SAXException{
  }
  public void eof(char [] arg1, int arg2, int arg3) throws org.xml.sax.SAXException{
  }
  public org.xml.sax.ContentHandler getContentHandler(){
    return (org.xml.sax.ContentHandler) null;
  }
  public void startEntity(java.lang.String arg1) throws org.xml.sax.SAXException{
  }
  public void endEntity(java.lang.String arg1) throws org.xml.sax.SAXException{
  }
  public void startCDATA() throws org.xml.sax.SAXException{
  }
  public void endCDATA() throws org.xml.sax.SAXException{
  }
  public void startDTD(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws org.xml.sax.SAXException{
  }
  public void endDTD() throws org.xml.sax.SAXException{
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
  public int getEntity(){
    return 0;
  }
  public void entity(char [] arg1, int arg2, int arg3) throws org.xml.sax.SAXException{
  }
  public void cdsect(char [] arg1, int arg2, int arg3) throws org.xml.sax.SAXException{
  }
  public void pi(char [] arg1, int arg2, int arg3) throws org.xml.sax.SAXException{
  }
  public void decl(char [] arg1, int arg2, int arg3) throws org.xml.sax.SAXException{
  }
  public void stagc(char [] arg1, int arg2, int arg3) throws org.xml.sax.SAXException{
  }
  public void gi(char [] arg1, int arg2, int arg3) throws org.xml.sax.SAXException{
  }
  public void etag(char [] arg1, int arg2, int arg3) throws org.xml.sax.SAXException{
  }
  public void aname(char [] arg1, int arg2, int arg3) throws org.xml.sax.SAXException{
  }
  public void aval(char [] arg1, int arg2, int arg3) throws org.xml.sax.SAXException{
  }
  public void pcdata(char [] arg1, int arg2, int arg3) throws org.xml.sax.SAXException{
  }
  public void adup(char [] arg1, int arg2, int arg3) throws org.xml.sax.SAXException{
  }
  public void cmnt(char [] arg1, int arg2, int arg3) throws org.xml.sax.SAXException{
  }
  public void pitarget(char [] arg1, int arg2, int arg3) throws org.xml.sax.SAXException{
  }
  public void stage(char [] arg1, int arg2, int arg3) throws org.xml.sax.SAXException{
  }
  public boolean etag_cdata(char [] arg1, int arg2, int arg3) throws org.xml.sax.SAXException{
    return false;
  }
  public void etag_basic(char [] arg1, int arg2, int arg3) throws org.xml.sax.SAXException{
  }
}
