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
public final class SmsEnvelope
{
  // Fields

  public static final int MESSAGE_TYPE_POINT_TO_POINT = 0;

  public static final int MESSAGE_TYPE_BROADCAST = 1;

  public static final int MESSAGE_TYPE_ACKNOWLEDGE = 2;

  public static final int TELESERVICE_NOT_SET = 0;

  public static final int TELESERVICE_WMT = 4098;

  public static final int TELESERVICE_VMN = 4099;

  public static final int TELESERVICE_WAP = 4100;

  public static final int TELESERVICE_WEMT = 4101;

  public static final int TELESERVICE_MWI = 262144;

  public static final int SMS_BEARER_DATA_MAX = 255;

  public int messageType;

  public int teleService;

  public int serviceCategory;

  public CdmaSmsAddress origAddress;

  public CdmaSmsAddress destAddress;

  public CdmaSmsSubaddress origSubaddress;

  public int bearerReply;

  public byte replySeqNo;

  public byte errorClass;

  public byte causeCode;

  public byte [] bearerData;

  // Constructors

  public SmsEnvelope(){
  }
}
