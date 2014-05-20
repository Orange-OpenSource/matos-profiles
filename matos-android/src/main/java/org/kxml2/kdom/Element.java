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
public class Element
  extends Node{
  // Fields

  protected java.lang.String namespace;

  protected java.lang.String name;

  protected java.util.Vector attributes;

  protected Node parent;

  protected java.util.Vector prefixes;

  // Constructors

  public Element(){
    super();
  }
  // Methods

  public void clear(){
  }
  public java.lang.String getName(){
    return (java.lang.String) null;
  }
  public Node getParent(){
    return (Node) null;
  }
  public void init(){
  }
  public void write(@com.francetelecom.rd.stubs.annotation.CallBackRegister("xmlSerializer") org.xmlpull.v1.XmlSerializer arg1) throws java.io.IOException{
  }
  public void setName(java.lang.String arg1){
  }
  protected void setParent(Node arg1){
  }
  public void parse(@com.francetelecom.rd.stubs.annotation.CallBackRegister("xmlPullParser") org.xmlpull.v1.XmlPullParser arg1) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException{
  }
  public Node getRoot(){
    return (Node) null;
  }
  public java.lang.String getNamespace(){
    return (java.lang.String) null;
  }
  public void setNamespace(java.lang.String arg1){
  }
  public void setAttribute(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3){
  }
  public void setPrefix(java.lang.String arg1, java.lang.String arg2){
  }
  public Element createElement(java.lang.String arg1, java.lang.String arg2){
    return (Element) null;
  }
  public java.lang.String getAttributeValue(int arg1){
    return (java.lang.String) null;
  }
  public java.lang.String getAttributeValue(java.lang.String arg1, java.lang.String arg2){
    return (java.lang.String) null;
  }
  public int getAttributeCount(){
    return 0;
  }
  public java.lang.String getAttributeNamespace(int arg1){
    return (java.lang.String) null;
  }
  public java.lang.String getAttributeName(int arg1){
    return (java.lang.String) null;
  }
  public java.lang.String getNamespaceUri(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public java.lang.String getNamespaceUri(int arg1){
    return (java.lang.String) null;
  }
  public int getNamespaceCount(){
    return 0;
  }
  public java.lang.String getNamespacePrefix(int arg1){
    return (java.lang.String) null;
  }
}
