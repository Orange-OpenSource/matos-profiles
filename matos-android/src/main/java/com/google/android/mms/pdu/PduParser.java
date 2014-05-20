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


public class PduParser
{
  // Constructors

  public PduParser(byte [] arg1){
  }
  // Methods

  public GenericPdu parse(){
    return (GenericPdu) null;
  }
  protected PduHeaders parseHeaders(java.io.ByteArrayInputStream arg1){
    return (PduHeaders) null;
  }
  protected static PduBody parseParts(java.io.ByteArrayInputStream arg1){
    return (PduBody) null;
  }
  protected static int parseUnsignedInt(java.io.ByteArrayInputStream arg1){
    return 0;
  }
  protected static int parseValueLength(java.io.ByteArrayInputStream arg1){
    return 0;
  }
  protected static EncodedStringValue parseEncodedStringValue(java.io.ByteArrayInputStream arg1){
    return (EncodedStringValue) null;
  }
  protected static byte [] parseWapString(java.io.ByteArrayInputStream arg1, int arg2){
    return (byte []) null;
  }
  protected static boolean isTokenCharacter(int arg1){
    return false;
  }
  protected static boolean isText(int arg1){
    return false;
  }
  protected static byte [] getWapString(java.io.ByteArrayInputStream arg1, int arg2){
    return (byte []) null;
  }
  protected static int extractByteValue(java.io.ByteArrayInputStream arg1){
    return 0;
  }
  protected static int parseShortInteger(java.io.ByteArrayInputStream arg1){
    return 0;
  }
  protected static long parseLongInteger(java.io.ByteArrayInputStream arg1){
    return 0l;
  }
  protected static long parseIntegerValue(java.io.ByteArrayInputStream arg1){
    return 0l;
  }
  protected static int skipWapValue(java.io.ByteArrayInputStream arg1, int arg2){
    return 0;
  }
  protected static void parseContentTypeParams(java.io.ByteArrayInputStream arg1, java.util.HashMap<java.lang.Integer, java.lang.Object> arg2, java.lang.Integer arg3){
  }
  protected static byte [] parseContentType(java.io.ByteArrayInputStream arg1, java.util.HashMap<java.lang.Integer, java.lang.Object> arg2){
    return (byte []) null;
  }
  protected static boolean parsePartHeaders(java.io.ByteArrayInputStream arg1, PduPart arg2, int arg3){
    return false;
  }
  protected static boolean checkMandatoryHeader(PduHeaders arg1){
    return false;
  }
}
