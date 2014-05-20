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
public final class CallManager
{
  // Fields

  protected final android.os.RegistrantList mPreciseCallStateRegistrants = (android.os.RegistrantList) null;

  protected final android.os.RegistrantList mNewRingingConnectionRegistrants = (android.os.RegistrantList) null;

  protected final android.os.RegistrantList mIncomingRingRegistrants = (android.os.RegistrantList) null;

  protected final android.os.RegistrantList mDisconnectRegistrants = (android.os.RegistrantList) null;

  protected final android.os.RegistrantList mMmiRegistrants = (android.os.RegistrantList) null;

  protected final android.os.RegistrantList mUnknownConnectionRegistrants = (android.os.RegistrantList) null;

  protected final android.os.RegistrantList mRingbackToneRegistrants = (android.os.RegistrantList) null;

  protected final android.os.RegistrantList mInCallVoicePrivacyOnRegistrants = (android.os.RegistrantList) null;

  protected final android.os.RegistrantList mInCallVoicePrivacyOffRegistrants = (android.os.RegistrantList) null;

  protected final android.os.RegistrantList mCallWaitingRegistrants = (android.os.RegistrantList) null;

  protected final android.os.RegistrantList mDisplayInfoRegistrants = (android.os.RegistrantList) null;

  protected final android.os.RegistrantList mSignalInfoRegistrants = (android.os.RegistrantList) null;

  protected final android.os.RegistrantList mCdmaOtaStatusChangeRegistrants = (android.os.RegistrantList) null;

  protected final android.os.RegistrantList mResendIncallMuteRegistrants = (android.os.RegistrantList) null;

  protected final android.os.RegistrantList mMmiInitiateRegistrants = (android.os.RegistrantList) null;

  protected final android.os.RegistrantList mMmiCompleteRegistrants = (android.os.RegistrantList) null;

  protected final android.os.RegistrantList mEcmTimerResetRegistrants = (android.os.RegistrantList) null;

  protected final android.os.RegistrantList mSubscriptionInfoReadyRegistrants = (android.os.RegistrantList) null;

  protected final android.os.RegistrantList mSuppServiceFailedRegistrants = (android.os.RegistrantList) null;

  protected final android.os.RegistrantList mServiceStateChangedRegistrants = (android.os.RegistrantList) null;

  protected final android.os.RegistrantList mPostDialCharacterRegistrants = (android.os.RegistrantList) null;

  // Constructors

  private CallManager(){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public static CallManager getInstance(){
    return (CallManager) null;
  }
  public Phone.State getState(){
    return (Phone.State) null;
  }
  public void setMute(boolean arg1){
  }
  public Connection dial(Phone arg1, java.lang.String arg2) throws CallStateException{
    return (Connection) null;
  }
  public Connection dial(Phone arg1, java.lang.String arg2, UUSInfo arg3) throws CallStateException{
    return (Connection) null;
  }
  public void hangupForegroundResumeBackground(Call arg1) throws CallStateException{
  }
  public void conference(Call arg1) throws CallStateException{
  }
  public void acceptCall(Call arg1) throws CallStateException{
  }
  public void rejectCall(Call arg1) throws CallStateException{
  }
  public void explicitCallTransfer(Call arg1) throws CallStateException{
  }
  public boolean getMute(){
    return false;
  }
  public boolean sendDtmf(char arg1){
    return false;
  }
  public boolean startDtmf(char arg1){
    return false;
  }
  public void stopDtmf(){
  }
  public boolean sendBurstDtmf(java.lang.String arg1, int arg2, int arg3, android.os.Message arg4){
    return false;
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
  public void registerForRingbackTone( android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForRingbackTone(android.os.Handler arg1){
  }
  public void registerForResendIncallMute( android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForResendIncallMute(android.os.Handler arg1){
  }
  public void clearDisconnected(){
  }
  public void switchHoldingAndActive(Call arg1) throws CallStateException{
  }
  public int getServiceState(){
    return 0;
  }
  public boolean canConference(Call arg1){
    return false;
  }
  public boolean canTransfer(Call arg1){
    return false;
  }
  public void setEchoSuppressionEnabled(boolean arg1){
  }
  public java.util.List<? extends MmiCode> getPendingMmiCodes(Phone arg1){
    return (java.util.List) null;
  }
  public boolean sendUssdResponse(Phone arg1, java.lang.String arg2){
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
  public void registerForServiceStateChanged( android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForServiceStateChanged(android.os.Handler arg1){
  }
  public void registerForCdmaOtaStatusChange( android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForCdmaOtaStatusChange(android.os.Handler arg1){
  }
  public void registerForSubscriptionInfoReady( android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForSubscriptionInfoReady(android.os.Handler arg1){
  }
  public void registerForCallWaiting( android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForCallWaiting(android.os.Handler arg1){
  }
  public void registerForEcmTimerReset( android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForEcmTimerReset(android.os.Handler arg1){
  }
  public Phone getDefaultPhone(){
    return (Phone) null;
  }
  public Call.State getActiveFgCallState(){
    return (Call.State) null;
  }
  public boolean hasActiveFgCall(){
    return false;
  }
  public static boolean isSamePhone(Phone arg1, Phone arg2){
    return false;
  }
  public java.util.List<Phone> getAllPhones(){
    return (java.util.List) null;
  }
  public boolean registerPhone(Phone arg1){
    return false;
  }
  public void unregisterPhone(Phone arg1){
  }
  public Phone getFgPhone(){
    return (Phone) null;
  }
  public Phone getBgPhone(){
    return (Phone) null;
  }
  public Phone getRingingPhone(){
    return (Phone) null;
  }
  public void setAudioMode(){
  }
  public void registerForPostDialCharacter( android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForPostDialCharacter(android.os.Handler arg1){
  }
  public java.util.List<Call> getRingingCalls(){
    return (java.util.List) null;
  }
  public java.util.List<Call> getForegroundCalls(){
    return (java.util.List) null;
  }
  public java.util.List<Call> getBackgroundCalls(){
    return (java.util.List) null;
  }
  public boolean hasActiveBgCall(){
    return false;
  }
  public boolean hasActiveRingingCall(){
    return false;
  }
  public Call getActiveFgCall(){
    return (Call) null;
  }
  public Call getFirstActiveBgCall(){
    return (Call) null;
  }
  public Call getFirstActiveRingingCall(){
    return (Call) null;
  }
  public java.util.List<Connection> getFgCallConnections(){
    return (java.util.List) null;
  }
  public java.util.List<Connection> getBgCallConnections(){
    return (java.util.List) null;
  }
  public Connection getFgCallLatestConnection(){
    return (Connection) null;
  }
  public boolean hasDisconnectedFgCall(){
    return false;
  }
  public boolean hasDisconnectedBgCall(){
    return false;
  }
}
