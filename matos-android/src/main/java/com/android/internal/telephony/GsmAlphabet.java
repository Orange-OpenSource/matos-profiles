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

@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public class GsmAlphabet
{
  // Fields

  public static final byte GSM_EXTENDED_ESCAPE = 27;

  // Constructors

  private GsmAlphabet(){
  }
  // Methods

  public static java.lang.String gsm7BitPackedToString(byte [] arg1, int arg2, int arg3){
    return (java.lang.String) null;
  }
  public static java.lang.String gsm7BitPackedToString(byte [] arg1, int arg2, int arg3, int arg4, int arg5, int arg6){
    return (java.lang.String) null;
  }
  public static byte [] stringToGsm7BitPackedWithHeader(java.lang.String arg1, byte [] arg2) throws EncodeException{
    return (byte []) null;
  }
  public static byte [] stringToGsm7BitPackedWithHeader(java.lang.String arg1, byte [] arg2, int arg3, int arg4) throws EncodeException{
    return (byte []) null;
  }
  public static int countGsmSeptets(char arg1){
    return 0;
  }
  public static int countGsmSeptets(char arg1, boolean arg2) throws EncodeException{
    return 0;
  }
  public static SmsMessageBase.TextEncodingDetails countGsmSeptets(java.lang.CharSequence arg1, boolean arg2){
    return (SmsMessageBase.TextEncodingDetails) null;
  }
  public static java.lang.String gsm8BitUnpackedToString(byte [] arg1, int arg2, int arg3){
    return (java.lang.String) null;
  }
  public static java.lang.String gsm8BitUnpackedToString(byte [] arg1, int arg2, int arg3, java.lang.String arg4){
    return (java.lang.String) null;
  }
  public static byte [] stringToGsm7BitPacked(java.lang.String arg1) throws EncodeException{
    return (byte []) null;
  }
  public static byte [] stringToGsm7BitPacked(java.lang.String arg1, int arg2, int arg3) throws EncodeException{
    return (byte []) null;
  }
  public static byte [] stringToGsm7BitPacked(java.lang.String arg1, int arg2, boolean arg3, int arg4, int arg5) throws EncodeException{
    return (byte []) null;
  }
  public static byte [] stringToGsm8BitPacked(java.lang.String arg1){
    return (byte []) null;
  }
  public static int charToGsm(char arg1){
    return 0;
  }
  public static int charToGsm(char arg1, boolean arg2) throws EncodeException{
    return 0;
  }
  public static int charToGsmExtended(char arg1){
    return 0;
  }
  public static char gsmToChar(int arg1){
    return '\u0000';
  }
  public static char gsmExtendedToChar(int arg1){
    return '\u0000';
  }
  public static void stringToGsm8BitUnpackedField(java.lang.String arg1, byte [] arg2, int arg3, int arg4){
  }
  public static int countGsmSeptetsUsingTables(java.lang.CharSequence arg1, boolean arg2, int arg3, int arg4){
    return 0;
  }
  public static int findGsmSeptetLimitIndex(java.lang.String arg1, int arg2, int arg3, int arg4, int arg5){
    return 0;
  }
}
