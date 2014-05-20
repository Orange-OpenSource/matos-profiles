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


public abstract class CallTracker
  extends android.os.Handler{
  // Fields

  protected int pendingOperations;

  protected boolean needsPoll;

  protected android.os.Message lastRelevantPoll;

  public CommandsInterface cm;

  protected static final int EVENT_POLL_CALLS_RESULT = 0;

  protected static final int EVENT_CALL_STATE_CHANGE = 0;

  protected static final int EVENT_REPOLL_AFTER_DELAY = 0;

  protected static final int EVENT_OPERATION_COMPLETE = 0;

  protected static final int EVENT_GET_LAST_CALL_FAIL_CAUSE = 0;

  protected static final int EVENT_SWITCH_RESULT = 0;

  protected static final int EVENT_RADIO_AVAILABLE = 0;

  protected static final int EVENT_RADIO_NOT_AVAILABLE = 0;

  protected static final int EVENT_CONFERENCE_RESULT = 0;

  protected static final int EVENT_SEPARATE_RESULT = 0;

  protected static final int EVENT_ECT_RESULT = 0;

  protected static final int EVENT_EXIT_ECM_RESPONSE_CDMA = 0;

  protected static final int EVENT_CALL_WAITING_INFO_CDMA = 0;

  protected static final int EVENT_THREE_WAY_DIAL_L2_RESULT_CDMA = 0;

  // Constructors
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public CallTracker(){
    super();
  }
  // Methods

  protected abstract void log(java.lang.String arg1);
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public abstract void handleMessage(android.os.Message arg1);
  public abstract void registerForVoiceCallStarted(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handleMessage") android.os.Handler arg1, int arg2, java.lang.Object arg3);
  public abstract void unregisterForVoiceCallStarted(android.os.Handler arg1);
  public abstract void registerForVoiceCallEnded(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handleMessage") android.os.Handler arg1, int arg2, java.lang.Object arg3);
  public abstract void unregisterForVoiceCallEnded(android.os.Handler arg1);
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected abstract void handlePollCalls(android.os.AsyncResult arg1);
  protected void pollCallsWhenSafe(){
  }
  protected boolean isCommandExceptionRadioNotAvailable(java.lang.Throwable arg1){
    return false;
  }
  protected void pollCallsAfterDelay(){
  }
  protected android.os.Message obtainNoPollCompleteMessage(int arg1){
    return (android.os.Message) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void handleRadioAvailable(){
  }
}
