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
public interface Phone
{
  // Classes

  public static enum State
  {
    // Enum Constants

    IDLE()
, RINGING()
, OFFHOOK()
;
    // Fields

    // Constructors

    private State(){
    }
    // Methods

  }
  public static enum DataState
  {
    // Enum Constants

    CONNECTED()
, CONNECTING()
, DISCONNECTED()
, SUSPENDED()
;
    // Fields

    // Constructors

    private DataState(){
    }
    // Methods

  }
  public static enum DataActivityState
  {
    // Enum Constants

    NONE()
, DATAIN()
, DATAOUT()
, DATAINANDOUT()
, DORMANT()
;
    // Fields

    // Constructors

    private DataActivityState(){
    }
    // Methods

  }
  public static enum SuppService
  {
    // Enum Constants

    UNKNOWN()
, SWITCH()
, SEPARATE()
, TRANSFER()
, CONFERENCE()
, REJECT()
, HANGUP()
;
    // Fields

    // Constructors

    private SuppService(){
    }
    // Methods

  }
  // Fields

  public static final boolean DEBUG_PHONE = true;

  public static final java.lang.String STATE_KEY = "state";

  public static final java.lang.String PHONE_NAME_KEY = "phoneName";

  public static final java.lang.String FAILURE_REASON_KEY = "reason";

  public static final java.lang.String STATE_CHANGE_REASON_KEY = "reason";

  public static final java.lang.String DATA_APN_TYPE_KEY = "apnType";

  public static final java.lang.String DATA_APN_KEY = "apn";

  public static final java.lang.String DATA_LINK_PROPERTIES_KEY = "linkProperties";

  public static final java.lang.String DATA_LINK_CAPABILITIES_KEY = "linkCapabilities";

  public static final java.lang.String DATA_IFACE_NAME_KEY = "iface";

  public static final java.lang.String NETWORK_UNAVAILABLE_KEY = "networkUnvailable";

  public static final java.lang.String DATA_NETWORK_ROAMING_KEY = "networkRoaming";

  public static final java.lang.String PHONE_IN_ECM_STATE = "phoneinECMState";

  public static final java.lang.String APN_TYPE_ALL = "*";

  public static final java.lang.String APN_TYPE_DEFAULT = "default";

  public static final java.lang.String APN_TYPE_MMS = "mms";

  public static final java.lang.String APN_TYPE_SUPL = "supl";

  public static final java.lang.String APN_TYPE_DUN = "dun";

  public static final java.lang.String APN_TYPE_HIPRI = "hipri";

  public static final java.lang.String APN_TYPE_FOTA = "fota";

  public static final java.lang.String APN_TYPE_IMS = "ims";

  public static final java.lang.String APN_TYPE_CBS = "cbs";

  public static final java.lang.String FEATURE_ENABLE_MMS = "enableMMS";

  public static final java.lang.String FEATURE_ENABLE_SUPL = "enableSUPL";

  public static final java.lang.String FEATURE_ENABLE_DUN = "enableDUN";

  public static final java.lang.String FEATURE_ENABLE_HIPRI = "enableHIPRI";

  public static final java.lang.String FEATURE_ENABLE_DUN_ALWAYS = "enableDUNAlways";

  public static final java.lang.String FEATURE_ENABLE_FOTA = "enableFOTA";

  public static final java.lang.String FEATURE_ENABLE_IMS = "enableIMS";

  public static final java.lang.String FEATURE_ENABLE_CBS = "enableCBS";

  public static final int APN_ALREADY_ACTIVE = 0;

  public static final int APN_REQUEST_STARTED = 1;

  public static final int APN_TYPE_NOT_AVAILABLE = 2;

  public static final int APN_REQUEST_FAILED = 3;

  public static final int APN_ALREADY_INACTIVE = 4;

  public static final java.lang.String REASON_ROAMING_ON = "roamingOn";

  public static final java.lang.String REASON_ROAMING_OFF = "roamingOff";

  public static final java.lang.String REASON_DATA_DISABLED = "dataDisabled";

  public static final java.lang.String REASON_DATA_ENABLED = "dataEnabled";

  public static final java.lang.String REASON_DATA_ATTACHED = "dataAttached";

  public static final java.lang.String REASON_DATA_DETACHED = "dataDetached";

