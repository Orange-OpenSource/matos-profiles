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
public class CDMALTEPhone
  extends CDMAPhone{
  // Constructors
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public CDMALTEPhone(android.content.Context arg1, com.android.internal.telephony.CommandsInterface arg2, com.android.internal.telephony.PhoneNotifier arg3){
    super((android.content.Context) null, (com.android.internal.telephony.CommandsInterface) null, (com.android.internal.telephony.PhoneNotifier) null);
  }
  // Methods

  protected void log(java.lang.String arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void handleMessage(android.os.Message arg1){
  }
  public void dispose(){
  }
  public com.android.internal.telephony.ims.IsimRecords getIsimRecords(){
    return (com.android.internal.telephony.ims.IsimRecords) null;
  }
  public void getAvailableNetworks(android.os.Message arg1){
  }
  public void requestIsimAuthentication(java.lang.String arg1, android.os.Message arg2){
  }
  public com.android.internal.telephony.Phone.DataState getDataConnectionState(java.lang.String arg1){
    return (com.android.internal.telephony.Phone.DataState) null;
  }
  public java.lang.String getDeviceSvn(){
    return (java.lang.String) null;
  }
  public java.lang.String getImei(){
    return (java.lang.String) null;
  }
  public java.lang.String getSubscriberId(){
    return (java.lang.String) null;
  }
  public void selectNetworkManually(com.android.internal.telephony.OperatorInfo arg1, android.os.Message arg2){
  }
  public void removeReferences(){
  }
  public void setSystemLocale(java.lang.String arg1, java.lang.String arg2, boolean arg3){
  }
  public java.lang.String getMsisdn(){
    return (java.lang.String) null;
  }
  public boolean updateCurrentCarrierInProvider(){
    return false;
  }
  protected void initSstIcc(){
  }
}
