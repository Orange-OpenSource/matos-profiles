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
public final class RuimRecords
  extends com.android.internal.telephony.IccRecords{
  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  RuimRecords(CDMAPhone arg1){
    super((com.android.internal.telephony.PhoneBase) null);
  }
  // Methods

  protected void finalize(){
  }
  protected void log(java.lang.String arg1){
  }
  protected void loge(java.lang.String arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void handleMessage(android.os.Message arg1){
  }
  public void dispose(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onRadioOffOrNotAvailable(){
  }
  public void setVoiceMailNumber(java.lang.String arg1, java.lang.String arg2, android.os.Message arg3){
  }
  public void setVoiceMessageWaiting(int arg1, int arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onRefresh(boolean arg1, int [] arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onRecordLoaded(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onAllRecordsLoaded(){
  }
  public int getDisplayRule(java.lang.String arg1){
    return 0;
  }
  public java.lang.String getCdmaMin(){
    return (java.lang.String) null;
  }
  public java.lang.String getPrlVersion(){
    return (java.lang.String) null;
  }
  public java.lang.String getMdnNumber(){
    return (java.lang.String) null;
  }
  public java.lang.String getRUIMOperatorNumeric(){
    return (java.lang.String) null;
  }
}
