package com.android.internal.telephony.cdma.sms;

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
public class UserData
{
  // Fields

  public static final int ENCODING_OCTET = 0;

  public static final int ENCODING_IS91_EXTENDED_PROTOCOL = 1;

  public static final int ENCODING_7BIT_ASCII = 2;

  public static final int ENCODING_IA5 = 3;

  public static final int ENCODING_UNICODE_16 = 4;

  public static final int ENCODING_LATIN = 8;

  public static final int ENCODING_GSM_7BIT_ALPHABET = 9;

  public static final int ENCODING_GSM_DCS = 10;

  public static final int IS91_MSG_TYPE_VOICEMAIL_STATUS = 130;

  public static final int IS91_MSG_TYPE_SHORT_MESSAGE_FULL = 131;

  public static final int IS91_MSG_TYPE_CLI = 132;

  public static final int IS91_MSG_TYPE_SHORT_MESSAGE = 133;

  public static final char [] ASCII_MAP = null;

  public static final int PRINTABLE_ASCII_MIN_INDEX = 32;

  public static final int ASCII_NL_INDEX = 10;

  public static final int ASCII_CR_INDEX = 13;

  public static final android.util.SparseIntArray charToAscii = null;

  public static final int ASCII_MAP_BASE_INDEX = 32;

  public static final int ASCII_MAP_MAX_INDEX = 0;

  public com.android.internal.telephony.SmsHeader userDataHeader;

  public int msgEncoding;

  public boolean msgEncodingSet;

  public int msgType;

  public int paddingBits;

  public int numFields;

  public byte [] payload;

  public java.lang.String payloadStr;

  // Constructors

  public UserData(){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public static byte [] stringToAscii(java.lang.String arg1){
    return (byte []) null;
  }
}
