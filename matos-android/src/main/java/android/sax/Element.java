package android.sax;

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


public class Element
{
  // Constructors

  Element(Element arg1, java.lang.String arg2, java.lang.String arg3, int arg4){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public Element getChild(java.lang.String arg1){
    return (Element) null;
  }
  public Element getChild(java.lang.String arg1, java.lang.String arg2){
    return (Element) null;
  }
  public Element requireChild(java.lang.String arg1){
    return (Element) null;
  }
  public Element requireChild(java.lang.String arg1, java.lang.String arg2){
    return (Element) null;
  }
  public void setElementListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister({"android.sax.StartElementListener.start", "android.sax.EndElementListener.end"}) ElementListener arg1){
  }
  public void setTextElementListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister({"android.sax.StartElementListener.start", "android.sax.EndElementListener.end"}) TextElementListener arg1){
  }
  public void setStartElementListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("android.sax.StartElementListener.start") StartElementListener arg1){
  }
  public void setEndElementListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("android.sax.EndElementListener.end") EndElementListener arg1){
  }
  public void setEndTextElementListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("android.sax.EndTextElementListener.end") EndTextElementListener arg1){
  }
}
