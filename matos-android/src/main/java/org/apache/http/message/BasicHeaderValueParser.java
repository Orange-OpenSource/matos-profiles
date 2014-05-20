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
public class BasicHeaderValueParser
  implements HeaderValueParser
{
  // Fields

  public static final BasicHeaderValueParser DEFAULT = null;

  // Constructors

  public BasicHeaderValueParser(){
  }
  // Methods

  public static final org.apache.http.HeaderElement [] parseElements(java.lang.String arg1, HeaderValueParser arg2) throws org.apache.http.ParseException{
    return (org.apache.http.HeaderElement []) null;
  }
  public org.apache.http.HeaderElement [] parseElements(org.apache.http.util.CharArrayBuffer arg1, ParserCursor arg2){
    return (org.apache.http.HeaderElement []) null;
  }
  public static final org.apache.http.HeaderElement parseHeaderElement(java.lang.String arg1, HeaderValueParser arg2) throws org.apache.http.ParseException{
    return (org.apache.http.HeaderElement) null;
  }
  public org.apache.http.HeaderElement parseHeaderElement(org.apache.http.util.CharArrayBuffer arg1, ParserCursor arg2){
    return (org.apache.http.HeaderElement) null;
  }
  public static final org.apache.http.NameValuePair parseNameValuePair(java.lang.String arg1, HeaderValueParser arg2) throws org.apache.http.ParseException{
    return (org.apache.http.NameValuePair) null;
  }
  public org.apache.http.NameValuePair parseNameValuePair(org.apache.http.util.CharArrayBuffer arg1, ParserCursor arg2){
    return (org.apache.http.NameValuePair) null;
  }
  public org.apache.http.NameValuePair parseNameValuePair(org.apache.http.util.CharArrayBuffer arg1, ParserCursor arg2, char [] arg3){
    return (org.apache.http.NameValuePair) null;
  }
  public static final org.apache.http.NameValuePair [] parseParameters(java.lang.String arg1, HeaderValueParser arg2) throws org.apache.http.ParseException{
    return (org.apache.http.NameValuePair []) null;
  }
  public org.apache.http.NameValuePair [] parseParameters(org.apache.http.util.CharArrayBuffer arg1, ParserCursor arg2){
    return (org.apache.http.NameValuePair []) null;
  }
  protected org.apache.http.HeaderElement createHeaderElement(java.lang.String arg1, java.lang.String arg2, org.apache.http.NameValuePair [] arg3){
    return (org.apache.http.HeaderElement) null;
  }
  protected org.apache.http.NameValuePair createNameValuePair(java.lang.String arg1, java.lang.String arg2){
    return (org.apache.http.NameValuePair) null;
  }
}
