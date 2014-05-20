package org.apache.xml.utils;

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


public class SAXSourceLocator
  extends org.xml.sax.helpers.LocatorImpl  implements java.io.Serializable, javax.xml.transform.SourceLocator
{
  // Constructors

  public SAXSourceLocator(){
    super();
  }
  public SAXSourceLocator(org.xml.sax.Locator arg1){
    super();
  }
  public SAXSourceLocator(javax.xml.transform.SourceLocator arg1){
    super();
  }
  public SAXSourceLocator(org.xml.sax.SAXParseException arg1){
    super();
  }
  // Methods

  public int getLineNumber(){
    return 0;
  }
  public java.lang.String getPublicId(){
    return (java.lang.String) null;
  }
  public java.lang.String getSystemId(){
    return (java.lang.String) null;
  }
  public int getColumnNumber(){
    return 0;
  }
}
