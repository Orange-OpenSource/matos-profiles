package org.apache.xml.dtm;

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


public abstract class DTMManager
{
  // Fields

  protected org.apache.xml.utils.XMLStringFactory m_xsf;

  public boolean m_incremental;

  public boolean m_source_location;

  public static final int IDENT_DTM_NODE_BITS = 16;

  public static final int IDENT_NODE_DEFAULT = 65535;

  public static final int IDENT_DTM_DEFAULT = -65536;

  public static final int IDENT_MAX_DTMS = 65536;

  // Constructors

  protected DTMManager(){
  }
  // Methods

  public static DTMManager newInstance(org.apache.xml.utils.XMLStringFactory arg1) throws DTMConfigurationException{
    return (DTMManager) null;
  }
  public abstract boolean release(DTM arg1, boolean arg2);
  public abstract DTM getDTM(javax.xml.transform.Source arg1, boolean arg2, DTMWSFilter arg3, boolean arg4, boolean arg5);
  public abstract DTM getDTM(int arg1);
  public abstract int getDTMHandleFromNode(org.w3c.dom.Node arg1);
  public abstract int getDTMIdentity(DTM arg1);
  public abstract DTM createDocumentFragment();
  public abstract DTMIterator createDTMIterator(java.lang.Object arg1, int arg2);
  public abstract DTMIterator createDTMIterator(java.lang.String arg1, org.apache.xml.utils.PrefixResolver arg2);
  public abstract DTMIterator createDTMIterator(int arg1, DTMFilter arg2, boolean arg3);
  public abstract DTMIterator createDTMIterator(int arg1);
  public org.apache.xml.utils.XMLStringFactory getXMLStringFactory(){
    return (org.apache.xml.utils.XMLStringFactory) null;
  }
  public void setXMLStringFactory(org.apache.xml.utils.XMLStringFactory arg1){
  }
  public boolean getIncremental(){
    return false;
  }
  public void setIncremental(boolean arg1){
  }
  public boolean getSource_location(){
    return false;
  }
  public void setSource_location(boolean arg1){
  }
  public int getDTMIdentityMask(){
    return 0;
  }
  public int getNodeIdentityMask(){
    return 0;
  }
}
