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


public class SipAudioCall
{
  // Classes

  public static class Listener
  {
    // Constructors

    public Listener(){
    }
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("callListener")
    public void onError(SipAudioCall arg1, int arg2, java.lang.String arg3){
    }
    @com.francetelecom.rd.stubs.annotation.CallBack("callListener")
    public void onCallEnded(SipAudioCall arg1){
    }
    @com.francetelecom.rd.stubs.annotation.CallBack("callListener")
    public void onCallEstablished(SipAudioCall arg1){
    }
    @com.francetelecom.rd.stubs.annotation.CallBack("callListener")
    public void onCallBusy(SipAudioCall arg1){
    }
    @com.francetelecom.rd.stubs.annotation.CallBack("callListener")
    public void onCalling(SipAudioCall arg1){
    }
    @com.francetelecom.rd.stubs.annotation.CallBack("callListener")
    public void onRinging(SipAudioCall arg1, SipProfile arg2){
    }
    @com.francetelecom.rd.stubs.annotation.CallBack("callListener")
    public void onRingingBack(SipAudioCall arg1){
    }
    @com.francetelecom.rd.stubs.annotation.CallBack("callListener")
    public void onChanged(SipAudioCall arg1){
    }
    @com.francetelecom.rd.stubs.annotation.CallBack("callListener")
    public void onCallHeld(SipAudioCall arg1){
    }
    @com.francetelecom.rd.stubs.annotation.CallBack("callListener")
    public void onReadyToCall(SipAudioCall arg1){
    }
  }
  // Constructors

  public SipAudioCall(android.content.Context arg1, SipProfile arg2){
  }
  // Methods

  public int getState(){
    return 0;
  }
  public void close(){
  }
  public boolean isMuted(){
    return false;
  }
  public void sendDtmf(int arg1){
  }
  public void sendDtmf(int arg1, android.os.Message arg2){
  }
  public void endCall() throws SipException{
  }
  public void setListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("callListener") SipAudioCall.Listener arg1){
  }
  public void setListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("callListener") SipAudioCall.Listener arg1, boolean arg2){
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
  public void answerCall(int arg1) throws SipException{
  }
  public void makeCall(SipProfile arg1, SipSession arg2, int arg3) throws SipException{
  }
  public void startAudio(){
  }
  public boolean isOnHold(){
    return false;
  }
  public void attachCall(SipSession arg1, java.lang.String arg2) throws SipException{
  }
  public android.net.rtp.AudioGroup getAudioGroup(){
    return (android.net.rtp.AudioGroup) null;
  }
  public void holdCall(int arg1) throws SipException{
  }
  public void setAudioGroup(android.net.rtp.AudioGroup arg1){
  }
  public void continueCall(int arg1) throws SipException{
  }
  public void toggleMute(){
  }
  public SipSession getSipSession(){
    return (SipSession) null;
  }
  public void setSpeakerMode(boolean arg1){
  }
  public android.net.rtp.AudioStream getAudioStream(){
    return (android.net.rtp.AudioStream) null;
  }
}
