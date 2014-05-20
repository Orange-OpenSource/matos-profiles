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
public class IccSmsInterfaceManagerProxy
  extends ISms.Stub{
  // Constructors

  public IccSmsInterfaceManagerProxy(IccSmsInterfaceManager arg1){
    super();
  }
  // Methods

  public void sendData(java.lang.String arg1, java.lang.String arg2, int arg3, byte [] arg4, android.app.PendingIntent arg5, android.app.PendingIntent arg6){
  }
  public java.util.List<SmsRawData> getAllMessagesFromIccEf() throws android.os.RemoteException{
    return (java.util.List) null;
  }
  public boolean updateMessageOnIccEf(int arg1, int arg2, byte [] arg3) throws android.os.RemoteException{
    return false;
  }
  public boolean copyMessageToIccEf(int arg1, byte [] arg2, byte [] arg3) throws android.os.RemoteException{
    return false;
  }
  public void sendText(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, android.app.PendingIntent arg4, android.app.PendingIntent arg5){
  }
  public void sendMultipartText(java.lang.String arg1, java.lang.String arg2, java.util.List<java.lang.String> arg3, java.util.List<android.app.PendingIntent> arg4, java.util.List<android.app.PendingIntent> arg5) throws android.os.RemoteException{
  }
  public boolean enableCellBroadcast(int arg1) throws android.os.RemoteException{
    return false;
  }
  public boolean disableCellBroadcast(int arg1) throws android.os.RemoteException{
    return false;
  }
  public boolean enableCellBroadcastRange(int arg1, int arg2) throws android.os.RemoteException{
    return false;
  }
  public boolean disableCellBroadcastRange(int arg1, int arg2) throws android.os.RemoteException{
    return false;
  }
  public void setmIccSmsInterfaceManager(IccSmsInterfaceManager arg1){
  }
}
