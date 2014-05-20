package javax.sip.message;

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


public interface Message
  extends java.io.Serializable, java.lang.Cloneable
{
  // Methods

  public boolean equals(java.lang.Object arg1);
  public java.lang.String toString();
  public int hashCode();
  public java.lang.Object clone();
  public java.lang.Object getContent();
  public javax.sip.header.ContentLengthHeader getContentLength();
  public void setContentLength(javax.sip.header.ContentLengthHeader arg1);
  public javax.sip.header.ContentEncodingHeader getContentEncoding();
  public java.util.ListIterator getHeaders(java.lang.String arg1);
  public void addFirst(javax.sip.header.Header arg1) throws javax.sip.SipException, java.lang.NullPointerException;
  public void removeFirst(java.lang.String arg1) throws java.lang.NullPointerException;
  public void removeLast(java.lang.String arg1) throws java.lang.NullPointerException;
  public void setContentEncoding(javax.sip.header.ContentEncodingHeader arg1);
  public javax.sip.header.ContentLanguageHeader getContentLanguage();
  public void setContentLanguage(javax.sip.header.ContentLanguageHeader arg1);
  public void setHeader(javax.sip.header.Header arg1);
  public void addHeader(javax.sip.header.Header arg1);
  public void removeHeader(java.lang.String arg1);
  public void setExpires(javax.sip.header.ExpiresHeader arg1);
  public javax.sip.header.ExpiresHeader getExpires();
  public void setApplicationData(java.lang.Object arg1);
  public java.lang.Object getApplicationData();
  public javax.sip.header.Header getHeader(java.lang.String arg1);
  public void setContentDisposition(javax.sip.header.ContentDispositionHeader arg1);
  public void setContent(java.lang.Object arg1, javax.sip.header.ContentTypeHeader arg2) throws java.text.ParseException;
  public java.util.ListIterator getHeaderNames();
  public byte [] getRawContent();
  public void addLast(javax.sip.header.Header arg1) throws javax.sip.SipException, java.lang.NullPointerException;
  public java.util.ListIterator getUnrecognizedHeaders();
  public javax.sip.header.ContentDispositionHeader getContentDisposition();
  public void removeContent();
  @com.francetelecom.rd.stubs.annotation.FieldGet("SIPVersion")
  public java.lang.String getSIPVersion();
  public void setSIPVersion(@com.francetelecom.rd.stubs.annotation.FieldSet("SIPVersion") java.lang.String arg1) throws java.text.ParseException;
}
