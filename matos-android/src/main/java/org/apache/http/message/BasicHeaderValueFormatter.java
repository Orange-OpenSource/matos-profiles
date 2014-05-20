package org.apache.http.message;

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
public class BasicHeaderValueFormatter
  implements HeaderValueFormatter
{
  // Fields

  public static final BasicHeaderValueFormatter DEFAULT = null;

  public static final java.lang.String SEPARATORS = " ;,:@()<>\\\"/[]?={}\t";

  public static final java.lang.String UNSAFE_CHARS = "\"\\";

  // Constructors

  public BasicHeaderValueFormatter(){
  }
  // Methods

  public static final java.lang.String formatElements(org.apache.http.HeaderElement [] arg1, boolean arg2, HeaderValueFormatter arg3){
    return (java.lang.String) null;
  }
  public org.apache.http.util.CharArrayBuffer formatElements(org.apache.http.util.CharArrayBuffer arg1, org.apache.http.HeaderElement [] arg2, boolean arg3){
    return (org.apache.http.util.CharArrayBuffer) null;
  }
  protected int estimateElementsLen(org.apache.http.HeaderElement [] arg1){
    return 0;
  }
  public static final java.lang.String formatHeaderElement(org.apache.http.HeaderElement arg1, boolean arg2, HeaderValueFormatter arg3){
    return (java.lang.String) null;
  }
  public org.apache.http.util.CharArrayBuffer formatHeaderElement(org.apache.http.util.CharArrayBuffer arg1, org.apache.http.HeaderElement arg2, boolean arg3){
    return (org.apache.http.util.CharArrayBuffer) null;
  }
  protected int estimateHeaderElementLen(org.apache.http.HeaderElement arg1){
    return 0;
  }
  public static final java.lang.String formatParameters(org.apache.http.NameValuePair [] arg1, boolean arg2, HeaderValueFormatter arg3){
    return (java.lang.String) null;
  }
  public org.apache.http.util.CharArrayBuffer formatParameters(org.apache.http.util.CharArrayBuffer arg1, org.apache.http.NameValuePair [] arg2, boolean arg3){
    return (org.apache.http.util.CharArrayBuffer) null;
  }
  protected int estimateParametersLen(org.apache.http.NameValuePair [] arg1){
    return 0;
  }
  public static final java.lang.String formatNameValuePair(org.apache.http.NameValuePair arg1, boolean arg2, HeaderValueFormatter arg3){
    return (java.lang.String) null;
  }
  public org.apache.http.util.CharArrayBuffer formatNameValuePair(org.apache.http.util.CharArrayBuffer arg1, org.apache.http.NameValuePair arg2, boolean arg3){
    return (org.apache.http.util.CharArrayBuffer) null;
  }
  protected int estimateNameValuePairLen(org.apache.http.NameValuePair arg1){
    return 0;
  }
  protected void doFormatValue(org.apache.http.util.CharArrayBuffer arg1, java.lang.String arg2, boolean arg3){
  }
  protected boolean isSeparator(char arg1){
    return false;
  }
  protected boolean isUnsafe(char arg1){
    return false;
  }
}
