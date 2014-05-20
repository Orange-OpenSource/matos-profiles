package android.app.backup;

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
public interface IBackupManager
  extends android.os.IInterface
{
  // Classes

  @com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.IBackupManagerStubImplem", superClass = "")
  public abstract static class Stub
    extends android.os.Binder    implements IBackupManager
  {
    // Constructors

    public Stub(){
      super();
    }
    // Methods

    public android.os.IBinder asBinder(){
      return (android.os.IBinder) null;
    }
    public static IBackupManager asInterface(android.os.IBinder arg1){
      return (IBackupManager) null;
    }
    @com.francetelecom.rd.stubs.annotation.CallBackRegister("IBackupManager")
    public boolean onTransact(int arg1, android.os.Parcel arg2, android.os.Parcel arg3, int arg4) throws android.os.RemoteException{
      return false;
    }
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("IBackupManager")
  public void clearBackupData(java.lang.String arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IBackupManager")
  public void dataChanged(java.lang.String arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IBackupManager")
  public void agentConnected(java.lang.String arg1, android.os.IBinder arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IBackupManager")
  public void agentDisconnected(java.lang.String arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IBackupManager")
  public void restoreAtInstall(java.lang.String arg1, int arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IBackupManager")
  public void setBackupEnabled(boolean arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IBackupManager")
  public void setAutoRestore(boolean arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IBackupManager")
  public void setBackupProvisioned(boolean arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IBackupManager")
  public boolean isBackupEnabled() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IBackupManager")
  public boolean setBackupPassword(java.lang.String arg1, java.lang.String arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IBackupManager")
  public boolean hasBackupPassword() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IBackupManager")
  public void backupNow() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IBackupManager")
  public void fullBackup(android.os.ParcelFileDescriptor arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, java.lang.String [] arg6) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IBackupManager")
  public void fullRestore(android.os.ParcelFileDescriptor arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IBackupManager")
  public void acknowledgeFullBackupOrRestore(int arg1, boolean arg2, java.lang.String arg3, java.lang.String arg4, @com.francetelecom.rd.stubs.annotation.CallBackRegister("IFullBackupRestoreObserver") IFullBackupRestoreObserver arg5) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IBackupManager")
  public java.lang.String getCurrentTransport() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IBackupManager")
  public java.lang.String [] listAllTransports() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IBackupManager")
  public java.lang.String selectBackupTransport(java.lang.String arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IBackupManager")
  public android.content.Intent getConfigurationIntent(java.lang.String arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IBackupManager")
  public java.lang.String getDestinationString(java.lang.String arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IBackupManager")
  public IRestoreSession beginRestoreSession(java.lang.String arg1, java.lang.String arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IBackupManager")
  public void opComplete(int arg1) throws android.os.RemoteException;
}
