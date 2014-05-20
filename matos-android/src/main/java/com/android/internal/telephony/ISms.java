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


public interface ISms
  extends android.os.IInterface
{
  // Classes

  public abstract static class Stub
    extends android.os.Binder    implements ISms
  {
    // Constructors

    public Stub(){
      super();
    }
    // Methods

    public android.os.IBinder asBinder(){
      return (android.os.IBinder) null;
    }
    public static ISms asInterface(android.os.IBinder arg1){
      return (ISms) null;
    }
    @com.francetelecom.rd.stubs.annotation.CallBackRegister("ISms")
    public boolean onTransact(int arg1, android.os.Parcel arg2, android.os.Parcel arg3, int arg4) throws android.os.RemoteException{
      return false;
    }
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("ISms")
  public void sendData(java.lang.String arg1, java.lang.String arg2, int arg3, byte [] arg4, android.app.PendingIntent arg5, android.app.PendingIntent arg6) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("ISms")
  public java.util.List<SmsRawData> getAllMessagesFromIccEf() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("ISms")
  public boolean updateMessageOnIccEf(int arg1, int arg2, byte [] arg3) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("ISms")
  public boolean copyMessageToIccEf(int arg1, byte [] arg2, byte [] arg3) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("ISms")
  public void sendText(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, android.app.PendingIntent arg4, android.app.PendingIntent arg5) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("ISms")
  public void sendMultipartText(java.lang.String arg1, java.lang.String arg2, java.util.List<java.lang.String> arg3, java.util.List<android.app.PendingIntent> arg4, java.util.List<android.app.PendingIntent> arg5) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("ISms")
  public boolean enableCellBroadcast(int arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("ISms")
  public boolean disableCellBroadcast(int arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("ISms")
  public boolean enableCellBroadcastRange(int arg1, int arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("ISms")
  public boolean disableCellBroadcastRange(int arg1, int arg2) throws android.os.RemoteException;
}
