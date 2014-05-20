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


public class XRTreeFrag
  extends XObject  implements java.lang.Cloneable
{
  // Fields

  protected boolean m_allowRelease;

  // Constructors

  public XRTreeFrag(int arg1, org.apache.xpath.XPathContext arg2, org.apache.xpath.ExpressionNode arg3){
    super();
  }
  public XRTreeFrag(int arg1, org.apache.xpath.XPathContext arg2){
    super();
  }
  public XRTreeFrag(org.apache.xpath.Expression arg1){
    super();
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
  public java.lang.String str(){
    return (java.lang.String) null;
  }
  public org.apache.xml.utils.XMLString xstr(){
    return (org.apache.xml.utils.XMLString) null;
  }
  public double num() throws javax.xml.transform.TransformerException{
    return 0.0d;
  }
  public boolean bool(){
    return false;
  }
  public void detach(){
  }
  public void allowDetachToRelease(boolean arg1){
  }
  public java.lang.Object object(){
    return (java.lang.Object) null;
  }
  public int rtf(){
    return 0;
  }
  public void appendToFsb(org.apache.xml.utils.FastStringBuffer arg1){
  }
  public org.apache.xml.dtm.DTMIterator asNodeIterator(){
    return (org.apache.xml.dtm.DTMIterator) null;
  }
  public org.w3c.dom.NodeList convertToNodeset(){
    return (org.w3c.dom.NodeList) null;
  }
}
