package com.google.android.mms.pdu;

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


public class PduPart
{
  // Fields

  public static final int P_Q = 128;

  public static final int P_CHARSET = 129;

  public static final int P_LEVEL = 130;

  public static final int P_TYPE = 131;

  public static final int P_DEP_NAME = 133;

  public static final int P_DEP_FILENAME = 134;

  public static final int P_DIFFERENCES = 135;

  public static final int P_PADDING = 136;

  public static final int P_CT_MR_TYPE = 137;

  public static final int P_DEP_START = 138;

  public static final int P_DEP_START_INFO = 139;

  public static final int P_DEP_COMMENT = 140;

  public static final int P_DEP_DOMAIN = 141;

  public static final int P_MAX_AGE = 142;

  public static final int P_DEP_PATH = 143;

  public static final int P_SECURE = 144;

  public static final int P_SEC = 145;

  public static final int P_MAC = 146;

  public static final int P_CREATION_DATE = 147;

  public static final int P_MODIFICATION_DATE = 148;

  public static final int P_READ_DATE = 149;

  public static final int P_SIZE = 150;

  public static final int P_NAME = 151;

  public static final int P_FILENAME = 152;

  public static final int P_START = 153;

  public static final int P_START_INFO = 154;

  public static final int P_COMMENT = 155;

  public static final int P_DOMAIN = 156;

  public static final int P_PATH = 157;

  public static final int P_CONTENT_TYPE = 145;

  public static final int P_CONTENT_LOCATION = 142;

  public static final int P_CONTENT_ID = 192;

  public static final int P_DEP_CONTENT_DISPOSITION = 174;

  public static final int P_CONTENT_DISPOSITION = 197;

  public static final int P_CONTENT_TRANSFER_ENCODING = 200;

  public static final java.lang.String CONTENT_TRANSFER_ENCODING = "Content-Transfer-Encoding";

  public static final java.lang.String P_BINARY = "binary";

  public static final java.lang.String P_7BIT = "7bit";

  public static final java.lang.String P_8BIT = "8bit";

  public static final java.lang.String P_BASE64 = "base64";

  public static final java.lang.String P_QUOTED_PRINTABLE = "quoted-printable";

  public static final int P_DISPOSITION_FROM_DATA = 128;

  public static final int P_DISPOSITION_ATTACHMENT = 129;

  public static final int P_DISPOSITION_INLINE = 130;

  // Constructors

  public PduPart(){
  }
  // Methods

  public byte [] getName(){
    return (byte []) null;
  }
  public void setName(byte [] arg1){
  }
  public byte [] getData(){
    return (byte []) null;
  }
  public byte [] getContentType(){
    return (byte []) null;
  }
  public void setContentType(byte [] arg1){
  }
  public byte [] getFilename(){
    return (byte []) null;
  }
  public void setData(byte [] arg1){
  }
  public void setContentDisposition(byte [] arg1){
  }
  public byte [] getContentDisposition(){
    return (byte []) null;
  }
  public int getCharset(){
    return 0;
  }
  public void setCharset(int arg1){
  }
  public byte [] getContentLocation(){
    return (byte []) null;
  }
  public byte [] getContentId(){
    return (byte []) null;
  }
  public void setContentLocation(byte [] arg1){
  }
  public byte [] getContentTransferEncoding(){
    return (byte []) null;
  }
  public void setContentId(byte [] arg1){
  }
  public void setFilename(byte [] arg1){
  }
  public void setContentTransferEncoding(byte [] arg1){
  }
  public void setDataUri(android.net.Uri arg1){
  }
  public android.net.Uri getDataUri(){
    return (android.net.Uri) null;
  }
  public java.lang.String generateLocation(){
    return (java.lang.String) null;
  }
}
