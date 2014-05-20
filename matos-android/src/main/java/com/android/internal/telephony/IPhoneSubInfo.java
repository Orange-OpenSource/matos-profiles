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


public interface IPhoneSubInfo
  extends android.os.IInterface
{
  // Classes

  public abstract static class Stub
    extends android.os.Binder    implements IPhoneSubInfo
  {
    // Constructors

    public Stub(){
      super();
    }
    // Methods

    public android.os.IBinder asBinder(){
      return (android.os.IBinder) null;
    }
    public static IPhoneSubInfo asInterface(android.os.IBinder arg1){
      return (IPhoneSubInfo) null;
    }
    public boolean onTransact(int arg1, android.os.Parcel arg2, android.os.Parcel arg3, int arg4) throws android.os.RemoteException{
      return false;
    }
  }
  // Methods

  public java.lang.String getVoiceMailNumber() throws android.os.RemoteException;
  public java.lang.String getVoiceMailAlphaTag() throws android.os.RemoteException;
  public java.lang.String getDeviceId() throws android.os.RemoteException;
  public java.lang.String getDeviceSvn() throws android.os.RemoteException;
  public java.lang.String getSubscriberId() throws android.os.RemoteException;
  public java.lang.String getIccSerialNumber() throws android.os.RemoteException;
  public java.lang.String getLine1Number() throws android.os.RemoteException;
  public java.lang.String getLine1AlphaTag() throws android.os.RemoteException;
  public java.lang.String getMsisdn() throws android.os.RemoteException;
  public java.lang.String getIsimImpi() throws android.os.RemoteException;
  public java.lang.String getIsimDomain() throws android.os.RemoteException;
  public java.lang.String [] getIsimImpu() throws android.os.RemoteException;
  public java.lang.String getCompleteVoiceMailNumber() throws android.os.RemoteException;
}
