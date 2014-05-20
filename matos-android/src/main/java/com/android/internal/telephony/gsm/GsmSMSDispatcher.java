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
public final class GsmSMSDispatcher
  extends com.android.internal.telephony.SMSDispatcher{
  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public GsmSMSDispatcher(com.android.internal.telephony.PhoneBase arg1, com.android.internal.telephony.SmsStorageMonitor arg2, com.android.internal.telephony.SmsUsageMonitor arg3){
    super((com.android.internal.telephony.PhoneBase) null, (com.android.internal.telephony.SmsStorageMonitor) null, (com.android.internal.telephony.SmsUsageMonitor) null);
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void handleMessage(android.os.Message arg1){
  }
  public void dispose(){
  }
  public int dispatchMessage(com.android.internal.telephony.SmsMessageBase arg1){
    return 0;
  }
  protected java.lang.String getFormat(){
    return (java.lang.String) null;
  }
  protected com.android.internal.telephony.SmsMessageBase.TextEncodingDetails calculateLength(java.lang.CharSequence arg1, boolean arg2){
    return (com.android.internal.telephony.SmsMessageBase.TextEncodingDetails) null;
  }
  protected void sendData(java.lang.String arg1, java.lang.String arg2, int arg3, byte [] arg4, android.app.PendingIntent arg5, android.app.PendingIntent arg6){
  }
  protected void sendText(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, android.app.PendingIntent arg4, android.app.PendingIntent arg5){
  }
  protected void sendNewSubmitPdu(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, com.android.internal.telephony.SmsHeader arg4, int arg5, android.app.PendingIntent arg6, android.app.PendingIntent arg7, boolean arg8){
  }
  protected void sendSms(com.android.internal.telephony.SMSDispatcher.SmsTracker arg1){
  }
  protected void acknowledgeLastIncomingSms(boolean arg1, int arg2, android.os.Message arg3){
  }
}
