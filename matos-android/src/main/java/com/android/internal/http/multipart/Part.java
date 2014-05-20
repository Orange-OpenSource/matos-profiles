package com.android.internal.http.multipart;

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


public abstract class Part
{
  // Fields

  protected static final java.lang.String BOUNDARY = (java.lang.String) null;

  protected static final byte [] BOUNDARY_BYTES = null;

  protected static final java.lang.String CRLF = (java.lang.String) null;

  protected static final byte [] CRLF_BYTES = null;

  protected static final java.lang.String QUOTE = (java.lang.String) null;

  protected static final byte [] QUOTE_BYTES = null;

  protected static final java.lang.String EXTRA = (java.lang.String) null;

  protected static final byte [] EXTRA_BYTES = null;

  protected static final java.lang.String CONTENT_DISPOSITION = (java.lang.String) null;

  protected static final byte [] CONTENT_DISPOSITION_BYTES = null;

  protected static final java.lang.String CONTENT_TYPE = (java.lang.String) null;

  protected static final byte [] CONTENT_TYPE_BYTES = null;

  protected static final java.lang.String CHARSET = (java.lang.String) null;

  protected static final byte [] CHARSET_BYTES = null;

  protected static final java.lang.String CONTENT_TRANSFER_ENCODING = (java.lang.String) null;

  protected static final byte [] CONTENT_TRANSFER_ENCODING_BYTES = null;

  // Constructors

  public Part(){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public abstract java.lang.String getName();
  public long length() throws java.io.IOException{
    return 0l;
  }
  public void send(java.io.OutputStream arg1) throws java.io.IOException{
  }
  public abstract java.lang.String getContentType();
  public boolean isRepeatable(){
    return false;
  }
  protected abstract void sendData(java.io.OutputStream arg1) throws java.io.IOException;
  public abstract java.lang.String getTransferEncoding();
  public static java.lang.String getBoundary(){
    return (java.lang.String) null;
  }
  public abstract java.lang.String getCharSet();
  protected byte [] getPartBoundary(){
    return (byte []) null;
  }
  protected void sendStart(java.io.OutputStream arg1) throws java.io.IOException{
  }
  protected void sendDispositionHeader(java.io.OutputStream arg1) throws java.io.IOException{
  }
  protected void sendContentTypeHeader(java.io.OutputStream arg1) throws java.io.IOException{
  }
  protected void sendTransferEncodingHeader(java.io.OutputStream arg1) throws java.io.IOException{
  }
  protected void sendEndOfHeader(java.io.OutputStream arg1) throws java.io.IOException{
  }
  protected abstract long lengthOfData() throws java.io.IOException;
  protected void sendEnd(java.io.OutputStream arg1) throws java.io.IOException{
  }
  public static void sendParts(java.io.OutputStream arg1, Part [] arg2) throws java.io.IOException{
  }
  public static void sendParts(java.io.OutputStream arg1, Part [] arg2, byte [] arg3) throws java.io.IOException{
  }
  public static long getLengthOfParts(Part [] arg1) throws java.io.IOException{
    return 0l;
  }
  public static long getLengthOfParts(Part [] arg1, byte [] arg2) throws java.io.IOException{
    return 0l;
  }
}
