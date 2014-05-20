package com.android.internal.telephony.test;

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


public class ModelInterpreter
  implements SimulatedRadioControl, java.lang.Runnable
{
  // Constructors

  public ModelInterpreter(java.io.InputStream arg1, java.io.OutputStream arg2){
  }
  public ModelInterpreter(java.net.InetSocketAddress arg1) throws java.io.IOException{
  }
  // Methods

  public void run(){
  }
  public void shutdown(){
  }
  public void triggerRing(java.lang.String arg1){
  }
  public void progressConnectingCallState(){
  }
  public void progressConnectingToActive(){
  }
  public void setAutoProgressConnectingCall(boolean arg1){
  }
  public void setNextDialFailImmediately(boolean arg1){
  }
  public void setNextCallFailCause(int arg1){
  }
  public void triggerHangupForeground(){
  }
  public void triggerHangupBackground(){
  }
  public void triggerHangupAll(){
  }
  public void triggerIncomingSMS(java.lang.String arg1){
  }
  public void pauseResponses(){
  }
  public void resumeResponses(){
  }
  public void triggerSsn(int arg1, int arg2){
  }
  public void triggerIncomingUssd(java.lang.String arg1, java.lang.String arg2){
  }
  public void sendUnsolicited(java.lang.String arg1){
  }
}
