package org.apache.xalan.transformer;

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


public class TrAXFilter
  extends org.xml.sax.helpers.XMLFilterImpl{
  // Constructors

  public TrAXFilter(javax.xml.transform.Templates arg1) throws javax.xml.transform.TransformerConfigurationException{
    super();
  }
  // Methods

  public void setParent(org.xml.sax.XMLReader arg1){
  }
  public void parse(org.xml.sax.InputSource arg1) throws org.xml.sax.SAXException, java.io.IOException{
  }
  public void parse(java.lang.String arg1) throws org.xml.sax.SAXException, java.io.IOException{
  }
  public void setContentHandler(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handle") org.xml.sax.ContentHandler arg1){
  }
  public TransformerImpl getTransformer(){
    return (TransformerImpl) null;
  }
  public void setErrorListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("ErrorListener") javax.xml.transform.ErrorListener arg1){
  }
}
