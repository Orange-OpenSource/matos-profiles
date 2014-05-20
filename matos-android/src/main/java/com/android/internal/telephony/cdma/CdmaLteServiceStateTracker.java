package com.android.internal.telephony.cdma;

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
public class CdmaLteServiceStateTracker
  extends CdmaServiceStateTracker{
  // Constructors
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public CdmaLteServiceStateTracker(CDMALTEPhone arg1){
    super((CDMAPhone) null);
  }
  // Methods

  protected void log(java.lang.String arg1){
  }
  protected void loge(java.lang.String arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void handleMessage(android.os.Message arg1){
  }
  public void dispose(){
  }
  protected void setCdmaTechnology(int arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void handlePollStateResultMessage(int arg1, android.os.AsyncResult arg2){
  }
  protected void setSignalStrengthDefaultValues(){
  }
  protected void pollState(){
  }
  protected void pollStateDone(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onSignalStrengthResult(android.os.AsyncResult arg1){
  }
  public boolean isConcurrentVoiceAndDataAllowed(){
    return false;
  }
}
