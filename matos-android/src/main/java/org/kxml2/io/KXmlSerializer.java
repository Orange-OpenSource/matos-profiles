package org.kxml2.io;

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
public class KXmlSerializer
  implements org.xmlpull.v1.XmlSerializer
{
  // Constructors
  
  public KXmlSerializer(){
  }
  // Methods

  public void setProperty(java.lang.String arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("property") java.lang.Object arg2){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("property")
  public java.lang.Object getProperty(java.lang.String arg1){
    return (java.lang.Object) null;
  }
  public java.lang.String getName(){
    return (java.lang.String) null;
  }
  public void flush() throws java.io.IOException{
  }
  public void comment(java.lang.String arg1) throws java.io.IOException{
  }
  public org.xmlpull.v1.XmlSerializer text(java.lang.String arg1) throws java.io.IOException{
    return (org.xmlpull.v1.XmlSerializer) null;
  }
  public org.xmlpull.v1.XmlSerializer text(char [] arg1, int arg2, int arg3) throws java.io.IOException{
    return (org.xmlpull.v1.XmlSerializer) null;
  }
  public java.lang.String getNamespace(){
    return (java.lang.String) null;
  }
  public void startDocument(java.lang.String arg1, java.lang.Boolean arg2) throws java.io.IOException{
  }
  public void endDocument() throws java.io.IOException{
  }
  public void ignorableWhitespace(java.lang.String arg1) throws java.io.IOException{
  }
  public void processingInstruction(java.lang.String arg1) throws java.io.IOException{
  }
  public java.lang.String getPrefix(java.lang.String arg1, boolean arg2){
    return (java.lang.String) null;
  }
  public void setPrefix(java.lang.String arg1, java.lang.String arg2) throws java.io.IOException{
  }
  
  public boolean getFeature(java.lang.String arg1){
    return false;
  }
  public void setFeature(java.lang.String arg1, boolean arg2){
  }
  public int getDepth(){
    return 0;
  }
  public org.xmlpull.v1.XmlSerializer startTag(java.lang.String arg1, java.lang.String arg2) throws java.io.IOException{
    return (org.xmlpull.v1.XmlSerializer) null;
  }
  public org.xmlpull.v1.XmlSerializer attribute(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws java.io.IOException{
    return (org.xmlpull.v1.XmlSerializer) null;
  }
  public org.xmlpull.v1.XmlSerializer endTag(java.lang.String arg1, java.lang.String arg2) throws java.io.IOException{
    return (org.xmlpull.v1.XmlSerializer) null;
  }
  public void setOutput(java.io.Writer arg1){
  }
  public void setOutput(java.io.OutputStream arg1, java.lang.String arg2) throws java.io.IOException{
  }
  public void cdsect(java.lang.String arg1) throws java.io.IOException{
  }
  public void entityRef(java.lang.String arg1) throws java.io.IOException{
  }
  public void docdecl(java.lang.String arg1) throws java.io.IOException{
  }
}