  public static final java.lang.String REASON_CDMA_DATA_ATTACHED = "cdmaDataAttached";

  public static final java.lang.String REASON_CDMA_DATA_DETACHED = "cdmaDataDetached";

  public static final java.lang.String REASON_APN_CHANGED = "apnChanged";

  public static final java.lang.String REASON_APN_SWITCHED = "apnSwitched";

  public static final java.lang.String REASON_APN_FAILED = "apnFailed";

  public static final java.lang.String REASON_RESTORE_DEFAULT_APN = "restoreDefaultApn";

  public static final java.lang.String REASON_RADIO_TURNED_OFF = "radioTurnedOff";

  public static final java.lang.String REASON_PDP_RESET = "pdpReset";

  public static final java.lang.String REASON_VOICE_CALL_ENDED = "2GVoiceCallEnded";

  public static final java.lang.String REASON_VOICE_CALL_STARTED = "2GVoiceCallStarted";

  public static final java.lang.String REASON_PS_RESTRICT_ENABLED = "psRestrictEnabled";

  public static final java.lang.String REASON_PS_RESTRICT_DISABLED = "psRestrictDisabled";

  public static final java.lang.String REASON_SIM_LOADED = "simLoaded";

  public static final java.lang.String REASON_NW_TYPE_CHANGED = "nwTypeChanged";

  public static final java.lang.String REASON_DATA_DEPENDENCY_MET = "dependencyMet";

  public static final java.lang.String REASON_DATA_DEPENDENCY_UNMET = "dependencyUnmet";

  public static final java.lang.String REASON_LINK_PROPERTIES_CHANGED = "linkPropertiesChanged";

  public static final int BM_UNSPECIFIED = 0;

  public static final int BM_EURO_BAND = 1;

  public static final int BM_US_BAND = 2;

  public static final int BM_JPN_BAND = 3;

  public static final int BM_AUS_BAND = 4;

  public static final int BM_AUS2_BAND = 5;

  public static final int BM_BOUNDARY = 6;

  public static final int PHONE_TYPE_NONE = 0;

  public static final int PHONE_TYPE_GSM = 1;

  public static final int PHONE_TYPE_CDMA = 2;

  public static final int PHONE_TYPE_SIP = 3;

  public static final int LTE_ON_CDMA_UNKNOWN = -1;

  public static final int LTE_ON_CDMA_FALSE = 0;

  public static final int LTE_ON_CDMA_TRUE = 1;

  public static final int NT_MODE_WCDMA_PREF = 0;

  public static final int NT_MODE_GSM_ONLY = 1;

  public static final int NT_MODE_WCDMA_ONLY = 2;

  public static final int NT_MODE_GSM_UMTS = 3;

  public static final int NT_MODE_CDMA = 4;

  public static final int NT_MODE_CDMA_NO_EVDO = 5;

  public static final int NT_MODE_EVDO_NO_CDMA = 6;

  public static final int NT_MODE_GLOBAL = 7;

  public static final int NT_MODE_LTE_ONLY = 11;

  public static final int PREFERRED_NT_MODE = 0;

  public static final int CDMA_RM_HOME = 0;

  public static final int CDMA_RM_AFFILIATED = 1;

  public static final int CDMA_RM_ANY = 2;

  public static final int CDMA_SUBSCRIPTION_RUIM_SIM = 0;

  public static final int CDMA_SUBSCRIPTION_NV = 1;

  public static final int PREFERRED_CDMA_SUBSCRIPTION = 1;

  public static final int TTY_MODE_OFF = 0;

  public static final int TTY_MODE_FULL = 1;

  public static final int TTY_MODE_HCO = 2;

  public static final int TTY_MODE_VCO = 3;

  public static final int CDMA_OTA_PROVISION_STATUS_SPL_UNLOCKED = 0;

  public static final int CDMA_OTA_PROVISION_STATUS_SPC_RETRIES_EXCEEDED = 1;

  public static final int CDMA_OTA_PROVISION_STATUS_A_KEY_EXCHANGED = 2;

  public static final int CDMA_OTA_PROVISION_STATUS_SSD_UPDATED = 3;

  public static final int CDMA_OTA_PROVISION_STATUS_NAM_DOWNLOADED = 4;

  public static final int CDMA_OTA_PROVISION_STATUS_MDN_DOWNLOADED = 5;

