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
public class WspTypeDecoder
{
  // Fields

  public static final int PDU_TYPE_PUSH = 6;

  public static final int PDU_TYPE_CONFIRMED_PUSH = 7;

  public static final int PARAMETER_ID_X_WAP_APPLICATION_ID = 47;

  public static final java.lang.String CONTENT_TYPE_B_PUSH_CO = "application/vnd.wap.coc";

  public static final java.lang.String CONTENT_TYPE_B_MMS = "application/vnd.wap.mms-message";

  public static final java.lang.String CONTENT_TYPE_B_PUSH_SYNCML_NOTI = "application/vnd.syncml.notification";

  // Constructors

  public WspTypeDecoder(byte [] arg1){
  }
  // Methods

  public boolean decodeTextString(int arg1){
    return false;
  }
  public boolean decodeTokenText(int arg1){
    return false;
  }
  public boolean decodeShortInteger(int arg1){
    return false;
  }
  public boolean decodeLongInteger(int arg1){
    return false;
  }
  public boolean decodeIntegerValue(int arg1){
    return false;
  }
  public boolean decodeUintvarInteger(int arg1){
    return false;
  }
  public boolean decodeValueLength(int arg1){
    return false;
  }
  public boolean decodeExtensionMedia(int arg1){
    return false;
  }
  public boolean decodeConstrainedEncoding(int arg1){
    return false;
  }
  public boolean decodeContentType(int arg1){
    return false;
  }
  public boolean decodeContentLength(int arg1){
    return false;
  }
  public boolean decodeContentLocation(int arg1){
    return false;
  }
  public boolean decodeXWapApplicationId(int arg1){
    return false;
  }
  public boolean seekXWapApplicationId(int arg1, int arg2){
    return false;
  }
  public boolean decodeXWapContentURI(int arg1){
    return false;
  }
  public boolean decodeXWapInitiatorURI(int arg1){
    return false;
  }
  public int getDecodedDataLength(){
    return 0;
  }
  public long getValue32(){
    return 0l;
  }
  public java.lang.String getValueString(){
    return (java.lang.String) null;
  }
  public java.util.HashMap<java.lang.String, java.lang.String> getContentParameters(){
    return (java.util.HashMap) null;
  }
}
