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

import com.francetelecom.rd.stubs.annotation.Real;

@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public interface INfcAdapterExtras
  extends android.os.IInterface
{
  // Classes
	@Real("com.francetelecom.rd.fakeandroid.INfcAdapterExtrasStubImpl")
  public abstract static class Stub
    extends android.os.Binder    implements INfcAdapterExtras
  {
    // Constructors

    public Stub(){
      super();
    }
    // Methods

    public android.os.IBinder asBinder(){
      return (android.os.IBinder) null;
    }
    public static INfcAdapterExtras asInterface(android.os.IBinder arg1){
      return (INfcAdapterExtras) null;
    }
    public boolean onTransact(int arg1, android.os.Parcel arg2, android.os.Parcel arg3, int arg4) throws android.os.RemoteException{
      return false;
    }
  }
  // Methods

  public android.os.Bundle close() throws android.os.RemoteException;
  public android.os.Bundle open(android.os.IBinder arg1) throws android.os.RemoteException;
  public void authenticate(byte [] arg1) throws android.os.RemoteException;
  public android.os.Bundle transceive(byte [] arg1) throws android.os.RemoteException;
  public int getCardEmulationRoute() throws android.os.RemoteException;
  public void setCardEmulationRoute(int arg1) throws android.os.RemoteException;
}
