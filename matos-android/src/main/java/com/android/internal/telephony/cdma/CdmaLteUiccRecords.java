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
public final class CdmaLteUiccRecords
  extends com.android.internal.telephony.gsm.SIMRecords{
  // Constructors
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public CdmaLteUiccRecords(com.android.internal.telephony.PhoneBase arg1){
    super((com.android.internal.telephony.PhoneBase) null);
  }
  // Methods

  protected void log(java.lang.String arg1){
  }
  protected void loge(java.lang.String arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onRecordLoaded(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onAllRecordsLoaded(){
  }
  public boolean isProvisioned(){
    return false;
  }
  public com.android.internal.telephony.ims.IsimRecords getIsimRecords(){
    return (com.android.internal.telephony.ims.IsimRecords) null;
  }
  public java.lang.String getPrlVersion(){
    return (java.lang.String) null;
  }
  public java.lang.String getMdn(){
    return (java.lang.String) null;
  }
  public java.lang.String getMin(){
    return (java.lang.String) null;
  }
  public java.lang.String getSid(){
    return (java.lang.String) null;
  }
  public java.lang.String getNid(){
    return (java.lang.String) null;
  }
  public boolean getCsimSpnDisplayCondition(){
    return false;
  }
  protected void fetchSimRecords(){
  }
  protected int dispatchGsmMessage(com.android.internal.telephony.SmsMessageBase arg1){
    return 0;
  }
}
