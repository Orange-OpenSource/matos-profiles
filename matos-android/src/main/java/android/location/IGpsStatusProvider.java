package android.location;

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


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public interface IGpsStatusProvider
  extends android.os.IInterface
{
  // Classes

  @com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.IGpsStatusProviderStubImpl", superClass = "")
  public abstract static class Stub
    extends android.os.Binder    implements IGpsStatusProvider
  {
    // Constructors

    public Stub(){
      super();
    }
    // Methods

    public android.os.IBinder asBinder(){
      return (android.os.IBinder) null;
    }
    public static IGpsStatusProvider asInterface(android.os.IBinder arg1){
      return (IGpsStatusProvider) null;
    }
    @com.francetelecom.rd.stubs.annotation.CallBackRegister("IGpsStatusProvider")
    public boolean onTransact(int arg1, android.os.Parcel arg2, android.os.Parcel arg3, int arg4) throws android.os.RemoteException{
      return false;
    }
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("IGpsStatusProvider")
  public void addGpsStatusListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("iGpsStatusListener") IGpsStatusListener arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IGpsStatusProvider")
  public void removeGpsStatusListener(IGpsStatusListener arg1) throws android.os.RemoteException;
}
