package org.ccil.cowan.tagsoup;

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
{
  // Constructors

  public Element(ElementType arg1, boolean arg2){
  }
  // Methods

  public java.lang.String name(){
    return (java.lang.String) null;
  }
  public ElementType parent(){
    return (ElementType) null;
  }
  public ElementType type(){
    return (ElementType) null;
  }
  public int flags(){
    return 0;
  }
  public Element next(){
    return (Element) null;
  }
  public void clean(){
  }
  public AttributesImpl atts(){
    return (AttributesImpl) null;
  }
  public void setAttribute(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3){
  }
  public java.lang.String namespace(){
    return (java.lang.String) null;
  }
  public java.lang.String localName(){
    return (java.lang.String) null;
  }
  public int model(){
    return 0;
  }
  public int memberOf(){
    return 0;
  }
  public boolean canContain(Element arg1){
    return false;
  }
  public void setNext(Element arg1){
  }
  public void preclose(){
  }
  public boolean isPreclosed(){
    return false;
  }
  public void anonymize(){
  }
}
