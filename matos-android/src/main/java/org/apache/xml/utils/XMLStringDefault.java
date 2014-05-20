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


public class XMLStringDefault
  implements XMLString
{
  // Constructors

  public XMLStringDefault(java.lang.String arg1){
  }
  // Methods

  public boolean equals(java.lang.String arg1){
    return false;
  }
  public boolean equals(XMLString arg1){
    return false;
  }
  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public int hashCode(){
    return 0;
  }
  public int compareTo(XMLString arg1){
    return 0;
  }
  public int indexOf(int arg1){
    return 0;
  }
  public int indexOf(int arg1, int arg2){
    return 0;
  }
  public int indexOf(java.lang.String arg1){
    return 0;
  }
  public int indexOf(XMLString arg1){
    return 0;
  }
  public int indexOf(java.lang.String arg1, int arg2){
    return 0;
  }
  public char charAt(int arg1){
    return '\u0000';
  }
  public int compareToIgnoreCase(XMLString arg1){
    return 0;
  }
  public XMLString concat(java.lang.String arg1){
    return (XMLString) null;
  }
  public boolean endsWith(java.lang.String arg1){
    return false;
  }
  public boolean equalsIgnoreCase(java.lang.String arg1){
    return false;
  }
  public void getChars(int arg1, int arg2, char [] arg3, int arg4){
  }
  public int lastIndexOf(int arg1){
    return 0;
  }
  public int lastIndexOf(int arg1, int arg2){
    return 0;
  }
  public int lastIndexOf(java.lang.String arg1){
    return 0;
  }
  public int lastIndexOf(java.lang.String arg1, int arg2){
    return 0;
  }
  public int length(){
    return 0;
  }
  public boolean startsWith(java.lang.String arg1, int arg2){
    return false;
  }
  public boolean startsWith(XMLString arg1, int arg2){
    return false;
  }
  public boolean startsWith(java.lang.String arg1){
    return false;
  }
  public boolean startsWith(XMLString arg1){
    return false;
  }
  public XMLString substring(int arg1){
    return (XMLString) null;
  }
  public XMLString substring(int arg1, int arg2){
    return (XMLString) null;
  }
  public XMLString toLowerCase(java.util.Locale arg1){
    return (XMLString) null;
  }
  public XMLString toLowerCase(){
    return (XMLString) null;
  }
  public XMLString toUpperCase(java.util.Locale arg1){
    return (XMLString) null;
  }
  public XMLString toUpperCase(){
    return (XMLString) null;
  }
  public XMLString trim(){
    return (XMLString) null;
  }
  public void dispatchCharactersEvents(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handle") org.xml.sax.ContentHandler arg1) throws org.xml.sax.SAXException{
  }
  public XMLString fixWhiteSpace(boolean arg1, boolean arg2, boolean arg3){
    return (XMLString) null;
  }
  public double toDouble(){
    return 0.0d;
  }
  public boolean hasString(){
    return false;
  }
  public void dispatchAsComment(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handle") org.xml.sax.ext.LexicalHandler arg1) throws org.xml.sax.SAXException{
  }
}
