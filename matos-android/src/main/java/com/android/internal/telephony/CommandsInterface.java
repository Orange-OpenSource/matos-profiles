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
public interface CommandsInterface
{
  // Classes

  public static enum RadioState
  {
    // Enum Constants

    RADIO_OFF(0)
, RADIO_UNAVAILABLE(0)
, SIM_NOT_READY(0)
, SIM_LOCKED_OR_ABSENT(0)
, SIM_READY(0)
, RUIM_NOT_READY(0)
, RUIM_READY(0)
, RUIM_LOCKED_OR_ABSENT(0)
, NV_NOT_READY(0)
, NV_READY(0)
;
    // Fields

    // Constructors

    private RadioState(int arg1){
    }
    // Methods

    public boolean isOn(){
      return false;
    }
    public int getType(){
      return 0;
    }
    public boolean isAvailable(){
      return false;
    }
    public boolean isGsm(){
      return false;
    }
    public boolean isSIMReady(){
      return false;
    }
    public boolean isRUIMReady(){
      return false;
    }
    public boolean isNVReady(){
      return false;
    }
    public boolean isCdma(){
      return false;
    }
  }
  // Fields

  public static final int CLIR_DEFAULT = 0;

  public static final int CLIR_INVOCATION = 1;

  public static final int CLIR_SUPPRESSION = 2;

  public static final int CF_ACTION_DISABLE = 0;

  public static final int CF_ACTION_ENABLE = 1;

  public static final int CF_ACTION_REGISTRATION = 3;

  public static final int CF_ACTION_ERASURE = 4;

  public static final int CF_REASON_UNCONDITIONAL = 0;

  public static final int CF_REASON_BUSY = 1;

  public static final int CF_REASON_NO_REPLY = 2;

  public static final int CF_REASON_NOT_REACHABLE = 3;

  public static final int CF_REASON_ALL = 4;

  public static final int CF_REASON_ALL_CONDITIONAL = 5;

  public static final java.lang.String CB_FACILITY_BAOC = "AO";

  public static final java.lang.String CB_FACILITY_BAOIC = "OI";

  public static final java.lang.String CB_FACILITY_BAOICxH = "OX";

  public static final java.lang.String CB_FACILITY_BAIC = "AI";

  public static final java.lang.String CB_FACILITY_BAICr = "IR";

  public static final java.lang.String CB_FACILITY_BA_ALL = "AB";

  public static final java.lang.String CB_FACILITY_BA_MO = "AG";

  public static final java.lang.String CB_FACILITY_BA_MT = "AC";

  public static final java.lang.String CB_FACILITY_BA_SIM = "SC";

  public static final java.lang.String CB_FACILITY_BA_FD = "FD";

  public static final int SERVICE_CLASS_NONE = 0;

  public static final int SERVICE_CLASS_VOICE = 1;

  public static final int SERVICE_CLASS_DATA = 2;

  public static final int SERVICE_CLASS_FAX = 4;

  public static final int SERVICE_CLASS_SMS = 8;

  public static final int SERVICE_CLASS_DATA_SYNC = 16;

  public static final int SERVICE_CLASS_DATA_ASYNC = 32;

  public static final int SERVICE_CLASS_PACKET = 64;

  public static final int SERVICE_CLASS_PAD = 128;

  public static final int SERVICE_CLASS_MAX = 128;

  public static final int USSD_MODE_NOTIFY = 0;

  public static final int USSD_MODE_REQUEST = 1;

  public static final int SIM_REFRESH_FILE_UPDATED = 0;

  public static final int SIM_REFRESH_INIT = 1;

  public static final int SIM_REFRESH_RESET = 2;

  public static final int GSM_SMS_FAIL_CAUSE_MEMORY_CAPACITY_EXCEEDED = 211;

  public static final int GSM_SMS_FAIL_CAUSE_UNSPECIFIED_ERROR = 255;

  public static final int CDMA_SMS_FAIL_CAUSE_INVALID_TELESERVICE_ID = 4;

