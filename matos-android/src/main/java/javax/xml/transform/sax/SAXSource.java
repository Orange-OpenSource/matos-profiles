package javax.xml.transform.sax;

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


public class SAXSource
  implements javax.xml.transform.Source
{
  // Fields

  public static final java.lang.String FEATURE = "http://javax.xml.transform.sax.SAXSource/feature";

  // Constructors

  public SAXSource(){
  }
  public SAXSource(org.xml.sax.XMLReader arg1, org.xml.sax.InputSource arg2){
  }
  public SAXSource(org.xml.sax.InputSource arg1){
  }
  // Methods

  public java.lang.String getSystemId(){
    return (java.lang.String) null;
  }
  public org.xml.sax.XMLReader getXMLReader(){
    return (org.xml.sax.XMLReader) null;
  }
  public void setSystemId(java.lang.String arg1){
  }
  public static org.xml.sax.InputSource sourceToInputSource(javax.xml.transform.Source arg1){
    return (org.xml.sax.InputSource) null;
  }
  public void setXMLReader(org.xml.sax.XMLReader arg1){
  }
  public void setInputSource(org.xml.sax.InputSource arg1){
  }
  public org.xml.sax.InputSource getInputSource(){
    return (org.xml.sax.InputSource) null;
  }
}
