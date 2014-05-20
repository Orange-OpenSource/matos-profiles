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


public class FastStringBuffer
{
  // Fields

  public static final int SUPPRESS_LEADING_WS = 1;

  public static final int SUPPRESS_TRAILING_WS = 2;

  public static final int SUPPRESS_BOTH = 3;

  // Constructors

  public FastStringBuffer(int arg1, int arg2, int arg3){
  }
  public FastStringBuffer(int arg1, int arg2){
  }
  public FastStringBuffer(int arg1){
  }
  public FastStringBuffer(){
  }
  private FastStringBuffer(FastStringBuffer arg1){
  }
  // Methods

  public final java.lang.String toString(){
    return (java.lang.String) null;
  }
  public final void append(char arg1){
  }
  public final void append(java.lang.String arg1){
  }
  public final void append(java.lang.StringBuffer arg1){
  }
  public final void append(char [] arg1, int arg2, int arg3){
  }
  public final void append(FastStringBuffer arg1){
  }
  public char charAt(int arg1){
    return '\u0000';
  }
  public final int length(){
    return 0;
  }
  public final int size(){
    return 0;
  }
  public final void setLength(int arg1){
  }
  public final void reset(){
  }
  public boolean isWhitespace(int arg1, int arg2){
    return false;
  }
  public java.lang.String getString(int arg1, int arg2){
    return (java.lang.String) null;
  }
  public int sendNormalizedSAXcharacters(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handle") org.xml.sax.ContentHandler arg1, int arg2, int arg3) throws org.xml.sax.SAXException{
    return 0;
  }
  public static void sendNormalizedSAXcharacters(char [] arg1, int arg2, int arg3, @com.francetelecom.rd.stubs.annotation.CallBackRegister("handle") org.xml.sax.ContentHandler arg4) throws org.xml.sax.SAXException{
  }
  public void sendSAXcharacters(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handle") org.xml.sax.ContentHandler arg1, int arg2, int arg3) throws org.xml.sax.SAXException{
  }
  protected java.lang.String getOneChunkString(int arg1, int arg2, int arg3){
    return (java.lang.String) null;
  }
  public void sendSAXComment(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handle") org.xml.sax.ext.LexicalHandler arg1, int arg2, int arg3) throws org.xml.sax.SAXException{
  }
}
