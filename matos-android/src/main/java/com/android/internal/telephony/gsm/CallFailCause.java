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


public interface CallFailCause
{
  // Fields

  public static final int UNOBTAINABLE_NUMBER = 1;

  public static final int NORMAL_CLEARING = 16;

  public static final int USER_BUSY = 17;

  public static final int NUMBER_CHANGED = 22;

  public static final int STATUS_ENQUIRY = 30;

  public static final int NORMAL_UNSPECIFIED = 31;

  public static final int NO_CIRCUIT_AVAIL = 34;

  public static final int TEMPORARY_FAILURE = 41;

  public static final int SWITCHING_CONGESTION = 42;

  public static final int CHANNEL_NOT_AVAIL = 44;

  public static final int QOS_NOT_AVAIL = 49;

  public static final int BEARER_NOT_AVAIL = 58;

  public static final int ACM_LIMIT_EXCEEDED = 68;

  public static final int CALL_BARRED = 240;

  public static final int FDN_BLOCKED = 241;

  public static final int ERROR_UNSPECIFIED = 65535;

}
