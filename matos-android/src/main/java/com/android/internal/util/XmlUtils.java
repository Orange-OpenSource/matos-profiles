package com.android.internal.util;

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
public class XmlUtils
{
  // Constructors

  public XmlUtils(){
  }
  // Methods

  public static final void nextElement(@com.francetelecom.rd.stubs.annotation.CallBackRegister("xmlPullParser") org.xmlpull.v1.XmlPullParser arg1) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException{
  }
  public static void skipCurrentTag(@com.francetelecom.rd.stubs.annotation.CallBackRegister("xmlPullParser") org.xmlpull.v1.XmlPullParser arg1) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException{
  }
  public static final boolean convertValueToBoolean(java.lang.CharSequence arg1, boolean arg2){
    return false;
  }
  public static final int convertValueToInt(java.lang.CharSequence arg1, int arg2){
    return 0;
  }
  public static final void beginDocument(@com.francetelecom.rd.stubs.annotation.CallBackRegister("xmlPullParser") org.xmlpull.v1.XmlPullParser arg1, java.lang.String arg2) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException{
  }
  public static final int convertValueToList(java.lang.CharSequence arg1, java.lang.String [] arg2, int arg3){
    return 0;
  }
  public static final int convertValueToUnsignedInt(java.lang.String arg1, int arg2){
    return 0;
  }
  public static final int parseUnsignedIntAttribute(java.lang.CharSequence arg1){
    return 0;
  }
  public static final void writeMapXml(java.util.Map arg1, java.io.OutputStream arg2) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException{
  }
  public static final void writeMapXml(java.util.Map arg1, java.lang.String arg2, @com.francetelecom.rd.stubs.annotation.CallBackRegister("xmlSerializer") org.xmlpull.v1.XmlSerializer arg3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException{
  }
  public static final void writeListXml(java.util.List arg1, java.io.OutputStream arg2) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException{
  }
  public static final void writeListXml(java.util.List arg1, java.lang.String arg2, @com.francetelecom.rd.stubs.annotation.CallBackRegister("xmlSerializer") org.xmlpull.v1.XmlSerializer arg3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException{
  }
  public static final void writeSetXml(java.util.Set arg1, java.lang.String arg2, @com.francetelecom.rd.stubs.annotation.CallBackRegister("xmlSerializer") org.xmlpull.v1.XmlSerializer arg3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException{
  }
  public static final void writeByteArrayXml(byte [] arg1, java.lang.String arg2, @com.francetelecom.rd.stubs.annotation.CallBackRegister("xmlSerializer") org.xmlpull.v1.XmlSerializer arg3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException{
  }
  public static final void writeIntArrayXml(int [] arg1, java.lang.String arg2, @com.francetelecom.rd.stubs.annotation.CallBackRegister("xmlSerializer") org.xmlpull.v1.XmlSerializer arg3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException{
  }
  public static final void writeValueXml(java.lang.Object arg1, java.lang.String arg2, @com.francetelecom.rd.stubs.annotation.CallBackRegister("xmlSerializer") org.xmlpull.v1.XmlSerializer arg3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException{
  }
  public static final java.util.HashMap readMapXml(java.io.InputStream arg1) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException{
    return (java.util.HashMap) null;
  }
  public static final java.util.ArrayList readListXml(java.io.InputStream arg1) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException{
    return (java.util.ArrayList) null;
  }
  public static final java.util.HashSet readSetXml(java.io.InputStream arg1) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException{
    return (java.util.HashSet) null;
  }
  public static final java.util.HashMap readThisMapXml(@com.francetelecom.rd.stubs.annotation.CallBackRegister("xmlPullParser") org.xmlpull.v1.XmlPullParser arg1, java.lang.String arg2, java.lang.String [] arg3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException{
    return (java.util.HashMap) null;
  }
  public static final java.util.ArrayList readThisListXml(@com.francetelecom.rd.stubs.annotation.CallBackRegister("xmlPullParser") org.xmlpull.v1.XmlPullParser arg1, java.lang.String arg2, java.lang.String [] arg3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException{
    return (java.util.ArrayList) null;
  }
  public static final java.util.HashSet readThisSetXml(@com.francetelecom.rd.stubs.annotation.CallBackRegister("xmlPullParser") org.xmlpull.v1.XmlPullParser arg1, java.lang.String arg2, java.lang.String [] arg3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException{
    return (java.util.HashSet) null;
  }
  public static final int [] readThisIntArrayXml(@com.francetelecom.rd.stubs.annotation.CallBackRegister("xmlPullParser") org.xmlpull.v1.XmlPullParser arg1, java.lang.String arg2, java.lang.String [] arg3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException{
    return (int []) null;
  }
  public static final java.lang.Object readValueXml(@com.francetelecom.rd.stubs.annotation.CallBackRegister("xmlPullParser") org.xmlpull.v1.XmlPullParser arg1, java.lang.String [] arg2) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException{
    return (java.lang.Object) null;
  }
}
