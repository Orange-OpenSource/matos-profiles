package com.android.internal.telephony;

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
public abstract class IccSmsInterfaceManager
  extends ISms.Stub{
  // Fields

  protected PhoneBase mPhone;

  protected android.content.Context mContext;

  protected SMSDispatcher mDispatcher;

  // Constructors

  protected IccSmsInterfaceManager(PhoneBase arg1){
    super();
  }
  // Methods

  protected abstract void log(java.lang.String arg1);
  public void sendData(java.lang.String arg1, java.lang.String arg2, int arg3, byte [] arg4, android.app.PendingIntent arg5, android.app.PendingIntent arg6){
  }
  public void sendText(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, android.app.PendingIntent arg4, android.app.PendingIntent arg5){
  }
  public void sendMultipartText(java.lang.String arg1, java.lang.String arg2, java.util.List<java.lang.String> arg3, java.util.List<android.app.PendingIntent> arg4, java.util.List<android.app.PendingIntent> arg5){
  }
  protected java.util.ArrayList<SmsRawData> buildValidRawData(java.util.ArrayList<byte []> arg1){
    return (java.util.ArrayList) null;
  }
  protected void enforceReceiveAndSend(java.lang.String arg1){
  }
  protected byte [] makeSmsRecordData(int arg1, byte [] arg2){
    return (byte []) null;
  }
}
