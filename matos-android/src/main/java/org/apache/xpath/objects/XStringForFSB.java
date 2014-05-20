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


public class XStringForFSB
  extends XString{
  // Fields

  protected java.lang.String m_strCache;

  protected int m_hash;

  // Constructors

  public XStringForFSB(org.apache.xml.utils.FastStringBuffer arg1, int arg2, int arg3){
    super((java.lang.Object) null);
  }
  private XStringForFSB(java.lang.String arg1){
    super((java.lang.Object) null);
  }
  // Methods

  public boolean equals(org.apache.xml.utils.XMLString arg1){
    return false;
  }
  public boolean equals(XObject arg1){
    return false;
  }
  public boolean equals(java.lang.String arg1){
    return false;
  }
  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public int hashCode(){
    return 0;
  }
  public int compareTo(org.apache.xml.utils.XMLString arg1){
    return 0;
  }
  public int indexOf(int arg1){
    return 0;
  }
  public int indexOf(int arg1, int arg2){
    return 0;
  }
  public char charAt(int arg1){
    return '\u0000';
  }
  public int compareToIgnoreCase(org.apache.xml.utils.XMLString arg1){
    return 0;
  }
  public org.apache.xml.utils.XMLString concat(java.lang.String arg1){
    return (org.apache.xml.utils.XMLString) null;
  }
  public boolean equalsIgnoreCase(java.lang.String arg1){
    return false;
  }
  public void getChars(int arg1, int arg2, char [] arg3, int arg4){
  }
  public int length(){
    return 0;
  }
  public boolean startsWith(org.apache.xml.utils.XMLString arg1, int arg2){
    return false;
  }
  public boolean startsWith(org.apache.xml.utils.XMLString arg1){
    return false;
  }
  public org.apache.xml.utils.XMLString substring(int arg1){
    return (org.apache.xml.utils.XMLString) null;
  }
  public org.apache.xml.utils.XMLString substring(int arg1, int arg2){
    return (org.apache.xml.utils.XMLString) null;
  }
  public org.apache.xml.utils.XMLString trim(){
    return (org.apache.xml.utils.XMLString) null;
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
  public org.apache.xml.utils.XMLString fixWhiteSpace(boolean arg1, boolean arg2, boolean arg3){
    return (org.apache.xml.utils.XMLString) null;
  }
  public double toDouble(){
    return 0.0d;
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
