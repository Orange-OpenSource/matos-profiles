package com.android.internal.telephony.cat;

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
public enum ResultCode
{
  // Enum Constants

  OK(0)
, PRFRMD_WITH_PARTIAL_COMPREHENSION(0)
, PRFRMD_WITH_MISSING_INFO(0)
, PRFRMD_WITH_ADDITIONAL_EFS_READ(0)
, PRFRMD_ICON_NOT_DISPLAYED(0)
, PRFRMD_MODIFIED_BY_NAA(0)
, PRFRMD_LIMITED_SERVICE(0)
, PRFRMD_WITH_MODIFICATION(0)
, PRFRMD_NAA_NOT_ACTIVE(0)
, PRFRMD_TONE_NOT_PLAYED(0)
, UICC_SESSION_TERM_BY_USER(0)
, BACKWARD_MOVE_BY_USER(0)
, NO_RESPONSE_FROM_USER(0)
, HELP_INFO_REQUIRED(0)
, USSD_SS_SESSION_TERM_BY_USER(0)
, TERMINAL_CRNTLY_UNABLE_TO_PROCESS(0)
, NETWORK_CRNTLY_UNABLE_TO_PROCESS(0)
, USER_NOT_ACCEPT(0)
, USER_CLEAR_DOWN_CALL(0)
, CONTRADICTION_WITH_TIMER(0)
, NAA_CALL_CONTROL_TEMPORARY(0)
, LAUNCH_BROWSER_ERROR(0)
, MMS_TEMPORARY(0)
, BEYOND_TERMINAL_CAPABILITY(0)
, CMD_TYPE_NOT_UNDERSTOOD(0)
, CMD_DATA_NOT_UNDERSTOOD(0)
, CMD_NUM_NOT_KNOWN(0)
, SS_RETURN_ERROR(0)
, SMS_RP_ERROR(0)
, REQUIRED_VALUES_MISSING(0)
, USSD_RETURN_ERROR(0)
, MULTI_CARDS_CMD_ERROR(0)
, USIM_CALL_CONTROL_PERMANENT(0)
, BIP_ERROR(0)
, ACCESS_TECH_UNABLE_TO_PROCESS(0)
, FRAMES_ERROR(0)
, MMS_ERROR(0)
;
  // Fields

  // Constructors

  private ResultCode(int arg1){
  }
  // Methods

  public int value(){
    return 0;
  }
  public static ResultCode fromInt(int arg1){
    return (ResultCode) null;
  }
}
