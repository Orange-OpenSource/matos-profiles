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


public interface ITelephony
  extends android.os.IInterface
{
  // Classes

  @com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.ITelephonyStubImpl", superClass = "")
  public abstract static class Stub
    extends android.os.Binder    implements ITelephony
  {
    // Constructors

    public Stub(){
      super();
    }
    // Methods

    public android.os.IBinder asBinder(){
      return (android.os.IBinder) null;
    }
    public static ITelephony asInterface(android.os.IBinder arg1){
      return (ITelephony) null;
    }
    public boolean onTransact(int arg1, android.os.Parcel arg2, android.os.Parcel arg3, int arg4) throws android.os.RemoteException{
      return false;
    }
  }
  // Methods

  public int getVoiceMessageCount() throws android.os.RemoteException;
  public void dial(java.lang.String arg1) throws android.os.RemoteException;
  public int getLteOnCdmaMode() throws android.os.RemoteException;
  public boolean isRinging() throws android.os.RemoteException;
  public boolean handlePinMmi(java.lang.String arg1) throws android.os.RemoteException;
  public void updateServiceLocation() throws android.os.RemoteException;
  public void enableLocationUpdates() throws android.os.RemoteException;
  public void disableLocationUpdates() throws android.os.RemoteException;
  public boolean enableDataConnectivity() throws android.os.RemoteException;
  public boolean disableDataConnectivity() throws android.os.RemoteException;
  public boolean isDataConnectivityPossible() throws android.os.RemoteException;
  public boolean needsOtaServiceProvisioning() throws android.os.RemoteException;
  public android.os.Bundle getCellLocation() throws android.os.RemoteException;
  public int getCdmaEriIconIndex() throws android.os.RemoteException;
  public int getCdmaEriIconMode() throws android.os.RemoteException;
  public java.lang.String getCdmaEriText() throws android.os.RemoteException;
  public int enableApnType(java.lang.String arg1) throws android.os.RemoteException;
  public int disableApnType(java.lang.String arg1) throws android.os.RemoteException;
  public void call(java.lang.String arg1) throws android.os.RemoteException;
  public boolean isIdle() throws android.os.RemoteException;
  public boolean setRadio(boolean arg1) throws android.os.RemoteException;
  public boolean supplyPuk(java.lang.String arg1, java.lang.String arg2) throws android.os.RemoteException;
  public int getNetworkType() throws android.os.RemoteException;
  public boolean isRadioOn() throws android.os.RemoteException;
  public boolean showCallScreen() throws android.os.RemoteException;
  public boolean showCallScreenWithDialpad(boolean arg1) throws android.os.RemoteException;
  public boolean endCall() throws android.os.RemoteException;
  public void answerRingingCall() throws android.os.RemoteException;
  public void silenceRinger() throws android.os.RemoteException;
  public boolean isOffhook() throws android.os.RemoteException;
  public boolean isSimPinEnabled() throws android.os.RemoteException;
  public void cancelMissedCallsNotification() throws android.os.RemoteException;
  public boolean supplyPin(java.lang.String arg1) throws android.os.RemoteException;
  public void toggleRadioOnOff() throws android.os.RemoteException;
  public java.util.List<android.telephony.NeighboringCellInfo> getNeighboringCellInfo() throws android.os.RemoteException;
  public int getCallState() throws android.os.RemoteException;
  public int getDataActivity() throws android.os.RemoteException;
  public int getDataState() throws android.os.RemoteException;
  public int getActivePhoneType() throws android.os.RemoteException;
  public boolean hasIccCard() throws android.os.RemoteException;
}
