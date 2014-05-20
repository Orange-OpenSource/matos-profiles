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
public abstract class ServiceStateTracker
  extends android.os.Handler{
  // Fields

  protected CommandsInterface cm;

  public android.telephony.ServiceState ss;

  protected android.telephony.ServiceState newSS;

  public android.telephony.SignalStrength mSignalStrength;

  public RestrictedState mRestrictedState;

  public static final int OTASP_UNINITIALIZED = 0;

  public static final int OTASP_UNKNOWN = 1;

  public static final int OTASP_NEEDED = 2;

  public static final int OTASP_NOT_NEEDED = 3;

  protected int [] pollingContext;

  protected boolean mDesiredPowerState;

  protected int mRadioTechnology;

  protected int mNewRadioTechnology;

  protected boolean dontPollSignalStrength;

  protected android.os.RegistrantList mRoamingOnRegistrants;

  protected android.os.RegistrantList mRoamingOffRegistrants;

  protected android.os.RegistrantList mAttachedRegistrants;

  protected android.os.RegistrantList mDetachedRegistrants;

  protected android.os.RegistrantList mNetworkAttachedRegistrants;

  protected android.os.RegistrantList mPsRestrictEnabledRegistrants;

  protected android.os.RegistrantList mPsRestrictDisabledRegistrants;

  protected static final boolean DBG = false;

  protected static final int POLL_PERIOD_MILLIS = 0;

  public static final int DEFAULT_GPRS_CHECK_PERIOD_MILLIS = 60000;

  protected static final int EVENT_RADIO_STATE_CHANGED = 0;

  protected static final int EVENT_NETWORK_STATE_CHANGED = 0;

  protected static final int EVENT_GET_SIGNAL_STRENGTH = 0;

  protected static final int EVENT_POLL_STATE_REGISTRATION = 0;

  protected static final int EVENT_POLL_STATE_GPRS = 0;

  protected static final int EVENT_POLL_STATE_OPERATOR = 0;

  protected static final int EVENT_POLL_SIGNAL_STRENGTH = 0;

  protected static final int EVENT_NITZ_TIME = 0;

  protected static final int EVENT_SIGNAL_STRENGTH_UPDATE = 0;

  protected static final int EVENT_RADIO_AVAILABLE = 0;

  protected static final int EVENT_POLL_STATE_NETWORK_SELECTION_MODE = 0;

  protected static final int EVENT_GET_LOC_DONE = 0;

  protected static final int EVENT_SIM_RECORDS_LOADED = 0;

  protected static final int EVENT_SIM_READY = 0;

  protected static final int EVENT_LOCATION_UPDATES_ENABLED = 0;

  protected static final int EVENT_GET_PREFERRED_NETWORK_TYPE = 0;

  protected static final int EVENT_SET_PREFERRED_NETWORK_TYPE = 0;

  protected static final int EVENT_RESET_PREFERRED_NETWORK_TYPE = 0;

  protected static final int EVENT_CHECK_REPORT_GPRS = 0;

  protected static final int EVENT_RESTRICTED_STATE_CHANGED = 0;

  protected static final int EVENT_POLL_STATE_REGISTRATION_CDMA = 0;

  protected static final int EVENT_POLL_STATE_OPERATOR_CDMA = 0;

  protected static final int EVENT_RUIM_READY = 0;

  protected static final int EVENT_RUIM_RECORDS_LOADED = 0;

  protected static final int EVENT_POLL_SIGNAL_STRENGTH_CDMA = 0;

  protected static final int EVENT_GET_SIGNAL_STRENGTH_CDMA = 0;

  protected static final int EVENT_NETWORK_STATE_CHANGED_CDMA = 0;

  protected static final int EVENT_GET_LOC_DONE_CDMA = 0;

  protected static final int EVENT_SIGNAL_STRENGTH_UPDATE_CDMA = 0;

  protected static final int EVENT_NV_LOADED = 0;

  protected static final int EVENT_POLL_STATE_CDMA_SUBSCRIPTION = 0;

  protected static final int EVENT_NV_READY = 0;

  protected static final int EVENT_ERI_FILE_LOADED = 0;

  protected static final int EVENT_OTA_PROVISION_STATUS_CHANGE = 0;

  protected static final int EVENT_SET_RADIO_POWER_OFF = 0;

  protected static final java.lang.String TIMEZONE_PROPERTY = (java.lang.String) null;

  protected static final java.lang.String [] GMT_COUNTRY_CODES = null;

  protected static final java.lang.String REGISTRATION_DENIED_GEN = (java.lang.String) null;

  protected static final java.lang.String REGISTRATION_DENIED_AUTH = (java.lang.String) null;

  // Constructors

  public ServiceStateTracker(){
    super();
  }
  // Methods

  protected abstract void log(java.lang.String arg1);
  protected abstract void loge(java.lang.String arg1);
  public void handleMessage(android.os.Message arg1){
  }
  public void setRadioPower(boolean arg1){
  }
  public void enableLocationUpdates(){
  }
  public void disableLocationUpdates(){
  }
  protected abstract Phone getPhone();
  public abstract boolean isConcurrentVoiceAndDataAllowed();
  protected abstract void handlePollStateResult(int arg1, android.os.AsyncResult arg2);
  protected abstract void updateSpnDisplay();
  protected abstract void setPowerStateToDesired();
  public abstract int getCurrentDataConnectionState();
  protected abstract void hangupAndPowerOff();
  protected void disableSingleLocationUpdate(){
  }
  public void powerOffRadioSafely(DataConnectionTracker arg1){
  }
  protected void cancelPollState(){
  }
  public boolean getDesiredPowerState(){
    return false;
  }
  public void registerForRoamingOn( android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForRoamingOn(android.os.Handler arg1){
  }
  public void registerForRoamingOff( android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForRoamingOff(android.os.Handler arg1){
  }
  public void reRegisterNetwork(android.os.Message arg1){
  }
  public void enableSingleLocationUpdate(){
  }
  public void registerForDataConnectionAttached( android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForDataConnectionAttached(android.os.Handler arg1){
  }
  public void registerForDataConnectionDetached( android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForDataConnectionDetached(android.os.Handler arg1){
  }
  public void registerForNetworkAttached( android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForNetworkAttached(android.os.Handler arg1){
  }
  public void registerForPsRestrictedEnabled( android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForPsRestrictedEnabled(android.os.Handler arg1){
  }
  public void registerForPsRestrictedDisabled( android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForPsRestrictedDisabled(android.os.Handler arg1){
  }
  public boolean processPendingRadioPowerOffAfterDataOff(){
    return false;
  }
}
