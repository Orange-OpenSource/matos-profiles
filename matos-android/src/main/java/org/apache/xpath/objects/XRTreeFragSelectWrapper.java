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


public class XRTreeFragSelectWrapper
  extends XRTreeFrag  implements java.lang.Cloneable
{
  // Constructors

  public XRTreeFragSelectWrapper(org.apache.xpath.Expression arg1){
    super(0, (org.apache.xpath.XPathContext) null, (org.apache.xpath.ExpressionNode) null);
  }
  // Methods

  public int getType(){
    return 0;
  }
  public java.lang.String str(){
    return (java.lang.String) null;
  }
  public XObject execute(org.apache.xpath.XPathContext arg1) throws javax.xml.transform.TransformerException{
    return (XObject) null;
  }
  public void fixupVariables(java.util.Vector arg1, int arg2){
  }
  public org.apache.xml.utils.XMLString xstr(){
    return (org.apache.xml.utils.XMLString) null;
  }
  public double num() throws javax.xml.transform.TransformerException{
    return 0.0d;
  }
  public void detach(){
  }
  public int rtf(){
    return 0;
  }
  public org.apache.xml.dtm.DTMIterator asNodeIterator(){
    return (org.apache.xml.dtm.DTMIterator) null;
  }
}
