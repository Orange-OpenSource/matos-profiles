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


public interface IPhoneStateListener
  extends android.os.IInterface
{
  // Classes

  @com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.IPhoneStateListenerStubImpl", superClass = "")
  public abstract static class Stub
    extends android.os.Binder    implements IPhoneStateListener
  {
    // Constructors

    public Stub(){
      super();
    }
    // Methods

    public android.os.IBinder asBinder(){
      return (android.os.IBinder) null;
    }
    public static IPhoneStateListener asInterface(android.os.IBinder arg1){
      return (IPhoneStateListener) null;
    }
    @com.francetelecom.rd.stubs.annotation.CallBackRegister("IPhoneStateListener")
    public boolean onTransact(int arg1, android.os.Parcel arg2, android.os.Parcel arg3, int arg4) throws android.os.RemoteException{
      return false;
    }
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("IPhoneStateListener")
  public void onServiceStateChanged(android.telephony.ServiceState arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IPhoneStateListener")
  public void onSignalStrengthChanged(int arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IPhoneStateListener")
  public void onMessageWaitingIndicatorChanged(boolean arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IPhoneStateListener")
  public void onCallForwardingIndicatorChanged(boolean arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IPhoneStateListener")
  public void onCellLocationChanged(android.os.Bundle arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IPhoneStateListener")
  public void onCallStateChanged(int arg1, java.lang.String arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IPhoneStateListener")
  public void onDataConnectionStateChanged(int arg1, int arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IPhoneStateListener")
  public void onDataActivity(int arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IPhoneStateListener")
  public void onSignalStrengthsChanged(android.telephony.SignalStrength arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IPhoneStateListener")
  public void onOtaspChanged(int arg1) throws android.os.RemoteException;
}
