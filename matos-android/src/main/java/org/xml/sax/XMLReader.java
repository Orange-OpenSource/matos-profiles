package org.xml.sax;

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
public interface XMLReader
{
  // Methods

  public void setProperty(java.lang.String arg1, java.lang.Object arg2) throws SAXNotRecognizedException, SAXNotSupportedException;
  public java.lang.Object getProperty(java.lang.String arg1) throws SAXNotRecognizedException, SAXNotSupportedException;
  public void parse(InputSource arg1) throws java.io.IOException, SAXException;
  public void parse(java.lang.String arg1) throws java.io.IOException, SAXException;
  public ContentHandler getContentHandler();
  public boolean getFeature(java.lang.String arg1) throws SAXNotRecognizedException, SAXNotSupportedException;
  public void setContentHandler(ContentHandler arg1);
  public void setErrorHandler(ErrorHandler arg1);
  public ErrorHandler getErrorHandler();
  public void setFeature(java.lang.String arg1, boolean arg2) throws SAXNotRecognizedException, SAXNotSupportedException;
  public void setDTDHandler(DTDHandler arg1);
  public void setEntityResolver(EntityResolver arg1);
  public EntityResolver getEntityResolver();
  public DTDHandler getDTDHandler();
}
