package com.android.internal.telephony;

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


public class SmsHeader
{
  // Classes

  public static class PortAddrs
  {
    // Fields

    public int destPort;

    public int origPort;

    public boolean areEightBits;

    // Constructors

    public PortAddrs(){
    }
  }
  public static class ConcatRef
  {
    // Fields

    public int refNumber;

    public int seqNumber;

    public int msgCount;

    public boolean isEightBits;

    // Constructors

    public ConcatRef(){
    }
  }
  public static class MiscElt
  {
    // Fields

    public int id;

    public byte [] data;

    // Constructors

    public MiscElt(){
    }
  }
  // Fields

  public static final int ELT_ID_CONCATENATED_8_BIT_REFERENCE = 0;

  public static final int ELT_ID_SPECIAL_SMS_MESSAGE_INDICATION = 1;

  public static final int ELT_ID_APPLICATION_PORT_ADDRESSING_8_BIT = 4;

  public static final int ELT_ID_APPLICATION_PORT_ADDRESSING_16_BIT = 5;

  public static final int ELT_ID_SMSC_CONTROL_PARAMS = 6;

  public static final int ELT_ID_UDH_SOURCE_INDICATION = 7;

  public static final int ELT_ID_CONCATENATED_16_BIT_REFERENCE = 8;

  public static final int ELT_ID_WIRELESS_CTRL_MSG_PROTOCOL = 9;

  public static final int ELT_ID_TEXT_FORMATTING = 10;

  public static final int ELT_ID_PREDEFINED_SOUND = 11;

  public static final int ELT_ID_USER_DEFINED_SOUND = 12;

  public static final int ELT_ID_PREDEFINED_ANIMATION = 13;

  public static final int ELT_ID_LARGE_ANIMATION = 14;

  public static final int ELT_ID_SMALL_ANIMATION = 15;

  public static final int ELT_ID_LARGE_PICTURE = 16;

  public static final int ELT_ID_SMALL_PICTURE = 17;

  public static final int ELT_ID_VARIABLE_PICTURE = 18;

  public static final int ELT_ID_USER_PROMPT_INDICATOR = 19;

  public static final int ELT_ID_EXTENDED_OBJECT = 20;

  public static final int ELT_ID_REUSED_EXTENDED_OBJECT = 21;

  public static final int ELT_ID_COMPRESSION_CONTROL = 22;

  public static final int ELT_ID_OBJECT_DISTR_INDICATOR = 23;

  public static final int ELT_ID_STANDARD_WVG_OBJECT = 24;

  public static final int ELT_ID_CHARACTER_SIZE_WVG_OBJECT = 25;

  public static final int ELT_ID_EXTENDED_OBJECT_DATA_REQUEST_CMD = 26;

  public static final int ELT_ID_RFC_822_EMAIL_HEADER = 32;

  public static final int ELT_ID_HYPERLINK_FORMAT_ELEMENT = 33;

  public static final int ELT_ID_REPLY_ADDRESS_ELEMENT = 34;

  public static final int ELT_ID_ENHANCED_VOICE_MAIL_INFORMATION = 35;

  public static final int ELT_ID_NATIONAL_LANGUAGE_SINGLE_SHIFT = 36;

  public static final int ELT_ID_NATIONAL_LANGUAGE_LOCKING_SHIFT = 37;

  public static final int PORT_WAP_PUSH = 2948;

  public static final int PORT_WAP_WSP = 9200;

  public SmsHeader.PortAddrs portAddrs;

  public SmsHeader.ConcatRef concatRef;

  public java.util.ArrayList<SmsHeader.MiscElt> miscEltList;

  public int languageTable;

  public int languageShiftTable;

  // Constructors

  public SmsHeader(){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public static byte [] toByteArray(SmsHeader arg1){
    return (byte []) null;
  }
  public static SmsHeader fromByteArray(byte [] arg1){
    return (SmsHeader) null;
  }
}
