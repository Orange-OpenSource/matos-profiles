package org.apache.xml.dtm.ref;

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


public interface IncrementalSAXSource
{
  // Methods

  public void setContentHandler(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handle") org.xml.sax.ContentHandler arg1);
  public void setDTDHandler(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handle") org.xml.sax.DTDHandler arg1);
  public void setLexicalHandler(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handle") org.xml.sax.ext.LexicalHandler arg1);
  public void startParse(org.xml.sax.InputSource arg1) throws org.xml.sax.SAXException;
  public java.lang.Object deliverMoreNodes(boolean arg1);
}
