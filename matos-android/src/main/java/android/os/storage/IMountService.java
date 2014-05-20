package android.os.storage;

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


public interface IMountService
  extends android.os.IInterface
{
  // Classes

  @com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.IMountServiceStubImplem", superClass = "")
  public abstract static class Stub
    extends android.os.Binder    implements IMountService
  {
    // Constructors

    public Stub(){
      super();
    }
    // Methods

    public android.os.IBinder asBinder(){
      return (android.os.IBinder) null;
    }
    public static IMountService asInterface(android.os.IBinder arg1){
      return (IMountService) null;
    }
    public boolean onTransact(int arg1, android.os.Parcel arg2, android.os.Parcel arg3, int arg4) throws android.os.RemoteException{
      return false;
    }
  }
  // Fields

  public static final int ENCRYPTION_STATE_NONE = 1;

  public static final int ENCRYPTION_STATE_OK = 0;

  public static final int ENCRYPTION_STATE_ERROR_UNKNOWN = -1;

  public static final int ENCRYPTION_STATE_ERROR_INCOMPLETE = -2;

  // Methods

  public void shutdown(@com.francetelecom.rd.stubs.annotation.CallBackRegister("IMountShutdownObserver") IMountShutdownObserver arg1) throws android.os.RemoteException;
  public void registerListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("MountServiceListener") IMountServiceListener arg1) throws android.os.RemoteException;
  public void unregisterListener(IMountServiceListener arg1) throws android.os.RemoteException;
  public java.lang.String [] getSecureContainerList() throws android.os.RemoteException;
  public int createSecureContainer(java.lang.String arg1, int arg2, java.lang.String arg3, java.lang.String arg4, int arg5) throws android.os.RemoteException;
  public java.lang.String getSecureContainerPath(java.lang.String arg1) throws android.os.RemoteException;
  public int mountSecureContainer(java.lang.String arg1, java.lang.String arg2, int arg3) throws android.os.RemoteException;
  public int unmountSecureContainer(java.lang.String arg1, boolean arg2) throws android.os.RemoteException;
  public int renameSecureContainer(java.lang.String arg1, java.lang.String arg2) throws android.os.RemoteException;
  public java.lang.String getSecureContainerFilesystemPath(java.lang.String arg1) throws android.os.RemoteException;
  public int finalizeSecureContainer(java.lang.String arg1) throws android.os.RemoteException;
  public int destroySecureContainer(java.lang.String arg1, boolean arg2) throws android.os.RemoteException;
  public boolean isSecureContainerMounted(java.lang.String arg1) throws android.os.RemoteException;
  public boolean isExternalStorageEmulated() throws android.os.RemoteException;
  public boolean isUsbMassStorageConnected() throws android.os.RemoteException;
  public void setUsbMassStorageEnabled(boolean arg1) throws android.os.RemoteException;
  public boolean isUsbMassStorageEnabled() throws android.os.RemoteException;
  public int mountVolume(java.lang.String arg1) throws android.os.RemoteException;
  public void unmountVolume(java.lang.String arg1, boolean arg2, boolean arg3) throws android.os.RemoteException;
  public int formatVolume(java.lang.String arg1) throws android.os.RemoteException;
  public int [] getStorageUsers(java.lang.String arg1) throws android.os.RemoteException;
  public java.lang.String getVolumeState(java.lang.String arg1) throws android.os.RemoteException;
  public void finishMediaUpdate() throws android.os.RemoteException;
  public void mountObb(java.lang.String arg1, java.lang.String arg2, @com.francetelecom.rd.stubs.annotation.CallBackRegister("onObbResult") IObbActionListener arg3, int arg4) throws android.os.RemoteException;
  public void unmountObb(java.lang.String arg1, boolean arg2, @com.francetelecom.rd.stubs.annotation.CallBackRegister("onObbResult") IObbActionListener arg3, int arg4) throws android.os.RemoteException;
  public boolean isObbMounted(java.lang.String arg1) throws android.os.RemoteException;
  public java.lang.String getMountedObbPath(java.lang.String arg1) throws android.os.RemoteException;
  public int decryptStorage(java.lang.String arg1) throws android.os.RemoteException;
  public int encryptStorage(java.lang.String arg1) throws android.os.RemoteException;
  public int changeEncryptionPassword(java.lang.String arg1) throws android.os.RemoteException;
  public android.os.Parcelable [] getVolumeList() throws android.os.RemoteException;
  public int getEncryptionState() throws android.os.RemoteException;
  public int verifyEncryptionPassword(java.lang.String arg1) throws android.os.RemoteException;
}