  public static final int CDMA_OTA_PROVISION_STATUS_IMSI_DOWNLOADED = 6;

  public static final int CDMA_OTA_PROVISION_STATUS_PRL_DOWNLOADED = 7;

  public static final int CDMA_OTA_PROVISION_STATUS_COMMITTED = 8;

  public static final int CDMA_OTA_PROVISION_STATUS_OTAPA_STARTED = 9;

  public static final int CDMA_OTA_PROVISION_STATUS_OTAPA_STOPPED = 10;

  public static final int CDMA_OTA_PROVISION_STATUS_OTAPA_ABORTED = 11;

  // Methods

  public android.content.Context getContext();
  public Phone.State getState();
  public void setMute(boolean arg1);
  public java.lang.String getVoiceMailNumber();
  public void setVoiceMailNumber(java.lang.String arg1, java.lang.String arg2, android.os.Message arg3);
  public java.lang.String getVoiceMailAlphaTag();
  public void setVoiceMessageWaiting(int arg1, int arg2);
  public int getVoiceMessageCount();
  public boolean isCspPlmnEnabled();
  public com.android.internal.telephony.ims.IsimRecords getIsimRecords();
  public void getDataCallList(android.os.Message arg1);
  public Connection dial(java.lang.String arg1) throws CallStateException;
  public Connection dial(java.lang.String arg1, UUSInfo arg2) throws CallStateException;
  public void conference() throws CallStateException;
  public void acceptCall() throws CallStateException;
  public void rejectCall() throws CallStateException;
  public void explicitCallTransfer() throws CallStateException;
  public boolean getMute();
  public android.telephony.SignalStrength getSignalStrength();
  public void sendDtmf(char arg1);
  public void startDtmf(char arg1);
  public void stopDtmf();
  public void sendBurstDtmf(java.lang.String arg1, int arg2, int arg3, android.os.Message arg4);
  public void setRadioPower(boolean arg1);
  public void setCallWaiting(boolean arg1, android.os.Message arg2);
  public void setNetworkSelectionModeAutomatic(android.os.Message arg1);
  public void getAvailableNetworks(android.os.Message arg1);
  public void invokeOemRilRequestRaw(byte [] arg1, android.os.Message arg2);
  public void invokeOemRilRequestStrings(java.lang.String [] arg1, android.os.Message arg2);
  public void setBandMode(int arg1, android.os.Message arg2);
  public void queryAvailableBandMode(android.os.Message arg1);
  public void setPreferredNetworkType(int arg1, android.os.Message arg2);
  public void getPreferredNetworkType(android.os.Message arg1);
  public void getNeighboringCids(android.os.Message arg1);
  public void getSmscAddress(android.os.Message arg1);
  public void setSmscAddress(java.lang.String arg1, android.os.Message arg2);
  public void queryCdmaRoamingPreference(android.os.Message arg1);
  public void setCdmaRoamingPreference(int arg1, android.os.Message arg2);
  public void queryTTYMode(android.os.Message arg1);
  public void setTTYMode(int arg1, android.os.Message arg2);
  public void exitEmergencyCallbackMode();
  public void requestIsimAuthentication(java.lang.String arg1, android.os.Message arg2);
  public void registerForInCallVoicePrivacyOn(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handleMessage")  android.os.Handler arg1, int arg2, java.lang.Object arg3);
  public void unregisterForInCallVoicePrivacyOn(android.os.Handler arg1);
  public void registerForInCallVoicePrivacyOff(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handleMessage")  android.os.Handler arg1, int arg2, java.lang.Object arg3);
  public void unregisterForInCallVoicePrivacyOff(android.os.Handler arg1);
  public void registerForDisplayInfo(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handleMessage")  android.os.Handler arg1, int arg2, java.lang.Object arg3);
  public void unregisterForDisplayInfo(android.os.Handler arg1);
  public void registerForSignalInfo(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handleMessage")  android.os.Handler arg1, int arg2, java.lang.Object arg3);
  public void unregisterForSignalInfo(android.os.Handler arg1);
  public void registerForNumberInfo(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handleMessage")  android.os.Handler arg1, int arg2, java.lang.Object arg3);
  public void unregisterForNumberInfo(android.os.Handler arg1);
  public void registerForRedirectedNumberInfo(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handleMessage")  android.os.Handler arg1, int arg2, java.lang.Object arg3);
  public void unregisterForRedirectedNumberInfo(android.os.Handler arg1);
  public void registerForLineControlInfo(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handleMessage")  android.os.Handler arg1, int arg2, java.lang.Object arg3);
  public void unregisterForLineControlInfo(android.os.Handler arg1);
  public void registerFoT53ClirlInfo(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handleMessage")  android.os.Handler arg1, int arg2, java.lang.Object arg3);
  public void unregisterForT53ClirInfo(android.os.Handler arg1);
  public void registerForT53AudioControlInfo(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handleMessage")  android.os.Handler arg1, int arg2, java.lang.Object arg3);
  public void unregisterForT53AudioControlInfo(android.os.Handler arg1);
  public void registerForRingbackTone(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handleMessage")  android.os.Handler arg1, int arg2, java.lang.Object arg3);
  public void unregisterForRingbackTone(android.os.Handler arg1);
  public void registerForResendIncallMute(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handleMessage")  android.os.Handler arg1, int arg2, java.lang.Object arg3);
  public void unregisterForResendIncallMute(android.os.Handler arg1);
  public int getLteOnCdmaMode();
  public void clearDisconnected();
  public void switchHoldingAndActive() throws CallStateException;
  public android.telephony.ServiceState getServiceState();
  public boolean canConference();
  public boolean canTransfer();
  public java.lang.String getPhoneName();
  public void getOutgoingCallerIdDisplay(android.os.Message arg1);
  public void setOutgoingCallerIdDisplay(int arg1, android.os.Message arg2);
  public void getCallWaiting(android.os.Message arg1);
  public void setEchoSuppressionEnabled(boolean arg1);
  public Call getForegroundCall();
  public Call getBackgroundCall();
  public Call getRingingCall();
  public boolean getMessageWaitingIndicator();
  public boolean getCallForwardingIndicator();
  public java.util.List<? extends MmiCode> getPendingMmiCodes();
  public Phone.DataState getDataConnectionState();
  public Phone.DataState getDataConnectionState(java.lang.String arg1);
  public Phone.DataActivityState getDataActivityState();
  public boolean handleInCallMmiCommands(java.lang.String arg1) throws CallStateException;
  public boolean handlePinMmi(java.lang.String arg1);
  public void sendUssdResponse(java.lang.String arg1);
  public void registerForSuppServiceNotification(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handleMessage")  android.os.Handler arg1, int arg2, java.lang.Object arg3);
  public void unregisterForSuppServiceNotification(android.os.Handler arg1);
  public java.lang.String getDeviceId();
  public java.lang.String getDeviceSvn();
  public java.lang.String getImei();
  public java.lang.String getEsn();
  public java.lang.String getMeid();
  public java.lang.String getSubscriberId();
  public java.lang.String getIccSerialNumber();
  public java.lang.String getLine1Number();
  public java.lang.String getLine1AlphaTag();
  public void setLine1Number(java.lang.String arg1, java.lang.String arg2, android.os.Message arg3);
  public void getCallForwardingOption(int arg1, android.os.Message arg2);
  public void setCallForwardingOption(int arg1, int arg2, java.lang.String arg3, int arg4, android.os.Message arg5);
  public boolean getIccRecordsLoaded();
  public void selectNetworkManually(OperatorInfo arg1, android.os.Message arg2);
  public void setOnPostDialCharacter(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handleMessage")  android.os.Handler arg1, int arg2, java.lang.Object arg3);
  public void updateServiceLocation();
  public void enableLocationUpdates();
  public void disableLocationUpdates();
  public boolean getDataRoamingEnabled();
  public void setDataRoamingEnabled(boolean arg1);
  public boolean isDataConnectivityPossible();
  public boolean isDataConnectivityPossible(java.lang.String arg1);
  public PhoneSubInfo getPhoneSubInfo();
  public IccSmsInterfaceManager getIccSmsInterfaceManager();
  public IccPhoneBookInterfaceManager getIccPhoneBookInterfaceManager();
  public void activateCellBroadcastSms(int arg1, android.os.Message arg2);
  public void getCellBroadcastSmsConfig(android.os.Message arg1);
  public void setCellBroadcastSmsConfig(int [] arg1, android.os.Message arg2);
  public boolean needsOtaServiceProvisioning();
  public android.net.LinkProperties getLinkProperties(java.lang.String arg1);
  public android.telephony.CellLocation getCellLocation();
  public IccCard getIccCard();
  public int getPhoneType();
  public void disableDnsCheck(boolean arg1);
  public boolean isDnsCheckDisabled();
  public void registerForPreciseCallStateChanged(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handleMessage")  android.os.Handler arg1, int arg2, java.lang.Object arg3);
  public void unregisterForPreciseCallStateChanged(android.os.Handler arg1);
  public void registerForUnknownConnection(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handleMessage")  android.os.Handler arg1, int arg2, java.lang.Object arg3);
  public void unregisterForUnknownConnection(android.os.Handler arg1);
  public void registerForNewRingingConnection(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handleMessage")  android.os.Handler arg1, int arg2, java.lang.Object arg3);
  public void unregisterForNewRingingConnection(android.os.Handler arg1);
  public void registerForIncomingRing(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handleMessage")  android.os.Handler arg1, int arg2, java.lang.Object arg3);
  public void unregisterForIncomingRing(android.os.Handler arg1);
  public void registerForDisconnect(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handleMessage")  android.os.Handler arg1, int arg2, java.lang.Object arg3);
  public void unregisterForDisconnect(android.os.Handler arg1);
  public void registerForSuppServiceFailed(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handleMessage")  android.os.Handler arg1, int arg2, java.lang.Object arg3);
  public void unregisterForSuppServiceFailed(android.os.Handler arg1);
  public void registerForMmiInitiate(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handleMessage")  android.os.Handler arg1, int arg2, java.lang.Object arg3);
  public void unregisterForMmiInitiate(android.os.Handler arg1);
  public void registerForMmiComplete(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handleMessage")  android.os.Handler arg1, int arg2, java.lang.Object arg3);
  public void unregisterForMmiComplete(android.os.Handler arg1);
  public void setUnitTestMode(boolean arg1);
  public boolean getUnitTestMode();
  public void registerForServiceStateChanged(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handleMessage")  android.os.Handler arg1, int arg2, java.lang.Object arg3);
  public void unregisterForServiceStateChanged(android.os.Handler arg1);
  public com.android.internal.telephony.test.SimulatedRadioControl getSimulatedRadioControl();
  public void setCdmaSubscription(int arg1, android.os.Message arg2);
  public void enableEnhancedVoicePrivacy(boolean arg1, android.os.Message arg2);
  public void getEnhancedVoicePrivacy(android.os.Message arg1);
  public void notifyDataActivity();
  public int getCdmaEriIconIndex();
  public int getCdmaEriIconMode();
  public java.lang.String getCdmaEriText();
  public java.lang.String getCdmaMin();
  public boolean isMinInfoReady();
  public java.lang.String getCdmaPrlVersion();
  public void registerForCdmaOtaStatusChange(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handleMessage")  android.os.Handler arg1, int arg2, java.lang.Object arg3);
  public void unregisterForCdmaOtaStatusChange(android.os.Handler arg1);
  public void registerForSubscriptionInfoReady(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handleMessage")  android.os.Handler arg1, int arg2, java.lang.Object arg3);
  public void unregisterForSubscriptionInfoReady(android.os.Handler arg1);
  public boolean isOtaSpNumber(java.lang.String arg1);
  public void registerForCallWaiting(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handleMessage") android.os.Handler arg1, int arg2, java.lang.Object arg3);
  public void unregisterForCallWaiting(android.os.Handler arg1);
  public void registerForEcmTimerReset(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handleMessage")  android.os.Handler arg1, int arg2, java.lang.Object arg3);
  public void unregisterForEcmTimerReset(android.os.Handler arg1);
  public void setOnEcbModeExitResponse(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handleMessage")  android.os.Handler arg1, int arg2, java.lang.Object arg3);
  public void unsetOnEcbModeExitResponse(android.os.Handler arg1);
  public java.lang.String [] getActiveApnTypes();
  public java.lang.String getActiveApnHost(java.lang.String arg1);
  public android.net.LinkCapabilities getLinkCapabilities(java.lang.String arg1);
  public int enableApnType(java.lang.String arg1);
  public int disableApnType(java.lang.String arg1);
  public java.lang.String getMsisdn();
}
