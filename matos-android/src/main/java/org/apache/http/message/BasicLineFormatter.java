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
public class BasicLineFormatter
  implements LineFormatter
{
  // Fields

  public static final BasicLineFormatter DEFAULT = null;

  // Constructors

  public BasicLineFormatter(){
  }
  // Methods

  public static final java.lang.String formatHeader(org.apache.http.Header arg1, LineFormatter arg2){
    return (java.lang.String) null;
  }
  public org.apache.http.util.CharArrayBuffer formatHeader(org.apache.http.util.CharArrayBuffer arg1, org.apache.http.Header arg2){
    return (org.apache.http.util.CharArrayBuffer) null;
  }
  public static final java.lang.String formatRequestLine(org.apache.http.RequestLine arg1, LineFormatter arg2){
    return (java.lang.String) null;
  }
  public org.apache.http.util.CharArrayBuffer formatRequestLine(org.apache.http.util.CharArrayBuffer arg1, org.apache.http.RequestLine arg2){
    return (org.apache.http.util.CharArrayBuffer) null;
  }
  public static final java.lang.String formatStatusLine(org.apache.http.StatusLine arg1, LineFormatter arg2){
    return (java.lang.String) null;
  }
  public org.apache.http.util.CharArrayBuffer formatStatusLine(org.apache.http.util.CharArrayBuffer arg1, org.apache.http.StatusLine arg2){
    return (org.apache.http.util.CharArrayBuffer) null;
  }
  protected org.apache.http.util.CharArrayBuffer initBuffer(org.apache.http.util.CharArrayBuffer arg1){
    return (org.apache.http.util.CharArrayBuffer) null;
  }
  public static final java.lang.String formatProtocolVersion(org.apache.http.ProtocolVersion arg1, LineFormatter arg2){
    return (java.lang.String) null;
  }
  public org.apache.http.util.CharArrayBuffer appendProtocolVersion(org.apache.http.util.CharArrayBuffer arg1, org.apache.http.ProtocolVersion arg2){
    return (org.apache.http.util.CharArrayBuffer) null;
  }
  protected int estimateProtocolVersionLen(org.apache.http.ProtocolVersion arg1){
    return 0;
  }
  protected void doFormatRequestLine(org.apache.http.util.CharArrayBuffer arg1, org.apache.http.RequestLine arg2){
  }
  protected void doFormatStatusLine(org.apache.http.util.CharArrayBuffer arg1, org.apache.http.StatusLine arg2){
  }
  protected void doFormatHeader(org.apache.http.util.CharArrayBuffer arg1, org.apache.http.Header arg2){
  }
}
