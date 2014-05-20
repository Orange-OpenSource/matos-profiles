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
public interface CallFailCause
{
  // Fields

  public static final int NORMAL_CLEARING = 16;

  public static final int USER_BUSY = 17;

  public static final int NORMAL_UNSPECIFIED = 31;

  public static final int NO_CIRCUIT_AVAIL = 34;

  public static final int ACM_LIMIT_EXCEEDED = 68;

  public static final int CALL_BARRED = 240;

  public static final int FDN_BLOCKED = 241;

  public static final int CDMA_LOCKED_UNTIL_POWER_CYCLE = 1000;

  public static final int CDMA_DROP = 1001;

  public static final int CDMA_INTERCEPT = 1002;

  public static final int CDMA_REORDER = 1003;

  public static final int CDMA_SO_REJECT = 1004;

  public static final int CDMA_RETRY_ORDER = 1005;

  public static final int CDMA_ACCESS_FAILURE = 1006;

  public static final int CDMA_PREEMPTED = 1007;

  public static final int CDMA_NOT_EMERGENCY = 1008;

  public static final int CDMA_ACCESS_BLOCKED = 1009;

  public static final int ERROR_UNSPECIFIED = 65535;

}
