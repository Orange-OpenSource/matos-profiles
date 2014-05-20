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

@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public abstract class Connection
{
  // Classes

  public static enum DisconnectCause
  {
    // Enum Constants

    NOT_DISCONNECTED()
, INCOMING_MISSED()
, NORMAL()
, LOCAL()
, BUSY()
, CONGESTION()
, MMI()
, INVALID_NUMBER()
, NUMBER_UNREACHABLE()
, SERVER_UNREACHABLE()
, INVALID_CREDENTIALS()
, OUT_OF_NETWORK()
, SERVER_ERROR()
, TIMED_OUT()
, LOST_SIGNAL()
, LIMIT_EXCEEDED()
, INCOMING_REJECTED()
, POWER_OFF()
, OUT_OF_SERVICE()
, ICC_ERROR()
, CALL_BARRED()
, FDN_BLOCKED()
, CS_RESTRICTED()
, CS_RESTRICTED_NORMAL()
, CS_RESTRICTED_EMERGENCY()
, UNOBTAINABLE_NUMBER()
, CDMA_LOCKED_UNTIL_POWER_CYCLE()
, CDMA_DROP()
, CDMA_INTERCEPT()
, CDMA_REORDER()
, CDMA_SO_REJECT()
, CDMA_RETRY_ORDER()
, CDMA_ACCESS_FAILURE()
, CDMA_PREEMPTED()
, CDMA_NOT_EMERGENCY()
, CDMA_ACCESS_BLOCKED()
, ERROR_UNSPECIFIED()
;
    // Fields

    // Constructors

    private DisconnectCause(){
    }
    // Methods

  }
  public static enum PostDialState
  {
    // Enum Constants

    NOT_STARTED()
, STARTED()
, WAIT()
, WILD()
, COMPLETE()
, CANCELLED()
, PAUSE()
;
    // Fields

    // Constructors

    private PostDialState(){
    }
    // Methods

  }
  // Fields

  public static int PRESENTATION_ALLOWED;

  public static int PRESENTATION_RESTRICTED;

  public static int PRESENTATION_UNKNOWN;

  public static int PRESENTATION_PAYPHONE;

  // Constructors

  public Connection(){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public abstract java.lang.String getAddress();
  public Call.State getState(){
    return (Call.State) null;
  }
  public boolean isAlive(){
    return false;
  }
  public java.lang.Object getUserData(){
    return (java.lang.Object) null;
  }
  public void setUserData(java.lang.Object arg1){
  }
  public abstract void hangup() throws CallStateException;
  public abstract Call getCall();
  public abstract long getCreateTime();
  public abstract long getConnectTime();
  public abstract Connection.DisconnectCause getDisconnectCause();
  public abstract boolean isIncoming();
  public abstract long getDisconnectTime();
  public abstract long getDurationMillis();
  public abstract long getHoldDurationMillis();
  public abstract Connection.PostDialState getPostDialState();
  public abstract void proceedAfterWaitChar();
  public abstract void proceedAfterWildChar(java.lang.String arg1);
  public abstract void cancelPostDial();
  public abstract java.lang.String getRemainingPostDialString();
  public abstract int getNumberPresentation();
  public abstract UUSInfo getUUSInfo();
  public java.lang.String getCnapName(){
    return (java.lang.String) null;
  }
  public java.lang.String getOrigDialString(){
    return (java.lang.String) null;
  }
  public int getCnapNamePresentation(){
    return 0;
  }
  public abstract void separate() throws CallStateException;
  public boolean isRinging(){
    return false;
  }
  public void clearUserData(){
  }
}
