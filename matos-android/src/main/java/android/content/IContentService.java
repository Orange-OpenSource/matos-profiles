package android.content;

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
public interface IContentService
  extends android.os.IInterface
{
  // Classes

  public abstract static class Stub
    extends android.os.Binder    implements IContentService
  {
    // Constructors

    public Stub(){
      super();
    }
    // Methods

    public android.os.IBinder asBinder(){
      return (android.os.IBinder) null;
    }
    public static IContentService asInterface(android.os.IBinder arg1){
      return (IContentService) null;
    }
    @com.francetelecom.rd.stubs.annotation.CallBackRegister("IContentService")
    public boolean onTransact(int arg1, android.os.Parcel arg2, android.os.Parcel arg3, int arg4) throws android.os.RemoteException{
      return false;
    }
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("IContentService")
  public void registerContentObserver(android.net.Uri arg1, boolean arg2, android.database.IContentObserver arg3) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IContentService")
  public void unregisterContentObserver(android.database.IContentObserver arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IContentService")
  public void notifyChange(android.net.Uri arg1, android.database.IContentObserver arg2, boolean arg3, boolean arg4) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IContentService")
  public void requestSync(android.accounts.Account arg1, java.lang.String arg2, android.os.Bundle arg3) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IContentService")
  public void cancelSync(android.accounts.Account arg1, java.lang.String arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IContentService")
  public boolean getSyncAutomatically(android.accounts.Account arg1, java.lang.String arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IContentService")
  public void setSyncAutomatically(android.accounts.Account arg1, java.lang.String arg2, boolean arg3) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IContentService")
  public java.util.List<PeriodicSync> getPeriodicSyncs(android.accounts.Account arg1, java.lang.String arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IContentService")
  public void addPeriodicSync(android.accounts.Account arg1, java.lang.String arg2, android.os.Bundle arg3, long arg4) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IContentService")
  public void removePeriodicSync(android.accounts.Account arg1, java.lang.String arg2, android.os.Bundle arg3) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IContentService")
  public int getIsSyncable(android.accounts.Account arg1, java.lang.String arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IContentService")
  public void setIsSyncable(android.accounts.Account arg1, java.lang.String arg2, int arg3) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IContentService")
  public void setMasterSyncAutomatically(boolean arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IContentService")
  public boolean getMasterSyncAutomatically() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IContentService")
  public boolean isSyncActive(android.accounts.Account arg1, java.lang.String arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IContentService")
  public java.util.List<SyncInfo> getCurrentSyncs() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IContentService")
  public SyncAdapterType [] getSyncAdapterTypes() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IContentService")
  public SyncStatusInfo getSyncStatus(android.accounts.Account arg1, java.lang.String arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IContentService")
  public boolean isSyncPending(android.accounts.Account arg1, java.lang.String arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IContentService")
  public void addStatusChangeListener(int arg1, ISyncStatusObserver arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IContentService")
  public void removeStatusChangeListener(ISyncStatusObserver arg1) throws android.os.RemoteException;
}
