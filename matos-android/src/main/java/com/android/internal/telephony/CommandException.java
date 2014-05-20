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


public class CommandException
  extends java.lang.RuntimeException{
  // Classes

  public static enum Error
  {
    // Enum Constants

    INVALID_RESPONSE()
, RADIO_NOT_AVAILABLE()
, GENERIC_FAILURE()
, PASSWORD_INCORRECT()
, SIM_PIN2()
, SIM_PUK2()
, REQUEST_NOT_SUPPORTED()
, OP_NOT_ALLOWED_DURING_VOICE_CALL()
, OP_NOT_ALLOWED_BEFORE_REG_NW()
, SMS_FAIL_RETRY()
, SIM_ABSENT()
, SUBSCRIPTION_NOT_AVAILABLE()
, MODE_NOT_SUPPORTED()
, FDN_CHECK_FAILURE()
, ILLEGAL_SIM_OR_ME()
;
    // Fields

    // Constructors

    private Error(){
    }
    // Methods

  }
  // Constructors

  public CommandException(@com.francetelecom.rd.stubs.annotation.FieldSet("mError") CommandException.Error arg1){
    super();
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.FieldGet("mError") 
  public CommandException.Error getCommandError(){
    return (CommandException.Error) null;
  }
  public static CommandException fromRilErrno(int arg1){
    return (CommandException) null;
  }
}
