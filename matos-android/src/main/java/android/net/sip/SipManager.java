package android.net.sip;

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


public class SipManager
{
  // Fields

  public static final int INCOMING_CALL_RESULT_CODE = 101;

  public static final java.lang.String EXTRA_CALL_ID = "android:sipCallID";

  public static final java.lang.String EXTRA_OFFER_SD = "android:sipOfferSD";

  public static final java.lang.String ACTION_SIP_SERVICE_UP = "android.net.sip.SIP_SERVICE_UP";

  public static final java.lang.String ACTION_SIP_INCOMING_CALL = "com.android.phone.SIP_INCOMING_CALL";

  public static final java.lang.String ACTION_SIP_ADD_PHONE = "com.android.phone.SIP_ADD_PHONE";

  public static final java.lang.String ACTION_SIP_REMOVE_PHONE = "com.android.phone.SIP_REMOVE_PHONE";

  public static final java.lang.String EXTRA_LOCAL_URI = "android:localSipUri";

  // Constructors

  private SipManager(android.content.Context arg1){
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "SipManager.register", pos = 1, report = "-")
  public void register(SipProfile arg1, int arg2, @com.francetelecom.rd.stubs.annotation.CallBackRegister("SipRegistrationListener") SipRegistrationListener arg3) throws SipException{
  }
  public static SipManager newInstance(android.content.Context arg1){
    return (SipManager) null;
  }
  public void close(java.lang.String arg1) throws SipException{
  }
  public boolean isRegistered(java.lang.String arg1) throws SipException{
    return false;
  }
  public void open(SipProfile arg1) throws SipException{
  }
  public void open(SipProfile arg1, android.app.PendingIntent arg2, @com.francetelecom.rd.stubs.annotation.CallBackRegister("SipRegistrationListener") SipRegistrationListener arg3) throws SipException{
  }
  public void unregister(SipProfile arg1, SipRegistrationListener arg2) throws SipException{
  }
  public boolean isOpened(java.lang.String arg1) throws SipException{
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "SipManager.setRegistrationListener", pos = 1, report = "-")
  public void setRegistrationListener(java.lang.String arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("SipRegistrationListener") SipRegistrationListener arg2) throws SipException{
  }
  public SipProfile [] getListOfProfiles(){
    return (SipProfile []) null;
  }
  public static java.lang.String getCallId(android.content.Intent arg1){
    return (java.lang.String) null;
  }
  public static android.content.Intent createIncomingCallBroadcast(java.lang.String arg1, java.lang.String arg2){
    return (android.content.Intent) null;
  }
  public static boolean isApiSupported(android.content.Context arg1){
    return false;
  }
  public static boolean isSipWifiOnly(android.content.Context arg1){
    return false;
  }
  public static boolean isVoipSupported(android.content.Context arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "SipManager.makeAudioCall-1", pos = {1, 2}, report = "-")
  public SipAudioCall makeAudioCall(SipProfile arg1, SipProfile arg2, @com.francetelecom.rd.stubs.annotation.CallBackRegister("callListener") SipAudioCall.Listener arg3, int arg4) throws SipException{
    return (SipAudioCall) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "SipManager.makeAudioCall-2", pos = {1, 2}, report = "-")
  public SipAudioCall makeAudioCall(java.lang.String arg1, java.lang.String arg2, @com.francetelecom.rd.stubs.annotation.CallBackRegister("callListener") SipAudioCall.Listener arg3, int arg4) throws SipException{
    return (SipAudioCall) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "SipManager.takeAudioCall-1", pos = 1, report = "-")
  public SipAudioCall takeAudioCall(android.content.Intent arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("callListener") SipAudioCall.Listener arg2) throws SipException{
    return (SipAudioCall) null;
  }
  public static boolean isIncomingCallIntent(android.content.Intent arg1){
    return false;
  }
  public static java.lang.String getOfferSessionDescription(android.content.Intent arg1){
    return (java.lang.String) null;
  }
  public SipSession getSessionFor(android.content.Intent arg1) throws SipException{
    return (SipSession) null;
  }
  public SipSession createSipSession(SipProfile arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("SipSessionListener") SipSession.Listener arg2) throws SipException{
    return (SipSession) null;
  }
}
