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
public interface AppInterface
{
  // Classes

  public static enum CommandType
  {
    // Enum Constants

    DISPLAY_TEXT(0)
, GET_INKEY(0)
, GET_INPUT(0)
, LAUNCH_BROWSER(0)
, PLAY_TONE(0)
, REFRESH(0)
, SELECT_ITEM(0)
, SEND_SS(0)
, SEND_USSD(0)
, SEND_SMS(0)
, SEND_DTMF(0)
, SET_UP_EVENT_LIST(0)
, SET_UP_IDLE_MODE_TEXT(0)
, SET_UP_MENU(0)
, SET_UP_CALL(0)
, PROVIDE_LOCAL_INFORMATION(0)
;
    // Fields

    // Constructors

    private CommandType(int arg1){
    }
    // Methods

    public int value(){
      return 0;
    }
    public static AppInterface.CommandType fromInt(int arg1){
      return (AppInterface.CommandType) null;
    }
  }
  // Fields

  public static final java.lang.String CAT_CMD_ACTION = "android.intent.action.stk.command";

  public static final java.lang.String CAT_SESSION_END_ACTION = "android.intent.action.stk.session_end";

  // Methods
  @com.francetelecom.rd.stubs.annotation.CallBack("AppInterface")
  public void onCmdResponse(CatResponseMessage arg1);
}
