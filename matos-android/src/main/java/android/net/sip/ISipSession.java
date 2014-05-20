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


public interface ISipSession
  extends android.os.IInterface
{
  // Classes

  @com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.ISipSessionStubImplem", superClass = "")
  public abstract static class Stub
    extends android.os.Binder    implements ISipSession
  {
    // Constructors

    public Stub(){
      super();
    }
    // Methods

    public android.os.IBinder asBinder(){
      return (android.os.IBinder) null;
    }
    public static ISipSession asInterface(android.os.IBinder arg1){
      return (ISipSession) null;
    }
    @com.francetelecom.rd.stubs.annotation.CallBackRegister("ISipSession")
    public boolean onTransact(int arg1, android.os.Parcel arg2, android.os.Parcel arg3, int arg4) throws android.os.RemoteException{
      return false;
    }
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("ISipSession")
  public void register(int arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("ISipSession")
  public int getState() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("ISipSession")
  public void unregister() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("ISipSession")
  public java.lang.String getCallId() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("ISipSession")
  public void endCall() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("ISipSession")
  public void setListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("ISipSessionListener") ISipSessionListener arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("ISipSession")
  public boolean isInCall() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("ISipSession")
  public SipProfile getPeerProfile() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("ISipSession")
  public SipProfile getLocalProfile() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("ISipSession")
  public void answerCall(java.lang.String arg1, int arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("ISipSession")
  public void makeCall(SipProfile arg1, java.lang.String arg2, int arg3) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("ISipSession")
  public java.lang.String getLocalIp() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("ISipSession")
  public void changeCall(java.lang.String arg1, int arg2) throws android.os.RemoteException;
}
