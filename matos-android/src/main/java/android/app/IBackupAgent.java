package android.app;

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
public interface IBackupAgent
  extends android.os.IInterface
{
  // Classes

  @com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.IBackupAgentStubImpl", superClass = "")
  public abstract static class Stub
    extends android.os.Binder    implements IBackupAgent
  {
    // Constructors

    public Stub(){
      super();
    }
    // Methods

    public android.os.IBinder asBinder(){
      return (android.os.IBinder) null;
    }
    public static IBackupAgent asInterface(android.os.IBinder arg1){
      return (IBackupAgent) null;
    }
    @com.francetelecom.rd.stubs.annotation.CallBackRegister("IBackupAgent")
    public boolean onTransact(int arg1, android.os.Parcel arg2, android.os.Parcel arg3, int arg4) throws android.os.RemoteException{
      return false;
    }
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("IBackupAgent")
  public void doRestore(android.os.ParcelFileDescriptor arg1, int arg2, android.os.ParcelFileDescriptor arg3, int arg4, android.app.backup.IBackupManager arg5) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IBackupAgent")
  public void doBackup(android.os.ParcelFileDescriptor arg1, android.os.ParcelFileDescriptor arg2, android.os.ParcelFileDescriptor arg3, int arg4, android.app.backup.IBackupManager arg5) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IBackupAgent")
  public void doFullBackup(android.os.ParcelFileDescriptor arg1, int arg2, android.app.backup.IBackupManager arg3) throws android.os.RemoteException;
  public void doRestoreFile(android.os.ParcelFileDescriptor arg1, long arg2, int arg3, java.lang.String arg4, java.lang.String arg5, long arg6, long arg7, int arg8, android.app.backup.IBackupManager arg9) throws android.os.RemoteException;
}
