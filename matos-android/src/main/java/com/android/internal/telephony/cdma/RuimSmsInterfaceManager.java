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
public class RuimSmsInterfaceManager
  extends com.android.internal.telephony.IccSmsInterfaceManager{
  // Constructors

  public RuimSmsInterfaceManager(CDMAPhone arg1, com.android.internal.telephony.SMSDispatcher arg2){
    super((com.android.internal.telephony.PhoneBase) null);
  }
  // Methods

  protected void finalize(){
  }
  protected void log(java.lang.String arg1){
  }
  public void dispose(){
  }
  public java.util.List<com.android.internal.telephony.SmsRawData> getAllMessagesFromIccEf(){
    return (java.util.List) null;
  }
  public boolean updateMessageOnIccEf(int arg1, int arg2, byte [] arg3){
    return false;
  }
  public boolean copyMessageToIccEf(int arg1, byte [] arg2, byte [] arg3){
    return false;
  }
  public boolean enableCellBroadcast(int arg1){
    return false;
  }
  public boolean disableCellBroadcast(int arg1){
    return false;
  }
  public boolean enableCellBroadcastRange(int arg1, int arg2){
    return false;
  }
  public boolean disableCellBroadcastRange(int arg1, int arg2){
    return false;
  }
}
