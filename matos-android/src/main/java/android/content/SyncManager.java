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
public class SyncManager
  implements android.accounts.OnAccountsUpdateListener
{
  // Fields

  public SyncQueue mSyncQueue;

  protected final java.util.ArrayList<ISyncContext.Stub> mActiveSyncContexts = (java.util.ArrayList) null;

  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public SyncManager(Context arg1, boolean arg2){
  }
  // Methods

  protected void dump(java.io.FileDescriptor arg1, java.io.PrintWriter arg2){
  }
  public SyncAdapterType [] getSyncAdapterTypes(){
    return (SyncAdapterType []) null;
  }
  public void cancelActiveSync(android.accounts.Account arg1, java.lang.String arg2){
  }
  public void scheduleSync(android.accounts.Account arg1, java.lang.String arg2, android.os.Bundle arg3, long arg4, boolean arg5){
  }
  public SyncStorageEngine getSyncStorageEngine(){
    return (SyncStorageEngine) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onAccountsUpdated(android.accounts.Account [] arg1){
  }
  public void scheduleLocalSync(android.accounts.Account arg1, java.lang.String arg2){
  }
  public void scheduleSyncOperation(SyncOperation arg1){
  }
  public void clearScheduledSyncOperations(android.accounts.Account arg1, java.lang.String arg2){
  }
  protected void dumpSyncState(java.io.PrintWriter arg1){
  }
  protected void dumpSyncHistory(java.io.PrintWriter arg1){
  }
}
