package com.android.internal.telephony.gsm;

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


public class SuppServiceNotification
{
  // Fields

  public int notificationType;

  public int code;

  public int index;

  public int type;

  public java.lang.String number;

  public static final int MO_CODE_UNCONDITIONAL_CF_ACTIVE = 0;

  public static final int MO_CODE_SOME_CF_ACTIVE = 1;

  public static final int MO_CODE_CALL_FORWARDED = 2;

  public static final int MO_CODE_CALL_IS_WAITING = 3;

  public static final int MO_CODE_CUG_CALL = 4;

  public static final int MO_CODE_OUTGOING_CALLS_BARRED = 5;

  public static final int MO_CODE_INCOMING_CALLS_BARRED = 6;

  public static final int MO_CODE_CLIR_SUPPRESSION_REJECTED = 7;

  public static final int MO_CODE_CALL_DEFLECTED = 8;

  public static final int MT_CODE_FORWARDED_CALL = 0;

  public static final int MT_CODE_CUG_CALL = 1;

  public static final int MT_CODE_CALL_ON_HOLD = 2;

  public static final int MT_CODE_CALL_RETRIEVED = 3;

  public static final int MT_CODE_MULTI_PARTY_CALL = 4;

  public static final int MT_CODE_ON_HOLD_CALL_RELEASED = 5;

  public static final int MT_CODE_FORWARD_CHECK_RECEIVED = 6;

  public static final int MT_CODE_CALL_CONNECTING_ECT = 7;

  public static final int MT_CODE_CALL_CONNECTED_ECT = 8;

  public static final int MT_CODE_DEFLECTED_CALL = 9;

  public static final int MT_CODE_ADDITIONAL_CALL_FORWARDED = 10;

  // Constructors

  public SuppServiceNotification(){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
}
