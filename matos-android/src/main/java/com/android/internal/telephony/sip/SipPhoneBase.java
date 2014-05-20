package com.android.internal.telephony.sip;

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
public abstract class SipPhoneBase
  extends com.android.internal.telephony.PhoneBase{
  // Constructors

  public SipPhoneBase(android.content.Context arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("phoneNotifier") com.android.internal.telephony.PhoneNotifier arg2){
    super((com.android.internal.telephony.PhoneNotifier) null, (android.content.Context) null, (com.android.internal.telephony.CommandsInterface) null);
  }
  // Methods

  public com.android.internal.telephony.Phone.State getState(){
    return (com.android.internal.telephony.Phone.State) null;
  }
  public java.lang.String getVoiceMailNumber(){
    return (java.lang.String) null;
  }
  public void setVoiceMailNumber(java.lang.String arg1, java.lang.String arg2, android.os.Message arg3){
  }
  public java.lang.String getVoiceMailAlphaTag(){
    return (java.lang.String) null;
  }
  public void getDataCallList(android.os.Message arg1){
  }
  public com.android.internal.telephony.Connection dial(java.lang.String arg1, com.android.internal.telephony.UUSInfo arg2) throws com.android.internal.telephony.CallStateException{
    return (com.android.internal.telephony.Connection) null;
  }
  public android.telephony.SignalStrength getSignalStrength(){
    return (android.telephony.SignalStrength) null;
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
  public void registerForRingbackTone(android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForRingbackTone(android.os.Handler arg1){
  }
  public android.telephony.ServiceState getServiceState(){
    return (android.telephony.ServiceState) null;
  }
  public void getOutgoingCallerIdDisplay(android.os.Message arg1){
  }
  public void setOutgoingCallerIdDisplay(int arg1, android.os.Message arg2){
  }
  public void getCallWaiting(android.os.Message arg1){
  }
  public abstract com.android.internal.telephony.Call getForegroundCall();
  public abstract com.android.internal.telephony.Call getBackgroundCall();
  public abstract com.android.internal.telephony.Call getRingingCall();
  public boolean getMessageWaitingIndicator(){
    return false;
  }
  public boolean getCallForwardingIndicator(){
    return false;
  }
  public java.util.List<? extends com.android.internal.telephony.MmiCode> getPendingMmiCodes(){
    return (java.util.List) null;
  }
  public com.android.internal.telephony.Phone.DataState getDataConnectionState(){
    return (com.android.internal.telephony.Phone.DataState) null;
  }
  public com.android.internal.telephony.Phone.DataState getDataConnectionState(java.lang.String arg1){
    return (com.android.internal.telephony.Phone.DataState) null;
  }
  public com.android.internal.telephony.Phone.DataActivityState getDataActivityState(){
    return (com.android.internal.telephony.Phone.DataActivityState) null;
  }
  public void notifyCallForwardingIndicator(){
  }
  public boolean handleInCallMmiCommands(java.lang.String arg1) throws com.android.internal.telephony.CallStateException{
    return false;
  }
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
  public void selectNetworkManually(com.android.internal.telephony.OperatorInfo arg1, android.os.Message arg2){
  }
  public void setOnPostDialCharacter( android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public java.util.List<com.android.internal.telephony.DataConnection> getCurrentDataConnectionList(){
    return (java.util.List) null;
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
  public boolean enableDataConnectivity(){
    return false;
  }
  public boolean disableDataConnectivity(){
    return false;
  }
  public boolean isDataConnectivityPossible(){
    return false;
  }
  public void saveClirSetting(int arg1){
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
  public android.net.LinkProperties getLinkProperties(java.lang.String arg1){
    return (android.net.LinkProperties) null;
  }
  public android.telephony.CellLocation getCellLocation(){
    return (android.telephony.CellLocation) null;
  }
  public boolean canDial(){
    return false;
  }
  public com.android.internal.telephony.IccCard getIccCard(){
    return (com.android.internal.telephony.IccCard) null;
  }
  public com.android.internal.telephony.IccFileHandler getIccFileHandler(){
    return (com.android.internal.telephony.IccFileHandler) null;
  }
  public int getPhoneType(){
    return 0;
  }
  protected void startRingbackTone(){
  }
  protected void stopRingbackTone(){
  }
}
