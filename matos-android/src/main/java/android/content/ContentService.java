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
public final class ContentService
  extends IContentService.Stub{
  // Classes

  public static final class ObserverCall
  {
    // Constructors

    ObserverCall(ContentService.ObserverNode arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("onChange") android.database.IContentObserver arg2, boolean arg3){
    }
  }
  public static final class ObserverNode
  {
    // Fields

    public static final int INSERT_TYPE = 0;

    public static final int UPDATE_TYPE = 1;

    public static final int DELETE_TYPE = 2;

    // Constructors

    public ObserverNode(java.lang.String arg1){
    }
    // Methods

    public void dumpLocked(java.io.FileDescriptor arg1, java.io.PrintWriter arg2, java.lang.String [] arg3, java.lang.String arg4, java.lang.String arg5, int [] arg6, android.util.SparseIntArray arg7){
    }
    public void addObserverLocked(android.net.Uri arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("onChange") android.database.IContentObserver arg2, boolean arg3, java.lang.Object arg4, int arg5, int arg6){
    }
    public boolean removeObserverLocked(android.database.IContentObserver arg1){
      return false;
    }
    public void collectObserversLocked(android.net.Uri arg1, int arg2, @com.francetelecom.rd.stubs.annotation.CallBackRegister("onChange") android.database.IContentObserver arg3, boolean arg4, java.util.ArrayList<ContentService.ObserverCall> arg5){
    }
  }
  // Constructors

  ContentService(Context arg1, boolean arg2){
    super();
  }
  // Methods

  public static IContentService main(Context arg1, boolean arg2){
    return (IContentService) null;
  }
  public boolean onTransact(int arg1, android.os.Parcel arg2, android.os.Parcel arg3, int arg4) throws android.os.RemoteException{
    return false;
  }
  protected synchronized void dump(java.io.FileDescriptor arg1, java.io.PrintWriter arg2, java.lang.String [] arg3){
  }
  public void registerContentObserver(android.net.Uri arg1, boolean arg2, @com.francetelecom.rd.stubs.annotation.CallBackRegister("android.content.ContentObserver.onChange") android.database.IContentObserver arg3){
  }
  public void unregisterContentObserver(android.database.IContentObserver arg1){
  }
  public void notifyChange(android.net.Uri arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("onChange") android.database.IContentObserver arg2, boolean arg3, boolean arg4){
  }
  public void requestSync(android.accounts.Account arg1, java.lang.String arg2, android.os.Bundle arg3){
  }
  public void cancelSync(android.accounts.Account arg1, java.lang.String arg2){
  }
  public boolean getSyncAutomatically(android.accounts.Account arg1, java.lang.String arg2){
    return false;
  }
  public void setSyncAutomatically(android.accounts.Account arg1, java.lang.String arg2, boolean arg3){
  }
  public java.util.List<PeriodicSync> getPeriodicSyncs(android.accounts.Account arg1, java.lang.String arg2){
    return (java.util.List) null;
  }
  public void addPeriodicSync(android.accounts.Account arg1, java.lang.String arg2, android.os.Bundle arg3, long arg4){
  }
  public void removePeriodicSync(android.accounts.Account arg1, java.lang.String arg2, android.os.Bundle arg3){
  }
  public int getIsSyncable(android.accounts.Account arg1, java.lang.String arg2){
    return 0;
  }
  public void setIsSyncable(android.accounts.Account arg1, java.lang.String arg2, int arg3){
  }
  public void setMasterSyncAutomatically(boolean arg1){
  }
  public boolean getMasterSyncAutomatically(){
    return false;
  }
  public boolean isSyncActive(android.accounts.Account arg1, java.lang.String arg2){
    return false;
  }
  public java.util.List<SyncInfo> getCurrentSyncs(){
    return (java.util.List) null;
  }
  public SyncAdapterType [] getSyncAdapterTypes(){
    return (SyncAdapterType []) null;
  }
  public SyncStatusInfo getSyncStatus(android.accounts.Account arg1, java.lang.String arg2){
    return (SyncStatusInfo) null;
  }
  public boolean isSyncPending(android.accounts.Account arg1, java.lang.String arg2){
    return false;
  }
  public void addStatusChangeListener(int arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("android.content.SyncStatusObserver.onStatusChanged") ISyncStatusObserver arg2){
  }
  public void removeStatusChangeListener(ISyncStatusObserver arg1){
  }
}
