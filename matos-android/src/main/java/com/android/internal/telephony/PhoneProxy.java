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
public class PhoneProxy
  extends android.os.Handler  implements Phone
{
  // Fields

  public static final java.lang.Object lockForRadioTechnologyChange = null;

  // Constructors
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate") 
  public PhoneProxy(Phone arg1){
    super();
  }
  // Methods

  public android.content.Context getContext(){
    return (android.content.Context) null;
  }
  public Phone.State getState(){
    return (Phone.State) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate") 
  public void handleMessage(android.os.Message arg1){
  }
  public void setMute(boolean arg1){
  }
  public java.lang.String getVoiceMailNumber(){
    return (java.lang.String) null;
  }
  public void setVoiceMailNumber(java.lang.String arg1, java.lang.String arg2, android.os.Message arg3){
  }
  public java.lang.String getVoiceMailAlphaTag(){
    return (java.lang.String) null;
  }
  public void setVoiceMessageWaiting(int arg1, int arg2){
  }
  public int getVoiceMessageCount(){
    return 0;
  }
  public boolean isCspPlmnEnabled(){
    return false;
  }
  public com.android.internal.telephony.ims.IsimRecords getIsimRecords(){
    return (com.android.internal.telephony.ims.IsimRecords) null;
  }
  public void getDataCallList(android.os.Message arg1){
  }
  public Connection dial(java.lang.String arg1) throws CallStateException{
    return (Connection) null;
  }
  public Connection dial(java.lang.String arg1, UUSInfo arg2) throws CallStateException{
    return (Connection) null;
  }
  public void conference() throws CallStateException{
  }
  public void acceptCall() throws CallStateException{
  }
  public void rejectCall() throws CallStateException{
  }
  public void explicitCallTransfer() throws CallStateException{
  }
  public boolean getMute(){
    return false;
  }
  public android.telephony.SignalStrength getSignalStrength(){
    return (android.telephony.SignalStrength) null;
  }
  public void sendDtmf(char arg1){
  }
  public void startDtmf(char arg1){
  }
  public void stopDtmf(){
  }
  public void sendBurstDtmf(java.lang.String arg1, int arg2, int arg3, android.os.Message arg4){
  }
  public void setRadioPower(boolean arg1){
  }
  public void setCallWaiting(boolean arg1, android.os.Message arg2){
  }
  public void setNetworkSelectionModeAutomatic(android.os.Message arg1){
  }
  public void getAvailableNetworks(android.os.Message arg1){
  }
  public void invokeOemRilRequestRaw(byte [] arg1, android.os.Message arg2){
  }
  public void invokeOemRilRequestStrings(java.lang.String [] arg1, android.os.Message arg2){
  }
  public void setBandMode(int arg1, android.os.Message arg2){
  }
  public void queryAvailableBandMode(android.os.Message arg1){
  }
  public void setPreferredNetworkType(int arg1, android.os.Message arg2){
  }
  public void getPreferredNetworkType(android.os.Message arg1){
  }
  public void getNeighboringCids(android.os.Message arg1){
  }
  public void getSmscAddress(android.os.Message arg1){
  }
  public void setSmscAddress(java.lang.String arg1, android.os.Message arg2){
  }
  public void queryCdmaRoamingPreference(android.os.Message arg1){
  }
  public void setCdmaRoamingPreference(int arg1, android.os.Message arg2){
  }
  public void queryTTYMode(android.os.Message arg1){
  }
  public void setTTYMode(int arg1, android.os.Message arg2){
  }
  public void exitEmergencyCallbackMode(){
  }
  public void requestIsimAuthentication(java.lang.String arg1, android.os.Message arg2){
  }
  public void registerForInCallVoicePrivacyOn(@com.francetelecom.rd.stubs.annotation.CallBack("handleMessage") android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForInCallVoicePrivacyOn(android.os.Handler arg1){
  }
  public void registerForInCallVoicePrivacyOff(@com.francetelecom.rd.stubs.annotation.CallBack("handleMessage") android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForInCallVoicePrivacyOff(android.os.Handler arg1){
  }
  public void registerForDisplayInfo(@com.francetelecom.rd.stubs.annotation.CallBack("handleMessage") android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForDisplayInfo(android.os.Handler arg1){
  }
  public void registerForSignalInfo(@com.francetelecom.rd.stubs.annotation.CallBack("handleMessage") android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForSignalInfo(android.os.Handler arg1){
  }
  public void registerForNumberInfo(@com.francetelecom.rd.stubs.annotation.CallBack("handleMessage") android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForNumberInfo(android.os.Handler arg1){
  }
  public void registerForRedirectedNumberInfo(@com.francetelecom.rd.stubs.annotation.CallBack("handleMessage") android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForRedirectedNumberInfo(android.os.Handler arg1){
  }
  public void registerForLineControlInfo(@com.francetelecom.rd.stubs.annotation.CallBack("handleMessage") android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForLineControlInfo(android.os.Handler arg1){
  }
  public void registerFoT53ClirlInfo(@com.francetelecom.rd.stubs.annotation.CallBack("handleMessage") android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForT53ClirInfo(android.os.Handler arg1){
  }
  public void registerForT53AudioControlInfo(@com.francetelecom.rd.stubs.annotation.CallBack("handleMessage") android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForT53AudioControlInfo(android.os.Handler arg1){
  }
  public void registerForRingbackTone(@com.francetelecom.rd.stubs.annotation.CallBack("handleMessage") android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForRingbackTone(android.os.Handler arg1){
  }
  public void registerForResendIncallMute(@com.francetelecom.rd.stubs.annotation.CallBack("handleMessage") android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForResendIncallMute(android.os.Handler arg1){
  }
  public int getLteOnCdmaMode(){
    return 0;
  }
  public void clearDisconnected(){
  }
  public void switchHoldingAndActive() throws CallStateException{
  }
  public android.telephony.ServiceState getServiceState(){
    return (android.telephony.ServiceState) null;
  }
  public boolean canConference(){
    return false;
  }
  public boolean canTransfer(){
    return false;
  }
  public java.lang.String getPhoneName(){
    return (java.lang.String) null;
  }
  public void getOutgoingCallerIdDisplay(android.os.Message arg1){
  }
  public void setOutgoingCallerIdDisplay(int arg1, android.os.Message arg2){
  }
  public void getCallWaiting(android.os.Message arg1){
  }
  public void setEchoSuppressionEnabled(boolean arg1){
  }
  public Call getForegroundCall(){
    return (Call) null;
  }
  public Call getBackgroundCall(){
    return (Call) null;
  }
  public Call getRingingCall(){
    return (Call) null;
  }
  public boolean getMessageWaitingIndicator(){
    return false;
  }
  public boolean getCallForwardingIndicator(){
    return false;
  }
  public java.util.List<? extends MmiCode> getPendingMmiCodes(){
    return (java.util.List) null;
  }
  public Phone.DataState getDataConnectionState(){
    return (Phone.DataState) null;
  }
  public Phone.DataState getDataConnectionState(java.lang.String arg1){
    return (Phone.DataState) null;
  }
  public Phone.DataActivityState getDataActivityState(){
    return (Phone.DataActivityState) null;
  }
  public boolean handleInCallMmiCommands(java.lang.String arg1) throws CallStateException{
    return false;
  }
  public boolean handlePinMmi(java.lang.String arg1){
    return false;
  }
  public void sendUssdResponse(java.lang.String arg1){
  }
  public void registerForSuppServiceNotification(@com.francetelecom.rd.stubs.annotation.CallBack("handleMessage") android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForSuppServiceNotification(android.os.Handler arg1){
  }
  public java.lang.String getDeviceId(){
    return (java.lang.String) null;
  }
  public java.lang.String getDeviceSvn(){
    return (java.lang.String) null;
  }
  public java.lang.String getImei(){
    return (java.lang.String) null;
  }
  public java.lang.String getEsn(){
    return (java.lang.String) null;
  }
  public java.lang.String getMeid(){
    return (java.lang.String) null;
  }
  public java.lang.String getSubscriberId(){
    return (java.lang.String) null;
  }
  public java.lang.String getIccSerialNumber(){
    return (java.lang.String) null;
  }
  public java.lang.String getLine1Number(){
    return (java.lang.String) null;
  }
  public java.lang.String getLine1AlphaTag(){
    return (java.lang.String) null;
  }
  public void setLine1Number(java.lang.String arg1, java.lang.String arg2, android.os.Message arg3){
  }
  public void getCallForwardingOption(int arg1, android.os.Message arg2){
  }
  public void setCallForwardingOption(int arg1, int arg2, java.lang.String arg3, int arg4, android.os.Message arg5){
  }
  public boolean getIccRecordsLoaded(){
    return false;
  }
  public void selectNetworkManually(OperatorInfo arg1, android.os.Message arg2){
  }
  public void setOnPostDialCharacter(android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void updateServiceLocation(){
  }
  public void enableLocationUpdates(){
  }
  public void disableLocationUpdates(){
  }
  public boolean getDataRoamingEnabled(){
    return false;
  }
  public void setDataRoamingEnabled(boolean arg1){
  }
  public boolean isDataConnectivityPossible(){
    return false;
  }
  public boolean isDataConnectivityPossible(java.lang.String arg1){
    return false;
  }
  public PhoneSubInfo getPhoneSubInfo(){
    return (PhoneSubInfo) null;
  }
  public IccSmsInterfaceManager getIccSmsInterfaceManager(){
    return (IccSmsInterfaceManager) null;
  }
  public IccPhoneBookInterfaceManager getIccPhoneBookInterfaceManager(){
    return (IccPhoneBookInterfaceManager) null;
  }
  public void activateCellBroadcastSms(int arg1, android.os.Message arg2){
  }
  public void getCellBroadcastSmsConfig(android.os.Message arg1){
  }
  public void setCellBroadcastSmsConfig(int [] arg1, android.os.Message arg2){
  }
  public boolean needsOtaServiceProvisioning(){
    return false;
  }
  public android.net.LinkProperties getLinkProperties(java.lang.String arg1){
    return (android.net.LinkProperties) null;
  }
  public android.telephony.CellLocation getCellLocation(){
    return (android.telephony.CellLocation) null;
  }
  public IccCard getIccCard(){
    return (IccCard) null;
  }
  public int getPhoneType(){
    return 0;
  }
  public void disableDnsCheck(boolean arg1){
  }
  public boolean isDnsCheckDisabled(){
    return false;
  }
  public void registerForPreciseCallStateChanged(@com.francetelecom.rd.stubs.annotation.CallBack("handleMessage") android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForPreciseCallStateChanged(android.os.Handler arg1){
  }
  public void registerForUnknownConnection(@com.francetelecom.rd.stubs.annotation.CallBack("handleMessage") android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForUnknownConnection(android.os.Handler arg1){
  }
  public void registerForNewRingingConnection(@com.francetelecom.rd.stubs.annotation.CallBack("handleMessage") android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForNewRingingConnection(android.os.Handler arg1){
  }
  public void registerForIncomingRing(@com.francetelecom.rd.stubs.annotation.CallBack("handleMessage") android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForIncomingRing(android.os.Handler arg1){
  }
  public void registerForDisconnect(@com.francetelecom.rd.stubs.annotation.CallBack("handleMessage") android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForDisconnect(android.os.Handler arg1){
  }
  public void registerForSuppServiceFailed(@com.francetelecom.rd.stubs.annotation.CallBack("handleMessage") android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForSuppServiceFailed(android.os.Handler arg1){
  }
  public void registerForMmiInitiate(@com.francetelecom.rd.stubs.annotation.CallBack("handleMessage") android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForMmiInitiate(android.os.Handler arg1){
  }
  public void registerForMmiComplete(@com.francetelecom.rd.stubs.annotation.CallBack("handleMessage") android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForMmiComplete(android.os.Handler arg1){
  }
  public void setUnitTestMode(boolean arg1){
  }
  public boolean getUnitTestMode(){
    return false;
  }
  public void registerForServiceStateChanged(@com.francetelecom.rd.stubs.annotation.CallBack("handleMessage") android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForServiceStateChanged(android.os.Handler arg1){
  }
  public com.android.internal.telephony.test.SimulatedRadioControl getSimulatedRadioControl(){
    return (com.android.internal.telephony.test.SimulatedRadioControl) null;
  }
  public void setCdmaSubscription(int arg1, android.os.Message arg2){
  }
  public void enableEnhancedVoicePrivacy(boolean arg1, android.os.Message arg2){
  }
  public void getEnhancedVoicePrivacy(android.os.Message arg1){
  }
  public void notifyDataActivity(){
  }
  public int getCdmaEriIconIndex(){
    return 0;
  }
  public int getCdmaEriIconMode(){
    return 0;
  }
  public java.lang.String getCdmaEriText(){
    return (java.lang.String) null;
  }
  public java.lang.String getCdmaMin(){
    return (java.lang.String) null;
  }
  public boolean isMinInfoReady(){
    return false;
  }
  public java.lang.String getCdmaPrlVersion(){
    return (java.lang.String) null;
  }
  public void registerForCdmaOtaStatusChange(@com.francetelecom.rd.stubs.annotation.CallBack("handleMessage") android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForCdmaOtaStatusChange(android.os.Handler arg1){
  }
  public void registerForSubscriptionInfoReady(@com.francetelecom.rd.stubs.annotation.CallBack("handleMessage") android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForSubscriptionInfoReady(android.os.Handler arg1){
  }
  public boolean isOtaSpNumber(java.lang.String arg1){
    return false;
  }
  public void registerForCallWaiting(@com.francetelecom.rd.stubs.annotation.CallBack("handleMessage") android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForCallWaiting(android.os.Handler arg1){
  }
  public void registerForEcmTimerReset(@com.francetelecom.rd.stubs.annotation.CallBack("handleMessage") android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForEcmTimerReset(android.os.Handler arg1){
  }
  public void setOnEcbModeExitResponse(@com.francetelecom.rd.stubs.annotation.CallBack("handleMessage") android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unsetOnEcbModeExitResponse(android.os.Handler arg1){
  }
  public java.lang.String [] getActiveApnTypes(){
    return (java.lang.String []) null;
  }
  public java.lang.String getActiveApnHost(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public android.net.LinkCapabilities getLinkCapabilities(java.lang.String arg1){
    return (android.net.LinkCapabilities) null;
  }
  public int enableApnType(java.lang.String arg1){
    return 0;
  }
  public int disableApnType(java.lang.String arg1){
    return 0;
  }
  public java.lang.String getMsisdn(){
    return (java.lang.String) null;
  }
  public Phone getActivePhone(){
    return (Phone) null;
  }
}
