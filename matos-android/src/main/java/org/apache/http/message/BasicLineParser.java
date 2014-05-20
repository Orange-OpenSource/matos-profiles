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
public class BasicLineParser
  implements LineParser
{
  // Fields

  public static final BasicLineParser DEFAULT = null;

  protected final org.apache.http.ProtocolVersion protocol = (org.apache.http.ProtocolVersion) null;

  // Constructors

  public BasicLineParser(org.apache.http.ProtocolVersion arg1){
  }
  public BasicLineParser(){
  }
  // Methods

  public static final org.apache.http.Header parseHeader(java.lang.String arg1, LineParser arg2) throws org.apache.http.ParseException{
    return (org.apache.http.Header) null;
  }
  public org.apache.http.Header parseHeader(org.apache.http.util.CharArrayBuffer arg1) throws org.apache.http.ParseException{
    return (org.apache.http.Header) null;
  }
  public static final org.apache.http.ProtocolVersion parseProtocolVersion(java.lang.String arg1, LineParser arg2) throws org.apache.http.ParseException{
    return (org.apache.http.ProtocolVersion) null;
  }
  public org.apache.http.ProtocolVersion parseProtocolVersion(org.apache.http.util.CharArrayBuffer arg1, ParserCursor arg2) throws org.apache.http.ParseException{
    return (org.apache.http.ProtocolVersion) null;
  }
  protected org.apache.http.ProtocolVersion createProtocolVersion(int arg1, int arg2){
    return (org.apache.http.ProtocolVersion) null;
  }
  public boolean hasProtocolVersion(org.apache.http.util.CharArrayBuffer arg1, ParserCursor arg2){
    return false;
  }
  public static final org.apache.http.RequestLine parseRequestLine(java.lang.String arg1, LineParser arg2) throws org.apache.http.ParseException{
    return (org.apache.http.RequestLine) null;
  }
  public org.apache.http.RequestLine parseRequestLine(org.apache.http.util.CharArrayBuffer arg1, ParserCursor arg2) throws org.apache.http.ParseException{
    return (org.apache.http.RequestLine) null;
  }
  protected org.apache.http.RequestLine createRequestLine(java.lang.String arg1, java.lang.String arg2, org.apache.http.ProtocolVersion arg3){
    return (org.apache.http.RequestLine) null;
  }
  public static final org.apache.http.StatusLine parseStatusLine(java.lang.String arg1, LineParser arg2) throws org.apache.http.ParseException{
    return (org.apache.http.StatusLine) null;
  }
  public org.apache.http.StatusLine parseStatusLine(org.apache.http.util.CharArrayBuffer arg1, ParserCursor arg2) throws org.apache.http.ParseException{
    return (org.apache.http.StatusLine) null;
  }
  protected org.apache.http.StatusLine createStatusLine(org.apache.http.ProtocolVersion arg1, int arg2, java.lang.String arg3){
    return (org.apache.http.StatusLine) null;
  }
  protected void skipWhitespace(org.apache.http.util.CharArrayBuffer arg1, ParserCursor arg2){
  }
}
