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
public abstract class BaseCommands
  implements CommandsInterface
{
  // Fields

  protected android.content.Context mContext;

  protected CommandsInterface.RadioState mState;

  protected CommandsInterface.RadioState mSimState;

  protected CommandsInterface.RadioState mRuimState;

  protected CommandsInterface.RadioState mNvState;

  protected java.lang.Object mStateMonitor;

  protected android.os.RegistrantList mRadioStateChangedRegistrants;

  protected android.os.RegistrantList mOnRegistrants;

  protected android.os.RegistrantList mAvailRegistrants;

  protected android.os.RegistrantList mOffOrNotAvailRegistrants;

  protected android.os.RegistrantList mNotAvailRegistrants;

  protected android.os.RegistrantList mSIMReadyRegistrants;

  protected android.os.RegistrantList mSIMLockedRegistrants;

  protected android.os.RegistrantList mRUIMReadyRegistrants;

  protected android.os.RegistrantList mRUIMLockedRegistrants;

  protected android.os.RegistrantList mNVReadyRegistrants;

  protected android.os.RegistrantList mCallStateRegistrants;

  protected android.os.RegistrantList mVoiceNetworkStateRegistrants;

  protected android.os.RegistrantList mDataNetworkStateRegistrants;

  protected android.os.RegistrantList mRadioTechnologyChangedRegistrants;

  protected android.os.RegistrantList mIccStatusChangedRegistrants;

  protected android.os.RegistrantList mVoicePrivacyOnRegistrants;

  protected android.os.RegistrantList mVoicePrivacyOffRegistrants;

  protected android.os.Registrant mUnsolOemHookRawRegistrant;

  protected android.os.RegistrantList mOtaProvisionRegistrants;

  protected android.os.RegistrantList mCallWaitingInfoRegistrants;

  protected android.os.RegistrantList mDisplayInfoRegistrants;

  protected android.os.RegistrantList mSignalInfoRegistrants;

  protected android.os.RegistrantList mNumberInfoRegistrants;

  protected android.os.RegistrantList mRedirNumInfoRegistrants;

  protected android.os.RegistrantList mLineControlInfoRegistrants;

  protected android.os.RegistrantList mT53ClirInfoRegistrants;

  protected android.os.RegistrantList mT53AudCntrlInfoRegistrants;

  protected android.os.RegistrantList mRingbackToneRegistrants;

  protected android.os.RegistrantList mResendIncallMuteRegistrants;

  protected android.os.RegistrantList mCdmaSubscriptionChangedRegistrants;

  protected android.os.RegistrantList mCdmaPrlChangedRegistrants;

  protected android.os.RegistrantList mExitEmergencyCallbackModeRegistrants;

  protected android.os.RegistrantList mRilConnectedRegistrants;

  protected android.os.RegistrantList mIccRefreshRegistrants;

  protected android.os.Registrant mGsmSmsRegistrant;

  protected android.os.Registrant mCdmaSmsRegistrant;

  protected android.os.Registrant mNITZTimeRegistrant;

  protected android.os.Registrant mSignalStrengthRegistrant;

  protected android.os.Registrant mUSSDRegistrant;

  protected android.os.Registrant mSmsOnSimRegistrant;

  protected android.os.Registrant mSmsStatusRegistrant;

  protected android.os.Registrant mSsnRegistrant;

  protected android.os.Registrant mCatSessionEndRegistrant;

  protected android.os.Registrant mCatProCmdRegistrant;

  protected android.os.Registrant mCatEventRegistrant;

  protected android.os.Registrant mCatCallSetUpRegistrant;

  protected android.os.Registrant mIccSmsFullRegistrant;

  protected android.os.Registrant mEmergencyCallbackModeRegistrant;

  protected android.os.Registrant mRingRegistrant;

  protected android.os.Registrant mRestrictedStateRegistrant;

  protected android.os.Registrant mGsmBroadcastSmsRegistrant;

  protected int mPreferredNetworkType;

  protected int mCdmaSubscription;

  protected int mPhoneType;

  protected int mRilVersion;

  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public BaseCommands(android.content.Context arg1){
  }
  // Methods

  public void setOnNITZTime(android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onRadioAvailable(){
  }
  public CommandsInterface.RadioState getRadioState(){
    return (CommandsInterface.RadioState) null;
  }
  public CommandsInterface.RadioState getSimState(){
    return (CommandsInterface.RadioState) null;
  }
  public CommandsInterface.RadioState getRuimState(){
    return (CommandsInterface.RadioState) null;
  }
  public CommandsInterface.RadioState getNvState(){
    return (CommandsInterface.RadioState) null;
  }
  public void registerForRadioStateChanged(android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForRadioStateChanged(android.os.Handler arg1){
  }
  public void registerForOn(android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForOn(android.os.Handler arg1){
  }
  public void registerForAvailable(android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForAvailable(android.os.Handler arg1){
  }
  public void registerForNotAvailable(android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForNotAvailable(android.os.Handler arg1){
  }
  public void registerForOffOrNotAvailable(android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForOffOrNotAvailable(android.os.Handler arg1){
  }
  public void registerForSIMReady(android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForSIMReady(android.os.Handler arg1){
  }
  public void registerForSIMLockedOrAbsent(android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForSIMLockedOrAbsent(android.os.Handler arg1){
  }
  public void registerForIccStatusChanged(android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForIccStatusChanged(android.os.Handler arg1){
  }
  public void registerForCallStateChanged(android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForCallStateChanged(android.os.Handler arg1){
  }
  public void registerForVoiceNetworkStateChanged(android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForVoiceNetworkStateChanged(android.os.Handler arg1){
  }
  public void registerForDataNetworkStateChanged(android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForDataNetworkStateChanged(android.os.Handler arg1){
  }
  public void registerForRadioTechnologyChanged(android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForRadioTechnologyChanged(android.os.Handler arg1){
  }
  public void registerForNVReady(android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForNVReady(android.os.Handler arg1){
  }
  public void registerForRUIMLockedOrAbsent(android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForRUIMLockedOrAbsent(android.os.Handler arg1){
  }
  public void registerForInCallVoicePrivacyOn(android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForInCallVoicePrivacyOn(android.os.Handler arg1){
  }
  public void registerForInCallVoicePrivacyOff(android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForInCallVoicePrivacyOff(android.os.Handler arg1){
  }
  public void registerForRUIMReady(android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForRUIMReady(android.os.Handler arg1){
  }
  public void setOnNewGsmSms(android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unSetOnNewGsmSms(android.os.Handler arg1){
  }
  public void setOnNewCdmaSms(android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unSetOnNewCdmaSms(android.os.Handler arg1){
  }
  public void setOnNewGsmBroadcastSms(android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unSetOnNewGsmBroadcastSms(android.os.Handler arg1){
  }
  public void setOnSmsOnSim(android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unSetOnSmsOnSim(android.os.Handler arg1){
  }
  public void setOnSmsStatus(android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unSetOnSmsStatus(android.os.Handler arg1){
  }
  public void unSetOnNITZTime(android.os.Handler arg1){
  }
  public void setOnUSSD(android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unSetOnUSSD(android.os.Handler arg1){
  }
  public void setOnSignalStrengthUpdate(android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unSetOnSignalStrengthUpdate(android.os.Handler arg1){
  }
  public void setOnIccSmsFull(android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unSetOnIccSmsFull(android.os.Handler arg1){
  }
  public void registerForIccRefresh(android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForIccRefresh(android.os.Handler arg1){
  }
  public void setOnIccRefresh(android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unsetOnIccRefresh(android.os.Handler arg1){
  }
  public void setOnCallRing(android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unSetOnCallRing(android.os.Handler arg1){
  }
  public void setOnRestrictedStateChanged(android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unSetOnRestrictedStateChanged(android.os.Handler arg1){
  }
  public void setOnSuppServiceNotification(android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unSetOnSuppServiceNotification(android.os.Handler arg1){
  }
  public void setOnCatSessionEnd(android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unSetOnCatSessionEnd(android.os.Handler arg1){
  }
  public void setOnCatProactiveCmd(android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unSetOnCatProactiveCmd(android.os.Handler arg1){
  }
  public void setOnCatEvent(android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unSetOnCatEvent(android.os.Handler arg1){
  }
  public void setOnCatCallSetUp(android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unSetOnCatCallSetUp(android.os.Handler arg1){
  }
  public void registerForDisplayInfo(android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForDisplayInfo(android.os.Handler arg1){
  }
  public void registerForCallWaitingInfo(android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForCallWaitingInfo(android.os.Handler arg1){
  }
  public void registerForSignalInfo(android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForSignalInfo(android.os.Handler arg1){
  }
  public void registerForNumberInfo(android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForNumberInfo(android.os.Handler arg1){
  }
  public void registerForRedirectedNumberInfo(android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForRedirectedNumberInfo(android.os.Handler arg1){
  }
  public void registerForLineControlInfo(android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForLineControlInfo(android.os.Handler arg1){
  }
  public void registerFoT53ClirlInfo(android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForT53ClirInfo(android.os.Handler arg1){
  }
  public void registerForT53AudioControlInfo(android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForT53AudioControlInfo(android.os.Handler arg1){
  }
  public void setEmergencyCallbackMode(android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void registerForCdmaOtaProvision(android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForCdmaOtaProvision(android.os.Handler arg1){
  }
  public void registerForRingbackTone(android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForRingbackTone(android.os.Handler arg1){
  }
  public void registerForResendIncallMute(android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForResendIncallMute(android.os.Handler arg1){
  }
  public void registerForCdmaSubscriptionChanged(android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForCdmaSubscriptionChanged(android.os.Handler arg1){
  }
  public void registerForCdmaPrlChanged(android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForCdmaPrlChanged(android.os.Handler arg1){
  }
  public void registerForExitEmergencyCallbackMode(android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForExitEmergencyCallbackMode(android.os.Handler arg1){
  }
  public void registerForRilConnected(android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForRilConnected(android.os.Handler arg1){
  }
  public int getLteOnCdmaMode(){
    return 0;
  }
  protected void setRadioState(CommandsInterface.RadioState arg1){
  }
  public void setOnUnsolOemHookRaw(android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unSetOnUnsolOemHookRaw(android.os.Handler arg1){
  }
  public static int getLteOnCdmaModeStatic(){
    return 0;
  }
}
