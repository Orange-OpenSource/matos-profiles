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
public class XMLWriter
  extends org.xml.sax.helpers.XMLFilterImpl  implements org.xml.sax.ext.LexicalHandler
{
  // Fields

  public static final java.lang.String CDATA_SECTION_ELEMENTS = "cdata-section-elements";

  public static final java.lang.String DOCTYPE_PUBLIC = "doctype-public";

  public static final java.lang.String DOCTYPE_SYSTEM = "doctype-system";

  public static final java.lang.String ENCODING = "encoding";

  public static final java.lang.String INDENT = "indent";

  public static final java.lang.String MEDIA_TYPE = "media-type";

  public static final java.lang.String METHOD = "method";

  public static final java.lang.String OMIT_XML_DECLARATION = "omit-xml-declaration";

  public static final java.lang.String STANDALONE = "standalone";

  public static final java.lang.String VERSION = "version";

  // Constructors

  public XMLWriter(){
    super();
  }
  public XMLWriter(java.io.Writer arg1){
    super();
  }
  public XMLWriter(org.xml.sax.XMLReader arg1){
    super();
  }
  public XMLWriter(org.xml.sax.XMLReader arg1, java.io.Writer arg2){
    super();
  }
  // Methods

  public void flush() throws java.io.IOException{
  }
  public void reset(){
  }
  public void comment(char [] arg1, int arg2, int arg3) throws org.xml.sax.SAXException{
  }
  public void startElement(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, org.xml.sax.Attributes arg4) throws org.xml.sax.SAXException{
  }
  public void startElement(java.lang.String arg1, java.lang.String arg2) throws org.xml.sax.SAXException{
  }
  public void startElement(java.lang.String arg1) throws org.xml.sax.SAXException{
  }
  public void characters(char [] arg1, int arg2, int arg3) throws org.xml.sax.SAXException{
  }
  public void characters(java.lang.String arg1) throws org.xml.sax.SAXException{
  }
  public void endElement(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws org.xml.sax.SAXException{
  }
  public void endElement(java.lang.String arg1, java.lang.String arg2) throws org.xml.sax.SAXException{
  }
  public void endElement(java.lang.String arg1) throws org.xml.sax.SAXException{
  }
  public void startDocument() throws org.xml.sax.SAXException{
  }
  public void endDocument() throws org.xml.sax.SAXException{
  }
  public void ignorableWhitespace(char [] arg1, int arg2, int arg3) throws org.xml.sax.SAXException{
  }
  public void processingInstruction(java.lang.String arg1, java.lang.String arg2) throws org.xml.sax.SAXException{
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
  public java.lang.String getPrefix(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public void setPrefix(java.lang.String arg1, java.lang.String arg2){
  }
  public java.lang.String getOutputProperty(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public void setOutputProperty(java.lang.String arg1, java.lang.String arg2){
  }
  public void setOutput(java.io.Writer arg1){
  }
  public void forceNSDecl(java.lang.String arg1){
  }
  public void forceNSDecl(java.lang.String arg1, java.lang.String arg2){
  }
  public void emptyElement(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, org.xml.sax.Attributes arg4) throws org.xml.sax.SAXException{
  }
  public void emptyElement(java.lang.String arg1, java.lang.String arg2) throws org.xml.sax.SAXException{
  }
  public void emptyElement(java.lang.String arg1) throws org.xml.sax.SAXException{
  }
  public void dataElement(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, org.xml.sax.Attributes arg4, java.lang.String arg5) throws org.xml.sax.SAXException{
  }
  public void dataElement(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws org.xml.sax.SAXException{
  }
  public void dataElement(java.lang.String arg1, java.lang.String arg2) throws org.xml.sax.SAXException{
  }
}
