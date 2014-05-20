package com.android.internal.telephony.cdma;

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
public class SmsMessage
  extends com.android.internal.telephony.SmsMessageBase{
  // Classes

  public static class SubmitPdu
    extends com.android.internal.telephony.SmsMessageBase.SubmitPduBase  {
    // Constructors

    public SubmitPdu(){
      super();
    }
  }
  // Constructors

  public SmsMessage(){
    super();
  }
  // Methods

  public int getStatus(){
    return 0;
  }
  public boolean isStatusReportMessage(){
    return false;
  }
  public static SmsMessage createFromPdu(byte [] arg1){
    return (SmsMessage) null;
  }
  public static SmsMessage createFromEfRecord(int arg1, byte [] arg2){
    return (SmsMessage) null;
  }
  public static int getTPLayerLengthForPDU(java.lang.String arg1){
    return 0;
  }
  public static SmsMessage.SubmitPdu getSubmitPdu(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, boolean arg4, com.android.internal.telephony.SmsHeader arg5){
    return (SmsMessage.SubmitPdu) null;
  }
  public static SmsMessage.SubmitPdu getSubmitPdu(java.lang.String arg1, java.lang.String arg2, int arg3, byte [] arg4, boolean arg5){
    return (SmsMessage.SubmitPdu) null;
  }
  public static SmsMessage.SubmitPdu getSubmitPdu(java.lang.String arg1, com.android.internal.telephony.cdma.sms.UserData arg2, boolean arg3){
    return (SmsMessage.SubmitPdu) null;
  }
  public static com.android.internal.telephony.SmsMessageBase.TextEncodingDetails calculateLength(java.lang.CharSequence arg1, boolean arg2){
    return (com.android.internal.telephony.SmsMessageBase.TextEncodingDetails) null;
  }
  public int getProtocolIdentifier(){
    return 0;
  }
  public boolean isReplace(){
    return false;
  }
  public boolean isCphsMwiMessage(){
    return false;
  }
  public boolean isMWIClearMessage(){
    return false;
  }
  public boolean isMWISetMessage(){
    return false;
  }
  public boolean isMwiDontStore(){
    return false;
  }
  public boolean isReplyPathPresent(){
    return false;
  }
  public android.telephony.SmsMessage.MessageClass getMessageClass(){
    return (android.telephony.SmsMessage.MessageClass) null;
  }
  public static SmsMessage newFromParcel(android.os.Parcel arg1){
    return (SmsMessage) null;
  }
  protected void parseSms(){
  }
}
