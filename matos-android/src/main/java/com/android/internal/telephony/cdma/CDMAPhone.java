package com.android.internal.telephony.cdma;

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
public class CDMAPhone
  extends com.android.internal.telephony.PhoneBase{
  // Fields

  protected java.lang.String mImei;

  protected java.lang.String mImeiSv;

  // Constructors
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public CDMAPhone(android.content.Context arg1, com.android.internal.telephony.CommandsInterface arg2, @com.francetelecom.rd.stubs.annotation.CallBackRegister("phoneNotifier") com.android.internal.telephony.PhoneNotifier arg3){
    super((com.android.internal.telephony.PhoneNotifier) null, (android.content.Context) null, (com.android.internal.telephony.CommandsInterface) null);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public CDMAPhone(android.content.Context arg1, com.android.internal.telephony.CommandsInterface arg2, @com.francetelecom.rd.stubs.annotation.CallBackRegister("phoneNotifier") com.android.internal.telephony.PhoneNotifier arg3, boolean arg4){
    super((com.android.internal.telephony.PhoneNotifier) null, (android.content.Context) null, (com.android.internal.telephony.CommandsInterface) null);
  }
  // Methods

  protected void finalize(){
  }
  protected void log(java.lang.String arg1){
  }
  protected void init(android.content.Context arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("phoneNotifier") com.android.internal.telephony.PhoneNotifier arg2){
  }
  public com.android.internal.telephony.Phone.State getState(){
    return (com.android.internal.telephony.Phone.State) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void handleMessage(android.os.Message arg1){
  }
  public void dispose(){
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
  public int getVoiceMessageCount(){
    return 0;
  }
  public void getDataCallList(android.os.Message arg1){
  }
  public com.android.internal.telephony.Connection dial(java.lang.String arg1) throws com.android.internal.telephony.CallStateException{
    return (com.android.internal.telephony.Connection) null;
  }
  public com.android.internal.telephony.Connection dial(java.lang.String arg1, com.android.internal.telephony.UUSInfo arg2) throws com.android.internal.telephony.CallStateException{
    return (com.android.internal.telephony.Connection) null;
  }
  public void conference() throws com.android.internal.telephony.CallStateException{
  }
  public void acceptCall() throws com.android.internal.telephony.CallStateException{
  }
  public void rejectCall() throws com.android.internal.telephony.CallStateException{
  }
  public void explicitCallTransfer(){
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
  public void getNeighboringCids(android.os.Message arg1){
  }
  public void exitEmergencyCallbackMode(){
  }
  public void clearDisconnected(){
  }
  public void switchHoldingAndActive() throws com.android.internal.telephony.CallStateException{
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
  public CdmaCall getForegroundCall(){
    return (CdmaCall) null;
  }
  public CdmaCall getBackgroundCall(){
    return (CdmaCall) null;
  }
  public CdmaCall getRingingCall(){
    return (CdmaCall) null;
  }
  public boolean getMessageWaitingIndicator(){
    return false;
  }
  public boolean getCallForwardingIndicator(){
    return false;
  }
  public java.util.List<? extends com.android.internal.telephony.MmiCode> getPendingMmiCodes(){
    return (java.util.List) null;
  }
  public com.android.internal.telephony.Phone.DataState getDataConnectionState(java.lang.String arg1){
    return (com.android.internal.telephony.Phone.DataState) null;
  }
  public com.android.internal.telephony.Phone.DataActivityState getDataActivityState(){
    return (com.android.internal.telephony.Phone.DataActivityState) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean handleInCallMmiCommands(java.lang.String arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean handlePinMmi(java.lang.String arg1){
    return false;
  }
  public void sendUssdResponse(java.lang.String arg1){
  }
  public void registerForSuppServiceNotification( android.os.Handler arg1, int arg2, java.lang.Object arg3){
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
  public void selectNetworkManually(com.android.internal.telephony.OperatorInfo arg1, android.os.Message arg2){
  }
  public void setOnPostDialCharacter( android.os.Handler arg1, int arg2, java.lang.Object arg3){
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
  public com.android.internal.telephony.PhoneSubInfo getPhoneSubInfo(){
    return (com.android.internal.telephony.PhoneSubInfo) null;
  }
  public com.android.internal.telephony.IccSmsInterfaceManager getIccSmsInterfaceManager(){
    return (com.android.internal.telephony.IccSmsInterfaceManager) null;
  }
  public com.android.internal.telephony.IccPhoneBookInterfaceManager getIccPhoneBookInterfaceManager(){
    return (com.android.internal.telephony.IccPhoneBookInterfaceManager) null;
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
  public android.telephony.CellLocation getCellLocation(){
    return (android.telephony.CellLocation) null;
  }
  public com.android.internal.telephony.IccFileHandler getIccFileHandler(){
    return (com.android.internal.telephony.IccFileHandler) null;
  }
  public int getPhoneType(){
    return 0;
  }
  public final void setSystemProperty(java.lang.String arg1, java.lang.String arg2){
  }
  public void removeReferences(){
  }
  public com.android.internal.telephony.ServiceStateTracker getServiceStateTracker(){
    return (com.android.internal.telephony.ServiceStateTracker) null;
  }
  public com.android.internal.telephony.CallTracker getCallTracker(){
    return (com.android.internal.telephony.CallTracker) null;
  }
  public void enableEnhancedVoicePrivacy(boolean arg1, android.os.Message arg2){
  }
  public void getEnhancedVoicePrivacy(android.os.Message arg1){
  }
  public boolean isInEmergencyCall(){
    return false;
  }
  public boolean isInEcm(){
    return false;
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
  public void registerForCdmaOtaStatusChange( android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForCdmaOtaStatusChange(android.os.Handler arg1){
  }
  public void registerForSubscriptionInfoReady( android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForSubscriptionInfoReady(android.os.Handler arg1){
  }
  public boolean isOtaSpNumber(java.lang.String arg1){
    return false;
  }
  public void registerForCallWaiting( android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForCallWaiting(android.os.Handler arg1){
  }
  public void registerForEcmTimerReset( android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForEcmTimerReset(android.os.Handler arg1){
  }
  public void setOnEcbModeExitResponse( android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unsetOnEcbModeExitResponse(android.os.Handler arg1){
  }
  public boolean isEriFileLoaded(){
    return false;
  }
  protected void initSstIcc(){
  }
  public void prepareEri(){
  }
  public void registerForEriFileLoaded( android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForEriFileLoaded(android.os.Handler arg1){
  }
  public void registerForNvLoaded( android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForNvLoaded(android.os.Handler arg1){
  }
}
