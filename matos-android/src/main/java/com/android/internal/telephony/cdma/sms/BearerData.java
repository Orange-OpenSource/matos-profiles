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
public final class BearerData
{
  // Classes

  public static class TimeStamp
    extends android.text.format.Time  {
    // Constructors

    public TimeStamp(){
      super((java.lang.String) null);
    }
    // Methods

    public java.lang.String toString(){
      return (java.lang.String) null;
    }
    public static BearerData.TimeStamp fromByteArray(byte [] arg1){
      return (BearerData.TimeStamp) null;
    }
  }
  // Fields

  public static final int MESSAGE_TYPE_DELIVER = 1;

  public static final int MESSAGE_TYPE_SUBMIT = 2;

  public static final int MESSAGE_TYPE_CANCELLATION = 3;

  public static final int MESSAGE_TYPE_DELIVERY_ACK = 4;

  public static final int MESSAGE_TYPE_USER_ACK = 5;

  public static final int MESSAGE_TYPE_READ_ACK = 6;

  public static final int MESSAGE_TYPE_DELIVER_REPORT = 7;

  public static final int MESSAGE_TYPE_SUBMIT_REPORT = 8;

  public int messageType;

  public int messageId;

  public static final int PRIORITY_NORMAL = 0;

  public static final int PRIORITY_INTERACTIVE = 1;

  public static final int PRIORITY_URGENT = 2;

  public static final int PRIORITY_EMERGENCY = 3;

  public boolean priorityIndicatorSet;

  public int priority;

  public static final int PRIVACY_NOT_RESTRICTED = 0;

  public static final int PRIVACY_RESTRICTED = 1;

  public static final int PRIVACY_CONFIDENTIAL = 2;

  public static final int PRIVACY_SECRET = 3;

  public boolean privacyIndicatorSet;

  public int privacy;

  public static final int ALERT_DEFAULT = 0;

  public static final int ALERT_LOW_PRIO = 1;

  public static final int ALERT_MEDIUM_PRIO = 2;

  public static final int ALERT_HIGH_PRIO = 3;

  public boolean alertIndicatorSet;

  public int alert;

  public static final int DISPLAY_MODE_IMMEDIATE = 0;

  public static final int DISPLAY_MODE_DEFAULT = 1;

  public static final int DISPLAY_MODE_USER = 2;

  public boolean displayModeSet;

  public int displayMode;

  public static final int LANGUAGE_UNKNOWN = 0;

  public static final int LANGUAGE_ENGLISH = 1;

  public static final int LANGUAGE_FRENCH = 2;

  public static final int LANGUAGE_SPANISH = 3;

  public static final int LANGUAGE_JAPANESE = 4;

  public static final int LANGUAGE_KOREAN = 5;

  public static final int LANGUAGE_CHINESE = 6;

  public static final int LANGUAGE_HEBREW = 7;

  public boolean languageIndicatorSet;

  public int language;

  public static final int ERROR_NONE = 0;

  public static final int STATUS_ACCEPTED = 0;

  public static final int STATUS_DEPOSITED_TO_INTERNET = 1;

  public static final int STATUS_DELIVERED = 2;

  public static final int STATUS_CANCELLED = 3;

  public static final int ERROR_TEMPORARY = 2;

  public static final int STATUS_NETWORK_CONGESTION = 4;

  public static final int STATUS_NETWORK_ERROR = 5;

  public static final int STATUS_UNKNOWN_ERROR = 31;

  public static final int ERROR_PERMANENT = 3;

  public static final int STATUS_CANCEL_FAILED = 6;

  public static final int STATUS_BLOCKED_DESTINATION = 7;

  public static final int STATUS_TEXT_TOO_LONG = 8;

  public static final int STATUS_DUPLICATE_MESSAGE = 9;

  public static final int STATUS_INVALID_DESTINATION = 10;

  public static final int STATUS_MESSAGE_EXPIRED = 13;

  public static final int ERROR_UNDEFINED = 255;

  public static final int STATUS_UNDEFINED = 255;

  public boolean messageStatusSet;

  public int errorClass;

  public int messageStatus;

  public boolean hasUserDataHeader;

  public UserData userData;

  public boolean userResponseCodeSet;

  public int userResponseCode;

  public BearerData.TimeStamp msgCenterTimeStamp;

  public BearerData.TimeStamp validityPeriodAbsolute;

  public BearerData.TimeStamp deferredDeliveryTimeAbsolute;

  public static final int RELATIVE_TIME_MINS_LIMIT = 143;

  public static final int RELATIVE_TIME_HOURS_LIMIT = 167;

  public static final int RELATIVE_TIME_DAYS_LIMIT = 196;

  public static final int RELATIVE_TIME_WEEKS_LIMIT = 244;

  public static final int RELATIVE_TIME_INDEFINITE = 245;

  public static final int RELATIVE_TIME_NOW = 246;

  public static final int RELATIVE_TIME_MOBILE_INACTIVE = 247;

  public static final int RELATIVE_TIME_RESERVED = 248;

  public boolean validityPeriodRelativeSet;

  public int validityPeriodRelative;

  public boolean deferredDeliveryTimeRelativeSet;

  public int deferredDeliveryTimeRelative;

  public boolean userAckReq;

  public boolean deliveryAckReq;

  public boolean readAckReq;

  public boolean reportReq;

  public int numberOfMessages;

  public int depositIndex;

  public CdmaSmsAddress callbackNumber;

  // Constructors

  public BearerData(){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public static BearerData decode(byte [] arg1){
    return (BearerData) null;
  }
  public static byte [] encode(BearerData arg1){
    return (byte []) null;
  }
  public static com.android.internal.telephony.SmsMessageBase.TextEncodingDetails calcTextEncodingDetails(java.lang.CharSequence arg1, boolean arg2){
    return (com.android.internal.telephony.SmsMessageBase.TextEncodingDetails) null;
  }
}
