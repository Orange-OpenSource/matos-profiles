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
public final class GsmCallTracker
  extends com.android.internal.telephony.CallTracker{
  // Constructors
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  GsmCallTracker(GSMPhone arg1){
    super();
  }
  // Methods

  protected void finalize(){
  }
  protected void log(java.lang.String arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void handleMessage(android.os.Message arg1){
  }
  public void dispose(){
  }
  public void registerForVoiceCallStarted( android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForVoiceCallStarted(android.os.Handler arg1){
  }
  public void registerForVoiceCallEnded( android.os.Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void unregisterForVoiceCallEnded(android.os.Handler arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void handlePollCalls(android.os.AsyncResult arg1){
  }
}
