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


public class XNodeSet
  extends org.apache.xpath.axes.NodeSequence{
  // Constructors

  protected XNodeSet(){
    super((java.lang.Object) null);
  }
  public XNodeSet(org.apache.xml.dtm.DTMIterator arg1){
    super((java.lang.Object) null);
  }
  public XNodeSet(XNodeSet arg1){
    super((java.lang.Object) null);
  }
  public XNodeSet(org.apache.xml.dtm.DTMManager arg1){
    super((java.lang.Object) null);
  }
  public XNodeSet(int arg1, org.apache.xml.dtm.DTMManager arg2){
    super((java.lang.Object) null);
  }
  // Methods

  public boolean equals(XObject arg1){
    return false;
  }
  public int getType(){
    return 0;
  }
  public java.lang.String getTypeString(){
    return (java.lang.String) null;
  }
  public void release(org.apache.xml.dtm.DTMIterator arg1){
  }
  public java.lang.String str(){
    return (java.lang.String) null;
  }
  public org.apache.xml.utils.XMLString xstr(){
    return (org.apache.xml.utils.XMLString) null;
  }
  public double num(){
    return 0.0d;
  }
  public boolean bool(){
    return false;
  }
  public java.lang.Object object(){
    return (java.lang.Object) null;
  }
  public void dispatchCharactersEvents(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handle") org.xml.sax.ContentHandler arg1) throws org.xml.sax.SAXException{
  }
  public org.apache.xml.dtm.DTMIterator iter(){
    return (org.apache.xml.dtm.DTMIterator) null;
  }
  public org.w3c.dom.traversal.NodeIterator nodeset() throws javax.xml.transform.TransformerException{
    return (org.w3c.dom.traversal.NodeIterator) null;
  }
  public boolean greaterThanOrEqual(XObject arg1) throws javax.xml.transform.TransformerException{
    return false;
  }
  public boolean boolWithSideEffects(){
    return false;
  }
  public double numWithSideEffects(){
    return 0.0d;
  }
  public XObject getFresh(){
    return (XObject) null;
  }
  public org.w3c.dom.NodeList nodelist() throws javax.xml.transform.TransformerException{
    return (org.w3c.dom.NodeList) null;
  }
  public org.apache.xpath.NodeSetDTM mutableNodeset(){
    return (org.apache.xpath.NodeSetDTM) null;
  }
  public boolean lessThan(XObject arg1) throws javax.xml.transform.TransformerException{
    return false;
  }
  public boolean lessThanOrEqual(XObject arg1) throws javax.xml.transform.TransformerException{
    return false;
  }
  public boolean greaterThan(XObject arg1) throws javax.xml.transform.TransformerException{
    return false;
  }
  public boolean notEquals(XObject arg1) throws javax.xml.transform.TransformerException{
    return false;
  }
  public void appendToFsb(org.apache.xml.utils.FastStringBuffer arg1){
  }
  public org.apache.xml.dtm.DTMIterator iterRaw(){
    return (org.apache.xml.dtm.DTMIterator) null;
  }
  public double getNumberFromNode(int arg1){
    return 0.0d;
  }
  public org.apache.xml.utils.XMLString getStringFromNode(int arg1){
    return (org.apache.xml.utils.XMLString) null;
  }
}
