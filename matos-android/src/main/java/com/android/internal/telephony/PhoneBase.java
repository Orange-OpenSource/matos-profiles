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
public abstract class PhoneBase
  extends android.os.Handler  implements Phone
{
  // Fields

  public static final java.lang.String NETWORK_SELECTION_KEY = "network_selection_key";

  public static final java.lang.String NETWORK_SELECTION_NAME_KEY = "network_selection_name_key";

  public static final java.lang.String DATA_DISABLED_ON_BOOT_KEY = "disabled_on_boot_key";

  protected static final int EVENT_RADIO_AVAILABLE = 0;

  protected static final int EVENT_SSN = 0;

  protected static final int EVENT_SIM_RECORDS_LOADED = 0;

  protected static final int EVENT_MMI_DONE = 0;

  protected static final int EVENT_RADIO_ON = 0;

  protected static final int EVENT_GET_BASEBAND_VERSION_DONE = 0;

  protected static final int EVENT_USSD = 0;

  protected static final int EVENT_RADIO_OFF_OR_NOT_AVAILABLE = 0;

  protected static final int EVENT_GET_IMEI_DONE = 0;

  protected static final int EVENT_GET_IMEISV_DONE = 0;

  protected static final int EVENT_GET_SIM_STATUS_DONE = 0;

  protected static final int EVENT_SET_CALL_FORWARD_DONE = 0;

  protected static final int EVENT_GET_CALL_FORWARD_DONE = 0;

  protected static final int EVENT_CALL_RING = 0;

  protected static final int EVENT_CALL_RING_CONTINUE = 0;

  protected static final int EVENT_SET_NETWORK_MANUAL_COMPLETE = 0;

  protected static final int EVENT_SET_NETWORK_AUTOMATIC_COMPLETE = 0;

  protected static final int EVENT_SET_CLIR_COMPLETE = 0;

  protected static final int EVENT_REGISTERED_TO_NETWORK = 0;

  protected static final int EVENT_SET_VM_NUMBER_DONE = 0;

  protected static final int EVENT_GET_DEVICE_IDENTITY_DONE = 0;

  protected static final int EVENT_RUIM_RECORDS_LOADED = 0;

  protected static final int EVENT_NV_READY = 0;

  protected static final int EVENT_SET_ENHANCED_VP = 0;

  protected static final int EVENT_EMERGENCY_CALLBACK_MODE_ENTER = 0;

  protected static final int EVENT_EXIT_EMERGENCY_CALLBACK_RESPONSE = 0;

  public static final java.lang.String CLIR_KEY = "clir_key";

  public static final java.lang.String DNS_SERVER_CHECK_DISABLED_KEY = "dns_server_check_disabled_key";

  public CommandsInterface mCM;

  protected IccFileHandler mIccFileHandler;

  public DataConnectionTracker mDataConnectionTracker;

  public boolean mIsTheCurrentActivePhone;

  public IccRecords mIccRecords;

  public IccCard mIccCard;

  public SmsStorageMonitor mSmsStorageMonitor;

  public SmsUsageMonitor mSmsUsageMonitor;

  public SMSDispatcher mSMS;

  protected final android.os.RegistrantList mPreciseCallStateRegistrants = (android.os.RegistrantList) null;

  protected final android.os.RegistrantList mNewRingingConnectionRegistrants = (android.os.RegistrantList) null;

  protected final android.os.RegistrantList mIncomingRingRegistrants = (android.os.RegistrantList) null;

  protected final android.os.RegistrantList mDisconnectRegistrants = (android.os.RegistrantList) null;

  protected final android.os.RegistrantList mServiceStateRegistrants = (android.os.RegistrantList) null;

  protected final android.os.RegistrantList mMmiCompleteRegistrants = (android.os.RegistrantList) null;

  protected final android.os.RegistrantList mMmiRegistrants = (android.os.RegistrantList) null;

  protected final android.os.RegistrantList mUnknownConnectionRegistrants = (android.os.RegistrantList) null;

  protected final android.os.RegistrantList mSuppServiceFailedRegistrants = (android.os.RegistrantList) null;

  protected android.os.Looper mLooper;

  protected final android.content.Context mContext = (android.content.Context) null;

  protected PhoneNotifier mNotifier;

  protected com.android.internal.telephony.test.SimulatedRadioControl mSimulatedRadioControl;

  // Constructors

  protected PhoneBase(@com.francetelecom.rd.stubs.annotation.CallBackRegister("phoneNotifier") PhoneNotifier arg1, android.content.Context arg2, CommandsInterface arg3){
    super();
  }
  protected PhoneBase(@com.francetelecom.rd.stubs.annotation.CallBackRegister("phoneNotifier") PhoneNotifier arg1, android.content.Context arg2, CommandsInterface arg3, boolean arg4){
    super();
  }
  // Methods

  public android.content.Context getContext(){
    return (android.content.Context) null;
  }
  public abstract Phone.State getState();
  public android.os.Handler getHandler(){
    return (android.os.Handler) null;
  }
  public void handleMessage(android.os.Message arg1){
  }
  public void dispose(){
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
  public void sendBurstDtmf(java.lang.String arg1, int arg2, int arg3, android.os.Message arg4){
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
  @com.francetelecom.rd.stubs.annotation.FieldGet("mSmscAddress")
  public void getSmscAddress(android.os.Message arg1){
  }
  public void setSmscAddress(@com.francetelecom.rd.stubs.annotation.FieldSet("mSmscAddress") java.lang.String arg1, android.os.Message arg2){
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
  public void registerForInCallVoicePrivacyOn( android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForInCallVoicePrivacyOn(android.os.Handler arg1){
  }
  public void registerForInCallVoicePrivacyOff( android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForInCallVoicePrivacyOff(android.os.Handler arg1){
  }
  public void registerForDisplayInfo( android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForDisplayInfo(android.os.Handler arg1){
  }
  public void registerForSignalInfo( android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForSignalInfo(android.os.Handler arg1){
  }
  public void registerForNumberInfo( android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForNumberInfo(android.os.Handler arg1){
  }
  public void registerForRedirectedNumberInfo( android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForRedirectedNumberInfo(android.os.Handler arg1){
  }
  public void registerForLineControlInfo( android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForLineControlInfo(android.os.Handler arg1){
  }
  public void registerFoT53ClirlInfo( android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForT53ClirInfo(android.os.Handler arg1){
  }
  public void registerForT53AudioControlInfo( android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForT53AudioControlInfo(android.os.Handler arg1){
  }
  public void registerForRingbackTone( android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForRingbackTone(android.os.Handler arg1){
  }
  public void registerForResendIncallMute( android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForResendIncallMute(android.os.Handler arg1){
  }
  public int getLteOnCdmaMode(){
    return 0;
  }
  public abstract java.lang.String getPhoneName();
  public void setEchoSuppressionEnabled(boolean arg1){
  }
  public boolean getMessageWaitingIndicator(){
    return false;
  }
  public boolean getCallForwardingIndicator(){
    return false;
  }
  public Phone.DataState getDataConnectionState(){
    return (Phone.DataState) null;
  }
  public void notifyCallForwardingIndicator(){
  }
  public java.lang.String getIccSerialNumber(){
    return (java.lang.String) null;
  }
  public boolean getIccRecordsLoaded(){
    return false;
  }
  public boolean isDataConnectivityPossible(){
    return false;
  }
  public boolean isDataConnectivityPossible(java.lang.String arg1){
    return false;
  }
  public boolean needsOtaServiceProvisioning(){
    return false;
  }
  public android.net.LinkProperties getLinkProperties(java.lang.String arg1){
    return (android.net.LinkProperties) null;
  }
  public IccCard getIccCard(){
    return (IccCard) null;
  }
  public abstract IccFileHandler getIccFileHandler();
  public abstract int getPhoneType();
  protected void notifyDisconnectP(Connection arg1){
  }
  protected void notifyNewRingingConnectionP(Connection arg1){
  }
  protected void notifyPreciseCallStateChangedP(){
  }
  protected void notifyServiceStateChangedP(android.telephony.ServiceState arg1){
  }
  public void setSystemProperty(java.lang.String arg1, java.lang.String arg2){
  }
  public void removeReferences(){
  }
  public void disableDnsCheck(boolean arg1){
  }
  public boolean isDnsCheckDisabled(){
    return false;
  }
  public void registerForPreciseCallStateChanged( android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForPreciseCallStateChanged(android.os.Handler arg1){
  }
  public void registerForUnknownConnection( android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForUnknownConnection(android.os.Handler arg1){
  }
  public void registerForNewRingingConnection( android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForNewRingingConnection(android.os.Handler arg1){
  }
  public void registerForIncomingRing( android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForIncomingRing(android.os.Handler arg1){
  }
  public void registerForDisconnect( android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForDisconnect(android.os.Handler arg1){
  }
  public void registerForSuppServiceFailed( android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForSuppServiceFailed(android.os.Handler arg1){
  }
  public void registerForMmiInitiate( android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForMmiInitiate(android.os.Handler arg1){
  }
  public void registerForMmiComplete( android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForMmiComplete(android.os.Handler arg1){
  }
  public void restoreSavedNetworkSelection(android.os.Message arg1){
  }
  public void setUnitTestMode(boolean arg1){
  }
  public boolean getUnitTestMode(){
    return false;
  }
  public void registerForServiceStateChanged( android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForServiceStateChanged(android.os.Handler arg1){
  }
  public com.android.internal.telephony.test.SimulatedRadioControl getSimulatedRadioControl(){
    return (com.android.internal.telephony.test.SimulatedRadioControl) null;
  }
  public void setSystemLocale(java.lang.String arg1, java.lang.String arg2, boolean arg3){
  }
  public ServiceStateTracker getServiceStateTracker(){
    return (ServiceStateTracker) null;
  }
  public CallTracker getCallTracker(){
    return (CallTracker) null;
  }
  public void setCdmaSubscription(int arg1, android.os.Message arg2){
  }
  public void enableEnhancedVoicePrivacy(boolean arg1, android.os.Message arg2){
  }
  public void getEnhancedVoicePrivacy(android.os.Message arg1){
  }
  public void notifyDataActivity(){
  }
  public void notifyMessageWaitingIndicator(){
  }
  public void notifyDataConnection(java.lang.String arg1, java.lang.String arg2, Phone.DataState arg3){
  }
  public void notifyDataConnection(java.lang.String arg1, java.lang.String arg2){
  }
  public void notifyDataConnection(java.lang.String arg1){
  }
  public void notifyOtaspChanged(int arg1){
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
  public void notifyDataConnectionFailed(java.lang.String arg1, java.lang.String arg2){
  }
}
