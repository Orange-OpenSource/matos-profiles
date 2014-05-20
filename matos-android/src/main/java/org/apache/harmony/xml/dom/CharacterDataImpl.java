package org.apache.harmony.xml.dom;

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
public abstract class CharacterDataImpl
  extends LeafNodeImpl  implements org.w3c.dom.CharacterData
{
  // Fields

  protected java.lang.StringBuffer buffer;

  // Constructors

  CharacterDataImpl(DocumentImpl arg1, java.lang.String arg2){
    super((DocumentImpl) null);
  }
  // Methods

  public int getLength(){
    return 0;
  }
  public java.lang.String getData() throws org.w3c.dom.DOMException{
    return (java.lang.String) null;
  }
  public void setData(java.lang.String arg1) throws org.w3c.dom.DOMException{
  }
  public java.lang.String getNodeValue(){
    return (java.lang.String) null;
  }
  public void appendData(java.lang.String arg1) throws org.w3c.dom.DOMException{
  }
  public java.lang.String substringData(int arg1, int arg2) throws org.w3c.dom.DOMException{
    return (java.lang.String) null;
  }
  public void insertData(int arg1, java.lang.String arg2) throws org.w3c.dom.DOMException{
  }
  public void deleteData(int arg1, int arg2) throws org.w3c.dom.DOMException{
  }
  public void replaceData(int arg1, int arg2, java.lang.String arg3) throws org.w3c.dom.DOMException{
  }
  public void appendDataTo(java.lang.StringBuilder arg1){
  }
}
