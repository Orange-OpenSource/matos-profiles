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
public abstract class DataConnection
  extends com.android.internal.util.StateMachine{
  // Classes

  public static enum FailCause
  {
    // Enum Constants

    NONE()
, OPERATOR_BARRED()
, INSUFFICIENT_RESOURCES()
, MISSING_UNKNOWN_APN()
, UNKNOWN_PDP_ADDRESS_TYPE()
, USER_AUTHENTICATION()
, ACTIVATION_REJECT_GGSN()
, ACTIVATION_REJECT_UNSPECIFIED()
, SERVICE_OPTION_NOT_SUPPORTED()
, SERVICE_OPTION_NOT_SUBSCRIBED()
, SERVICE_OPTION_OUT_OF_ORDER()
, NSAPI_IN_USE()
, ONLY_IPV4_ALLOWED()
, ONLY_IPV6_ALLOWED()
, ONLY_SINGLE_BEARER_ALLOWED()
, PROTOCOL_ERRORS()
, REGISTRATION_FAIL()
, GPRS_REGISTRATION_FAIL()
, SIGNAL_LOST()
, PREF_RADIO_TECH_CHANGED()
, RADIO_POWER_OFF()
, TETHERED_CALL_ACTIVE()
, ERROR_UNSPECIFIED()
, UNKNOWN()
, RADIO_NOT_AVAILABLE()
, UNACCEPTABLE_NETWORK_PARAMETER()
;
    // Fields

    // Constructors

    private FailCause(){
    }
    // Methods

    public static DataConnection.FailCause fromInt(int arg1){
      return (DataConnection.FailCause) null;
    }
    public boolean isPermanentFail(){
      return false;
    }
    public boolean isEventLoggable(){
      return false;
    }
  }
  public static class CallSetupException
    extends java.lang.Exception  {
    // Constructors

    CallSetupException(int arg1){
      super();
    }
    // Methods

    public int getRetryOverride(){
      return 0;
    }
  }
  public static class UpdateLinkPropertyResult
  {
    // Fields

    public DataCallState.SetupResult setupResult;

    public android.net.LinkProperties oldLp;

    public android.net.LinkProperties newLp;

    // Constructors

    public UpdateLinkPropertyResult(android.net.LinkProperties arg1){
    }
  }
  protected static class ConnectionParams
  {
    // Fields

    public int tag;

    public ApnSetting apn;

    public android.os.Message onCompletedMsg;

    // Constructors

    public ConnectionParams(@com.francetelecom.rd.stubs.annotation.FieldSet("apn") ApnSetting arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("onCompletedMsg") android.os.Message arg2){
    }
  }
  // Constructors

  protected DataConnection(PhoneBase arg1, java.lang.String arg2, int arg3, RetryManager arg4){
    super((java.lang.String) null);
  }
  // Methods

  public abstract java.lang.String toString();
  // @com.francetelecom.rd.stubs.annotation.Code("sendMessage(obtainMessage(EVENT_DISCONNECT, new DisconnectParams(arg1, arg2)));")
  public void tearDown(java.lang.String arg1, android.os.Message arg2){
  }
  public int getDataConnectionId(){
    return 0;
  }
  public int getRetryCount(){
    return 0;
  }
  public int getRetryTimer(){
    return 0;
  }
  public void increaseRetryCount(){
  }
  public boolean isRetryNeeded(){
    return false;
  }
  public void resetRetryCount(){
  }
  public void retryForeverUsingLastTimeout(){
  }
  public boolean isRetryForever(){
    return false;
  }
  public boolean configureRetry(int arg1, int arg2, int arg3){
    return false;
  }
  public boolean configureRetry(java.lang.String arg1){
    return false;
  }
  // @com.francetelecom.rd.stubs.annotation.Code("sendMessage(obtainMessage(EVENT_CONNECT, new ConnectionParams(arg2, arg1)));")
  public void bringUp(android.os.Message arg1, ApnSetting arg2){
  }
}