  public static final int CDMA_SMS_FAIL_CAUSE_RESOURCE_SHORTAGE = 35;

  public static final int CDMA_SMS_FAIL_CAUSE_OTHER_TERMINAL_PROBLEM = 39;

  public static final int CDMA_SMS_FAIL_CAUSE_ENCODING_PROBLEM = 96;

  // Methods

  public void setMute(boolean arg1, android.os.Message arg2);
  public void getIMSI(android.os.Message arg1);
  public void iccIO(int arg1, int arg2, java.lang.String arg3, int arg4, int arg5, int arg6, java.lang.String arg7, java.lang.String arg8, android.os.Message arg9);
  public void setOnNITZTime(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handleMessage") android.os.Handler arg1, int arg2, java.lang.Object arg3);
  public void getIccCardStatus(android.os.Message arg1);
  public void supplyIccPin(java.lang.String arg1, android.os.Message arg2);
  public void supplyIccPinForApp(java.lang.String arg1, java.lang.String arg2, android.os.Message arg3);
  public void supplyIccPuk(java.lang.String arg1, java.lang.String arg2, android.os.Message arg3);
  public void supplyIccPukForApp(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, android.os.Message arg4);
  public void supplyIccPin2(java.lang.String arg1, android.os.Message arg2);
  public void supplyIccPin2ForApp(java.lang.String arg1, java.lang.String arg2, android.os.Message arg3);
  public void supplyIccPuk2(java.lang.String arg1, java.lang.String arg2, android.os.Message arg3);
  public void supplyIccPuk2ForApp(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, android.os.Message arg4);
  public void changeIccPin(java.lang.String arg1, java.lang.String arg2, android.os.Message arg3);
  public void changeIccPinForApp(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, android.os.Message arg4);
  public void changeIccPin2(java.lang.String arg1, java.lang.String arg2, android.os.Message arg3);
  public void changeIccPin2ForApp(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, android.os.Message arg4);
  public void changeBarringPassword(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, android.os.Message arg4);
  public void supplyNetworkDepersonalization(java.lang.String arg1, android.os.Message arg2);
  public void getCurrentCalls(android.os.Message arg1);
  public void getPDPContextList(android.os.Message arg1);
  public void getDataCallList(android.os.Message arg1);
  public void dial(java.lang.String arg1, int arg2, android.os.Message arg3);
  public void dial(java.lang.String arg1, int arg2, UUSInfo arg3, android.os.Message arg4);
  public void getIMEI(android.os.Message arg1);
  public void getIMEISV(android.os.Message arg1);
  public void hangupConnection(int arg1, android.os.Message arg2);
  public void hangupWaitingOrBackground(android.os.Message arg1);
  public void hangupForegroundResumeBackground(android.os.Message arg1);
  public void switchWaitingOrHoldingAndActive(android.os.Message arg1);
  public void conference(android.os.Message arg1);
  public void setPreferredVoicePrivacy(boolean arg1, android.os.Message arg2);
  public void getPreferredVoicePrivacy(android.os.Message arg1);
  public void separateConnection(int arg1, android.os.Message arg2);
  public void acceptCall(android.os.Message arg1);
  public void rejectCall(android.os.Message arg1);
  public void explicitCallTransfer(android.os.Message arg1);
  public void getLastCallFailCause(android.os.Message arg1);
  public void getLastPdpFailCause(android.os.Message arg1);
  public void getLastDataCallFailCause(android.os.Message arg1);
  public void getMute(android.os.Message arg1);
  public void getSignalStrength(android.os.Message arg1);
  public void getVoiceRegistrationState(android.os.Message arg1);
  public void getDataRegistrationState(android.os.Message arg1);
  public void getOperator(android.os.Message arg1);
  public void sendDtmf(char arg1, android.os.Message arg2);
  public void startDtmf(char arg1, android.os.Message arg2);
  public void stopDtmf(android.os.Message arg1);
  public void sendBurstDtmf(java.lang.String arg1, int arg2, int arg3, android.os.Message arg4);
  public void sendSMS(java.lang.String arg1, java.lang.String arg2, android.os.Message arg3);
  public void sendCdmaSms(byte [] arg1, android.os.Message arg2);
  public void deleteSmsOnSim(int arg1, android.os.Message arg2);
  public void deleteSmsOnRuim(int arg1, android.os.Message arg2);
  public void writeSmsToSim(int arg1, java.lang.String arg2, java.lang.String arg3, android.os.Message arg4);
  public void writeSmsToRuim(int arg1, java.lang.String arg2, android.os.Message arg3);
  public void setupDataCall(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5, java.lang.String arg6, java.lang.String arg7, android.os.Message arg8);
  public void deactivateDataCall(int arg1, int arg2, android.os.Message arg3);
  public void setRadioPower(boolean arg1, android.os.Message arg2);
  public void setSuppServiceNotifications(boolean arg1, android.os.Message arg2);
  public void acknowledgeLastIncomingGsmSms(boolean arg1, int arg2, android.os.Message arg3);
  public void acknowledgeLastIncomingCdmaSms(boolean arg1, int arg2, android.os.Message arg3);
  public void getCLIR(android.os.Message arg1);
  public void setCLIR(int arg1, android.os.Message arg2);
  public void queryCallWaiting(int arg1, android.os.Message arg2);
  public void setCallWaiting(boolean arg1, int arg2, android.os.Message arg3);
  public void setNetworkSelectionModeAutomatic(android.os.Message arg1);
  public void setNetworkSelectionModeManual(java.lang.String arg1, android.os.Message arg2);
  public void getNetworkSelectionMode(android.os.Message arg1);
  public void getAvailableNetworks(android.os.Message arg1);
  public void setCallForward(int arg1, int arg2, int arg3, java.lang.String arg4, int arg5, android.os.Message arg6);
  public void queryCallForwardStatus(int arg1, int arg2, java.lang.String arg3, android.os.Message arg4);
  public void queryCLIP(android.os.Message arg1);
  public void getBasebandVersion(android.os.Message arg1);
  public void queryFacilityLock(java.lang.String arg1, java.lang.String arg2, int arg3, android.os.Message arg4);
  public void queryFacilityLockForApp(java.lang.String arg1, java.lang.String arg2, int arg3, java.lang.String arg4, android.os.Message arg5);
  public void setFacilityLock(java.lang.String arg1, boolean arg2, java.lang.String arg3, int arg4, android.os.Message arg5);
  public void setFacilityLockForApp(java.lang.String arg1, boolean arg2, java.lang.String arg3, int arg4, java.lang.String arg5, android.os.Message arg6);
  public void sendUSSD(java.lang.String arg1, android.os.Message arg2);
  public void cancelPendingUssd(android.os.Message arg1);
  public void resetRadio(android.os.Message arg1);
  public void invokeOemRilRequestRaw(byte [] arg1, android.os.Message arg2);
  public void invokeOemRilRequestStrings(java.lang.String [] arg1, android.os.Message arg2);
  public void setBandMode(int arg1, android.os.Message arg2);
  public void queryAvailableBandMode(android.os.Message arg1);
  public void sendTerminalResponse(java.lang.String arg1, android.os.Message arg2);
  public void sendEnvelope(java.lang.String arg1, android.os.Message arg2);
  public void handleCallSetupRequestFromSim(boolean arg1, android.os.Message arg2);
  public void setPreferredNetworkType(int arg1, android.os.Message arg2);
  public void getPreferredNetworkType(android.os.Message arg1);
  public void getNeighboringCids(android.os.Message arg1);
  public void setLocationUpdates(boolean arg1, android.os.Message arg2);
  public void getSmscAddress(android.os.Message arg1);
  public void setSmscAddress(java.lang.String arg1, android.os.Message arg2);
  public void reportSmsMemoryStatus(boolean arg1, android.os.Message arg2);
  public void reportStkServiceIsRunning(android.os.Message arg1);
  public void getGsmBroadcastConfig(android.os.Message arg1);
  public void setGsmBroadcastConfig(com.android.internal.telephony.gsm.SmsBroadcastConfigInfo [] arg1, android.os.Message arg2);
  public void setGsmBroadcastActivation(boolean arg1, android.os.Message arg2);
  public void getDeviceIdentity(android.os.Message arg1);
  public void getCDMASubscription(android.os.Message arg1);
  public void setPhoneType(int arg1);
  public void queryCdmaRoamingPreference(android.os.Message arg1);
  public void setCdmaRoamingPreference(int arg1, android.os.Message arg2);
  public void setCdmaSubscriptionSource(int arg1, android.os.Message arg2);
  public void getCdmaSubscriptionSource(android.os.Message arg1);
  public void queryTTYMode(android.os.Message arg1);
  public void setTTYMode(int arg1, android.os.Message arg2);
  public void sendCDMAFeatureCode(java.lang.String arg1, android.os.Message arg2);
  public void getCdmaBroadcastConfig(android.os.Message arg1);
  public void setCdmaBroadcastConfig(int [] arg1, android.os.Message arg2);
  public void setCdmaBroadcastActivation(boolean arg1, android.os.Message arg2);
  public void exitEmergencyCallbackMode(android.os.Message arg1);
  public void requestIsimAuthentication(java.lang.String arg1, android.os.Message arg2);
  public CommandsInterface.RadioState getRadioState();
  public CommandsInterface.RadioState getSimState();
  public CommandsInterface.RadioState getRuimState();
  public CommandsInterface.RadioState getNvState();
  public void registerForRadioStateChanged(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handleMessage") android.os.Handler arg1, int arg2, java.lang.Object arg3);
  public void unregisterForRadioStateChanged(android.os.Handler arg1);
  public void registerForOn(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handleMessage") android.os.Handler arg1, int arg2, java.lang.Object arg3);
  public void unregisterForOn(android.os.Handler arg1);
  public void registerForAvailable(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handleMessage") android.os.Handler arg1, int arg2, java.lang.Object arg3);
  public void unregisterForAvailable(android.os.Handler arg1);
  public void registerForNotAvailable(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handleMessage") android.os.Handler arg1, int arg2, java.lang.Object arg3);
  public void unregisterForNotAvailable(android.os.Handler arg1);
  public void registerForOffOrNotAvailable(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handleMessage") android.os.Handler arg1, int arg2, java.lang.Object arg3);
  public void unregisterForOffOrNotAvailable(android.os.Handler arg1);
  public void registerForSIMReady(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handleMessage") android.os.Handler arg1, int arg2, java.lang.Object arg3);
  public void unregisterForSIMReady(android.os.Handler arg1);
  public void registerForSIMLockedOrAbsent(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handleMessage") android.os.Handler arg1, int arg2, java.lang.Object arg3);
  public void unregisterForSIMLockedOrAbsent(android.os.Handler arg1);
  public void registerForIccStatusChanged(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handleMessage") android.os.Handler arg1, int arg2, java.lang.Object arg3);
  public void unregisterForIccStatusChanged(android.os.Handler arg1);
  public void registerForCallStateChanged(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handleMessage") android.os.Handler arg1, int arg2, java.lang.Object arg3);
  public void unregisterForCallStateChanged(android.os.Handler arg1);
  public void registerForVoiceNetworkStateChanged(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handleMessage") android.os.Handler arg1, int arg2, java.lang.Object arg3);
  public void unregisterForVoiceNetworkStateChanged(android.os.Handler arg1);
  public void registerForDataNetworkStateChanged(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handleMessage") android.os.Handler arg1, int arg2, java.lang.Object arg3);
  public void unregisterForDataNetworkStateChanged(android.os.Handler arg1);
  public void registerForRadioTechnologyChanged(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handleMessage") android.os.Handler arg1, int arg2, java.lang.Object arg3);
  public void unregisterForRadioTechnologyChanged(android.os.Handler arg1);
  public void registerForNVReady(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handleMessage") android.os.Handler arg1, int arg2, java.lang.Object arg3);
  public void unregisterForNVReady(android.os.Handler arg1);
  public void registerForRUIMLockedOrAbsent(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handleMessage") android.os.Handler arg1, int arg2, java.lang.Object arg3);
  public void unregisterForRUIMLockedOrAbsent(android.os.Handler arg1);
  public void registerForInCallVoicePrivacyOn(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handleMessage") android.os.Handler arg1, int arg2, java.lang.Object arg3);
  public void unregisterForInCallVoicePrivacyOn(android.os.Handler arg1);
  public void registerForInCallVoicePrivacyOff(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handleMessage") android.os.Handler arg1, int arg2, java.lang.Object arg3);
  public void unregisterForInCallVoicePrivacyOff(android.os.Handler arg1);
  public void registerForRUIMReady(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handleMessage") android.os.Handler arg1, int arg2, java.lang.Object arg3);
  public void unregisterForRUIMReady(android.os.Handler arg1);
  public void setOnNewGsmSms(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handleMessage") android.os.Handler arg1, int arg2, java.lang.Object arg3);
  public void unSetOnNewGsmSms(android.os.Handler arg1);
  public void setOnNewCdmaSms(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handleMessage") android.os.Handler arg1, int arg2, java.lang.Object arg3);
  public void unSetOnNewCdmaSms(android.os.Handler arg1);
  public void setOnNewGsmBroadcastSms(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handleMessage") android.os.Handler arg1, int arg2, java.lang.Object arg3);
  public void unSetOnNewGsmBroadcastSms(android.os.Handler arg1);
  public void setOnSmsOnSim(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handleMessage") android.os.Handler arg1, int arg2, java.lang.Object arg3);
  public void unSetOnSmsOnSim(android.os.Handler arg1);
  public void setOnSmsStatus(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handleMessage") android.os.Handler arg1, int arg2, java.lang.Object arg3);
  public void unSetOnSmsStatus(android.os.Handler arg1);
  public void unSetOnNITZTime(android.os.Handler arg1);
  public void setOnUSSD(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handleMessage") android.os.Handler arg1, int arg2, java.lang.Object arg3);
  public void unSetOnUSSD(android.os.Handler arg1);
  public void setOnSignalStrengthUpdate(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handleMessage") android.os.Handler arg1, int arg2, java.lang.Object arg3);
  public void unSetOnSignalStrengthUpdate(android.os.Handler arg1);
  public void setOnIccSmsFull(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handleMessage") android.os.Handler arg1, int arg2, java.lang.Object arg3);
  public void unSetOnIccSmsFull(android.os.Handler arg1);
  public void registerForIccRefresh(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handleMessage") android.os.Handler arg1, int arg2, java.lang.Object arg3);
  public void unregisterForIccRefresh(android.os.Handler arg1);
  public void setOnIccRefresh(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handleMessage") android.os.Handler arg1, int arg2, java.lang.Object arg3);
  public void unsetOnIccRefresh(android.os.Handler arg1);
  public void setOnCallRing(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handleMessage") android.os.Handler arg1, int arg2, java.lang.Object arg3);
  public void unSetOnCallRing(android.os.Handler arg1);
  public void setOnRestrictedStateChanged(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handleMessage") android.os.Handler arg1, int arg2, java.lang.Object arg3);
  public void unSetOnRestrictedStateChanged(android.os.Handler arg1);
  public void setOnSuppServiceNotification(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handleMessage") android.os.Handler arg1, int arg2, java.lang.Object arg3);
  public void unSetOnSuppServiceNotification(android.os.Handler arg1);
  public void setOnCatSessionEnd(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handleMessage") android.os.Handler arg1, int arg2, java.lang.Object arg3);
  public void unSetOnCatSessionEnd(android.os.Handler arg1);
  public void setOnCatProactiveCmd(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handleMessage") android.os.Handler arg1, int arg2, java.lang.Object arg3);
  public void unSetOnCatProactiveCmd(android.os.Handler arg1);
  public void setOnCatEvent(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handleMessage") android.os.Handler arg1, int arg2, java.lang.Object arg3);
  public void unSetOnCatEvent(android.os.Handler arg1);
  public void setOnCatCallSetUp(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handleMessage") android.os.Handler arg1, int arg2, java.lang.Object arg3);
  public void unSetOnCatCallSetUp(android.os.Handler arg1);
  public void registerForDisplayInfo(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handleMessage") android.os.Handler arg1, int arg2, java.lang.Object arg3);
  public void unregisterForDisplayInfo(android.os.Handler arg1);
  public void registerForCallWaitingInfo(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handleMessage") android.os.Handler arg1, int arg2, java.lang.Object arg3);
  public void unregisterForCallWaitingInfo(android.os.Handler arg1);
  public void registerForSignalInfo(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handleMessage") android.os.Handler arg1, int arg2, java.lang.Object arg3);
  public void unregisterForSignalInfo(android.os.Handler arg1);
  public void registerForNumberInfo(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handleMessage") android.os.Handler arg1, int arg2, java.lang.Object arg3);
  public void unregisterForNumberInfo(android.os.Handler arg1);
  public void registerForRedirectedNumberInfo(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handleMessage") android.os.Handler arg1, int arg2, java.lang.Object arg3);
  public void unregisterForRedirectedNumberInfo(android.os.Handler arg1);
  public void registerForLineControlInfo(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handleMessage") android.os.Handler arg1, int arg2, java.lang.Object arg3);
  public void unregisterForLineControlInfo(android.os.Handler arg1);
  public void registerFoT53ClirlInfo(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handleMessage") android.os.Handler arg1, int arg2, java.lang.Object arg3);
  public void unregisterForT53ClirInfo(android.os.Handler arg1);
  public void registerForT53AudioControlInfo(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handleMessage") android.os.Handler arg1, int arg2, java.lang.Object arg3);
  public void unregisterForT53AudioControlInfo(android.os.Handler arg1);
  public void setEmergencyCallbackMode(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handleMessage") android.os.Handler arg1, int arg2, java.lang.Object arg3);
  public void registerForCdmaOtaProvision(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handleMessage") android.os.Handler arg1, int arg2, java.lang.Object arg3);
  public void unregisterForCdmaOtaProvision(android.os.Handler arg1);
  public void registerForRingbackTone(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handleMessage") android.os.Handler arg1, int arg2, java.lang.Object arg3);
  public void unregisterForRingbackTone(android.os.Handler arg1);
  public void registerForResendIncallMute(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handleMessage") android.os.Handler arg1, int arg2, java.lang.Object arg3);
  public void unregisterForResendIncallMute(android.os.Handler arg1);
  public void registerForCdmaSubscriptionChanged(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handleMessage") android.os.Handler arg1, int arg2, java.lang.Object arg3);
  public void unregisterForCdmaSubscriptionChanged(android.os.Handler arg1);
  public void registerForCdmaPrlChanged(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handleMessage") android.os.Handler arg1, int arg2, java.lang.Object arg3);
  public void unregisterForCdmaPrlChanged(android.os.Handler arg1);
  public void registerForExitEmergencyCallbackMode(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handleMessage") android.os.Handler arg1, int arg2, java.lang.Object arg3);
  public void unregisterForExitEmergencyCallbackMode(android.os.Handler arg1);
  public void registerForRilConnected(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handleMessage") android.os.Handler arg1, int arg2, java.lang.Object arg3);
  public void unregisterForRilConnected(android.os.Handler arg1);
  public int getLteOnCdmaMode();
}
