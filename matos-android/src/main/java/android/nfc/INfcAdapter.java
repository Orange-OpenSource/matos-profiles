package android.nfc;

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


public interface INfcAdapter
  extends android.os.IInterface
{
  // Classes

  @com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.INfcAdapterStubImplem", superClass = "")
  public abstract static class Stub
    extends android.os.Binder    implements INfcAdapter
  {
    // Constructors

    public Stub(){
      super();
    }
    // Methods

    public android.os.IBinder asBinder(){
      return (android.os.IBinder) null;
    }
    public static INfcAdapter asInterface(android.os.IBinder arg1){
      return (INfcAdapter) null;
    }
    public boolean onTransact(int arg1, android.os.Parcel arg2, android.os.Parcel arg3, int arg4) throws android.os.RemoteException{
      return false;
    }
  }
  // Methods

  public int getState() throws android.os.RemoteException;
  public boolean disable() throws android.os.RemoteException;
  public boolean enable() throws android.os.RemoteException;
  public boolean enableNdefPush() throws android.os.RemoteException;
  public boolean disableNdefPush() throws android.os.RemoteException;
  public boolean isNdefPushEnabled() throws android.os.RemoteException;
  public INfcAdapterExtras getNfcAdapterExtrasInterface() throws android.os.RemoteException;
  public INfcTag getNfcTagInterface() throws android.os.RemoteException;
  public void setForegroundDispatch(android.app.PendingIntent arg1, android.content.IntentFilter [] arg2, TechListParcel arg3) throws android.os.RemoteException;
  public void setForegroundNdefPush(NdefMessage arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("INdefPushCallback") INdefPushCallback arg2) throws android.os.RemoteException;
}
