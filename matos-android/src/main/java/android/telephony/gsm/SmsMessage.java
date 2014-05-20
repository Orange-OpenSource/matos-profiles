package android.telephony.gsm;

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
{
  // Classes

  public static enum MessageClass
  {
    // Enum Constants

    UNKNOWN()
, CLASS_0()
, CLASS_1()
, CLASS_2()
, CLASS_3()
;
    // Fields

    // Constructors

    private MessageClass(){
    }
    // Methods

  }
  public static class SubmitPdu
  {
    // Fields

    public byte [] encodedScAddress;

    public byte [] encodedMessage;

    // Constructors

    public SubmitPdu(){
    }
    protected SubmitPdu(com.android.internal.telephony.SmsMessageBase.SubmitPduBase arg1){
    }
    // Methods

    public java.lang.String toString(){
      return (java.lang.String) null;
    }
  }
  // Fields

  public static final int ENCODING_UNKNOWN = 0;

  public static final int ENCODING_7BIT = 1;

  public static final int ENCODING_8BIT = 2;

  public static final int ENCODING_16BIT = 3;

  public static final int MAX_USER_DATA_BYTES = 140;

  public static final int MAX_USER_DATA_BYTES_WITH_HEADER = 134;

  public static final int MAX_USER_DATA_SEPTETS = 160;

  public static final int MAX_USER_DATA_SEPTETS_WITH_HEADER = 153;

  public com.android.internal.telephony.SmsMessageBase mWrappedSmsMessage;

  // Constructors

  public SmsMessage(){
  }
  private SmsMessage(com.android.internal.telephony.SmsMessageBase arg1){
  }
  // Methods

  public byte [] getUserData(){
    return (byte []) null;
  }
  public int getStatus(){
    return 0;
  }
  public boolean isStatusReportMessage(){
    return false;
  }
  public static SmsMessage createFromPdu(byte [] arg1){
    return (SmsMessage) null;
  }
  public static int getTPLayerLengthForPDU(java.lang.String arg1){
    return 0;
  }
  public static SmsMessage.SubmitPdu getSubmitPdu(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, boolean arg4, byte [] arg5){
    return (SmsMessage.SubmitPdu) null;
  }
  public static SmsMessage.SubmitPdu getSubmitPdu(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, boolean arg4){
    return (SmsMessage.SubmitPdu) null;
  }
  public static SmsMessage.SubmitPdu getSubmitPdu(java.lang.String arg1, java.lang.String arg2, short arg3, byte [] arg4, boolean arg5){
    return (SmsMessage.SubmitPdu) null;
  }
  public static int [] calculateLength(java.lang.CharSequence arg1, boolean arg2){
    return (int []) null;
  }
  public static int [] calculateLength(java.lang.String arg1, boolean arg2){
    return (int []) null;
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
  public SmsMessage.MessageClass getMessageClass(){
    return (SmsMessage.MessageClass) null;
  }
  public boolean isEmail(){
    return false;
  }
  public java.lang.String getMessageBody(){
    return (java.lang.String) null;
  }
  public java.lang.String getServiceCenterAddress(){
    return (java.lang.String) null;
  }
  public java.lang.String getOriginatingAddress(){
    return (java.lang.String) null;
  }
  public java.lang.String getDisplayOriginatingAddress(){
    return (java.lang.String) null;
  }
  public java.lang.String getDisplayMessageBody(){
    return (java.lang.String) null;
  }
  public java.lang.String getPseudoSubject(){
    return (java.lang.String) null;
  }
  public long getTimestampMillis(){
    return 0l;
  }
  public java.lang.String getEmailBody(){
    return (java.lang.String) null;
  }
  public java.lang.String getEmailFrom(){
    return (java.lang.String) null;
  }
  public byte [] getPdu(){
    return (byte []) null;
  }
  public int getStatusOnIcc(){
    return 0;
  }
  public int getIndexOnIcc(){
    return 0;
  }
  public int getStatusOnSim(){
    return 0;
  }
  public int getIndexOnSim(){
    return 0;
  }
}
