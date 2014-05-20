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


public interface INfcTag
  extends android.os.IInterface
{
  // Classes

  @com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.INfcTagStubImplem", superClass = "")
  public abstract static class Stub
    extends android.os.Binder    implements INfcTag
  {
    // Constructors

    public Stub(){
      super();
    }
    // Methods

    public android.os.IBinder asBinder(){
      return (android.os.IBinder) null;
    }
    public static INfcTag asInterface(android.os.IBinder arg1){
      return (INfcTag) null;
    }
    public boolean onTransact(int arg1, android.os.Parcel arg2, android.os.Parcel arg3, int arg4) throws android.os.RemoteException{
      return false;
    }
  }
  // Methods

  public int close(int arg1) throws android.os.RemoteException;
  public int connect(int arg1, int arg2) throws android.os.RemoteException;
  public boolean isPresent(int arg1) throws android.os.RemoteException;
  public int reconnect(int arg1) throws android.os.RemoteException;
  public byte [] getUid(int arg1) throws android.os.RemoteException;
  public TransceiveResult transceive(int arg1, byte [] arg2, boolean arg3) throws android.os.RemoteException;
  public int getMaxTransceiveLength(int arg1) throws android.os.RemoteException;
  public int getTimeout(int arg1) throws android.os.RemoteException;
  public int setTimeout(int arg1, int arg2) throws android.os.RemoteException;
  public boolean canMakeReadOnly(int arg1) throws android.os.RemoteException;
  public int formatNdef(int arg1, byte [] arg2) throws android.os.RemoteException;
  public boolean isNdef(int arg1) throws android.os.RemoteException;
  public int ndefWrite(int arg1, NdefMessage arg2) throws android.os.RemoteException;
  public int ndefMakeReadOnly(int arg1) throws android.os.RemoteException;
  public void resetTimeouts() throws android.os.RemoteException;
  public NdefMessage ndefRead(int arg1) throws android.os.RemoteException;
  public int getLastError(int arg1) throws android.os.RemoteException;
  public int [] getTechList(int arg1) throws android.os.RemoteException;
  public boolean ndefIsWritable(int arg1) throws android.os.RemoteException;
  public Tag rediscover(int arg1) throws android.os.RemoteException;
}
