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


public final class SipSession
{
  // Classes

  public static class State
  {
    // Fields

    public static final int READY_TO_CALL = 0;

    public static final int REGISTERING = 1;

    public static final int DEREGISTERING = 2;

    public static final int INCOMING_CALL = 3;

    public static final int INCOMING_CALL_ANSWERING = 4;

    public static final int OUTGOING_CALL = 5;

    public static final int OUTGOING_CALL_RING_BACK = 6;

    public static final int OUTGOING_CALL_CANCELING = 7;

    public static final int IN_CALL = 8;

    public static final int PINGING = 9;

    public static final int ENDING_CALL = 10;

    public static final int NOT_DEFINED = 101;

    // Constructors

    private State(){
    }
    // Methods

    public static java.lang.String toString(int arg1){
      return (java.lang.String) null;
    }
  }
  public static class Listener
  {
    // Constructors

    public Listener(){
    }
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("SipSessionListener")
    public void onError(SipSession arg1, int arg2, java.lang.String arg3){
    }
    @com.francetelecom.rd.stubs.annotation.CallBack("SipSessionListener")
    public void onCallEnded(SipSession arg1){
    }
    @com.francetelecom.rd.stubs.annotation.CallBack("SipSessionListener")
    public void onCallEstablished(SipSession arg1, java.lang.String arg2){
    }
    @com.francetelecom.rd.stubs.annotation.CallBack("SipSessionListener")
    public void onCallBusy(SipSession arg1){
    }
    @com.francetelecom.rd.stubs.annotation.CallBack("SipSessionListener")
    public void onCalling(SipSession arg1){
    }
    @com.francetelecom.rd.stubs.annotation.CallBack("SipSessionListener")
    public void onRinging(SipSession arg1, SipProfile arg2, java.lang.String arg3){
    }
    @com.francetelecom.rd.stubs.annotation.CallBack("SipSessionListener")
    public void onRingingBack(SipSession arg1){
    }
    @com.francetelecom.rd.stubs.annotation.CallBack("SipSessionListener")
    public void onCallTransferring(SipSession arg1, java.lang.String arg2){
    }
    @com.francetelecom.rd.stubs.annotation.CallBack("SipSessionListener")
    public void onCallChangeFailed(SipSession arg1, int arg2, java.lang.String arg3){
    }
    @com.francetelecom.rd.stubs.annotation.CallBack("SipSessionListener")
    public void onRegistering(SipSession arg1){
    }
    @com.francetelecom.rd.stubs.annotation.CallBack("SipSessionListener")
    public void onRegistrationDone(SipSession arg1, int arg2){
    }
    @com.francetelecom.rd.stubs.annotation.CallBack("SipSessionListener")
    public void onRegistrationFailed(SipSession arg1, int arg2, java.lang.String arg3){
    }
    @com.francetelecom.rd.stubs.annotation.CallBack("SipSessionListener")
    public void onRegistrationTimeout(SipSession arg1){
    }
  }
  // Constructors

  SipSession(ISipSession arg1){
  }
  SipSession(ISipSession arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("SipSessionListener") SipSession.Listener arg2){
  }
  // Methods

  public void register(int arg1){
  }
  public int getState(){
    return 0;
  }
  public void unregister(){
  }
  public java.lang.String getCallId(){
    return (java.lang.String) null;
  }
  public void endCall(){
  }
  public void setListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("SipSessionListener") SipSession.Listener arg1){
  }
  public boolean isInCall(){
    return false;
  }
  public SipProfile getPeerProfile(){
    return (SipProfile) null;
  }
  public SipProfile getLocalProfile(){
    return (SipProfile) null;
  }
  public void answerCall(java.lang.String arg1, int arg2){
  }
  public void makeCall(SipProfile arg1, java.lang.String arg2, int arg3){
  }
  public java.lang.String getLocalIp(){
    return (java.lang.String) null;
  }
  public void changeCall(java.lang.String arg1, int arg2){
  }
}
