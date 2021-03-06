package org.xmlpull.v1;

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
public interface XmlSerializer
{
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("xmlSerializer")
  public void setProperty(java.lang.String arg1, java.lang.Object arg2) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException;
  @com.francetelecom.rd.stubs.annotation.CallBack("xmlSerializer")
  public java.lang.Object getProperty(java.lang.String arg1);
  @com.francetelecom.rd.stubs.annotation.CallBack("xmlSerializer")
  public java.lang.String getName();
  @com.francetelecom.rd.stubs.annotation.CallBack("xmlSerializer")
  public void flush() throws java.io.IOException;
  @com.francetelecom.rd.stubs.annotation.CallBack("xmlSerializer")
  public void comment(java.lang.String arg1) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException;
  @com.francetelecom.rd.stubs.annotation.CallBack("xmlSerializer")
  public XmlSerializer text(java.lang.String arg1) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException;
  @com.francetelecom.rd.stubs.annotation.CallBack("xmlSerializer")
  public XmlSerializer text(char [] arg1, int arg2, int arg3) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException;
  @com.francetelecom.rd.stubs.annotation.CallBack("xmlSerializer")
  public java.lang.String getNamespace();
  @com.francetelecom.rd.stubs.annotation.CallBack("xmlSerializer")
  public void startDocument(java.lang.String arg1, java.lang.Boolean arg2) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException;
  @com.francetelecom.rd.stubs.annotation.CallBack("xmlSerializer")
  public void endDocument() throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException;
  @com.francetelecom.rd.stubs.annotation.CallBack("xmlSerializer")
  public void ignorableWhitespace(java.lang.String arg1) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException;
  @com.francetelecom.rd.stubs.annotation.CallBack("xmlSerializer")
  public void processingInstruction(java.lang.String arg1) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException;
  @com.francetelecom.rd.stubs.annotation.CallBack("xmlSerializer")
  public java.lang.String getPrefix(java.lang.String arg1, boolean arg2) throws java.lang.IllegalArgumentException;
  @com.francetelecom.rd.stubs.annotation.CallBack("xmlSerializer")
  public void setPrefix(java.lang.String arg1, java.lang.String arg2) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException;
  @com.francetelecom.rd.stubs.annotation.CallBack("xmlSerializer")
  public boolean getFeature(java.lang.String arg1);
  @com.francetelecom.rd.stubs.annotation.CallBack("xmlSerializer")
  public void setFeature(java.lang.String arg1, boolean arg2) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException;
  @com.francetelecom.rd.stubs.annotation.CallBack("xmlSerializer")
  public int getDepth();
  @com.francetelecom.rd.stubs.annotation.CallBack("xmlSerializer")
  public XmlSerializer startTag(java.lang.String arg1, java.lang.String arg2) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException;
  @com.francetelecom.rd.stubs.annotation.CallBack("xmlSerializer")
  public XmlSerializer attribute(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException;
  @com.francetelecom.rd.stubs.annotation.CallBack("xmlSerializer")
  public XmlSerializer endTag(java.lang.String arg1, java.lang.String arg2) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException;
  @com.francetelecom.rd.stubs.annotation.CallBack("xmlSerializer")
  public void setOutput(java.io.OutputStream arg1, java.lang.String arg2) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException;
  @com.francetelecom.rd.stubs.annotation.CallBack("xmlSerializer")
  public void setOutput(java.io.Writer arg1) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException;
  @com.francetelecom.rd.stubs.annotation.CallBack("xmlSerializer")
  public void cdsect(java.lang.String arg1) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException;
  @com.francetelecom.rd.stubs.annotation.CallBack("xmlSerializer")
  public void entityRef(java.lang.String arg1) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException;
  @com.francetelecom.rd.stubs.annotation.CallBack("xmlSerializer")
  public void docdecl(java.lang.String arg1) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException;
}
