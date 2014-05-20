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


public class DTMManagerDefault
  extends org.apache.xml.dtm.DTMManager{
  // Fields

  protected org.apache.xml.dtm.DTM [] m_dtms;

  protected org.apache.xml.utils.XMLReaderManager m_readerManager;

  protected org.xml.sax.helpers.DefaultHandler m_defaultHandler;

  // Constructors

  public DTMManagerDefault(){
    super();
  }
  // Methods

  public synchronized boolean release(org.apache.xml.dtm.DTM arg1, boolean arg2){
    return false;
  }
  public synchronized org.apache.xml.dtm.DTM getDTM(javax.xml.transform.Source arg1, boolean arg2, org.apache.xml.dtm.DTMWSFilter arg3, boolean arg4, boolean arg5){
    return (org.apache.xml.dtm.DTM) null;
  }
  public synchronized org.apache.xml.dtm.DTM getDTM(int arg1){
    return (org.apache.xml.dtm.DTM) null;
  }
  public synchronized void addDTM(org.apache.xml.dtm.DTM arg1, int arg2){
  }
  public synchronized void addDTM(org.apache.xml.dtm.DTM arg1, int arg2, int arg3){
  }
  public synchronized int getFirstFreeDTMID(){
    return 0;
  }
  public synchronized int getDTMHandleFromNode(org.w3c.dom.Node arg1){
    return 0;
  }
  public synchronized org.xml.sax.XMLReader getXMLReader(javax.xml.transform.Source arg1){
    return (org.xml.sax.XMLReader) null;
  }
  public synchronized void releaseXMLReader(org.xml.sax.XMLReader arg1){
  }
  public synchronized int getDTMIdentity(org.apache.xml.dtm.DTM arg1){
    return 0;
  }
  public synchronized org.apache.xml.dtm.DTM createDocumentFragment(){
    return (org.apache.xml.dtm.DTM) null;
  }
  public synchronized org.apache.xml.dtm.DTMIterator createDTMIterator(int arg1, org.apache.xml.dtm.DTMFilter arg2, boolean arg3){
    return (org.apache.xml.dtm.DTMIterator) null;
  }
  public synchronized org.apache.xml.dtm.DTMIterator createDTMIterator(java.lang.String arg1, org.apache.xml.utils.PrefixResolver arg2){
    return (org.apache.xml.dtm.DTMIterator) null;
  }
  public synchronized org.apache.xml.dtm.DTMIterator createDTMIterator(int arg1){
    return (org.apache.xml.dtm.DTMIterator) null;
  }
  public synchronized org.apache.xml.dtm.DTMIterator createDTMIterator(java.lang.Object arg1, int arg2){
    return (org.apache.xml.dtm.DTMIterator) null;
  }
  public ExpandedNameTable getExpandedNameTable(org.apache.xml.dtm.DTM arg1){
    return (ExpandedNameTable) null;
  }
}
