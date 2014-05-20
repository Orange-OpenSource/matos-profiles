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


public class XObject
  extends org.apache.xpath.Expression  implements java.io.Serializable, java.lang.Cloneable
{
  // Fields

  protected java.lang.Object m_obj;

  public static final int CLASS_NULL = -1;

  public static final int CLASS_UNKNOWN = 0;

  public static final int CLASS_BOOLEAN = 1;

  public static final int CLASS_NUMBER = 2;

  public static final int CLASS_STRING = 3;

  public static final int CLASS_NODESET = 4;

  public static final int CLASS_RTREEFRAG = 5;

  public static final int CLASS_UNRESOLVEDVARIABLE = 600;

  // Constructors

  public XObject(){
    super();
  }
  public XObject(java.lang.Object arg1){
    super();
  }
  // Methods

  public boolean equals(XObject arg1){
    return false;
  }
  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public int getType(){
    return 0;
  }
  public void reset(){
  }
  public java.lang.String getTypeString(){
    return (java.lang.String) null;
  }
  public boolean deepEquals(org.apache.xpath.Expression arg1){
    return false;
  }
  public static XObject create(java.lang.Object arg1){
    return (XObject) null;
  }
  public static XObject create(java.lang.Object arg1, org.apache.xpath.XPathContext arg2){
    return (XObject) null;
  }
  protected void error(java.lang.String arg1) throws javax.xml.transform.TransformerException{
  }
  protected void error(java.lang.String arg1, java.lang.Object [] arg2) throws javax.xml.transform.TransformerException{
  }
  public java.lang.String str(){
    return (java.lang.String) null;
  }
  public XObject execute(org.apache.xpath.XPathContext arg1) throws javax.xml.transform.TransformerException{
    return (XObject) null;
  }
  public void fixupVariables(java.util.Vector arg1, int arg2){
  }
  public void callVisitors(org.apache.xpath.ExpressionOwner arg1, org.apache.xpath.XPathVisitor arg2){
  }
  public org.apache.xml.utils.XMLString xstr(){
    return (org.apache.xml.utils.XMLString) null;
  }
  public double num() throws javax.xml.transform.TransformerException{
    return 0.0d;
  }
  public boolean bool() throws javax.xml.transform.TransformerException{
    return false;
  }
  public void detach(){
  }
  public void allowDetachToRelease(boolean arg1){
  }
  public java.lang.Object object(){
    return (java.lang.Object) null;
  }
  public void dispatchCharactersEvents(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handle") org.xml.sax.ContentHandler arg1) throws org.xml.sax.SAXException{
  }
  public org.apache.xml.dtm.DTMIterator iter() throws javax.xml.transform.TransformerException{
    return (org.apache.xml.dtm.DTMIterator) null;
  }
  public org.w3c.dom.traversal.NodeIterator nodeset() throws javax.xml.transform.TransformerException{
    return (org.w3c.dom.traversal.NodeIterator) null;
  }
  public boolean greaterThanOrEqual(XObject arg1) throws javax.xml.transform.TransformerException{
    return false;
  }
  public boolean boolWithSideEffects() throws javax.xml.transform.TransformerException{
    return false;
  }
  public double numWithSideEffects() throws javax.xml.transform.TransformerException{
    return 0.0d;
  }
  protected void setObject(java.lang.Object arg1){
  }
  public void destruct(){
  }
  public int rtf(org.apache.xpath.XPathContext arg1){
    return 0;
  }
  public int rtf(){
    return 0;
  }
  public org.w3c.dom.DocumentFragment rtree(org.apache.xpath.XPathContext arg1){
    return (org.w3c.dom.DocumentFragment) null;
  }
  public org.w3c.dom.DocumentFragment rtree(){
    return (org.w3c.dom.DocumentFragment) null;
  }
  public XObject getFresh(){
    return (XObject) null;
  }
  public org.w3c.dom.NodeList nodelist() throws javax.xml.transform.TransformerException{
    return (org.w3c.dom.NodeList) null;
  }
  public org.apache.xpath.NodeSetDTM mutableNodeset() throws javax.xml.transform.TransformerException{
    return (org.apache.xpath.NodeSetDTM) null;
  }
  public java.lang.Object castToType(int arg1, org.apache.xpath.XPathContext arg2) throws javax.xml.transform.TransformerException{
    return (java.lang.Object) null;
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
}
