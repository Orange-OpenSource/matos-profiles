package com.android.internal.telephony.test;

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


public final class SimulatedCommands
  extends com.android.internal.telephony.BaseCommands  implements com.android.internal.telephony.CommandsInterface, SimulatedRadioControl
{
  // Constructors

  public SimulatedCommands(){
    super((android.content.Context) null);
  }
  // Methods

  public void shutdown(){
  }
  public void setMute(boolean arg1, android.os.Message arg2){
  }
  public void getIMSI(android.os.Message arg1){
  }
  public void iccIO(int arg1, int arg2, java.lang.String arg3, int arg4, int arg5, int arg6, java.lang.String arg7, java.lang.String arg8, android.os.Message arg9){
  }
  public void getIccCardStatus(android.os.Message arg1){
  }
  public void supplyIccPin(java.lang.String arg1, android.os.Message arg2){
  }
  public void supplyIccPinForApp(java.lang.String arg1, java.lang.String arg2, android.os.Message arg3){
  }
  public void supplyIccPuk(java.lang.String arg1, java.lang.String arg2, android.os.Message arg3){
  }
  public void supplyIccPukForApp(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, android.os.Message arg4){
  }
  public void supplyIccPin2(java.lang.String arg1, android.os.Message arg2){
  }
  public void supplyIccPin2ForApp(java.lang.String arg1, java.lang.String arg2, android.os.Message arg3){
  }
  public void supplyIccPuk2(java.lang.String arg1, java.lang.String arg2, android.os.Message arg3){
  }
  public void supplyIccPuk2ForApp(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, android.os.Message arg4){
  }
  public void changeIccPin(java.lang.String arg1, java.lang.String arg2, android.os.Message arg3){
  }
  public void changeIccPinForApp(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, android.os.Message arg4){
  }
  public void changeIccPin2(java.lang.String arg1, java.lang.String arg2, android.os.Message arg3){
  }
  public void changeIccPin2ForApp(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, android.os.Message arg4){
  }
  public void changeBarringPassword(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, android.os.Message arg4){
  }
  public void supplyNetworkDepersonalization(java.lang.String arg1, android.os.Message arg2){
  }
  public void getCurrentCalls(android.os.Message arg1){
  }
  public void getPDPContextList(android.os.Message arg1){
  }
  public void getDataCallList(android.os.Message arg1){
  }
  public void dial(java.lang.String arg1, int arg2, android.os.Message arg3){
  }
  public void dial(java.lang.String arg1, int arg2, com.android.internal.telephony.UUSInfo arg3, android.os.Message arg4){
  }
  public void getIMEI(android.os.Message arg1){
  }
  public void getIMEISV(android.os.Message arg1){
  }
  public void hangupConnection(int arg1, android.os.Message arg2){
  }
  public void hangupWaitingOrBackground(android.os.Message arg1){
  }
  public void hangupForegroundResumeBackground(android.os.Message arg1){
  }
  public void switchWaitingOrHoldingAndActive(android.os.Message arg1){
  }
  public void conference(android.os.Message arg1){
  }
  public void setPreferredVoicePrivacy(boolean arg1, android.os.Message arg2){
  }
  public void getPreferredVoicePrivacy(android.os.Message arg1){
  }
  public void separateConnection(int arg1, android.os.Message arg2){
  }
  public void acceptCall(android.os.Message arg1){
  }
  public void rejectCall(android.os.Message arg1){
  }
  public void explicitCallTransfer(android.os.Message arg1){
  }
  public void getLastCallFailCause(android.os.Message arg1){
  }
  public void getLastPdpFailCause(android.os.Message arg1){
  }
  public void getLastDataCallFailCause(android.os.Message arg1){
  }
  public void getMute(android.os.Message arg1){
  }
  public void getSignalStrength(android.os.Message arg1){
  }
  public void getVoiceRegistrationState(android.os.Message arg1){
  }
  public void getDataRegistrationState(android.os.Message arg1){
  }
  public void getOperator(android.os.Message arg1){
  }
  public void sendDtmf(char arg1, android.os.Message arg2){
  }
  public void startDtmf(char arg1, android.os.Message arg2){
  }
  public void stopDtmf(android.os.Message arg1){
  }
  public void sendBurstDtmf(java.lang.String arg1, int arg2, int arg3, android.os.Message arg4){
  }
  public void sendSMS(java.lang.String arg1, java.lang.String arg2, android.os.Message arg3){
  }
  public void sendCdmaSms(byte [] arg1, android.os.Message arg2){
  }
  public void deleteSmsOnSim(int arg1, android.os.Message arg2){
  }
  public void deleteSmsOnRuim(int arg1, android.os.Message arg2){
  }
  public void writeSmsToSim(int arg1, java.lang.String arg2, java.lang.String arg3, android.os.Message arg4){
  }
  public void writeSmsToRuim(int arg1, java.lang.String arg2, android.os.Message arg3){
  }
  public void setupDataCall(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5, java.lang.String arg6, java.lang.String arg7, android.os.Message arg8){
  }
  public void deactivateDataCall(int arg1, int arg2, android.os.Message arg3){
  }
  public void setRadioPower(boolean arg1, android.os.Message arg2){
  }
  public void setSuppServiceNotifications(boolean arg1, android.os.Message arg2){
  }
  public void acknowledgeLastIncomingGsmSms(boolean arg1, int arg2, android.os.Message arg3){
  }
  public void acknowledgeLastIncomingCdmaSms(boolean arg1, int arg2, android.os.Message arg3){
  }
  public void getCLIR(android.os.Message arg1){
  }
  public void setCLIR(int arg1, android.os.Message arg2){
  }
  public void queryCallWaiting(int arg1, android.os.Message arg2){
  }
  public void setCallWaiting(boolean arg1, int arg2, android.os.Message arg3){
  }
  public void setNetworkSelectionModeAutomatic(android.os.Message arg1){
  }
  public void setNetworkSelectionModeManual(java.lang.String arg1, android.os.Message arg2){
  }
  public void getNetworkSelectionMode(android.os.Message arg1){
  }
  public void getAvailableNetworks(android.os.Message arg1){
  }
  public void setCallForward(int arg1, int arg2, int arg3, java.lang.String arg4, int arg5, android.os.Message arg6){
  }
  public void queryCallForwardStatus(int arg1, int arg2, java.lang.String arg3, android.os.Message arg4){
  }
  public void queryCLIP(android.os.Message arg1){
  }
  public void getBasebandVersion(android.os.Message arg1){
  }
  public void queryFacilityLock(java.lang.String arg1, java.lang.String arg2, int arg3, android.os.Message arg4){
  }
  public void queryFacilityLockForApp(java.lang.String arg1, java.lang.String arg2, int arg3, java.lang.String arg4, android.os.Message arg5){
  }
  public void setFacilityLock(java.lang.String arg1, boolean arg2, java.lang.String arg3, int arg4, android.os.Message arg5){
  }
  public void setFacilityLockForApp(java.lang.String arg1, boolean arg2, java.lang.String arg3, int arg4, java.lang.String arg5, android.os.Message arg6){
  }
  public void sendUSSD(java.lang.String arg1, android.os.Message arg2){
  }
  public void cancelPendingUssd(android.os.Message arg1){
  }
  public void resetRadio(android.os.Message arg1){
  }
  public void invokeOemRilRequestRaw(byte [] arg1, android.os.Message arg2){
  }
  public void invokeOemRilRequestStrings(java.lang.String [] arg1, android.os.Message arg2){
  }
  public void setBandMode(int arg1, android.os.Message arg2){
  }
  public void queryAvailableBandMode(android.os.Message arg1){
  }
  public void sendTerminalResponse(java.lang.String arg1, android.os.Message arg2){
  }
  public void sendEnvelope(java.lang.String arg1, android.os.Message arg2){
  }
  public void handleCallSetupRequestFromSim(boolean arg1, android.os.Message arg2){
  }
  public void setPreferredNetworkType(int arg1, android.os.Message arg2){
  }
  public void getPreferredNetworkType(android.os.Message arg1){
  }
  public void getNeighboringCids(android.os.Message arg1){
  }
  public void setLocationUpdates(boolean arg1, android.os.Message arg2){
  }
  public void getSmscAddress(android.os.Message arg1){
  }
  public void setSmscAddress(java.lang.String arg1, android.os.Message arg2){
  }
  public void reportSmsMemoryStatus(boolean arg1, android.os.Message arg2){
  }
  public void reportStkServiceIsRunning(android.os.Message arg1){
  }
  public void getGsmBroadcastConfig(android.os.Message arg1){
  }
  public void setGsmBroadcastConfig(com.android.internal.telephony.gsm.SmsBroadcastConfigInfo [] arg1, android.os.Message arg2){
  }
  public void setGsmBroadcastActivation(boolean arg1, android.os.Message arg2){
  }
  public void getDeviceIdentity(android.os.Message arg1){
  }
  public void getCDMASubscription(android.os.Message arg1){
  }
  public void setPhoneType(int arg1){
  }
  public void queryCdmaRoamingPreference(android.os.Message arg1){
  }
  public void setCdmaRoamingPreference(int arg1, android.os.Message arg2){
  }
  public void setCdmaSubscriptionSource(int arg1, android.os.Message arg2){
  }
  public void getCdmaSubscriptionSource(android.os.Message arg1){
  }
  public void queryTTYMode(android.os.Message arg1){
  }
  public void setTTYMode(int arg1, android.os.Message arg2){
  }
  public void sendCDMAFeatureCode(java.lang.String arg1, android.os.Message arg2){
  }
  public void getCdmaBroadcastConfig(android.os.Message arg1){
  }
  public void setCdmaBroadcastConfig(int [] arg1, android.os.Message arg2){
  }
  public void setCdmaBroadcastActivation(boolean arg1, android.os.Message arg2){
  }
  public void exitEmergencyCallbackMode(android.os.Message arg1){
  }
  public void requestIsimAuthentication(java.lang.String arg1, android.os.Message arg2){
  }
  public void triggerRing(java.lang.String arg1){
  }
  public void progressConnectingCallState(){
  }
  public void progressConnectingToActive(){
  }
  public void setAutoProgressConnectingCall(boolean arg1){
  }
  public void setNextDialFailImmediately(boolean arg1){
  }
  public void setNextCallFailCause(int arg1){
  }
  public void triggerHangupForeground(){
  }
  public void triggerHangupBackground(){
  }
  public void triggerHangupAll(){
  }
  public void triggerIncomingSMS(java.lang.String arg1){
  }
  public void pauseResponses(){
  }
  public void resumeResponses(){
  }
  public void triggerSsn(int arg1, int arg2){
  }
  public void triggerIncomingUssd(java.lang.String arg1, java.lang.String arg2){
  }
  public void forceDataDormancy(android.os.Message arg1){
  }
}
