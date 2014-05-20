package android.util;

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
public class Xml
{
  // Classes

  public static enum Encoding
  {
    // Enum Constants

    US_ASCII((java.lang.String) null)
, UTF_8((java.lang.String) null)
, UTF_16((java.lang.String) null)
, ISO_8859_1((java.lang.String) null)
;
    // Fields

    // Constructors

    private Encoding(java.lang.String arg1){
    }
    // Methods

  }
  // Fields

  public static java.lang.String FEATURE_RELAXED;

  // Constructors

  public Xml(){
  }
  // Methods

  public static void parse(java.lang.String arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("handle") org.xml.sax.ContentHandler arg2) throws org.xml.sax.SAXException{
  }
  public static void parse(java.io.Reader arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("handle") org.xml.sax.ContentHandler arg2) throws java.io.IOException, org.xml.sax.SAXException{
  }
  public static void parse(java.io.InputStream arg1, Xml.Encoding arg2, @com.francetelecom.rd.stubs.annotation.CallBackRegister("handle") org.xml.sax.ContentHandler arg3) throws java.io.IOException, org.xml.sax.SAXException{
  }
  public static org.xmlpull.v1.XmlPullParser newPullParser(){
    return (org.xmlpull.v1.XmlPullParser) null;
  }
  public static org.xmlpull.v1.XmlSerializer newSerializer(){
    return (org.xmlpull.v1.XmlSerializer) null;
  }
  public static AttributeSet asAttributeSet(@com.francetelecom.rd.stubs.annotation.CallBackRegister("xmlPullParser") org.xmlpull.v1.XmlPullParser arg1){
    return (AttributeSet) null;
  }
  public static Xml.Encoding findEncodingByName(java.lang.String arg1) throws java.io.UnsupportedEncodingException{
    return (Xml.Encoding) null;
  }
}
