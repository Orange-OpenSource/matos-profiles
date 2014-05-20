package com.android.server;

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
public class PreferredComponent
{
  // Classes

  public static interface Callbacks
  {
    // Methods
	@com.francetelecom.rd.stubs.annotation.CallBack("Callbacks")
    public boolean onReadTag(java.lang.String arg1, org.xmlpull.v1.XmlPullParser arg2) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException;
  }
  // Fields

  public final int mMatch = 0;

  public final android.content.ComponentName mComponent = (android.content.ComponentName) null;

  // Constructors

  public PreferredComponent(@com.francetelecom.rd.stubs.annotation.CallBackRegister("Callbacks") PreferredComponent.Callbacks arg1, int arg2, android.content.ComponentName [] arg3, android.content.ComponentName arg4){
  }
  public PreferredComponent(@com.francetelecom.rd.stubs.annotation.CallBackRegister("Callbacks") PreferredComponent.Callbacks arg1, org.xmlpull.v1.XmlPullParser arg2) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException{
  }
  // Methods

  public void dump(java.io.PrintWriter arg1, java.lang.String arg2, java.lang.Object arg3){
  }
  public void writeToXml(@com.francetelecom.rd.stubs.annotation.CallBackRegister("xmlSerializer") org.xmlpull.v1.XmlSerializer arg1) throws java.io.IOException{
  }
  public java.lang.String getParseError(){
    return (java.lang.String) null;
  }
  public boolean sameSet(java.util.List<android.content.pm.ResolveInfo> arg1, int arg2){
    return false;
  }
}
