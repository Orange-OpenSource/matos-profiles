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


public class XNumber
  extends XObject{
  // Constructors

  public XNumber(double arg1){
    super();
  }
  public XNumber(java.lang.Number arg1){
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
  public void callVisitors(org.apache.xpath.ExpressionOwner arg1, org.apache.xpath.XPathVisitor arg2){
  }
  public double num(){
    return 0.0d;
  }
  public double num(org.apache.xpath.XPathContext arg1) throws javax.xml.transform.TransformerException{
    return 0.0d;
  }
  public boolean bool(){
    return false;
  }
  public boolean isStableNumber(){
    return false;
  }
  public java.lang.Object object(){
    return (java.lang.Object) null;
  }
}
