package com.android.internal.telephony.gsm;

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
public class GSMPhone
  extends com.android.internal.telephony.PhoneBase{
  // Fields

  public static final java.lang.String CIPHERING_KEY = "ciphering_key";

  public static final java.lang.String VM_NUMBER = "vm_number_key";

  public static final java.lang.String VM_SIM_IMSI = "vm_sim_imsi_key";

  // Constructors

  public GSMPhone(android.content.Context arg1, com.android.internal.telephony.CommandsInterface arg2, @com.francetelecom.rd.stubs.annotation.CallBackRegister("phoneNotifier") com.android.internal.telephony.PhoneNotifier arg3){
    super((com.android.internal.telephony.PhoneNotifier) null, (android.content.Context) null, (com.android.internal.telephony.CommandsInterface) null);
  }
  public GSMPhone(android.content.Context arg1, com.android.internal.telephony.CommandsInterface arg2, @com.francetelecom.rd.stubs.annotation.CallBackRegister("phoneNotifier") com.android.internal.telephony.PhoneNotifier arg3, boolean arg4){
    super((com.android.internal.telephony.PhoneNotifier) null, (android.content.Context) null, (com.android.internal.telephony.CommandsInterface) null);
  }
  // Methods

  protected void finalize(){
  }
  public com.android.internal.telephony.Phone.State getState(){
    return (com.android.internal.telephony.Phone.State) null;
  }
  public void handleMessage(android.os.Message arg1){
  }
  public void dispose(){
  }
  public void setMute(boolean arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("voiceMailNumber")
  public java.lang.String getVoiceMailNumber(){
    return (java.lang.String) null;
  }
  public void setVoiceMailNumber(java.lang.String arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("voiceMailNumber") java.lang.String arg2, android.os.Message arg3){
  }
  public java.lang.String getVoiceMailAlphaTag(){
    return (java.lang.String) null;
  }
  public boolean isCspPlmnEnabled(){
    return false;
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
  public void explicitCallTransfer() throws com.android.internal.telephony.CallStateException{
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
  public void sendBurstDtmf(java.lang.String arg1){
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
  public GsmCall getForegroundCall(){
    return (GsmCall) null;
  }
  public GsmCall getBackgroundCall(){
    return (GsmCall) null;
  }
  public GsmCall getRingingCall(){
    return (GsmCall) null;
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
  public android.telephony.CellLocation getCellLocation(){
    return (android.telephony.CellLocation) null;
  }
  public boolean canDial(){
    return false;
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
  public java.lang.String getMsisdn(){
    return (java.lang.String) null;
  }
  protected boolean isCfEnable(int arg1){
    return false;
  }
  protected void syncClirSetting(){
  }
}
