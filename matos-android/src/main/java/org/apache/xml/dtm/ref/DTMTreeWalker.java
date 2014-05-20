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


public class DTMTreeWalker
{
  // Fields

  protected org.apache.xml.dtm.DTM m_dtm;

  // Constructors

  public DTMTreeWalker(){
  }
  public DTMTreeWalker(org.xml.sax.ContentHandler arg1, org.apache.xml.dtm.DTM arg2){
  }
  // Methods

  public void traverse(int arg1) throws org.xml.sax.SAXException{
  }
  public void traverse(int arg1, int arg2) throws org.xml.sax.SAXException{
  }
  protected void startNode(int arg1) throws org.xml.sax.SAXException{
  }
  protected void endNode(int arg1) throws org.xml.sax.SAXException{
  }
  public org.xml.sax.ContentHandler getcontentHandler(){
    return (org.xml.sax.ContentHandler) null;
  }
  public void setcontentHandler(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handle") org.xml.sax.ContentHandler arg1){
  }
  public void setDTM(org.apache.xml.dtm.DTM arg1){
  }
}
