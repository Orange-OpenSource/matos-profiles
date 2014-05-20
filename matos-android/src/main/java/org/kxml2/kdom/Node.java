package org.kxml2.kdom;

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


public class Node
{
  // Fields

  public static final int DOCUMENT = 0;

  public static final int ELEMENT = 2;

  public static final int TEXT = 4;

  public static final int CDSECT = 5;

  public static final int ENTITY_REF = 6;

  public static final int IGNORABLE_WHITESPACE = 7;

  public static final int PROCESSING_INSTRUCTION = 8;

  public static final int COMMENT = 9;

  public static final int DOCDECL = 10;

  protected java.util.Vector children;

  protected java.lang.StringBuffer types;

  // Constructors

  public Node(){
  }
  // Methods

  public int indexOf(java.lang.String arg1, java.lang.String arg2, int arg3){
    return 0;
  }
  public void write(@com.francetelecom.rd.stubs.annotation.CallBackRegister("xmlSerializer") org.xmlpull.v1.XmlSerializer arg1) throws java.io.IOException{
  }
  public int getType(int arg1){
    return 0;
  }
  public void parse(@com.francetelecom.rd.stubs.annotation.CallBackRegister("xmlPullParser") org.xmlpull.v1.XmlPullParser arg1) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException{
  }
  public java.lang.String getText(int arg1){
    return (java.lang.String) null;
  }
  public boolean isText(int arg1){
    return false;
  }
  public int getChildCount(){
    return 0;
  }
  public void removeChild(int arg1){
  }
  public Element createElement(java.lang.String arg1, java.lang.String arg2){
    return (Element) null;
  }
  public java.lang.Object getChild(int arg1){
    return (java.lang.Object) null;
  }
  public void addChild(int arg1, int arg2, java.lang.Object arg3){
  }
  public void addChild(int arg1, java.lang.Object arg2){
  }
  public Element getElement(int arg1){
    return (Element) null;
  }
  public Element getElement(java.lang.String arg1, java.lang.String arg2){
    return (Element) null;
  }
  public void writeChildren(@com.francetelecom.rd.stubs.annotation.CallBackRegister("xmlSerializer") org.xmlpull.v1.XmlSerializer arg1) throws java.io.IOException{
  }
}
