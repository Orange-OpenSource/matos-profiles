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


public interface ITelephonyRegistry
  extends android.os.IInterface
{
  // Classes

  @com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.ITelephonyRegistryStubImpl", superClass = "")
  public abstract static class Stub
    extends android.os.Binder    implements ITelephonyRegistry
  {
    // Constructors

    public Stub(){
      super();
    }
    // Methods

    public android.os.IBinder asBinder(){
      return (android.os.IBinder) null;
    }
    public static ITelephonyRegistry asInterface(android.os.IBinder arg1){
      return (ITelephonyRegistry) null;
    }
    @com.francetelecom.rd.stubs.annotation.CallBackRegister("ITelephonyRegistry")
    public boolean onTransact(int arg1, android.os.Parcel arg2, android.os.Parcel arg3, int arg4) throws android.os.RemoteException{
      return false;
    }
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("ITelephonyRegistry")
  public void listen(java.lang.String arg1, IPhoneStateListener arg2, int arg3, boolean arg4) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("ITelephonyRegistry")
  public void notifyDataActivity(int arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("ITelephonyRegistry")
  public void notifyDataConnection(int arg1, boolean arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5, android.net.LinkProperties arg6, android.net.LinkCapabilities arg7, int arg8, boolean arg9) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("ITelephonyRegistry")
  public void notifyOtaspChanged(int arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("ITelephonyRegistry")
  public void notifyDataConnectionFailed(java.lang.String arg1, java.lang.String arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("ITelephonyRegistry")
  public void notifyCallForwardingChanged(boolean arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("ITelephonyRegistry")
  public void notifyServiceState(android.telephony.ServiceState arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("ITelephonyRegistry")
  public void notifyMessageWaitingChanged(boolean arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("ITelephonyRegistry")
  public void notifyCallState(int arg1, java.lang.String arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("ITelephonyRegistry")
  public void notifySignalStrength(android.telephony.SignalStrength arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("ITelephonyRegistry")
  public void notifyCellLocation(android.os.Bundle arg1) throws android.os.RemoteException;
}
