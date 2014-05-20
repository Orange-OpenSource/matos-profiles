package org.apache.xalan.processor;

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


public class ProcessorCharacters
  extends XSLTElementProcessor{
  // Fields

  protected org.w3c.dom.Node m_firstBackPointer;

  // Constructors

  public ProcessorCharacters(){
    super();
  }
  // Methods

  public void characters(StylesheetHandler arg1, char [] arg2, int arg3, int arg4) throws org.xml.sax.SAXException{
  }
  public void endElement(StylesheetHandler arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4) throws org.xml.sax.SAXException{
  }
  public void startNonText(StylesheetHandler arg1) throws org.xml.sax.SAXException{
  }
}
