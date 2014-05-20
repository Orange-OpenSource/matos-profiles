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
public class CdmaSmsAddress
  extends com.android.internal.telephony.SmsAddress{
  // Fields

  public static final int DIGIT_MODE_4BIT_DTMF = 0;

  public static final int DIGIT_MODE_8BIT_CHAR = 1;

  public int digitMode;

  public static final int NUMBER_MODE_NOT_DATA_NETWORK = 0;

  public static final int NUMBER_MODE_DATA_NETWORK = 1;

  public int numberMode;

  public static final int TON_UNKNOWN = 0;

  public static final int TON_INTERNATIONAL_OR_IP = 1;

  public static final int TON_NATIONAL_OR_EMAIL = 2;

  public static final int TON_NETWORK = 3;

  public static final int TON_SUBSCRIBER = 4;

  public static final int TON_ALPHANUMERIC = 5;

  public static final int TON_ABBREVIATED = 6;

  public static final int TON_RESERVED = 7;

  public static final int SMS_ADDRESS_MAX = 36;

  public static final int SMS_SUBADDRESS_MAX = 36;

  public int numberOfDigits;

  public static final int NUMBERING_PLAN_UNKNOWN = 0;

  public static final int NUMBERING_PLAN_ISDN_TELEPHONY = 1;

  public int numberPlan;

  // Constructors

  public CdmaSmsAddress(){
    super();
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public static CdmaSmsAddress parse(java.lang.String arg1){
    return (CdmaSmsAddress) null;
  }
}
