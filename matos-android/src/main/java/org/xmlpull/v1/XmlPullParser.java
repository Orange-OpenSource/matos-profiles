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
public interface XmlPullParser
{
  // Fields

  public static final java.lang.String NO_NAMESPACE = "";

  public static final int START_DOCUMENT = 0;

  public static final int END_DOCUMENT = 1;

  public static final int START_TAG = 2;

  public static final int END_TAG = 3;

  public static final int TEXT = 4;

  public static final int CDSECT = 5;

  public static final int ENTITY_REF = 6;

  public static final int IGNORABLE_WHITESPACE = 7;

  public static final int PROCESSING_INSTRUCTION = 8;

  public static final int COMMENT = 9;

  public static final int DOCDECL = 10;

  public static final java.lang.String [] TYPES = null;

  public static final java.lang.String FEATURE_PROCESS_NAMESPACES = "http://xmlpull.org/v1/doc/features.html#process-namespaces";

  public static final java.lang.String FEATURE_REPORT_NAMESPACE_ATTRIBUTES = "http://xmlpull.org/v1/doc/features.html#report-namespace-prefixes";

  public static final java.lang.String FEATURE_PROCESS_DOCDECL = "http://xmlpull.org/v1/doc/features.html#process-docdecl";

  public static final java.lang.String FEATURE_VALIDATION = "http://xmlpull.org/v1/doc/features.html#validation";

  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("xmlPullParser")
  public void setProperty(java.lang.String arg1, java.lang.Object arg2) throws XmlPullParserException;
  @com.francetelecom.rd.stubs.annotation.CallBack("xmlPullParser")
  public java.lang.Object getProperty(java.lang.String arg1);
  @com.francetelecom.rd.stubs.annotation.CallBack("xmlPullParser")
  public java.lang.String getName();
  @com.francetelecom.rd.stubs.annotation.CallBack("xmlPullParser")
  public int next() throws XmlPullParserException, java.io.IOException;
  @com.francetelecom.rd.stubs.annotation.CallBack("xmlPullParser")
  public int getLineNumber();
  @com.francetelecom.rd.stubs.annotation.CallBack("xmlPullParser")
  public boolean isWhitespace() throws XmlPullParserException;
  @com.francetelecom.rd.stubs.annotation.CallBack("xmlPullParser")
  public int nextToken() throws XmlPullParserException, java.io.IOException;
  @com.francetelecom.rd.stubs.annotation.CallBack("xmlPullParser")
  public void setInput(java.io.Reader arg1) throws XmlPullParserException;
  @com.francetelecom.rd.stubs.annotation.CallBack("xmlPullParser")
  public void setInput(java.io.InputStream arg1, java.lang.String arg2) throws XmlPullParserException;
  @com.francetelecom.rd.stubs.annotation.CallBack("xmlPullParser")
  public int getColumnNumber();
  @com.francetelecom.rd.stubs.annotation.CallBack("xmlPullParser")
  public java.lang.String getText();
  @com.francetelecom.rd.stubs.annotation.CallBack("xmlPullParser")
  public java.lang.String getNamespace(java.lang.String arg1);
  @com.francetelecom.rd.stubs.annotation.CallBack("xmlPullParser")
  public java.lang.String getNamespace();
  @com.francetelecom.rd.stubs.annotation.CallBack("xmlPullParser")
  public java.lang.String getPrefix();
  @com.francetelecom.rd.stubs.annotation.CallBack("xmlPullParser")
  public java.lang.String getInputEncoding();
  @com.francetelecom.rd.stubs.annotation.CallBack("xmlPullParser")
  public boolean getFeature(java.lang.String arg1);
  @com.francetelecom.rd.stubs.annotation.CallBack("xmlPullParser")
  public void setFeature(java.lang.String arg1, boolean arg2) throws XmlPullParserException;
  @com.francetelecom.rd.stubs.annotation.CallBack("xmlPullParser")
  public int getDepth();
  @com.francetelecom.rd.stubs.annotation.CallBack("xmlPullParser")
  public java.lang.String getAttributeValue(int arg1);
  @com.francetelecom.rd.stubs.annotation.CallBack("xmlPullParser")
  public java.lang.String getAttributeValue(java.lang.String arg1, java.lang.String arg2);
  @com.francetelecom.rd.stubs.annotation.CallBack("xmlPullParser")
  public int getAttributeCount();
  @com.francetelecom.rd.stubs.annotation.CallBack("xmlPullParser")
  public java.lang.String getAttributeNamespace(int arg1);
  @com.francetelecom.rd.stubs.annotation.CallBack("xmlPullParser")
  public java.lang.String getAttributeName(int arg1);
  @com.francetelecom.rd.stubs.annotation.CallBack("xmlPullParser")
  public java.lang.String getNamespaceUri(int arg1) throws XmlPullParserException;
  @com.francetelecom.rd.stubs.annotation.CallBack("xmlPullParser")
  public int getNamespaceCount(int arg1) throws XmlPullParserException;
  @com.francetelecom.rd.stubs.annotation.CallBack("xmlPullParser")
  public java.lang.String getNamespacePrefix(int arg1) throws XmlPullParserException;
  @com.francetelecom.rd.stubs.annotation.CallBack("xmlPullParser")
  public int getEventType() throws XmlPullParserException;
  @com.francetelecom.rd.stubs.annotation.CallBack("xmlPullParser")
  public java.lang.String getPositionDescription();
  @com.francetelecom.rd.stubs.annotation.CallBack("xmlPullParser")
  public void require(int arg1, java.lang.String arg2, java.lang.String arg3) throws XmlPullParserException, java.io.IOException;
  @com.francetelecom.rd.stubs.annotation.CallBack("xmlPullParser")
  public java.lang.String getAttributePrefix(int arg1);
  @com.francetelecom.rd.stubs.annotation.CallBack("xmlPullParser")
  public boolean isEmptyElementTag() throws XmlPullParserException;
  @com.francetelecom.rd.stubs.annotation.CallBack("xmlPullParser")
  public void defineEntityReplacementText(java.lang.String arg1, java.lang.String arg2) throws XmlPullParserException;
  @com.francetelecom.rd.stubs.annotation.CallBack("xmlPullParser")
  public char [] getTextCharacters(int [] arg1);
  @com.francetelecom.rd.stubs.annotation.CallBack("xmlPullParser")
  public java.lang.String getAttributeType(int arg1);
  @com.francetelecom.rd.stubs.annotation.CallBack("xmlPullParser")
  public boolean isAttributeDefault(int arg1);
  @com.francetelecom.rd.stubs.annotation.CallBack("xmlPullParser")
  public java.lang.String nextText() throws XmlPullParserException, java.io.IOException;
  @com.francetelecom.rd.stubs.annotation.CallBack("xmlPullParser")
  public int nextTag() throws XmlPullParserException, java.io.IOException;
}
