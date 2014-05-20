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


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public class Document
  extends Node{
  // Fields

  protected int rootIndex;

  // Constructors

  public Document(){
    super();
  }
  // Methods

  public java.lang.String getName(){
    return (java.lang.String) null;
  }
  public void write(@com.francetelecom.rd.stubs.annotation.CallBackRegister("xmlSerializer") org.xmlpull.v1.XmlSerializer arg1) throws java.io.IOException{
  }
  public void parse(@com.francetelecom.rd.stubs.annotation.CallBackRegister("xmlPullParser") org.xmlpull.v1.XmlPullParser arg1) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException{
  }
  public java.lang.String getEncoding(){
    return (java.lang.String) null;
  }
  public void setEncoding(java.lang.String arg1){
  }
  public void removeChild(int arg1){
  }
  public void setStandalone(java.lang.Boolean arg1){
  }
  public java.lang.Boolean getStandalone(){
    return (java.lang.Boolean) null;
  }
  public void addChild(int arg1, int arg2, java.lang.Object arg3){
  }
  public Element getRootElement(){
    return (Element) null;
  }
}
