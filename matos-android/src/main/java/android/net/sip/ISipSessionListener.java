package android.net.sip;

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


public interface ISipSessionListener
  extends android.os.IInterface
{
  // Classes

  public abstract static class Stub
    extends android.os.Binder    implements ISipSessionListener
  {
    // Constructors

    public Stub(){
      super();
    }
    // Methods

    public android.os.IBinder asBinder(){
      return (android.os.IBinder) null;
    }
    public static ISipSessionListener asInterface(android.os.IBinder arg1){
      return (ISipSessionListener) null;
    }
    public boolean onTransact(int arg1, android.os.Parcel arg2, android.os.Parcel arg3, int arg4) throws android.os.RemoteException{
      return false;
    }
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("ISipSessionListener")
  public void onError(ISipSession arg1, int arg2, java.lang.String arg3) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("ISipSessionListener")
  public void onCallEnded(ISipSession arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("ISipSessionListener")
  public void onCallEstablished(ISipSession arg1, java.lang.String arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("ISipSessionListener")
  public void onCallBusy(ISipSession arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("ISipSessionListener")
  public void onCalling(ISipSession arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("ISipSessionListener")
  public void onRinging(ISipSession arg1, SipProfile arg2, java.lang.String arg3) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("ISipSessionListener")
  public void onRingingBack(ISipSession arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("ISipSessionListener")
  public void onCallTransferring(ISipSession arg1, java.lang.String arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("ISipSessionListener")
  public void onCallChangeFailed(ISipSession arg1, int arg2, java.lang.String arg3) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("ISipSessionListener")
  public void onRegistering(ISipSession arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("ISipSessionListener")
  public void onRegistrationDone(ISipSession arg1, int arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("ISipSessionListener")
  public void onRegistrationFailed(ISipSession arg1, int arg2, java.lang.String arg3) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("ISipSessionListener")
  public void onRegistrationTimeout(ISipSession arg1) throws android.os.RemoteException;
}
