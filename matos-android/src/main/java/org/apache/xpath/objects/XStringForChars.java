package org.apache.xpath.objects;

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


public class XStringForChars
  extends XString{
  // Fields

  protected java.lang.String m_strCache;

  // Constructors

  public XStringForChars(char [] arg1, int arg2, int arg3){
    super((java.lang.Object) null);
  }
  private XStringForChars(java.lang.String arg1){
    super((java.lang.Object) null);
  }
  // Methods

  public char charAt(int arg1){
    return '\u0000';
  }
  public void getChars(int arg1, int arg2, char [] arg3, int arg4){
  }
  public int length(){
    return 0;
  }
  public java.lang.String str(){
    return (java.lang.String) null;
  }
  public java.lang.Object object(){
    return (java.lang.Object) null;
  }
  public void dispatchCharactersEvents(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handle") org.xml.sax.ContentHandler arg1) throws org.xml.sax.SAXException{
  }
  public void appendToFsb(org.apache.xml.utils.FastStringBuffer arg1){
  }
  public boolean hasString(){
    return false;
  }
  public void dispatchAsComment(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handle") org.xml.sax.ext.LexicalHandler arg1) throws org.xml.sax.SAXException{
  }
  public org.apache.xml.utils.FastStringBuffer fsb(){
    return (org.apache.xml.utils.FastStringBuffer) null;
  }
}
