package org.xmlpull.v1;

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
public class XmlPullParserException
  extends java.lang.Exception{
  // Fields

  protected java.lang.Throwable detail;

  protected int row;

  protected int column;

  // Constructors

  public XmlPullParserException(java.lang.String arg1){
    super();
  }
  public XmlPullParserException(java.lang.String arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("xmlPullParser") XmlPullParser arg2, java.lang.Throwable arg3){
    super();
  }
  // Methods

  public void printStackTrace(){
  }
  public int getLineNumber(){
    return 0;
  }
  public int getColumnNumber(){
    return 0;
  }
  public java.lang.Throwable getDetail(){
    return (java.lang.Throwable) null;
  }
}
